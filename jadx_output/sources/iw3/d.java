package iw3;

/* loaded from: classes.dex */
public final class d extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final iw3.d f295235d = new iw3.d();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object systemService = env.f340860a.getSystemService("vibrator");
        android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        env.f340863d.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "shake";
    }
}
