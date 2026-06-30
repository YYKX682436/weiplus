package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f114426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce2.i f114427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f114428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114429g;

    public tm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, ce2.i iVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f114426d = bnVar;
        this.f114427e = iVar;
        this.f114428f = h0Var;
        this.f114429g = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            com.tencent.mm.plugin.finder.live.plugin.bn r0 = r14.f114426d
            com.tencent.mm.view.MMPAGView r1 = r0.f112052p
            r2 = 3
            r1.setScaleMode(r2)
            com.tencent.mm.view.MMPAGView r1 = r0.f112052p
            r3 = 0
            r1.setRepeatCount(r3)
            ce2.i r1 = r14.f114427e
            boolean r4 = r1.a1()
            java.lang.String r5 = ""
            kotlin.jvm.internal.h0 r6 = r14.f114428f
            if (r4 == 0) goto L4c
            r45.xi6 r4 = r1.field_switchSkinInfo
            r7 = 1
            if (r4 == 0) goto L28
            r8 = 4
            boolean r4 = r4.getBoolean(r8)
            if (r4 != r7) goto L28
            r4 = r7
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 == 0) goto L4c
            r45.xi6 r1 = r1.field_switchSkinInfo
            if (r1 == 0) goto L49
            r4 = 5
            java.lang.String r4 = r1.getString(r4)
            if (r4 == 0) goto L43
            int r8 = r4.length()
            if (r8 <= 0) goto L3d
            r3 = r7
        L3d:
            if (r3 == 0) goto L40
            goto L41
        L40:
            r4 = 0
        L41:
            if (r4 != 0) goto L47
        L43:
            java.lang.String r4 = r1.getString(r2)
        L47:
            if (r4 != 0) goto L4a
        L49:
            r4 = r5
        L4a:
            r6.f310123d = r4
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "customText:"
            r1.<init>(r2)
            java.lang.Object r2 = r6.f310123d
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderLiveGiftPlayPlugin"
            com.tencent.mars.xlog.Log.i(r2, r1)
            nn2.d r1 = nn2.d.f338671a
            rj.j r7 = r1.c()
            java.lang.String r1 = r14.f114429g
            if (r1 != 0) goto L6f
            r8 = r5
            goto L70
        L6f:
            r8 = r1
        L70:
            com.tencent.mm.view.MMPAGView r9 = r0.f112052p
            java.lang.Object r3 = r6.f310123d
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = 8
            r13 = 0
            rj.j.b(r7, r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.finder.live.plugin.bn.t1(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "playGiftAnimation launch timer by "
            r3.<init>(r4)
            com.tencent.mm.view.MMPAGView r0 = r0.f112052p
            long r4 = r0.c()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r3.append(r4)
            java.lang.String r0 = ", pagPath:"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.tm.run():void");
    }
}
