package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class dc {
    public static com.tencent.mm.storage.f9 a(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getFixQuoteMsgInfo,quotedMsg is null!");
            return null;
        }
        if (f9Var.getMsgId() == 0) {
            f9Var = new com.tencent.mm.storage.f9();
            f9Var.setType(msgQuoteItem.f149482d);
            f9Var.o1(msgQuoteItem.f149483e);
            f9Var.u1(msgQuoteItem.f149484f);
            f9Var.u3(msgQuoteItem.f149487i);
            f9Var.d1(msgQuoteItem.f149488m);
            if (com.tencent.mm.sdk.platformtools.t8.D0(msgQuoteItem.f149485g, c01.z1.r())) {
                f9Var.j1(1);
            }
            if (msgQuoteItem.f149490o == 1) {
                f9Var.f193937q2 = 1;
            }
        }
        return f9Var;
    }

    public static com.tencent.mm.storage.f9 b(boolean z17, java.lang.String str, long j17, java.lang.String str2, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, java.lang.String str3) {
        com.tencent.mm.storage.f9 o27;
        if (msgQuoteItem == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem is null!");
            return null;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(str2, j17);
        if (f27 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msg is null!");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getQuoteMsgInfo %s msgId:%s msgSvrId:%s msgTaker:%s MsgQuoteItem(type:%s svrid:%s content:%s)", str3, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f27.I0()), f27.Q0(), java.lang.Integer.valueOf(msgQuoteItem.f149482d), java.lang.Long.valueOf(msgQuoteItem.f149483e), com.tencent.mm.sdk.platformtools.t8.G1(msgQuoteItem.f149488m));
        if (com.tencent.mm.sdk.platformtools.t8.K0(msgQuoteItem.f149484f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(1)");
            ot0.q v17 = ot0.q.v(f27.U1());
            if (v17 != null && (msgQuoteItem = v17.f348725w2) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem is null in content");
                return null;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(msgQuoteItem.f149484f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "msgQuoteItem.fromusr is null!(2)");
            return null;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        if (msgQuoteItem.f149483e != 0) {
            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(msgQuoteItem.f149484f, msgQuoteItem.f149483e);
        }
        if (!android.text.TextUtils.isEmpty(str) && f9Var.getMsgId() == 0 && !android.text.TextUtils.isEmpty(msgQuoteItem.f149487i)) {
            long r17 = c01.ia.r(msgQuoteItem.f149487i);
            if (r17 != -1 && r17 != 0 && (o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, r17)) != null && o27.getMsgId() != 0) {
                f9Var = o27;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "getQuoteMsgInfo found quotedMsg: local id:%s,msg svr id:%s,msg talker: %s,msg createTime:%s", java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()), f9Var.Q0(), java.lang.Long.valueOf(f9Var.getCreateTime()));
        return f9Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:72|(2:74|(2:76|(2:78|(6:80|(2:82|(2:84|(5:86|(2:88|(6:90|91|(2:(1:104)(1:106)|105)|107|(1:109)(1:119)|(1:(2:112|113)(1:114))(1:(2:116|117)(1:118)))(3:299|(1:301)(1:305)|(1:303)(1:304)))|306|(1:308)(1:312)|(1:310)(1:311)))(1:313))|314|(1:316)(1:321)|317|(1:319)(1:320))(1:322))(1:323))(3:324|(1:326)|327))|328|139|140|141|(0)(0)|145|(0)|148|(3:150|153|154)|156|154) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x065e, code lost:
    
        if (r6 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x07e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x07e9, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "jump to finder feed fail: %s", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03c1, code lost:
    
        if (com.tencent.mm.ui.chatting.viewitems.c2.e0(r3, r35, r15, r43) == false) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0184. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x01ed. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x01f3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x01fb. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:96:0x01fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0766 A[Catch: Exception -> 0x07e8, TryCatch #1 {Exception -> 0x07e8, blocks: (B:140:0x0738, B:144:0x0752, B:145:0x075a, B:147:0x0766, B:148:0x0772, B:150:0x0792, B:153:0x0799, B:154:0x07a5, B:157:0x0756), top: B:139:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0756 A[Catch: Exception -> 0x07e8, TryCatch #1 {Exception -> 0x07e8, blocks: (B:140:0x0738, B:144:0x0752, B:145:0x075a, B:147:0x0766, B:148:0x0772, B:150:0x0792, B:153:0x0799, B:154:0x07a5, B:157:0x0756), top: B:139:0x0738 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(yb5.d r35, com.tencent.mm.ui.chatting.viewitems.g0 r36, android.view.View r37, long r38, java.lang.String r40, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r41, com.tencent.mm.ui.chatting.viewitems.cc r42, com.tencent.mm.ui.chatting.viewitems.qq r43) {
        /*
            Method dump skipped, instructions count: 3082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.dc.c(yb5.d, com.tencent.mm.ui.chatting.viewitems.g0, android.view.View, long, java.lang.String, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem, com.tencent.mm.ui.chatting.viewitems.cc, com.tencent.mm.ui.chatting.viewitems.qq):void");
    }

    public static void d(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.g0 g0Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, android.view.View view, long j17, java.lang.String str, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        c(dVar, g0Var, view, j17, str, msgQuoteItem, new com.tencent.mm.ui.chatting.viewitems.cc(), new com.tencent.mm.ui.chatting.viewitems.qq(a0Var, ""));
    }

    public static void e(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, com.tencent.mm.storage.f9 f9Var, android.view.View view, long j17, java.lang.String str, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem, ty.q0 q0Var) {
        com.tencent.mm.storage.f9 b17 = b(dVar.D(), dVar.x(), j17, str, msgQuoteItem, "handleQuoteMsgClick");
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,quotedMsg is null!");
            return;
        }
        if (b17.getMsgId() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "handleItemClickToPositionEvent,show toast");
            ty.p0 p0Var = q0Var == ty.q0.f422749d ? ty.p0.f422741m : ty.p0.f422740i;
            switch (msgQuoteItem.f149482d) {
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 974127153:
                case 975175729:
                case 976224305:
                case 978321457:
                case 979370033:
                case 1040187441:
                case 1090519089:
                case 1157627953:
                case 1174405169:
                case 1224736817:
                case 1241514033:
                    ot0.q v17 = ot0.q.v(b17.j());
                    if (v17 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "appMsgContent is null");
                        break;
                    } else {
                        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(p0Var, msgQuoteItem, java.lang.Integer.valueOf(v17.f348666i), dVar.x());
                        break;
                    }
                default:
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(p0Var, msgQuoteItem, 0, dVar.x());
                    break;
            }
            db5.t7.makeText(view.getContext(), com.tencent.mm.R.string.b5a, 0).show();
            return;
        }
        ty.p0 p0Var2 = q0Var == ty.q0.f422750e ? ty.p0.f422745q : ty.p0.f422738g;
        ty.r0 r0Var = a0Var == null ? ty.r0.f422753e : ty.r0.f422754f;
        int positionForView = dVar.p().getPositionForView(view);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_POSITION_AT_CHATRECORD_FIRST_IN_BOOLEAN, java.lang.Boolean.TRUE);
        int b18 = i65.a.b(dVar.g(), 120);
        r15.f b19 = com.tencent.mm.ui.chatting.viewitems.hc.b(msgQuoteItem.f149493r, b17, dVar.g());
        sb5.y yVar = new sb5.y();
        yVar.f405597b = true;
        yVar.f405598c = true;
        yVar.f405600e = b18;
        yVar.f405601f = true;
        yVar.f405602g = true;
        yVar.f405603h = b19;
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) cVar.a(sb5.z.class))).T0(b17.Q0(), b17.getMsgId(), hd5.n.ACTION_POSITION, yVar);
        com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class));
        jbVar.getClass();
        try {
            if (jbVar.f199263e.K0()) {
                jbVar.f199263e.setBottomPanelVisibility(8);
            }
        } catch (java.lang.Exception unused) {
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.ui.chatting.viewitems.yb(dVar, b17, msgQuoteItem, f9Var, positionForView), 500L);
        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ri(p0Var2, r0Var, msgQuoteItem, dVar.x());
    }
}
