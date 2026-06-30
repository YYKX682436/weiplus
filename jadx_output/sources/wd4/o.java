package wd4;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str) {
        super(1);
        this.f444986d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
        if (th6 != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f444986d, th6, "tryEnable, open fail", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials$tryEnable$2$2");
        return f0Var;
    }
}
