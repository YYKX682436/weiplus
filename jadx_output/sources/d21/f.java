package d21;

/* loaded from: classes5.dex */
public class f extends d21.c {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f225808l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225809m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225810n;

    public f(java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        super(map, f9Var);
        this.f225808l = new java.util.LinkedList();
    }

    @Override // d21.c
    public boolean b() {
        java.util.Map map = this.f225785a;
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] values == null ");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type:%s, values size:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f225788d) || !this.f225788d.equalsIgnoreCase("delchatroommember")) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            java.lang.String str2 = this.f225788d;
            objArr2[0] = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.e("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] type err :%s", objArr2);
            return false;
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.delchatroommember.url");
        if (str3 == null) {
            str3 = "";
        }
        this.f225810n = str3;
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.delchatroommember.link.qrcode");
        this.f225809m = str4 != null ? str4 : "";
        java.util.LinkedList linkedList = this.f225808l;
        linkedList.add((java.lang.String) map.get(".sysmsg.delchatroommember.link.memberlist.username"));
        for (java.lang.String str5 : map.keySet()) {
            if (str5.startsWith(".sysmsg.delchatroommember.link.memberlist.username#")) {
                linkedList.add((java.lang.String) map.get(str5));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.String str6 : map.keySet()) {
            if (str6.startsWith(d21.c.f225783j)) {
                if (sb6.length() > 0) {
                    sb6.insert(0, (java.lang.String) map.get(str6));
                } else {
                    sb6.append((java.lang.String) map.get(str6));
                }
            } else if (str6.startsWith(".sysmsg.delchatroommember.link.text")) {
                sb6.append((java.lang.String) map.get(str6));
                this.f225791g.add((java.lang.String) map.get(str6));
                i17 = ((java.lang.String) map.get(str6)).length();
            }
        }
        this.f225792h.addFirst(java.lang.Integer.valueOf(sb6.length() - i17));
        this.f225793i.add(java.lang.Integer.valueOf(sb6.length()));
        this.f225787c = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.DelChatroomMemberNewXmlMsg", "[parseXml] url:%s, qrcode:%s, members size :%s", this.f225810n, this.f225809m, java.lang.Integer.valueOf(linkedList.size()));
        return true;
    }
}
