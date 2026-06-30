package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class q4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f130387d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f130388e;

    public q4(jv2.i commentItem, java.lang.String feedUsername) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        this.f130387d = commentItem;
        this.f130388e = feedUsername;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String str = this.f130388e;
        if (hc2.l.g(str)) {
            boolean z17 = false;
            menu.a(0, com.tencent.mm.R.string.f490359sr);
            jv2.i iVar = this.f130387d;
            java.lang.String L0 = iVar.f302223d.L0();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (!kotlin.jvm.internal.o.b(L0, xy2.c.e(context)) && !kotlin.jvm.internal.o.b(iVar.f302223d.L0(), c01.z1.r())) {
                z17 = true;
            }
            if (z17) {
                menu.a(2, com.tencent.mm.R.string.f490394tr);
            }
            menu.a(1, com.tencent.mm.R.string.f490367t0);
            if (z17 && hc2.l.g(str)) {
                if (!iVar.f302223d.P0()) {
                    menu.a(3, com.tencent.mm.R.string.cki);
                } else if (com.tencent.mm.plugin.finder.storage.t70.f127590a.i()) {
                    menu.a(3, com.tencent.mm.R.string.cki);
                }
            }
        }
    }
}
