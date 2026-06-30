package xt2;

/* loaded from: classes10.dex */
public final class r1 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f456976d;

    public r1(xt2.u1 u1Var) {
        this.f456976d = u1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" on attach, start scroll, pageType = ");
        xt2.u1 u1Var = this.f456976d;
        sb6.append(u1Var.f457038b);
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingAutoScrollCommentView", sb6.toString());
        u1Var.g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" on detach, stop scroll, pageType = ");
        xt2.u1 u1Var = this.f456976d;
        sb6.append(u1Var.f457038b);
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingAutoScrollCommentView", sb6.toString());
        u1Var.h();
    }
}
