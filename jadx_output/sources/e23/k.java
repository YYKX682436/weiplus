package e23;

/* loaded from: classes12.dex */
public class k extends e23.p0 {
    public com.tencent.mm.storage.a3 B;
    public java.lang.CharSequence C;
    public final e23.j D;

    public k(int i17) {
        super(i17);
        this.D = new e23.j(this);
    }

    @Override // e23.p0, u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        java.lang.String w07;
        super.a(context, eVar, objArr);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f246925q.f351189g, true);
        if (n17 == null) {
            w07 = o13.n.d(this.f246925q.f351187e);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
            com.tencent.mm.storage.a3 a3Var = this.B;
            if (a3Var != null) {
                java.lang.String z07 = a3Var.z0(this.f246925q.f351189g);
                w07 = !com.tencent.mm.sdk.platformtools.t8.K0(z07) ? z07 : n17.P0();
            } else {
                w07 = n17.P0();
            }
        } else {
            w07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float f17 = com.tencent.mm.plugin.fts.ui.d.f138035d;
        ((ke0.e) xVar).getClass();
        this.C = com.tencent.mm.pluginsdk.ui.span.c0.n(context, w07, f17);
    }

    @Override // e23.p0, u13.g
    public u13.f k() {
        return this.D;
    }
}
