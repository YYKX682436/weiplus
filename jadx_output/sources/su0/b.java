package su0;

/* loaded from: classes5.dex */
public final class b implements com.tencent.maas.speech.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su0.j f412627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo f412628c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f412629d;

    public b(yz5.l lVar, su0.j jVar, com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, java.lang.Object obj) {
        this.f412626a = lVar;
        this.f412627b = jVar;
        this.f412628c = mJAsyncSpeechSubmitResponseInfo;
        this.f412629d = obj;
    }

    @Override // com.tencent.maas.speech.b
    public void a(com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo mJAsyncSpeechQueryResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        java.nio.ByteBuffer byteBuffer;
        if (mJAsyncSpeechQueryResponseInfo != null && (byteBuffer = mJAsyncSpeechQueryResponseInfo.f48539a) != null) {
            byteBuffer.capacity();
        }
        yz5.l lVar = this.f412626a;
        if (mJError != null || mJAsyncSpeechQueryResponseInfo == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: message ");
            sb6.append(mJError != null ? mJError.message : null);
            com.tencent.mars.xlog.Log.e("MJTTSTaskExecutor", sb6.toString());
            lVar.invoke(null);
            return;
        }
        if (mJAsyncSpeechQueryResponseInfo.f48540b) {
            lVar.invoke(mJAsyncSpeechQueryResponseInfo);
        } else {
            this.f412627b.d(this.f412628c, this.f412629d, 1000L, this.f412626a);
        }
    }
}
