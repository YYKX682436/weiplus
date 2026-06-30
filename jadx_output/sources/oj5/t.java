package oj5;

/* loaded from: classes3.dex */
public final class t implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f345886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f345887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f345889g;

    public t(android.view.View view, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f345886d = view;
        this.f345887e = c0Var;
        this.f345888f = h0Var;
        this.f345889g = n3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f345886d.removeOnAttachStateChangeListener(this);
        this.f345887e.f310112d = true;
        java.lang.Runnable runnable = (java.lang.Runnable) this.f345888f.f310123d;
        if (runnable != null) {
            this.f345889g.removeCallbacks(runnable);
        }
    }
}
