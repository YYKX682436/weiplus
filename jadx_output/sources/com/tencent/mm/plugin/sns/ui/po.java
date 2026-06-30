package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class po implements com.tencent.mm.plugin.sns.ui.uo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ro f170250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.so f170251b;

    public po(com.tencent.mm.plugin.sns.ui.so soVar, com.tencent.mm.plugin.sns.ui.ro roVar) {
        this.f170251b = soVar;
        this.f170250a = roVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170251b;
        if (com.tencent.mm.plugin.sns.ui.so.J(soVar) != null) {
            com.tencent.mm.plugin.sns.ui.so.J(soVar).b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadStarData", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void b(java.util.List list, java.util.Map map, java.util.Map map2, java.util.Map map3, int i17, int i18) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170251b;
        if (!com.tencent.mm.plugin.sns.ui.so.H(soVar)) {
            this.f170251b.R(list, map, map2, map3, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            java.util.List list2 = soVar.f405456e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (((java.util.ArrayList) list2).isEmpty()) {
                j17 = 0;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                java.util.List list3 = soVar.f405456e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                java.util.List list4 = soVar.f405456e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                j17 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) ((java.util.ArrayList) list3).get(((java.util.ArrayList) list4).size() - 1)).field_snsId;
            }
            java.lang.String s07 = ca4.z0.s0(j17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            soVar.F = s07;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            java.util.List list5 = soVar.f405456e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (!((java.util.ArrayList) list5).isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                java.util.List list6 = soVar.f405456e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                java.util.List list7 = soVar.f405456e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                long j18 = ((com.tencent.mm.plugin.sns.storage.SnsInfo) ((java.util.ArrayList) list6).get(((java.util.ArrayList) list7).size() - 1)).field_snsId;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.uo
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
        com.tencent.mm.plugin.sns.ui.so soVar = this.f170251b;
        if (!com.tencent.mm.plugin.sns.ui.so.H(soVar)) {
            com.tencent.mm.plugin.sns.ui.so.I(soVar);
            soVar.notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.ro roVar = this.f170250a;
            if (roVar != null) {
                ((com.tencent.mm.plugin.sns.ui.su) roVar).a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
    }
}
