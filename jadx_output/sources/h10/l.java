package h10;

/* loaded from: classes15.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final h10.m a(java.util.Map attr) {
        kotlin.jvm.internal.o.g(attr, "attr");
        int a17 = com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) attr.get("type"));
        int a18 = com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) attr.get("start"));
        int a19 = com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) attr.get("end"));
        h10.n nVar = h10.n.f278056d;
        if (a17 == 0) {
            return new h10.k(a18, a19, nVar);
        }
        h10.n nVar2 = h10.n.f278057e;
        if (a17 == 1) {
            java.lang.String str = (java.lang.String) attr.get("locale");
            return new h10.d(str != null ? str : "", a18, a19, nVar2);
        }
        h10.n nVar3 = h10.n.f278058f;
        if (a17 != 2) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) attr.get("url");
        return new h10.p(str2 != null ? str2 : "", a18, a19, nVar3);
    }
}
