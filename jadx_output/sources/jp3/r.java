package jp3;

/* loaded from: classes.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if ((r8.length == 0) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L12
            int r3 = r8.length()
            if (r3 != 0) goto L10
            goto L12
        L10:
            r3 = r1
            goto L13
        L12:
            r3 = r2
        L13:
            java.lang.String r4 = "toString(...)"
            if (r3 == 0) goto L1f
            java.lang.String r8 = r0.toString()
            kotlin.jvm.internal.o.f(r8, r4)
            return r8
        L1f:
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r8 = com.tencent.mm.vfs.z7.a(r8)
            r3.<init>(r8)
            boolean r8 = r3.y()
            if (r8 == 0) goto Laa
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r5 = "[doGetFileDirectoryMd5] folderName："
            r8.<init>(r5)
            java.lang.String r5 = r3.getName()
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            java.lang.String r5 = "MicroMsg.PalmPrintSdkManager"
            com.tencent.mars.xlog.Log.i(r5, r8)
            com.tencent.mm.vfs.r6[] r8 = r3.G()
            if (r8 == 0) goto L53
            int r3 = r8.length
            if (r3 != 0) goto L50
            r3 = r2
            goto L51
        L50:
            r3 = r1
        L51:
            if (r3 == 0) goto L54
        L53:
            r1 = r2
        L54:
            if (r1 != 0) goto Laa
            java.util.Iterator r8 = kotlin.jvm.internal.c.a(r8)
        L5a:
            r1 = r8
            kotlin.jvm.internal.b r1 = (kotlin.jvm.internal.b) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r1 = r1.next()
            com.tencent.mm.vfs.r6 r1 = (com.tencent.mm.vfs.r6) r1
            boolean r2 = r1.A()
            if (r2 == 0) goto L98
            java.lang.String r2 = r1.u()
            java.lang.String r2 = com.tencent.mm.vfs.w6.p(r2)
            r0.append(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "[doGetFileDirectoryMd5] fileNmae："
            r3.<init>(r6)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = "， md5："
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.tencent.mars.xlog.Log.i(r5, r1)
            goto L5a
        L98:
            boolean r2 = r1.y()
            if (r2 == 0) goto L5a
            java.lang.String r1 = r1.u()
            java.lang.String r1 = r7.a(r1)
            r0.append(r1)
            goto L5a
        Laa:
            java.lang.String r8 = r0.toString()
            kotlin.jvm.internal.o.f(r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jp3.r.a(java.lang.String):java.lang.String");
    }

    public final java.lang.String b() {
        return jp3.s.f301026c + "sdk";
    }

    public final java.lang.String c() {
        return b() + "/PalmRegister/models/";
    }

    public final java.lang.String d() {
        return b() + "/PalmRegister/libs/arm64-v8a/libYTBizPalmRegister.so";
    }

    public final synchronized void e() {
        if (jp3.s.f301027d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintSdkManager", "[tryLoadPalmLibrary] has load sdk");
        } else {
            if (com.tencent.mm.sdk.platformtools.z.f193115k) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintSdkManager", "[tryLoadPalmLibrary] load sdk arm64 : " + d());
                com.tencent.cso.CsoLoader.g(d());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintSdkManager", "[tryLoadPalmLibrary] is 32, not support!");
            }
            jp3.s.f301027d = true;
        }
    }
}
