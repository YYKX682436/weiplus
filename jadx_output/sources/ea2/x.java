package ea2;

/* loaded from: classes2.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC f250587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f250588e;

    public x(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, jz5.l lVar) {
        this.f250587d = finderMusicTopicHeaderUIC;
        this.f250588e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList list;
        r45.r03 r03Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f250587d;
        finderMusicTopicHeaderUIC.getClass();
        jz5.l lVar = this.f250588e;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        if (intValue == 1) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) lVar.f302834e;
            if (baseFinderFeed != null) {
                com.tencent.mm.plugin.finder.assist.y5.f102716a.d(finderMusicTopicHeaderUIC.getActivity(), baseFinderFeed, 6L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : null, ea2.h.f250555d);
            }
        } else if (intValue == 2) {
            androidx.appcompat.app.AppCompatActivity activity = finderMusicTopicHeaderUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment finderMusicTopicFragment = ((ea2.k0) zVar.a(activity).a(ea2.k0.class)).I;
            if (finderMusicTopicFragment != null) {
                com.tencent.mm.plugin.finder.feed.x10 c76 = ((ea2.j0) zVar.b(finderMusicTopicFragment).a(ea2.j0.class)).c7();
                android.content.Intent Z = c76.Z(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) c76.z().f107156e.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class).get(0)).getFeedObject(), 0);
                r45.xn5 z17 = ((com.tencent.mm.plugin.finder.feed.r10) c76.z()).z();
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = c76.z().f107156e;
                kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader");
                c76.z().f107156e.saveCache(Z, 0, new com.tencent.mm.plugin.finder.feed.g30(z17, ((com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader) baseFeedLoader).c((z17 == null || (list = z17.getList(0)) == null || (r03Var = (r45.r03) list.get(0)) == null) ? null : r03Var.getString(0))));
                Z.putExtra("key_enable_ringtone_bubble", true);
                com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, c76.f106174d, Z, 0L, null, 0, 0, false, 0, null, 508, null);
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(c76.f106174d, Z);
            }
        }
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.p7(this.f250587d, 105, null, null, 0, 14, null);
        kotlin.jvm.internal.o.d(view);
        hc2.v0.d(view, "music_topic_page_set_ringtone", "view_clk", false, finderMusicTopicHeaderUIC.a7(), null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initRingtone$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
