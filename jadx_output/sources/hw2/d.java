package hw2;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e f285510d;

    public d(hw2.e eVar) {
        this.f285510d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw2.e eVar = this.f285510d;
        if (eVar.f285520o) {
            iu3.i iVar = eVar.f285514f;
            if (iVar != null) {
                iVar.b(eVar.f285519n);
                return;
            }
            return;
        }
        iu3.i iVar2 = eVar.f285514f;
        if (iVar2 != null) {
            iVar2.c(eVar.f285519n);
        }
    }
}
