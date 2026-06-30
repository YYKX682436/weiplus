package xo;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final xo.b f455742a = new xo.b();

    public final java.util.Map a(java.lang.String cgroup) {
        kotlin.jvm.internal.o.g(cgroup, "cgroup");
        if (cgroup.length() == 0) {
            return kz5.q0.f314001d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.x0(r26.n0.f0(cgroup, new java.lang.String[]{"\n"}, false, 0, 6, null))) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String input = (java.lang.String) obj;
            if (!(r26.n0.u0(input).toString().length() == 0)) {
                java.util.List f07 = r26.n0.f0(input, new java.lang.String[]{":"}, false, 0, 6, null);
                if (f07.size() == 3) {
                    java.lang.Object obj2 = f07.get(1);
                    java.lang.CharSequence input2 = (java.lang.CharSequence) f07.get(2);
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[0-9]\\d*");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    kotlin.jvm.internal.o.g(input2, "input");
                    java.lang.String replaceAll = compile.matcher(input2).replaceAll("?");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    linkedHashMap.put(obj2, replaceAll);
                } else {
                    java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[0-9]\\d*");
                    kotlin.jvm.internal.o.f(compile2, "compile(...)");
                    kotlin.jvm.internal.o.g(input, "input");
                    java.lang.String replaceAll2 = compile2.matcher(input).replaceAll("?");
                    kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
                    linkedHashMap.put("line" + i17, replaceAll2);
                }
            }
            i17 = i18;
        }
        return linkedHashMap;
    }

    public final java.lang.String b(int i17) {
        java.lang.String str;
        if (i17 <= 0) {
            str = "/proc/self/cgroup";
        } else {
            try {
                str = "/proc/self/task/" + i17 + "/cgroup";
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(str);
        try {
            java.lang.String d17 = s46.d.d(u6Var, r26.c.f368865a);
            kotlin.jvm.internal.o.f(d17, "toString(...)");
            vz5.b.a(u6Var, null);
            return d17;
        } finally {
        }
    }
}
