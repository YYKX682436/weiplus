package lt1;

/* loaded from: classes4.dex */
public final class j extends lt1.e {
    @Override // lt1.e
    public int b() {
        return 20;
    }

    @Override // lt1.e
    public int c() {
        return 22246;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.ChatroomAvatarSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/chatroomheadimgsync";
    }

    @Override // lt1.e
    public boolean h() {
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableRoomHeadImgSyncAfterAutoAuth", 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "isSyncOnAuth called EnableRoomHeadImgSyncAfterAutoAuth:" + z17);
        return z17;
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        kotlin.jvm.internal.o.g(syncItems, "syncItems");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process() called with: syncItems = " + syncItems.size());
        if (syncItems.isEmpty()) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = syncItems.size();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : syncItems) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.lt5 lt5Var = new r45.lt5();
            lt5Var.parseFrom(((r45.go5) obj).f375397e.g());
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = lt5Var.f379820d;
            r0Var.f70532d = lt5Var.f379821e;
            r0Var.f70530b = 3;
            r0Var.f70534f = 0;
            arrayList.add(r0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process chatroom: " + lt5Var.f379820d + ", avatar: " + lt5Var.f379821e + ", update diff:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " index:" + i17 + " size:" + size);
            i17 = i18;
        }
        Ni.m0(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAvatarSyncProcessor", "process() end called");
    }
}
