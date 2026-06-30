package qg3;

/* loaded from: classes2.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362869d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f362871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.d30 f362872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f362873h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f362874i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f362875m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362876n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, bw5.d30 d30Var, byte[] bArr, int i18, int i19, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362871f = i17;
        this.f362872g = d30Var;
        this.f362873h = bArr;
        this.f362874i = i18;
        this.f362875m = i19;
        this.f362876n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qg3.u0 u0Var = new qg3.u0(this.f362871f, this.f362872g, this.f362873h, this.f362874i, this.f362875m, this.f362876n, continuation);
        u0Var.f362870e = obj;
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg3.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362869d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f362870e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTopStoryFlow start commentScene=");
            int i18 = this.f362871f;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
            bw5.d30 d30Var = this.f362872g;
            if (d30Var != null) {
                r45.vs2 vs2Var = new r45.vs2();
                vs2Var.parseFrom(d30Var.toByteArray());
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                jbVar2.t0(vs2Var);
                jbVar = jbVar2;
            } else {
                jbVar = null;
            }
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(5, java.lang.Integer.valueOf(i18));
            vn2.k kVar = vn2.l.f438315a;
            kotlinx.coroutines.f1 b17 = kotlinx.coroutines.l.b(y0Var, kotlinx.coroutines.q1.f310570c, null, new qg3.t0(kVar.c(jbVar, qt2Var, pm0.b0.h(this.f362873h), this.f362874i, kVar.a(this.f362875m), null), null), 2, null);
            this.f362869d = 1;
            obj = ((kotlinx.coroutines.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.c cVar = (com.tencent.mm.plugin.finder.megavideo.topstory.flow.c) obj;
        int errType = cVar.getErrType();
        yz5.l lVar = this.f362876n;
        if (errType == 0 && cVar.getErrCode() == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mainFlowResp: ");
            r45.m03 m03Var = cVar.f120906b;
            sb7.append(m03Var.getList(1).size());
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb7.toString());
            try {
                byte[] byteArray = m03Var.toByteArray();
                if (byteArray == null) {
                    byteArray = new byte[0];
                }
                lVar.invoke(byteArray);
            } catch (java.lang.Exception e17) {
                lVar.invoke(new byte[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", "mainFlowResp: failed errType:" + cVar.getErrType() + ", errCode:" + cVar.getErrCode());
            lVar.invoke(new byte[0]);
        }
        return jz5.f0.f302826a;
    }
}
