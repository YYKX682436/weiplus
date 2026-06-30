package tj3;

/* loaded from: classes14.dex */
public final class h extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f419739d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f419740e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f419741f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.k0 f419742g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.k0 f419743h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f419739d = jz5.h.b(new tj3.f(context));
        this.f419740e = jz5.h.b(new tj3.b(this));
        this.f419741f = jz5.h.b(new tj3.g(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c2z, (android.view.ViewGroup) this, true);
        this.f419742g = new tj3.a(this);
        this.f419743h = new tj3.e(this, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout getCameraSwitcher() {
        return (com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout) ((jz5.n) this.f419740e).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.multitalk.ui.b0 getViewModel() {
        return (com.tencent.mm.plugin.multitalk.ui.b0) ((jz5.n) this.f419739d).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout getVirtualBackgroundSwitcher() {
        return (com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout) ((jz5.n) this.f419741f).getValue();
    }

    public final void d() {
        if (getVisibility() == 0) {
            java.lang.Boolean bool = (java.lang.Boolean) getViewModel().f150263n.getValue();
            if (bool == null) {
                bool = java.lang.Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            boolean f17 = f();
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarControlLayout", "enable: " + f17 + " cam: " + booleanValue);
            getCameraSwitcher().setVisibility(booleanValue ? 0 : 8);
            getVirtualBackgroundSwitcher().setVisibility((f17 && booleanValue) ? 0 : 8);
        }
    }

    public final boolean e() {
        java.lang.Boolean bool = (java.lang.Boolean) getViewModel().f150263n.getValue();
        if (bool == null) {
            bool = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        f();
        return booleanValue;
    }

    public final boolean f() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_virtual_background_gpu_rating, 40);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_multitalk_virtual_background_disable, false);
        int f17 = rs0.n.f399306d.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarControlLayout", "gpuRatingLimiting: " + Ni + ", gpuRating: " + f17 + ", disableVirtualBackground: " + fj6);
        return f17 >= Ni && !fj6;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        androidx.lifecycle.k0 k0Var = this.f419743h;
        androidx.lifecycle.k0 k0Var2 = this.f419742g;
        if (i17 != 0) {
            getViewModel().f150263n.removeObserver(k0Var2);
            getViewModel().f150271v.removeObserver(k0Var);
            return;
        }
        d();
        java.lang.Object context = getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            getViewModel().f150263n.observe(yVar, k0Var2);
            getViewModel().f150271v.observe(yVar, k0Var);
        }
        getCameraSwitcher().setOnClickListener(new tj3.c(this));
        if (com.tencent.mm.plugin.multitalk.model.e3.wi().d()) {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout cameraSwitcher = getCameraSwitcher();
            android.content.Context context2 = getContext();
            cameraSwitcher.setContentDescription(context2 != null ? context2.getString(com.tencent.mm.R.string.h1s) : null);
        } else {
            com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout cameraSwitcher2 = getCameraSwitcher();
            android.content.Context context3 = getContext();
            cameraSwitcher2.setContentDescription(context3 != null ? context3.getString(com.tencent.mm.R.string.f492580h11) : null);
        }
        getVirtualBackgroundSwitcher().setOnClickListener(new tj3.d(this));
    }
}
