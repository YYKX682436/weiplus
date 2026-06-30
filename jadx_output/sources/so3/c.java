package so3;

/* loaded from: classes8.dex */
public final class c implements vg3.a5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f410746d = new java.util.ArrayList();

    @Override // vg3.a
    public void b(com.tencent.mm.modelbase.p0 addMsgInfo, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (map == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "afterMsgInsert, contentValues is null");
            return;
        }
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.subscribe_cover_notify.subscribe_cover_msg_type");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "subscribe cover msgType: " + D1);
        java.lang.String str2 = (java.lang.String) map.get(".msg.fromusername");
        if (str2 == null) {
            str2 = "";
        }
        if (!(str2.length() == 0)) {
            synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
                if (this.f410746d.contains(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "request exists, username: ".concat(str2));
                } else if (((tg3.v0) i95.n0.c(tg3.v0.class)) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "contactCommDisplayService is null");
                } else {
                    java.lang.String e17 = c01.a2.e(str2);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        kotlin.jvm.internal.o.d(e17);
                        if (str2.contentEquals(e17)) {
                            synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
                                com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "prepare sync contact, username: ".concat(str2));
                                this.f410746d.add(str2);
                            }
                            ((ku5.t0) ku5.t0.f312615d).q(new so3.b(this, str2));
                        }
                    }
                }
            }
        }
        if (D1 != 0) {
            java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.extinfo.subscribe_cover_notify.need_notify");
            if (str3 == null) {
                str3 = "";
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.D1(str3, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "need notify: " + z18);
            if (z18) {
                oo3.j jVar = (oo3.j) i95.n0.c(oo3.j.class);
                c01.m8 m8Var = jVar != null ? ((mo3.g) jVar).f330407d : null;
                if (m8Var instanceof c01.v8) {
                    ((c01.v8) m8Var).a(f9Var);
                }
            }
        }
    }

    @Override // vg3.a
    public boolean c(com.tencent.mm.modelbase.p0 addMsgInfo, com.tencent.mm.storage.f9 f9Var, java.util.Map map) {
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        return true;
    }
}
