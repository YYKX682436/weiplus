package yn1;

/* loaded from: classes11.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f463846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f463849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yn1.a4 a4Var, byte[] bArr, int i17, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463845d = a4Var;
        this.f463846e = bArr;
        this.f463847f = i17;
        this.f463848g = str;
        this.f463849h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.t3(this.f463845d, this.f463846e, this.f463847f, this.f463848g, this.f463849h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.t3 t3Var = (yn1.t3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17 = this.f463849h;
        yn1.a4 a4Var = this.f463845d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            byte[] bArr = a4Var.f463610e;
            kotlin.jvm.internal.o.d(bArr);
            byte[] AesGcmEncrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncrypt(bArr, this.f463846e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f29609f;
            l2Var.f29607d = bw5.m2.a(this.f463847f);
            zArr[1] = true;
            l2Var.f29608e = pm0.b0.h(AesGcmEncrypt);
            zArr[2] = true;
            vn1.m b17 = a4Var.b();
            java.lang.String str = this.f463848g;
            byte[] byteArray = l2Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            b17.h(str, byteArray);
            com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[sendBLEMessageAsync] success=true");
            com.tencent.wechat.aff.migration.a aVar2 = a4Var.f463609d;
            if (aVar2 != null) {
                aVar2.r(j17, true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(a4Var.f463606a, "[sendBLEMessageAsync] error", e17);
            com.tencent.wechat.aff.migration.a aVar3 = a4Var.f463609d;
            if (aVar3 != null) {
                aVar3.r(j17, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
