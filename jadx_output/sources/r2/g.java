package r2;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.w f368712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r2.o f368713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(u1.w wVar, r2.o oVar) {
        super(1);
        this.f368712d = wVar;
        this.f368713e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g1.i drawBehind = (g1.i) obj;
        kotlin.jvm.internal.o.g(drawBehind, "$this$drawBehind");
        e1.u a17 = ((g1.b) drawBehind.p()).a();
        u1.r1 r1Var = this.f368712d.f423689m;
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = r1Var instanceof androidx.compose.ui.platform.AndroidComposeView ? (androidx.compose.ui.platform.AndroidComposeView) r1Var : null;
        if (androidComposeView != null) {
            android.graphics.Canvas canvas = e1.c.f246229a;
            kotlin.jvm.internal.o.g(a17, "<this>");
            android.graphics.Canvas canvas2 = ((e1.b) a17).f246225a;
            r2.o view = this.f368713e;
            kotlin.jvm.internal.o.g(view, "view");
            kotlin.jvm.internal.o.g(canvas2, "canvas");
            androidComposeView.getAndroidViewsHandler$ui_release().getClass();
            view.draw(canvas2);
        }
        return jz5.f0.f302826a;
    }
}
