package r2;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f368704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f368705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r2.o oVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f368704d = oVar;
        this.f368705e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        u1.r1 owner = (u1.r1) obj;
        kotlin.jvm.internal.o.g(owner, "owner");
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner : null;
        r2.o view = this.f368704d;
        if (androidComposeView != null) {
            kotlin.jvm.internal.o.g(view, "view");
            androidComposeView.getAndroidViewsHandler$ui_release().removeView(view);
            kotlin.jvm.internal.m0.c(androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.s(view, 0);
        }
        this.f368705e.f310123d = view.getView();
        view.setView$ui_release(null);
        return jz5.f0.f302826a;
    }
}
