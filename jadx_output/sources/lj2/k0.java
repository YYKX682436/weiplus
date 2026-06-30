package lj2;

/* loaded from: classes3.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f318886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(lj2.o0 o0Var) {
        super(0);
        this.f318886d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lj2.o0 o0Var = this.f318886d;
        o0Var.f318907g = 0;
        android.view.View view = o0Var.f318901a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$hideStatePanel$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$hideStatePanel$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
