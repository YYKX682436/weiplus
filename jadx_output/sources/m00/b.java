package m00;

/* loaded from: classes9.dex */
public final class b implements b30.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322527a;

    public b(yz5.l lVar) {
        this.f322527a = lVar;
    }

    @Override // b30.e
    public boolean a(int i17, int i18, android.content.Intent intent) {
        if (4360 != i17) {
            return false;
        }
        if (-1 != i18) {
            return true;
        }
        ((o71.b) ((ct.o2) i95.n0.c(ct.o2.class))).wi(new m00.a(this.f322527a));
        return true;
    }
}
