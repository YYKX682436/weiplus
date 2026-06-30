package rc3;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f394034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394037h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f394038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rc3.w0 w0Var, int i17, int i18, int i19, int i27, int i28) {
        super(0);
        this.f394033d = w0Var;
        this.f394034e = i17;
        this.f394035f = i18;
        this.f394036g = i19;
        this.f394037h = i27;
        this.f394038i = i28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f394033d.f394105z, "canvas view create " + this.f394034e + ' ' + this.f394035f + ' ' + this.f394036g + ' ' + this.f394037h + ' ' + this.f394038i);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f394033d.f394091i;
        jc3.r rVar = mBBuildConfig != null ? mBBuildConfig.f147829s : null;
        jc3.p pVar = mBBuildConfig != null ? mBBuildConfig.f147830t : null;
        if (rVar != null) {
            cf3.d dVar = new cf3.d(rVar);
            this.f394033d.f394096q.put(java.lang.Integer.valueOf(this.f394034e), dVar);
            rc3.w0 eventConsumer = this.f394033d;
            int i17 = this.f394034e;
            kotlin.jvm.internal.o.g(eventConsumer, "eventConsumer");
            dVar.f40926k = eventConsumer;
            dVar.f40925j = i17;
            dVar.f40917b.post(new cf3.c(dVar, i17));
        } else if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewCreated canvasId: " + this.f394034e + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            int i18 = this.f394034e;
            rc3.w0 consumer = this.f394033d;
            fh1.r0 r0Var = (fh1.r0) pVar;
            kotlin.jvm.internal.o.g(consumer, "consumer");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclMBFrameBiz", "setCanvasEventConsumer canvasId:" + i18 + " consumer:" + consumer);
            synchronized (r0Var) {
                fh1.x0.P = consumer;
            }
            fh1.x0.I.a();
        } else {
            com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub mBSurfaceStub = new com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub(this.f394033d.f394086d, null);
            this.f394033d.f394095p.put(java.lang.Integer.valueOf(this.f394034e), mBSurfaceStub);
            rc3.w0 eventConsumer2 = this.f394033d;
            int i19 = this.f394034e;
            kotlin.jvm.internal.o.g(eventConsumer2, "eventConsumer");
            mBSurfaceStub.f148189i = eventConsumer2;
            mBSurfaceStub.f148187g = i19;
            rc3.w0 w0Var = this.f394033d;
            w0Var.S(new rc3.m(w0Var, this.f394034e, mBSurfaceStub));
        }
        return jz5.f0.f302826a;
    }
}
