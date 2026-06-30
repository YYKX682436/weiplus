package ns4;

/* loaded from: classes8.dex */
public final class w0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339670d;

    public w0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339670d = weCoinEncashView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.f04 f04Var;
        r45.cc5 cc5Var = (r45.cc5) obj;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339670d;
        weCoinEncashView.getClass();
        java.util.Objects.toString(cc5Var);
        if (cc5Var == null || (f04Var = cc5Var.f371474f) == null) {
            return;
        }
        ns4.y0 y0Var = new ns4.y0(weCoinEncashView, cc5Var.f371473e);
        androidx.appcompat.app.AppCompatActivity context = weCoinEncashView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        os4.h.f(context, f04Var, y0Var);
    }
}
