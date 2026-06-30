package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f125922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f125924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter) {
        super(0);
        this.f125922d = feedUpdateEvent;
        this.f125923e = finderFeedSearchUI;
        this.f125924f = wxRecyclerAdapter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedChangeListener ");
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f125922d;
        sb6.append(feedUpdateEvent.f54252g.f6918a);
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedSearchUI", sb6.toString());
        am.ia iaVar = feedUpdateEvent.f54252g;
        int i17 = iaVar.f6919b;
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125923e;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f125924f;
        if (i17 != 0) {
            if (i17 != 4) {
                if (i17 == 5 && iaVar.f6918a != 0) {
                    java.util.Iterator<T> it = finderFeedSearchUI.C.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        so2.j5 j5Var = (so2.j5) it.next();
                        if ((j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() == iaVar.f6918a) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != -1) {
                        wxRecyclerAdapter.notifyItemRangeChanged(i18, 1, new jz5.l(4, 1));
                        wxRecyclerAdapter.notifyItemRangeChanged(i18, 1, new jz5.l(9, 1));
                        if (iaVar.f6928k > 0) {
                            wxRecyclerAdapter.notifyItemRangeChanged(i18, 1, new jz5.l(35, feedUpdateEvent));
                        }
                    }
                }
            } else if (iaVar.f6918a != 0) {
                java.util.Iterator<T> it6 = finderFeedSearchUI.C.iterator();
                int i19 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    so2.j5 j5Var2 = (so2.j5) it6.next();
                    if ((j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getId() == iaVar.f6918a) {
                        break;
                    }
                    i19++;
                }
                if (i19 != -1) {
                    if (iaVar.f6921d == 1) {
                        java.lang.Object a07 = kz5.n0.a0(finderFeedSearchUI.C, i19);
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = a07 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) a07 : null;
                        if (baseFinderFeed != null) {
                            int i27 = iaVar.f6922e;
                            int likeFlag = baseFinderFeed.getFeedObject().getLikeFlag();
                            if (likeFlag != i27) {
                                if (likeFlag == 0) {
                                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                                    feedObject.setLikeCount(feedObject.getLikeCount() + 1);
                                } else if (i27 == 0) {
                                    baseFinderFeed.getFeedObject().setLikeCount(r11.getLikeCount() - 1);
                                }
                                if (i27 == 1) {
                                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed.getFeedObject();
                                    feedObject2.setFriendLikeCount(feedObject2.getFriendLikeCount() + 1);
                                    nv2.n1.f340551h.a(baseFinderFeed.getFeedObject().getLikeList());
                                } else if (likeFlag == 1) {
                                    baseFinderFeed.getFeedObject().setFriendLikeCount(r6.getFriendLikeCount() - 1);
                                    nv2.n1.f340551h.o(baseFinderFeed.getFeedObject().getLikeList());
                                }
                                wxRecyclerAdapter.notifyItemRangeChanged(i19, 1, new jz5.l(3, 1));
                            }
                        }
                    } else {
                        wxRecyclerAdapter.notifyItemRangeChanged(i19, 1, new jz5.l(3, 1));
                    }
                    if (iaVar.f6928k > 0) {
                        wxRecyclerAdapter.notifyItemRangeChanged(i19, 1, new jz5.l(35, feedUpdateEvent));
                    }
                }
            }
        } else if (iaVar.f6918a != 0 && bu2.j.f24534a.h(iaVar.f6918a) != null) {
            java.util.Iterator<T> it7 = finderFeedSearchUI.C.iterator();
            int i28 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i28 = -1;
                    break;
                }
                so2.j5 j5Var3 = (so2.j5) it7.next();
                if ((j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3).getFeedObject().getId() == iaVar.f6918a) {
                    break;
                }
                i28++;
            }
            if (i28 != -1) {
                wxRecyclerAdapter.notifyItemRangeChanged(i28, 1, 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
