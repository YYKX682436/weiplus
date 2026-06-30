package rd5;

/* loaded from: classes9.dex */
public class d extends xm3.a implements rd5.a {

    /* renamed from: d, reason: collision with root package name */
    public we5.a f394254d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f394255e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f394256f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f394257g;

    /* renamed from: h, reason: collision with root package name */
    public we5.y0 f394258h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.a0 f394259i;

    static {
        new rd5.c(null);
    }

    public d(we5.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f394254d = params;
        this.f394255e = "";
        this.f394256f = "";
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        rd5.d other = (rd5.d) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f394254d.f445300b.T1(), other.f394254d.f445300b.T1());
    }

    @Override // xm3.a, in5.c
    public int h() {
        return ((com.tencent.mm.ui.chatting.viewitems.wr) com.tencent.mm.ui.chatting.viewitems.xr.a(this.f394254d.f445299a)).c(this.f394254d.f445300b);
    }

    @Override // xm3.a, xm3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public rd5.d y0() {
        rd5.d dVar = (rd5.d) super.y0();
        we5.a aVar = this.f394254d;
        yb5.d dVar2 = aVar.f445299a;
        java.lang.Object clone = aVar.f445300b.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type com.tencent.mm.storage.MsgInfo");
        dVar.f394254d = new we5.a(dVar2, (com.tencent.mm.storage.f9) clone);
        return dVar;
    }

    public we5.b o() {
        java.lang.Object obj = this.f394259i;
        if (obj instanceof we5.b) {
            return (we5.b) obj;
        }
        return null;
    }

    @Override // xm3.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean X(rd5.d other) {
        java.util.List list;
        java.util.List list2;
        kotlin.jvm.internal.o.g(other, "other");
        if (this.f394257g == other.f394257g) {
            we5.y0 y0Var = this.f394258h;
            java.lang.Integer num = null;
            java.lang.Integer valueOf = (y0Var == null || (list2 = y0Var.f445404c) == null) ? null : java.lang.Integer.valueOf(((java.util.ArrayList) list2).size());
            we5.y0 y0Var2 = other.f394258h;
            if (y0Var2 != null && (list = y0Var2.f445404c) != null) {
                num = java.lang.Integer.valueOf(((java.util.ArrayList) list).size());
            }
            if (kotlin.jvm.internal.o.b(valueOf, num) && kotlin.jvm.internal.o.b(this.f394255e, other.f394255e) && kotlin.jvm.internal.o.b(this.f394256f, other.f394256f)) {
                return rd5.e.a(this.f394254d.f445300b, other.f394254d.f445300b);
            }
            return false;
        }
        return false;
    }

    @Override // xm3.d
    public java.lang.String v() {
        com.tencent.mm.storage.f9 msgInfo = this.f394254d.f445300b;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return kz5.n0.g0(kz5.c0.i(java.lang.String.valueOf(msgInfo.Q0()), java.lang.String.valueOf(msgInfo.getMsgId()), java.lang.String.valueOf(msgInfo.T1())), "||", null, null, 0, null, null, 62, null);
    }
}
