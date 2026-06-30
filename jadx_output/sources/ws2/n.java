package ws2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f449101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(0);
        this.f449101d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f449101d.findViewById(com.tencent.mm.R.id.fk6);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
        return jz5.f0.f302826a;
    }
}
