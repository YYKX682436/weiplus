package ly0;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.n f322207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ly0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f322207d = nVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ly0.i(this.f322207d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ly0.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.AIGC.AIMediaGeneratePollingTask", "handleBypEvent state:" + this.f322207d.f322219d);
        int ordinal = this.f322207d.f322219d.ordinal();
        jz5.f0 f0Var = jz5.f0.f302826a;
        switch (ordinal) {
            case 2:
            case 3:
                ly0.d dVar = this.f322207d.f322221f;
                java.lang.String str = dVar != null ? dVar.f322188b : null;
                if (str == null || str.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AIGC.AIMediaGeneratePollingTask", "handleBypEvent - taskId is null");
                    return f0Var;
                }
                ly0.n.a(this.f322207d, str, null, false);
                break;
            case 0:
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                return f0Var;
        }
    }
}
