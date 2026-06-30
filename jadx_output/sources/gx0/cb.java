package gx0;

/* loaded from: classes5.dex */
public final class cb implements fy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276291a;

    public cb(gx0.ac acVar) {
        this.f276291a = acVar;
    }

    @Override // fy0.a
    public void a(int i17) {
        gx0.ac acVar = this.f276291a;
        if (i17 == 0) {
            kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.ab(acVar, null), 3, null);
        } else {
            if (i17 != 1) {
                return;
            }
            kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.bb(acVar, null), 3, null);
        }
    }
}
