package zx5;

/* loaded from: classes13.dex */
public abstract class g {
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r10, int r11) {
        /*
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()
            java.lang.String r10 = r10.dataDir
            r0.<init>(r10)
            java.io.File[] r10 = r0.listFiles()
            r0 = -1
            java.lang.String r1 = "XWalkRuntimeRevertHelper"
            if (r10 != 0) goto L1a
            java.lang.String r10 = "revertToApkVer failed, files is null"
            by5.c4.f(r1, r10)
            return r0
        L1a:
            int r2 = org.xwalk.core.XWalkEnvironment.h()
            int r3 = r10.length
            r4 = 0
            r6 = r0
            r5 = r4
            r7 = r5
        L23:
            r8 = 1
            if (r5 >= r3) goto L41
            r9 = r10[r5]
            int r9 = by5.c1.e(r9)
            if (r9 >= 0) goto L2f
            goto L3e
        L2f:
            if (r9 != r11) goto L32
            r7 = r8
        L32:
            if (r9 > r11) goto L3e
            r8 = 2000(0x7d0, float:2.803E-42)
            if (r9 < r8) goto L3e
            if (r9 != r2) goto L3b
            goto L3e
        L3b:
            if (r9 <= r6) goto L3e
            r6 = r9
        L3e:
            int r5 = r5 + 1
            goto L23
        L41:
            if (r6 <= 0) goto L45
            r10 = r8
            goto L46
        L45:
            r10 = r4
        L46:
            java.lang.String r2 = "checkApkExist, no config file"
            if (r7 == 0) goto L62
            java.io.File r3 = by5.c1.f(r11)
            if (r3 != 0) goto L55
            by5.c4.c(r1, r2)
            r3 = r4
            goto L59
        L55:
            boolean r3 = by5.t.a(r11, r3)
        L59:
            if (r3 == 0) goto L62
            java.lang.String r0 = "revertToApkVer checkApkExist targetApk exist"
            by5.c4.f(r1, r0)
            r0 = r11
            goto L79
        L62:
            java.io.File r3 = by5.c1.f(r6)
            if (r3 != 0) goto L6c
            by5.c4.c(r1, r2)
            goto L70
        L6c:
            boolean r4 = by5.t.a(r6, r3)
        L70:
            if (r4 != 0) goto L78
            java.lang.String r2 = "revertToApkVer nAvailableOldVer targetApk not exist"
            by5.c4.f(r1, r2)
            goto L79
        L78:
            r0 = r6
        L79:
            if (r0 != r11) goto L81
            r10 = 89
            by5.s0.d(r10, r8)
            goto L96
        L81:
            if (r0 <= 0) goto L89
            r10 = 90
            by5.s0.d(r10, r8)
            goto L96
        L89:
            if (r10 == 0) goto L91
            r10 = 92
            by5.s0.d(r10, r8)
            goto L96
        L91:
            r10 = 91
            by5.s0.d(r10, r8)
        L96:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "revert from:"
            r10.<init>(r11)
            int r2 = org.xwalk.core.XWalkEnvironment.h()
            r10.append(r2)
            java.lang.String r2 = " to:"
            r10.append(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            by5.c4.f(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r11)
            int r11 = org.xwalk.core.XWalkEnvironment.h()
            r10.append(r11)
            r10.append(r2)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = by5.a.b()
            by5.u3.e(r0, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.g.a(android.content.Context, int):int");
    }
}
