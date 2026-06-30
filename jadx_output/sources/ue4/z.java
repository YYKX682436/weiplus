package ue4;

/* loaded from: classes9.dex */
public class z extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f426933b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f426934c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f426935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f426936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f426937f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f426938g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f426939h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f426940i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f426941j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f426942k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f426943l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f426944m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f426945n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f426946o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f426947p = new java.util.HashMap();

    @Override // ot0.h
    public ot0.h a() {
        ue4.z zVar = new ue4.z();
        zVar.f426933b = this.f426933b;
        zVar.f426934c = this.f426934c;
        zVar.f426935d = this.f426935d;
        java.util.Map map = this.f426947p;
        zVar.f426936e = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Open");
        zVar.f426937f = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Icon");
        zVar.f426943l = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Appid");
        zVar.f426944m = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Page");
        zVar.f426945n = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Query");
        zVar.f426946o = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_Liteapp_Min_Version");
        zVar.f426939h = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_TitleColorInLightMode");
        zVar.f426940i = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_TitleColorInDarkMode");
        zVar.f426938g = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_MsgWording");
        zVar.f426941j = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_BackgroundColorInLightMode");
        zVar.f426942k = (java.lang.String) ((java.util.HashMap) map).get("Werun_202401_BackgroundColorInDarkMode");
        return zVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f426933b = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.iconid");
        this.f426934c = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.text");
        this.f426935d = (java.lang.String) map.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.sharetostatus.expiretime");
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.extinfolist.extinfo");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            sb6.append(".key");
            java.lang.String str = (java.lang.String) map.get(sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(".msg.appmsg.hardwareinfo.extinfolist.extinfo");
            sb7.append(i17 != 0 ? java.lang.Integer.valueOf(i17) : "");
            sb7.append(".value");
            java.lang.String str2 = (java.lang.String) map.get(sb7.toString());
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            java.util.Map map2 = this.f426947p;
            if (K0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SportsAppMsgContent", "should break now : %d", java.lang.Integer.valueOf(i17));
                this.f426936e = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Open");
                this.f426937f = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Icon");
                this.f426943l = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Appid");
                this.f426944m = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Page");
                this.f426945n = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Query");
                this.f426946o = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_Liteapp_Min_Version");
                this.f426939h = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_TitleColorInLightMode");
                this.f426940i = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_TitleColorInDarkMode");
                this.f426938g = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_MsgWording");
                this.f426941j = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_BackgroundColorInLightMode");
                this.f426942k = (java.lang.String) ((java.util.HashMap) map2).get("Werun_202401_BackgroundColorInDarkMode");
                com.tencent.mars.xlog.Log.i("MicroMsg.SportsAppMsgContent", "parseContent: olympic data: %s , %s ,%s , %s ,%s %s", this.f426936e, this.f426937f, this.f426943l, this.f426944m, this.f426945n, this.f426946o);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SportsAppMsgContent", "parseContent: key:%s , value :%s", str, str2);
            ((java.util.HashMap) map2).put(str, str2);
            i17++;
        }
    }
}
