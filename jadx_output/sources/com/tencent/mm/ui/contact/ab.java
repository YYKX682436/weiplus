package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public final class ab implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.contact.ab f206596a = new com.tencent.mm.ui.contact.ab();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r8.isShowing() == true) goto L13;
     */
    @Override // n13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "<anonymous parameter 2>"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r10 = "SelectPocketMoneyHelper"
            if (r8 == 0) goto L85
            java.lang.String r8 = "forwardDialogClick: user confirmed, start CGI request"
            com.tencent.mars.xlog.Log.i(r10, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "sendInviteCoManagerRequest start, username: "
            r8.<init>(r0)
            java.lang.String r0 = com.tencent.mm.ui.contact.bb.f206631c
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r10, r8)
            com.tencent.mm.ui.vas.VASActivity r0 = com.tencent.mm.ui.contact.bb.f206632d
            if (r0 != 0) goto L2b
            java.lang.String r8 = "sendInviteCoManagerRequest: activity is null"
            com.tencent.mars.xlog.Log.e(r10, r8)
            goto L8a
        L2b:
            android.app.Dialog r8 = com.tencent.mm.ui.contact.bb.f206633e
            if (r8 == 0) goto L37
            boolean r8 = r8.isShowing()
            r1 = 1
            if (r8 != r1) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 == 0) goto L46
            java.lang.String r8 = "[showCgiRequestLoading] dialog isShowing dismiss"
            com.tencent.mars.xlog.Log.i(r10, r8)
            android.app.Dialog r8 = com.tencent.mm.ui.contact.bb.f206633e
            if (r8 == 0) goto L46
            r8.dismiss()
        L46:
            r1 = 0
            r2 = 3
            r8 = 2131770608(0x7f103cf0, float:1.9172524E38)
            java.lang.String r3 = r0.getString(r8)
            r4 = 1
            r5 = 1
            com.tencent.mm.ui.contact.ya r6 = com.tencent.mm.ui.contact.ya.f207265d
            com.tencent.mm.ui.widget.dialog.u3 r8 = db5.e1.P(r0, r1, r2, r3, r4, r5, r6)
            com.tencent.mm.ui.contact.bb.f206633e = r8
            com.tencent.mm.ui.contact.o0 r8 = new com.tencent.mm.ui.contact.o0
            com.tencent.mm.ui.PocketMoneyEntryInfo r10 = com.tencent.mm.ui.contact.bb.f206630b
            r0 = 0
            if (r10 == 0) goto L63
            java.lang.String r1 = r10.f197044n
            goto L64
        L63:
            r1 = r0
        L64:
            java.lang.String r2 = com.tencent.mm.ui.contact.bb.f206631c
            if (r10 == 0) goto L6b
            java.lang.String r3 = r10.f197045o
            goto L6c
        L6b:
            r3 = r0
        L6c:
            if (r10 == 0) goto L70
            java.lang.String r0 = r10.f197046p
        L70:
            r8.<init>(r1, r2, r3, r0)
            pq5.g r8 = r8.l()
            com.tencent.mm.ui.vas.VASActivity r10 = com.tencent.mm.ui.contact.bb.f206632d
            r8.f(r10)
            com.tencent.mm.ui.contact.xa r10 = new com.tencent.mm.ui.contact.xa
            r10.<init>(r9)
            r8.K(r10)
            goto L8a
        L85:
            java.lang.String r8 = "forwardDialogClick: user canceled, keep SelectContactUI open"
            com.tencent.mars.xlog.Log.i(r10, r8)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.ab.a(boolean, java.lang.String, android.os.Bundle):void");
    }
}
