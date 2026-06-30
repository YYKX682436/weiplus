package rz2;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f401802a = com.tencent.mm.plugin.facedetect.model.s0.h().concat("/fdv_");

    public static int a() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_flash_verify_waiting_time, 1500);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerConfig", "getFaceWaitingTimeMs %d", java.lang.Integer.valueOf(Ni));
        return Ni;
    }
}
