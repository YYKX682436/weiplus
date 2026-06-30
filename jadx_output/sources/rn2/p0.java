package rn2;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, rn2.c1 c1Var) {
        super(0);
        this.f397816d = i17;
        this.f397817e = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f397816d;
        java.lang.String string = i17 == 1 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lis) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.liq);
        kotlin.jvm.internal.o.d(string);
        rn2.g gVar = this.f397817e.f397667g;
        if (gVar != null) {
            boolean z17 = i17 == 1;
            rn2.t2 t2Var = (rn2.t2) gVar;
            android.widget.TextView textView = t2Var.f397863p0;
            if (textView != null) {
                textView.setText(string);
            }
            android.view.View view = t2Var.A1;
            if (view != null) {
                int i18 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "prefillGiftDistribute", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "prefillGiftDistribute", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
