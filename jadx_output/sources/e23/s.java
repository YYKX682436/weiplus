package e23;

/* loaded from: classes12.dex */
public class s extends e23.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.t f246955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e23.t tVar) {
        super(tVar);
        this.f246955c = tVar;
    }

    @Override // e23.o0, u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.t tVar = (e23.t) gVar;
        e23.n0 n0Var = (e23.n0) eVar;
        com.tencent.mm.plugin.fts.ui.n3.j(n0Var.f246907a, this.f246955c.f423761d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f246925q.f351189g)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f246909c, tVar.f246925q.f351187e, null);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f246909c, tVar.f246925q.f351189g, null);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(tVar.C, n0Var.f246910d);
        com.tencent.mm.plugin.fts.ui.n3.a(tVar.f246929u, n0Var.f246911e);
        com.tencent.mm.plugin.fts.ui.n3.a(tVar.f246931w, n0Var.f246914h);
    }

    @Override // e23.o0, u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f246955c.f246934z;
        if (e23.p0.A) {
            com.tencent.mars.xlog.Log.i("FTSConvTalkerMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.efh, viewGroup, false);
            n0Var.f246908b = inflate.findViewById(com.tencent.mm.R.id.mem);
            n0Var.f246912f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rte);
        } else {
            com.tencent.mars.xlog.Log.i("FTSConvTalkerMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bcg, viewGroup, false);
        }
        n0Var.f246909c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        n0Var.f246910d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        n0Var.f246911e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jue);
        n0Var.f246907a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        n0Var.f246914h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7z);
        n0Var.f246909c.getLayoutParams().width = i65.a.h(context, com.tencent.mm.R.dimen.it);
        n0Var.f246909c.getLayoutParams().height = i65.a.h(context, com.tencent.mm.R.dimen.it);
        inflate.setTag(n0Var);
        return inflate;
    }
}
