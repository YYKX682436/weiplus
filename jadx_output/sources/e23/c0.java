package e23;

/* loaded from: classes12.dex */
public class c0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.d0 f246795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e23.d0 d0Var) {
        super(d0Var);
        this.f246795b = d0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.b0 b0Var = (e23.b0) eVar;
        e23.d0 d0Var = (e23.d0) gVar;
        android.view.View view = b0Var.f246778a;
        e23.d0 d0Var2 = this.f246795b;
        com.tencent.mm.plugin.fts.ui.n3.i(view, d0Var2.f423761d);
        com.tencent.mm.plugin.fts.ui.n3.a(d0Var2.f246810r, b0Var.f246780c);
        com.tencent.mm.plugin.fts.ui.n3.a(d0Var2.f246811s, b0Var.f246781d);
        p13.f fVar = d0Var.f246814v;
        if (fVar == null || fVar.field_featureId != 98 || com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f246809q.f351187e) || !com.tencent.mm.storage.z3.L4(d0Var.f246809q.f351187e)) {
            b0Var.f246782e.setVisibility(4);
        } else {
            b0Var.f246782e.setVisibility(0);
        }
        p13.f fVar2 = d0Var.f246814v;
        if (fVar2 != null && fVar2.field_featureId == 98 && !com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f246809q.f351187e)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(b0Var.f246779b, d0Var.f246809q.f351187e, null);
        } else {
            int i17 = d0Var2.f246813u;
            if (i17 != -1) {
                b0Var.f246779b.setImageResource(i17);
            } else {
                com.tencent.mm.plugin.fts.ui.n3.k(context, b0Var.f246779b, null, d0Var.f246812t, com.tencent.mm.R.raw.fts_default_img, true, 0, 0);
            }
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbw, viewGroup, false);
        e23.b0 b0Var = this.f246795b.f246816x;
        b0Var.f246779b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        b0Var.f246780c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        b0Var.f246781d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        b0Var.f246778a = inflate.findViewById(com.tencent.mm.R.id.mem);
        b0Var.f246782e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.spk);
        inflate.setTag(b0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f246795b.f423758a).b(context, view, gVar, objArr);
    }
}
