package mx0;

/* loaded from: classes5.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.base.asset.MJAssetInfo f332144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJRecordingSettings f332146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.camerafun.MJAuditCaptureSettings f332147i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f332148m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(mx0.e1 e1Var, com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo, java.lang.String str, com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332143e = e1Var;
        this.f332144f = mJAssetInfo;
        this.f332145g = str;
        this.f332146h = mJRecordingSettings;
        this.f332147i = mJAuditCaptureSettings;
        this.f332148m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.m0(this.f332143e, this.f332144f, this.f332145g, this.f332146h, this.f332147i, this.f332148m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332142d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mx0.e1 e1Var = this.f332143e;
            com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo = this.f332144f;
            java.lang.String str = this.f332145g;
            com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings = this.f332146h;
            com.tencent.maas.camerafun.MJAuditCaptureSettings mJAuditCaptureSettings = this.f332147i;
            this.f332142d = 1;
            obj = mx0.e1.a(e1Var, mJAssetInfo, str, mJRecordingSettings, mJAuditCaptureSettings, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f332143e.f(booleanValue ? mx0.d0.f331895f : mx0.d0.f331893d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "enterImportPreview: after beginUseAssetInput importPreviewState = " + this.f332143e.f331935b);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.l0 l0Var = new mx0.l0(this.f332143e, this.f332146h, booleanValue, this.f332148m, null);
        this.f332142d = 2;
        if (kotlinx.coroutines.l.g(g3Var, l0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
