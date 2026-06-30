package su0;

/* loaded from: classes5.dex */
public final class t implements com.tencent.maas.speech.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f412697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412698c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f412699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f412700e;

    public t(yz5.l lVar, su0.a0 a0Var, java.lang.String str, long j17, float f17) {
        this.f412696a = lVar;
        this.f412697b = a0Var;
        this.f412698c = str;
        this.f412699d = j17;
        this.f412700e = f17;
    }

    @Override // com.tencent.maas.speech.b
    public void a(com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo mJAsyncSpeechQueryResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.Object m521constructorimpl;
        yz5.l lVar = this.f412696a;
        if (mJError != null || mJAsyncSpeechQueryResponseInfo == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: message ");
            sb6.append(mJError != null ? mJError.message : null);
            com.tencent.mars.xlog.Log.e("VideoSubtitleTaskExecutor", sb6.toString());
            lVar.invoke(null);
            return;
        }
        boolean z17 = mJAsyncSpeechQueryResponseInfo.f48540b;
        su0.a0 a0Var = this.f412697b;
        if (!z17) {
            java.lang.String str = this.f412698c;
            long j17 = this.f412699d;
            float f17 = this.f412700e;
            java.nio.ByteBuffer byteBuffer = mJAsyncSpeechQueryResponseInfo.f48542d;
            kotlin.jvm.internal.o.f(byteBuffer, "getContextBuff(...)");
            a0Var.f412625d.postDelayed(new su0.x(a0Var, str, j17, f17, byteBuffer, this.f412696a), mJAsyncSpeechQueryResponseInfo.f48541c);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: responseInfo timeOffsetMs ");
        long j18 = this.f412699d;
        sb7.append(j18);
        sb7.append(" speed ");
        float f18 = this.f412700e;
        sb7.append(f18);
        com.tencent.mars.xlog.Log.i("VideoSubtitleTaskExecutor", sb7.toString());
        a0Var.getClass();
        x36.o oVar = x36.o.f451695g;
        java.nio.ByteBuffer byteBuffer2 = mJAsyncSpeechQueryResponseInfo.f48539a;
        kotlin.jvm.internal.o.f(byteBuffer2, "getData(...)");
        byte[] bArr = new byte[byteBuffer2.remaining()];
        byteBuffer2.get(bArr);
        x36.o oVar2 = new x36.o(bArr);
        java.nio.charset.Charset charset = r26.c.f368865a;
        kotlin.jvm.internal.o.g(charset, "charset");
        java.lang.String str2 = new java.lang.String(oVar2.f451699f, charset);
        if (str2.length() == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("data.isEmpty() ")));
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                if (jSONObject.optInt("ret", -1) != 0) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException(" ret != 0 ")));
                } else {
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.tinker.loader.shareutil.ShareConstants.RES_PATH);
                    if (optJSONObject == null) {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException(" res == null ")));
                    } else {
                        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("sentences");
                        if (optJSONArray == null) {
                            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException(" sentences == null ")));
                        } else {
                            r45.ne4 ne4Var = new r45.ne4();
                            java.util.LinkedList linkedList = ne4Var.f381311e;
                            jz5.g gVar = ru0.m.f399689a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            c75.c.d(optJSONArray, new ru0.l(j18, f18, arrayList));
                            linkedList.addAll(arrayList);
                            ne4Var.f381310d = optJSONObject.optLong("voice_len_ms", 0L);
                            m521constructorimpl = kotlin.Result.m521constructorimpl(ne4Var);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17));
            }
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("VideoSubtitleTaskExecutor", "onComplete: " + m524exceptionOrNullimpl.getMessage(), m524exceptionOrNullimpl);
            lVar.invoke(null);
        }
        if (kotlin.Result.m528isSuccessimpl(m521constructorimpl)) {
            lVar.invoke((r45.ne4) m521constructorimpl);
        }
    }
}
