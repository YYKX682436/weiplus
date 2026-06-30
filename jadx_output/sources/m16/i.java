package m16;

/* loaded from: classes15.dex */
public abstract class i implements k16.g {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f322895d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f322896a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f322897b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f322898c;

    static {
        java.lang.String g07 = kz5.n0.g0(kz5.c0.i('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        java.util.List i17 = kz5.c0.i(g07.concat("/Any"), g07.concat("/Nothing"), g07.concat("/Unit"), g07.concat("/Throwable"), g07.concat("/Number"), g07.concat("/Byte"), g07.concat("/Double"), g07.concat("/Float"), g07.concat("/Int"), g07.concat("/Long"), g07.concat("/Short"), g07.concat("/Boolean"), g07.concat("/Char"), g07.concat("/CharSequence"), g07.concat("/String"), g07.concat("/Comparable"), g07.concat("/Enum"), g07.concat("/Array"), g07.concat("/ByteArray"), g07.concat("/DoubleArray"), g07.concat("/FloatArray"), g07.concat("/IntArray"), g07.concat("/LongArray"), g07.concat("/ShortArray"), g07.concat("/BooleanArray"), g07.concat("/CharArray"), g07.concat("/Cloneable"), g07.concat("/Annotation"), g07.concat("/collections/Iterable"), g07.concat("/collections/MutableIterable"), g07.concat("/collections/Collection"), g07.concat("/collections/MutableCollection"), g07.concat("/collections/List"), g07.concat("/collections/MutableList"), g07.concat("/collections/Set"), g07.concat("/collections/MutableSet"), g07.concat("/collections/Map"), g07.concat("/collections/MutableMap"), g07.concat("/collections/Map.Entry"), g07.concat("/collections/MutableMap.MutableEntry"), g07.concat("/collections/Iterator"), g07.concat("/collections/MutableIterator"), g07.concat("/collections/ListIterator"), g07.concat("/collections/MutableListIterator"));
        f322895d = i17;
        java.lang.Iterable Z0 = kz5.n0.Z0(i17);
        int d17 = kz5.b1.d(kz5.d0.q(Z0, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        while (true) {
            kz5.w0 w0Var = (kz5.w0) it;
            if (!w0Var.hasNext()) {
                return;
            }
            kz5.u0 u0Var = (kz5.u0) w0Var.next();
            linkedHashMap.put((java.lang.String) u0Var.f314016b, java.lang.Integer.valueOf(u0Var.f314015a));
        }
    }

    public i(java.lang.String[] strings, java.util.Set localNameIndices, java.util.List records) {
        kotlin.jvm.internal.o.g(strings, "strings");
        kotlin.jvm.internal.o.g(localNameIndices, "localNameIndices");
        kotlin.jvm.internal.o.g(records, "records");
        this.f322896a = strings;
        this.f322897b = localNameIndices;
        this.f322898c = records;
    }

    @Override // k16.g
    public java.lang.String a(int i17) {
        return getString(i17);
    }

    @Override // k16.g
    public boolean b(int i17) {
        return this.f322897b.contains(java.lang.Integer.valueOf(i17));
    }

    @Override // k16.g
    public java.lang.String getString(int i17) {
        java.lang.String str;
        l16.p pVar = (l16.p) this.f322898c.get(i17);
        int i18 = pVar.f315073e;
        if ((i18 & 4) == 4) {
            java.lang.Object obj = pVar.f315076h;
            if (obj instanceof java.lang.String) {
                str = (java.lang.String) obj;
            } else {
                p16.g gVar = (p16.g) obj;
                gVar.getClass();
                try {
                    java.lang.String r17 = gVar.r(com.tencent.mapsdk.internal.rv.f51270c);
                    if (gVar.l()) {
                        pVar.f315076h = r17;
                    }
                    str = r17;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            }
        } else {
            if ((i18 & 2) == 2) {
                java.util.List list = f322895d;
                int size = list.size();
                int i19 = pVar.f315075g;
                if (i19 >= 0 && i19 < size) {
                    str = (java.lang.String) list.get(i19);
                }
            }
            str = this.f322896a[i17];
        }
        if (pVar.f315078m.size() >= 2) {
            java.util.List list2 = pVar.f315078m;
            kotlin.jvm.internal.o.d(list2);
            java.lang.Integer num = (java.lang.Integer) list2.get(0);
            java.lang.Integer num2 = (java.lang.Integer) list2.get(1);
            kotlin.jvm.internal.o.d(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                kotlin.jvm.internal.o.d(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    kotlin.jvm.internal.o.f(str, "substring(...)");
                }
            }
        }
        java.lang.String str2 = str;
        if (pVar.f315080o.size() >= 2) {
            java.util.List list3 = pVar.f315080o;
            kotlin.jvm.internal.o.d(list3);
            java.lang.Integer num3 = (java.lang.Integer) list3.get(0);
            java.lang.Integer num4 = (java.lang.Integer) list3.get(1);
            kotlin.jvm.internal.o.d(str2);
            str2 = r26.i0.u(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        java.lang.String str3 = str2;
        l16.o oVar = pVar.f315077i;
        if (oVar == null) {
            oVar = l16.o.NONE;
        }
        int ordinal = oVar.ordinal();
        if (ordinal == 1) {
            kotlin.jvm.internal.o.d(str3);
            str3 = r26.i0.u(str3, '$', '.', false, 4, null);
        } else if (ordinal == 2) {
            if (str3.length() >= 2) {
                str3 = str3.substring(1, str3.length() - 1);
                kotlin.jvm.internal.o.f(str3, "substring(...)");
            }
            str3 = r26.i0.u(str3, '$', '.', false, 4, null);
        }
        kotlin.jvm.internal.o.d(str3);
        return str3;
    }
}
