package x;

/* loaded from: classes13.dex */
public class a extends x.m {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x.b f450805d;

    public a(x.b bVar) {
        this.f450805d = bVar;
    }

    @Override // x.m
    public void a() {
        this.f450805d.clear();
    }

    @Override // x.m
    public java.lang.Object b(int i17, int i18) {
        return this.f450805d.f450845e[(i17 << 1) + i18];
    }

    @Override // x.m
    public java.util.Map c() {
        return this.f450805d;
    }

    @Override // x.m
    public int d() {
        return this.f450805d.f450846f;
    }

    @Override // x.m
    public int e(java.lang.Object obj) {
        return this.f450805d.e(obj);
    }

    @Override // x.m
    public int f(java.lang.Object obj) {
        return this.f450805d.g(obj);
    }

    @Override // x.m
    public void g(java.lang.Object obj, java.lang.Object obj2) {
        this.f450805d.put(obj, obj2);
    }

    @Override // x.m
    public void h(int i17) {
        this.f450805d.j(i17);
    }

    @Override // x.m
    public java.lang.Object i(int i17, java.lang.Object obj) {
        return this.f450805d.k(i17, obj);
    }
}
