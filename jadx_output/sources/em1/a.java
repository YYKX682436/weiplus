package em1;

/* loaded from: classes7.dex */
public class a extends em1.d {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ em1.b f255012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(em1.b bVar, cl.m3 m3Var) {
        super(m3Var);
        this.f255012j = bVar;
    }

    @Override // em1.d, cl.l3
    public void e(int i17, final cl.q0 q0Var) {
        em1.b bVar = this.f255012j;
        if ((bVar.f92381a.getRuntime() instanceof ze.n) && ((ze.n) bVar.f92381a.getRuntime()).b2()) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d", bVar.f92381a.getAppId(), java.lang.Integer.valueOf(i17));
            q0Var.d("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__ || new Function(\"return this\")().__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new cl.j1() { // from class: em1.a$$a
                @Override // cl.j1
                public final void a(java.lang.String str, cl.k1 k1Var) {
                    com.tencent.mm.plugin.appbrand.jsapi.x1.a(em1.a.this.f255012j.f92381a, q0Var, str);
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(3L, java.util.concurrent.TimeUnit.SECONDS);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d latch await failed:%s", bVar.f92381a.getAppId(), java.lang.Integer.valueOf(i17), e17);
            } finally {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWorkerContainerLU", "post report coverage task for appId:%s workerId:%d latch await end", bVar.f92381a.getAppId(), java.lang.Integer.valueOf(i17));
            }
        }
        super.e(i17, q0Var);
    }
}
