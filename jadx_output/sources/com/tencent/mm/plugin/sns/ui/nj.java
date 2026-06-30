package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class nj {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f170014a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f170015b;

    public nj(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f170014a = context;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f170015b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                r45.jj4 jj4Var;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.sns.ui.nj njVar = com.tencent.mm.plugin.sns.ui.nj.this;
                r45.m33 b17 = njVar.b();
                if (((b17 == null || (jj4Var = b17.f380109d) == null) ? null : jj4Var.f377855d) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageTransSheetManager", "changeTransLangListener current item is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsImageTrans_");
                    r45.jj4 jj4Var2 = b17.f380109d;
                    sb6.append(jj4Var2 != null ? jj4Var2.f377855d : null);
                    java.lang.String sb7 = sb6.toString();
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("changeTransLangListener, eventSessionId: ");
                    am.z1 z1Var = event.f54035g;
                    sb8.append(z1Var.f8502a);
                    sb8.append(", currentId: ");
                    sb8.append(sb7);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", sb8.toString());
                    if (!android.text.TextUtils.equals(sb7, z1Var.f8502a)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.SnsImageTransSheetManager", "changeTransLangListener sessionId is no match");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    } else if (com.tencent.mm.sdk.platformtools.f9.ContextTranslate.k(njVar.a(), null)) {
                        java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(b17.f380109d);
                        if (l17 != null) {
                            android.content.Context a17 = njVar.a();
                            com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = a17 instanceof com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI ? (com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI) a17 : null;
                            if (snsBaseGalleryUI != null) {
                                snsBaseGalleryUI.Z6(l17);
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$changeTransLangListener$1");
                return false;
            }
        };
    }

    public final android.content.Context a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        return this.f170014a;
    }

    public final r45.m33 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        android.content.Context context = this.f170014a;
        r45.m33 m33Var = null;
        com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI snsBaseGalleryUI = context instanceof com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI ? (com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI) context : null;
        if (snsBaseGalleryUI != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f166810o;
            if (snsInfoFlip != null) {
                r45.m33 currentFlipItem = snsInfoFlip.getCurrentFlipItem();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                m33Var = currentFlipItem;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentItem", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        return m33Var;
    }
}
