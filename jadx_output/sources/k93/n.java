package k93;

/* loaded from: classes11.dex */
public class n implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f305920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.d5 f305921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k93.j f305922f;

    public n(k93.j jVar, int i17, f93.d5 d5Var) {
        this.f305922f = jVar;
        this.f305920d = i17;
        this.f305921e = d5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r1 != 3) goto L22;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            k93.j r0 = r9.f305922f
            int r1 = r0.f305901p
            r2 = 1
            if (r1 != r2) goto L80
            boolean r1 = r0.f305892d
            if (r1 == 0) goto L80
            int r1 = r11.getActionMasked()
            if (r1 == 0) goto L7a
            if (r1 == r2) goto L72
            r3 = 2
            if (r1 == r3) goto L38
            r2 = 3
            if (r1 == r2) goto L72
            goto L80
        L38:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.C
            long r3 = r3 - r5
            r5 = 100
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L80
            androidx.recyclerview.widget.g1 r1 = r0.f305900o
            if (r1 == 0) goto L80
            android.content.Context r11 = r0.f305898m
            android.content.res.Resources r11 = r11.getResources()
            r1 = 2131234656(0x7f080f60, float:1.8085484E38)
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r1)
            r10.setBackground(r11)
            int r10 = r9.f305920d
            r0.f305905t = r10
            androidx.recyclerview.widget.g1 r10 = r0.f305900o
            f93.d5 r11 = r9.f305921e
            r10.o(r11)
            java.lang.String r5 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = 1
            r4 = r9
            yj0.a.i(r3, r4, r5, r6, r7, r8)
            return r2
        L72:
            r1 = 0
            r0.C = r1
            r0.getClass()
            goto L80
        L7a:
            long r1 = java.lang.System.currentTimeMillis()
            r0.C = r1
        L80:
            android.view.View$OnTouchListener r0 = r0.f305911z
            if (r0 == 0) goto L87
            r0.onTouch(r10, r11)
        L87:
            java.lang.String r3 = "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$4"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = 0
            r2 = r9
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k93.n.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
