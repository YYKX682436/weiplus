package xg1;

/* loaded from: classes7.dex */
public final class f extends bj1.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0 f454369e;

    public f(com.tencent.mm.plugin.appbrand.loading.AppBrandProcessTriggerService0 appBrandProcessTriggerService0) {
        this.f454369e = appBrandProcessTriggerService0;
    }

    @Override // bj1.c
    public int c4(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 != 2) {
            return -1;
        }
        new com.tencent.mm.plugin.appbrand.task.preload.t();
        com.tencent.mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver.a("PreloadIPCTaskImpl", this.f454369e.getIntent());
        return 1;
    }
}
