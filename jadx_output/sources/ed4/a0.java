package ed4;

/* loaded from: classes4.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.z0 f251283d;

    public a0(com.tencent.mm.plugin.sns.ui.item.z0 z0Var) {
        this.f251283d = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.item.z0 z0Var = this.f251283d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick");
        try {
            if (z0Var.f169251h.f168036b.k() == 0) {
                z0Var.f169251h.f168039e.f169797J.onClick(view);
            } else if (z0Var.f169251h.f168036b.k() == 1) {
                z0Var.f169251h.f168039e.f169797J.onClick(view);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            z0Var.f169433r = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick, exp=" + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
    }
}
