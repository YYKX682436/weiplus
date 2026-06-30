package rb4;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb4.c f393861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rb4.c cVar) {
        super(1);
        this.f393861d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility$initConfig$1");
        android.view.View it = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility$initConfig$1");
        kotlin.jvm.internal.o.g(it, "it");
        if ((it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null) != null) {
            rb4.c.O6(this.f393861d, (android.view.ViewGroup) it, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility$initConfig$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.accessibility.SnsVideoControlAccessibility$initConfig$1");
        return f0Var;
    }
}
