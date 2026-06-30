package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedContactChangeEvent f125843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderContactSearchUI f125844e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent, com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI) {
        super(0);
        this.f125843d = feedContactChangeEvent;
        this.f125844e = finderContactSearchUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent = this.f125843d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(feedContactChangeEvent.f54246g.f6341a)) {
            com.tencent.mm.plugin.finder.search.FinderContactSearchUI finderContactSearchUI = this.f125844e;
            java.lang.String str = finderContactSearchUI.f125528t;
            am.ca caVar = feedContactChangeEvent.f54246g;
            java.lang.String str2 = caVar.f6341a;
            java.util.Iterator it = finderContactSearchUI.f125534z.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str3 = caVar.f6341a;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.mu2) next).getCustom(0);
                if (kotlin.jvm.internal.o.b(str3, finderContact != null ? finderContact.getUsername() : null)) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = finderContactSearchUI.I;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.o.o("recyclerView");
                        throw null;
                    }
                    androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemChanged(i17);
                    }
                }
                i17 = i18;
            }
        }
        return jz5.f0.f302826a;
    }
}
