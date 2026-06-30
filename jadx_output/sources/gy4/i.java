package gy4;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gy4.u f277603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277604f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gy4.u uVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277603e = uVar;
        this.f277604f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gy4.i(this.f277603e, this.f277604f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gy4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        c01.nb nbVar;
        kotlinx.coroutines.z zVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277602d;
        java.lang.String fileId = this.f277604f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qg5.l0 l0Var = (qg5.l0) this.f277603e.T6();
            l0Var.getClass();
            kotlin.jvm.internal.o.g(fileId, "fileId");
            qg5.r rVar = (qg5.r) l0Var.f363058t.get();
            c01.ob obVar = rVar == null ? null : (c01.ob) ((java.util.Map) ((jz5.n) rVar.f363153d).getValue()).get(fileId);
            if (obVar == null || (nbVar = obVar.f37374b) == null || (zVar = nbVar.f37352b) == null) {
                return null;
            }
            this.f277602d = 1;
            obj = ((kotlinx.coroutines.a0) zVar).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        c01.mb mbVar = (c01.mb) obj;
        if (mbVar != null) {
            return new com.tencent.mm.plugin.webview.model.p0(fileId, mbVar.f37332a, mbVar.f37333b);
        }
        return null;
    }
}
