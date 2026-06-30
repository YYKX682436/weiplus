package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qo implements com.tencent.mm.plugin.sns.ui.uo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ro f170351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.so f170352b;

    public qo(com.tencent.mm.plugin.sns.ui.so soVar, com.tencent.mm.plugin.sns.ui.ro roVar) {
        this.f170352b = soVar;
        this.f170351a = roVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170352b;
        if (com.tencent.mm.plugin.sns.ui.so.J(soVar) != null) {
            com.tencent.mm.plugin.sns.ui.so.J(soVar).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void b(java.util.List list, java.util.Map map, java.util.Map map2, java.util.Map map3, int i17, int i18) {
        java.util.List list2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170352b;
        if (com.tencent.mm.plugin.sns.ui.so.H(soVar)) {
            this.f170352b.R(list, map, map2, map3, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            soVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (soVar.f405462n && (list2 = soVar.f405456e) != null && com.tencent.mm.plugin.sns.model.s5.f164675c != 0) {
                int i19 = 0;
                while (true) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) list2;
                    if (i19 >= arrayList.size()) {
                        break;
                    }
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) arrayList.get(i19);
                    if (snsInfo.field_snsId != com.tencent.mm.plugin.sns.model.s5.f164675c) {
                        i19++;
                    } else if (i19 > 0) {
                        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) arrayList.get(i19 - 1);
                        int head = snsInfo.getHead();
                        int head2 = snsInfo2.getHead();
                        android.app.Activity activity = soVar.f405455d;
                        if (head == head2) {
                            com.tencent.mm.plugin.sns.model.s5.f164676d += com.tencent.mm.ui.zk.a(activity, 27);
                        } else {
                            int i27 = head / 10000;
                            if (com.tencent.mm.plugin.sns.ui.os.f() != i27 && i27 != head2 / 10000) {
                                com.tencent.mm.plugin.sns.model.s5.f164676d += (com.tencent.mm.ui.zk.a(activity, -20) - com.tencent.mm.ui.zk.a(activity, 10)) - soVar.f405471w;
                            }
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170352b;
        if (com.tencent.mm.plugin.sns.ui.so.H(soVar)) {
            com.tencent.mm.plugin.sns.ui.so.I(soVar);
            soVar.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.ro roVar = this.f170351a;
            if (roVar != null) {
                ((com.tencent.mm.plugin.sns.ui.su) roVar).a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }
}
