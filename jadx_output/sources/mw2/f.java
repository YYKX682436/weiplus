package mw2;

/* loaded from: classes2.dex */
public final class f implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mw2.j f331713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331714b;

    public f(mw2.j jVar, java.lang.String str) {
        this.f331713a = jVar;
        this.f331714b = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        mw2.j jVar = this.f331713a;
        java.lang.String urlMd5 = this.f331714b;
        kotlin.jvm.internal.o.f(urlMd5, "$urlMd5");
        synchronized (jVar.f331729h) {
            if (bitmap != null) {
                jVar.f331727f.d(urlMd5, bitmap);
            }
            java.util.List list = (java.util.List) jVar.f331729h.get(urlMd5);
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((yz5.l) it.next()).invoke(bitmap);
                }
            }
        }
    }
}
