package nv;

/* loaded from: classes5.dex */
public final class s1 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final nv.s1 f340388d = new nv.s1();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r6 == mv.h0.f331512h) goto L12;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compare(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            mv.e0 r11 = (mv.e0) r11
            mv.e0 r12 = (mv.e0) r12
            long r0 = r11.f331494a
            long r2 = r12.f331494a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L11
            java.lang.String r11 = com.tencent.mm.sdk.platformtools.z.f193105a
            r11 = 0
            goto L6c
        L11:
            r4 = 1
            r5 = -1
            mv.h0 r6 = r11.f331495b
            mv.h0 r7 = r12.f331495b
            mv.f0 r8 = r11.f331496c
            mv.f0 r9 = r12.f331496c
            if (r8 != r9) goto L2a
            if (r6 != r7) goto L22
            long r0 = r0 - r2
        L20:
            int r11 = (int) r0
            goto L6c
        L22:
            mv.h0 r11 = mv.h0.f331512h
            if (r6 != r11) goto L28
        L26:
            r11 = r5
            goto L6c
        L28:
            r11 = r4
            goto L6c
        L2a:
            mv.f0 r0 = mv.f0.f331502e
            if (r8 != r0) goto L2f
            goto L26
        L2f:
            if (r9 != r0) goto L32
            goto L28
        L32:
            mv.f0 r0 = mv.f0.f331506i
            if (r8 != r0) goto L37
            goto L26
        L37:
            if (r9 != r0) goto L3a
            goto L28
        L3a:
            mv.h0 r0 = mv.h0.f331512h
            if (r6 != r0) goto L3f
            goto L26
        L3f:
            if (r7 != r0) goto L42
            goto L28
        L42:
            mv.f0 r0 = mv.f0.f331501d
            if (r8 == r0) goto L48
            if (r9 != r0) goto L66
        L48:
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.z.f193105a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "use removeStateByPkgId() instead push NORMAL info. info1="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = ", info2="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.RoamBackup.TaskStatusService"
            com.tencent.mars.xlog.Log.e(r1, r0)
        L66:
            long r0 = r11.f331494a
            long r11 = r12.f331494a
            long r0 = r0 - r11
            goto L20
        L6c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nv.s1.compare(java.lang.Object, java.lang.Object):int");
    }
}
