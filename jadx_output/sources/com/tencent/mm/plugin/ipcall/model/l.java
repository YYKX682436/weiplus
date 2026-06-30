package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes14.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.ipcall.model.l f142478c;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f142479a = null;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142480b;

    public l() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f142480b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallFeedbackConfigUpdater$1
            {
                this.__eventId = 905296653;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
                com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent2 = checkResUpdateCacheFileEvent;
                if (checkResUpdateCacheFileEvent2.f54053g.f7759a == 39) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener callback");
                    byte[] N = com.tencent.mm.vfs.w6.N(checkResUpdateCacheFileEvent2.f54053g.f7761c, 0, -1);
                    if (N != null) {
                        com.tencent.mm.plugin.ipcall.model.l.this.a(N);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "checkResUpdateListener file not exist");
                    }
                }
                return false;
            }
        };
    }

    public boolean a(byte[] bArr) {
        try {
            try {
                java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(new java.lang.String(bArr), "feedbackconfig", null);
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse xml feedbackconfig error");
                    return false;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i17 = 0;
                while (true) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".feedbackconfig.resourceslist.resources");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    java.lang.String str = (java.lang.String) d17.get(sb7 + ".$langid");
                    if (str == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallFeedbackConfigUpdater", "feedbackResource parse finished count:%d", java.lang.Integer.valueOf(arrayList.size()));
                        this.f142479a = arrayList;
                        return true;
                    }
                    i17++;
                    s83.f fVar = new s83.f();
                    fVar.f404875a = str;
                    fVar.f404876b = new java.util.ArrayList();
                    java.lang.String str2 = sb7 + ".string";
                    int i18 = 0;
                    while (true) {
                        s83.e eVar = new s83.e();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                        sb8.append(str2);
                        sb8.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                        java.lang.String sb9 = sb8.toString();
                        java.lang.String str3 = (java.lang.String) d17.get(sb9);
                        if (str3 == null) {
                            break;
                        }
                        java.lang.String str4 = (java.lang.String) d17.get(sb9 + ".$id");
                        if (str4 == null) {
                            break;
                        }
                        i18++;
                        eVar.f404873a = str4;
                        eVar.f404874b = str3;
                        fVar.f404876b.add(eVar);
                    }
                    fVar.f404876b.size();
                    arrayList.add(fVar);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config error: %s", e17.getMessage());
                return false;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallFeedbackConfigUpdater", e18, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallFeedbackConfigUpdater", "parse ipcall feedback config new string error: %s", e18.getMessage());
            return false;
        }
    }
}
