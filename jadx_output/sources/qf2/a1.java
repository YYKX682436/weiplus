package qf2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f362284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar, qf2.y1 y1Var, dk2.u4 u4Var) {
        super(2, continuation);
        this.f362281d = hVar;
        this.f362282e = lVar;
        this.f362283f = y1Var;
        this.f362284g = u4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.a1(this.f362281d, continuation, this.f362282e, this.f362283f, this.f362284g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.a1 a1Var = (qf2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        qi2.s1 w17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewAcceptBattle success ");
        yz5.l lVar = this.f362282e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        if (((mm2.o4) this.f362283f.business(mm2.o4.class)).f329324s.size() <= 1) {
            com.tencent.mm.plugin.finder.live.plugin.na naVar = (com.tencent.mm.plugin.finder.live.plugin.na) this.f362283f.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
            if (naVar != null) {
                naVar.z1();
            }
            com.tencent.mm.plugin.finder.live.plugin.na naVar2 = (com.tencent.mm.plugin.finder.live.plugin.na) this.f362283f.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
            if (naVar2 != null) {
                naVar2.x1();
            }
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = (com.tencent.mm.plugin.finder.live.plugin.x7) this.f362283f.R6(com.tencent.mm.plugin.finder.live.plugin.x7.class);
            if (x7Var != null) {
                x7Var.I1(2);
            }
        } else {
            dk2.u4 u4Var = this.f362284g;
            u4Var.f234158e = 5;
            java.util.List list = u4Var.f234159f;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((km2.k) obj2).f309114a, ((mm2.c1) this.f362283f.business(mm2.c1.class)).f328852o)) {
                        break;
                    }
                }
            }
            km2.k kVar = (km2.k) obj2;
            if (kVar != null) {
                kVar.f309118e = true;
            }
            com.tencent.mm.plugin.finder.live.plugin.na naVar3 = (com.tencent.mm.plugin.finder.live.plugin.na) this.f362283f.R6(com.tencent.mm.plugin.finder.live.plugin.na.class);
            if (naVar3 != null && (w17 = naVar3.w1()) != null) {
                lj2.s b17 = ((lj2.c0) w17).b();
                b17.f318941e.setVisibility(0);
                b17.f318942f.setVisibility(8);
                b17.f318939c.setVisibility(4);
                b17.f318938b.setVisibility(4);
            }
        }
        return jz5.f0.f302826a;
    }
}
