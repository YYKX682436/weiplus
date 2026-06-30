package oj;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f345719a;

    public t(java.util.List list) {
        this.f345719a = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof oj.t) && kotlin.jvm.internal.o.b(this.f345719a, ((oj.t) obj).f345719a);
        }
        return true;
    }

    public int hashCode() {
        java.util.List list = this.f345719a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.String str = "\n";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        java.lang.String str2 = "%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s";
        java.lang.String format = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{"PSS", "RSS", "SIZE", "SWAP_PSS", "SH_C", "SH_D", "PRI_C", "PRI_D", "COUNT", "PERM", "NAME"}, 11));
        java.lang.String str3 = "java.lang.String.format(format, *args)";
        kotlin.jvm.internal.o.f(format, "java.lang.String.format(format, *args)");
        sb6.append(format);
        sb6.append("\n");
        java.lang.String format2 = java.lang.String.format("%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s     %s", java.util.Arrays.copyOf(new java.lang.Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        kotlin.jvm.internal.o.f(format2, "java.lang.String.format(format, *args)");
        sb6.append(format2);
        sb6.append("\n");
        java.util.List list = this.f345719a;
        kotlin.jvm.internal.o.d(list);
        for (java.util.Iterator it = list.iterator(); it.hasNext(); it = it) {
            oj.d0 d0Var = (oj.d0) it.next();
            java.lang.String str4 = d0Var.f345688a;
            java.lang.String str5 = d0Var.f345689b;
            long j17 = d0Var.f345690c;
            long j18 = d0Var.f345691d;
            long j19 = d0Var.f345692e;
            java.lang.String str6 = str2;
            long j27 = d0Var.f345693f;
            long j28 = d0Var.f345694g;
            java.lang.String str7 = str;
            long j29 = d0Var.f345695h;
            java.lang.String str8 = str3;
            long j37 = d0Var.f345696i;
            long j38 = d0Var.f345697j;
            java.lang.String format3 = java.lang.String.format(str6, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(d0Var.f345698k), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Long.valueOf(j37), java.lang.Long.valueOf(j38), java.lang.Long.valueOf(j17), str5, str4}, 11));
            kotlin.jvm.internal.o.f(format3, str8);
            sb6.append(format3);
            str = str7;
            sb6.append(str);
            str2 = str6;
            str3 = str8;
        }
        java.lang.String format4 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{"----", "----", "----", "----", "----", "----", "----", "----", "----", "----", "----"}, 11));
        kotlin.jvm.internal.o.f(format4, str3);
        sb6.append(format4);
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "sb.toString()");
        return sb7;
    }
}
