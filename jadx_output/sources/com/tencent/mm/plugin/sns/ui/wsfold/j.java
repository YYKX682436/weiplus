package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.w f171389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f171390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.sns.ui.wsfold.w wVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f171389d = wVar;
        this.f171390e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$liveList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$liveList$2");
        com.tencent.mm.plugin.sns.ui.wsfold.w wVar = this.f171389d;
        long longExtra = wVar.getIntent().getLongExtra("key_ws_feed_id", 0L);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455357b = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        jz5.g gVar = wVar.f171453n;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        n0Var.f455359d = intValue;
        n0Var.f455360e = -1;
        n0Var.f455361f = java.lang.Long.valueOf(longExtra);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReqPageSize", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC");
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(new com.tencent.mm.plugin.sns.ui.wsfold.m0(intValue2), n0Var, this.f171390e, null, kz5.p0.f313996d, 8, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$liveList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDataUIC$liveList$2");
        return mvvmList;
    }
}
