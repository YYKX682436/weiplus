package o34;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o34.i f342750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o34.i iVar) {
        super(1);
        this.f342750d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$4");
        android.view.View it = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$4");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f342750d.getString(com.tencent.mm.R.string.jh8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$2$4");
        return string;
    }
}
