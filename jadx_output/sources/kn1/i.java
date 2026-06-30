package kn1;

/* loaded from: classes12.dex */
public class i implements java.lang.Comparable, java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f309625d;

    /* renamed from: e, reason: collision with root package name */
    public long f309626e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f309627f = new long[2];

    /* renamed from: g, reason: collision with root package name */
    public long f309628g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f309629h = -1;

    public java.lang.Object clone() {
        kn1.i iVar = new kn1.i();
        iVar.f309625d = this.f309625d;
        iVar.f309626e = this.f309626e;
        iVar.f309628g = this.f309628g;
        iVar.f309629h = this.f309629h;
        return iVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = this.f309628g;
        long j18 = ((kn1.i) obj).f309628g;
        if (j17 < j18) {
            return 1;
        }
        return j17 > j18 ? -1 : 0;
    }
}
