package qn2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.z f365030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f365032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(km2.z zVar, qn2.n nVar, boolean z17) {
        super(0);
        this.f365030d = zVar;
        this.f365031e = nVar;
        this.f365032f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        r45.vd4 vd4Var;
        com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget finderLiveLotteryCardGiftWidget;
        km2.z zVar = this.f365030d;
        r45.cz1 cz1Var = zVar.f309232d;
        if (cz1Var != null) {
            int i17 = zVar.f309229a;
            int i18 = zVar.f309230b;
            qn2.n nVar = this.f365031e;
            com.tencent.mars.xlog.Log.i(nVar.B, "anchorOpenCard lotteryInfo:" + pm0.b0.g(cz1Var) + ", status:" + i17 + ",statusChange:" + this.f365032f + ",haveLottering:" + zVar.f309231c + ",,localRemainTime:" + i18);
            if (i17 == 1) {
                nVar.A1(0);
                int integer = cz1Var.getInteger(1);
                int integer2 = cz1Var.getInteger(2);
                int integer3 = cz1Var.getInteger(3);
                if (i18 < 0 || i18 >= integer2 - integer) {
                    i18 = zl2.r4.f473950a.G0(integer, integer2, integer3);
                }
                int i19 = i18;
                android.widget.TextView textView = nVar.H;
                android.view.ViewGroup viewGroup = nVar.f365323d;
                if (textView != null) {
                    java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dps);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{no0.l.a(no0.m.f338730a, i19, ":", false, false, false, 24, null)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    textView.setText(format);
                }
                if (cz1Var.getInteger(7) > 0) {
                    android.widget.TextView textView2 = nVar.I;
                    if (textView2 != null) {
                        java.lang.String string3 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dop);
                        kotlin.jvm.internal.o.f(string3, "getString(...)");
                        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(cz1Var.getInteger(7))}, 1));
                        kotlin.jvm.internal.o.f(format2, "format(...)");
                        textView2.setText(format2);
                    }
                    android.widget.TextView textView3 = nVar.f365117J;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    android.widget.TextView textView4 = nVar.I;
                    if (textView4 != null) {
                        textView4.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491635dr1));
                    }
                    android.widget.TextView textView5 = nVar.f365117J;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                }
                nVar.B1(nVar.G, cz1Var);
                android.widget.TextView textView6 = nVar.K;
                if (textView6 != null) {
                    on2.l3.f346966a.f(textView6);
                }
                r45.gz1 gz1Var = (r45.gz1) cz1Var.getCustom(14);
                if (gz1Var != null && gz1Var.getInteger(0) == 2) {
                    android.view.View view = nVar.W;
                    if (view != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView7 = nVar.G;
                    if (textView7 != null) {
                        textView7.setVisibility(8);
                    }
                    r45.gz1 gz1Var2 = (r45.gz1) cz1Var.getCustom(14);
                    java.lang.Integer num = null;
                    if (gz1Var2 != null && (finderLiveLotteryCardGiftWidget = nVar.V) != null) {
                        int i27 = com.tencent.mm.plugin.finder.lottery.card.FinderLiveLotteryCardGiftWidget.f120827i;
                        finderLiveLotteryCardGiftWidget.b(gz1Var2, null);
                    }
                    android.widget.TextView textView8 = nVar.X;
                    if (textView8 != null) {
                        textView8.setVisibility(0);
                    }
                    r45.gz1 gz1Var3 = (r45.gz1) cz1Var.getCustom(14);
                    if (gz1Var3 != null && (vd4Var = (r45.vd4) gz1Var3.getCustom(2)) != null) {
                        num = java.lang.Integer.valueOf(vd4Var.getInteger(0));
                    }
                    if (num != null && num.intValue() == 1) {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lim);
                        kotlin.jvm.internal.o.d(string);
                    } else {
                        string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lin);
                        kotlin.jvm.internal.o.d(string);
                    }
                    android.widget.TextView textView9 = nVar.X;
                    if (textView9 != null) {
                        textView9.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491458li5, string, java.lang.Integer.valueOf(cz1Var.getInteger(6))));
                    }
                } else {
                    android.view.View view2 = nVar.W;
                    if (view2 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin", "anchorLotteryRunning$updateGiftInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lcom/tencent/mm/plugin/finder/lottery/card/FinderLiveAnchorLotteryCardPlugin;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView10 = nVar.G;
                    if (textView10 != null) {
                        textView10.setVisibility(0);
                    }
                }
                nVar.K0(0);
            } else if (i17 == 2) {
                nVar.x1(zVar, cz1Var, i17, nVar.f365118p0);
            } else if (i17 == 3) {
                nVar.x1(zVar, cz1Var, i17, nVar.f365119x0);
            } else if (i17 == 4) {
                com.tencent.mars.xlog.Log.i(nVar.B, "anchorLotteryCancelled id:" + cz1Var.getString(0));
                nVar.K0(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
