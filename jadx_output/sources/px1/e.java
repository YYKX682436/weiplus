package px1;

/* loaded from: classes12.dex */
public abstract class e<V, C extends px1.h> extends px1.u<V, C> {
    @Override // px1.u
    public nx1.p c(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText) {
        return new nx1.p(wXRTEditText);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099 A[SYNTHETIC] */
    @Override // px1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList d(android.text.Spannable r17, nx1.p r18, px1.r r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.f341315d
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            int r7 = r17.length()
            int r8 = r2.f341316e
            int r8 = r8 + r5
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Class<android.text.style.CharacterStyle> r8 = android.text.style.CharacterStyle.class
            java.lang.Object[] r4 = r1.getSpans(r4, r7, r8)
            int r7 = r4.length
            r8 = r6
        L27:
            if (r8 >= r7) goto L9c
            r9 = r4[r8]
            boolean r10 = r9 instanceof com.tencent.mm.plugin.component.editor.model.nativenote.spans.BoldSpan
            if (r10 != 0) goto L3f
            boolean r10 = r9 instanceof android.text.style.StyleSpan
            if (r10 == 0) goto L3d
            r10 = r9
            android.text.style.StyleSpan r10 = (android.text.style.StyleSpan) r10
            int r10 = r10.getStyle()
            if (r10 != r5) goto L3d
            goto L3f
        L3d:
            r10 = r6
            goto L40
        L3f:
            r10 = r5
        L40:
            if (r10 == 0) goto L97
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f341315d
            int r13 = r2.f341316e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L5c
            r13 = r19
        L5a:
            r10 = r6
            goto L91
        L5c:
            if (r14 >= r15) goto L62
        L5e:
            r13 = r19
            r10 = r5
            goto L91
        L62:
            if (r10 <= r12) goto L66
            if (r11 < r13) goto L5e
        L66:
            if (r12 <= r10) goto L6b
            if (r13 >= r11) goto L6b
            goto L5e
        L6b:
            px1.r r10 = px1.r.EXACT
            r13 = r19
            if (r13 != r10) goto L72
            goto L5a
        L72:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r14 = 18
            if (r11 != r12) goto L87
            r11 = 34
            int[] r11 = new int[]{r11, r14}
            boolean r10 = r0.e(r10, r11)
            goto L91
        L87:
            r11 = 17
            int[] r11 = new int[]{r11, r14}
            boolean r10 = r0.e(r10, r11)
        L91:
            if (r10 == 0) goto L99
            r3.add(r9)
            goto L99
        L97:
            r13 = r19
        L99:
            int r8 = r8 + 1
            goto L27
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: px1.e.d(android.text.Spannable, nx1.p, px1.r):java.util.ArrayList");
    }
}
