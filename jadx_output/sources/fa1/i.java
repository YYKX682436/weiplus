package fa1;

/* loaded from: classes7.dex */
public class i implements dh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f260688a;

    public i(fa1.j jVar, java.lang.ref.WeakReference weakReference) {
        this.f260688a = weakReference;
    }

    @Override // dh.a
    public void a(java.lang.String str, yz5.l lVar) {
    }

    @Override // dh.a
    public java.lang.String getAbsolutePath(java.lang.String str) {
        return "";
    }

    @Override // dh.a
    public byte[] readDataFromURLSync(java.lang.String str) {
        byte[] a17 = wd.a.f444670a.a(str, (com.tencent.mm.plugin.appbrand.service.c0) this.f260688a.get());
        return a17 == null ? new byte[0] : a17;
    }
}
