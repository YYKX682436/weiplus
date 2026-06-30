package d21;

/* loaded from: classes5.dex */
public class k extends d21.c {
    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] values == null ");
            return false;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f225788d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(map.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderChatSystemaNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (map.containsKey(".sysmsg.SysMsgContent")) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.SysMsgContent");
            this.f225787c = str2 != null ? str2 : "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderChatSystemaNewXmlMsg", "appText = " + this.f225787c);
        return false;
    }
}
