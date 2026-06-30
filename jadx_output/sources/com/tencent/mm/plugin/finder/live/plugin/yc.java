package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ad f115184d;

    public yc(com.tencent.mm.plugin.finder.live.plugin.ad adVar) {
        this.f115184d = adVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            com.tencent.mm.plugin.finder.live.plugin.ad r0 = r14.f115184d
            android.view.View r1 = r0.f111868x
            r2 = 0
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r1.getTag()
            goto Ld
        Lc:
            r1 = r2
        Ld:
            boolean r3 = r1 instanceof java.lang.Boolean
            if (r3 == 0) goto L14
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L15
        L14:
            r1 = r2
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "expandCostLayout layoutFolded:"
            r3.<init>(r4)
            r3.append(r1)
            r4 = 33
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveChargePayLazyPlugin"
            com.tencent.mars.xlog.Log.i(r4, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.o.b(r1, r3)
            if (r1 != 0) goto L36
            return
        L36:
            android.view.View r4 = r0.f111868x
            if (r4 == 0) goto Lba
            int r1 = r4.getWidth()
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f111865u
            r5 = 0
            if (r3 == 0) goto L48
            int r3 = r3.getWidth()
            goto L49
        L48:
            r3 = r5
        L49:
            int r3 = r3 + r1
            android.widget.TextView r6 = r0.f111866v
            if (r6 == 0) goto L53
            int r6 = r6.getWidth()
            goto L54
        L53:
            r6 = r5
        L54:
            int r3 = r3 + r6
            android.widget.TextView r6 = r0.f111866v
            if (r6 == 0) goto L5e
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            goto L5f
        L5e:
            r6 = r2
        L5f:
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L66
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            goto L67
        L66:
            r6 = r2
        L67:
            if (r6 == 0) goto L80
            int r6 = r6.leftMargin
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r6.intValue()
            if (r7 <= 0) goto L76
            r5 = 1
        L76:
            if (r5 == 0) goto L79
            r2 = r6
        L79:
            if (r2 == 0) goto L80
            int r2 = r2.intValue()
            goto L8d
        L80:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131166972(0x7f0706fc, float:1.7948204E38)
            int r2 = r2.getDimensionPixelOffset(r5)
        L8d:
            int r2 = r2 + r3
            zl2.q4 r10 = zl2.q4.f473933a
            r7 = 150(0x96, double:7.4E-322)
            com.tencent.mm.plugin.finder.live.plugin.xc r9 = new com.tencent.mm.plugin.finder.live.plugin.xc
            r9.<init>(r4)
            r3 = r10
            r5 = r1
            r6 = r2
            r3.j(r4, r5, r6, r7, r9)
            com.tencent.mm.view.LazyPlayPAGView r6 = r0.D
            if (r6 == 0) goto Lba
            gm2.c1 r0 = gm2.c1.f273320a
            int r3 = r0.g()
            int r7 = r1 + r3
            int r0 = r0.g()
            int r8 = r2 + r0
            r0 = 150(0x96, double:7.4E-322)
            r11 = 0
            r12 = 16
            r13 = 0
            r5 = r10
            r9 = r0
            zl2.q4.k(r5, r6, r7, r8, r9, r11, r12, r13)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.yc.run():void");
    }
}
