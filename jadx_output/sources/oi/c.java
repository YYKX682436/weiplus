package oi;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final oi.e f345544a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f345545b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f345546c;

    /* renamed from: d, reason: collision with root package name */
    public long f345547d;

    /* renamed from: e, reason: collision with root package name */
    public int f345548e;

    public c(oi.e eVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f345545b = arrayList;
        this.f345546c = new java.util.ArrayList();
        this.f345548e = 1;
        this.f345544a = eVar;
        arrayList.add(java.lang.Integer.valueOf(eVar.f345556b));
        a(eVar.f345560f);
        oi.b bVar = eVar.f345560f;
        if (bVar != null) {
            this.f345547d += bVar.b();
        }
    }

    public void a(oi.b bVar) {
        if (bVar == null) {
            return;
        }
        oi.d dVar = oi.d.TEXTURE;
        java.util.List list = this.f345546c;
        oi.d dVar2 = bVar.f345541j;
        if (dVar2 == dVar) {
            for (oi.a aVar : bVar.f345543l) {
                if (aVar != null) {
                    list.add(aVar.toString());
                }
            }
            return;
        }
        if (dVar2 == oi.d.BUFFER) {
            list.add("MemoryInfo{target=" + bVar.f345532a + ", id=" + bVar.f345536e + ", eglContextNativeHandle='" + bVar.f345537f + "', usage=" + bVar.f345538g + ", size=" + bVar.b() + '}');
            return;
        }
        if (dVar2 == oi.d.RENDER_BUFFERS) {
            list.add("MemoryInfo{target=" + bVar.f345532a + ", id=" + bVar.f345536e + ", eglContextNativeHandle='" + bVar.f345537f + "', internalFormat=" + bVar.f345533b + ", width=" + bVar.f345534c + ", height=" + bVar.f345535d + ", size=" + bVar.b() + '}');
        }
    }
}
