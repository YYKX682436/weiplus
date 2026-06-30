package com.tencent.mm.plugin.finder.member.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/ui/FinderMemberTimelineUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/hm;", "Lcom/tencent/mm/plugin/finder/feed/em;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public final class FinderMemberTimelineUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI<com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader, com.tencent.mm.plugin.finder.feed.hm, com.tencent.mm.plugin.finder.feed.em> {
    public android.view.View A;
    public int F;
    public int G;
    public int H;

    /* renamed from: J, reason: collision with root package name */
    public int f121416J;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.em f121417x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.hm f121418y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader f121419z;
    public final int B = 2;
    public java.lang.String C = "";
    public java.lang.String D = "";
    public int E = -1;
    public java.lang.String I = "";
    public int K = -1;
    public final lo2.q0 L = new lo2.q0(this);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (this.E == -1) {
            this.E = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        }
        if (this.K == -1) {
            this.K = getIntent().getIntExtra("key_finder_member_feed_type", 0);
        }
        if (this.E != 0) {
            return this.K == 1 ? 257 : 256;
        }
        if (this.K == 1) {
            return com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE;
        }
        return 258;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader d7() {
        com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader = this.f121419z;
        if (finderMemberTimelineLoader != null) {
            return finderMemberTimelineLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.dj e7() {
        com.tencent.mm.plugin.finder.feed.em emVar = this.f121417x;
        if (emVar != null) {
            return emVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public com.tencent.mm.plugin.finder.feed.gj g7() {
        com.tencent.mm.plugin.finder.feed.hm hmVar = this.f121418y;
        if (hmVar != null) {
            return hmVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b2z;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public void h7() {
        java.util.ArrayList arrayList;
        java.util.ArrayList<so2.j5> arrayList2;
        getWindow().addFlags(8192);
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.C = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_finder_member_ticket");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.D = stringExtra2;
        this.E = getIntent().getIntExtra("key_finder_member_visitor_status", 0);
        this.K = getIntent().getIntExtra("key_finder_member_feed_type", 0);
        this.F = getIntent().getIntExtra("key_member_price", 0);
        this.G = getIntent().getIntExtra("key_member_subscribe_price", 0);
        this.H = getIntent().getIntExtra("key_enable_member_subscribe", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_member_title");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.I = stringExtra3;
        int intExtra = getIntent().getIntExtra("key_remain_feed_count", 0);
        this.f121416J = getIntent().getIntExtra("key_member_preview_mode", 0);
        setMMTitle("");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484229dg3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A = findViewById;
        if (this.C.length() == 0) {
            finish();
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.member.preview.k kVar = (com.tencent.mm.plugin.finder.member.preview.k) zVar.a(context).a(com.tencent.mm.plugin.finder.member.preview.k.class);
        java.lang.String username = this.C;
        int i17 = this.F;
        int i18 = this.G;
        int i19 = this.H;
        java.lang.String title = this.I;
        int i27 = this.K;
        int i28 = this.f121416J;
        kVar.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(title, "title");
        kVar.f121243h = username;
        android.app.Activity context2 = kVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        kVar.f121242g = new com.tencent.mm.plugin.finder.storage.ha0(nyVar != null ? nyVar.f135380n : -1, null, false, kVar.f121243h, 6, null);
        kVar.f121244i = i17;
        kVar.f121245m = i18;
        kVar.f121246n = i19;
        kVar.f121251s = i28;
        kVar.f121247o = title;
        kVar.f121248p = ya2.h.f460484a.b(kVar.f121243h);
        kVar.f121249q = i27;
        kVar.f121250r = intExtra;
        com.tencent.mm.plugin.finder.feed.em emVar = new com.tencent.mm.plugin.finder.feed.em(this, this.B, this.C, this.E, this.K);
        this.f121417x = emVar;
        this.f121418y = new com.tencent.mm.plugin.finder.feed.hm(this, emVar, this.B, getD());
        com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader finderMemberTimelineLoader = new com.tencent.mm.plugin.finder.feed.model.FinderMemberTimelineLoader(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), this.C, this.D, this.K);
        finderMemberTimelineLoader.initFromCache(getIntent());
        if (this.E == 0 && finderMemberTimelineLoader.getInitPos() == 0) {
            pm0.v.X(new lo2.r0(this));
        }
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderMemberTimelineLoader.getCache();
        if (cache != null && (arrayList2 = cache.f108300a) != null) {
            for (so2.j5 j5Var : arrayList2) {
                kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (baseFinderFeed.h() != -18) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(baseFinderFeed.getFeedObject().getFeedObject(), getD(), null);
                } else {
                    com.tencent.mm.plugin.finder.feed.hm hmVar = this.f121418y;
                    if (hmVar == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    hmVar.f106929s = true;
                }
            }
        }
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderMemberTimelineLoader.getCache();
        if (cache2 != null && (arrayList = cache2.f108300a) != null) {
            kz5.h0.B(arrayList, lo2.n0.f320158d);
        }
        finderMemberTimelineLoader.setInitDone(new lo2.o0(this, finderMemberTimelineLoader));
        finderMemberTimelineLoader.f107523g = new lo2.p0(this);
        this.f121419z = finderMemberTimelineLoader;
        com.tencent.mm.plugin.finder.feed.model.r9 cache3 = finderMemberTimelineLoader.getCache();
        java.util.ArrayList arrayList3 = cache3 != null ? cache3.f108300a : null;
        com.tencent.mm.plugin.finder.feed.hm hmVar2 = this.f121418y;
        if (hmVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (hmVar2.f106929s || intExtra <= 0 || this.E != 0 || arrayList3 == null) {
            return;
        }
        arrayList3.add(new jo2.c(this.C, this.I, new com.tencent.mm.plugin.finder.storage.FinderItem(), this.K));
        com.tencent.mm.plugin.finder.feed.hm hmVar3 = this.f121418y;
        if (hmVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        hmVar3.f106929s = true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI
    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.importUIComponents());
        Q0.add(eo2.b.class);
        Q0.add(go2.a1.class);
        Q0.add(com.tencent.mm.plugin.finder.member.preview.k.class);
        return Q0;
    }
}
