package hr3;

/* loaded from: classes11.dex */
public class vg implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f284120e;

    public vg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, java.lang.String str) {
        this.f284120e = sayHiWithSnsPermissionUI;
        this.f284119d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r11 != 6) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$4"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r11)
            r4.add(r12)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r10
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r11 = r12.getAction()
            fo3.s r0 = fo3.s.INSTANCE
            r1 = 0
            r2 = 1
            java.lang.String r3 = "ce_ver_usr"
            if (r11 == 0) goto L3a
            if (r11 == r2) goto L33
            r4 = 5
            if (r11 == r4) goto L3a
            r2 = 6
            if (r11 == r2) goto L33
            goto L47
        L33:
            r0.H2(r3, r12)
            r0.Qa(r3)
            goto L47
        L3a:
            com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI r11 = r10.f284120e
            boolean[] r11 = r11.B1
            r11[r1] = r2
            java.lang.String r11 = "<VerifyUsr>"
            java.lang.String r12 = r10.f284119d
            r0.qb(r3, r11, r12)
        L47:
            java.lang.String r6 = "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI$4"
            java.lang.String r7 = "android/view/View$OnTouchListener"
            java.lang.String r8 = "onTouch"
            java.lang.String r9 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = 0
            r5 = r10
            yj0.a.i(r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.vg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
