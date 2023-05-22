package com.mylab.androidclient;

import android.app.Activity;
import android.app.Service;
import android.os.Vibrator;

public class VirateUtil {
    //震动milliseconds毫秒
    public static void vibrate(final Activity activity, long milliseconds) {
        Vibrator vib = (Vibrator) activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(milliseconds);
    }
    //以pattern[]方式震动
    public static void vibrate(final Activity activity, long[] pattern,int repeat){
        Vibrator vib = (Vibrator) activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(pattern,repeat);
    }
    //取消震动
    public static void virateCancle(final Activity activity){
        Vibrator vib = (Vibrator) activity.getSystemService(Service.VIBRATOR_SERVICE);
        vib.cancel();
    }
}


// demo
////开启震动
//isVirating = true;
//        VirateUtil.virate(XXXActivity.this, new long[]{1000, 1000, 1000, 1000}, 0)
////关闭震动
//        if (isVirating) {
//        isVirating = false;
//        VirateUtil.virateCancle(XXXActivity.this);
//        }


//// 需要用到的API. 振铃实现——MediaPlayer类
//void setDataSource (Context context , Uri uri)//根据Uri设置音频，当然还有其他几个重载的方法来指定特定的音频。
//    void setLooping (boolean looping)//设置是否循环播放
//    void prepare ()//让MediaPlayer真正去装载音频文件
//    void start ()//开始或恢复播放
//    void pause ()//暂停播放，调用start()可以恢复播放
//    void stop ()//停止播放
//    boolean isPlaying ()//是否正在播放
//    void release ()//释放与此MediaPlayer关联的资源
//
//// demo
////开始播放
//public static void playRing(final Activity activity){
//    try {
//        Uri alert = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);//用于获取手机默认铃声的Uri
//        mMediaPlayer = new MediaPlayer();
//        mMediaPlayer.setDataSource(activity, alert);
//        mMediaPlayer.setAudioStreamType(AudioManager.STREAM_RING);//告诉mediaPlayer播放的是铃声流
//        mMediaPlayer.setLooping(true);
//        mMediaPlayer.prepare();
//        mMediaPlayer.start();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//    //停止播放
//    public static void stopRing(){
//        if (mMediaPlayer!=null){
//            if (mMediaPlayer.isPlaying()){
//                mMediaPlayer.stop();
//                mMediaPlayer.release();
//            }
//        }
//    }