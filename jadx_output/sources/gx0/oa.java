package gx0;

/* loaded from: classes5.dex */
public final class oa implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276795d;

    public oa(gx0.ac acVar) {
        this.f276795d = acVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.r n17;
        ax0.e eVar = (ax0.e) obj;
        gx0.ac acVar = this.f276795d;
        ex0.a0 e86 = acVar.e8();
        if (e86 == null || (n17 = e86.n()) == null) {
            return;
        }
        if (n17.f257169c == ug.m.Narration && kz5.z.G(new ax0.e[]{ax0.e.f14979h, ax0.e.f14980i}, eVar)) {
            gx0.ac.a8(acVar, n17);
        }
    }
}
