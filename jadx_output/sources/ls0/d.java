package ls0;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ls0.k kVar) {
        super(0);
        this.f320814d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ls0.k kVar = this.f320814d;
        com.tencent.mars.xlog.Log.i(kVar.f320848b, kVar.hashCode() + " do release resources");
        ms0.c.o(kVar.f320847a, false, 1, null);
        android.view.Surface surface = kVar.f320853g;
        if (surface != null) {
            surface.release();
        }
        rs0.h hVar = kVar.f320851e;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        kVar.f320850d.removeCallbacksAndMessages(null);
        kVar.f320849c.quitSafely();
        return jz5.f0.f302826a;
    }
}
