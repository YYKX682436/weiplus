package fq4;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f265569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265569e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fq4.a(this.f265569e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fq4.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f265568d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                int i18 = this.f265569e;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                r45.ti6 ti6Var = new r45.ti6();
                ti6Var.f386493d = i18;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 615;
                lVar.f70666c = "/cgi-bin/micromsg-bin/switchopvoiceprint";
                lVar.f70664a = ti6Var;
                lVar.f70665b = new r45.ui6();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                this.f265568d = 1;
                obj = rm0.h.a(iVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl((r45.ui6) obj);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CgiHelper", m524exceptionOrNullimpl, "switchOpError", new java.lang.Object[0]);
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            return null;
        }
        return m521constructorimpl;
    }
}
