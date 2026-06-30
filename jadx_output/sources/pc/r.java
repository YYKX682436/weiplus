package pc;

/* loaded from: classes14.dex */
public final class r implements pc.p {

    /* renamed from: a, reason: collision with root package name */
    public android.media.SoundPool f353223a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f353224b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f353225c;

    public r(android.content.Context context) {
        this.f353225c = -1;
        int i17 = ic.d.f290281k;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
        if (!(huiYanSdkConfig == null ? false : huiYanSdkConfig.isOpenAudio())) {
            mc.p.f325531a.e("SoundPoolHelper", "audio is not open on need create SoundPoolHelper");
            return;
        }
        if (context == null) {
            mc.p.f325531a.e("SoundPoolHelper", "context is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.media.SoundPool soundPool = new android.media.SoundPool(1, 3, 0);
        this.f353223a = soundPool;
        soundPool.setOnLoadCompleteListener(new pc.r$$a());
        this.f353224b = new java.util.HashMap(21);
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_BLINK, "act_blink");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_OPEN_MOUTH, "act_open_mouth");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_NOD_HEAD, "act_nod_head");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_SHAKE_HEAD, "act_shake_head");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_FACE, "no_face");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_LEFT_FACE, "no_left_face");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_RIGHT_FACE, "no_right_face");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_CHIN, "no_chin");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_MOUTH, "no_mouth");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_NOSE, "no_nose");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_LEFT_EYE, "no_left_eye");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.NO_RIGHT_EYE, "no_right_eye");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_KEEP, "pose_keep");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_CLOSER, "pose_closer");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_FARTHER, "pose_farther");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_INCORRECT, com.tencent.youtu.sdkkitframework.common.StringCode.FL_POSE_INCORRECT);
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.POSE_OPEN_EYE, "plase_open_eye");
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.TOO_MANY_FACE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_TOO_MANY_FACES);
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.INCOMPLETE_FACE, com.tencent.youtu.sdkkitframework.common.StringCode.FL_INCOMPLETE_FACE);
        a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent.ACT_SCREEN_SHAKING, "act_screen_shaking");
        mc.p.f325531a.b("SoundPoolHelper", "SoundPoolHelper init cost time: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        this.f353225c = -1;
    }

    public final void a(com.tencent.cloud.huiyan.enums.HuiYanAuthTipsEvent huiYanAuthTipsEvent, java.lang.String str) {
        java.util.HashMap hashMap;
        if (this.f353223a == null || (hashMap = this.f353224b) == null) {
            return;
        }
        try {
            int i17 = ic.d.f290281k;
            android.content.Context a17 = ic.c.f290280a.a();
            if (a17 == null) {
                mc.p.f325531a.e("SoundPoolHelper", "context is null");
                return;
            }
            android.content.res.AssetFileDescriptor openFd = a17.getAssets().openFd("audio/huiyan_" + str + ".ogg");
            hashMap.put(huiYanAuthTipsEvent, java.lang.Integer.valueOf(this.f353223a.load(openFd, 1)));
            openFd.close();
        } catch (java.lang.Exception e17) {
            mc.p.f325531a.e("SoundPoolHelper", "loadSound error: " + e17.getLocalizedMessage());
        }
    }
}
