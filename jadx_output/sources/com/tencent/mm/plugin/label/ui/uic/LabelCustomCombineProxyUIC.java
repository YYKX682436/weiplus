package com.tencent.mm.plugin.label.ui.uic;

/* loaded from: classes16.dex */
public final class LabelCustomCombineProxyUIC extends wm3.a {
    public final java.util.ArrayList A6;
    public final com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC$labelListChangeByOutsideListener$1 B6;

    /* renamed from: z6, reason: collision with root package name */
    public boolean f143400z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC$labelListChangeByOutsideListener$1] */
    public LabelCustomCombineProxyUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.A6 = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.B6 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SelectLabelIdListToInsideEvent>(a0Var) { // from class: com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC$labelListChangeByOutsideListener$1
            {
                this.__eventId = -631294366;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SelectLabelIdListToInsideEvent selectLabelIdListToInsideEvent) {
                com.tencent.mm.autogen.events.SelectLabelIdListToInsideEvent event = selectLabelIdListToInsideEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.util.ArrayList arrayList = event.f54747m.f277771a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("labelListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                sb6.append(" currentSelectList: ");
                com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC labelCustomCombineProxyUIC = com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC.this;
                sb6.append(labelCustomCombineProxyUIC.A6.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.LabelCustomCombineProxyUIC", sb6.toString());
                if (arrayList != null) {
                    java.util.Iterator it = labelCustomCombineProxyUIC.A6.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (!arrayList.contains(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LabelCustomCombineProxyUIC", "labelListChangeByInsideListener: updateToUnSelect: " + str);
                            androidx.appcompat.app.AppCompatActivity appCompatActivity = activity;
                            com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = appCompatActivity instanceof com.tencent.mm.plugin.label.ui.ContactLabelSelectUI ? (com.tencent.mm.plugin.label.ui.ContactLabelSelectUI) appCompatActivity : null;
                            if (contactLabelSelectUI != null) {
                                contactLabelSelectUI.c(str, true, false);
                            }
                        }
                    }
                }
                return true;
            }
        };
    }

    public final void a(java.util.List labelIdList) {
        kotlin.jvm.internal.o.g(labelIdList, "labelIdList");
        if (this.f143400z6) {
            java.util.ArrayList arrayList = this.A6;
            arrayList.clear();
            arrayList.addAll(labelIdList);
            com.tencent.mm.autogen.events.SelectLabelIdListToOutsideEvent selectLabelIdListToOutsideEvent = new com.tencent.mm.autogen.events.SelectLabelIdListToOutsideEvent();
            selectLabelIdListToOutsideEvent.f54748m.f277772a = new java.util.ArrayList(labelIdList);
            selectLabelIdListToOutsideEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("from_combine_multi_tab", false);
        this.f143400z6 = booleanExtra;
        if (booleanExtra) {
            alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f143400z6) {
            dead();
        }
    }
}
