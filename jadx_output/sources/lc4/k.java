package lc4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f317969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f317968d = improveDataUIC;
        this.f317969e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f455357b = false;
        n0Var.f455359d = 10;
        n0Var.f455360e = -1;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
        qj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        java.lang.String str = qj6.f168312b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        boolean resumePage = this.f317968d.resumePage();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resumePage", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        if (!resumePage || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().clear();
            list = kz5.p0.f313996d;
        } else {
            list = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6();
        }
        java.util.List list2 = list;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", "liveList init cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " size:" + list2.size());
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList(new zc4.e(), n0Var, this.f317969e, null, list2, 8, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$liveList$2");
        return mvvmList;
    }
}
