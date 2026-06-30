package em4;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f255212a = gm4.a.f273557a.a("key_show_audio_red_dot", false);

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotManager", "initDataFromLocal showAudioRedDot: " + f255212a);
    }

    public static final void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingRedDotManager", "disposeRedDotAtPath path: ".concat(path));
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(path);
    }
}
