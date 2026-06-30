package hk5;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f282006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 f282007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hk5.k kVar, com.tencent.mm.plugin.appbrand.jsapi.chatbot.yuanbao.c0 c0Var) {
        super(0);
        this.f282006d = kVar;
        this.f282007e = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hk5.k kVar = this.f282006d;
        if (kVar.getActivity().isFinishing() || kVar.getActivity().isDestroyed()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm callback after activity destroyed, skip UI updates");
        } else {
            com.tencent.mm.ui.widget.ThreeDotsLoadingView threeDotsLoadingView = kVar.f282009i;
            if (threeDotsLoadingView != null) {
                threeDotsLoadingView.f();
                android.view.ViewParent parent = threeDotsLoadingView.getParent();
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = parent instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) parent : null;
                if (constraintLayout != null) {
                    constraintLayout.removeView(threeDotsLoadingView);
                }
            }
            kVar.f282009i = null;
            kVar.f282011n = false;
            kVar.W6().a().setEnabled(true);
            kVar.W6().i().setEnabled(true);
            if (this.f282007e.f80292a) {
                j75.f Q6 = kVar.Q6();
                if (Q6 != null) {
                    Q6.B3(new wg5.d());
                }
            } else {
                try {
                    androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                    e4Var.f211776c = kVar.getString(com.tencent.mm.R.string.h0a);
                    e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                    e4Var.c();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm: show toast failed: " + th6.getMessage());
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm failed, allow retry");
            }
        }
        return jz5.f0.f302826a;
    }
}
