package ot;

/* loaded from: classes12.dex */
public abstract class a {
    public static final v05.a a(r05.k kVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        java.lang.Object tagValue = kVar.getTagValue("appattach");
        if (tagValue instanceof v05.a) {
            return (v05.a) tagValue;
        }
        return null;
    }

    public static final r05.k b(l15.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        java.lang.Object tagValue = aVar.getTagValue("appmsg");
        if (tagValue instanceof r05.k) {
            return (r05.k) tagValue;
        }
        return null;
    }

    public static final int c(l15.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        java.lang.Object tagValue = aVar.getTagValue("appmsg");
        if (tagValue instanceof e14.k) {
            java.lang.Object tagValue2 = ((e14.k) tagValue).getTagValue("type");
            if (tagValue2 instanceof java.lang.Integer) {
                return ((java.lang.Number) tagValue2).intValue();
            }
        }
        return 0;
    }

    public static final int d(r05.k kVar) {
        c15.b j17;
        c15.c j18;
        kotlin.jvm.internal.o.g(kVar, "<this>");
        java.lang.Object tagValue = kVar.getTagValue("mmreader");
        if (!(tagValue instanceof c15.a) || (j17 = ((c15.a) tagValue).j()) == null || (j18 = j17.j()) == null) {
            return 0;
        }
        return j18.j();
    }

    public static final int e(r05.k kVar) {
        c15.d k17;
        kotlin.jvm.internal.o.g(kVar, "<this>");
        java.lang.Object tagValue = kVar.getTagValue("mmreader");
        if (!(tagValue instanceof c15.a) || (k17 = ((c15.a) tagValue).k()) == null) {
            return 0;
        }
        return k17.j();
    }
}
