package qf2;

/* loaded from: classes10.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f362514g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f362515h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362516i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.c3 c3Var, dk2.pf pfVar, java.util.LinkedList linkedList, yz5.l lVar) {
        super(2, continuation);
        this.f362512e = hVar;
        this.f362513f = c3Var;
        this.f362514g = pfVar;
        this.f362515h = linkedList;
        this.f362516i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.o2(this.f362512e, continuation, this.f362513f, this.f362514g, this.f362515h, this.f362516i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362511d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String string = ((r45.mm1) ((xg2.i) this.f362512e).f454393b).getString(1);
            com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "anchorApplyVisitorBattle success battleId: " + string);
            qf2.c3 c3Var = this.f362513f;
            mm2.o4 o4Var = (mm2.o4) c3Var.business(mm2.o4.class);
            dk2.pf pfVar = this.f362514g;
            dk2.u4 u4Var = new dk2.u4(string, 0L, 0, 0, 6, null, pfVar.f233926a, pfVar.f233927b, pfVar.f233928c, this.f362515h, null, null, pfVar.f233930e, 0, 0, 27694, null);
            km2.k kVar = new km2.k(((mm2.c1) c3Var.business(mm2.c1.class)).f328852o, "", 0L, 0, false, null, 0L, true, 0L, null, 0, 1912, null);
            java.util.List list = u4Var.f234159f;
            list.add(kVar);
            java.util.Iterator it = this.f362515h.iterator();
            while (it.hasNext()) {
                java.util.LinkedList list2 = ((r45.r22) it.next()).getList(0);
                kotlin.jvm.internal.o.f(list2, "getMembers(...)");
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    list.add(new km2.k(((r45.wk6) it6.next()).getString(0), "", 0L, 0, false, null, 0L, false, 0L, null, 0, 2040, null));
                }
            }
            o4Var.Z = u4Var;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            qf2.q2 q2Var = new qf2.q2(c3Var, pfVar, null);
            this.f362511d = 1;
            if (kotlinx.coroutines.l.g(g3Var, q2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.l lVar = this.f362516i;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
