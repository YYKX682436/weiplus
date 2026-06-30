package lo2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f320137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f320138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI f320139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320138e = fVar;
        this.f320139f = finderMemberFanListUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        lo2.j jVar = new lo2.j(this.f320138e, this.f320139f, continuation);
        jVar.f320137d = obj;
        return jVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelbase.f fVar = this.f320138e;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.modelbase.i iVar = fVar.f70620f;
            kotlin.jvm.internal.o.e(iVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.member.cgi.FinderFetchMyMembershipSubscriberCgi");
            com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI = this.f320139f;
            if (!kotlin.jvm.internal.o.b(finderMemberFanListUI.A, ((ho2.d) iVar).f282866t)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberFanListUI", "not my buf, ignore!");
                return f0Var;
            }
            finderMemberFanListUI.f121396z = ((r45.bs0) fVar.f70618d).f371020e != 0;
            if (finderMemberFanListUI.A == null) {
                finderMemberFanListUI.f121395y.clear();
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                pm0.v.J(km5.u.d(), new lo2.h(fVar, finderMemberFanListUI));
            }
            finderMemberFanListUI.A = ((r45.bs0) fVar.f70618d).f371021f;
            pm0.v.X(new lo2.i(finderMemberFanListUI, fVar));
        }
        return f0Var;
    }
}
