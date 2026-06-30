package ih1;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291524d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291526f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ih1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291526f = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ih1.s sVar = new ih1.s(this.f291526f, continuation);
        sVar.f291525e = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ih1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291524d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f291525e;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f291525e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        do {
            boolean h17 = kotlinx.coroutines.z0.h(y0Var);
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (!h17) {
                return f0Var;
            }
            ih1.u uVar = this.f291526f;
            iq0.c cVar = uVar.f291532c;
            if (cVar != null) {
                com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], send heart beat");
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("heartBeat", ""));
                    m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                if (m524exceptionOrNullimpl != null) {
                    com.tencent.mars.xlog.Log.e("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], failed to notify heart beat", m524exceptionOrNullimpl);
                }
                kotlin.Result.m520boximpl(m521constructorimpl);
            }
            this.f291525e = y0Var;
            this.f291524d = 1;
        } while (kotlinx.coroutines.k1.b(3000L, this) != aVar);
        return aVar;
    }
}
