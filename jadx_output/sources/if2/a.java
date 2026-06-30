package if2;

/* loaded from: classes3.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if2.b f291096d;

    public a(if2.b bVar) {
        this.f291096d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if2.b bVar = this.f291096d;
        if (bVar.U6()) {
            yz5.a aVar = bVar.f291102h;
            if (aVar != null) {
                if (aVar != null) {
                    aVar.invoke();
                }
                bVar.f291102h = null;
                return;
            }
            return;
        }
        yz5.a aVar2 = bVar.f291101g;
        if (aVar2 != null) {
            if (aVar2 != null) {
                aVar2.invoke();
            }
            bVar.f291101g = null;
        }
    }
}
