package wd4;

/* loaded from: classes12.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(wd4.l1 l1Var) {
        super(0);
        this.f444891d = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
        wd4.l1 l1Var = this.f444891d;
        android.app.Activity c17 = l1Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHasTitle", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHasTitle", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(c17, 0, l1Var.f444953b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$bottomSheet$2");
        return k0Var;
    }
}
