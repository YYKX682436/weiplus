package l51;

/* loaded from: classes12.dex */
public class f implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f316563d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f316564e;

    /* renamed from: f, reason: collision with root package name */
    public final int f316565f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.mm7zip.IOutCreateArchive f316566g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f316567h;

    public f(java.lang.String str, java.io.File file, java.util.List list, int i17, com.tencent.mm.mm7zip.IOutCreateArchive iOutCreateArchive, java.lang.String str2) {
        this.f316565f = -1;
        this.f316564e = list;
        this.f316563d = file;
        this.f316565f = i17;
        this.f316566g = iOutCreateArchive;
        this.f316567h = str2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean call() {
        java.util.List list = this.f316564e;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            l51.g gVar = new l51.g();
            l51.d[] dVarArr = new l51.d[list.size()];
            list.toArray(dVarArr);
            gVar.a(dVarArr, this.f316563d.getAbsolutePath(), this.f316566g, this.f316567h);
            com.tencent.stubs.logger.Log.i("HdiffApk-SZServer", "multi thread，pid = " + this.f316565f + "\n,entry count: " + arrayList.size() + "\n，cost time  = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
    }
}
