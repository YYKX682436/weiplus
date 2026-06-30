package d21;

/* loaded from: classes5.dex */
public class d extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f225794l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225795m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225796n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f225797o;

    public d(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f225794l = new java.util.LinkedList();
        this.f225795m = null;
        this.f225796n = null;
        this.f225797o = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f225788d) || !this.f225788d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f225788d;
            objArr2[0] = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        if (map.containsKey(d21.c.f225783j)) {
            java.lang.String str3 = (java.lang.String) map.get(d21.c.f225783j);
            if (str3 == null) {
                str3 = "";
            }
            this.f225795m = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text");
            if (str4 == null) {
                str4 = "";
            }
            this.f225796n = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket");
            this.f225797o = str5 != null ? str5 : "";
        }
        this.f225787c = this.f225795m;
        if (this.f225786b.I2()) {
            this.f225787c += " " + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fw7);
        } else {
            this.f225791g.add(this.f225796n);
            this.f225792h.add(java.lang.Integer.valueOf(this.f225787c.length()));
            java.lang.String str6 = this.f225787c + this.f225796n;
            this.f225787c = str6;
            this.f225793i.add(java.lang.Integer.valueOf(str6.length()));
        }
        for (java.lang.String str7 : map.keySet()) {
            if (str7.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username")) {
                this.f225794l.add((java.lang.String) map.get(str7));
            }
        }
        return true;
    }
}
