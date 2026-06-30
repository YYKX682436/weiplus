package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.wsfold.k0 f171399d = new com.tencent.mm.plugin.sns.ui.wsfold.k0();

    public k0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1$idList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1$idList$1");
        java.lang.String t07 = ca4.z0.t0(((com.tencent.mm.protocal.protobuf.SnsObject) obj).Id);
        kotlin.jvm.internal.o.f(t07, "longToString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1$idList$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1$idList$1");
        return t07;
    }
}
