package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes9.dex */
public final class q extends com.tencent.mm.ui.chatting.history.groups.g {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.q f201782f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f201783g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f201784h;

    /* renamed from: i, reason: collision with root package name */
    public static final ad5.l0[] f201785i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f201786j;

    static {
        com.tencent.mm.ui.chatting.history.groups.q qVar = new com.tencent.mm.ui.chatting.history.groups.q();
        f201782f = qVar;
        f201783g = com.tencent.mm.R.string.f493860pe2;
        f201784h = kz5.c0.i(dd5.p1.f229243b, dd5.f3.f229141b);
        f201785i = new ad5.l0[]{ad5.q.f3294a, ad5.e.f3244a, ad5.d.f3242a, ad5.j0.f3273a};
        f201786j = true;
        qVar.f201753b = 4;
    }

    public q() {
        super(null);
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public ad5.l0[] a() {
        return f201785i;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public int b() {
        return f201783g;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public java.util.List c() {
        return f201784h;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public boolean d() {
        return f201786j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.history.groups.q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1754943958;
    }

    public java.lang.String toString() {
        return "MsgHistoryGalleryGroupMedia";
    }
}
