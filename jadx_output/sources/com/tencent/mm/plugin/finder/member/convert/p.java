package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.convert.r f121152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121153f;

    public p(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.member.convert.r rVar, in5.s0 s0Var) {
        this.f121151d = baseFinderFeed;
        this.f121152e = rVar;
        this.f121153f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = this.f121151d;
        if (feed.getFeedObject().getMediaType() == 4) {
            boolean isQAFeed = feed.getFeedObject().isQAFeed();
            in5.s0 s0Var = this.f121153f;
            com.tencent.mm.plugin.finder.member.convert.r rVar = this.f121152e;
            if (isQAFeed) {
                android.content.Intent intent = new android.content.Intent();
                rVar.getClass();
                kotlin.jvm.internal.o.g(feed, "feed");
                com.tencent.mm.plugin.finder.feed.model.y9 y9Var = new com.tencent.mm.plugin.finder.feed.model.y9();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                feed.getFeedObject().setCommentScene(0);
                arrayList2.add(feed);
                y9Var.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList2, null, 0, null, null, 16, null), intent);
                r45.kb4 kb4Var = new r45.kb4();
                kb4Var.getList(0).addAll(feed.getFeedObject().getMediaList());
                bu2.j jVar = bu2.j.f24534a;
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = feed.getFeedObject();
                bu2.i iVar = bu2.i.f24521b;
                jVar.n(feedObject, bu2.i.f24528i);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                ((com.tencent.mm.plugin.finder.assist.i0) c17).Sj(context, intent, feed.getFeedObject().getId(), feed.getFeedObject().getObjectNonceId(), kb4Var, null);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                java.util.ArrayList<so2.j5> d17 = kz5.c0.d(feed);
                rVar.getClass();
                com.tencent.mm.plugin.finder.feed.model.y9 y9Var2 = new com.tencent.mm.plugin.finder.feed.model.y9();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (so2.j5 j5Var : d17) {
                    if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && j5Var.h() != -17) {
                        ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().setCommentScene(0);
                        arrayList3.add(j5Var);
                    }
                }
                y9Var2.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList3, null, 0, null, null, 16, null), intent2);
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context2 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                i0Var.Tj(context2, intent2, rVar.f330390g, "", 1, rVar.f330392i, "", 0, 0, 0, 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
