package sg0;

/* loaded from: classes8.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f407745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sg0.w2 f407746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f407747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, sg0.w2 w2Var, kotlinx.coroutines.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407745d = j17;
        this.f407746e = w2Var;
        this.f407747f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg0.l2(this.f407745d, this.f407746e, this.f407747f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sg0.l2 l2Var = (sg0.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        sg0.j2 j2Var;
        com.tencent.mm.plugin.websearch.m2 m2Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disposeSearchResultPage ");
        long j17 = this.f407745d;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", sb6.toString());
        sg0.w2 w2Var = this.f407746e;
        java.lang.String str = (java.lang.String) w2Var.f407850n.remove(new java.lang.Long(j17));
        sg0.i2 i2Var = (sg0.i2) w2Var.f407852p.remove(new java.lang.Long(j17));
        if (i2Var != null && (j2Var = i2Var.f407723a) != null && (m2Var = j2Var.f407733a) != null) {
            m2Var.b(null);
        }
        if (str != null) {
            try {
                ou4.e0 hj6 = w2Var.hj();
                if (hj6 != null) {
                    ((ou4.z) hj6).Ai(str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.hitest.WebSearchFlutterService", "Container destroyed: ".concat(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.hitest.WebSearchFlutterService", "Failed to destroy container: ".concat(str), e17);
            }
        }
        kotlinx.coroutines.z0.e(this.f407747f, null, 1, null);
        return jz5.f0.f302826a;
    }
}
