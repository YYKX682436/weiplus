package el2;

/* loaded from: classes3.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.u2 f253909d;

    public s2(el2.u2 u2Var) {
        this.f253909d = u2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (r0.f329273r == true) goto L10;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveVisitorBottomFolderWidget$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            el2.u2 r10 = r9.f253909d
            java.lang.String r10 = r10.f253923f
            java.lang.String r0 = "folder click"
            com.tencent.mars.xlog.Log.i(r10, r0)
            el2.u2 r10 = r9.f253909d
            com.tencent.mm.plugin.finder.live.plugin.l r10 = r10.f253922e
            java.lang.Class<jf2.k0> r0 = jf2.k0.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r10 = r10.U0(r0)
            jf2.k0 r10 = (jf2.k0) r10
            if (r10 == 0) goto Lb5
            java.lang.Class<mm2.n0> r0 = mm2.n0.class
            androidx.lifecycle.c1 r0 = r10.business(r0)
            mm2.n0 r0 = (mm2.n0) r0
            if (r0 == 0) goto L42
            boolean r0 = r0.f329273r
            r1 = 1
            if (r0 != r1) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r0 = "LiveVisitorBottomEntranceController"
            if (r1 == 0) goto L65
            java.lang.String r1 = "openFolder: colive invitee, open InviteeMoreActionPanel"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.finder.live.widget.ga r2 = new com.tencent.mm.plugin.finder.live.widget.ga
            android.content.Context r0 = r10.O6()
            r2.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            com.tencent.mm.plugin.finder.live.widget.e0.W(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r10 = r10.f299387v
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.postValue(r0)
            goto Lb5
        L65:
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r10.business(r1)
            mm2.c1 r1 = (mm2.c1) r1
            boolean r1 = r1.T
            if (r1 == 0) goto L8f
            java.lang.String r1 = "openFolder: assistant, open AssistantMoreActionPanel"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.plugin.finder.live.widget.s80 r2 = new com.tencent.mm.plugin.finder.live.widget.s80
            android.content.Context r0 = r10.O6()
            r2.<init>(r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            com.tencent.mm.plugin.finder.live.widget.e0.W(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r10 = r10.f299387v
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.postValue(r0)
            goto Lb5
        L8f:
            jf2.g r0 = r10.f299389x
            if (r0 != 0) goto La2
            jf2.g r0 = new jf2.g
            android.content.Context r1 = r10.O6()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r2 = r10.getStore()
            r0.<init>(r1, r2)
            r10.f299389x = r0
        La2:
            jf2.g r3 = r10.f299389x
            if (r3 == 0) goto Lae
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            com.tencent.mm.plugin.finder.live.widget.e0.W(r3, r4, r5, r6, r7, r8)
        Lae:
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r10 = r10.f299387v
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.postValue(r0)
        Lb5:
            java.lang.String r10 = "onClick"
            java.lang.String r0 = "(Landroid/view/View;)V"
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveVisitorBottomFolderWidget$1"
            java.lang.String r2 = "android/view/View$OnClickListener"
            yj0.a.h(r9, r1, r2, r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.s2.onClick(android.view.View):void");
    }
}
