package qf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362642g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar, qf2.y1 y1Var, dk2.m mVar) {
        super(2, continuation);
        this.f362639d = hVar;
        this.f362640e = lVar;
        this.f362641f = y1Var;
        this.f362642g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.x0(this.f362639d, continuation, this.f362640e, this.f362641f, this.f362642g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.x0 x0Var = (qf2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.o22 o22Var = (r45.o22) ((xg2.i) this.f362639d).f454393b;
        java.lang.String string = o22Var.getString(2);
        int integer = o22Var.getInteger(1);
        if (integer <= 0) {
            integer = 60;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewApplyBattle success battleId: " + string + " confirmTTl: " + integer + " curServerTime: " + c01.id.a());
        yz5.l lVar = this.f362640e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        qf2.y1 y1Var = this.f362641f;
        mm2.o4 o4Var = (mm2.o4) y1Var.business(mm2.o4.class);
        dk2.m mVar = this.f362642g;
        dk2.u4 u4Var = new dk2.u4(string, 0L, 0, 0, 0, null, mVar.f233738a, mVar.f233739b, mVar.f233740c, mVar.f233743f, null, null, mVar.f233742e, 0, 0, 27694, null);
        km2.k kVar = new km2.k(((mm2.c1) y1Var.business(mm2.c1.class)).f328852o, "", 0L, 0, false, null, 0L, true, 0L, null, 0, 1912, null);
        java.util.List list = u4Var.f234159f;
        list.add(kVar);
        java.util.Iterator it = mVar.f233743f.iterator();
        while (it.hasNext()) {
            int i17 = 0;
            java.util.LinkedList<r45.wk6> list2 = ((r45.r22) it.next()).getList(0);
            kotlin.jvm.internal.o.f(list2, "getMembers(...)");
            for (r45.wk6 wk6Var : list2) {
                list.add(new km2.k(wk6Var.getString(i17), wk6Var.getString(1), 0L, 0, false, null, 0L, false, 0L, null, 0, 2040, null));
                i17 = 0;
            }
        }
        o4Var.Z = u4Var;
        com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
        if (naVar != null) {
            naVar.E1();
        }
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) y1Var.R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
        if (x7Var != null) {
            x7Var.I1(1);
        }
        mk2.h hVar = mk2.h.f327133a;
        long j17 = integer * 1000;
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "startApplyBattleTimer delay:" + j17);
        com.tencent.mm.sdk.platformtools.u3.i(mk2.h.f327138f, j17);
        return jz5.f0.f302826a;
    }
}
