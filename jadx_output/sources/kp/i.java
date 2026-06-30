package kp;

/* loaded from: classes13.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.n f310756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f310759h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kp.n nVar, java.lang.String str, java.lang.String str2, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f310756e = nVar;
        this.f310757f = str;
        this.f310758g = str2;
        this.f310759h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kp.i(this.f310756e, this.f310757f, this.f310758g, this.f310759h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f310755d;
        bw5.is0 is0Var = bw5.is0.WIFI_DIRECT_OP_TYPE_CONNECT;
        long j17 = this.f310759h;
        java.lang.String str = this.f310758g;
        java.lang.String str2 = this.f310757f;
        kp.n nVar = this.f310756e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gz.m a17 = nVar.a();
                this.f310755d = 1;
                obj = ((kp.i1) a17).Bi(str2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            gz.a aVar2 = (gz.a) obj;
            boolean z17 = aVar2.f277639a;
            java.lang.String str3 = aVar2.f277641c;
            bw5.xf0 xf0Var = aVar2.f277640b;
            if (z17) {
                com.tencent.wechat.aff.local_connection.e eVar = nVar.f310798a;
                if (eVar != null) {
                    eVar.P0(j17, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_SUCCESS);
                }
                com.tencent.wechat.aff.local_connection.d dVar = com.tencent.wechat.aff.local_connection.d.f217358c;
                bw5.hs0 hs0Var = new bw5.hs0();
                hs0Var.e(is0Var);
                hs0Var.b(xf0Var != null ? xf0Var.f35099d : -1);
                hs0Var.c(str3);
                hs0Var.d(str2);
                hs0Var.f(str);
                dVar.f(hs0Var);
            } else {
                com.tencent.wechat.aff.local_connection.e eVar2 = nVar.f310798a;
                if (eVar2 != null) {
                    eVar2.P0(j17, xf0Var);
                }
                com.tencent.wechat.aff.local_connection.d dVar2 = com.tencent.wechat.aff.local_connection.d.f217358c;
                bw5.hs0 hs0Var2 = new bw5.hs0();
                hs0Var2.e(is0Var);
                hs0Var2.b(xf0Var != null ? xf0Var.f35099d : -1);
                hs0Var2.c(str3);
                hs0Var2.d(str2);
                hs0Var2.f(str);
                dVar2.f(hs0Var2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NearConnectionProviderImpl", "connectToGroupAsync: " + e17);
            com.tencent.wechat.aff.local_connection.e eVar3 = nVar.f310798a;
            if (eVar3 != null) {
                eVar3.P0(j17, bw5.xf0.NEAR_CONNECTION_ERROR_CODE_CONNECT_TO_GROUP_ERROR);
            }
            com.tencent.wechat.aff.local_connection.d dVar3 = com.tencent.wechat.aff.local_connection.d.f217358c;
            bw5.hs0 hs0Var3 = new bw5.hs0();
            hs0Var3.e(is0Var);
            hs0Var3.b(100201);
            hs0Var3.c(e17.getMessage());
            hs0Var3.d(str2);
            hs0Var3.f(str);
            dVar3.f(hs0Var3);
        }
        return jz5.f0.f302826a;
    }
}
