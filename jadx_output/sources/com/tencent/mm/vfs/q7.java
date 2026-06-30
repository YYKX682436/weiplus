package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class q7 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f213142b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f213143c = false;

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.String f213144d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f213145e;

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.List f213147g;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r7 f213141a = new com.tencent.mm.vfs.r7(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f213146f = java.util.regex.Pattern.compile("^[0-9a-f]{32}$");

    public static synchronized void a(km0.b bVar) {
        synchronized (com.tencent.mm.vfs.q7.class) {
            boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
            f213142b = n17;
            boolean z17 = true;
            f213143c = !new java.io.File(bVar.f308989c.getFilesDir().getParentFile(), ".vfs").exists();
            android.content.Context context = bVar.f308989c;
            android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            com.tencent.mm.vfs.b3.E = context;
            com.tencent.mm.vfs.b3.H = com.tencent.mm.sdk.platformtools.z.f193112h;
            if (n17) {
                z17 = false;
            }
            com.tencent.mm.vfs.b3.G = z17;
            com.tencent.mm.vfs.b3.F = f213141a;
            com.tencent.mm.vfs.b3.I = new com.tencent.mm.vfs.q7$$a();
        }
    }

    public static java.util.List b(boolean z17) {
        java.lang.String str;
        java.util.HashSet hashSet = new java.util.HashSet();
        com.tencent.mm.vfs.q2 b17 = new com.tencent.mm.vfs.NativeFileSystem("${data}/MicroMsg").b(com.tencent.mm.vfs.a3.f212781a.c());
        java.lang.Iterable list = b17.list("");
        if (list == null) {
            list = java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.regex.Pattern pattern = f213146f;
            if (!hasNext) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it6.next();
                    if (hashSet.contains(pair.first)) {
                        com.tencent.mars.xlog.Log.w("VFS.VFSStrategy", "Detected accountSalt in data: " + ((java.lang.String) pair.first));
                        it6.remove();
                    }
                }
                if (z17) {
                    java.util.HashSet hashSet2 = new java.util.HashSet();
                    java.util.Iterator it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        android.util.Pair pair2 = (android.util.Pair) it7.next();
                        hashSet2.add((java.lang.String) pair2.first);
                        hashSet2.add((java.lang.String) pair2.second);
                    }
                    java.lang.Iterable<com.tencent.mm.vfs.x1> list2 = new com.tencent.mm.vfs.NativeFileSystem("${extData}/MicroMsg").b(com.tencent.mm.vfs.a3.f212781a.c()).list("");
                    if (list2 == null) {
                        list2 = java.util.Collections.emptyList();
                    }
                    for (com.tencent.mm.vfs.x1 x1Var : list2) {
                        if (x1Var.f213236f) {
                            java.lang.String str2 = x1Var.f213232b;
                            if (pattern.matcher(str2).matches() && !hashSet2.contains(str2)) {
                                com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", "Dropped account directory: " + str2);
                                arrayList.add(new android.util.Pair(java.lang.String.format("\u200b%04d", 0), str2));
                            }
                        }
                    }
                }
                return arrayList;
            }
            com.tencent.mm.vfs.x1 x1Var2 = (com.tencent.mm.vfs.x1) it.next();
            if (x1Var2.f213236f) {
                java.lang.String str3 = x1Var2.f213232b;
                if (pattern.matcher(str3).matches()) {
                    try {
                        java.io.InputStream a17 = b17.a(x1Var2.f213231a + "/account.mapping");
                        try {
                            byte[] bArr = new byte[32];
                            int i17 = 0;
                            while (i17 < 32) {
                                int read = a17.read(bArr, i17, 32 - i17);
                                if (read == -1) {
                                    break;
                                }
                                i17 += read;
                            }
                            str = new java.lang.String(bArr, 0, i17);
                            hashSet.add(str);
                            if (a17 != null) {
                                a17.close();
                            }
                        } catch (java.lang.Throwable th6) {
                            if (a17 != null) {
                                try {
                                    a17.close();
                                } catch (java.lang.Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                            }
                            throw th6;
                            break;
                        }
                    } catch (java.io.IOException e17) {
                        com.tencent.mars.xlog.Log.w("VFS.VFSStrategy", "No mapping for account '%s' : %s", str3, e17.getMessage());
                        str = str3;
                    }
                    arrayList.add(new android.util.Pair(str3, str));
                    com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", "Account pair: %s <-> %s", str3, str);
                } else {
                    continue;
                }
            }
        }
    }

    public static java.lang.String c(java.lang.String str) {
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        return com.tencent.mm.vfs.e7.f212911a.c(str);
    }

    public static java.util.List d() {
        java.util.List list = f213147g;
        if (list != null) {
            return list;
        }
        java.util.List b17 = b(false);
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        java.lang.String e17 = com.tencent.mm.vfs.e8.e(b3Var.c(), "account");
        java.lang.String e18 = com.tencent.mm.vfs.e8.e(b3Var.c(), "accountSalt");
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            if (((java.lang.String) pair.first).equals(e17) || ((java.lang.String) pair.first).equals("ee1da3ae2100e09165c2e52382cfe79f") || ((java.lang.String) pair.first).equals(e18) || ((java.lang.String) pair.second).equals(e18)) {
                it.remove();
            } else {
                com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", " * Other account pair: %s / %s", pair.first, pair.second);
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.util.Pair pair2 = (android.util.Pair) it6.next();
            hashSet.add((java.lang.String) pair2.first);
            hashSet.add((java.lang.String) pair2.second);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashSet);
        f213147g = arrayList2;
        return arrayList2;
    }

    public static boolean e(java.lang.String str) {
        com.tencent.mm.vfs.z7 d17 = com.tencent.mm.vfs.a3.f212781a.d(com.tencent.mm.vfs.z7.a(str));
        if (d17 == null || !"wcf".equals(d17.f213277d)) {
            return false;
        }
        com.tencent.mm.vfs.e7 e7Var = com.tencent.mm.vfs.e7.f212911a;
        java.lang.String fsName = d17.f213278e;
        kotlin.jvm.internal.o.g(fsName, "fsName");
        return kz5.v.g(com.tencent.mm.vfs.e7.f212915e, fsName, 0, 0, 6, null) >= 0;
    }

    public static void f(final int i17) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent>(a0Var) { // from class: com.tencent.mm.vfs.VFSStrategy$1
            {
                this.__eventId = 19430116;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.CoreAccountInitializationNotifiedEvent coreAccountInitializationNotifiedEvent) {
                if (!com.tencent.mm.vfs.q7.f213142b) {
                    return false;
                }
                jx3.f.INSTANCE.m(1146, i17, 0, 1, true);
                return false;
            }
        }.alive();
    }

    public static boolean g(java.lang.String str, long j17, int i17, boolean z17) {
        java.lang.String e17;
        int indexOf;
        if (com.tencent.mm.vfs.w6.j(str) || (e17 = com.tencent.mm.vfs.e8.e(com.tencent.mm.vfs.a3.f212781a.c(), "accountSalt")) == null || e17.isEmpty() || (indexOf = str.indexOf(e17)) < 0) {
            return false;
        }
        java.io.File file = new java.io.File(str);
        java.util.List<java.lang.String> d17 = d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length());
        for (java.lang.String str2 : d17) {
            sb6.setLength(0);
            sb6.append((java.lang.CharSequence) str, 0, indexOf);
            sb6.append(str2);
            sb6.append((java.lang.CharSequence) str, e17.length() + indexOf, str.length());
            java.io.File file2 = new java.io.File(sb6.toString());
            if (file2.isFile() && (j17 < 0 || file2.length() == j17)) {
                if (!z17) {
                    file2.renameTo(file);
                }
                com.tencent.mm.vfs.c1.f(i17);
                com.tencent.mars.xlog.Log.w("VFS.VFSStrategy", "Found wrong moving file: " + file.getAbsolutePath() + ", dryRun: " + z17);
                return true;
            }
        }
        return false;
    }

    public static void h(java.lang.String id6, boolean z17) {
        ((com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a()).b(id6);
        java.util.HashMap hashMap = com.tencent.mm.vfs.m3.f213071b;
        kotlin.jvm.internal.o.g(id6, "id");
        java.util.HashMap hashMap2 = com.tencent.mm.vfs.m3.f213071b;
        synchronized (hashMap2) {
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap2.get(id6);
            if (arrayList != null) {
                kz5.h0.B(arrayList, new com.tencent.mm.vfs.j3(z17));
            }
            if (z17) {
                com.tencent.mm.vfs.m3.f213072c.remove(id6);
            } else {
                com.tencent.mm.vfs.m3.f213072c.add(id6);
            }
        }
    }

    public static com.tencent.mm.vfs.t2 i(com.tencent.mm.vfs.t2 t2Var) {
        java.lang.String path;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.i("VFS.VFSStrategy", "Update SDCard status: isSDCardAvailAndSysPathOk = true");
        java.lang.String str = lp0.b.Y() + "/tencent";
        java.lang.String d07 = lp0.b.d0();
        java.io.File externalCacheDir = context.getExternalCacheDir();
        t2Var.e("sdFrom", str);
        t2Var.e("sdTo", externalCacheDir == null ? str : externalCacheDir.getParent());
        if (externalCacheDir == null) {
            path = str + "/MicroMsg";
        } else {
            path = externalCacheDir.getPath();
        }
        t2Var.e("sdToCache", path);
        t2Var.e("extSDFrom", d07);
        return t2Var;
    }
}
