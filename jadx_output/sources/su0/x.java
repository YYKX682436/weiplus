package su0;

/* loaded from: classes5.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f412709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f412711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f412712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f412713h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412714i;

    public x(su0.a0 a0Var, java.lang.String str, long j17, float f17, java.nio.ByteBuffer byteBuffer, yz5.l lVar) {
        this.f412709d = a0Var;
        this.f412710e = str;
        this.f412711f = j17;
        this.f412712g = f17;
        this.f412713h = byteBuffer;
        this.f412714i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        su0.a0 a0Var = this.f412709d;
        java.lang.String submitTaskID = this.f412710e;
        long j17 = this.f412711f;
        float f17 = this.f412712g;
        java.nio.ByteBuffer contextBuff = this.f412713h;
        yz5.l lVar = this.f412714i;
        a0Var.getClass();
        com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest = new com.tencent.maas.speech.MJILinkAppRequest();
        mJILinkAppRequest.f48559h.add("commandID");
        mJILinkAppRequest.f48552a = 4502;
        mJILinkAppRequest.f48559h.add("URL");
        mJILinkAppRequest.f48554c = "/ilink/ilinkapp/maas/materials/list";
        mJILinkAppRequest.f48559h.add("timeoutMillis");
        mJILinkAppRequest.f48553b = 10000;
        mJILinkAppRequest.f48559h.add("retryCount");
        mJILinkAppRequest.f48555d = 0;
        mJILinkAppRequest.f48559h.add("limitFlow");
        mJILinkAppRequest.f48556e = false;
        mJILinkAppRequest.f48559h.add("limitFrequency");
        mJILinkAppRequest.f48557f = false;
        com.tencent.maas.speech.a aVar = com.tencent.maas.speech.a.LongLink;
        mJILinkAppRequest.f48559h.add(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE);
        mJILinkAppRequest.f48558g = aVar;
        pp0.s0 s0Var = a0Var.f412622a;
        su0.t tVar = new su0.t(lVar, a0Var, submitTaskID, j17, f17);
        dz0.s2 s2Var = (dz0.s2) s0Var;
        s2Var.getClass();
        kotlin.jvm.internal.o.g(submitTaskID, "submitTaskID");
        kotlin.jvm.internal.o.g(contextBuff, "contextBuff");
        synchronized (s2Var) {
            if (s2Var.f245006b) {
                return;
            }
            s2Var.f245005a.c(submitTaskID, mJILinkAppRequest, "queryasyncvrlftransv2", contextBuff, tVar);
        }
    }
}
