package yw3;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI f466801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f466802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f466803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI, kotlin.jvm.internal.g0 g0Var, java.lang.StringBuilder sb6) {
        super(0);
        this.f466801d = repairerDBSelectDemoUI;
        this.f466802e = g0Var;
        this.f466803f = sb6;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI repairerDBSelectDemoUI = this.f466801d;
        android.widget.TextView textView = repairerDBSelectDemoUI.f;
        if (textView != null) {
            textView.setText("Cost: " + this.f466802e.f310121d + " ms");
        }
        android.widget.TextView textView2 = repairerDBSelectDemoUI.e;
        if (textView2 != null) {
            textView2.setText(this.f466803f);
        }
        return jz5.f0.f302826a;
    }
}
