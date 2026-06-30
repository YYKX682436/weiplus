package zu0;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f475668e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zu0.d dVar = new zu0.d(this.f475668e, continuation);
        dVar.f475667d = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zu0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
        java.lang.String str = this.f475668e;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            mediaMetadataRetriever.setDataSource(str);
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mediaMetadataRetriever.extractMetadata(23) != null));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = bool;
        }
        boolean booleanValue = ((java.lang.Boolean) m521constructorimpl).booleanValue();
        try {
            mediaMetadataRetriever.release();
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}
