package xj2;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj2.n f454849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f454850e;

    public m(xj2.n nVar, float f17) {
        this.f454849d = nVar;
        this.f454850e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj2.n nVar = this.f454849d;
        float b17 = i65.a.b(nVar.getContext(), 24);
        float f17 = this.f454850e;
        nVar.v((int) (b17 * f17), 14 * f17);
    }
}
