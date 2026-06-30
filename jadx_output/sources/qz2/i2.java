package qz2;

/* loaded from: classes9.dex */
public final class i2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f367874d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f367875e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f367876f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f367877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f367875e = jz5.h.b(qz2.z1.f367932d);
        this.f367876f = new androidx.lifecycle.j0();
        this.f367877g = new androidx.lifecycle.j0();
    }

    public final void O6(qz2.y1 y1Var) {
        this.f367876f.setValue(y1Var);
    }

    public final void P6(qz2.t1 t1Var) {
        this.f367877g.setValue(t1Var);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).addSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).addSceneEndListener(1638);
        this.f367876f.observe(getActivity(), new qz2.e2(this));
        this.f367877g.observe(getActivity(), new qz2.a2(this));
        P6(qz2.n1.f367893a);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity).removeSceneEndListener(com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX);
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.wallet_core.ui.WalletBaseUI");
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) activity2).removeSceneEndListener(1638);
        mz2.d2.IML.h();
        java.lang.Object value = ((jz5.n) this.f367875e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((ne4.n) ((d50.q) value)).a(true);
    }
}
