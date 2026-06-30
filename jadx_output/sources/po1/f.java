package po1;

/* loaded from: classes5.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final po1.g a(int i17) {
        po1.e eVar;
        po1.g gVar;
        po1.e[] eVarArr = po1.g.f357307e;
        int length = eVarArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr[i18];
            if (eVar.f357305c == i17) {
                break;
            }
            i18++;
        }
        return (eVar == null || (gVar = eVar.f357303a) == null) ? po1.g.f357311i : gVar;
    }
}
