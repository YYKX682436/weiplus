package dv5;

/* loaded from: classes16.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final fv5.b f244035a = new fv5.b();

    /* renamed from: b, reason: collision with root package name */
    public int f244036b = 0;

    public final int a() {
        int i17 = this.f244036b;
        fv5.b bVar = this.f244035a;
        int d17 = bVar.d(i17);
        return d17 < 0 ? this.f244036b : bVar.f267022e[d17];
    }
}
