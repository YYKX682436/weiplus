package k23;

/* loaded from: classes12.dex */
public final class f1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.i1 f303569d;

    public f1(k23.i1 i1Var) {
        this.f303569d = i1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r9 != 3) goto L31;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtn$setupTouchListener$1"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r9)
            r4.add(r10)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r8
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r9 = r10.getAction()
            r0 = 0
            r1 = 1
            k23.i1 r2 = r8.f303569d
            if (r9 == 0) goto L70
            if (r9 == r1) goto L66
            r3 = 2
            if (r9 == r3) goto L32
            r10 = 3
            if (r9 == r10) goto L66
            goto L7a
        L32:
            float r9 = r10.getY()
            float r3 = k23.i1.a(r2)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L4c
            boolean r9 = r2.f303587f
            if (r9 != 0) goto L4c
            r2.f303587f = r1
            k23.d1 r9 = r2.f303586e
            if (r9 == 0) goto L79
            r9.e()
            goto L79
        L4c:
            float r9 = r10.getY()
            float r10 = k23.i1.a(r2)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L79
            boolean r9 = r2.f303587f
            if (r9 == 0) goto L79
            r2.f303587f = r0
            k23.d1 r9 = r2.f303586e
            if (r9 == 0) goto L79
            r9.b()
            goto L79
        L66:
            k23.d1 r9 = r2.f303586e
            if (r9 == 0) goto L79
            boolean r10 = r2.f303587f
            r9.g(r10)
            goto L79
        L70:
            r2.f303587f = r0
            k23.d1 r9 = r2.f303586e
            if (r9 == 0) goto L79
            r9.c()
        L79:
            r0 = r1
        L7a:
            java.lang.String r4 = "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtn$setupTouchListener$1"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r0
            r3 = r8
            yj0.a.i(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k23.f1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
