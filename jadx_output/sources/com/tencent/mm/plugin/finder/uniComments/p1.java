package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class p1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final jv2.d f130352d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f130353e;

    public p1(jv2.d commentItem, java.lang.String feedUsername, boolean z17) {
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        this.f130352d = commentItem;
        this.f130353e = feedUsername;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, com.tencent.mm.R.string.f490359sr);
            jv2.a aVar = this.f130352d.f302207d;
            aVar.getClass();
            if (kotlin.jvm.internal.o.b(c01.z1.r(), aVar.D0()) || kotlin.jvm.internal.o.b(this.f130353e, en1.a.a())) {
                contextMenu.add(0, 1, 2, com.tencent.mm.R.string.f490367t0);
            }
        }
    }
}
