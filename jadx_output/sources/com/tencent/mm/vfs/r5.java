package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class r5 implements com.tencent.mm.vfs.m5 {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.vfs.t5 f213159g = new com.tencent.mm.vfs.t5(new com.tencent.mm.vfs.NativeFileSystem(""));

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.o5 f213160a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f213161b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.vfs.t5 f213162c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f213163d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f213164e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f213165f = null;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r5(com.tencent.mm.vfs.o5 r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.r5.<init>(com.tencent.mm.vfs.o5):void");
    }

    public java.util.Map a() {
        if (this.f213164e == null) {
            this.f213164e = java.util.Collections.unmodifiableMap(this.f213160a.f213114e);
        }
        return this.f213164e;
    }

    public com.tencent.mm.vfs.q2 b(java.lang.String str) {
        com.tencent.mm.vfs.t5 t5Var = (com.tencent.mm.vfs.t5) ((java.util.LinkedHashMap) this.f213160a.f213111b).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.tencent.mm.vfs.q2) t5Var.a(a(), str);
    }

    public java.util.Map c() {
        if (this.f213163d == null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f213160a.f213111b).entrySet()) {
                linkedHashMap.put((java.lang.String) entry.getKey(), (com.tencent.mm.vfs.FileSystem) ((com.tencent.mm.vfs.t5) entry.getValue()).f213187a);
            }
            this.f213163d = java.util.Collections.unmodifiableMap(linkedHashMap);
        }
        return this.f213163d;
    }

    public com.tencent.mm.vfs.q2 d(java.lang.String str) {
        com.tencent.mm.vfs.t5 t5Var = (com.tencent.mm.vfs.t5) ((java.util.LinkedHashMap) this.f213160a.f213112c).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.tencent.mm.vfs.q2) t5Var.a(a(), str);
    }

    public android.util.Pair e(java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.vfs.q5 q5Var;
        java.lang.String str2;
        com.tencent.mm.vfs.q5 q5Var2;
        com.tencent.mm.vfs.q2 q2Var;
        java.lang.String str3 = null;
        if (str == null || str.isEmpty()) {
            return null;
        }
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
        java.lang.String replace = l17.replace('/', (char) 0);
        java.util.List list = this.f213161b;
        int binarySearch = java.util.Collections.binarySearch(list, replace);
        if (binarySearch >= 0) {
            q5Var2 = (com.tencent.mm.vfs.q5) list.get(binarySearch);
            str2 = "";
        } else {
            int i17 = (-binarySearch) - 2;
            while (true) {
                if (i17 >= 0) {
                    q5Var = (com.tencent.mm.vfs.q5) list.get(i17);
                    if (replace.startsWith(q5Var.f213067d) && replace.charAt(q5Var.f213067d.length()) == 0) {
                        break;
                    }
                    i17 = q5Var.f213138f;
                } else {
                    q5Var = null;
                    break;
                }
            }
            if (i17 >= 0) {
                l17 = l17.substring(q5Var.f213067d.length() + 1);
            } else if (!l17.isEmpty() && l17.charAt(0) == 0) {
                l17 = l17.substring(1);
            }
            str2 = l17;
            q5Var2 = q5Var;
        }
        if (q5Var2 == null) {
            q2Var = (com.tencent.mm.vfs.q2) this.f213162c.a(a(), "(root)");
        } else {
            com.tencent.mm.vfs.q2 q2Var2 = q5Var2.f213139g;
            java.lang.String str4 = q5Var2.f213068e;
            if (q2Var2 == null) {
                q5Var2.f213139g = b(str4);
            }
            q2Var = q5Var2.f213139g;
            str3 = str4;
        }
        if (strArr != null) {
            strArr[0] = str3;
        }
        return new android.util.Pair(q2Var, str2);
    }

    public com.tencent.mm.vfs.s5 f(java.lang.String str) {
        com.tencent.mm.vfs.t5 t5Var = (com.tencent.mm.vfs.t5) ((java.util.LinkedHashMap) this.f213160a.f213110a).get(str);
        if (t5Var == null) {
            return null;
        }
        return (com.tencent.mm.vfs.s5) t5Var.a(a(), str);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("schemes: ");
        com.tencent.mm.vfs.o5 o5Var = this.f213160a;
        sb6.append(o5Var.f213110a.size());
        sb6.append(", fileSystems: ");
        sb6.append(o5Var.f213111b.size());
        sb6.append(", mountPoints: ");
        sb6.append(((java.util.TreeMap) o5Var.f213113d).size());
        sb6.append(" (");
        sb6.append(this.f213161b);
        sb6.append(" active), envVars: ");
        sb6.append(o5Var.f213114e.size());
        return sb6.toString();
    }
}
