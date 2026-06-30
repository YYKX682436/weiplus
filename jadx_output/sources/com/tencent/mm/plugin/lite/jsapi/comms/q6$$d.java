package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public final /* synthetic */ class q6$$d implements com.tencent.mm.plugin.lite.jsapi.comms.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q6 f143747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.BiConsumer f143748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f143749c;

    public /* synthetic */ q6$$d(com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var, java.util.function.BiConsumer biConsumer, java.lang.Runnable runnable) {
        this.f143747a = q6Var;
        this.f143748b = biConsumer;
        this.f143749c = runnable;
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var = this.f143747a;
        java.lang.String C = q6Var.C(q6Var.f143730g, "[uploadImageToCDN] download http picture error");
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, C);
            this.f143749c.run();
        } else {
            this.f143748b.accept(com.tencent.mm.vfs.w6.i(str2, false), bitmap);
        }
    }
}
