package hy4;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f286173a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f286174b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f286175c;

    /* renamed from: d, reason: collision with root package name */
    public long f286176d;

    /* renamed from: e, reason: collision with root package name */
    public long f286177e;

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.f286177e <= this.f286176d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewRecentForwardReporter", "bottomSheetDismissTiming <= zeroMenuAppearTiming");
            return;
        }
        if (!(context instanceof com.tencent.mm.ui.component.UIComponentActivity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewRecentForwardReporter", "getRecentForwardReportInfo, context: " + context);
        }
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(context, 14, r45.pk5.class);
        if (pk5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewRecentForwardReporter", "tryReport, recentForwardReportInfo is null");
            return;
        }
        pk5Var.f383137i = this.f286175c ? 3 : 2;
        pk5Var.f383138m = "49";
        pk5Var.f383139n = "5";
        pk5Var.f383142q = this.f286173a;
        pk5Var.f383132d = this.f286174b;
        pk5Var.f383140o = (int) (this.f286177e - this.f286176d);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        l35.a.f315443a.a(context);
        this.f286173a = "";
        this.f286174b = 1;
        this.f286175c = false;
        this.f286176d = 0L;
        this.f286177e = 0L;
    }
}
