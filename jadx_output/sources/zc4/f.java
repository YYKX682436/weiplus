package zc4;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zc4.f f471436d = new zc4.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = com.tencent.mm.plugin.sns.storage.f2.X1(kz5.c0.i(16, 32, 2, 8, 64, 128, 256, 512, 2048)).iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if ((num.intValue() & 256) != 0) {
                arrayList.add(num);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage$filterList$2");
        return arrayList;
    }
}
