package y45;

/* loaded from: classes12.dex */
public abstract class f extends d55.r {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f459367c;

    public f(java.lang.String str) {
        super(str);
        this.f459367c = str;
    }

    public final void b(android.content.Context context) {
        java.util.List list = this.f226611a;
        if (((java.util.ArrayList) list).size() == 0) {
            return;
        }
        java.util.Set set = com.tencent.mm.sdk.platformtools.o4.f192893i;
        java.lang.String str = this.f459367c;
        com.tencent.mm.sdk.platformtools.o4 L = "".equals(str) ? com.tencent.mm.sdk.platformtools.o4.L() : com.tencent.mm.sdk.platformtools.o4.M(str);
        L.getClass();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            d55.o oVar = (d55.o) it.next();
            oVar.f226602c = L;
            oVar.a(L);
            java.lang.String description = oVar.getDescription();
            java.lang.StringBuilder sb6 = this.f226612b;
            sb6.append(description);
            sb6.append(";\n");
        }
    }
}
