package df2;

/* loaded from: classes3.dex */
public final class vi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f231610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObjectDesc f231611f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(df2.wi wiVar, com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231610e = wiVar;
        this.f231611f = finderObjectDesc;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.vi(this.f231610e, this.f231611f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.vi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.s63 s63Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231609d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            df2.wi wiVar = this.f231610e;
            ((mm2.e1) wiVar.business(mm2.e1.class)).f328991u = this.f231611f;
            mm2.c1 c1Var = (mm2.c1) wiVar.business(mm2.c1.class);
            java.lang.String str = (java.lang.String) ((kotlinx.coroutines.flow.h3) wiVar.a7().f329076q).getValue();
            if (str == null) {
                r45.n73 c76 = wiVar.c7();
                str = (c76 == null || (s63Var = (r45.s63) c76.getCustom(3)) == null) ? null : s63Var.getString(0);
                if (str == null) {
                    str = "";
                }
            }
            c1Var.V1 = str;
            dk2.ef efVar = dk2.ef.f233372a;
            boolean z17 = ((mm2.s1) wiVar.business(mm2.s1.class)).f329398u;
            df2.ui uiVar = new df2.ui(wiVar);
            this.f231609d = 1;
            gk2.e eVar = dk2.ef.I;
            if (eVar == null || (obj2 = zl2.r4.f473950a.s2(eVar, new dk2.le(eVar, z17, uiVar), this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
