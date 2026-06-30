package yx0;

/* loaded from: classes5.dex */
public final class a4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f467129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(yx0.b8 b8Var, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467126d = b8Var;
        this.f467127e = str;
        this.f467128f = str2;
        this.f467129g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.a4(this.f467126d, this.f467127e, this.f467128f, this.f467129g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yx0.a4 a4Var = (yx0.a4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        mx0.e1 e1Var = this.f467126d.X1;
        if (e1Var != null) {
            java.lang.String draftBundleDirPath = this.f467127e;
            java.lang.String videoOutputFilePath = dw3.h.d(dw3.h.f244211a, null, null, 3, null);
            com.tencent.maas.instamovie.MJRecordingSettings s17 = this.f467126d.s();
            com.tencent.maas.camerafun.MJAuditCaptureSettings a17 = ts2.a.a(ts2.a.f421620a, this.f467128f, false, 2, null);
            yz5.l callback = this.f467129g;
            kotlin.jvm.internal.o.g(draftBundleDirPath, "draftBundleDirPath");
            kotlin.jvm.internal.o.g(videoOutputFilePath, "videoOutputFilePath");
            kotlin.jvm.internal.o.g(callback, "callback");
            if (e1Var.f331935b != mx0.d0.f331893d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", "openAsyncAIGCDraft: importPreviewState " + e1Var.f331935b);
                callback.invoke(java.lang.Boolean.FALSE);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "openAsyncAIGCDraft: importPreviewState " + e1Var.f331935b);
                e1Var.f(mx0.d0.f331902p);
                kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.t0(e1Var, callback, draftBundleDirPath, videoOutputFilePath, s17, a17, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
