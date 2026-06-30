package e00;

/* loaded from: classes8.dex */
public final class e implements c00.y2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f245753a = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f245754b = new com.tencent.mm.sdk.platformtools.r2(10);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f245755c = new com.tencent.mm.sdk.platformtools.r2(10);

    public bw5.x7 a(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache of key ".concat(key));
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f245755c;
        e00.b bVar = (e00.b) r2Var.get(key);
        if (bVar == null) {
            return null;
        }
        if ((java.lang.System.currentTimeMillis() / 1000) - bVar.f245739b <= 180) {
            com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache success");
            return bVar.f245738a;
        }
        com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache out of time");
        r2Var.remove(key);
        return null;
    }

    public void b(bw5.x7 x7Var, java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f245755c;
        if (x7Var == null) {
            r2Var.remove(key);
            com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "remove jumpInfo cache for key: ".concat(key));
            return;
        }
        e00.b bVar = new e00.b(x7Var, java.lang.System.currentTimeMillis() / 1000);
        r2Var.put(key, bVar);
        com.tencent.mars.xlog.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "updateJumpInfoCache for key" + key + " when:" + bVar.f245739b);
    }
}
