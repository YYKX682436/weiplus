package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class u3 implements com.tencent.mm.plugin.multitalk.model.y {

    /* renamed from: g, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.multitalk.model.u3 f150156g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f150157d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f150158e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f150159f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void B2(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.lang.String De(java.lang.String str, java.lang.String str2) {
        boolean z17;
        er4.e c17 = c(str);
        if (c17 == null || !(z17 = c17.f256076g[1])) {
            return null;
        }
        return z17 ? c17.f256073d : "";
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Gf(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void I9(java.util.List list, java.util.List list2) {
        if (list == null || list2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: null parameters");
            return;
        }
        if (list.size() != list2.size()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: size mismatch, wxGroupIds=%d, bannerInfos=%d", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(list2.size()));
            return;
        }
        if (list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: empty data");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: loading %d banner(s)", java.lang.Integer.valueOf(list.size()));
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String str = (java.lang.String) list.get(i17);
            er4.e eVar = (er4.e) list2.get(i17);
            if (!android.text.TextUtils.isEmpty(str) && eVar != null && eVar.f256076g[2] && !eVar.f256074e.isEmpty() && !android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "setVoipmpBannerInfo wxGroupId = %s", str);
                this.f150157d.put(str, eVar);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
        refreshMainUIMultitalkIconEvent.f54671g.f7358a = 1;
        refreshMainUIMultitalkIconEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "loadAllBannerInfo: completed, loaded %d banner(s)", java.lang.Integer.valueOf(list.size()));
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void J4(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMPMultitalkRoomListMgr", "cleanBanner failure ! wxGroupId is null or empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "cleanBanner wxGroupId = %s", str);
        f(str);
        b(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void Ji(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "outRoom wxGroupId = %s", str);
        this.f150159f.postDelayed(new com.tencent.mm.plugin.multitalk.model.s3(this, str), 2000L);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public void Ld(java.lang.String str, er4.e eVar) {
        char c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "notifyBannerUpdate wxGroupId = %s", str);
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f150157d;
        boolean containsKey = isEmpty ? false : concurrentHashMap.containsKey(str);
        if (eVar == null || !eVar.f256076g[2] || eVar.f256074e.isEmpty()) {
            f(str);
            c17 = 3;
        } else {
            c17 = containsKey ? (char) 2 : (char) 1;
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "setVoipmpBannerInfo wxGroupId = %s", str);
                concurrentHashMap.put(str, eVar);
            }
        }
        b(str);
        com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent();
        am.mq mqVar = refreshMainUIMultitalkIconEvent.f54671g;
        if (c17 == 1) {
            mqVar.f7358a = 1;
            refreshMainUIMultitalkIconEvent.e();
        } else if (c17 == 2) {
            mqVar.f7358a = 1;
            refreshMainUIMultitalkIconEvent.e();
        } else if (c17 == 3 && containsKey) {
            mqVar.f7358a = 2;
            refreshMainUIMultitalkIconEvent.e();
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public dm.f8 O7(java.lang.String str) {
        c(str);
        p21.j jVar = new p21.j();
        jVar.field_wxGroupId = str;
        jVar.field_groupId = "";
        jVar.field_roomId = 0;
        jVar.field_roomKey = 0L;
        return jVar;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public int Og(java.lang.String str, java.lang.String str2) {
        boolean z17;
        er4.e c17 = c(str);
        if (c17 == null || !(z17 = c17.f256076g[3])) {
            return 30;
        }
        er4.f fVar = er4.f.BANNER_STATUS_EXIT;
        er4.f fVar2 = z17 ? c17.f256075f : fVar;
        if (fVar2 == er4.f.BANNER_STATUS_ENTER) {
            return 10;
        }
        if (fVar2 == er4.f.BANNER_STATUS_WAIT) {
            return 1;
        }
        return fVar2 == fVar ? 20 : 30;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.util.List P6(java.lang.String str) {
        er4.e c17 = c(str);
        return (c17 == null || !c17.f256076g[2]) ? new java.util.LinkedList() : new java.util.LinkedList(c17.f256074e);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Si() {
        return ((jp5.o) i95.n0.c(jp5.o.class)).lh();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean Th(java.lang.String str, java.lang.String str2) {
        er4.e c17 = c(str);
        if (c17 == null || !c17.f256076g[2]) {
            return false;
        }
        return c17.f256074e.contains(str2);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public synchronized void Ud(com.tencent.mm.plugin.multitalk.model.x xVar) {
        ((java.util.ArrayList) this.f150158e).add(xVar);
    }

    public final void b(java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.f150158e).iterator();
        while (it.hasNext()) {
            this.f150159f.post(new com.tencent.mm.plugin.multitalk.model.t3(this, (com.tencent.mm.plugin.multitalk.model.x) it.next(), str));
        }
    }

    public final er4.e c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        return (er4.e) this.f150157d.get(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean d(java.lang.String str) {
        f(str);
        return true;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean e5() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            return oVar.Sd();
        }
        return false;
    }

    public final void f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPMultitalkRoomListMgr", "removeVoipmpBannerInfo wxGroupId = %s", str);
        this.f150157d.remove(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean ff() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        return oVar != null ? vq4.p0.d() || oVar.ie() : vq4.p0.d();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public java.lang.String getDisplayName(java.lang.String str) {
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean kb(java.lang.String str) {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar != null) {
            return oVar.a5();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean mh(java.lang.String str) {
        return java.lang.Boolean.valueOf(((jp5.o) i95.n0.c(jp5.o.class)).jb(str)).booleanValue();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public synchronized void p2(com.tencent.mm.plugin.multitalk.model.x xVar) {
        ((java.util.ArrayList) this.f150158e).remove(xVar);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean q4(java.lang.String str) {
        er4.e c17 = c(str);
        return c17 != null && c17.f256076g[2] && c17.f256074e.size() > 0;
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean s4(android.content.Context context) {
        return iq.b.C(context);
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean y8() {
        return ((jp5.o) i95.n0.c(jp5.o.class)).Sd();
    }

    @Override // com.tencent.mm.plugin.multitalk.model.y
    public boolean zc(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f150157d.containsKey(str);
    }
}
