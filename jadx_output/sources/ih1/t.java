package ih1;

/* loaded from: classes7.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f291527d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ih1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291529f = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ih1.t tVar = new ih1.t(this.f291529f, continuation);
        tVar.f291528e = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ih1.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f291527d;
        ih1.u uVar = this.f291529f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f291528e;
            ih1.s sVar = new ih1.s(uVar, null);
            this.f291528e = y0Var2;
            this.f291527d = 1;
            java.lang.Object c17 = kotlinx.coroutines.a4.c(300000L, sVar, this);
            if (c17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f291528e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = obj == null;
        if (!kotlinx.coroutines.z0.h(y0Var)) {
            com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], heartbeat coroutine cancelled");
        } else if (z17) {
            com.tencent.mars.xlog.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f291530a + "], heartbeat stopped after 300 seconds");
        }
        return jz5.f0.f302826a;
    }
}
