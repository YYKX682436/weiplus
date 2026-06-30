package ns4;

/* loaded from: classes8.dex */
public final class t0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339655d;

    public t0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339655d = weCoinEncashView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.ma7 ma7Var = (r45.ma7) obj;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339655d;
        if (ma7Var == null) {
            android.view.ViewGroup viewGroup = weCoinEncashView.f179159q;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("cutTaxEntrace");
                throw null;
            }
        }
        android.view.ViewGroup viewGroup2 = weCoinEncashView.f179159q;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("cutTaxEntrace");
            throw null;
        }
        viewGroup2.setVisibility(0);
        android.widget.TextView textView = weCoinEncashView.f179160r;
        if (textView == null) {
            kotlin.jvm.internal.o.o("cutTaxTitle");
            throw null;
        }
        textView.setText(ma7Var.f380315d);
        android.widget.TextView textView2 = weCoinEncashView.f179161s;
        if (textView2 != null) {
            textView2.setText(ma7Var.f380316e);
        } else {
            kotlin.jvm.internal.o.o("cutTaxDesc");
            throw null;
        }
    }
}
