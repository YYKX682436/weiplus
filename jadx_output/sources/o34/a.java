package o34;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final o34.a f342744d = new o34.a();

    public a() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
        android.view.View it = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
        kotlin.jvm.internal.o.g(it, "it");
        if (it.getTag(com.tencent.mm.R.id.f482830p4) != null) {
            it.setTag(com.tencent.mm.R.id.f482830p4, null);
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.accessibility.SnsCommentDetailUIAccessibility$initConfig$1$1");
        return valueOf;
    }
}
