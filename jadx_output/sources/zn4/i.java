package zn4;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final zn4.i f474505a = new zn4.i();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f474506b = {'<', '>', '\"', '\'', '&', '\r', '\n', ' ', '\t'};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f474507c = {"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&#x0D;", "&#x0A;", "&#x20;", "&#x09;"};

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f474508d = jz5.h.b(zn4.g.f474503d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f474509e = jz5.h.b(zn4.h.f474504d);

    public final java.lang.String a(java.lang.String str) {
        boolean z17;
        if (str == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            int i18 = 8;
            while (true) {
                int i19 = i18 - 1;
                if (f474506b[i18] == charAt) {
                    stringBuffer.append(f474507c[i18]);
                    z17 = false;
                    break;
                }
                if (i19 < 0) {
                    z17 = true;
                    break;
                }
                i18 = i19;
            }
            if (i17 == length - 1 && java.lang.Character.isHighSurrogate(charAt)) {
                z17 = false;
            }
            if (z17) {
                stringBuffer.append(charAt);
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final e14.o b() {
        return (e14.o) ((jz5.n) f474508d).getValue();
    }

    public final e14.o c() {
        return (e14.o) ((jz5.n) f474509e).getValue();
    }
}
