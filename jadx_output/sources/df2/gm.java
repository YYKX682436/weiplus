package df2;

/* loaded from: classes3.dex */
public final class gm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.hm f230231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tb2 f230232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(df2.hm hmVar, r45.tb2 tb2Var) {
        super(0);
        this.f230231d = hmVar;
        this.f230232e = tb2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.tb2 tb2Var;
        int i17;
        df2.hm hmVar = this.f230231d;
        android.view.ViewGroup a76 = df2.hm.a7(hmVar);
        if (a76 != null) {
            android.view.View findViewById = a76.findViewById(com.tencent.mm.R.id.gzp);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) a76.findViewById(com.tencent.mm.R.id.gzq);
            android.widget.TextView textView = (android.widget.TextView) a76.findViewById(com.tencent.mm.R.id.gzo);
            r45.tb2 tb2Var2 = this.f230232e;
            if (tb2Var2.getLong(0) > 0) {
                textView.setText(zl2.r4.S(zl2.r4.f473950a, tb2Var2.getLong(0), 0, 2, null));
            } else if (tb2Var2.getInteger(1) == 2) {
                textView.setText(a76.getContext().getString(com.tencent.mm.R.string.d59));
            } else {
                textView.setText(a76.getContext().getString(com.tencent.mm.R.string.d5_));
            }
            if (hmVar.f230337o != tb2Var2.getInteger(1)) {
                hmVar.f230337o = tb2Var2.getInteger(1);
                int integer = tb2Var2.getInteger(1);
                if (integer == 1) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mMPAGView.setVisibility(0);
                    tb2Var = tb2Var2;
                    com.tencent.mm.plugin.finder.live.util.y.o(hmVar, kotlinx.coroutines.q1.f310570c, null, new df2.dm(mMPAGView, null), 2, null);
                } else if (integer != 2) {
                    tb2Var = tb2Var2;
                    i17 = 2;
                    a76.setOnClickListener(new df2.rl((com.tencent.mm.protocal.protobuf.FinderJumpInfo) tb2Var.getCustom(i17), hmVar, a76));
                    a76.post(new df2.fm(a76, hmVar));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    mMPAGView.setVisibility(8);
                    hmVar.f230338p = com.tencent.mm.plugin.finder.live.util.y.o(hmVar, null, null, new df2.em(tb2Var2, a76, hmVar, null), 3, null);
                    tb2Var = tb2Var2;
                }
                i17 = 2;
                a76.setOnClickListener(new df2.rl((com.tencent.mm.protocal.protobuf.FinderJumpInfo) tb2Var.getCustom(i17), hmVar, a76));
                a76.post(new df2.fm(a76, hmVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
