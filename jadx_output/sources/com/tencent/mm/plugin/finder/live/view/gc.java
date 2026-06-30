package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class gc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f116335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116336e;

    public gc(r45.lv1 lv1Var, com.tencent.mm.plugin.finder.live.view.mc mcVar) {
        this.f116335d = lv1Var;
        this.f116336e = mcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindVisitorResultView$1$1"
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
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r11 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r11.<init>()
            r0 = 10
            r45.lv1 r1 = r10.f116335d
            com.tencent.mm.protobuf.g r0 = r1.getByteString(r0)
            r2 = 0
            if (r0 == 0) goto L30
            byte[] r0 = r0.g()
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 != 0) goto L35
        L33:
            r11 = r2
            goto L46
        L35:
            r11.parseFrom(r0)     // Catch: java.lang.Exception -> L39
            goto L46
        L39:
            r11 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r0, r11)
            goto L33
        L46:
            com.tencent.mm.plugin.finder.live.view.mc r0 = r10.f116336e
            if (r11 == 0) goto L73
            java.lang.Class<zy2.b6> r2 = zy2.b6.class
            i95.m r2 = i95.n0.c(r2)
            zy2.b6 r2 = (zy2.b6) r2
            r2.getClass()
            android.view.View r2 = r0.f116488f
            android.content.Context r4 = r2.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r4, r2)
            r6 = 0
            xc2.y2 r3 = xc2.y2.f453343a
            xc2.p0 r5 = new xc2.p0
            r5.<init>(r11)
            r5.f453252n = r6
            r7 = 0
            r8 = 8
            r9 = 0
            xc2.y2.i(r3, r4, r5, r6, r7, r8, r9)
            jz5.f0 r2 = jz5.f0.f302826a
        L73:
            if (r2 != 0) goto L7d
            java.lang.String r11 = r0.f116485c
            java.lang.String r2 = "visitorNoAttendResultContainer lottery_page_jump_info null"
            com.tencent.mars.xlog.Log.w(r11, r2)
        L7d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "visitorNoAttendResultContainer:"
            r11.<init>(r2)
            r2 = 6
            int r1 = r1.getInteger(r2)
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r0.b(r11)
            java.lang.String r11 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/view/LiveProductGiftCardWidget$bindVisitorResultView$1$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r10, r1, r2, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.gc.onClick(android.view.View):void");
    }
}
