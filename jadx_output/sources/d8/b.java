package d8;

/* loaded from: classes7.dex */
public class b implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.github.henryye.nativeiv.BaseImageDecodeService f226892a;

    public b(com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService, d8.a aVar) {
        this.f226892a = baseImageDecodeService;
    }

    @Override // e8.d
    public void a(java.lang.String str, e8.c cVar, e8.a aVar) {
        java.util.List list;
        list = this.f226892a.mDecodeEventListeners;
        java.util.Iterator it = new java.util.LinkedList(list).iterator();
        while (it.hasNext()) {
            ((e8.d) it.next()).a(str, cVar, aVar);
        }
    }

    @Override // e8.d
    public void b(java.lang.String str, java.lang.Object obj, e8.e eVar, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig) {
        java.util.List list;
        list = this.f226892a.mDecodeEventListeners;
        java.util.Iterator it = new java.util.LinkedList(list).iterator();
        while (it.hasNext()) {
            ((e8.d) it.next()).b(str, obj, eVar, imageDecodeConfig);
        }
    }
}
