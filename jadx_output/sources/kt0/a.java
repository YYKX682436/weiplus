package kt0;

/* loaded from: classes15.dex */
public class a implements lt0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f311903a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f311904b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f311905c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f311906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f311907e;

    /* renamed from: f, reason: collision with root package name */
    public final long f311908f;

    public a(java.lang.String str, java.lang.String str2, java.lang.Object obj, int i17, kk.h hVar, kk.i iVar) {
        this.f311907e = 0;
        this.f311908f = 0L;
        this.f311903a = str;
        this.f311904b = str2;
        this.f311905c = obj;
        this.f311907e = i17;
        this.f311906d = new java.lang.ref.WeakReference(hVar);
        new java.lang.ref.WeakReference(iVar);
        this.f311908f = java.lang.System.currentTimeMillis();
        lt0.a aVar = lt0.a.f321162c;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.Object obj2;
        return (obj == null || !(obj instanceof kt0.a) || (obj2 = ((kt0.a) obj).f311905c) == null) ? super.equals(obj) : obj2.equals(this.f311905c);
    }

    public int hashCode() {
        java.lang.Object obj = this.f311905c;
        return obj != null ? obj.hashCode() : super.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.String.format("StructBitmap %s key:%s size %s realObj %s cacheTime %s now %s", java.lang.Integer.valueOf(hashCode()), this.f311903a, com.tencent.mm.sdk.platformtools.t8.f0(this.f311907e), this.f311905c, java.lang.Long.valueOf(this.f311908f), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
