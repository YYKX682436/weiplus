package v73;

/* loaded from: classes9.dex */
public class g1 implements com.tencent.mm.pluginsdk.ui.span.z {
    public g1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object a(r35.m3 m3Var) {
        java.lang.Object obj;
        if (m3Var.f369195d != 1 || (obj = m3Var.f369196e) == null || !(obj instanceof android.os.Bundle) || !((android.os.Bundle) obj).getBoolean("click_help", false)) {
            return null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15191, 0, 1, 0, 0, 0, 0);
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z
    public java.lang.Object b(r35.m3 m3Var) {
        return null;
    }
}
