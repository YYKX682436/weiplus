package h6;

/* loaded from: classes14.dex */
public abstract class b {
    public static final java.lang.Object a(r5.c cVar, java.lang.Object data) {
        kotlin.jvm.internal.o.g(cVar, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.List list = cVar.f392518b;
        int size = list.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                jz5.l lVar = (jz5.l) list.get(i17);
                z5.b bVar = (z5.b) lVar.f302833d;
                if (((java.lang.Class) lVar.f302834e).isAssignableFrom(data.getClass()) && bVar.a(data)) {
                    data = bVar.d(data);
                }
                if (i18 > size) {
                    break;
                }
                i17 = i18;
            }
        }
        return data;
    }

    public static final v5.g b(r5.c cVar, java.lang.Object data, x36.m source, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(source, "source");
        java.util.List list = cVar.f392520d;
        int size = list.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                obj = list.get(i17);
                if (((v5.g) obj).a(source, str)) {
                    break;
                }
                if (i18 > size) {
                    break;
                }
                i17 = i18;
            }
        }
        obj = null;
        v5.g gVar = (v5.g) obj;
        if (gVar != null) {
            return gVar;
        }
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Unable to decode data. No decoder supports: ", data).toString());
    }

    public static final x5.g c(r5.c cVar, java.lang.Object data) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(cVar, "<this>");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.List list = cVar.f392519c;
        int size = list.size() - 1;
        if (size >= 0) {
            int i17 = 0;
            while (true) {
                int i18 = i17 + 1;
                obj = list.get(i17);
                jz5.l lVar = (jz5.l) obj;
                if (((java.lang.Class) lVar.f302834e).isAssignableFrom(data.getClass()) && ((x5.g) lVar.f302833d).a(data)) {
                    break;
                }
                if (i18 > size) {
                    break;
                }
                i17 = i18;
            }
        }
        obj = null;
        jz5.l lVar2 = (jz5.l) obj;
        if (lVar2 != null) {
            return (x5.g) lVar2.f302833d;
        }
        throw new java.lang.IllegalStateException(kotlin.jvm.internal.o.m("Unable to fetch data. No fetcher supports: ", data).toString());
    }
}
