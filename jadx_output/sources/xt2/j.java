package xt2;

/* loaded from: classes3.dex */
public final class j implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f456809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f456810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f456811g;

    public j(xt2.m mVar, kotlin.jvm.internal.h0 h0Var, v65.n nVar, android.widget.ImageView imageView) {
        this.f456808d = mVar;
        this.f456809e = h0Var;
        this.f456810f = nVar;
        this.f456811g = imageView;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
        if (mMPAGView != null) {
            mMPAGView.i(this);
            this.f456811g.setVisibility(0);
            mMPAGView.setVisibility(8);
        }
        java.lang.String str = this.f456808d.f456882n;
        java.lang.String str2 = "play animate cancel " + ((java.lang.String) this.f456809e.f310123d);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(str, str2, null);
        this.f456810f.a(null);
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        java.lang.String str = this.f456808d.f456882n;
        java.lang.String str2 = "play animate start " + ((java.lang.String) this.f456809e.f310123d);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(str, str2, null);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        if (mMPAGView != null) {
            mMPAGView.i(this);
            this.f456811g.setVisibility(0);
            mMPAGView.setVisibility(8);
        }
        java.lang.String str = this.f456808d.f456882n;
        java.lang.String str2 = "play animate end " + ((java.lang.String) this.f456809e.f310123d);
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i(str, str2, null);
        this.f456810f.a(null);
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
