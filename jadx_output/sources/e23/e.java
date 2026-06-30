package e23;

/* loaded from: classes11.dex */
public abstract class e extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.f f246825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e23.f fVar) {
        super(fVar);
        this.f246825b = fVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        int i17;
        e23.d dVar = (e23.d) eVar;
        e23.f fVar = (e23.f) gVar;
        android.view.View view = dVar.f246802a;
        e23.f fVar2 = this.f246825b;
        com.tencent.mm.plugin.fts.ui.n3.j(view, fVar2.f423761d);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(dVar.f246803b, fVar.f246841s, null);
        com.tencent.mm.plugin.fts.ui.n3.a(fVar.f246842t, dVar.f246804c);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(dVar.f246804c, fVar.f246841s, i65.a.h(context, com.tencent.mm.R.dimen.f479693cs));
        com.tencent.mm.plugin.fts.ui.n3.a(fVar.f246843u, dVar.f246805d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(fVar.f246844v)) {
            dVar.f246808g.setVisibility(8);
        } else {
            com.tencent.mm.plugin.fts.ui.n3.b("@" + fVar.f246844v, dVar.f246808g);
        }
        if (com.tencent.mm.storage.z3.p4(fVar2.f246841s)) {
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(fVar2.f246841s);
            if (Di == null || !((i17 = Di.field_kefuType) == 2 || i17 == 3 || i17 == 4)) {
                dVar.f246806e.setVisibility(8);
            } else {
                dVar.f246806e.setVisibility(0);
            }
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(fVar2.f246841s)) {
            dVar.f246807f.setVisibility(0);
        } else {
            dVar.f246806e.setVisibility(8);
            dVar.f246807f.setVisibility(8);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bbw, viewGroup, false);
        e23.d dVar = this.f246825b.f246845w;
        dVar.f246803b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        dVar.f246804c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        dVar.f246805d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        dVar.f246808g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hhi);
        dVar.f246802a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        dVar.f246806e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hhr);
        dVar.f246807f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.spk);
        inflate.setTag(dVar);
        return inflate;
    }
}
