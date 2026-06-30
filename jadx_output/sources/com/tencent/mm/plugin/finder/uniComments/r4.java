package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class r4 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.i f130397d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f130398e;

    public r4(jv2.i commentItem, java.lang.String feedUsername, boolean z17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        this.f130397d = commentItem;
        this.f130398e = feedUsername;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, com.tencent.mm.R.string.f490359sr);
            jv2.i iVar = this.f130397d;
            java.lang.String L0 = iVar.f302223d.L0();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            boolean z17 = (kotlin.jvm.internal.o.b(L0, xy2.c.e(context)) || kotlin.jvm.internal.o.b(iVar.f302223d.L0(), c01.z1.r())) ? false : true;
            if (z17) {
                contextMenu.add(0, 2, 1, com.tencent.mm.R.string.f490394tr);
            }
            jv2.c cVar = iVar.f302223d;
            cVar.getClass();
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            boolean z18 = kotlin.jvm.internal.o.b(xy2.c.e(context2), cVar.L0()) || kotlin.jvm.internal.o.b(c01.z1.r(), cVar.L0());
            java.lang.String str = this.f130398e;
            if (z18 || hc2.l.g(str)) {
                contextMenu.add(0, 1, 2, com.tencent.mm.R.string.f490367t0);
            }
            if (z17 && hc2.l.g(str)) {
                if (!iVar.f302223d.P0()) {
                    contextMenu.add(0, 3, 3, com.tencent.mm.R.string.cki);
                } else if (com.tencent.mm.plugin.finder.storage.t70.f127590a.i()) {
                    contextMenu.add(0, 3, 3, com.tencent.mm.R.string.cki);
                }
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }
}
