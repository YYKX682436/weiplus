package o41;

/* loaded from: classes5.dex */
public class b extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f342816l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f342817m;

    /* renamed from: n, reason: collision with root package name */
    public int f342818n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f342819o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f342820p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f342821q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f342822r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f342823s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f342824t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f342825u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f342826v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f342827w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f342828x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f342829y;

    public b(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f342819o = new java.util.LinkedList();
        this.f342820p = new java.util.LinkedList();
        this.f342821q = new java.util.LinkedList();
        this.f342822r = new java.util.LinkedList();
        this.f342823s = new java.util.LinkedList();
        this.f342824t = null;
        this.f342825u = null;
        this.f342826v = null;
        this.f342827w = null;
        this.f342828x = null;
        this.f342829y = null;
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] values == null ");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f225788d) || !this.f225788d.equalsIgnoreCase("NewXmlOpenIMChatRoomAddChatRoomMemberApplication")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f225788d;
            objArr2[0] = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMChatRoomAddChatRoomMemberApplicationNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        this.f342816l = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.RoomName");
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text")) {
            java.lang.String str3 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.text");
            if (str3 == null) {
                str3 = "";
            }
            this.f342828x = str3;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username")) {
            java.lang.String str4 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.username");
            if (str4 == null) {
                str4 = "";
            }
            this.f342824t = str4;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid")) {
            java.lang.String str5 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.appid");
            if (str5 == null) {
                str5 = "";
            }
            this.f342825u = str5;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid")) {
            java.lang.String str6 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.inviter.descid");
            if (str6 == null) {
                str6 = "";
            }
            this.f342826v = str6;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason")) {
            java.lang.String str7 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.invitationreason");
            if (str7 == null) {
                str7 = "";
            }
            this.f342827w = str7;
        }
        if (map.containsKey(d21.c.f225783j)) {
            java.lang.String str8 = (java.lang.String) map.get(d21.c.f225783j);
            if (str8 == null) {
                str8 = "";
            }
            this.f342829y = str8;
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket")) {
            this.f342817m = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.ticket");
        }
        if (map.containsKey(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize")) {
            this.f342818n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.memberlistsize"), 0);
        }
        boolean I2 = this.f225786b.I2();
        java.util.LinkedList linkedList = this.f225793i;
        java.util.LinkedList linkedList2 = this.f225792h;
        java.util.LinkedList linkedList3 = this.f225791g;
        if (I2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            java.lang.String str9 = this.f342829y + " ";
            this.f225787c = str9;
            linkedList2.add(java.lang.Integer.valueOf(str9.length()));
            linkedList3.add(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492273fw3));
            java.lang.String str10 = this.f225787c + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492273fw3);
            this.f225787c = str10;
            linkedList.add(java.lang.Integer.valueOf(str10.length()));
        } else {
            linkedList2.add(java.lang.Integer.valueOf(this.f342829y.length()));
            linkedList3.add(this.f342828x);
            java.lang.String str11 = this.f342829y + this.f342828x;
            this.f225787c = str11;
            linkedList.add(java.lang.Integer.valueOf(str11.length()));
        }
        for (int i17 = 0; i17 < this.f342818n; i17++) {
            java.util.LinkedList linkedList4 = this.f342823s;
            java.util.LinkedList linkedList5 = this.f342821q;
            java.util.LinkedList linkedList6 = this.f342822r;
            java.util.LinkedList linkedList7 = this.f342820p;
            java.util.LinkedList linkedList8 = this.f342819o;
            if (i17 == 0) {
                java.lang.String str12 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.username");
                if (str12 == null) {
                    str12 = "";
                }
                linkedList8.add(str12);
                java.lang.String str13 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.nickname");
                if (str13 == null) {
                    str13 = "";
                }
                linkedList7.add(str13);
                java.lang.String str14 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.descid");
                if (str14 == null) {
                    str14 = "";
                }
                linkedList5.add(str14);
                java.lang.String str15 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.appid");
                if (str15 == null) {
                    str15 = "";
                }
                linkedList6.add(str15);
                java.lang.String str16 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member.headimgurl");
                if (str16 == null) {
                    str16 = "";
                }
                linkedList4.add(str16);
            } else {
                java.lang.String str17 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".username");
                if (str17 == null) {
                    str17 = "";
                }
                linkedList8.add(str17);
                java.lang.String str18 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".nickname");
                if (str18 == null) {
                    str18 = "";
                }
                linkedList7.add(str18);
                java.lang.String str19 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".appid");
                if (str19 == null) {
                    str19 = "";
                }
                linkedList6.add(str19);
                java.lang.String str20 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".descid");
                if (str20 == null) {
                    str20 = "";
                }
                linkedList5.add(str20);
                java.lang.String str21 = (java.lang.String) map.get(".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication.link.memberlist.member" + i17 + ".headimgurl");
                if (str21 == null) {
                    str21 = "";
                }
                linkedList4.add(str21);
            }
        }
        return true;
    }
}
