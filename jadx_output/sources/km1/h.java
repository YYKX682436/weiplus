package km1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f309001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f309002f;

    public h(km1.s sVar, android.util.Size size, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f309000d = sVar;
        this.f309001e = size;
        this.f309002f = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer m07;
        km1.s sVar = this.f309000d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = sVar.f309045y;
        int i17 = atomicInteger.get();
        com.tencent.mm.plugin.appbrand.jsruntime.h0 r17 = sVar.r();
        java.lang.Integer valueOf = (r17 == null || (m07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) r17).m0(i17)) == null) ? null : java.lang.Integer.valueOf(m07.capacity());
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int i18 = sVar.f309027d.f252497d;
        android.util.Size size = this.f309001e;
        int width = size.getWidth();
        int height = size.getHeight();
        int i19 = (int) (width * 1.5f * height);
        java.lang.String str = sVar.f309029f;
        com.tencent.mars.xlog.Log.i(str, "doCreateSharedBufferAndNotifyIfNeed, existBufferSize: " + intValue + ", expectBufferSize: " + i19);
        if (i19 != intValue) {
            com.tencent.mm.plugin.appbrand.jsruntime.h0 r18 = sVar.r();
            if (r18 == null) {
                com.tencent.mars.xlog.Log.e(str, "createSharedBufferThenNotify, bufferId is null");
                return;
            }
            int T = ((com.tencent.mm.plugin.appbrand.jsruntime.n) r18).T(i19);
            atomicInteger.set(T);
            com.tencent.mm.plugin.appbrand.page.n7 component = this.f309002f;
            kotlin.jvm.internal.o.g(component, "component");
            km1.c cVar = new km1.c();
            cVar.t(kz5.c1.k(new jz5.l("livePusherId", java.lang.Integer.valueOf(i18)), new jz5.l("bufferId", java.lang.Integer.valueOf(T)), new jz5.l("width", java.lang.Integer.valueOf(width)), new jz5.l("height", java.lang.Integer.valueOf(height))));
            component.i(cVar, null);
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.i(str, "createSharedBufferThenNotify, release the existBuffer");
                com.tencent.mm.plugin.appbrand.jsruntime.h0 r19 = sVar.r();
                if (r19 != null) {
                    ((com.tencent.mm.plugin.appbrand.jsruntime.n) r19).a0(i17);
                }
            }
        }
    }
}
