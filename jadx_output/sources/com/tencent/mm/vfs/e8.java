package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f212917a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f212918b;

    static {
        java.util.regex.Pattern.compile("\\$\\{([A-Za-z0-9_]+)\\}");
        f212917a = java.util.regex.Pattern.compile("([0-9.]+)\\s*([A-Za-z]*)");
        f212918b = java.util.regex.Pattern.compile("\\s*,\\s*");
    }

    public static java.lang.String a(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            return file.getCanonicalPath();
        } catch (java.io.IOException unused) {
            return file.getAbsolutePath();
        }
    }

    public static void b(android.os.Parcel parcel, java.lang.Class cls, int i17) {
        int hashCode = i17 ^ cls.getName().hashCode();
        int readInt = parcel.readInt();
        if (readInt != hashCode) {
            throw new com.tencent.mm.vfs.d8(cls, readInt, hashCode);
        }
    }

    public static java.lang.Iterable c(com.tencent.mm.vfs.q2 q2Var, com.tencent.mm.vfs.b8 b8Var) {
        return !(q2Var instanceof com.tencent.mm.vfs.p2) ? java.util.Collections.emptyList() : new pm5.b(((com.tencent.mm.vfs.p2) q2Var).E(), new com.tencent.mm.vfs.a8(b8Var));
    }

    public static void d(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException e17) {
            com.tencent.stubs.logger.Log.w("VFS.Utils", "Failed to close object: " + e17.toString());
        }
    }

    public static java.lang.String e(java.util.Map map, java.lang.String str) {
        java.lang.Object obj = map.get(str);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof java.lang.String[]) {
            return ((java.lang.String[]) obj)[0];
        }
        return null;
    }

    public static boolean f(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static java.lang.String g(long j17) {
        return j17 >= 1073741824 ? java.lang.String.format("%.1f GB", java.lang.Double.valueOf((j17 * 1.0d) / 1.073741824E9d)) : j17 >= 1048576 ? java.lang.String.format("%.1f MB", java.lang.Double.valueOf((j17 * 1.0d) / 1048576.0d)) : j17 >= 1024 ? java.lang.String.format("%.0f KB", java.lang.Double.valueOf((j17 * 1.0d) / 1024.0d)) : java.lang.String.format("%d Bytes", java.lang.Long.valueOf(j17));
    }

    public static java.lang.String h(long j17) {
        return j17 >= 86400000 ? java.lang.String.format("%.1f days", java.lang.Double.valueOf((j17 * 1.0d) / 8.64E7d)) : j17 >= 3600000 ? java.lang.String.format("%.1f hr", java.lang.Double.valueOf((j17 * 1.0d) / 3600000.0d)) : j17 >= 60000 ? java.lang.String.format("%.1f min", java.lang.Double.valueOf((j17 * 1.0d) / 60000.0d)) : j17 >= 1000 ? java.lang.String.format("%.1f s", java.lang.Double.valueOf((j17 * 1.0d) / 1000.0d)) : java.lang.String.format("%d ms", java.lang.Long.valueOf(j17));
    }

    public static java.lang.String i(java.lang.String str) {
        new java.util.ArrayList();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf <= 0) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static long j(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return 0L;
        }
        return new java.io.File(com.tencent.mm.vfs.a3.f212781a.f212823q, str.concat(".timestamp")).lastModified();
    }

    public static java.util.List k(java.lang.Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        if (iterable instanceof java.util.List) {
            return (java.util.List) iterable;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static java.lang.String l(java.lang.String str, boolean z17, boolean z18) {
        if (str.isEmpty()) {
            return str;
        }
        ?? startsWith = str.startsWith("/");
        if (str.endsWith("/") && str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = startsWith == true ? 1 : 0;
        boolean z19 = true;
        while (true) {
            int indexOf = str.indexOf(47, i17);
            if (indexOf < 0) {
                break;
            }
            java.lang.String substring = str.substring(i17, indexOf);
            if (z17 && "..".equals(substring)) {
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            } else if ((!z17 || !".".equals(substring)) && !substring.isEmpty()) {
                arrayList.add(substring);
                i17 = indexOf + 1;
                z19 = z19;
            }
            z19 = false;
            i17 = indexOf + 1;
            z19 = z19;
        }
        if (z19) {
            return z18 ? str.substring(startsWith == true ? 1 : 0) : str;
        }
        if (i17 < str.length()) {
            arrayList.add(str.substring(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!z18 && startsWith > 0) {
            sb6.append('/');
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            sb6.append(it.next());
            while (it.hasNext()) {
                sb6.append('/');
                sb6.append(it.next());
            }
        }
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m(java.lang.String r6, long r7) {
        /*
            if (r6 != 0) goto L3
            return r7
        L3:
            java.util.regex.Pattern r0 = com.tencent.mm.vfs.e8.f212917a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 != 0) goto L10
            return r7
        L10:
            r0 = 1
            java.lang.String r1 = r6.group(r0)     // Catch: java.lang.Throwable -> Laa
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.Throwable -> Laa
            r3 = 2
            java.lang.String r6 = r6.group(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r6 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Laa
            int r4 = r6.hashCode()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L8a
            r5 = 98
            if (r4 == r5) goto L81
            r0 = 103(0x67, float:1.44E-43)
            if (r4 == r0) goto L77
            r0 = 107(0x6b, float:1.5E-43)
            if (r4 == r0) goto L6d
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L63
            r0 = 3291(0xcdb, float:4.612E-42)
            if (r4 == r0) goto L59
            r0 = 3415(0xd57, float:4.785E-42)
            if (r4 == r0) goto L4f
            r0 = 3477(0xd95, float:4.872E-42)
            if (r4 == r0) goto L45
            goto L94
        L45:
            java.lang.String r0 = "mb"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 5
            goto L95
        L4f:
            java.lang.String r0 = "kb"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 3
            goto L95
        L59:
            java.lang.String r0 = "gb"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 7
            goto L95
        L63:
            java.lang.String r0 = "m"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 4
            goto L95
        L6d:
            java.lang.String r0 = "k"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = r3
            goto L95
        L77:
            java.lang.String r0 = "g"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 6
            goto L95
        L81:
            java.lang.String r3 = "b"
            boolean r6 = r6.equals(r3)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            goto L95
        L8a:
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L94
            r0 = 0
            goto L95
        L94:
            r0 = -1
        L95:
            switch(r0) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La1;
                case 3: goto La1;
                case 4: goto L9d;
                case 5: goto L9d;
                case 6: goto L99;
                case 7: goto L99;
                default: goto L98;
            }
        L98:
            return r7
        L99:
            r6 = 1073741824(0x40000000, double:5.304989477E-315)
            goto La6
        L9d:
            r6 = 1048576(0x100000, double:5.180654E-318)
            goto La6
        La1:
            r6 = 1024(0x400, double:5.06E-321)
            goto La6
        La4:
            r6 = 1
        La6:
            double r6 = (double) r6
            double r1 = r1 * r6
            long r6 = (long) r1
            return r6
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.e8.m(java.lang.String, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long n(java.lang.String r6, long r7) {
        /*
            if (r6 != 0) goto L3
            return r7
        L3:
            java.util.regex.Pattern r0 = com.tencent.mm.vfs.e8.f212917a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 != 0) goto L10
            return r7
        L10:
            r0 = 1
            java.lang.String r1 = r6.group(r0)     // Catch: java.lang.Throwable -> Ld3
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.Throwable -> Ld3
            r3 = 2
            java.lang.String r6 = r6.group(r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r6.toLowerCase()     // Catch: java.lang.Throwable -> Ld3
            int r4 = r6.hashCode()     // Catch: java.lang.Throwable -> Ld3
            if (r4 == 0) goto Laf
            r5 = 100
            if (r4 == r5) goto La4
            r5 = 104(0x68, float:1.46E-43)
            if (r4 == r5) goto L9a
            r5 = 109(0x6d, float:1.53E-43)
            if (r4 == r5) goto L90
            r5 = 115(0x73, float:1.61E-43)
            if (r4 == r5) goto L85
            r3 = 3338(0xd0a, float:4.678E-42)
            if (r4 == r3) goto L7b
            r3 = 3494(0xda6, float:4.896E-42)
            if (r4 == r3) goto L71
            r0 = 99228(0x1839c, float:1.39048E-40)
            if (r4 == r0) goto L66
            r0 = 108114(0x1a652, float:1.515E-40)
            if (r4 == r0) goto L5c
            r0 = 113745(0x1bc51, float:1.5939E-40)
            if (r4 == r0) goto L51
            goto Lb9
        L51:
            java.lang.String r0 = "sec"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 3
            goto Lba
        L5c:
            java.lang.String r0 = "min"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 5
            goto Lba
        L66:
            java.lang.String r0 = "day"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 9
            goto Lba
        L71:
            java.lang.String r3 = "ms"
            boolean r6 = r6.equals(r3)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            goto Lba
        L7b:
            java.lang.String r0 = "hr"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 7
            goto Lba
        L85:
            java.lang.String r0 = "s"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = r3
            goto Lba
        L90:
            java.lang.String r0 = "m"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 4
            goto Lba
        L9a:
            java.lang.String r0 = "h"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 6
            goto Lba
        La4:
            java.lang.String r0 = "d"
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 8
            goto Lba
        Laf:
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto Lb9
            r0 = 0
            goto Lba
        Lb9:
            r0 = -1
        Lba:
            switch(r0) {
                case 0: goto Lcd;
                case 1: goto Lcd;
                case 2: goto Lca;
                case 3: goto Lca;
                case 4: goto Lc6;
                case 5: goto Lc6;
                case 6: goto Lc2;
                case 7: goto Lc2;
                case 8: goto Lbe;
                case 9: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            return r7
        Lbe:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            goto Lcf
        Lc2:
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            goto Lcf
        Lc6:
            r6 = 60000(0xea60, double:2.9644E-319)
            goto Lcf
        Lca:
            r6 = 1000(0x3e8, double:4.94E-321)
            goto Lcf
        Lcd:
            r6 = 1
        Lcf:
            double r6 = (double) r6
            double r1 = r1 * r6
            long r6 = (long) r1
            return r6
        Ld3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.e8.n(java.lang.String, long):long");
    }

    public static java.lang.Iterable o(com.tencent.mm.vfs.q2 q2Var, java.lang.String str) {
        return p(q2Var, str, false, null);
    }

    public static java.lang.Iterable p(com.tencent.mm.vfs.q2 q2Var, java.lang.String str, boolean z17, com.tencent.mm.vfs.b8 b8Var) {
        java.lang.Iterable list = q2Var.list(str);
        if (list == null) {
            return null;
        }
        return new pm5.b(list, new com.tencent.mm.vfs.c8(q2Var, z17, b8Var));
    }

    public static com.tencent.mm.vfs.q2 q(com.tencent.mm.vfs.q2 q2Var, java.lang.String str, int i17) {
        while (q2Var instanceof com.tencent.mm.vfs.m0) {
            q2Var = ((com.tencent.mm.vfs.m0) q2Var).L(str, i17);
        }
        return q2Var;
    }

    public static java.lang.String r(com.tencent.mm.vfs.z7 z7Var, boolean z17) {
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
        if (!m17.a()) {
            return null;
        }
        com.tencent.mm.vfs.q2 q2Var = m17.f213266a;
        if ((q2Var.o() & 2) != 0) {
            return q2Var.D(m17.f213267b, z17);
        }
        return null;
    }

    public static long s(java.lang.String str) {
        return java.lang.System.currentTimeMillis() - j(str);
    }

    public static void t(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        java.io.File file = new java.io.File(com.tencent.mm.vfs.a3.f212781a.f212823q, str.concat(".timestamp"));
        try {
            file.createNewFile();
            file.setLastModified(java.lang.System.currentTimeMillis());
        } catch (java.io.IOException e17) {
            com.tencent.stubs.logger.Log.w("VFS.Utils", e17, "Unable to update timestamp: ".concat(str));
        }
    }

    public static void u(android.os.Parcel parcel, java.lang.Class cls, int i17) {
        parcel.writeInt(cls.getName().hashCode() ^ i17);
    }
}
