package r2;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f368700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.w f368701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f368702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r2.o oVar, u1.w wVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f368700d = oVar;
        this.f368701e = wVar;
        this.f368702f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        u1.r1 owner = (u1.r1) obj;
        kotlin.jvm.internal.o.g(owner, "owner");
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = owner instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) owner : null;
        r2.o view = this.f368700d;
        if (androidComposeView != null) {
            kotlin.jvm.internal.o.g(view, "view");
            u1.w layoutNode = this.f368701e;
            kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
            androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
            androidComposeView.getAndroidViewsHandler$ui_release().addView(view);
            androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.s(view, 1);
            n3.l1.l(view, new androidx.compose.ui.platform.o(layoutNode, androidComposeView, androidComposeView));
        }
        java.lang.Object obj2 = this.f368702f.f310123d;
        if (obj2 != null) {
            view.setView$ui_release((android.view.View) obj2);
        }
        return jz5.f0.f302826a;
    }
}
