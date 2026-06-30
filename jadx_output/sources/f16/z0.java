package f16;

/* loaded from: classes15.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f258787a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f258788b;

    /* renamed from: c, reason: collision with root package name */
    public jz5.l f258789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f16.a1 f258790d;

    public z0(f16.a1 a1Var, java.lang.String functionName) {
        kotlin.jvm.internal.o.g(functionName, "functionName");
        this.f258790d = a1Var;
        this.f258787a = functionName;
        this.f258788b = new java.util.ArrayList();
        this.f258789c = new jz5.l(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);
    }

    public final void a(java.lang.String type, f16.k... qualifiers) {
        f16.e1 e1Var;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(qualifiers, "qualifiers");
        java.util.List list = this.f258788b;
        if (qualifiers.length == 0) {
            e1Var = null;
        } else {
            kz5.v0 v0Var = new kz5.v0(new kz5.y(qualifiers));
            int d17 = kz5.b1.d(kz5.d0.q(v0Var, 10));
            if (d17 < 16) {
                d17 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
            java.util.Iterator it = v0Var.iterator();
            while (true) {
                kz5.w0 w0Var = (kz5.w0) it;
                if (!w0Var.hasNext()) {
                    break;
                }
                kz5.u0 u0Var = (kz5.u0) w0Var.next();
                linkedHashMap.put(java.lang.Integer.valueOf(u0Var.f314015a), (f16.k) u0Var.f314016b);
            }
            e1Var = new f16.e1(linkedHashMap);
        }
        ((java.util.ArrayList) list).add(new jz5.l(type, e1Var));
    }

    public final void b(java.lang.String type, f16.k... qualifiers) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(qualifiers, "qualifiers");
        kz5.v0 v0Var = new kz5.v0(new kz5.y(qualifiers));
        int d17 = kz5.b1.d(kz5.d0.q(v0Var, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = v0Var.iterator();
        while (true) {
            kz5.w0 w0Var = (kz5.w0) it;
            if (!w0Var.hasNext()) {
                this.f258789c = new jz5.l(type, new f16.e1(linkedHashMap));
                return;
            } else {
                kz5.u0 u0Var = (kz5.u0) w0Var.next();
                linkedHashMap.put(java.lang.Integer.valueOf(u0Var.f314015a), (f16.k) u0Var.f314016b);
            }
        }
    }

    public final void c(w16.e type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.String h17 = type.h();
        kotlin.jvm.internal.o.f(h17, "getDesc(...)");
        this.f258789c = new jz5.l(h17, null);
    }
}
