package r21;

/* loaded from: classes11.dex */
public class a0 implements com.tencent.mm.modelbase.i1 {
    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        int i17;
        int i18;
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        if (!"fmessage".equals(g17) && j4Var.f377560g != 37) {
            return null;
        }
        java.lang.String g18 = x51.j1.g(j4Var.f377561h);
        com.tencent.mm.storage.e9 f17 = com.tencent.mm.storage.e9.f(g18);
        java.lang.String r17 = c01.z1.r();
        java.lang.String str = f17.f193859a;
        if (str != null && str.equals(r17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
            return null;
        }
        com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
        r0Var.f70529a = f17.f193859a;
        r0Var.f70530b = 3;
        r0Var.f70534f = 1;
        r0Var.f70537i = -1;
        r0Var.f70533e = f17.f193879u;
        r0Var.f70532d = f17.f193880v;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17.f193859a)) {
            int i19 = f17.f193866h;
            if (i19 == 18) {
                com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
                t8Var.field_content = x51.j1.g(j4Var.f377561h);
                t8Var.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
                t8Var.field_imgpath = "";
                t8Var.field_sayhicontent = f17.f193864f;
                t8Var.field_sayhiuser = f17.f193859a;
                t8Var.field_scene = f17.f193866h;
                int i27 = j4Var.f377562i;
                if (i27 <= 3) {
                    i27 = 3;
                }
                t8Var.field_status = i27;
                t8Var.field_svrid = j4Var.f377568r;
                t8Var.field_talker = x51.j1.g(j4Var.f377558e);
                t8Var.field_type = j4Var.f377560g;
                t8Var.field_isSend = 0;
                t8Var.field_sayhiencryptuser = f17.f193882x;
                t8Var.field_ticket = f17.f193878t;
                t8Var.field_flag = 1;
                ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).insert(t8Var);
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = t8Var.field_sayhiencryptuser;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                com.tencent.mm.modelavatar.g.f(str2, 3);
                c01.d9.b().p().w(73729, 1);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(f17.f193882x, true);
                if (n17 == null || ((int) n17.E2) <= 0) {
                    ((c01.k7) c01.n8.a()).b(f17.f193882x, 29, new r21.z(this, f17));
                } else {
                    java.lang.String d17 = n17.d1();
                    if (d17 != null && !com.tencent.mm.storage.z3.E4(d17)) {
                        n17.X1(f17.f193882x);
                        n17.K1(null);
                        ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(d17, n17);
                    }
                    com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent = new com.tencent.mm.autogen.events.LbsSayHiEvent();
                    java.lang.String str3 = f17.f193882x;
                    am.ni niVar = lbsSayHiEvent.f54464g;
                    niVar.f7426a = str3;
                    niVar.f7427b = 1;
                    lbsSayHiEvent.e();
                }
                return null;
            }
            if (c01.w9.y(i19)) {
                com.tencent.mm.storage.pa paVar = new com.tencent.mm.storage.pa();
                paVar.field_content = x51.j1.g(j4Var.f377561h);
                paVar.field_createtime = com.tencent.mm.sdk.platformtools.t8.i1();
                paVar.field_imgpath = "";
                paVar.field_sayhicontent = f17.f193864f;
                paVar.field_sayhiuser = f17.f193859a;
                paVar.field_scene = f17.f193866h;
                int i28 = j4Var.f377562i;
                if (i28 <= 3) {
                    i28 = 3;
                }
                paVar.field_status = i28;
                paVar.field_svrid = j4Var.f377568r;
                paVar.field_talker = x51.j1.g(j4Var.f377558e);
                paVar.field_type = j4Var.f377560g;
                paVar.field_isSend = 0;
                ((com.tencent.mm.storage.qa) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).ij()).insert(paVar);
                kv.c0 c0Var2 = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str4 = paVar.field_sayhiuser;
                ((com.tencent.mm.feature.avatar.w) c0Var2).getClass();
                com.tencent.mm.modelavatar.g.f(str4, 3);
                c01.d9.b().p().w(73730, 1);
                return null;
            }
            if (f17.f193866h == 48) {
                com.tencent.mm.autogen.events.RadarSayHiMsgEvent radarSayHiMsgEvent = new com.tencent.mm.autogen.events.RadarSayHiMsgEvent();
                am.ip ipVar = radarSayHiMsgEvent.f54641g;
                ipVar.f6967a = g18;
                ipVar.getClass();
                radarSayHiMsgEvent.e();
            }
        }
        com.tencent.mm.storage.p7 p7Var = new com.tencent.mm.storage.p7();
        p7Var.field_createTime = r21.v.b(g17, j4Var.f377565o);
        if (j4Var.f377562i == 4) {
            i18 = 2;
            i17 = 0;
        } else {
            i17 = 0;
            i18 = 0;
        }
        p7Var.field_isSend = i18 + i17;
        p7Var.field_msgContent = x51.j1.g(j4Var.f377561h);
        p7Var.field_svrId = j4Var.f377568r;
        p7Var.field_talker = f17.f193859a;
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(f17.f193884z, true);
        if (n18 != null && ((int) n18.E2) != -1) {
            p7Var.field_chatroomName = f17.f193884z;
        }
        int i29 = f17.f193881w;
        if (i29 == 2) {
            p7Var.field_type = 1;
        } else if (i29 == 5) {
            p7Var.field_type = 2;
        } else if (i29 != 6) {
            p7Var.field_type = 1;
        } else {
            p7Var.field_type = 3;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17.f193882x)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VerifyMessageExtension", "it should not go in here");
            com.tencent.mm.storage.m7 L0 = r21.w.wi().L0(p7Var.field_talker);
            if (L0 != null) {
                java.lang.String str5 = L0.field_talker;
                p7Var.field_encryptTalker = str5;
                p7Var.field_talker = str5;
            }
            r21.w.Ai().y0(p7Var);
            r21.w.Ai().insert(p7Var);
        } else {
            p7Var.field_encryptTalker = f17.f193882x;
            r21.w.Ai().y0(p7Var);
            r21.w.Ai().insert(p7Var);
        }
        return null;
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
