package dj3;

/* loaded from: classes14.dex */
public class u implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n == null) {
            com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n = new com.tencent.mm.plugin.multitalk.model.t1();
        }
        com.tencent.mm.plugin.multitalk.model.e3.Ai().f149942n.getClass();
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        er4.b bVar = er4.b.CONF_NOTIFY_FROM_NEW_SYNC;
        r45.j4 j4Var = p0Var.f70726a;
        if (oVar != null && oVar.ib()) {
            r45.du5 du5Var = j4Var.f377558e;
            oVar.e9("voipmt", g17, j4Var.f377565o, du5Var != null ? du5Var.f372756d : "", bVar);
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (((java.lang.String) d17.get(".sysmsg.multivoip.notfriendnotifydata")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive notfriendnotifydata msg:" + g17);
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.voipmt.invite");
        if (str != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            byte[] decode = android.util.Base64.decode(str.getBytes(), 0);
            com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
            voipCheckIsDeviceUsingEvent.e();
            boolean z18 = voipCheckIsDeviceUsingEvent.f54943g.f8247c || iq.b.E();
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parseMTInvite inVoIP %b inIlinkVoip %b inSystemCall %b", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(((jp5.o) i95.n0.c(jp5.o.class)).ie()), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.l5.Bi()));
            if (z18) {
                ((jp5.o) i95.n0.c(jp5.o.class)).e9("voipmt", g17, j4Var.f377565o, j4Var.f377558e.f372756d, bVar);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive invite " + x51.j1.g(j4Var.f377561h) + " buffer len " + decode.length);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.N((long) com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1)), c01.z1.r());
            i4Var.L(decode, decode.length);
            return;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.voipmt.cancelinvite");
        if (str2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parseMTCancelInvite");
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            byte[] decode2 = android.util.Base64.decode(str2.getBytes(), 0);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            int length = decode2.length;
            i4Var2.getClass();
            r45.l07 l07Var = new r45.l07();
            try {
                l07Var.parseFrom(decode2);
                if (l07Var.f379064d == 0 && l07Var.f379065e == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "invalid cancelInviteMsg, ignore");
                    return;
                } else {
                    byte[] bArr = l07Var.f379065e.f192156a;
                    com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.RecvNotify(bArr, bArr.length, i4Var2.f149657y1);
                    return;
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
                return;
            }
        }
        java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.voipmt.banner");
        if (str3 != null) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            byte[] decode3 = android.util.Base64.decode(str3.getBytes(), 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner " + x51.j1.g(j4Var.f377561h) + " buffer len " + decode3.length);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var3 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var3.N((long) com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().f273148a.a(1)), c01.z1.r());
            r45.k07 k07Var = new r45.k07();
            try {
                k07Var.parseFrom(decode3);
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "got banner msg from wxgroupid %s sdkgroupid %s roomid %d seq %d status %d", k07Var.f378276d, k07Var.f378278f, java.lang.Long.valueOf(k07Var.f378277e), java.lang.Long.valueOf(k07Var.f378280h), java.lang.Integer.valueOf(k07Var.f378281i));
                java.lang.String str4 = k07Var.f378278f;
                if ((str4 == null || str4.equals("")) && k07Var.f378281i != 0) {
                    return;
                }
                java.util.Iterator it = k07Var.f378279g.iterator();
                while (it.hasNext()) {
                    r45.y07 y07Var = ((r45.z07) it.next()).f391576d;
                    i4Var3.f149623f.f(y07Var.f390689d, y07Var.f390690e, 0);
                }
                com.tencent.mm.plugin.multitalk.model.e3.Ri().O(k07Var.f378276d, 2);
                i4Var3.Y.d(k07Var);
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e18, "hy: unable to parse from data", new java.lang.Object[0]);
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
