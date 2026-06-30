package sj3;

/* loaded from: classes4.dex */
public final class f0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408503d;

    public f0(com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f408503d = multiTalkControlIconLayout;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "camera btn state: " + bool);
        kotlin.jvm.internal.o.d(bool);
        this.f408503d.setChecked(bool.booleanValue());
    }
}
