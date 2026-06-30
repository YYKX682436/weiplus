package va5;

/* loaded from: classes11.dex */
public final class j implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va5.p f434414a;

    public j(va5.p pVar) {
        this.f434414a = pVar;
    }

    @Override // oa5.a
    public final void a(float f17) {
        va5.p pVar = this.f434414a;
        if (pVar.D == null) {
            return;
        }
        int i17 = pVar.E;
        pVar.c(((int) (i17 - (i17 * f17))) * pVar.f434422d);
        pVar.invalidate();
    }
}
