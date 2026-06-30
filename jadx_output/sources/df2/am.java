package df2;

/* loaded from: classes3.dex */
public final class am extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.hm f229729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vb2 f229730e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(df2.hm hmVar, r45.vb2 vb2Var) {
        super(0);
        this.f229729d = hmVar;
        this.f229730e = vb2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.vb2 vb2Var;
        yg2.b viewScope;
        r45.vb2 vb2Var2;
        int i17;
        df2.hm hmVar = this.f229729d;
        android.view.ViewGroup a76 = df2.hm.a7(hmVar);
        if (a76 != null) {
            android.view.View findViewById = a76.findViewById(com.tencent.mm.R.id.gzp);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) a76.findViewById(com.tencent.mm.R.id.gzq);
            android.widget.TextView textView = (android.widget.TextView) a76.findViewById(com.tencent.mm.R.id.gzo);
            r45.vb2 vb2Var3 = this.f229730e;
            hmVar.f230337o = vb2Var3.getInteger(0);
            int integer = vb2Var3.getInteger(0);
            if (integer == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                vb2Var = vb2Var3;
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateAnchorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateAnchorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMPAGView.setVisibility(0);
                textView.setText(a76.getContext().getString(com.tencent.mm.R.string.d5_));
                com.tencent.mm.plugin.finder.live.util.y.o(hmVar, kotlinx.coroutines.q1.f310570c, null, new df2.xl(mMPAGView, null), 2, null);
                com.tencent.mm.plugin.finder.live.view.ub ubVar = hmVar.f291099e;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
                if (k0Var != null && (viewScope = k0Var.getViewScope()) != null) {
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HOT_DETAIL_GUIDE_BOOLEAN_SYNC;
                    if (gm0.j1.u().c().m(u3Var, null) == null) {
                        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                        a76.post(new df2.sl(a76, viewScope));
                    }
                }
            } else if (integer != 2) {
                vb2Var2 = vb2Var3;
                i17 = 1;
                a76.setOnClickListener(new df2.rl((com.tencent.mm.protocal.protobuf.FinderJumpInfo) vb2Var2.getCustom(i17), hmVar, a76));
                a76.post(new df2.zl(a76, hmVar));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateAnchorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateAnchorHeatTips$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mMPAGView.setVisibility(8);
                textView.setText(a76.getContext().getString(com.tencent.mm.R.string.d59));
                hmVar.f230338p = com.tencent.mm.plugin.finder.live.util.y.o(hmVar, null, null, new df2.yl(vb2Var3, a76, hmVar, null), 3, null);
                vb2Var = vb2Var3;
            }
            vb2Var2 = vb2Var;
            i17 = 1;
            a76.setOnClickListener(new df2.rl((com.tencent.mm.protocal.protobuf.FinderJumpInfo) vb2Var2.getCustom(i17), hmVar, a76));
            a76.post(new df2.zl(a76, hmVar));
        }
        return jz5.f0.f302826a;
    }
}
