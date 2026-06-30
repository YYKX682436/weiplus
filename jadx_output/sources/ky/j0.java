package ky;

/* loaded from: classes14.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f313372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ky.h0 f313374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f313375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.Window window, android.view.View view, ky.h0 h0Var, boolean z17) {
        super(1);
        this.f313372d = window;
        this.f313373e = view;
        this.f313374f = h0Var;
        this.f313375g = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        android.view.Window window = this.f313372d;
        n3.m3 m3Var = new n3.m3(window, this.f313373e);
        int ordinal = this.f313374f.ordinal();
        if (ordinal == 0) {
            m3Var.c(!this.f313375g);
        } else if (ordinal == 1) {
            m3Var.c(true);
        } else if (ordinal == 2) {
            m3Var.c(false);
        }
        window.setStatusBarColor(0);
        return new ky.i0();
    }
}
