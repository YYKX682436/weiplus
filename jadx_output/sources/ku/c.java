package ku;

/* loaded from: classes5.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(l15.c cVar) {
        v05.b k17;
        v05.b k18;
        java.lang.String str = null;
        java.lang.String string = (cVar == null || (k18 = cVar.k()) == null) ? null : k18.getString(k18.f432315e + 12);
        if (string == null) {
            string = "";
        }
        if (cVar != null && (k17 = cVar.k()) != null) {
            str = k17.getString(k17.f368365d + 2);
        }
        java.lang.String str2 = str != null ? str : "";
        if (string.length() > 0) {
            if (str2.length() > 0) {
                return "[" + string + "] " + str2;
            }
        }
        if (str2.length() > 0) {
            return str2;
        }
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490482wb);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        return g17;
    }
}
