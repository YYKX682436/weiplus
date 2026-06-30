package sc2;

/* loaded from: classes2.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f405965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f405966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405967g;

    public i3(in5.s0 s0Var, sc2.m3 m3Var, android.widget.ImageView imageView, android.view.View view) {
        this.f405964d = s0Var;
        this.f405965e = m3Var;
        this.f405966f = imageView;
        this.f405967g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc2.e3 e3Var = sc2.m3.A;
        in5.s0 s0Var = this.f405964d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int c17 = com.tencent.mm.ui.bl.c(s0Var.f293121e);
        int b17 = e3Var.b(context);
        sc2.m3.B[b17] = c17;
        com.tencent.mars.xlog.Log.i("Finder.FeedJumperBubbleObserver", "[setNavigationBarHeight] index:" + b17 + " navigationBarHeight:" + c17 + ", translationY");
        android.widget.ImageView imageView = this.f405966f;
        sc2.m3 m3Var = this.f405965e;
        sc2.m3.G(m3Var, s0Var, imageView, "showRedPacketCoverBg");
        m3Var.M(s0Var, this.f405967g, false, "showRedPacketCoverBg");
    }
}
