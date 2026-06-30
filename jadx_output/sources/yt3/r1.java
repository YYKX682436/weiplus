package yt3;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f465620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f465621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f465623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yt3.b2 f465624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f465625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.graphics.Bitmap bitmap, java.lang.String str, long j17, yt3.b2 b2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f465621e = bitmap;
        this.f465622f = str;
        this.f465623g = j17;
        this.f465624h = b2Var;
        this.f465625i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yt3.r1(this.f465621e, this.f465622f, this.f465623g, this.f465624h, this.f465625i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yt3.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f465620d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photo width: ");
            android.graphics.Bitmap bitmap = this.f465621e;
            sb6.append(bitmap.getWidth());
            sb6.append("  height:");
            sb6.append(bitmap.getHeight());
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", sb6.toString());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.PNG;
            java.lang.String str = this.f465622f;
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, compressFormat, str, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditPhotoPluginLayout", "saveBitmapToImage  cost:" + (android.os.SystemClock.elapsedRealtime() - this.f465623g) + "  path:" + str);
            this.f465624h.f465367s = false;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yt3.q1 q1Var = new yt3.q1(str, this.f465625i, null);
            this.f465620d = 1;
            if (kotlinx.coroutines.l.g(g3Var, q1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
