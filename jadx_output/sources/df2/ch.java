package df2;

/* loaded from: classes3.dex */
public final class ch extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.hh f229885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(df2.hh hhVar) {
        super(0);
        this.f229885d = hhVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.hh hhVar = this.f229885d;
        try {
            android.view.View T6 = hhVar.T6(com.tencent.mm.R.id.ti_, com.tencent.mm.R.id.ti8);
            com.tencent.mm.view.MMPAGView mMPAGView = T6 != null ? (com.tencent.mm.view.MMPAGView) T6.findViewById(com.tencent.mm.R.id.t4t) : null;
            if (mMPAGView != null) {
                mMPAGView.h();
            }
            hhVar.f230330q = true;
            if (T6 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(T6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/live/controller/LiveDoubleClickLikeGuideController$hideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveDoubleClickLikeGuideController", "hideTip fail " + e17);
        }
        return jz5.f0.f302826a;
    }
}
