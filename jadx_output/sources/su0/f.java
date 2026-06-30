package su0;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.j f412644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo f412645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f412646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412647g;

    public f(su0.j jVar, com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, java.lang.Object obj, yz5.l lVar) {
        this.f412644d = jVar;
        this.f412645e = mJAsyncSpeechSubmitResponseInfo;
        this.f412646f = obj;
        this.f412647g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo = this.f412645e;
        java.lang.Object obj = this.f412646f;
        yz5.l lVar = this.f412647g;
        su0.j jVar = this.f412644d;
        java.util.concurrent.locks.ReentrantLock reentrantLock = jVar.f412659c;
        reentrantLock.lock();
        try {
            if (jVar.f412663g.containsKey(obj)) {
                java.lang.String str = mJAsyncSpeechSubmitResponseInfo.f48543a;
                java.nio.ByteBuffer byteBuffer = mJAsyncSpeechSubmitResponseInfo.f48546d;
                com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest = new com.tencent.maas.speech.MJILinkAppRequest();
                java.util.HashSet hashSet = mJILinkAppRequest.f48559h;
                hashSet.add("commandID");
                mJILinkAppRequest.f48552a = 4481;
                hashSet.add("URL");
                mJILinkAppRequest.f48554c = "/ilink/ilinkapp/tts/query_asynctts";
                hashSet.add("timeoutMillis");
                mJILinkAppRequest.f48553b = 10000;
                hashSet.add("retryCount");
                mJILinkAppRequest.f48555d = 0;
                hashSet.add("limitFlow");
                mJILinkAppRequest.f48556e = false;
                hashSet.add("limitFrequency");
                mJILinkAppRequest.f48557f = false;
                com.tencent.maas.speech.a aVar = com.tencent.maas.speech.a.LongLink;
                hashSet.add(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE);
                mJILinkAppRequest.f48558g = aVar;
                pp0.s0 s0Var = jVar.f412657a;
                kotlin.jvm.internal.o.d(str);
                kotlin.jvm.internal.o.d(byteBuffer);
                ((dz0.s2) s0Var).b(str, mJILinkAppRequest, "", byteBuffer, new su0.b(lVar, jVar, mJAsyncSpeechSubmitResponseInfo, obj));
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
