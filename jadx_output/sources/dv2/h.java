package dv2;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f243857d;

    /* renamed from: e, reason: collision with root package name */
    public xg3.h0 f243858e;

    /* renamed from: f, reason: collision with root package name */
    public dv2.c f243859f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f243860g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243861h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243857d = "Finder.ConversationExposeReportUIC";
        this.f243859f = dv2.c.f243819d;
        this.f243860g = "";
        this.f243861h = jz5.h.b(new dv2.d(this));
        this.f243862i = jz5.h.b(dv2.f.f243849d);
    }

    public final dv2.b O6() {
        return (dv2.b) this.f243862i.getValue();
    }

    public final void P6(dv2.c source, java.lang.String sessionId, int i17) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        if (source == dv2.c.f243819d) {
            return;
        }
        Q6();
        this.f243859f = source;
        this.f243860g = sessionId;
        java.lang.String T0 = source == dv2.c.f243821f ? g92.b.f269769e.T0() : "";
        if (i17 > 0) {
            com.tencent.wechat.aff.finder.FinderDataService.getInstance().reportMsgReadCGIAsync(T0, sessionId, bw5.cu.FinderPersonalMsgReadReportScene_Read, new dv2.e(this, source, i17, T0, sessionId));
        } else {
            R6();
        }
    }

    public final void Q6() {
        jz5.f0 f0Var;
        xg3.h0 h0Var = this.f243858e;
        java.lang.String str = this.f243857d;
        if (h0Var != null) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(h0Var);
            com.tencent.mars.xlog.Log.i(str, hashCode() + ' ' + this.f243859f + " onMsgChange removeMsgListener " + h0Var.hashCode());
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, hashCode() + ' ' + this.f243859f + " onMsgChange removeMsgListener msg change is null!");
        }
        this.f243858e = null;
        this.f243860g = "";
    }

    public final void R6() {
        xg3.h0 h0Var = this.f243858e;
        if (h0Var == null) {
            h0Var = new dv2.g(this);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(h0Var, null);
            com.tencent.mars.xlog.Log.i(this.f243857d, hashCode() + ' ' + this.f243859f + " onMsgChange addMsgListener " + h0Var.hashCode());
        }
        this.f243858e = h0Var;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        Q6();
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f243861h).getValue()).removeCallbacks(O6());
        if (O6().f243813d.length() > 0) {
            O6().run();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        Q6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f243857d = "Finder.ConversationExposeReportUIC";
        this.f243859f = dv2.c.f243819d;
        this.f243860g = "";
        this.f243861h = jz5.h.b(new dv2.d(this));
        this.f243862i = jz5.h.b(dv2.f.f243849d);
    }
}
