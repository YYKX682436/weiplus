package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.s f189432d = new com.tencent.mm.pluginsdk.model.s();

    @Override // java.lang.Runnable
    public final void run() {
        for (java.util.Map.Entry entry : com.tencent.mm.pluginsdk.model.b0.f189203g.entrySet()) {
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            java.lang.String bizUserName = (java.lang.String) entry.getKey();
            java.lang.String finderFeedExportId = (java.lang.String) entry.getValue();
            kotlin.jvm.internal.o.g(bizUserName, "bizUserName");
            kotlin.jvm.internal.o.g(finderFeedExportId, "finderFeedExportId");
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 86400000);
            if (!b0Var.n(bizUserName, finderFeedExportId)) {
                com.tencent.mm.sdk.platformtools.v3 v3Var = com.tencent.mm.pluginsdk.model.b0.f189199c;
                int o17 = v3Var.o("date-" + currentTimeMillis + "-expose-live-bar-" + bizUserName, 0) + 1;
                ((com.tencent.mm.sdk.platformtools.o4) v3Var.i()).A("date-" + currentTimeMillis + "-expose-live-bar-" + bizUserName, o17);
            }
            ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.pluginsdk.model.b0.f189199c.i()).D("live_bar_expose-exportId-" + ((java.lang.String) entry.getKey()), (java.lang.String) entry.getValue());
        }
        com.tencent.mm.pluginsdk.model.b0.f189203g.clear();
    }
}
