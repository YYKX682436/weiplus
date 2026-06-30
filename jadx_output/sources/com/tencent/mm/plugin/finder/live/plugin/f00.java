package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f00 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f112477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(1);
        this.f112477d = w00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.x4 x4Var;
        com.tencent.mm.plugin.finder.live.plugin.ap apVar;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar;
        java.lang.String str;
        java.lang.String str2 = (java.lang.String) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToFinderLive from:");
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f112477d;
        sb6.append(((mm2.c1) w00Var.P0(mm2.c1.class)).f328852o);
        sb6.append(" to:");
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = w00Var.f114843q;
        com.tencent.mars.xlog.Log.i(str3, sb7);
        km2.n nVar = dk2.ef.H;
        if (nVar != null && (x4Var = nVar.f309155g) != null) {
            if (x4Var.B == null) {
                x4Var.B = new r45.ta4();
            }
            r45.ta4 ta4Var = x4Var.B;
            if (ta4Var != null) {
                km2.q l76 = ((mm2.o4) w00Var.P0(mm2.o4.class)).l7();
                if (l76 == null || (str = l76.f309172c) == null) {
                    str = "";
                }
                ta4Var.set(9, str);
            }
            if (w00Var.R && (apVar = (com.tencent.mm.plugin.finder.live.plugin.ap) w00Var.X0(com.tencent.mm.plugin.finder.live.plugin.ap.class)) != null) {
                java.lang.String sdkUserId = w00Var.I;
                kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
                java.lang.String E1 = apVar.E1(sdkUserId, ((mm2.y2) apVar.P0(mm2.y2.class)).f329560m);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "getShowingBulletLiveMsgByUserId key:" + E1);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) apVar.F.get(E1);
                r45.ch1 ch1Var = (viewGroup == null || (tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) apVar.A.get(viewGroup)) == null || !tnVar.f114437d.get()) ? null : tnVar.f114453t;
                if (ch1Var != null) {
                    r45.ta4 ta4Var2 = x4Var.B;
                    if (ta4Var2 != null) {
                        ta4Var2.set(16, hc2.b.a(ch1Var));
                    }
                    com.tencent.mars.xlog.Log.i(str3, "goToFinderLive replayGift:" + ch1Var.hashCode());
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str4 = a52.a.f1584l;
            kotlin.jvm.internal.o.f(str4, "getCurCommentscene(...)");
            y4Var.getClass();
            y4Var.f328286a = str4;
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.view.ViewGroup viewGroup2 = w00Var.f365323d;
            android.content.Context context = viewGroup2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String str5 = str2 == null ? "" : str2;
            android.content.Context context2 = viewGroup2.getContext();
            ((vd2.f1) e0Var).Bi(context, null, str5, context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null, x4Var, null);
        }
        return jz5.f0.f302826a;
    }
}
