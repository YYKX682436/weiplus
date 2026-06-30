package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class ba implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173751d;

    public ba(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173751d = textStatusEditActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$locationClickListener$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r15)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r14
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            gm0.b0 r15 = gm0.j1.u()
            com.tencent.mm.storage.n3 r15 = r15.c()
            r0 = 274436(0x43004, float:3.84567E-40)
            r1 = 0
            java.lang.Object r15 = r15.l(r0, r1)
            boolean r0 = r15 instanceof java.lang.String
            if (r0 == 0) goto L33
            r1 = r15
            java.lang.String r1 = (java.lang.String) r1
        L33:
            boolean r15 = u11.c.f(r1)
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$locationClickListener$1"
            java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.Class<tb0.j> r6 = tb0.j.class
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity r7 = r14.f173751d
            if (r15 == 0) goto Lc5
            i95.m r15 = i95.n0.c(r6)
            tb0.j r15 = (tb0.j) r15
            androidx.appcompat.app.AppCompatActivity r8 = r7.getContext()
            sb0.f r15 = (sb0.f) r15
            r15.getClass()
            r15 = 1
            boolean r8 = j35.u.d(r8, r5, r15)
            if (r8 == 0) goto L77
            i95.m r8 = i95.n0.c(r6)
            tb0.j r8 = (tb0.j) r8
            androidx.appcompat.app.AppCompatActivity r9 = r7.getContext()
            sb0.f r8 = (sb0.f) r8
            r8.getClass()
            boolean r8 = j35.u.d(r9, r4, r15)
            if (r8 == 0) goto L77
            r8 = r15
            goto L78
        L77:
            r8 = 0
        L78:
            if (r8 != 0) goto Lf4
            gm0.b0 r8 = gm0.j1.u()
            com.tencent.mm.storage.n3 r8 = r8.c()
            com.tencent.mm.storage.u3 r9 = com.tencent.mm.storage.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Object r8 = r8.m(r9, r10)
            boolean r8 = kotlin.jvm.internal.o.b(r8, r10)
            if (r8 == 0) goto La9
            androidx.appcompat.app.AppCompatActivity r4 = r7.getContext()
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.m2.d()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6 = 2131770645(0x7f103d15, float:1.9172599E38)
            java.lang.String r5 = r7.getString(r6, r5)
            r6 = 30764(0x782c, float:4.311E-41)
            c71.b.c(r4, r5, r6, r15)
            goto Lc1
        La9:
            i95.m r15 = i95.n0.c(r6)
            tb0.j r15 = (tb0.j) r15
            androidx.appcompat.app.AppCompatActivity r6 = r7.getContext()
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            sb0.f r15 = (sb0.f) r15
            r15.getClass()
            r15 = 64
            j35.u.l(r6, r4, r15)
        Lc1:
            yj0.a.h(r14, r3, r2, r1, r0)
            return
        Lc5:
            i95.m r15 = i95.n0.c(r6)
            tb0.j r15 = (tb0.j) r15
            androidx.appcompat.app.AppCompatActivity r9 = r7.getContext()
            java.lang.String[] r10 = new java.lang.String[]{r5, r4}
            r11 = 64
            r12 = 0
            r13 = 0
            r8 = r15
            sb0.f r8 = (sb0.f) r8
            boolean r15 = r8.Di(r9, r10, r11, r12, r13)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "MicroMsg.TextStatus.TextStatusEditActivity"
            java.lang.String r6 = "summerper checkPermission checkLocation[%b]"
            com.tencent.mars.xlog.Log.i(r5, r6, r4)
            if (r15 != 0) goto Lf4
            yj0.a.h(r14, r3, r2, r1, r0)
            return
        Lf4:
            r7.H7()
            yj0.a.h(r14, r3, r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.textstatus.ui.ba.onClick(android.view.View):void");
    }
}
