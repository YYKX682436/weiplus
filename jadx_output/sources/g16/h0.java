package g16;

/* loaded from: classes15.dex */
public final class h0 implements g16.g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g16.h0 f267627a = new g16.h0();

    public g16.f0 a(java.lang.String representation) {
        w16.e eVar;
        g16.f0 d0Var;
        kotlin.jvm.internal.o.g(representation, "representation");
        char charAt = representation.charAt(0);
        w16.e[] values = w16.e.values();
        int length = values.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i17];
            if (eVar.h().charAt(0) == charAt) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            return new g16.e0(eVar);
        }
        if (charAt == 'V') {
            return new g16.e0(null);
        }
        if (charAt == '[') {
            java.lang.String substring = representation.substring(1);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            d0Var = new g16.c0(a(substring));
        } else {
            if (charAt == 'L') {
                r26.n0.E(representation, ';', false, 2, null);
            }
            java.lang.String substring2 = representation.substring(1, representation.length() - 1);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            d0Var = new g16.d0(substring2);
        }
        return d0Var;
    }

    public g16.d0 b(java.lang.String internalName) {
        kotlin.jvm.internal.o.g(internalName, "internalName");
        return new g16.d0(internalName);
    }

    public java.lang.String c(g16.f0 type) {
        java.lang.String h17;
        kotlin.jvm.internal.o.g(type, "type");
        if (type instanceof g16.c0) {
            return "[" + c(((g16.c0) type).f267599i);
        }
        if (type instanceof g16.e0) {
            w16.e eVar = ((g16.e0) type).f267616i;
            return (eVar == null || (h17 = eVar.h()) == null) ? androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED : h17;
        }
        if (!(type instanceof g16.d0)) {
            throw new jz5.j();
        }
        return "L" + ((g16.d0) type).f267603i + ';';
    }
}
