package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class a4 {
    public static ot0.q a(java.lang.String str, ot0.s0 s0Var) {
        ot0.q qVar = new ot0.q();
        qVar.f348654f = s0Var.f348761d;
        qVar.f348658g = s0Var.f348769n;
        qVar.f348666i = 33;
        qVar.f348673j2 = s0Var.f348775r;
        qVar.f348669i2 = s0Var.f348776s;
        qVar.f348677k2 = s0Var.f348779v;
        qVar.f348737z2 = s0Var.f348778u;
        qVar.A2 = s0Var.f348777t;
        qVar.f348685m2 = "";
        qVar.f348681l2 = 2;
        qVar.f348674k = s0Var.f348762e;
        qVar.B2 = s0Var.f348781x;
        qVar.L1 = "wxapp_" + s0Var.f348779v + s0Var.f348776s;
        qVar.f348722w = s0Var.f348775r;
        qVar.f348726x = s0Var.f348783y;
        ot0.a aVar = new ot0.a();
        aVar.f348346b = false;
        aVar.f348347c = "";
        qVar.f(aVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.f348734z)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str);
            if (n07 != null) {
                qVar.f348734z = n07.c();
            }
        }
        return qVar;
    }

    public static boolean b(com.tencent.mm.storage.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.t2()) {
            return false;
        }
        java.util.LinkedList linkedList = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.getMsgId(), f9Var.j()).f348581i;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            if (i17 < 0 || i17 >= linkedList.size()) {
                i17 = 0;
            }
            if (k01.o.a(((ot0.s0) linkedList.get(i17)).f348775r)) {
                return true;
            }
        }
        return false;
    }

    public static void c(java.lang.String str, boolean z17, ot0.q qVar, java.lang.String str2) {
        try {
            byte[] bArr = new byte[0];
            android.graphics.Bitmap bitmap = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (str2.startsWith("http://") || str2.startsWith("https://"))) {
                bitmap = l01.d0.f314761a.f(str2, null);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            byte[] bArr2 = bArr;
            int i17 = com.tencent.mm.storage.z3.R4(str) ? 1 : 0;
            java.lang.Object obj = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, qVar.f348677k2, qVar.n(), str, null, bArr2).second;
            if (obj != null) {
                com.tencent.mm.ui.transmit.MsgRetransmitUI.O6(str, (java.lang.Long) obj);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14127, qVar.f348677k2, qVar.f348673j2, qVar.f348669i2, qVar.n(), qVar.f348658g, "", qVar.f348674k, 0, 1, 2, java.lang.Integer.valueOf(i17), str, 1, qVar.f348689n2, "");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingEditModeSendToAppBrand", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", e17.getLocalizedMessage());
        }
    }
}
