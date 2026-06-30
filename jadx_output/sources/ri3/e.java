package ri3;

@j95.b
/* loaded from: classes5.dex */
public class e extends i95.w implements aa0.e {

    /* renamed from: d, reason: collision with root package name */
    public ui3.a f396087d = null;

    public r15.b Ai(java.lang.String str, long j17) {
        ui3.b Ni = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Ni(str, j17);
        if (Ni != null) {
            return ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Bi(Ni, false);
        }
        return null;
    }

    public r15.b Bi(ui3.b bVar, boolean z17) {
        java.util.Map d17;
        java.lang.String str = null;
        if (bVar == null) {
            return null;
        }
        com.tencent.mm.storage.f9 f27 = pt0.f0.f2(bVar.field_quotedMsgTalker, bVar.field_quotedMsgId);
        if (z17 && f27 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "onlyForQuoteMsgExist referMsg not found! referMsgId: %d, referMsgTalker: %s", java.lang.Long.valueOf(bVar.field_quotedMsgId), bVar.field_quotedMsgTalker);
            return null;
        }
        r15.b bVar2 = new r15.b();
        r15.i iVar = new r15.i();
        iVar.r(bVar.field_quotedMsgSvrId);
        if (f27 != null) {
            java.lang.String t17 = c01.ia.t(f27.G);
            if (t17 == null) {
                t17 = "";
            }
            iVar.q(t17);
            iVar.n(f27.getCreateTime() / 1000);
            java.lang.String str2 = f27.G;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "msgsource", null)) != null) {
                str = (java.lang.String) d17.get(".msgsource.signature");
            }
            iVar.p(str != null ? str : "");
        }
        bVar2.q(iVar);
        return bVar2;
    }

    public final ui3.a Di() {
        gm0.j1.b().c();
        if (this.f396087d == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            gm0.j1.i();
            this.f396087d = new ui3.a(gm0.j1.u().f273153f, ui3.a.f428110f);
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "create msgQuote called cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        return this.f396087d;
    }

    public ui3.b Ni(java.lang.String str, long j17) {
        return Di().y0(str, j17);
    }

    public java.util.List Ri(int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        com.tencent.wcdb.Cursor cursor;
        ui3.a Di = Di();
        Di.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l75.k0 k0Var = Di.f428112d;
        if (k0Var instanceof d95.b0) {
            cursor = ((d95.b0) k0Var).P().query(false, "MsgQuote", ui3.b.f428113x.f316954c, "quotedMsgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", cancellationSignal);
        } else {
            cursor = null;
        }
        if (cursor == null) {
            return null;
        }
        while (cursor.moveToNext()) {
            ui3.b bVar = new ui3.b();
            bVar.convertFrom(cursor);
            arrayList.add(bVar);
        }
        cursor.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.MsgQuoteStorage", "getNonTalkers, duration = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", size = " + arrayList.size());
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Ui(long j17, long j18, java.lang.String str, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        ui3.b y07 = Di().y0(str, j17);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s, msgQuote is null", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        y07.field_msgSvrId = j18;
        boolean P0 = Di().P0(y07);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(y07.field_quotedMsgTalker, y07.field_quotedMsgId);
        switch (Li.getType()) {
            case -2130706383:
            case -2113929167:
                ((j00.o1) ((c00.f3) i95.n0.c(c00.f3.class))).getClass();
                l15.c cVar = new l15.c();
                java.lang.String j19 = Li.j();
                kotlin.jvm.internal.o.f(j19, "getContent(...)");
                cVar.fromXml(j19);
                v05.b k17 = cVar.k();
                w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
                if (dVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftReportService", "reportGiftMsgQuoteSend, ecsGiftAppMsgInfo is null");
                } else if (dVar.s().isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftReportService", "reportGiftMsgQuoteSend, gift list empty");
                } else {
                    java.lang.Object obj = dVar.s().get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_gift_quote_msg_send", "view_clk", kz5.b1.e(new jz5.l("order_id", ((w05.e) obj).n())), 12, false);
                }
                ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(msgQuoteItem, null, j18, str);
                break;
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
            case 975175729:
            case 1040187441:
            case 1090519089:
            case 1157627953:
            case 1174405169:
            case 1224736817:
            case 1241514033:
                ot0.q v17 = ot0.q.v(Li.j());
                if (v17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "appMsgContent is null");
                    break;
                } else {
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(msgQuoteItem, java.lang.Integer.valueOf(v17.f348666i), j18, str);
                    break;
                }
            default:
                ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ui(msgQuoteItem, null, j18, str);
                break;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleQuoteMsgSendResuld() msgId:%s msgSvrId:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(P0));
    }

    public void Vi(long j17, long j18, java.lang.String str, long j19) {
        if (j19 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "quotedMsgSvrid is illegal, msgId:%s msgSvrid:%s talker:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str);
            return;
        }
        ui3.b bVar = new ui3.b();
        bVar.field_msgId = j17;
        bVar.field_msgSvrId = j18;
        bVar.field_quotedMsgSvrId = j19;
        bVar.field_quotedMsgTalker = str;
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, j19);
        if (o27 != null) {
            bVar.field_quotedMsgId = o27.getMsgId();
        }
        if (o27 == null || !(o27.W2() || o27.V2())) {
            bVar.field_status = 0;
        } else {
            bVar.field_status = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg(), fix revoke status");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleReceivedQuoteMsg() msgId:%s msgSvrid:%s talker:%s quotedMsgSvrid:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str, java.lang.Long.valueOf(j19), java.lang.Boolean.valueOf(Di().L0(bVar)));
    }

    public void Zi(java.lang.String str, long j17, long j18) {
        ui3.b z07 = Di().z0(str, j17);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf msgId:%s, msgSvrId:%s, msgQuote is null", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        z07.field_status = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.PluginMsgQuote", "handleRevokeMsgBySelf() msgId:%s msgSvrId:%s result:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(Di().P0(z07)));
    }

    public boolean wi(java.lang.String str, long j17) {
        ui3.a Di = Di();
        Di.getClass();
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId:%s", java.lang.Long.valueOf(j17));
            return false;
        }
        l75.k0 k0Var = Di.f428112d;
        int delete = k0Var.delete("MsgQuote", "msgId=? and quotedMsgTalker=? ", new java.lang.String[]{j17 + "", str});
        if (delete < 0) {
            if (!pt0.p.B3("MsgQuote")) {
                delete = k0Var.delete("MsgQuote", "msgId=? ", new java.lang.String[]{j17 + ""});
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId failed, msgId:%s, result:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(delete));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.MsgQuoteStorage", "deleteMsgQuoteByMsgId, msgId:%s, result:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(delete));
        }
        return delete >= 0;
    }
}
