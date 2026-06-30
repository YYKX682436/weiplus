package s83;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f404861a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f404862b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f404863c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f404864d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f404865e = 0;

    public static s83.a a(java.lang.String str) {
        s83.a aVar = new s83.a();
        int indexOf = str.indexOf("<ActivityInfo");
        if (indexOf == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallActivityMsgInfo", "msgContent not start with <ActivityInfo");
            return aVar;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str.substring(indexOf), "ActivityInfo", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallActivityMsgInfo", "XmlParser values is null, xml %s", str);
            return null;
        }
        if (d17.containsKey(".ActivityInfo.Title")) {
            aVar.f404861a = (java.lang.String) d17.get(".ActivityInfo.Title");
        }
        if (d17.containsKey(".ActivityInfo.Desc")) {
            aVar.f404862b = (java.lang.String) d17.get(".ActivityInfo.Desc");
        }
        if (d17.containsKey(".ActivityInfo.ImgUrl")) {
            aVar.f404863c = (java.lang.String) d17.get(".ActivityInfo.ImgUrl");
        }
        if (d17.containsKey(".ActivityInfo.StartBtnText")) {
            aVar.f404864d = (java.lang.String) d17.get(".ActivityInfo.StartBtnText");
        }
        if (d17.containsKey(".ActivityInfo.ActivityType")) {
            aVar.f404865e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".ActivityInfo.ActivityType"), 0);
        }
        return aVar;
    }
}
