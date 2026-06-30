package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class i0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.y0 f132274d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f132275e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f132276f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f132277g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f132278h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f132279i;

    public i0(so2.y0 commentItem, com.tencent.mm.plugin.finder.storage.FinderItem feedObject, android.content.Context context, boolean z17, boolean z18, java.lang.String str) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(context, "context");
        this.f132274d = commentItem;
        this.f132275e = feedObject;
        this.f132276f = context;
        this.f132277g = z17;
        this.f132278h = z18;
        this.f132279i = str;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f132275e;
        java.lang.String userName = finderItem.getUserName();
        boolean g17 = hc2.l.g(userName);
        menu.a(0, com.tencent.mm.R.string.f490359sr);
        so2.y0 y0Var = this.f132274d;
        if (y0Var.h() != 3) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Uc).getValue()).r()).booleanValue() && !y0Var.f410703d.j1()) {
                if (((y0Var.f410703d.u0().getExtFlag() & 256) == 0) && !finderItem.isQAFeed()) {
                    menu.a(17, com.tencent.mm.R.string.f493406k20);
                }
            }
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Kc).getValue()).r()).booleanValue()) {
            if (this.f132277g) {
                menu.a(14, com.tencent.mm.R.string.f492113o31);
            } else if (!this.f132278h || !((java.lang.Boolean) ((jz5.n) y0Var.f410708i).getValue()).booleanValue()) {
                menu.a(13, com.tencent.mm.R.string.f492112o30);
            }
        }
        if (y0Var.h() == 3) {
            return;
        }
        if (!y0Var.f410703d.j1() && y0Var.f410703d.Y0() == 0 && g17) {
            if (hc2.c0.c(y0Var.f410703d.z0())) {
                menu.a(7, com.tencent.mm.R.string.lsu);
            } else {
                menu.a(6, com.tencent.mm.R.string.f8k);
            }
        }
        java.lang.String Z0 = y0Var.f410703d.Z0();
        android.content.Context context = this.f132276f;
        boolean z17 = (kotlin.jvm.internal.o.b(Z0, xy2.c.e(context)) || kotlin.jvm.internal.o.b(y0Var.f410703d.Z0(), c01.z1.r())) ? false : true;
        if (z17 && !y0Var.f410703d.j1() && !finderItem.isQAFeed() && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Pd).getValue()).r()).intValue() == 1) {
            java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_Dislike");
            if (d17 == null) {
                d17 = context.getString(com.tencent.mm.R.string.lrl);
                kotlin.jvm.internal.o.f(d17, "getString(...)");
            }
            java.lang.String string = context.getString(com.tencent.mm.R.string.mgn);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            menu.o(5, d17, string);
        }
        if (z17 || y0Var.f410703d.j1()) {
            menu.a(2, com.tencent.mm.R.string.f490394tr);
        }
        if (com.tencent.mm.plugin.finder.view.q0.f132862a.a(this.f132276f, this.f132274d, userName, finderItem.isQAFeed(), this.f132279i)) {
            menu.a(1, com.tencent.mm.R.string.f490367t0);
        }
        if (z17) {
            if (g17 && !y0Var.f410703d.j1() && !finderItem.isMemberFeed()) {
                if (y0Var.f410703d.u0().getBlacklist_flag() == 0) {
                    if (!y0Var.f410703d.e1()) {
                        menu.a(3, com.tencent.mm.R.string.cki);
                    } else if (t70Var2.i()) {
                        menu.a(3, com.tencent.mm.R.string.cki);
                    }
                } else if (y0Var.f410703d.u0().getBlacklist_flag() == 1) {
                    if (!y0Var.f410703d.e1()) {
                        menu.a(4, com.tencent.mm.R.string.f1u);
                    } else if (t70Var2.i()) {
                        menu.a(4, com.tencent.mm.R.string.f1u);
                    }
                }
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
