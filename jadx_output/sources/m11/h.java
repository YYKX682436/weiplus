package m11;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f322700a;

    /* renamed from: b, reason: collision with root package name */
    public final long f322701b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f322702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f322703d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f322705f;

    /* renamed from: g, reason: collision with root package name */
    public int f322706g = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f322704e = 0;

    public h(long j17, long j18, java.lang.String str, int i17) {
        this.f322700a = j17;
        this.f322701b = j18;
        this.f322702c = str;
        this.f322703d = i17;
    }

    public boolean a(k70.w wVar, java.lang.Object obj) {
        if (this.f322705f == null) {
            this.f322705f = java.util.Collections.synchronizedList(new java.util.LinkedList());
        }
        m11.i iVar = new m11.i(wVar, obj);
        if (this.f322705f.contains(iVar)) {
            return false;
        }
        this.f322705f.add(iVar);
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof m11.h)) {
            return false;
        }
        m11.h hVar = (m11.h) obj;
        return hVar.f322700a == this.f322700a && hVar.f322701b == this.f322701b && java.util.Objects.equals(hVar.f322702c, this.f322702c) && hVar.f322703d == this.f322703d;
    }

    public int hashCode() {
        if (this.f322706g == 0) {
            this.f322706g = (this.f322700a + "_" + this.f322701b + "_" + this.f322702c + "_" + this.f322703d).hashCode();
        }
        return this.f322706g;
    }
}
