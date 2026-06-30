package hz3;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f286330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.graphics.Bitmap bitmap, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286330d = bitmap;
        this.f286331e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hz3.h(this.f286330d, this.f286331e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            z17 = com.tencent.mm.sdk.platformtools.x.D0(this.f286330d, 100, android.graphics.Bitmap.CompressFormat.JPEG, this.f286331e, true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AIScanImageCdnUploadUtil", "save bitmap to image fail:" + th6.getLocalizedMessage());
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
