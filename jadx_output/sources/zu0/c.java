package zu0;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f475666e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zu0.c cVar = new zu0.c(this.f475666e, continuation);
        cVar.f475665d = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zu0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f475666e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(str);
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf((exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH) == null || exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER) == null) ? false : true));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return kotlin.Result.m527isFailureimpl(m521constructorimpl) ? java.lang.Boolean.FALSE : m521constructorimpl;
    }
}
