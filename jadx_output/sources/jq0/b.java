package jq0;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public hq0.b0 f301046a;

    public b(jq0.c viewConfig) {
        hq0.b0 b0Var;
        kotlin.jvm.internal.o.g(viewConfig, "viewConfig");
        iq0.g gVar = new iq0.g(viewConfig.f301047a, new jq0.a(), new iq0.e(viewConfig.f301052f, null, 0, 0, 14, null), viewConfig.f301048b, viewConfig.f301053g, null, 0.0d, 0L, 224, null);
        synchronized (((nq0.i) ((hq0.g) i95.n0.c(hq0.g.class)))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardBizFactoryFeatureService", "createBiz");
            b0Var = new hq0.b0(gVar);
        }
        this.f301046a = b0Var;
        jc3.i0.p0(b0Var, null, 1, null);
        hq0.b0 b0Var2 = this.f301046a;
        if (b0Var2 != null) {
            b0Var2.N1(null, viewConfig.f301051e, viewConfig.f301049c, viewConfig.f301050d, 0, null);
        }
    }
}
