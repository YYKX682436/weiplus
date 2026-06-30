package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class el implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hl f118264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f118266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f118267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118268h;

    public el(com.tencent.mm.plugin.finder.live.widget.hl hlVar, java.lang.String str, ce2.i iVar, boolean z17, java.lang.String str2) {
        this.f118264d = hlVar;
        this.f118265e = str;
        this.f118266f = iVar;
        this.f118267g = z17;
        this.f118268h = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r5 == null) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.live.widget.hl r0 = r13.f118264d
            com.tencent.mm.view.MMPAGView r1 = r0.f118573a
            r2 = 3
            r1.setScaleMode(r2)
            com.tencent.mm.view.MMPAGView r1 = r0.f118573a
            r3 = 0
            r1.setRepeatCount(r3)
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0
            r1.<init>()
            java.lang.String r4 = r13.f118265e
            r1.f310123d = r4
            ce2.i r4 = r13.f118266f
            boolean r5 = r4.a1()
            r6 = 0
            if (r5 == 0) goto L53
            r45.xi6 r5 = r4.field_switchSkinInfo
            r7 = 1
            if (r5 == 0) goto L2e
            r8 = 4
            boolean r5 = r5.getBoolean(r8)
            if (r5 != r7) goto L2e
            r5 = r7
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 == 0) goto L53
            r45.xi6 r4 = r4.field_switchSkinInfo
            if (r4 == 0) goto L4f
            r5 = 5
            java.lang.String r5 = r4.getString(r5)
            if (r5 == 0) goto L49
            int r8 = r5.length()
            if (r8 <= 0) goto L43
            r3 = r7
        L43:
            if (r3 == 0) goto L46
            goto L47
        L46:
            r5 = r6
        L47:
            if (r5 != 0) goto L4d
        L49:
            java.lang.String r5 = r4.getString(r2)
        L4d:
            if (r5 != 0) goto L51
        L4f:
            java.lang.String r5 = ""
        L51:
            r1.f310123d = r5
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "customText:"
            r2.<init>(r3)
            java.lang.Object r3 = r1.f310123d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", useRfx:"
            r2.append(r3)
            boolean r3 = r13.f118267g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "FinderLiveGiftPlayPagWidget"
            com.tencent.mars.xlog.Log.i(r4, r2)
            ym5.l2 r2 = ym5.l2.f463424a
            com.tencent.mm.view.MMPAGView r2 = r0.f118573a
            ym5.j2[] r2 = ym5.j2.f463392d
            com.tencent.mm.view.MMPAGView r2 = r0.f118573a
            r2.o(r3)
            com.tencent.mm.plugin.finder.live.plugin.kn r7 = r0.f118574b
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310570c
            r9 = 0
            com.tencent.mm.plugin.finder.live.widget.dl r10 = new com.tencent.mm.plugin.finder.live.widget.dl
            java.lang.String r2 = r13.f118268h
            r10.<init>(r2, r0, r1, r6)
            r11 = 2
            r12 = 0
            com.tencent.mm.plugin.finder.live.util.y.m(r7, r8, r9, r10, r11, r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "playGiftAnimation launch timer by "
            r1.<init>(r3)
            com.tencent.mm.view.MMPAGView r0 = r0.f118573a
            long r5 = r0.c()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r1.append(r5)
            java.lang.String r0 = ", pagPath:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.tencent.mars.xlog.Log.i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.el.run():void");
    }
}
