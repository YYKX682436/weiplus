package l63;

@j95.b
/* loaded from: classes9.dex */
public class h extends i95.w implements m63.g {
    public void Ai(com.tencent.mm.plugin.gamesharecard.GameShareCardInfo gameShareCardInfo, byte[] bArr, java.lang.String str) {
        ot0.q qVar = new ot0.q();
        qVar.f348654f = gameShareCardInfo.f142111g;
        qVar.f348658g = gameShareCardInfo.f142115n;
        qVar.f348666i = 101;
        java.lang.String str2 = gameShareCardInfo.f142114m;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            qVar.f348646d = str2;
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
            if (h17 != null) {
                qVar.H = h17.field_appName;
            }
        }
        qVar.f348674k = "https://support.weixin.qq.com/update/";
        com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = new com.tencent.mm.pluginsdk.ui.tools.h0();
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = gameShareCardInfo.f142108d;
        h0Var.f191665b = liteAppBizDataInfo.f142116d;
        h0Var.f191666c = liteAppBizDataInfo.f142117e;
        h0Var.f191667d = liteAppBizDataInfo.f142118f;
        h0Var.f191668e = liteAppBizDataInfo.f142120h.intValue();
        qVar.f(h0Var);
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = new com.tencent.mm.pluginsdk.ui.tools.g0();
        g0Var.f191630b = liteAppBizDataInfo.f142119g;
        g0Var.f191631c = liteAppBizDataInfo.f142121i;
        g0Var.f191633e = gameShareCardInfo.f142109e;
        g0Var.f191634f = gameShareCardInfo.f142110f;
        g0Var.f191635g = gameShareCardInfo.f142112h;
        g0Var.f191636h = gameShareCardInfo.f142113i;
        qVar.f(g0Var);
        ((ez.w0) ot0.j1.a()).getClass();
        com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str, "", bArr);
    }

    public void Bi(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        java.util.HashSet hashSet = n63.a.f335214a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnexpose : snsId is ");
        sb6.append(str);
        sb6.append(", snssetlen is ");
        java.util.HashSet hashSet2 = n63.a.f335215b;
        sb6.append(hashSet2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareCardReport", sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (i18 == 1) {
            if (kz5.n0.O(hashSet2, str)) {
                return;
            }
            if (str != null) {
                hashSet2.add(str);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28466, java.lang.Integer.valueOf(i17 == 0 ? 1 : 2), "", 2, str2, 0, str3, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2) ? 2 : 1));
    }

    public void Di(int i17, java.lang.String url) {
        java.util.HashSet hashSet = n63.a.f335214a;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareCardReport", "sourceImgInfoReport : actionId is " + i17 + ", url is " + url);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28466, 1, "", 1, "", 0, "", java.lang.Integer.valueOf(i17), 0, 3, url);
    }

    public void wi(ot0.q content, java.lang.Long l17, int i17) {
        long longValue = l17.longValue();
        java.util.HashSet hashSet = n63.a.f335214a;
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("johnexpose : msgSvrId is ");
        sb6.append(longValue);
        sb6.append(", chatsetlen is ");
        java.util.HashSet hashSet2 = n63.a.f335214a;
        sb6.append(hashSet2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.GameShareCardReport", sb6.toString());
        if (java.lang.Long.valueOf(longValue).equals(0)) {
            return;
        }
        if (i17 == 1) {
            if (hashSet2.contains(java.lang.Long.valueOf(longValue))) {
                return;
            } else {
                hashSet2.add(java.lang.Long.valueOf(longValue));
            }
        }
        com.tencent.mm.pluginsdk.ui.tools.g0 g0Var = (com.tencent.mm.pluginsdk.ui.tools.g0) content.y(com.tencent.mm.pluginsdk.ui.tools.g0.class);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28466, java.lang.Integer.valueOf(g0Var.f191635g == 0 ? 1 : 2), "", 1, content.f348646d, 0, g0Var.f191633e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(content.f348646d) ? 2 : 1));
    }
}
