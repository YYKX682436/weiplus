package ix2;

/* loaded from: classes15.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView f295351d;

    public b(com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView finderEmojiPanelRecyclerView) {
        this.f295351d = finderEmojiPanelRecyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r1 == true) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            com.tencent.mm.plugin.finder.view.emoji.FinderEmojiPanelRecyclerView r0 = r5.f295351d
            boolean r1 = r0.f132024c2
            if (r1 != 0) goto L5f
            androidx.recyclerview.widget.f2 r1 = r0.getAdapter()
            boolean r2 = r1 instanceof lr.m0
            if (r2 == 0) goto L11
            lr.m0 r1 = (lr.m0) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L15
            goto L5f
        L15:
            float r2 = r0.touchX
            float r3 = r0.touchY
            android.view.View r2 = r0.k0(r2, r3)
            if (r2 != 0) goto L20
            goto L5f
        L20:
            int r3 = r0.u0(r2)
            java.lang.Class<com.tencent.mm.feature.emoji.api.b6> r4 = com.tencent.mm.feature.emoji.api.b6.class
            i95.m r4 = i95.n0.c(r4)
            com.tencent.mm.feature.emoji.api.b6 r4 = (com.tencent.mm.feature.emoji.api.b6) r4
            com.tencent.mm.feature.emoji.w0 r4 = (com.tencent.mm.feature.emoji.w0) r4
            r4.getClass()
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct r4 = nr.f.f339045b
            r4.f56036h = r3
            lr.z r1 = (lr.z) r1
            ir.u0 r1 = r1.y(r3)
            gn5.b r3 = r0.f132036o2
            if (r3 == 0) goto L47
            boolean r1 = r3.a(r2, r1)
            r2 = 1
            if (r1 != r2) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            r0.f132025d2 = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "long press: "
            r1.<init>(r2)
            boolean r0 = r0.f132025d2
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.FinderEmojiPanelRecyclerView"
            com.tencent.mars.xlog.Log.i(r1, r0)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ix2.b.run():void");
    }
}
