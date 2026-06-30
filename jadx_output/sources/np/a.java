package np;

/* loaded from: classes11.dex */
public class a extends np.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f338779d;

    public a(com.tencent.mm.storage.z3 z3Var) {
        this.f338779d = z3Var;
    }

    @Override // c01.g1
    public void a(int i17, int i18, java.lang.String str, c01.g1 g1Var) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f338779d.d1());
        if (p17 == null || !"@blacklist".equals(p17.W0())) {
            return;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().P(new java.lang.String[]{p17.h1()}, "");
    }
}
