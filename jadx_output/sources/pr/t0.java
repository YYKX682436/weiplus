package pr;

/* loaded from: classes12.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f357784a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357785b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f357786c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f357787d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f357788e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f357789f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f357790g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f357791h;

    public t0(int i17, java.lang.String str, boolean z17, yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f357784a = i17;
        this.f357785b = str;
        this.f357786c = z17;
        this.f357787d = callback;
        this.f357788e = new java.util.LinkedList();
        this.f357789f = new java.util.LinkedList();
        this.f357791h = kz5.r0.f314002d;
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_LAST_DOWNLOAD_REQ_BUFF_STRING, null);
        java.lang.String str2 = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        if (str2 != null) {
            this.f357790g = new com.tencent.mm.protobuf.g(android.util.Base64.decode(str2, 2));
        }
        java.util.ArrayList a17 = gr.t.g().a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).getMd5());
        }
        this.f357791h = kz5.n0.Q0(arrayList);
        a();
    }

    public final void a() {
        com.tencent.mm.protobuf.g gVar;
        int i17 = this.f357784a;
        com.tencent.mm.protobuf.g gVar2 = this.f357790g;
        java.lang.String str = this.f357785b;
        if (str != null) {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            gVar = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        } else {
            gVar = null;
        }
        new hr.a(2, i17, null, gVar2, gVar, 4, null).l().K(new pr.s0(this));
    }
}
