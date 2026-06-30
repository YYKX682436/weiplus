package s9;

/* loaded from: classes7.dex */
public abstract class k implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f404951d;

    /* renamed from: e, reason: collision with root package name */
    public final long f404952e;

    /* renamed from: f, reason: collision with root package name */
    public final long f404953f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f404954g;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f404955h;

    /* renamed from: i, reason: collision with root package name */
    public final long f404956i;

    public k(java.lang.String str, long j17, long j18, long j19, java.io.File file) {
        this.f404951d = str;
        this.f404952e = j17;
        this.f404953f = j18;
        this.f404954g = file != null;
        this.f404955h = file;
        this.f404956i = j19;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(s9.k kVar) {
        java.lang.String str = kVar.f404951d;
        java.lang.String str2 = this.f404951d;
        if (!str2.equals(str)) {
            return str2.compareTo(kVar.f404951d);
        }
        long j17 = this.f404952e - kVar.f404952e;
        if (j17 == 0) {
            return 0;
        }
        return j17 < 0 ? -1 : 1;
    }
}
