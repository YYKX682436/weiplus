package r16;

/* loaded from: classes16.dex */
public final class s implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.g f368669d;

    public s(o06.g gVar) {
        this.f368669d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.d dVar = (o06.d) obj;
        boolean z17 = false;
        if (!o06.f0.e(dVar.getVisibility())) {
            o06.g gVar = this.f368669d;
            if (gVar == null) {
                o06.f0.a(3);
                throw null;
            }
            if (o06.f0.c(o06.f0.f341952l, dVar, gVar, false) == null) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
