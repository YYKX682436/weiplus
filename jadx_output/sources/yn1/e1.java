package yn1;

/* loaded from: classes11.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f463647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463648f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463649g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yn1.r2 r2Var, byte[] bArr, int i17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463646d = r2Var;
        this.f463647e = bArr;
        this.f463648f = i17;
        this.f463649g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.e1(this.f463646d, this.f463647e, this.f463648f, this.f463649g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.e1 e1Var = (yn1.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        boolean b17;
        com.tencent.wechat.aff.migration.g gVar;
        long j17 = this.f463649g;
        yn1.r2 r2Var = this.f463646d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            byte[] bArr = r2Var.f463812c;
            kotlin.jvm.internal.o.d(bArr);
            byte[] AesGcmEncrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncrypt(bArr, this.f463647e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f29609f;
            l2Var.f29607d = bw5.m2.a(this.f463648f);
            z17 = true;
            zArr[1] = true;
            l2Var.f29608e = pm0.b0.h(AesGcmEncrypt);
            zArr[2] = true;
            vn1.m a17 = r2Var.a();
            byte[] byteArray = l2Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            b17 = a17.b(byteArray);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendBLEMessageAsync] success=");
            sb6.append(b17);
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
            gVar = r2Var.f463810a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar2.G(j17, false);
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        if (!b17) {
            z17 = false;
        }
        gVar.G(j17, z17);
        return jz5.f0.f302826a;
    }
}
