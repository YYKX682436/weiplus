package oz4;

/* loaded from: classes12.dex */
public abstract class e<V, C extends oz4.h> extends oz4.v<V, C> {
    @Override // oz4.v
    public mz4.t c(com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText) {
        return new mz4.t(wXRTEditText);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[SYNTHETIC] */
    @Override // oz4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList d(android.text.Spannable r17, mz4.t r18, oz4.u r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.f333350d
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            int r7 = r17.length()
            int r8 = r2.f333351e
            int r8 = r8 + r5
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Class<android.text.style.CharacterStyle> r8 = android.text.style.CharacterStyle.class
            java.lang.Object[] r4 = r1.getSpans(r4, r7, r8)
            int r7 = r4.length
            r8 = r6
        L27:
            if (r8 >= r7) goto L8b
            r9 = r4[r8]
            boolean r10 = r0.f(r9)
            if (r10 == 0) goto L86
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f333350d
            int r13 = r2.f333351e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L4b
            r13 = r19
        L49:
            r10 = r6
            goto L80
        L4b:
            if (r14 >= r15) goto L51
        L4d:
            r13 = r19
            r10 = r5
            goto L80
        L51:
            if (r10 <= r12) goto L55
            if (r11 < r13) goto L4d
        L55:
            if (r12 <= r10) goto L5a
            if (r13 >= r11) goto L5a
            goto L4d
        L5a:
            oz4.u r10 = oz4.u.EXACT
            r13 = r19
            if (r13 != r10) goto L61
            goto L49
        L61:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r14 = 18
            if (r11 != r12) goto L76
            r11 = 34
            int[] r11 = new int[]{r11, r14}
            boolean r10 = r0.e(r10, r11)
            goto L80
        L76:
            r11 = 17
            int[] r11 = new int[]{r11, r14}
            boolean r10 = r0.e(r10, r11)
        L80:
            if (r10 == 0) goto L88
            r3.add(r9)
            goto L88
        L86:
            r13 = r19
        L88:
            int r8 = r8 + 1
            goto L27
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oz4.e.d(android.text.Spannable, mz4.t, oz4.u):java.util.ArrayList");
    }

    public abstract boolean f(java.lang.Object obj);
}
