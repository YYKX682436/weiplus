package cw1;

/* loaded from: classes3.dex */
public final class k0 implements c01.e8 {

    /* renamed from: d, reason: collision with root package name */
    public final long f223068d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223071g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223072h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f223073i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223074m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223075n;

    public k0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, android.widget.TextView textView, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView2, android.widget.TextView textView3) {
        this.f223069e = cleanAllMessagesUI;
        this.f223070f = textView;
        this.f223071g = view;
        this.f223072h = view2;
        this.f223073i = view3;
        this.f223074m = textView2;
        this.f223075n = textView3;
    }

    @Override // c01.e8
    public void b(int i17, int i18) {
        yv1.h1.f(2, this.f223069e.f95647d);
        if (i18 <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.j0(this.f223070f, this.f223069e, i17, i18));
    }

    @Override // c01.e8
    public void c(boolean z17, long j17, int i17) {
        if (z17) {
            yv1.h1.g(0, null, 2, null);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.i0(this.f223069e, this.f223071g, this.f223072h, this.f223073i, z17, this.f223074m, this.f223075n));
        jx3.f.INSTANCE.d(25464, 15, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f223068d), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
