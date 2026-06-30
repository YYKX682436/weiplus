package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class s7 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209776d;

    public s7(android.content.Context context) {
        this.f209776d = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_local_wechat_repair_entrance_flag_and, 0) == 1) goto L18;
     */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLongClick(android.view.View r13) {
        /*
            r12 = this;
            java.lang.String r0 = "com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$2"
            java.lang.String r1 = "android/view/View$OnLongClickListener"
            java.lang.String r2 = "onLongClick"
            java.lang.String r3 = "(Landroid/view/View;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r13)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r12
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.ui.t7 r0 = com.tencent.mm.ui.t7.f209881a
            android.content.Context r9 = r12.f209776d
            int r1 = com.tencent.mm.sdk.platformtools.z.f193112h
            r10 = 0
            r2 = 788529167(0x2f00000f, float:1.1641553E-10)
            r3 = 1
            if (r1 == r2) goto L30
            r2 = 788529166(0x2f00000e, float:1.1641552E-10)
            if (r1 != r2) goto L2e
            goto L30
        L2e:
            r1 = r10
            goto L31
        L30:
            r1 = r3
        L31:
            if (r1 != 0) goto L3c
            boolean r1 = z65.c.a()
            if (r1 == 0) goto L3a
            goto L3c
        L3a:
            r1 = r10
            goto L3d
        L3c:
            r1 = r3
        L3d:
            if (r1 != 0) goto L51
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r2 = e42.d0.clicfg_local_wechat_repair_entrance_flag_and
            h62.d r1 = (h62.d) r1
            int r1 = r1.Ni(r2, r10)
            if (r1 != r3) goto L93
        L51:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.tencent.mm.plugin.repairer.ui.RepairerMainUI"
            r1.setClassName(r9, r2)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/ui/HomeUISearchEntranceHelper"
            java.lang.String r4 = "goRepair"
            java.lang.String r5 = "(Landroid/content/Context;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r9
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.get(r10)
            android.content.Intent r1 = (android.content.Intent) r1
            r9.startActivity(r1)
            java.lang.String r2 = "com/tencent/mm/ui/HomeUISearchEntranceHelper"
            java.lang.String r3 = "goRepair"
            java.lang.String r4 = "(Landroid/content/Context;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r9
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        L93:
            java.lang.String r3 = "com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$2"
            java.lang.String r4 = "android/view/View$OnLongClickListener"
            java.lang.String r5 = "onLongClick"
            java.lang.String r6 = "(Landroid/view/View;)Z"
            r1 = 0
            r2 = r12
            yj0.a.i(r1, r2, r3, r4, r5, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.s7.onLongClick(android.view.View):boolean");
    }
}
