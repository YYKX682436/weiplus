package e23;

/* loaded from: classes12.dex */
public class o0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p0 f246922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(e23.p0 p0Var) {
        super(p0Var);
        this.f246922b = p0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        int i17;
        e23.p0 p0Var = (e23.p0) gVar;
        e23.n0 n0Var = (e23.n0) eVar;
        android.view.View view = n0Var.f246907a;
        e23.p0 p0Var2 = this.f246922b;
        com.tencent.mm.plugin.fts.ui.n3.j(view, p0Var2.f423761d);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f246909c, p0Var.f246927s, null);
        com.tencent.mm.plugin.fts.ui.n3.c(p0Var.f246929u, n0Var.f246911e, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(context));
        if (e23.p0.A) {
            com.tencent.mm.plugin.fts.ui.n3.c(p0Var.f246930v, n0Var.f246912f, i65.a.f(context, com.tencent.mm.R.dimen.f479628b3) * i65.a.m(context));
        }
        com.tencent.mm.plugin.fts.ui.n3.c(p0Var.f246931w, n0Var.f246914h, i65.a.f(context, com.tencent.mm.R.dimen.f479788f9) * i65.a.m(context));
        android.widget.TextView textView = n0Var.f246913g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView imageView = n0Var.f246915i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (c01.e2.R(p0Var.f246927s)) {
            com.tencent.mm.plugin.fts.ui.n3.c(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).aj(context, p0Var.f246928t), n0Var.f246910d, i65.a.f(context, com.tencent.mm.R.dimen.f479897ia) * i65.a.m(context));
        } else if (com.tencent.mm.storage.z3.m4(p0Var.f246927s) || com.tencent.mm.storage.z3.p4(p0Var.f246927s)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(p0Var.f246927s, true);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0()))) {
                p0Var2.f246932x = "@" + ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
            }
            com.tencent.mm.plugin.fts.ui.n3.c(p0Var.f246928t, n0Var.f246910d, i65.a.f(context, com.tencent.mm.R.dimen.f479897ia) * i65.a.m(context));
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(p0Var.f246927s);
            android.widget.ImageView imageView2 = n0Var.f246915i;
            if (imageView2 == null || Di == null || !((i17 = Di.field_kefuType) == 2 || i17 == 3 || i17 == 4)) {
                com.tencent.mm.plugin.fts.ui.n3.c(p0Var2.f246932x, n0Var.f246913g, i65.a.f(context, com.tencent.mm.R.dimen.f479853h2) * i65.a.m(context));
            } else {
                imageView2.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.fts.ui.n3.c(p0Var.f246928t, n0Var.f246910d, i65.a.f(context, com.tencent.mm.R.dimen.f479897ia) * i65.a.m(context));
        }
        if (n0Var.f246916j != null) {
            if (!((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(p0Var2.f246927s)) {
                n0Var.f246916j.setVisibility(8);
                return;
            }
            n0Var.f246916j.setVisibility(0);
            p0Var2.f246932x = "";
            java.lang.String Vi = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Vi(p0Var2.f246927s);
            java.lang.String Ui = ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Ui(p0Var2.f246927s);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Vi) && !com.tencent.mm.sdk.platformtools.t8.K0(Ui)) {
                p0Var2.f246932x = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(Vi, Ui);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(p0Var2.f246932x)) {
                return;
            }
            if ("3552365301".equals(Vi)) {
                p0Var2.f246932x = "@" + p0Var2.f246932x;
            }
            com.tencent.mm.plugin.fts.ui.n3.c(p0Var2.f246932x, n0Var.f246913g, i65.a.f(context, com.tencent.mm.R.dimen.f479853h2) * i65.a.m(context));
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f246922b.f246934z;
        if (e23.p0.A) {
            com.tencent.mars.xlog.Log.i("FTSMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.efh, viewGroup, false);
            n0Var.f246908b = inflate.findViewById(com.tencent.mm.R.id.mem);
            n0Var.f246912f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rte);
        } else {
            com.tencent.mars.xlog.Log.i("FTSMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bcg, viewGroup, false);
        }
        n0Var.f246909c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        n0Var.f246910d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        n0Var.f246911e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jue);
        n0Var.f246914h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7z);
        n0Var.f246913g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hhi);
        n0Var.f246907a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        n0Var.f246915i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hhr);
        n0Var.f246916j = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.spk);
        inflate.setTag(n0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f246922b.f423758a).b(context, view, gVar, objArr);
    }
}
