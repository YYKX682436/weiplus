package fz4;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f267293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz4.g f267294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267295f;

    public a(java.util.ArrayList arrayList, fz4.g gVar, yz5.l lVar) {
        this.f267293d = arrayList;
        this.f267294e = gVar;
        this.f267295f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f267295f;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f267293d.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                fz4.g gVar = this.f267294e;
                kotlin.jvm.internal.o.d(str);
                com.tencent.wechat.aff.favorites.j a17 = fz4.g.a(gVar, str);
                if (a17 != null) {
                    arrayList.add(a17);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WeNoteAsyncMediaProcessor", "addImagesAsync complete, results: " + arrayList.size());
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            lVar.invoke(arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeNoteAsyncMediaProcessor", e17, "addImagesAsync error", new java.lang.Object[0]);
            lVar.invoke(null);
        }
    }
}
