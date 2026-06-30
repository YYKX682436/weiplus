package qz2;

/* loaded from: classes9.dex */
public final class j1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f367879d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f367880e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.j0 f367881f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f367882g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f367880e = jz5.h.b(qz2.z0.f367931d);
        this.f367881f = new androidx.lifecycle.j0();
        this.f367882g = new androidx.lifecycle.j0();
    }

    public final void O6(qz2.y0 y0Var) {
        this.f367881f.setValue(y0Var);
    }

    public final void P6(qz2.t0 t0Var) {
        this.f367882g.setValue(t0Var);
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
        this.f367881f.observe(getActivity(), new qz2.f1(this));
        this.f367882g.observe(getActivity(), new qz2.b1(this));
        P6(qz2.n0.f367892a);
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
        java.lang.Object value = ((jz5.n) this.f367880e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((ne4.n) ((d50.q) value)).a(true);
    }
}
