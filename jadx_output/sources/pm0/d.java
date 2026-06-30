package pm0;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class d {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ long a(java.lang.String r28) {
        /*
            r0 = r28
            int r1 = r28.length()
            int r2 = r1 + 0
            if (r2 == 0) goto Lb4
            r3 = 10
            long r4 = (long) r3
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r9 = 0
            r10 = 1
            r11 = -1
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = -9223372036854775808
            if (r8 >= 0) goto L2a
            long r17 = r4 ^ r15
            int r17 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r17 >= 0) goto L27
            r17 = r6
            goto L40
        L27:
            r17 = 1
            goto L40
        L2a:
            long r17 = r13 / r4
            long r17 = r17 << r10
            long r19 = r17 * r4
            long r19 = r11 - r19
            long r19 = r19 ^ r15
            long r21 = r4 ^ r15
            int r19 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r19 < 0) goto L3c
            r11 = r10
            goto L3d
        L3c:
            r11 = r9
        L3d:
            long r11 = (long) r11
            long r17 = r17 + r11
        L40:
            char r11 = r0.charAt(r9)
            r12 = 43
            if (r11 != r12) goto L4b
            if (r2 <= r10) goto L4b
            r9 = r10
        L4b:
            r11 = r6
        L4c:
            if (r9 >= r1) goto Lb3
            char r2 = r0.charAt(r9)
            int r2 = java.lang.Character.digit(r2, r3)
            r3 = -1
            if (r2 == r3) goto Lad
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 < 0) goto La1
            int r3 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r3 > 0) goto La1
            if (r3 != 0) goto L95
            if (r8 >= 0) goto L77
            long r22 = r4 ^ r15
            int r3 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r3 >= 0) goto L70
            r6 = -1
            r19 = -1
            goto L91
        L70:
            r19 = -1
            long r22 = r19 - r4
        L74:
            r6 = r22
            goto L91
        L77:
            r19 = -1
            long r22 = r13 / r4
            long r22 = r22 << r10
            long r22 = r22 * r4
            long r22 = r19 - r22
            long r24 = r22 ^ r15
            long r26 = r4 ^ r15
            int r3 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r3 < 0) goto L8c
            r24 = r4
            goto L8e
        L8c:
            r24 = r6
        L8e:
            long r22 = r22 - r24
            goto L74
        L91:
            int r3 = (int) r6
            if (r2 > r3) goto La1
            goto L97
        L95:
            r19 = -1
        L97:
            long r11 = r11 * r4
            long r2 = (long) r2
            long r11 = r11 + r2
            int r9 = r9 + 1
            r3 = 10
            r6 = 0
            goto L4c
        La1:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Too large for unsigned long: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        Lad:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        Lb3:
            return r11
        Lb4:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "empty string"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pm0.d.a(java.lang.String):long");
    }
}
