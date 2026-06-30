package rq0;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f398720b = kz5.b1.e(new jz5.l("MagicEcsKFDynamicCard", rq0.a.f398716f));

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f398721a = new java.util.HashMap();

    public b() {
        kz5.h hVar = (kz5.h) rq0.a.f398718h;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (eVar.hasNext()) {
            rq0.a aVar = (rq0.a) eVar.next();
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("magicSclCover" + aVar.f398719d), true);
            if (i17 != null) {
                java.lang.String concat = i17.concat("/startup/cover");
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(concat);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                    com.tencent.mm.vfs.w6.u(concat);
                }
                this.f398721a.put(aVar, concat);
            }
        }
    }

    public final java.lang.String a(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.lang.String c17 = vq0.b.c(bizName);
        rq0.a aVar = rq0.a.f398715e;
        rq0.a aVar2 = (rq0.a) f398720b.getOrDefault(c17, aVar);
        java.util.HashMap hashMap = this.f398721a;
        java.lang.String str = (java.lang.String) hashMap.get(aVar2);
        if (str == null) {
            str = (java.lang.String) hashMap.get(aVar);
        }
        return str == null ? "" : str;
    }
}
