package e23;

/* loaded from: classes12.dex */
public class j extends e23.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.k f246875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e23.k kVar) {
        super(kVar);
        this.f246875c = kVar;
    }

    @Override // e23.o0, u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        super.b(context, eVar, gVar, objArr);
        e23.k kVar = (e23.k) gVar;
        e23.n0 n0Var = (e23.n0) eVar;
        com.tencent.mm.plugin.fts.ui.n3.j(n0Var.f246907a, this.f246875c.f423761d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f246925q.f351189g)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f246909c, kVar.f246925q.f351187e, null);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f246909c, kVar.f246925q.f351189g, null);
        }
        if (com.tencent.mm.storage.z3.m4(kVar.f246925q.f351189g) || com.tencent.mm.storage.z3.p4(kVar.f246925q.f351189g)) {
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(kVar.f246925q.f351189g, true);
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(n0Var.f246910d.getContext(), n0Var.f246910d, kVar.C, n17.Q0(), n17.G0(), i65.a.h(context, com.tencent.mm.R.dimen.f479925j4));
        } else {
            com.tencent.mm.plugin.fts.ui.n3.a(kVar.C, n0Var.f246910d);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(kVar.f246929u, n0Var.f246911e);
        com.tencent.mm.plugin.fts.ui.n3.a(kVar.f246931w, n0Var.f246914h);
    }
}
