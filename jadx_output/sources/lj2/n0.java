package lj2;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.o0 f318897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(lj2.o0 o0Var) {
        super(0);
        this.f318897d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lj2.o0 o0Var = this.f318897d;
        android.view.View view = o0Var.f318901a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayMicLinkWidget$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        lj2.m0 m0Var = lj2.m0.f318890d;
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainer finderLiveFloatContainer = o0Var.f318903c;
        finderLiveFloatContainer.animate().translationX(0.0f).setListener(new com.tencent.mm.plugin.finder.live.view.u4(finderLiveFloatContainer, m0Var)).setDuration(500L).start();
        return jz5.f0.f302826a;
    }
}
