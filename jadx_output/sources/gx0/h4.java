package gx0;

/* loaded from: classes5.dex */
public final class h4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.m4 f276491d;

    public h4(gx0.m4 m4Var) {
        this.f276491d = m4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.base.MJID mjid;
        gx0.m4 m4Var = this.f276491d;
        if (m4Var.I7().isPlaying() || !m4Var.X6() || (mjid = m4Var.f285498u) == null) {
            return;
        }
        du0.o.o7((du0.o) ((jz5.n) m4Var.f285494q).getValue(), mjid, false, false, 4, null);
    }
}
