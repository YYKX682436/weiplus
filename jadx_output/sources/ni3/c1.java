package ni3;

/* loaded from: classes12.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f337544a;

    /* renamed from: b, reason: collision with root package name */
    public long f337545b;

    /* renamed from: c, reason: collision with root package name */
    public long f337546c;

    /* renamed from: d, reason: collision with root package name */
    public long f337547d;

    /* renamed from: e, reason: collision with root package name */
    public long f337548e;

    /* renamed from: f, reason: collision with root package name */
    public long f337549f;

    /* renamed from: g, reason: collision with root package name */
    public int f337550g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f337551h = new java.util.ArrayList(20);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f337552i = new java.util.ArrayList(20);

    /* renamed from: j, reason: collision with root package name */
    public boolean f337553j = false;

    public c1(java.lang.String str) {
        this.f337544a = str;
    }

    public java.lang.String toString() {
        return java.lang.String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", java.lang.Integer.valueOf(hashCode()), this.f337544a, java.lang.Boolean.valueOf(this.f337553j), java.lang.Long.valueOf(this.f337545b), java.lang.Long.valueOf(this.f337546c), java.lang.Long.valueOf(this.f337547d), java.lang.Long.valueOf(this.f337548e), java.lang.Integer.valueOf(this.f337551h.size()), java.lang.Integer.valueOf(this.f337552i.size()), java.lang.Long.valueOf(this.f337549f), java.lang.Integer.valueOf(this.f337550g));
    }
}
