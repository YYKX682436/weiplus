package qn2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f365114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qn2.n nVar, int i17) {
        super(0);
        this.f365113d = nVar;
        this.f365114e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qn2.n nVar = this.f365113d;
        android.view.View view = nVar.T;
        int i17 = this.f365114e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin$setFooterTvVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = nVar.U;
        if (textView != null) {
            textView.setVisibility(i17);
        }
        return jz5.f0.f302826a;
    }
}
