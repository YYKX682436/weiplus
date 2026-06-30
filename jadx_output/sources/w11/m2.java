package w11;

/* loaded from: classes9.dex */
public final class m2 {
    public m2(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.modelmulti.WxaInfo a(p15.x xVar) {
        if (xVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfo", "from, msgSrcWxaInfo is null");
            return null;
        }
        java.lang.String appId = xVar.getAppId();
        if (appId == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfo", "from, appId is null");
            return null;
        }
        java.lang.String nickname = xVar.getNickname();
        if (nickname == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaInfo", "from, nickname is null");
            return null;
        }
        java.lang.String iconUrl = xVar.getIconUrl();
        if (iconUrl == null) {
            iconUrl = "";
        }
        return new com.tencent.mm.modelmulti.WxaInfo(appId, nickname, iconUrl, xVar.j(), xVar.l(), xVar.n(), xVar.o());
    }

    public final com.tencent.mm.modelmulti.WxaInfo b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        p15.x xVar = new p15.x();
        xVar.fromXml(str);
        return a(xVar);
    }
}
