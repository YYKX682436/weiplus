package vp4;

/* loaded from: classes10.dex */
public final class b0 extends m55.b {

    /* renamed from: b, reason: collision with root package name */
    public final st3.r f439002b;

    /* renamed from: c, reason: collision with root package name */
    public final ct0.b f439003c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f439004d;

    /* renamed from: e, reason: collision with root package name */
    public rp4.a f439005e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f439006f;

    /* renamed from: g, reason: collision with root package name */
    public final ru3.f f439007g;

    /* renamed from: h, reason: collision with root package name */
    public final rp4.x f439008h;

    /* renamed from: i, reason: collision with root package name */
    public final st3.s f439009i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.p f439010j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f439011k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.n f439012l;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.q f439013m;

    public b0(st3.r encode, ct0.b bVar, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, rp4.a aVar, android.content.Context context, ru3.f fVar, rp4.x xVar, st3.s editConfig, yz5.p pVar, java.lang.String taskId) {
        kotlin.jvm.internal.o.g(encode, "encode");
        kotlin.jvm.internal.o.g(editConfig, "editConfig");
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f439002b = encode;
        this.f439003c = bVar;
        this.f439004d = recordConfigProvider;
        this.f439005e = aVar;
        this.f439006f = context;
        this.f439007g = fVar;
        this.f439008h = xVar;
        this.f439009i = editConfig;
        this.f439010j = pVar;
        this.f439011k = taskId;
    }

    @Override // m55.b
    public boolean b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancel ");
        com.tencent.mm.plugin.vlog.model.n nVar = this.f439012l;
        sb6.append(nVar != null ? nVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", sb6.toString());
        com.tencent.mm.plugin.vlog.model.n nVar2 = this.f439012l;
        if (nVar2 != null) {
            com.tencent.mm.plugin.vlog.model.f0.b(nVar2, null, 1, null);
        }
        kotlinx.coroutines.q qVar = this.f439013m;
        if (qVar != null) {
            kotlinx.coroutines.p.a(qVar, null, 1, null);
        }
        return true;
    }

    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new vp4.a0(this, dVar, null), continuation);
    }
}
