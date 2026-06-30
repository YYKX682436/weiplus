package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes9.dex */
public final class k extends com.tencent.mm.ui.chatting.history.groups.g {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.k f201766f = new com.tencent.mm.ui.chatting.history.groups.k();

    /* renamed from: g, reason: collision with root package name */
    public static final int f201767g = com.tencent.mm.R.string.pdy;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f201768h = kz5.b0.c(dd5.c1.f229100b);

    /* renamed from: i, reason: collision with root package name */
    public static final ad5.l0[] f201769i = {ad5.q.f3294a, ad5.e.f3244a, ad5.d.f3242a};

    public k() {
        super(null);
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public ad5.l0[] a() {
        return f201769i;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public int b() {
        return f201767g;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public java.util.List c() {
        return f201768h;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.history.groups.k)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 1234895520;
    }

    public java.lang.String toString() {
        return "MsgHistoryGalleryGroupFinder";
    }
}
