package un1;

/* loaded from: classes5.dex */
public final class l extends s35.b implements io1.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f429450m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f429451n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f429452o;

    /* renamed from: p, reason: collision with root package name */
    public long f429453p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f429450m = "MM.Roam.RoamLiteBanner";
        this.f429453p = -1L;
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.b(this);
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        kotlin.jvm.internal.o.g(task, "task");
        pm0.v.X(new un1.j(this, task));
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        pm0.v.X(new un1.k(this, task, state, error));
    }

    @Override // s35.b
    public void a() {
        com.tencent.mm.plugin.backup.roambackup.r0.f92684a.p(this);
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488174jk;
    }

    @Override // s35.b
    public int c() {
        return 3;
    }

    @Override // s35.b
    public void h(android.view.View innerBannerView) {
        kotlin.jvm.internal.o.g(innerBannerView, "innerBannerView");
        android.view.View findViewById = innerBannerView.findViewById(com.tencent.mm.R.id.ac6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f429452o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = innerBannerView.findViewById(com.tencent.mm.R.id.ac7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f429451n = (android.widget.TextView) findViewById2;
        innerBannerView.setOnClickListener(new un1.i(this));
    }
}
