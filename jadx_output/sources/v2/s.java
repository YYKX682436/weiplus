package v2;

/* loaded from: classes15.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public int f432735a;

    /* renamed from: b, reason: collision with root package name */
    public int f432736b;

    /* renamed from: c, reason: collision with root package name */
    public int f432737c;

    /* renamed from: d, reason: collision with root package name */
    public int f432738d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f432739e = new java.util.ArrayList();

    public s(v2.i iVar) {
        this.f432735a = iVar.I;
        this.f432736b = iVar.f432648J;
        this.f432737c = iVar.l();
        this.f432738d = iVar.h();
        java.util.ArrayList g17 = iVar.g();
        int size = g17.size();
        for (int i17 = 0; i17 < size; i17++) {
            this.f432739e.add(new v2.r((v2.g) g17.get(i17)));
        }
    }
}
