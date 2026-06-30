package o34;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o34.i f342747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o34.i iVar) {
        super(1);
        this.f342747d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$1");
        android.view.View it = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$1");
        kotlin.jvm.internal.o.g(it, "it");
        o34.i iVar = this.f342747d;
        java.lang.String O6 = iVar.O6(it);
        if (android.text.TextUtils.isEmpty(O6)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$1");
        } else {
            O6 = iVar.getString(com.tencent.mm.R.string.jh7) + O6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$1");
        return O6;
    }
}
