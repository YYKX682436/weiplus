package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedContactChangeEvent f125975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter f125976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent, com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter) {
        super(0);
        this.f125975d = feedContactChangeEvent;
        this.f125976e = finderMixSearchPresenter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.search.l3 l3Var;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent = this.f125975d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(feedContactChangeEvent.f54246g.f6341a)) {
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = this.f125976e;
            java.lang.String str = finderMixSearchPresenter.f125565d;
            am.ca caVar = feedContactChangeEvent.f54246g;
            java.lang.String str2 = caVar.f6341a;
            java.util.Iterator it = finderMixSearchPresenter.f125571m.iterator();
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
                if (kotlin.jvm.internal.o.b(str3, finderContact != null ? finderContact.getUsername() : null) && (l3Var = finderMixSearchPresenter.f125580v) != null && (recyclerView = ((com.tencent.mm.plugin.finder.search.t3) l3Var).f125868r) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyItemChanged(i18);
                }
                i17 = i18;
            }
        }
        return jz5.f0.f302826a;
    }
}
