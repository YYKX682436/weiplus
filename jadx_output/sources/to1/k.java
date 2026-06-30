package to1;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final to1.r f420920a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f420921b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f420922c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f420923d;

    public k(to1.r rootDocument, int i17) {
        kotlin.jvm.internal.o.g(rootDocument, "rootDocument");
        this.f420920a = rootDocument;
        this.f420921b = new com.tencent.mm.sdk.platformtools.r2(i17);
        this.f420922c = new com.tencent.mm.sdk.platformtools.r2(i17);
        this.f420923d = new android.util.SparseArray();
    }

    public final to1.r a(java.lang.String path, boolean z17) {
        kotlin.jvm.internal.o.g(path, "path");
        return (to1.r) bm5.v1.a("getDocument", new to1.j(this, path, z17));
    }

    public final to1.r b(java.lang.String str) {
        java.lang.Object obj;
        if ((str == null || str.length() == 0) || kotlin.jvm.internal.o.b(str, "/")) {
            return this.f420920a;
        }
        to1.r rVar = (to1.r) this.f420921b.get(str);
        if (rVar != null) {
            return rVar;
        }
        to1.r c17 = this.f420920a.c(str);
        if (c17 != null) {
            this.f420921b.put(str, c17);
            return c17;
        }
        java.io.File file = new java.io.File(str);
        to1.r b17 = b(file.getParent());
        to1.r rVar2 = null;
        if (b17 == null) {
            return null;
        }
        int hashCode = str.hashCode();
        java.lang.Object obj2 = this.f420923d.get(hashCode);
        if (obj2 == null) {
            synchronized (this.f420923d) {
                java.lang.Object obj3 = this.f420923d.get(hashCode);
                if (obj3 == null) {
                    obj = new byte[0];
                    this.f420923d.put(hashCode, obj);
                } else {
                    obj = obj3;
                }
            }
            obj2 = obj;
        }
        synchronized (obj2) {
            to1.r rVar3 = (to1.r) this.f420921b.get(str);
            if (rVar3 != null) {
                return rVar3;
            }
            java.lang.String name = file.getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            to1.r h17 = b17.h(name);
            if (h17 != null) {
                this.f420921b.put(str, h17);
                rVar2 = h17;
            }
            return rVar2;
        }
    }
}
