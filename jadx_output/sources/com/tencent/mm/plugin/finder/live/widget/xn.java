package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f120359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk2.e f120360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn(com.tencent.mm.plugin.finder.live.widget.zn znVar, gk2.e eVar) {
        super(0);
        this.f120359d = znVar;
        this.f120360e = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
    
        if ((r1.length() > 0) == true) goto L20;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r8 = this;
            com.tencent.mm.plugin.finder.live.widget.zn r0 = r8.f120359d
            int r1 = r0.f120598r
            r2 = 1
            int r1 = r1 + r2
            r0.f120598r = r1
            gk2.e r1 = r8.f120360e
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r4 = r1.a(r3)
            mm2.c1 r4 = (mm2.c1) r4
            int r4 = r4.U4
            int r5 = r0.f120598r
            int r4 = r4 - r5
            r5 = 5
            if (r4 <= r5) goto L53
            androidx.lifecycle.c1 r4 = r1.a(r3)
            mm2.c1 r4 = (mm2.c1) r4
            int r4 = r4.U4
            if (r4 <= 0) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onTimerUpdate adjustPauseTime:"
            r4.<init>(r5)
            int r5 = r0.f120598r
            r4.append(r5)
            java.lang.String r5 = ", liveData.anchorPauseTime:"
            r4.append(r5)
            androidx.lifecycle.c1 r5 = r1.a(r3)
            mm2.c1 r5 = (mm2.c1) r5
            int r5 = r5.U4
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r0.f120582b
            com.tencent.mars.xlog.Log.i(r5, r4)
            androidx.lifecycle.c1 r4 = r1.a(r3)
            mm2.c1 r4 = (mm2.c1) r4
            int r4 = r4.U4
            r0.f120598r = r4
        L53:
            android.widget.TextView r4 = r0.f120588h
            if (r4 != 0) goto L58
            goto L65
        L58:
            no0.l r5 = no0.m.f338730a
            int r6 = r0.f120598r
            java.lang.String r7 = ":"
            java.lang.String r5 = r5.b(r6, r7)
            r4.setText(r5)
        L65:
            androidx.lifecycle.c1 r4 = r1.a(r3)
            mm2.c1 r4 = (mm2.c1) r4
            int r5 = r0.f120598r
            r4.U4 = r5
            androidx.lifecycle.c1 r1 = r1.a(r3)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.X4
            r3 = 0
            if (r1 == 0) goto L86
            int r4 = r1.length()
            if (r4 <= 0) goto L82
            r4 = r2
            goto L83
        L82:
            r4 = r3
        L83:
            if (r4 != r2) goto L86
            goto L87
        L86:
            r2 = r3
        L87:
            if (r2 == 0) goto L98
            android.widget.TextView r0 = r0.f120587g
            java.lang.CharSequence r2 = r0.getText()
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 != 0) goto L98
            r0.setText(r1)
        L98:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.xn.invoke():java.lang.Object");
    }
}
