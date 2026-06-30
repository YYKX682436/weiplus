package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class il implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ml f199236e;

    public il(com.tencent.mm.ui.chatting.component.ml mlVar, com.tencent.mm.storage.f9 f9Var) {
        this.f199236e = mlVar;
        this.f199235d = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        jx3.f.INSTANCE.idkeyStat(403L, 7L, 1L, false);
        com.tencent.mm.ui.chatting.component.ml mlVar = this.f199236e;
        mlVar.getClass();
        com.tencent.mm.storage.f9 f9Var = this.f199235d;
        if (f9Var != null) {
            long j17 = 0;
            if (f9Var.getMsgId() != 0) {
                final long F0 = f9Var.F0();
                int i17 = 0;
                boolean z17 = (f9Var.w0() & 4) != 0;
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(mlVar.f198580d.u().d1());
                if (p17 != null) {
                    long F02 = z17 ? p17.F0() : p17.R0();
                    if (z17 && F02 == 0) {
                        i17 = p17.c1();
                    }
                    int i18 = i17;
                    if (z17 && F02 > F0) {
                        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
                        final java.lang.String d17 = mlVar.f198580d.u().d1();
                        cj6.getClass();
                        com.tencent.mm.storage.f9 f9Var2 = null;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                            if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                                f9Var2 = ot0.c3.l().g("getOlderMsgByMsgSeq", new yz5.a() { // from class: com.tencent.mm.storage.g9$$p0
                                    @Override // yz5.a
                                    public final java.lang.Object invoke() {
                                        return ot0.z2.f348822a.g1(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, d17, F0);
                                    }
                                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$q0
                                    @Override // yz5.a
                                    public final java.lang.Object invoke() {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from message where");
                                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                                        java.lang.String str = d17;
                                        sb6.append(g9Var.Z8(str));
                                        sb6.append(" and msgSeq < ");
                                        sb6.append(F0);
                                        sb6.append(" order by msgSeq DESC LIMIT 1 ");
                                        java.lang.String sb7 = sb6.toString();
                                        com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorage", "getOlderMsgByMsgSeq: " + sb7);
                                        android.database.Cursor B = g9Var.f193989r.B(sb7, null);
                                        if (B == null) {
                                            com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getNewerMsgByMsgSeq failed " + str);
                                            return null;
                                        }
                                        if (!B.moveToFirst()) {
                                            B.close();
                                            return null;
                                        }
                                        com.tencent.mm.storage.f9 f9Var3 = new com.tencent.mm.storage.f9();
                                        f9Var3.convertFrom(B);
                                        B.close();
                                        return f9Var3;
                                    }
                                });
                            } else if (cj6.Pb(cj6.X8(d17))) {
                                f9Var2 = ot0.z2.f348822a.g1(cj6.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, d17, F0);
                            } else {
                                java.lang.String str = "select * from message where" + cj6.Z8(d17) + " and msgSeq < " + F0 + " order by msgSeq DESC LIMIT 1 ";
                                com.tencent.mars.xlog.Log.i("MicroMsg.MsgInfoStorage", "getOlderMsgByMsgSeq: " + str);
                                android.database.Cursor B = cj6.f193989r.B(str, null);
                                if (B == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getNewerMsgByMsgSeq failed " + d17);
                                } else if (B.moveToFirst()) {
                                    f9Var2 = new com.tencent.mm.storage.f9();
                                    f9Var2.convertFrom(B);
                                    B.close();
                                } else {
                                    B.close();
                                }
                            }
                        }
                        if (f9Var2 != null && f9Var2.F0() < F0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg revised filterSeq[%d] to [%d]", java.lang.Long.valueOf(F02), java.lang.Long.valueOf(f9Var2.F0()));
                            long F03 = f9Var2.F0();
                            i17 = i18;
                            j17 = F03;
                        }
                    }
                    i17 = i18;
                    j17 = F02;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr getChatroomMsgWithFaultMsg filterSeq[%d], lastSeq[%d], needCount[%d], flag[%d], up[%b]", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(F0), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(f9Var.w0()), java.lang.Boolean.valueOf(z17));
                mlVar.f198580d.u().getClass();
            }
        }
    }
}
