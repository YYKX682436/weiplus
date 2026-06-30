package df2;

/* loaded from: classes3.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f230032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(df2.l4 l4Var) {
        super(0);
        this.f230032d = l4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.l4 l4Var = this.f230032d;
        try {
            android.view.View T6 = l4Var.T6(com.tencent.mm.R.id.tow, com.tencent.mm.R.id.tou);
            com.tencent.mm.view.MMPAGView mMPAGView = T6 != null ? (com.tencent.mm.view.MMPAGView) T6.findViewById(com.tencent.mm.R.id.v6q) : null;
            if (mMPAGView != null) {
                mMPAGView.h();
            }
            l4Var.f230634r = true;
            if (T6 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/FinderLiveSlideToCloseGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveSlideToCloseGuideController", "hideTip fail " + e17);
        }
        return jz5.f0.f302826a;
    }
}
