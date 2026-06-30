package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f181722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.w1 f181723e;

    public x1(com.tencent.mm.plugin.websearch.w1 w1Var, boolean z17) {
        this.f181723e = w1Var;
        this.f181722d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f181723e.getClass();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "only work in main process");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PluginWebSearch", "checkWebSearchTemplate %b", java.lang.Boolean.valueOf(this.f181722d));
        int[] iArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i17 = 0; i17 < 12; i17++) {
            com.tencent.mm.plugin.websearch.l2.g(iArr[i17]).g();
        }
    }
}
