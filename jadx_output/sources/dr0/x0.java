package dr0;

/* loaded from: classes12.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dr0.x0 f242571a = new dr0.x0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f242572b = jz5.h.b(dr0.w0.f242568d);

    public final void a(java.lang.String stage, yz5.l builder) {
        kotlin.jvm.internal.o.g(stage, "stage");
        kotlin.jvm.internal.o.g(builder, "builder");
        if (((java.lang.Boolean) ((jz5.n) f242572b).getValue()).booleanValue()) {
            dr0.u0 u0Var = new dr0.u0(null, null, null, 7, null);
            builder.invoke(u0Var);
            java.util.ArrayList arrayList = (java.util.ArrayList) kz5.n0.V0(u0Var.f242558a);
            arrayList.add(0, stage);
            java.lang.Throwable th6 = u0Var.f242559b;
            java.util.Map map = u0Var.f242560c;
            if (map.isEmpty()) {
                map = null;
            }
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            ap.a.a(1, "procLifeFunnel", th6, map, (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        }
    }

    public final void b(java.lang.String stage, java.lang.String... steps) {
        kotlin.jvm.internal.o.g(stage, "stage");
        kotlin.jvm.internal.o.g(steps, "steps");
        if (((java.lang.Boolean) ((jz5.n) f242572b).getValue()).booleanValue()) {
            a(stage, new dr0.v0(steps));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r11, java.lang.String... r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr0.x0.c(java.lang.String, java.lang.String[]):void");
    }
}
