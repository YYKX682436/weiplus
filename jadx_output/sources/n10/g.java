package n10;

/* loaded from: classes12.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final n10.h a(java.lang.String encodedName) {
        kotlin.jvm.internal.o.g(encodedName, "encodedName");
        kz5.h hVar = (kz5.h) n10.h.f334041g;
        hVar.getClass();
        kz5.e eVar = new kz5.e(hVar);
        while (eVar.hasNext()) {
            n10.h hVar2 = (n10.h) eVar.next();
            hVar2.getClass();
            if (kotlin.jvm.internal.o.b("text/plain", encodedName)) {
                return hVar2;
            }
        }
        throw new java.lang.NoSuchFieldException("No such ClipboardContentFormat: ".concat(encodedName));
    }
}
