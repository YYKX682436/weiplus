package te2;

/* loaded from: classes14.dex */
public final class d2 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f417941h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f417942i;

    /* renamed from: m, reason: collision with root package name */
    public final te2.b2 f417943m;

    /* renamed from: n, reason: collision with root package name */
    public te2.a3 f417944n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f417945o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context, qo0.c statusMonitor, com.tencent.mm.ui.MMActivity activity, te2.b2 b2Var) {
        super(context, false, null, false, 14, null);
        android.view.View findViewById;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f417941h = statusMonitor;
        this.f417942i = activity;
        this.f417943m = b2Var;
        if (context.getResources().getConfiguration().orientation == 2 && (findViewById = this.f118384g.f444837d.findViewById(com.tencent.mm.R.id.f6b)) != null) {
            findViewById.setRotation(0.0f);
        }
        android.view.View findViewById2 = this.f118384g.f444836c.b().getDecorView().findViewById(com.tencent.mm.R.id.jhc);
        if (findViewById2 != null) {
            findViewById2.setImportantForAccessibility(2);
        }
        android.view.View findViewById3 = this.f118384g.f444837d.findViewById(com.tencent.mm.R.id.f6b);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setContentDescription(context.getString(com.tencent.mm.R.string.ekn));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dab;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public jz5.l k() {
        android.content.Context context = this.f118381d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.okf);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.oke);
        return new jz5.l(string, string2 != null ? string2 : "");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public java.lang.String o() {
        java.lang.String string = this.f118381d.getString(com.tencent.mm.R.string.okf);
        return string == null ? "" : string;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f417945o = rootView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        gk2.e eVar;
        super.t();
        if (this.f417944n == null) {
            return;
        }
        te2.a3 y17 = y();
        x91.h hVar = null;
        qo0.c.a(y17.f417857e, qo0.b.f365356g4, null, 2, null);
        te2.b2 b2Var = y17.f417859g;
        if (b2Var != null && (eVar = ((te2.l2) b2Var).f418191d) != null) {
            hVar = ((je2.i) eVar.a(je2.i.class)).f299235f;
        }
        if (hVar != null || b2Var == null) {
            return;
        }
        ((te2.l2) b2Var).f();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        gk2.e eVar;
        super.w();
        if (this.f417944n == null) {
            return;
        }
        te2.a3 y17 = y();
        te2.b2 b2Var = y17.f417859g;
        if (((b2Var == null || (eVar = ((te2.l2) b2Var).f418191d) == null) ? null : ((je2.i) eVar.a(je2.i.class)).f299235f) != null) {
            ((te2.l2) b2Var).g();
            y17.g(y17.f417864o);
        } else {
            y17.f417874y = y17.f417861i;
            if (b2Var != null) {
                ((te2.l2) b2Var).g();
            }
            y17.g(0);
        }
    }

    public final te2.a3 y() {
        te2.a3 a3Var = this.f417944n;
        if (a3Var != null) {
            return a3Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
