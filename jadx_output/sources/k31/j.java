package k31;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f303844d;

    public j(long j17) {
        this.f303844d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l31.b bVar = (l31.b) k31.o.f303853d.remove(java.lang.Long.valueOf(this.f303844d));
        if (bVar != null) {
            bVar.toString();
            k31.o oVar = k31.o.f303850a;
            java.util.List list = (java.util.List) k31.o.f303852c.get(bVar.b());
            if (list != null) {
                list.remove(bVar);
            }
            bVar.a();
        }
    }
}
