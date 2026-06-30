package wo4;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.g f448256d;

    public e(wo4.g gVar) {
        this.f448256d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f448256d.B * 2048;
        wo4.g gVar = this.f448256d;
        yz5.p pVar = gVar.f266215e;
        if (pVar != null) {
        }
        wo4.g gVar2 = this.f448256d;
        gVar2.F += gVar2.D * 1000;
    }
}
