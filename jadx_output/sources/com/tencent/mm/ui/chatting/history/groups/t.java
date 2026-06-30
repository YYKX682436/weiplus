package com.tencent.mm.ui.chatting.history.groups;

/* loaded from: classes9.dex */
public final class t extends com.tencent.mm.ui.chatting.history.groups.g {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.history.groups.t f201793f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f201794g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f201795h;

    /* renamed from: i, reason: collision with root package name */
    public static final ad5.l0[] f201796i;

    /* renamed from: j, reason: collision with root package name */
    public static final boolean f201797j;

    static {
        com.tencent.mm.ui.chatting.history.groups.t tVar = new com.tencent.mm.ui.chatting.history.groups.t();
        f201793f = tVar;
        f201794g = com.tencent.mm.R.string.f493863pe5;
        f201795h = kz5.b0.c(dd5.d0.f229110b);
        f201796i = new ad5.l0[]{ad5.q.f3294a, ad5.d.f3242a};
        f201797j = true;
        tVar.f201753b = 4;
    }

    public t() {
        super(null);
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public ad5.l0[] a() {
        return f201796i;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public int b() {
        return f201794g;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public java.util.List c() {
        return f201795h;
    }

    @Override // com.tencent.mm.ui.chatting.history.groups.g
    public boolean d() {
        return f201797j;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.history.groups.t)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1410019837;
    }

    public java.lang.String toString() {
        return "MsgHistoryGalleryGroupSticker";
    }
}
