package i62;

/* loaded from: classes13.dex */
public final class g implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public long f288943a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f288944b = "";

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String resName = this.f288944b;
        long nanoTime = this.f288943a != -1 ? java.lang.System.nanoTime() - this.f288943a : -1L;
        this.f288943a = -1L;
        this.f288944b = "";
        if (nanoTime != -1) {
            if (resName == null || r26.n0.N(resName)) {
                return;
            }
            com.tencent.mars.xlog.Log.getLogLevel();
            i62.o oVar = i62.o.f288963a;
            kotlin.jvm.internal.o.g(resName, "resName");
            i62.o.f288965c.add(new i62.j(resName, nanoTime, 4, -1));
        }
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
            java.util.Objects.toString(obj);
            i62.i.f288948a.a(objArr, "args");
        }
        if (!kotlin.jvm.internal.o.b(str4, "open") || objArr == null) {
            return;
        }
        if (!(objArr.length == 0)) {
            java.lang.Object obj2 = objArr[0];
            java.lang.String str6 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str6 == null) {
                return;
            }
            this.f288943a = java.lang.System.nanoTime();
            this.f288944b = str6;
        }
    }
}
