package i9;

/* loaded from: classes15.dex */
public final class c extends i9.j {

    /* renamed from: h, reason: collision with root package name */
    public final i9.b f289668h;

    public c(i9.b bVar) {
        this.f289668h = bVar;
    }

    @Override // i9.j
    public final void l() {
        i9.b bVar = this.f289668h;
        synchronized (bVar.f343616b) {
            bVar.e(this);
            if (!bVar.f343617c.isEmpty() && bVar.f343622h > 0) {
                bVar.f343616b.notify();
            }
        }
    }
}
