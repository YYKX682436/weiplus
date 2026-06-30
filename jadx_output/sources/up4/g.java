package up4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final up4.g f429873a = new up4.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f429874b = new java.util.HashMap();

    public final long a(byte[] info, com.tencent.mm.videocomposition.play.VideoCompositionPlayView playView, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(playView, "playView");
        r45.h70 h70Var = new r45.h70();
        try {
            h70Var.parseFrom(info);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "key: " + currentTimeMillis);
            if (z17) {
                h70Var.f375901h = "";
                h70Var.f375900g = false;
            }
            f429874b.put(java.lang.Long.valueOf(currentTimeMillis), new up4.h(h70Var, playView));
            return currentTimeMillis;
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsFakeVideoPlayManager", "parse byte error");
            return -1L;
        }
    }
}
