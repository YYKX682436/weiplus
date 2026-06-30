package ws1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs1.d f448973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xs1.b f448974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f448975f;

    public a(xs1.d dVar, xs1.b bVar, long j17) {
        this.f448973d = dVar;
        this.f448974e = bVar;
        this.f448975f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = ws1.d.f448986a;
        xs1.d dVar = this.f448973d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(dVar.f456296a);
        xs1.b bVar = this.f448974e;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.lang.String str = dVar.f456296a;
            arrayList.add(bVar);
            return;
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList.add(bVar);
        hashMap.put(dVar.f456296a, arrayList);
        ws1.d.b(this.f448975f, dVar, bVar, false);
    }
}
