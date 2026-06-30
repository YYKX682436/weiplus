package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class d8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderAuthInfo f123617e;

    public d8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo) {
        this.f123616d = obVar;
        this.f123617e = finderAuthInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.String r0 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleAuthGenerator$3"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r17
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r16
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.report.b6 r7 = com.tencent.mm.plugin.finder.report.b6.f124969a
            com.tencent.mm.plugin.finder.profile.uic.ob r0 = r6.f123616d
            r45.qt2 r8 = r0.getContextObj()
            java.lang.String r9 = "profile_name_banner"
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 56
            r15 = 0
            com.tencent.mm.plugin.finder.report.b6.d(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r6.f123617e
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.getAuthGenerator()
            if (r2 == 0) goto L88
            java.lang.String r3 = r2.getUsername()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L51
            int r3 = r3.length()
            if (r3 <= 0) goto L4c
            r3 = r4
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r3 != r4) goto L51
            r3 = r4
            goto L52
        L51:
            r3 = r5
        L52:
            if (r3 == 0) goto L5d
            int r1 = r1.getVerify_status()
            r3 = 12
            if (r1 == r3) goto L5d
            goto L5e
        L5d:
            r4 = r5
        L5e:
            if (r4 == 0) goto L61
            goto L62
        L61:
            r2 = 0
        L62:
            if (r2 == 0) goto L88
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "finder_username"
            java.lang.String r2 = r2.getUsername()
            r1.putExtra(r3, r2)
            androidx.appcompat.app.AppCompatActivity r2 = r0.getActivity()
            xy2.c.c(r2, r1)
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r2 = com.tencent.mm.plugin.finder.assist.i0.class
            i95.m r2 = i95.n0.c(r2)
            com.tencent.mm.plugin.finder.assist.i0 r2 = (com.tencent.mm.plugin.finder.assist.i0) r2
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            r2.mk(r0, r1)
        L88:
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleAuthGenerator$3"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.uic.d8.onClick(android.view.View):void");
    }
}
