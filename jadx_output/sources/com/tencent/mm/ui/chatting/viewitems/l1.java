package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes13.dex */
public class l1 implements kn.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r.a f204381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f204382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204383c;

    public l1(r.a aVar, boolean z17, com.tencent.mm.storage.f9 f9Var) {
        this.f204381a = aVar;
        this.f204382b = z17;
        this.f204383c = f9Var;
    }

    @Override // kn.i0
    public void a() {
        android.util.Pair pair;
        android.util.Pair pair2;
        this.f204381a.apply(java.lang.Boolean.valueOf(!this.f204382b));
        com.tencent.mm.storage.f9 f9Var = this.f204383c;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
            pair2 = new android.util.Pair(java.lang.Boolean.FALSE, "");
        } else {
            if (f9Var.y2()) {
                r45.vt5 vt5Var = new r45.vt5();
                vt5Var.f388523d = "related_msgid_" + f9Var.I0();
                vt5Var.f388524e = "roomannouncement@app.origin";
                vt5Var.f388525f = "";
                vt5Var.f388526g = c01.id.e();
                vt5Var.f388528i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ayn);
                vt5Var.f388529m = bm5.d1.c(f9Var);
                vt5Var.f388530n = f9Var.I0();
                vt5Var.f388531o = c01.z1.r();
                ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 0, vt5Var);
                pair = new android.util.Pair(java.lang.Boolean.TRUE, vt5Var.f388523d);
            } else {
                ot0.q v17 = ot0.q.v(f9Var.j());
                if (v17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
                    pair2 = new android.util.Pair(java.lang.Boolean.FALSE, "");
                } else {
                    r45.vt5 vt5Var2 = new r45.vt5();
                    ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
                    if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f348364t)) {
                        vt5Var2.f388523d = "related_msgid_" + f9Var.I0();
                    } else {
                        vt5Var2.f388523d = aVar.f348364t;
                    }
                    vt5Var2.f388524e = v17.f348673j2;
                    vt5Var2.f388525f = v17.f348669i2;
                    vt5Var2.f388526g = c01.id.e();
                    java.lang.String n17 = v17.n();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
                        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(v17.f348673j2);
                        if (Bi != null && !com.tencent.mm.sdk.platformtools.t8.K0(Bi.field_nickname)) {
                            n17 = Bi.field_nickname;
                        }
                    }
                    vt5Var2.f388528i = n17;
                    vt5Var2.f388529m = bm5.d1.c(f9Var);
                    vt5Var2.f388530n = f9Var.I0();
                    vt5Var2.f388531o = c01.z1.r();
                    vt5Var2.f388532p = v17.f348693o2;
                    vt5Var2.f388533q = f9Var.Q0();
                    ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 0, vt5Var2);
                    pair = new android.util.Pair(java.lang.Boolean.TRUE, vt5Var2.f388523d);
                }
            }
            pair2 = pair;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp addtodo msgId(%s) result:%s", java.lang.Long.valueOf(f9Var.I0()), pair2);
    }

    @Override // kn.i0
    public void b() {
        r45.vt5 vt5Var;
        this.f204381a.apply(java.lang.Boolean.valueOf(!this.f204382b));
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        com.tencent.mm.storage.f9 f9Var = this.f204383c;
        rn.c z07 = Bi.z0(f9Var.Q0(), f9Var.X1());
        if (z07 != null) {
            java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), ((java.lang.Long) it.next()).longValue());
                o27.s3("");
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
            }
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
            am.ql qlVar = notifyGroupTodoEvent.f54545g;
            qlVar.f7715a = 1;
            qlVar.f7717c = f9Var.X1();
            qlVar.f7716b = f9Var.Q0();
            notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s result:%s", f9Var.X1(), java.lang.Boolean.valueOf(kn.j0.i(z07)));
            vt5Var = kn.j0.b(z07);
        } else {
            com.tencent.mm.storage.f9 o28 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), f9Var.I0());
            o28.s3("");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o28.getMsgId(), o28, true);
            vt5Var = new r45.vt5();
            vt5Var.f388523d = f9Var.X1();
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                vt5Var.f388524e = "";
                vt5Var.f388525f = "";
                vt5Var.f388528i = "";
            } else {
                vt5Var.f388524e = v17.f348673j2;
                vt5Var.f388525f = v17.f348669i2;
                vt5Var.f388528i = v17.n();
            }
            vt5Var.f388526g = (int) (f9Var.getCreateTime() / com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            vt5Var.f388529m = bm5.d1.c(f9Var);
            vt5Var.f388530n = f9Var.I0();
            vt5Var.f388531o = "";
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByClickMsg todoId:%s", f9Var.X1());
        }
        ((nn.j) i95.n0.c(nn.j.class)).Ri().a(f9Var.Q0(), 1, vt5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsg", "handleTodoClickImp recall msgId(%s) result:%s", java.lang.Long.valueOf(f9Var.I0()), new android.util.Pair(java.lang.Boolean.TRUE, f9Var.X1()));
    }
}
