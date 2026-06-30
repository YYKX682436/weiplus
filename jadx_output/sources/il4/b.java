package il4;

/* loaded from: classes9.dex */
public class b extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f292096b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292097c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292098d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f292099e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f292100f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v70 f292101g;

    @Override // ot0.h
    public ot0.h a() {
        il4.b bVar = new il4.b();
        bVar.f292096b = this.f292096b;
        bVar.f292097c = this.f292097c;
        bVar.f292098d = this.f292098d;
        bVar.f292099e = this.f292099e;
        bVar.f292100f = this.f292100f;
        bVar.f292101g = this.f292101g;
        return bVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<tingChatRoomItem>");
        sb6.append("<type>");
        sb6.append(this.f292096b);
        sb6.append("</type>");
        sb6.append("<categoryItem>");
        sb6.append(this.f292097c);
        sb6.append("</categoryItem>");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f292099e)) {
            sb6.append("<categoryId>");
            sb6.append(this.f292099e);
            sb6.append("</categoryId>");
        } else if (this.f292100f != null) {
            sb6.append("<categoryId>");
            java.lang.String c17 = this.f292100f.c();
            if (c17 == null) {
                c17 = "";
            }
            sb6.append(c17);
            sb6.append("</categoryId>");
        }
        sb6.append("<listenItem>");
        sb6.append(this.f292098d);
        sb6.append("</listenItem>");
        sb6.append("</tingChatRoomItem>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f292097c = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.categoryItem");
        this.f292096b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.type"), 0);
        this.f292099e = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.categoryId");
        this.f292098d = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.listenItem");
        this.f292100f = il4.d.v(this.f292097c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f292099e)) {
            bw5.o50 o50Var = this.f292100f;
            this.f292099e = o50Var != null ? o50Var.c() : "";
        }
        this.f292101g = il4.d.w(this.f292098d);
    }
}
