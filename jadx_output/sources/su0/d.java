package su0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su0.j f412637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yu0.q f412638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f412639f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(su0.j jVar, yu0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f412637d = jVar;
        this.f412638e = qVar;
        this.f412639f = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo mJAsyncSpeechQueryResponseInfo = (com.tencent.maas.speech.MJAsyncSpeechQueryResponseInfo) obj;
        yu0.q qVar = this.f412638e;
        su0.j jVar = this.f412637d;
        if (mJAsyncSpeechQueryResponseInfo != null) {
            java.lang.String str = qVar.f465830a;
            java.nio.ByteBuffer byteBuffer = mJAsyncSpeechQueryResponseInfo.f48539a;
            kotlin.jvm.internal.o.f(byteBuffer, "getData(...)");
            jVar.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            java.lang.String roleID = qVar.f465831b;
            sb6.append(roleID);
            java.lang.String sb7 = sb6.toString();
            jVar.f412661e.put(sb7, byteBuffer);
            kotlin.jvm.internal.o.g(roleID, "roleID");
            r26.n0.B(roleID, "vits", false);
            java.lang.String a17 = uu0.l.a("silk", sb7);
            try {
                kotlin.jvm.internal.o.d(a17);
                ru0.a.e(byteBuffer, a17);
                byteBuffer.rewind();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MJTTSTaskExecutor", "saveSilkBufferToFile: IO failed");
            }
            ((vu0.r) jVar.f412658b).a(qVar.f465834e, qVar.f465830a, qVar.f465831b, qVar.f465832c, byteBuffer);
        } else {
            ((vu0.r) jVar.f412658b).b(qVar.f465834e, qVar.f465831b);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f412639f.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJAsyncSpeechQueryResponseInfo != null)));
        return jz5.f0.f302826a;
    }
}
