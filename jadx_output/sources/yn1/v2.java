package yn1;

/* loaded from: classes11.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f463882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f463884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(yn1.a4 a4Var, byte[] bArr, int i17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463881d = a4Var;
        this.f463882e = bArr;
        this.f463883f = i17;
        this.f463884g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.v2(this.f463881d, this.f463882e, this.f463883f, this.f463884g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.v2 v2Var = (yn1.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17 = this.f463884g;
        yn1.a4 a4Var = this.f463881d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            byte[] bArr = a4Var.f463610e;
            kotlin.jvm.internal.o.d(bArr);
            byte[] AesGcmEncrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncrypt(bArr, this.f463882e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f29609f;
            l2Var.f29607d = bw5.m2.a(this.f463883f);
            boolean z17 = true;
            zArr[1] = true;
            l2Var.f29608e = pm0.b0.h(AesGcmEncrypt);
            zArr[2] = true;
            vn1.m b17 = a4Var.b();
            byte[] byteArray = l2Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            boolean b18 = b17.b(byteArray);
            java.lang.String str = a4Var.f463606a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendBLEMessageAsync] success=");
            sb6.append(b18);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                if (!b18) {
                    z17 = false;
                }
                aVar2.G(j17, z17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(a4Var.f463606a, "[sendBLEMessageAsync] error", e17);
            com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
            if (aVar3 != null) {
                aVar3.G(j17, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
