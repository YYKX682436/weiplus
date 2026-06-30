package o34;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o34.i f342746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o34.i iVar) {
        super(1);
        this.f342746d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$1$2");
        android.view.View it = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$1$2");
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f342746d.getString(com.tencent.mm.R.string.jeb);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsUserUIAccessibility$initConfig$1$2");
        return string;
    }
}
