package d21;

/* loaded from: classes5.dex */
public class e extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f225798l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225799m;

    /* renamed from: n, reason: collision with root package name */
    public int f225800n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f225801o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f225802p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f225803q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f225804r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f225805s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f225806t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f225807u;

    public e(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f225801o = new java.util.LinkedList();
        this.f225802p = new java.util.LinkedList();
        this.f225803q = new java.util.LinkedList();
        this.f225804r = null;
        this.f225805s = null;
        this.f225806t = null;
        this.f225807u = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f225788d) || !this.f225788d.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f225788d;
            objArr2[0] = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        this.f225798l = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName");
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text")) {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text");
            if (str3 == null) {
                str3 = "";
            }
            this.f225806t = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername");
            if (str4 == null) {
                str4 = "";
            }
            this.f225804r = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason");
            if (str5 == null) {
                str5 = "";
            }
            this.f225805s = str5;
        }
        if (map.containsKey(d21.c.f225783j)) {
            java.lang.String str6 = (java.lang.String) map.get(d21.c.f225783j);
            if (str6 == null) {
                str6 = "";
            }
            this.f225807u = str6;
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket")) {
            this.f225799m = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket");
        }
        if (map.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")) {
            this.f225800n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
        }
        boolean I2 = this.f225786b.I2();
        java.util.LinkedList linkedList = this.f225793i;
        java.util.LinkedList linkedList2 = this.f225792h;
        java.util.LinkedList linkedList3 = this.f225791g;
        if (I2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            java.lang.String str7 = this.f225807u + " ";
            this.f225787c = str7;
            linkedList2.add(java.lang.Integer.valueOf(str7.length()));
            linkedList3.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492273fw3));
            java.lang.String str8 = this.f225787c + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492273fw3);
            this.f225787c = str8;
            linkedList.add(java.lang.Integer.valueOf(str8.length()));
        } else {
            linkedList2.add(java.lang.Integer.valueOf(this.f225807u.length()));
            linkedList3.add(this.f225806t);
            java.lang.String str9 = this.f225807u + this.f225806t;
            this.f225787c = str9;
            linkedList.add(java.lang.Integer.valueOf(str9.length()));
        }
        for (int i17 = 0; i17 < this.f225800n; i17++) {
            java.util.LinkedList linkedList4 = this.f225803q;
            java.util.LinkedList linkedList5 = this.f225802p;
            java.util.LinkedList linkedList6 = this.f225801o;
            if (i17 == 0) {
                java.lang.String str10 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username");
                if (str10 == null) {
                    str10 = "";
                }
                linkedList6.add(str10);
                java.lang.String str11 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname");
                if (str11 == null) {
                    str11 = "";
                }
                linkedList5.add(str11);
                java.lang.String str12 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl");
                if (str12 == null) {
                    str12 = "";
                }
                linkedList4.add(str12);
            } else {
                java.lang.String str13 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".username");
                if (str13 == null) {
                    str13 = "";
                }
                linkedList6.add(str13);
                java.lang.String str14 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".nickname");
                if (str14 == null) {
                    str14 = "";
                }
                linkedList5.add(str14);
                java.lang.String str15 = (java.lang.String) map.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i17 + ".headimgurl");
                if (str15 == null) {
                    str15 = "";
                }
                linkedList4.add(str15);
            }
        }
        return true;
    }
}
