package ym5;

/* loaded from: classes2.dex */
public final class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f463265e;

    public e4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, boolean z17) {
        this.f463264d = refreshLoadMoreLayout;
        this.f463265e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463264d;
        e0Var.f310115d = refreshLoadMoreLayout.getTranslationY();
        kotlin.jvm.internal.e0 e0Var2 = new kotlin.jvm.internal.e0();
        e0Var2.f310115d = refreshLoadMoreLayout.getTranslationY();
        refreshLoadMoreLayout.q(this.f463265e, new ym5.c4(e0Var, refreshLoadMoreLayout, e0Var2), new ym5.d4(refreshLoadMoreLayout, e0Var, e0Var2));
    }
}
