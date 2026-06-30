package ol;

/* loaded from: classes12.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r4, int r5, int r6) {
        /*
            java.lang.String r0 = "MicroMsg.Mix.AudioMixConfig"
            r1 = 1
            r2 = 0
            if (r4 > 0) goto L17
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            int r3 = rl.b.f397143a
            java.lang.String r3 = "sampleRate is illegal! %d"
            com.tencent.mars.xlog.Log.e(r0, r3, r4)
            goto L1e
        L17:
            r3 = 44100(0xac44, float:6.1797E-41)
            if (r4 != r3) goto L1e
            r4 = r1
            goto L1f
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L22
            return r2
        L22:
            r4 = 2
            if (r5 > 0) goto L35
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            int r3 = rl.b.f397143a
            java.lang.String r3 = "channels is illegal, %d"
            com.tencent.mars.xlog.Log.e(r0, r3, r5)
            goto L39
        L35:
            if (r5 != r4) goto L39
            r5 = r1
            goto L3a
        L39:
            r5 = r2
        L3a:
            if (r5 != 0) goto L3d
            return r2
        L3d:
            if (r6 > 0) goto L4e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            int r3 = rl.b.f397143a
            java.lang.String r3 = "encode is illegal, %d"
            com.tencent.mars.xlog.Log.e(r0, r3, r5)
        L4e:
            if (r6 != r4) goto L52
            r4 = r1
            goto L53
        L52:
            r4 = r2
        L53:
            if (r4 != 0) goto L56
            return r2
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.a.a(int, int, int):boolean");
    }

    public static boolean b(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3;
    }
}
