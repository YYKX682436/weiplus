package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n7 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f151334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f151335g;

    public n7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, fm3.u uVar, r45.hf2 hf2Var, int i17) {
        this.f151332d = q7Var;
        this.f151333e = uVar;
        this.f151334f = hf2Var;
        this.f151335g = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r2 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if ((r2.getId() != 0) != false) goto L23;
     */
    @Override // com.tencent.mm.ui.xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mmOnActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = r18
            if (r1 != r2) goto Lc8
            r1 = -1
            r2 = r19
            if (r2 != r1) goto Lc8
            com.tencent.mm.plugin.mv.ui.uic.q7 r1 = r0.f151332d
            android.app.Activity r2 = r1.getContext()
            android.app.Activity r3 = r1.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131776291(0x7f105323, float:1.918405E38)
            java.lang.String r3 = r3.getString(r4)
            r4 = 0
            android.widget.Toast r2 = dp.a.makeText(r2, r3, r4)
            r2.show()
            java.lang.String r2 = "musicMv"
            fm3.u r3 = r0.f151333e
            kotlin.jvm.internal.o.g(r3, r2)
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f264137q
            r5 = 1
            r6 = 0
            r8 = 0
            if (r2 == 0) goto L49
            long r9 = r2.getId()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L42
            r9 = r5
            goto L43
        L42:
            r9 = r4
        L43:
            if (r9 == 0) goto L46
            goto L47
        L46:
            r2 = r8
        L47:
            if (r2 != 0) goto L59
        L49:
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r3.f264140t
            if (r2 == 0) goto L5a
            long r9 = r2.getId()
            int r3 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r3 == 0) goto L56
            goto L57
        L56:
            r5 = r4
        L57:
            if (r5 == 0) goto L5a
        L59:
            r8 = r2
        L5a:
            if (r8 == 0) goto Lc8
            r45.hf2 r11 = r0.f151334f
            fm3.u r12 = r0.f151333e
            int r2 = r0.f151335g
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            android.util.Pair r5 = new android.util.Pair
            long r6 = r8.getId()
            java.lang.String r6 = pm0.v.u(r6)
            java.lang.String r7 = r8.getObjectNonceId()
            java.lang.String r9 = ""
            if (r7 != 0) goto L7a
            r7 = r9
        L7a:
            r5.<init>(r6, r7)
            r3.add(r5)
            java.lang.Class<zy2.pa> r5 = zy2.pa.class
            i95.m r5 = i95.n0.c(r5)
            zy2.pa r5 = (zy2.pa) r5
            c61.w8 r5 = (c61.w8) r5
            r5.nj(r3, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "share mv to sns success "
            r3.<init>(r4)
            long r4 = r8.getId()
            java.lang.String r4 = pm0.v.u(r4)
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.lang.String r4 = r8.getObjectNonceId()
            if (r4 != 0) goto Lac
            goto Lad
        Lac:
            r9 = r4
        Lad:
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Mv.MusicMvShareUIC"
            com.tencent.mars.xlog.Log.i(r4, r3)
            fm3.j0 r9 = fm3.j0.f264078a
            android.app.Activity r10 = r1.getContext()
            r13 = 2
            r14 = 1
            java.lang.String r15 = ""
            r16 = r2
            r9.m(r10, r11, r12, r13, r14, r15, r16)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.n7.mmOnActivityResult(int, int, android.content.Intent):void");
    }
}
