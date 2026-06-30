package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes9.dex */
public final class j extends com.tencent.mm.ui.chatting.history.groups.g {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.j f201762f = new com.tencent.mm.ui.chatting.history.groups.j();

    /* renamed from: g, reason: collision with root package name */
    public static final int f201763g = com.tencent.mm.R.string.pdx;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f201764h = kz5.b0.c(dd5.s0.f229279b);

    /* renamed from: i, reason: collision with root package name */
    public static final ad5.l0[] f201765i = {ad5.q.f3294a, ad5.e.f3244a, ad5.d.f3242a, ad5.y.f3328a};

    public j() {
        super(null);
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public ad5.l0[] a() {
        return f201765i;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public int b() {
        return f201763g;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public java.util.List c() {
        return f201764h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.history.groups.j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1605752438;
    }

    public java.lang.String toString() {
        return "MsgHistoryGalleryGroupFile";
    }
}
