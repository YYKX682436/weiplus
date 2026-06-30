package px1;

/* loaded from: classes12.dex */
public abstract class m<V, C extends px1.h> extends px1.u<V, C> {
    @Override // px1.u
    public final void a(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, java.lang.Object obj) {
        nx1.p paragraphsInSelection = wXRTEditText.getParagraphsInSelection();
        if (wXRTEditText.K) {
            int i17 = wXRTEditText.getSelection().f341315d;
            int i18 = paragraphsInSelection.f341315d;
            if (i17 == i18 && i18 > 1) {
                java.util.ArrayList d17 = d(wXRTEditText.getText(), paragraphsInSelection, px1.r.SPAN_FLAGS);
                if (!d17.isEmpty() && wXRTEditText.getLayout().getPrimaryHorizontal(wXRTEditText.getSelection().f341315d) == nx1.q.b()) {
                    java.util.Iterator it = d17.iterator();
                    while (it.hasNext()) {
                        wXRTEditText.getText().removeSpan(it.next());
                    }
                    wXRTEditText.getText().insert(paragraphsInSelection.f341315d - 1, "\n");
                }
            }
        }
        f(wXRTEditText, paragraphsInSelection, obj);
        px1.v.b(wXRTEditText, this);
    }

    @Override // px1.u
    public final nx1.p c(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText) {
        return wXRTEditText.getParagraphsInSelection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r12 == r13) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[SYNTHETIC] */
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
            java.lang.Class r4 = r16.getClass()
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            if (r4 != 0) goto L1d
            r1 = 0
            return r1
        L1d:
            int r5 = r4.length
            r6 = 1
            int r5 = r5 - r6
            r4 = r4[r5]
            java.lang.Class r4 = (java.lang.Class) r4
            int r5 = r2.f341315d
            int r7 = r2.f341316e
            java.lang.Object[] r4 = r1.getSpans(r5, r7, r4)
            int r5 = r4.length
            r7 = 0
            r8 = r7
        L2f:
            if (r8 >= r5) goto L91
            r9 = r4[r8]
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f341315d
            int r13 = r2.f341316e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L4c
            r15 = r19
            goto L68
        L4c:
            if (r14 >= r15) goto L51
        L4e:
            r15 = r19
            goto L66
        L51:
            if (r10 <= r12) goto L55
            if (r11 < r13) goto L4e
        L55:
            if (r12 <= r10) goto L5a
            if (r13 >= r11) goto L5a
            goto L4e
        L5a:
            px1.r r14 = px1.r.EXACT
            r15 = r19
            if (r15 != r14) goto L6a
            if (r10 != r12) goto L68
            if (r11 != r13) goto L68
            if (r12 != r13) goto L68
        L66:
            r10 = r6
            goto L89
        L68:
            r10 = r7
            goto L89
        L6a:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r13 = 18
            if (r11 != r12) goto L7f
            r11 = 34
            int[] r11 = new int[]{r11, r13}
            boolean r10 = r0.e(r10, r11)
            goto L89
        L7f:
            r11 = 17
            int[] r11 = new int[]{r11, r13}
            boolean r10 = r0.e(r10, r11)
        L89:
            if (r10 == 0) goto L8e
            r3.add(r9)
        L8e:
            int r8 = r8 + 1
            goto L2f
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: px1.m.d(android.text.Spannable, nx1.p, px1.r):java.util.ArrayList");
    }

    public abstract void f(com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText, nx1.p pVar, java.lang.Object obj);

    public void g(android.text.Spannable spannable, px1.l lVar, px1.o oVar) {
        oVar.b(d(spannable, lVar, px1.r.EXACT), lVar);
    }
}
