package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f158155a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Byte f158156b;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = null;
        if (context != null) {
            try {
                com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(context.getFilesDir());
                if (!j17.m()) {
                    j17.J();
                }
                str = j17.toString();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", e17.getMessage());
            }
        }
        sb6.append(str);
        sb6.append("/kvcomm/exception/");
        java.lang.String sb7 = sb6.toString();
        f158155a = sb7;
        f158156b = new java.lang.Byte((byte) 0);
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            return;
        }
        com.tencent.mm.vfs.w6.u(sb7);
    }

    public static java.lang.String a() {
        java.lang.String a17 = bm5.f1.a();
        if (a17 == null || a17.length() == 0) {
            return "MM";
        }
        java.lang.String[] split = a17.split(":");
        return split.length <= 1 ? "MM" : split[1];
    }

    public static byte[] b(int i17) {
        return new byte[]{(byte) ((i17 >> 24) & 255), (byte) ((i17 >> 16) & 255), (byte) ((i17 >> 8) & 255), (byte) (i17 & 255)};
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0200 A[Catch: all -> 0x02ea, TryCatch #7 {, blocks: (B:4:0x0007, B:6:0x000f, B:7:0x0025, B:10:0x0027, B:12:0x0032, B:13:0x0043, B:15:0x0045, B:17:0x0049, B:19:0x004d, B:21:0x02e1, B:22:0x005a, B:37:0x02de, B:24:0x006f, B:130:0x0076, B:30:0x0097, B:33:0x00a1, B:40:0x00b8, B:128:0x00be, B:42:0x00d5, B:44:0x00df, B:46:0x00e4, B:49:0x00fc, B:56:0x013e, B:58:0x0162, B:62:0x0173, B:68:0x0178, B:70:0x0182, B:72:0x0187, B:75:0x0194, B:78:0x019f, B:81:0x01dc, B:83:0x0200, B:87:0x020b, B:96:0x0210, B:98:0x021b, B:100:0x0220, B:101:0x022f, B:103:0x0235, B:105:0x0281, B:108:0x0284, B:112:0x028c, B:114:0x02b0, B:118:0x02c3, B:126:0x02c7, B:133:0x02e8), top: B:3:0x0007, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c() {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.report.service.c0.c():void");
    }

    public static void d(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mars.smc.IDKey iDKey = (com.tencent.mars.smc.IDKey) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, id:" + iDKey.GetID() + ", key:" + iDKey.GetKey() + ", value:" + iDKey.GetValue() + ", isImportant:" + z17 + ", ignoreFreqCheck:" + z18);
        }
        java.lang.String str = f158155a;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, filepath:" + str + " not exist ");
            return;
        }
        java.lang.String a17 = a();
        if ("MM".equals(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + a17);
            return;
        }
        java.lang.String str2 = str + a17 + ".group_monitor";
        com.tencent.mm.plugin.report.service.h hVar = new com.tencent.mm.plugin.report.service.h();
        hVar.f158273d = arrayList.size();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mars.smc.IDKey iDKey2 = (com.tencent.mars.smc.IDKey) it6.next();
            com.tencent.mm.plugin.report.service.i iVar = new com.tencent.mm.plugin.report.service.i();
            iVar.f158276d = (int) iDKey2.GetID();
            iVar.f158277e = (int) iDKey2.GetKey();
            iVar.f158278f = (int) iDKey2.GetValue();
            iVar.f158279g = z17;
            iVar.f158280h = z18;
            hVar.f158274e.add(iVar);
        }
        try {
            byte[] byteArray = hVar.toByteArray();
            if (byteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, null == temp.");
                return;
            }
            synchronized (f158156b) {
                if (com.tencent.mm.vfs.w6.a(str2, b(byteArray.length)) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write obj_len to file:" + str2 + " fail.");
                    return;
                }
                if (com.tencent.mm.vfs.w6.a(str2, byteArray) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, write object to file:" + str2 + " fail.");
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveGroupIDKeyData, IOException, detail:" + e17.getMessage());
        }
    }

    public static void e(int i17, int i18, int i19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, id:" + i17 + ", key:" + i18 + ", value:" + i19 + ", isImportant:" + z17);
        java.lang.String str = f158155a;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, filepath:" + str + " not exist , Id:" + i17 + ", key:" + i18 + ", value:" + i19 + ", isImportant:" + z17);
            return;
        }
        java.lang.String a17 = a();
        if ("MM".equals(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "error path, current processname:" + a17 + ", id:" + i17 + ", key:" + i18 + ", val:" + i19 + ", isImportant:" + z17);
            return;
        }
        java.lang.String str2 = str + a17 + ".monitor";
        com.tencent.mm.plugin.report.service.i iVar = new com.tencent.mm.plugin.report.service.i();
        iVar.f158276d = i17;
        iVar.f158277e = i18;
        iVar.f158278f = i19;
        iVar.f158279g = z17;
        try {
            byte[] byteArray = iVar.toByteArray();
            if (byteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, null == temp.");
                return;
            }
            synchronized (f158156b) {
                if (com.tencent.mm.vfs.w6.a(str2, b(byteArray.length)) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write obj_len to file:" + str2 + " fail.");
                    return;
                }
                if (com.tencent.mm.vfs.w6.a(str2, byteArray) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, write object to file:" + str2 + " fail.");
                }
                com.tencent.mm.vfs.w6.k(str2);
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + e17.getMessage());
        }
    }

    public static void f(int i17, int i18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.String str2 = f158155a;
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, filepath:" + str2 + " not exist , logId:" + i17 + ", type:" + i18 + ", val:" + str + ", isImportant:" + z18 + ", reportnow:" + z17 + ", ignoreFreqLimit:" + z19);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "saveKVcommData, logId:" + i17 + ", type:" + i18 + ", val:" + str + ", isImportant:" + z18 + ", reportnow:" + z17 + "," + z19);
        java.lang.String a17 = a();
        if ("MM".equals(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "error path, invalid processname:" + a17 + ", logId:" + i17 + ", type:" + i18 + ", val:" + str + ", isImportant:" + z18 + ", reportnow:" + z17 + ", ignoreFreqLimit:" + z19);
            return;
        }
        java.lang.String str3 = str2 + a17 + ".statictis_new2";
        com.tencent.mm.plugin.report.service.v vVar = new com.tencent.mm.plugin.report.service.v();
        vVar.f158312d = i17;
        vVar.f158316h = i18;
        vVar.f158313e = str;
        vVar.f158315g = z18;
        vVar.f158314f = z17;
        vVar.f158317i = z19;
        try {
            byte[] byteArray = vVar.toByteArray();
            if (byteArray == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, null == temp.");
                return;
            }
            synchronized (f158156b) {
                if (com.tencent.mm.vfs.w6.a(str3, b(byteArray.length)) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write obj_len to file:" + str3 + " fail.");
                    return;
                }
                if (com.tencent.mm.vfs.w6.a(str3, byteArray) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveKVcommData, write object to file:" + str3 + " fail.");
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReportManagerKvCheck", "saveIDKeyData, IOException, detail:" + e17.getMessage());
        }
    }
}
