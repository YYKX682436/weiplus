package w71;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.fs0 f443440a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f443441b;

    /* renamed from: c, reason: collision with root package name */
    public final long f443442c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f443443d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f443444e;

    /* renamed from: f, reason: collision with root package name */
    public final w71.x f443445f;

    /* renamed from: g, reason: collision with root package name */
    public w71.n f443446g;

    /* renamed from: h, reason: collision with root package name */
    public final w71.q f443447h;

    public s(bw5.z request, bw5.fs0 webSearchRequest, java.lang.String requestId) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(webSearchRequest, "webSearchRequest");
        kotlin.jvm.internal.o.g(requestId, "requestId");
        this.f443440a = webSearchRequest;
        this.f443441b = requestId;
        this.f443443d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f443444e = new java.util.concurrent.atomic.AtomicBoolean(false);
        w71.x xVar = new w71.x(this);
        this.f443445f = xVar;
        this.f443447h = new w71.q(this);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        if (request.f35751o > 0) {
            lVar.f70664a = new w71.o1(request.getData_().g(), request.b().f34882d, request.f35751o);
        } else {
            lVar.f70664a = new w71.c1(request.getData_().g(), request.b().f34882d);
        }
        lVar.f70665b = new qk.t9();
        lVar.f70667d = request.b().f34882d;
        bw5.x b17 = request.b();
        lVar.f70666c = b17.f34884f[2] ? b17.f34883e : "";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = request.f35744e;
        lVar.f70674k = request.f35745f;
        int i17 = request.f35749m;
        if (i17 > 0) {
            lVar.f70672i = i17;
        }
        xVar.f443463g = lVar.a();
        this.f443442c = request.f35750n;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bb A[Catch: all -> 0x02d1, TryCatch #0 {all -> 0x02d1, blocks: (B:13:0x00bc, B:15:0x00e5, B:17:0x00f3, B:19:0x00fa, B:20:0x00fe, B:22:0x0102, B:25:0x010b, B:26:0x0150, B:27:0x0115, B:30:0x011f, B:31:0x012a, B:34:0x0133, B:35:0x013d, B:38:0x0146, B:41:0x0157, B:43:0x015f, B:44:0x0163, B:47:0x0168, B:48:0x0169, B:50:0x016f, B:54:0x0194, B:56:0x01a3, B:58:0x01aa, B:65:0x01bb, B:66:0x01c4, B:68:0x01e3, B:69:0x01ec, B:72:0x020b, B:75:0x0219, B:77:0x022a, B:78:0x022f, B:88:0x02cf, B:89:0x02d0, B:46:0x0164), top: B:12:0x00bc, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c4 A[Catch: all -> 0x02d1, TryCatch #0 {all -> 0x02d1, blocks: (B:13:0x00bc, B:15:0x00e5, B:17:0x00f3, B:19:0x00fa, B:20:0x00fe, B:22:0x0102, B:25:0x010b, B:26:0x0150, B:27:0x0115, B:30:0x011f, B:31:0x012a, B:34:0x0133, B:35:0x013d, B:38:0x0146, B:41:0x0157, B:43:0x015f, B:44:0x0163, B:47:0x0168, B:48:0x0169, B:50:0x016f, B:54:0x0194, B:56:0x01a3, B:58:0x01aa, B:65:0x01bb, B:66:0x01c4, B:68:0x01e3, B:69:0x01ec, B:72:0x020b, B:75:0x0219, B:77:0x022a, B:78:0x022f, B:88:0x02cf, B:89:0x02d0, B:46:0x0164), top: B:12:0x00bc, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r21, int r22, java.lang.String r23, com.tencent.mm.protobuf.f r24) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w71.s.a(int, int, java.lang.String, com.tencent.mm.protobuf.f):void");
    }
}
