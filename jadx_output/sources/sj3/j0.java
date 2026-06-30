package sj3;

/* loaded from: classes4.dex */
public final class j0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout f408597d;

    public j0(com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f408597d = multiTalkControlIconLayout;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ControlPanelLogic", "mic btn state: " + bool);
        kotlin.jvm.internal.o.d(bool);
        this.f408597d.setChecked(bool.booleanValue());
    }
}
