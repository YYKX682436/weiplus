package kr;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.panel.EmojiPanelRecyclerView f311291d;

    public c(com.tencent.mm.emoji.panel.EmojiPanelRecyclerView emojiPanelRecyclerView) {
        this.f311291d = emojiPanelRecyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
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
            com.tencent.mm.emoji.panel.EmojiPanelRecyclerView r0 = r5.f311291d
            boolean r1 = r0.f64902d2
            if (r1 != 0) goto L5a
            androidx.recyclerview.widget.f2 r1 = r0.getAdapter()
            boolean r2 = r1 instanceof lr.z
            if (r2 == 0) goto L11
            lr.z r1 = (lr.z) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L15
            goto L5a
        L15:
            float r2 = r0.touchX
            float r3 = r0.touchY
            android.view.View r2 = r0.k0(r2, r3)
            if (r2 != 0) goto L20
            goto L5a
        L20:
            int r3 = r0.u0(r2)
            com.tencent.mm.autogen.mmdata.rpt.EmoticonFastManagementStruct r4 = nr.f.f339045b
            r4.f56036h = r3
            ir.u0 r1 = r1.y(r3)
            gn5.b r3 = r0.f64916r2
            r4 = 0
            if (r3 == 0) goto L39
            boolean r1 = r3.a(r2, r1)
            r2 = 1
            if (r1 != r2) goto L39
            goto L3a
        L39:
            r2 = r4
        L3a:
            r0.f64903e2 = r2
            if (r2 == 0) goto L45
            com.tencent.mm.emoji.panel.EmojiPanelGroupView r1 = r0.f64915q2
            if (r1 == 0) goto L45
            r1.setScrollEnable(r4)
        L45:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "long press: "
            r1.<init>(r2)
            boolean r2 = r0.f64903e2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.f64900b2
            com.tencent.mars.xlog.Log.i(r0, r1)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.c.run():void");
    }
}
