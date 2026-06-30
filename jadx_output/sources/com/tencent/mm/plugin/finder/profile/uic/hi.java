package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class hi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ri f123774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ii f123775e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(com.tencent.mm.plugin.finder.profile.uic.ri riVar, com.tencent.mm.plugin.finder.profile.uic.ii iiVar) {
        super(0);
        this.f123774d = riVar;
        this.f123775e = iiVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateState] state=");
        com.tencent.mm.plugin.finder.profile.uic.ri riVar = this.f123774d;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader = riVar.f124196o;
        if (finderProfileTingSongListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderProfileTingSongListLoader.f107619m);
        sb6.append(" cachedState=");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader2 = riVar.f124196o;
        if (finderProfileTingSongListLoader2 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        sb6.append(finderProfileTingSongListLoader2.f107620n);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileTingSongListUIC", sb6.toString());
        android.widget.FrameLayout frameLayout = com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434691c;
        frameLayout.setOnClickListener(null);
        frameLayout.setVisibility(8);
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader3 = riVar.f124196o;
        if (finderProfileTingSongListLoader3 == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        if (finderProfileTingSongListLoader3.f107620n == com.tencent.mm.plugin.finder.feed.model.c7.f107753e) {
            int ordinal = finderProfileTingSongListLoader3.f107619m.ordinal();
            if (ordinal == 1) {
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434691c.setVisibility(0);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434690b.setVisibility(8);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434694f.setVisibility(8);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434692d.setVisibility(0);
            } else if (ordinal == 2) {
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434691c.setVisibility(0);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434690b.setVisibility(0);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434694f.setVisibility(8);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434692d.setVisibility(8);
            } else if (ordinal == 3) {
                android.widget.FrameLayout frameLayout2 = com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434691c;
                frameLayout2.setVisibility(0);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434690b.setVisibility(8);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434694f.setVisibility(0);
                com.tencent.mm.plugin.finder.profile.uic.ri.O6(riVar).f434692d.setVisibility(8);
                frameLayout2.setOnClickListener(new com.tencent.mm.plugin.finder.profile.uic.gi(riVar, this.f123775e));
            }
        }
        return jz5.f0.f302826a;
    }
}
