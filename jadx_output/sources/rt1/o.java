package rt1;

/* loaded from: classes7.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p f399461d;

    public o(rt1.p pVar) {
        this.f399461d = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if ((r5.length() == 0) != false) goto L23;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController$initKeyboardLayoutForType$btnClickListener$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r10
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            rt1.p r0 = r10.f399461d
            rt1.m r0 = r0.f399468c
            if (r0 == 0) goto Lab
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.TextView"
            kotlin.jvm.internal.o.e(r11, r1)
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.CharSequence r11 = r11.getText()
            r1 = 0
            char r11 = r11.charAt(r1)
            rt1.l r0 = (rt1.l) r0
            android.widget.TextView[] r2 = r0.f399449f
            r3 = 0
            java.lang.String r4 = "charViews"
            if (r2 == 0) goto La7
            int r5 = r0.f399448e
            r2 = r2[r5]
            kotlin.jvm.internal.o.d(r2)
            java.lang.CharSequence r5 = r2.getText()
            java.lang.String r6 = ""
            if (r5 != 0) goto L4c
            r5 = r6
        L4c:
            android.widget.TextView[] r7 = r0.f399449f
            if (r7 == 0) goto La3
            int r8 = r0.f399448e
            r7 = r7[r8]
            kotlin.jvm.internal.o.d(r7)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.SPANNABLE
            r7.setText(r11, r8)
            java.lang.CharSequence r11 = r2.getText()
            if (r11 != 0) goto L67
            goto L68
        L67:
            r6 = r11
        L68:
            java.lang.String r11 = r5.toString()
            java.lang.String r2 = r6.toString()
            boolean r11 = kotlin.jvm.internal.o.b(r11, r2)
            r2 = 1
            if (r11 == 0) goto L8e
            rt1.q1 r11 = rt1.r1.f399481e
            long r6 = r11.a(r6)
            long r8 = r11.a(r5)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L8e
            int r11 = r5.length()
            if (r11 != 0) goto L8c
            r1 = r2
        L8c:
            if (r1 == 0) goto Lab
        L8e:
            int r11 = r0.f399448e
            int r11 = r11 + r2
            android.widget.TextView[] r1 = r0.f399449f
            if (r1 == 0) goto L9f
            int r1 = r1.length
            int r1 = r1 - r2
            int r11 = java.lang.Math.min(r11, r1)
            r0.b(r11)
            goto Lab
        L9f:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        La3:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        La7:
            kotlin.jvm.internal.o.o(r4)
            throw r3
        Lab:
            java.lang.String r11 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateEditKeyboardController$initKeyboardLayoutForType$btnClickListener$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r10, r1, r2, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.o.onClick(android.view.View):void");
    }
}
