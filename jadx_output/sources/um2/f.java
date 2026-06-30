package um2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.g f428787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f428788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f428789g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(um2.g gVar, dk2.r4 r4Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428787e = gVar;
        this.f428788f = r4Var;
        this.f428789g = v3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.f(this.f428787e, this.f428788f, this.f428789g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428786d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f428786d = 1;
            obj = um2.g.k(this.f428787e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.l71 l71Var = (r45.l71) obj;
        if (l71Var != null) {
            this.f428789g.M1(this.f428788f.c0(l71Var));
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveVisitorEndUIC", "showCoLiveInviteeEndPage: get live info resp null, keep empty page");
        }
        return jz5.f0.f302826a;
    }
}
