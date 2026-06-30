package v02;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v02.m0 f432270a = new v02.m0();

    public final void a(int i17, long j17, long j18) {
        if (gm0.j1.b().h() == 0 || gm0.j1.b().h() % 100 != 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportQuickDownload", "report 27518, action:" + i17 + ", size:" + j17 + ", type:" + j18);
        jx3.f.INSTANCE.d(27518, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }
}
