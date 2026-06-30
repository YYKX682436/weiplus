package t85;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final t85.h f416471d = new t85.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String[] D = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(path)).D();
        if (D != null) {
            if (!(D.length == 0)) {
                java.util.ArrayList arrayList = new java.util.ArrayList(D.length);
                for (java.lang.String str : D) {
                    t85.f fVar = new t85.f();
                    java.lang.String str2 = path + str + '/';
                    kotlin.jvm.internal.o.g(str2, "<set-?>");
                    fVar.f416468d = str2;
                    java.lang.String jsonFile = fVar.f416468d + "config.json";
                    kotlin.jvm.internal.o.g(jsonFile, "jsonFile");
                    try {
                        fVar.a(new org.json.JSONObject(com.tencent.mm.vfs.w6.M(jsonFile)));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseJsonObject", e17, "", new java.lang.Object[0]);
                    }
                    arrayList.add(fVar);
                }
                return arrayList;
            }
        }
        return kz5.p0.f313996d;
    }
}
