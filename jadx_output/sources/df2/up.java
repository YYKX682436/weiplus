package df2;

/* loaded from: classes10.dex */
public final class up extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.vp f231548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(df2.vp vpVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231548e = vpVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.up(this.f231548e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.up) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mn0.i0 n17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231547d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            tn0.w0 w0Var = dk2.ef.f233378d;
            co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
            mn0.b0 b0Var = sVar != null ? sVar.R1.f282409a : null;
            df2.vp vpVar = this.f231548e;
            vpVar.f231620m = b0Var;
            if ((b0Var == null || (n17 = ((mn0.y) b0Var).n()) == null || !n17.f329760z) ? false : true) {
                vpVar.f231622o = 2;
            }
            mn0.b0 b0Var2 = vpVar.f231620m;
            if (b0Var2 != null) {
                df2.tp tpVar = new df2.tp(vpVar);
                this.f231547d = 1;
                mn0.y.c((mn0.y) b0Var2, tpVar, this);
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
