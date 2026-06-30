package pi2;

/* loaded from: classes10.dex */
public final class b0 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final zh2.c H;
    public final yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public pi2.c0 f354765J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, zh2.c pluginAbility, yz5.p notifyViewClick) {
        super(context, false, null, 0.6666667f, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(notifyViewClick, "notifyViewClick");
        this.H = pluginAbility;
        this.I = notifyViewClick;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.dry;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public java.lang.String L() {
        java.lang.String string = this.f118183e.getResources().getString(com.tencent.mm.R.string.f491666ml5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f354765J = new pi2.c0(rootView, this.H, new pi2.a0(this));
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.clh));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        pi2.c0 c0Var = this.f354765J;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("micModeWidget");
            throw null;
        }
        c0Var.h();
        super.S();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void U() {
        pi2.c0 c0Var = this.f354765J;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("micModeWidget");
            throw null;
        }
        if (c0Var.i()) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            pi2.c0 c0Var2 = this.f354765J;
            if (c0Var2 == null) {
                kotlin.jvm.internal.o.o("micModeWidget");
                throw null;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c0Var2.f337316r.f211363x);
            pi2.c0 c0Var3 = this.f354765J;
            if (c0Var3 == null) {
                kotlin.jvm.internal.o.o("micModeWidget");
                throw null;
            }
            this.I.invoke(valueOf, c0Var3.f337319u);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public android.view.View v() {
        return x();
    }
}
