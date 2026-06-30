package vn4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f438434a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f438435b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f438436c;

    public a(java.lang.String name, java.lang.String relPath) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(relPath, "relPath");
        this.f438434a = relPath;
        java.util.List f07 = r26.n0.f0(name, new java.lang.String[]{"_"}, false, 0, 6, null);
        if (f07.size() == 3) {
            this.f438435b = (java.lang.String) f07.get(0);
            this.f438436c = (java.lang.String) f07.get(1);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.HpRevertHelper", "parse Patch Info error! name=".concat(name));
            this.f438435b = "";
            this.f438436c = "";
        }
    }
}
