package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gh0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f112701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.eh0 f112702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(com.tencent.mm.plugin.finder.live.plugin.th0 th0Var, com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112701e = th0Var;
        this.f112702f = eh0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.gh0(this.f112701e, this.f112702f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.gh0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112700d;
        java.lang.Object obj2 = null;
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f112701e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.live.plugin.fh0 fh0Var = new com.tencent.mm.plugin.finder.live.plugin.fh0(th0Var, null);
            this.f112700d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, fh0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) lVar.f302834e).booleanValue();
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", "haveJoinFansClub success:" + booleanValue + ", needPurcase:" + booleanValue2);
        if (booleanValue) {
            mm2.n2 n2Var = (mm2.n2) th0Var.P0(mm2.n2.class);
            dm.o4 o4Var = ((mm2.n2) th0Var.P0(mm2.n2.class)).f329282m;
            if (o4Var == null) {
                dk2.u7 u7Var = dk2.u7.f234181a;
                java.util.Iterator it = dk2.u7.f234185e.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (pm0.v.z(((ce2.i) next).field_flag, 4)) {
                        obj2 = next;
                        break;
                    }
                }
                o4Var = (dm.o4) obj2;
            }
            n2Var.P6(o4Var);
            boolean x07 = th0Var.x0();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showInvitePanel isLand:");
            sb6.append(x07);
            sb6.append(",needPurcase:");
            sb6.append(booleanValue2);
            sb6.append(",fromScene:");
            com.tencent.mm.plugin.finder.live.plugin.eh0 eh0Var = this.f112702f;
            sb6.append(eh0Var);
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorFansClubPanelPlugin", sb6.toString());
            if (x07) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("JOIN_FANS_CLUB_NEED_PURCHASE", booleanValue2);
                bundle.putInt("JOIN_FANS_CLUB_FROM_SCENE", eh0Var.f112423d);
                th0Var.p1("PORTRAIT_ACTION_JOIN_FANS_CLUB", bundle);
            } else {
                th0Var.w1();
                com.tencent.mm.plugin.finder.live.widget.h1 h1Var = th0Var.f114403q;
                if (h1Var != null) {
                    h1Var.e(th0Var.S0(), booleanValue2, eh0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
