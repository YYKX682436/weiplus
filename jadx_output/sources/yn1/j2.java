package yn1;

/* loaded from: classes11.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f463720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f463721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f463723h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yn1.r2 r2Var, byte[] bArr, int i17, java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f463719d = r2Var;
        this.f463720e = bArr;
        this.f463721f = i17;
        this.f463722g = str;
        this.f463723h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yn1.j2(this.f463719d, this.f463720e, this.f463721f, this.f463722g, this.f463723h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yn1.j2 j2Var = (yn1.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar;
        long j17 = this.f463723h;
        yn1.r2 r2Var = this.f463719d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            byte[] bArr = r2Var.f463812c;
            kotlin.jvm.internal.o.d(bArr);
            byte[] AesGcmEncrypt = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncrypt(bArr, this.f463720e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f29609f;
            l2Var.f29607d = bw5.m2.a(this.f463721f);
            zArr[1] = true;
            l2Var.f29608e = pm0.b0.h(AesGcmEncrypt);
            zArr[2] = true;
            vn1.m a17 = r2Var.a();
            java.lang.String str = this.f463722g;
            byte[] byteArray = l2Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            a17.h(str, byteArray);
            com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] success=true");
            gVar = r2Var.f463810a;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] error", e17);
            com.tencent.wechat.aff.migration.g gVar2 = r2Var.f463810a;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
            gVar2.r(j17, false);
        }
        if (gVar != null) {
            gVar.r(j17, true);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
