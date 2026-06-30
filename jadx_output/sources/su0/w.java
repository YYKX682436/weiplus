package su0;

/* loaded from: classes5.dex */
public final class w implements com.tencent.maas.speech.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412708a;

    public w(yz5.l lVar) {
        this.f412708a = lVar;
    }

    @Override // com.tencent.maas.speech.c
    public void a(com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        yz5.l lVar = this.f412708a;
        if (mJError != null || mJAsyncSpeechSubmitResponseInfo == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onComplete: message ");
            sb6.append(mJError != null ? mJError.message : null);
            com.tencent.mars.xlog.Log.e("VideoSubtitleTaskExecutor", sb6.toString());
            lVar.invoke(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("VideoSubtitleTaskExecutor", "submitAsyncSpeechRequest onComplete: responseInfo taskID " + mJAsyncSpeechSubmitResponseInfo.f48544b + " submitTaskID " + mJAsyncSpeechSubmitResponseInfo.f48543a);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("submitAsyncSpeechRequest onComplete: responseInfo queryIntervalMillis ");
        sb7.append(mJAsyncSpeechSubmitResponseInfo.f48545c);
        com.tencent.mars.xlog.Log.i("VideoSubtitleTaskExecutor", sb7.toString());
        lVar.invoke(mJAsyncSpeechSubmitResponseInfo);
    }
}
