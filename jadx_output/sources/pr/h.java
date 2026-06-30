package pr;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f357709a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f357710b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f357711c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f357712d;

    /* renamed from: e, reason: collision with root package name */
    public int f357713e;

    /* renamed from: f, reason: collision with root package name */
    public int f357714f;

    public h(java.util.List md5List, com.tencent.mm.protobuf.g gVar, yz5.p pVar) {
        kotlin.jvm.internal.o.g(md5List, "md5List");
        this.f357709a = md5List;
        this.f357710b = gVar;
        this.f357711c = pVar;
        this.f357712d = "MicroMsg.EmojiMd5ToInfo";
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMd5ToInfo", "request size: " + md5List.size());
        if (!md5List.isEmpty()) {
            a();
        } else if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, 0);
        }
    }

    public final void a() {
        int i17 = this.f357714f;
        this.f357713e = i17;
        int i18 = i17 + 100;
        this.f357714f = i18;
        java.util.List list = this.f357709a;
        if (i18 > list.size()) {
            this.f357714f = list.size();
        }
        new hr.a(1, 0, list.subList(this.f357713e, this.f357714f), this.f357710b, null, 16, null).l().K(new pr.g(this));
    }
}
