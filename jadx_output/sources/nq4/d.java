package nq4;

/* loaded from: classes14.dex */
public final class d extends android.speech.tts.UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nq4.a f339007b;

    public d(java.lang.String str, nq4.a aVar) {
        this.f339006a = str;
        this.f339007b = aVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onDone(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "start tts player");
        nq4.e eVar = nq4.e.f339008a;
        yx3.e0 e0Var = new yx3.e0();
        nq4.e.f339013f = e0Var;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        nq4.a aVar = this.f339007b;
        java.lang.String str2 = this.f339006a;
        e0Var.a(context, str2, 0, new nq4.c(aVar, str2));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onError(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCallingTTSUtil", "UtteranceProgressListener: onError");
        nq4.f fVar = nq4.f.f339014a;
        nq4.f.f339019f = false;
        nq4.a aVar = this.f339007b;
        if (aVar != null) {
            aVar.onDone();
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public void onStart(java.lang.String str) {
    }
}
