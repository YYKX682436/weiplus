package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class si implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f170473a;

    public si(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f170473a = snsHeader;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$14");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170473a;
            if (snsHeader.f167172n) {
                snsHeader.f();
            } else if (!com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike && com.tencent.mm.plugin.sns.ui.SnsHeader.e(snsHeader) != null) {
                com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike = !com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike;
                com.tencent.mm.plugin.sns.ui.bj e17 = com.tencent.mm.plugin.sns.ui.SnsHeader.e(snsHeader);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                long j17 = snsHeader.f167169h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((com.tencent.mm.plugin.sns.ui.lt) e17).a(j17, com.tencent.mm.plugin.sns.ui.SnsHeader.d(snsHeader).field_isLike);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                snsHeader.k();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$14");
    }
}
