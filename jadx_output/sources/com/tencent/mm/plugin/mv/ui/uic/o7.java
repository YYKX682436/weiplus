package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o7 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151347e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f151348f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f151349g;

    public o7(fm3.u uVar, com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, r45.hf2 hf2Var, int i17) {
        this.f151346d = uVar;
        this.f151347e = q7Var;
        this.f151348f = hf2Var;
        this.f151349g = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if ((r2.getId() != 0) != false) goto L23;
     */
    @Override // com.tencent.mm.ui.xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mmOnActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            r2 = r17
            if (r2 != r1) goto Lba
            r2 = -1
            r3 = r18
            if (r3 != r2) goto Lba
            java.lang.String r2 = "musicMv"
            fm3.u r3 = r0.f151346d
            kotlin.jvm.internal.o.g(r3, r2)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f264137q
            r4 = 0
            r5 = 0
            r7 = 0
            if (r2 == 0) goto L2c
            long r8 = r2.getId()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L25
            r8 = r1
            goto L26
        L25:
            r8 = r4
        L26:
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r2 = r7
        L2a:
            if (r2 != 0) goto L3c
        L2c:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f264140t
            if (r2 == 0) goto L3d
            long r8 = r2.getId()
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 == 0) goto L39
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L3d
        L3c:
            r7 = r2
        L3d:
            if (r7 == 0) goto Lba
            r45.hf2 r10 = r0.f151348f
            fm3.u r11 = r0.f151346d
            int r15 = r0.f151349g
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            android.util.Pair r2 = new android.util.Pair
            long r5 = r7.getId()
            java.lang.String r3 = pm0.v.u(r5)
            java.lang.String r5 = r7.getObjectNonceId()
            java.lang.String r6 = ""
            if (r5 != 0) goto L5d
            r5 = r6
        L5d:
            r2.<init>(r3, r5)
            r1.add(r2)
            java.lang.Class<zy2.pa> r2 = zy2.pa.class
            i95.m r2 = i95.n0.c(r2)
            zy2.pa r2 = (zy2.pa) r2
            c61.w8 r2 = (c61.w8) r2
            r2.nj(r1, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "share mv success "
            r1.<init>(r2)
            long r2 = r7.getId()
            java.lang.String r2 = pm0.v.u(r2)
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r7.getObjectNonceId()
            if (r2 != 0) goto L8f
            goto L90
        L8f:
            r6 = r2
        L90:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Mv.MusicMvShareUIC"
            com.tencent.mars.xlog.Log.i(r2, r1)
            java.lang.String r1 = "SendMsgUsernames"
            r2 = r19
            java.util.ArrayList r1 = r2.getStringArrayListExtra(r1)
            java.lang.String r2 = ";"
            java.lang.String r14 = com.tencent.mm.sdk.platformtools.t8.c1(r1, r2)
            fm3.j0 r8 = fm3.j0.f264078a
            com.tencent.mm.plugin.mv.ui.uic.q7 r1 = r0.f151347e
            android.app.Activity r9 = r1.getContext()
            r12 = 2
            r13 = 2
            kotlin.jvm.internal.o.d(r14)
            r8.m(r9, r10, r11, r12, r13, r14, r15)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.o7.mmOnActivityResult(int, int, android.content.Intent):void");
    }
}
