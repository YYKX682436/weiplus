package lo2;

/* loaded from: classes8.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f320132d;

    /* renamed from: e, reason: collision with root package name */
    public int f320133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI f320134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320134f = finderMemberSearchUI;
        this.f320135g = str;
        this.f320136h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lo2.i0(this.f320134f, this.f320135g, this.f320136h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c76;
        java.lang.Object obj2;
        java.lang.Throwable m524exceptionOrNullimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f320133e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI = this.f320134f;
            java.lang.String str = this.f320135g;
            this.f320133e = 1;
            c76 = com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI.c7(finderMemberSearchUI, str, this);
            if (c76 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f320132d;
                kotlin.ResultKt.throwOnFailure(obj);
                c76 = obj2;
                m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(c76);
                if (m524exceptionOrNullimpl != null && (m524exceptionOrNullimpl instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request CgiGetFinderSearchMemberZone fail, errType=");
                    rm0.j jVar = (rm0.j) m524exceptionOrNullimpl;
                    sb6.append(jVar.f397424e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f397425f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f397426g);
                    com.tencent.mars.xlog.Log.e("Finder.FinderMemberSearchUI", sb6.toString());
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c76 = ((kotlin.Result) obj).getValue();
        }
        java.lang.String str2 = this.f320136h;
        com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI finderMemberSearchUI2 = this.f320134f;
        java.lang.String str3 = this.f320135g;
        if (kotlin.Result.m528isSuccessimpl(c76)) {
            r45.qu2 qu2Var = (r45.qu2) c76;
            if (kotlin.jvm.internal.o.b(str2, finderMemberSearchUI2.E)) {
                finderMemberSearchUI2.F = qu2Var.f384263e;
                int i18 = qu2Var.f384264f;
                finderMemberSearchUI2.G = i18;
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "set continueFlag " + i18);
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "request CgiGetFinderSearchMemberZone success, data: " + qu2Var.f384262d.size() + ", lastBuffer: " + finderMemberSearchUI2.F + ", continueFlag: " + finderMemberSearchUI2.G);
                java.util.List d76 = com.tencent.mm.plugin.finder.member.ui.FinderMemberSearchUI.d7(finderMemberSearchUI2, qu2Var);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                lo2.h0 h0Var = new lo2.h0(finderMemberSearchUI2, d76, null);
                this.f320132d = c76;
                this.f320133e = 2;
                if (kotlinx.coroutines.l.g(g3Var, h0Var, this) == aVar) {
                    return aVar;
                }
                obj2 = c76;
                c76 = obj2;
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderMemberSearchUI", "refresh query not match query " + str3 + " curQuery " + finderMemberSearchUI2.D);
            }
        }
        m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(c76);
        if (m524exceptionOrNullimpl != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("request CgiGetFinderSearchMemberZone fail, errType=");
            rm0.j jVar2 = (rm0.j) m524exceptionOrNullimpl;
            sb62.append(jVar2.f397424e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f397425f);
            sb62.append(" fail:");
            sb62.append(jVar2.f397426g);
            com.tencent.mars.xlog.Log.e("Finder.FinderMemberSearchUI", sb62.toString());
        }
        return jz5.f0.f302826a;
    }
}
