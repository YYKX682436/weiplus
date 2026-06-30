package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f136009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader f136010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(java.util.List list, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136009d = list;
        this.f136010e = baseFinderFeedLoader;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.tb(this.f136009d, this.f136010e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.tb tbVar = (com.tencent.mm.plugin.finder.viewmodel.component.tb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (r45.tk0 tk0Var : this.f136009d) {
            long j17 = tk0Var.f386514d;
            java.lang.String u17 = pm0.v.u(j17);
            int i17 = tk0Var.f386515e;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = tk0Var.f386516f;
            if (i17 != 0) {
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = this.f136010e;
                if (i17 != 1) {
                    if (i17 == 2) {
                        int remove = baseFinderFeedLoader.remove(j17, true);
                        if (remove >= 0) {
                            com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Del feed:" + u17 + " at pos:" + remove);
                        } else {
                            com.tencent.mars.xlog.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Del failed, feed:" + u17 + " not found");
                        }
                    } else if (i17 == 3) {
                        if (finderObject == null || hc2.o0.D(finderObject, true)) {
                            com.tencent.mars.xlog.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert skip, newObject null or isHardAd, feed:".concat(u17));
                        } else {
                            java.util.Iterator it = baseFinderFeedLoader.getDataListJustForAdapter().iterator();
                            int i18 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i18 = -1;
                                    break;
                                }
                                if (((so2.j5) it.next()).getItemId() == j17) {
                                    break;
                                }
                                i18++;
                            }
                            if (i18 >= 0) {
                                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
                                int i19 = i18 + 1;
                                baseFinderFeedLoader.insertAll(kz5.b0.c(cu2.u.f222441a.p(a17)), i19);
                                com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert feed after:" + u17 + " at pos:" + i19 + " mediaType:" + a17.getMediaType());
                            } else {
                                com.tencent.mars.xlog.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert failed, anchor feed:" + u17 + " not found");
                            }
                        }
                    }
                } else if (finderObject == null || hc2.o0.D(finderObject, true)) {
                    com.tencent.mars.xlog.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace skip, newObject null or isHardAd, feed:".concat(u17));
                } else {
                    com.tencent.mm.plugin.finder.storage.FinderItem a18 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a18);
                    int remove2 = baseFinderFeedLoader.remove(j17, true);
                    if (remove2 >= 0) {
                        baseFinderFeedLoader.insert(p17, remove2, true);
                        com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace feed:" + u17 + " at pos:" + remove2 + " mediaType:" + a18.getMediaType());
                    } else {
                        com.tencent.mars.xlog.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace failed, feed:" + u17 + " not found");
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Keep feed:".concat(u17));
            }
        }
        return jz5.f0.f302826a;
    }
}
