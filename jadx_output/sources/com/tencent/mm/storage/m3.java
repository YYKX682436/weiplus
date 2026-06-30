package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f195112a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f195113b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f195114c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f195115d;

    public m3(java.lang.String str) {
        boolean z17;
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "proxySwitch commandSwitch is [%b], xSwitch is [%b]", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("MMKVForStorageProxy_COMMAND_TAG").getBoolean("MMKVForStorageProxy_COMMAND_KEY", false)), java.lang.Boolean.TRUE);
        if (android.text.TextUtils.isEmpty(str)) {
            z17 = false;
        } else {
            java.lang.String name = new java.io.File(str).getName();
            z17 = (android.text.TextUtils.equals(name, "MM_stepcounter.cfg") || android.text.TextUtils.equals(name, "PUSH_stepcounter.cfg")) ? false : true;
            com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "selectFile name is %s, returnVal is %b", name, java.lang.Boolean.valueOf(z17));
        }
        boolean z18 = z17;
        this.f195112a = z18;
        if (z18) {
            java.io.File file = new java.io.File(str);
            java.lang.String absolutePath = file.getAbsolutePath();
            if (!android.text.TextUtils.equals(absolutePath, str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ConfigFileStorageProxyMMKV", "path is [%s], canonicalpath is [%s]", str, absolutePath);
            }
            if (!file.exists()) {
                h(43);
                k(absolutePath, false, 0L, 0L, 0L, null, null, null, 43, true);
            }
            this.f195113b = absolutePath;
            this.f195115d = com.tencent.mm.sdk.platformtools.o4.R(absolutePath);
        }
    }

    public final synchronized boolean a(java.util.Map map) {
        boolean z17;
        z17 = false;
        if (this.f195115d != null && map.size() != this.f195115d.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 size mmkv:%d, cfg:%d", java.lang.Long.valueOf(this.f195115d.g()), java.lang.Integer.valueOf(map.size()));
            if (map.containsKey(100001) && !this.f195115d.f(java.lang.Integer.toString(100001))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 mmkv not contain md time key");
                h(21);
                j(21, null);
                if (this.f195115d.g() != 0) {
                    h(22);
                    j(22, null);
                }
            }
            if (this.f195115d.g() != 0) {
                h(25);
                j(25, null);
            }
        }
        long d17 = d(100001, 0L);
        java.lang.Object obj = map.get(100001);
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(d17 == longValue);
        objArr[1] = java.lang.Long.valueOf(d17);
        objArr[2] = java.lang.Long.valueOf(this.f195115d.g());
        objArr[3] = java.lang.Long.valueOf(longValue);
        objArr[4] = java.lang.Integer.valueOf(map.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 time compare result is [%b], mmkvTime is [%s], size:%d, storageTime is [%s], size:[%d]", objArr);
        if (d17 == longValue) {
            f(map, d17, longValue);
        } else {
            z17 = e(map, d17, longValue);
        }
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.a0.b(com.tencent.mm.sdk.platformtools.x2.f193071a, o45.zf.f343040a, true);
        map.put(java.lang.Integer.valueOf(com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED), b17);
        l(com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED, b17);
        if (!this.f195115d.f(java.lang.Integer.toString(100001))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            map.put(100001, java.lang.Long.valueOf(currentTimeMillis));
            l(100001, java.lang.Long.valueOf(currentTimeMillis));
            h(30);
            j(30, null);
        }
        return z17;
    }

    public final boolean b(java.util.Map map) {
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.a0.b(com.tencent.mm.sdk.platformtools.x2.f193071a, o45.zf.f343040a, true);
        java.lang.Object obj = map.get(java.lang.Integer.valueOf(com.tencent.thumbplayer.utils.TPGlobalEventNofication.EVENT_ID_UPC_CHANGED));
        if (android.text.TextUtils.equals(obj instanceof java.lang.String ? (java.lang.String) obj : "0", "0")) {
            return false;
        }
        return !android.text.TextUtils.equals(b17, r5);
    }

    public java.lang.Object c(int i17, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f195115d;
        if (o4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv is null ,return default val");
            h(31);
            j(31, null);
            return obj;
        }
        com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject configFileStorageProxyMMKV$MMKVTypeObject = (com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject) o4Var.r(java.lang.String.valueOf(i17), com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject.class);
        if (configFileStorageProxyMMKV$MMKVTypeObject != null) {
            return configFileStorageProxyMMKV$MMKVTypeObject.f193705e;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value is null，get value fail");
        h(32);
        j(32, null);
        return obj;
    }

    public long d(int i17, long j17) {
        java.lang.Object c17 = c(i17, java.lang.Long.valueOf(j17));
        return c17 instanceof java.lang.Long ? ((java.lang.Long) c17).longValue() : j17;
    }

    public final boolean e(java.util.Map map, long j17, long j18) {
        long lastModified = 2 + (new java.io.File(this.f195113b).lastModified() / 1000);
        if (j18 >= j17) {
            m(map);
            if (j17 != 0 || j18 <= 0) {
                h(11);
            } else {
                h(7);
            }
            i(11, lastModified, j18, j17);
        } else {
            if (lastModified < j17) {
                h(12);
                i(12, lastModified, j18, j17);
                g(map);
                return true;
            }
            if (lastModified - j17 < 600) {
                h(15);
                i(15, lastModified, j18, j17);
                g(map);
                return true;
            }
            if (b(map)) {
                h(13);
                i(13, lastModified, j18, j17);
            } else {
                h(14);
                i(14, lastModified, j18, j17);
            }
            m(map);
        }
        return false;
    }

    public final boolean f(java.util.Map map, long j17, long j18) {
        if (j17 == 0) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            com.tencent.mm.sdk.platformtools.o4 o4Var = this.f195115d;
            objArr[0] = java.lang.Long.valueOf(o4Var != null ? o4Var.g() : 0L);
            objArr[1] = java.lang.Integer.valueOf(map.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "mmkv has no data, mmkv:%d, cfg:%d", objArr);
            m(map);
            return false;
        }
        long lastModified = 2 + (new java.io.File(this.f195113b).lastModified() / 1000);
        if (lastModified >= j17) {
            if (lastModified - j17 >= 600) {
                m(map);
                h(2);
                i(2, lastModified, j18, j17);
            } else {
                if (!b(map)) {
                    return false;
                }
                h(3);
                i(3, lastModified, j18, j17);
                m(map);
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            map.put(100001, java.lang.Long.valueOf(currentTimeMillis));
            l(100001, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            h(1);
            i(1, lastModified, j18, j17);
        }
        return false;
    }

    public void g(java.util.Map map) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f195115d;
        if (o4Var == null || map == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "mmKVCoverStorage storage size:[%d]", java.lang.Integer.valueOf(map.size()));
        map.clear();
        java.lang.String[] b17 = o4Var.b();
        if (b17 == null || b17.length == 0) {
            return;
        }
        for (java.lang.String str : b17) {
            try {
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
                com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject configFileStorageProxyMMKV$MMKVTypeObject = (com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject) o4Var.r(str, com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject.class);
                if (configFileStorageProxyMMKV$MMKVTypeObject != null) {
                    map.put(java.lang.Integer.valueOf(D1), configFileStorageProxyMMKV$MMKVTypeObject.f193705e);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value is null，get value fail");
                    h(32);
                    j(32, null);
                }
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", e17, "NumberFormatException", new java.lang.Object[0]);
            }
        }
    }

    public void h(int i17) {
        java.lang.String str;
        try {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i17);
            java.lang.String str2 = this.f195113b;
            if (android.text.TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                if (android.text.TextUtils.isEmpty(this.f195114c)) {
                    this.f195114c = new java.io.File(str2).getName();
                }
                str = this.f195114c;
            }
            objArr[1] = str;
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "compareV2 reportData, case is [%s], filename:[%s]", objArr);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ConfigFileStorageProxyMMKV", "reportIDKeyData stack", new java.lang.Object[0]);
            jx3.f.INSTANCE.idkeyStat(1041L, i17, 1L, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ConfigFileStorageProxyMMKV", th6, "reportIDKeyData error", new java.lang.Object[0]);
        }
    }

    public void i(int i17, long j17, long j18, long j19) {
        k(null, false, j17, j18, j19, null, null, null, i17, false);
    }

    public void j(int i17, java.lang.String str) {
        k(null, false, 0L, 0L, 0L, str, null, null, i17, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.lang.String r13, boolean r14, long r15, long r17, long r19, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, boolean r25) {
        /*
            r12 = this;
            java.lang.String r1 = "MicroMsg.ConfigFileStorageProxyMMKV"
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r2 = r12
            if (r0 == 0) goto L1b
            java.lang.String r0 = r2.f195113b
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L1b
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r4 = r3.exists()
            goto L1e
        L1b:
            r3 = 0
            r0 = r13
            r4 = r14
        L1e:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r6 = "null"
            if (r5 == 0) goto L28
            r0 = r6
        L28:
            r7 = 0
            int r5 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r5 != 0) goto L38
            if (r3 == 0) goto L38
            long r7 = r3.lastModified()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            goto L39
        L38:
            r7 = r15
        L39:
            if (r21 != 0) goto L3e
            java.lang.String r3 = ""
            goto L40
        L3e:
            r3 = r21
        L40:
            if (r22 != 0) goto L44
            r5 = r6
            goto L46
        L44:
            r5 = r22
        L46:
            if (r23 != 0) goto L49
            goto L4b
        L49:
            r6 = r23
        L4b:
            r9 = 0
            java.lang.String r10 = "%s,%s,%d,%d,%d,%s,%s,%s,%d,%s,%s"
            r11 = 11
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> La0
            r11[r9] = r0     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> La0
            r4 = 1
            r11[r4] = r0     // Catch: java.lang.Exception -> La0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> La0
            r4 = 2
            r11[r4] = r0     // Catch: java.lang.Exception -> La0
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Exception -> La0
            r4 = 3
            r11[r4] = r0     // Catch: java.lang.Exception -> La0
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Exception -> La0
            r4 = 4
            r11[r4] = r0     // Catch: java.lang.Exception -> La0
            r0 = 5
            r11[r0] = r3     // Catch: java.lang.Exception -> La0
            r0 = 6
            r11[r0] = r5     // Catch: java.lang.Exception -> La0
            r0 = 7
            r11[r0] = r6     // Catch: java.lang.Exception -> La0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)     // Catch: java.lang.Exception -> La0
            r3 = 8
            r11[r3] = r0     // Catch: java.lang.Exception -> La0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r25)     // Catch: java.lang.Exception -> La0
            r3 = 9
            r11[r3] = r0     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = bm5.f1.a()     // Catch: java.lang.Exception -> La0
            r3 = 10
            r11[r3] = r0     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = java.lang.String.format(r10, r11)     // Catch: java.lang.Exception -> La0
            java.lang.String r3 = "reportKVData [%s]"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> La0
            com.tencent.mars.xlog.Log.i(r1, r3, r0)     // Catch: java.lang.Exception -> La0
            goto La9
        La0:
            r0 = move-exception
            java.lang.String r3 = "reportKVData error"
            java.lang.Object[] r4 = new java.lang.Object[r9]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r0, r3, r4)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.m3.k(java.lang.String, boolean, long, long, long, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    public void l(int i17, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f195115d;
        if (o4Var == null) {
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.String simpleName = obj != null ? obj.getClass().getSimpleName() : "null";
        com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject configFileStorageProxyMMKV$MMKVTypeObject = new com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject(simpleName, obj);
        boolean C = o4Var.C(valueOf, configFileStorageProxyMMKV$MMKVTypeObject);
        java.lang.Object c17 = c(i17, null);
        if (!C) {
            h(18);
            j(18, valueOf);
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "write data fail");
        }
        if (c17 == null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = simpleName;
            objArr[1] = configFileStorageProxyMMKV$MMKVTypeObject.f193705e;
            objArr[2] = valueOf;
            objArr[3] = obj != null ? obj : "null";
            com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "innerObject set get data null, type:[%s], obj:[%s], key:[%s], value:[%s]", objArr);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ConfigFileStorageProxyMMKV", "innerObject stack", new java.lang.Object[0]);
            if (obj != null) {
                h(23);
                j(23, null);
            }
            if (((com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject) o4Var.r(valueOf, com.tencent.mm.storage.ConfigFileStorageProxyMMKV$MMKVTypeObject.class)) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "get mmkv value again, value is null");
                h(33);
                j(33, valueOf);
            }
        }
        if (obj == null || obj.equals(c17)) {
            return;
        }
        h(20);
        j(20, valueOf);
        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigFileStorageProxyMMKV", "set get data not equal, type:%s", simpleName);
    }

    public void m(java.util.Map map) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        if (map == null || (o4Var = this.f195115d) == null) {
            return;
        }
        o4Var.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigFileStorageProxyMMKV", "storageCoverMMKV storage size:[%d]", java.lang.Integer.valueOf(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            l(((java.lang.Integer) entry.getKey()).intValue(), entry.getValue());
        }
    }

    public synchronized void n(java.util.Map map) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        map.put(100001, java.lang.Long.valueOf(currentTimeMillis));
        l(100001, java.lang.Long.valueOf(currentTimeMillis));
        if (this.f195115d != null && map.size() != this.f195115d.g()) {
            h(24);
            j(24, null);
        }
    }
}
