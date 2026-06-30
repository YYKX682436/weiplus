package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class su implements com.tencent.mm.plugin.sns.ui.ro {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f170486a;

    public su(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f170486a = snsUserUI;
    }

    public void a() {
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$11");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170486a;
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null && com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).M()) {
            if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).getCount() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.i7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                snsUserUI.h7();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            }
            com.tencent.mm.plugin.sns.ui.SnsUIAction e76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI);
            e76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = e76.f167492p;
            if (snsHeader != null) {
                i17 = snsHeader.getMeasuredHeight();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                i17 = 0;
            }
            int i19 = com.tencent.mm.plugin.sns.model.s5.f164676d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            int i27 = snsUserUI.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            if (i27 == 0) {
                com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).getSnsListView().setSelectionFromTop(com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).getSnsListView().getHeaderViewsCount(), com.tencent.mm.ui.zk.a(snsUserUI.getContext(), 90) + com.tencent.mm.ui.bl.h(snsUserUI.getContext()) + com.tencent.mm.ui.bl.a(snsUserUI.getContext()));
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                int i28 = snsUserUI.F;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                if (i28 == 1 && com.tencent.mm.plugin.sns.model.s5.f164675c != 0) {
                    android.widget.ListView snsListView = com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).getSnsListView();
                    com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                    long j17 = com.tencent.mm.plugin.sns.model.s5.f164675c;
                    T6.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findListPositionBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    int i29 = 0;
                    while (true) {
                        java.util.ArrayList arrayList = (java.util.ArrayList) T6.f405456e;
                        if (i29 >= arrayList.size()) {
                            i29 = 0;
                            break;
                        }
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) arrayList.get(i29);
                        if (snsInfo != null && snsInfo.field_snsId == j17) {
                            break;
                        } else {
                            i29++;
                        }
                    }
                    java.util.Iterator it = ((java.util.HashMap) T6.f405459h).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = 0;
                            break;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        if (((java.lang.Integer) entry.getValue()).intValue() >= i29) {
                            i18 = ((java.lang.Integer) entry.getKey()).intValue();
                            break;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsphotoAdapter", "dataPos:%s, displayPos:%s", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i18));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findListPositionBySnsId", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    snsListView.setSelectionFromTop(i18 + com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).getSnsListView().getHeaderViewsCount(), i17 + com.tencent.mm.plugin.sns.model.s5.f164676d);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            snsUserUI.G = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.model.s5.f164676d = 0;
            com.tencent.mm.plugin.sns.model.s5.f164675c = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.SnsUserUI$11");
    }
}
