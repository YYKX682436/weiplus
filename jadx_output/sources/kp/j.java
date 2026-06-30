package kp;

/* loaded from: classes13.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.n f310775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f310776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kp.n nVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310775e = nVar;
        this.f310776f = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.j(this.f310775e, this.f310776f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310774d;
        bw5.is0 is0Var = bw5.is0.WIFI_DIRECT_OP_TYPE_CREATE;
        kp.n nVar = this.f310775e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gz.m a17 = nVar.a();
                this.f310774d = 1;
                obj = ((kp.i1) a17).Ri(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            gz.b bVar = (gz.b) obj;
            if (bVar.f277642a) {
                com.tencent.wechat.aff.local_connection.e eVar = nVar.f310798a;
                if (eVar != null) {
                    eVar.H0(this.f310776f, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS, bVar.f277645d, bVar.f277646e);
                }
                com.tencent.wechat.aff.local_connection.d dVar = com.tencent.wechat.aff.local_connection.d.f217358c;
                bw5.hs0 hs0Var = new bw5.hs0();
                hs0Var.e(is0Var);
                hs0Var.b(0);
                hs0Var.c("create group success");
                hs0Var.d(bVar.f277645d);
                hs0Var.f(bVar.f277646e);
                dVar.f(hs0Var);
            } else {
                com.tencent.mars.xlog.Log.e("NearConnectionProviderImpl", "createGroupAsync: create group failed");
                com.tencent.wechat.aff.local_connection.e eVar2 = nVar.f310798a;
                if (eVar2 != null) {
                    eVar2.H0(this.f310776f, bVar.f277643b, "", "");
                }
                com.tencent.wechat.aff.local_connection.d dVar2 = com.tencent.wechat.aff.local_connection.d.f217358c;
                bw5.hs0 hs0Var2 = new bw5.hs0();
                hs0Var2.e(is0Var);
                bw5.xf0 xf0Var = bVar.f277643b;
                hs0Var2.b(xf0Var != null ? xf0Var.f35099d : -1);
                hs0Var2.c(bVar.f277644c);
                hs0Var2.d("");
                hs0Var2.f("");
                dVar2.f(hs0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NearConnectionProviderImpl", "createGroupAsync: " + e17);
            com.tencent.wechat.aff.local_connection.e eVar3 = nVar.f310798a;
            if (eVar3 != null) {
                eVar3.H0(this.f310776f, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CREATE_GROUP_ERROR, "", "");
            }
            com.tencent.wechat.aff.local_connection.d dVar3 = com.tencent.wechat.aff.local_connection.d.f217358c;
            bw5.hs0 hs0Var3 = new bw5.hs0();
            hs0Var3.e(is0Var);
            hs0Var3.b(100200);
            hs0Var3.c("create group exception:" + e17.getMessage() + ':' + android.util.Log.getStackTraceString(e17));
            hs0Var3.d("");
            hs0Var3.f("");
            dVar3.f(hs0Var3);
        }
        return jz5.f0.f302826a;
    }
}
