package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.r2.class)
/* loaded from: classes9.dex */
public final class hp extends com.tencent.mm.ui.chatting.component.a implements sb5.r2 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f199197e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f199198f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199199g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f199200h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f199201i;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        fd5.d m07 = m0();
        if (m07 != null) {
            m07.c(false);
        }
        this.f199197e.clear();
        this.f199198f = false;
        this.f199199g = false;
        this.f199200h = false;
        this.f199201i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(android.view.View r4, int r5) {
        /*
            r3 = this;
            r4 = 0
            r0 = 1
            if (r5 == 0) goto L13
            if (r5 == r0) goto L7
            goto L53
        L7:
            fd5.d r5 = r3.m0()
            if (r5 == 0) goto L10
            r5.c(r4)
        L10:
            r3.f199198f = r0
            goto L53
        L13:
            r3.f199198f = r4
            boolean r5 = r3.f199200h
            if (r5 != 0) goto L53
            java.util.HashMap r5 = r3.f199197e
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ r0
            if (r1 == 0) goto L53
            yb5.d r1 = r3.f198580d
            if (r1 == 0) goto L39
            int r2 = com.tencent.mm.pluginsdk.ui.tools.ScrollControlListView.f191436i
            com.tencent.mm.ui.chatting.fb r1 = r1.f460718m
            com.tencent.mm.ui.chatting.ChattingUIFragment r1 = (com.tencent.mm.ui.chatting.ChattingUIFragment) r1
            com.tencent.mm.pluginsdk.ui.tools.v3 r1 = r1.f198269t
            if (r1 != 0) goto L31
            goto L39
        L31:
            int r1 = com.tencent.mm.pluginsdk.ui.tools.f7.a(r1)
            if (r1 != 0) goto L39
            r1 = r0
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L53
            r3.f199200h = r0
            r3.f199199g = r4
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "MicroMsg.WeClawMdScroll"
            java.lang.String r0 = "enter ACTIVE on IDLE: activeSize=%d"
            com.tencent.mars.xlog.Log.i(r5, r0, r4)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.hp.j0(android.view.View, int):void");
    }

    public final fd5.d m0() {
        yb5.d dVar = this.f198580d;
        java.lang.Object p17 = dVar != null ? dVar.p() : null;
        androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
        if (recyclerView == null) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = layoutManager instanceof com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager ? (com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager) layoutManager : null;
        if (chattingLinearLayoutManager != null) {
            return (fd5.d) chattingLinearLayoutManager.W(fd5.d.class);
        }
        return null;
    }

    public void n0(long j17) {
        java.util.HashMap hashMap = this.f199197e;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17));
        if (num == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WeClawMdScroll", "onStreamingEnd: svrId=%d not in map", java.lang.Long.valueOf(j17));
            return;
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        } else {
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "onStreamingEnd: svrId=%d, remainCount=%d, totalKeys=%d, uncapped=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(hashMap.size()), java.lang.Boolean.valueOf(this.f199200h));
    }

    public void o0(long j17) {
        java.util.HashMap hashMap = this.f199197e;
        if (hashMap.isEmpty()) {
            this.f199200h = false;
            this.f199199g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "onStreamingStart: reset active flag");
        }
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17));
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMdScroll", "onStreamingStart: svrId=%d, count=%d, totalKeys=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(hashMap.size()));
    }
}
