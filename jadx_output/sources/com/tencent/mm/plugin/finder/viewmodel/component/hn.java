package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hn implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f134641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f134642c;

    public hn(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar, yz5.p pVar, yz5.l lVar) {
        this.f134640a = mnVar;
        this.f134641b = pVar;
        this.f134642c = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        androidx.recyclerview.widget.f2 adapter;
        java.util.AbstractCollection dataList;
        java.util.AbstractCollection dataList2;
        java.util.List dataList3;
        so2.j5 j5Var;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f134640a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "get feed detail success");
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                finderContact.setUsername(contact != null ? contact.getUsername() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
                finderContact.setNickname(contact2 != null ? contact2.getNickname() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
                finderContact.setHeadUrl(contact3 != null ? contact3.getHeadUrl() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact4 = finderObject.getContact();
                finderContact.setAuthInfo(contact4 != null ? contact4.getAuthInfo() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact5 = finderObject.getContact();
                finderContact.setExtInfo(contact5 != null ? contact5.getExtInfo() : null);
                ya2.g.m(ya2.h.f460484a, finderContact, false, 2, null);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
                so2.u1 u1Var = (so2.u1) cu2.u.f222441a.p(a17);
                yz5.l lVar = this.f134642c;
                if (lVar != null) {
                    lVar.invoke(finderObject);
                }
                mnVar.f135179d = finderObject.getId();
                android.app.Activity context = mnVar.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.viewmodel.component.ut) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class)).P6("first_feedid", pm0.v.u(mnVar.f135179d));
                java.lang.String objectNonceId = finderObject.getObjectNonceId();
                if (objectNonceId == null) {
                    objectNonceId = "";
                }
                mnVar.f135182g = objectNonceId;
                bu2.j.f24534a.n(a17, bu2.i.f24531l);
                if (mnVar.f135186n != null) {
                    com.tencent.mm.plugin.finder.feed.bc bcVar = mnVar.f135183h;
                    if (bcVar == null) {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = bcVar.f106570t;
                    if (baseFeedLoader != null && (dataList3 = baseFeedLoader.getDataList()) != null && (j5Var = (so2.j5) kz5.n0.a0(dataList3, 0)) != null) {
                        if (!(j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
                            j5Var = null;
                        }
                        if (j5Var != null) {
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                            baseFinderFeed.getFeedObject().setCommentCount(u1Var.getFeedObject().getCommentCount());
                            baseFinderFeed.getFeedObject().setLikeCount(u1Var.getFeedObject().getLikeCount());
                            baseFinderFeed.getFeedObject().setForwardCount(u1Var.getFeedObject().getForwardCount());
                            com.tencent.mm.protocal.protobuf.FinderContact contact6 = u1Var.getFeedObject().getFeedObject().getContact();
                            if (contact6 != null) {
                                baseFinderFeed.getFeedObject().getFeedObject().setContact(contact6);
                                baseFinderFeed.a1(ya2.d.h(contact6, null, false, 3, null));
                            }
                            com.tencent.mm.plugin.finder.feed.cc ccVar = mnVar.f135184i;
                            if (ccVar == null) {
                                kotlin.jvm.internal.o.o("viewCallback");
                                throw null;
                            }
                            androidx.recyclerview.widget.RecyclerView recyclerView = ccVar.getRecyclerView();
                            if (recyclerView != null && (adapter2 = recyclerView.getAdapter()) != null) {
                                adapter2.notifyItemChanged(0, new jz5.l(12, null));
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", "cache exit,refresh apart");
                    f0Var = f0Var2;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.tencent.mm.plugin.finder.feed.bc bcVar2 = mnVar.f135183h;
                    if (bcVar2 == null) {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = bcVar2.f106570t;
                    if (baseFeedLoader2 != null && (dataList2 = baseFeedLoader2.getDataList()) != null) {
                        dataList2.clear();
                    }
                    com.tencent.mm.plugin.finder.feed.bc bcVar3 = mnVar.f135183h;
                    if (bcVar3 == null) {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader3 = bcVar3.f106570t;
                    if (baseFeedLoader3 != null && (dataList = baseFeedLoader3.getDataList()) != null) {
                        dataList.add(u1Var);
                    }
                    com.tencent.mm.plugin.finder.feed.cc ccVar2 = mnVar.f135184i;
                    if (ccVar2 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = ccVar2.getRecyclerView();
                    if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                        adapter.notifyDataSetChanged();
                    }
                    mnVar.S6().getDataListJustForAdapter().clear();
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[loadFirstFeed] feed=");
                so2.u1 u1Var2 = mnVar.f135186n;
                sb6.append((u1Var2 == null || (feedObject2 = u1Var2.getFeedObject()) == null) ? null : java.lang.Long.valueOf(feedObject2.getId()));
                sb6.append(" => ");
                so2.u1 u1Var3 = mnVar.f135186n;
                sb6.append((u1Var3 == null || (feedObject = u1Var3.getFeedObject()) == null || (mediaList = feedObject.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null) ? null : mb4Var.getString(0));
                sb6.append(" updateFeed=");
                sb6.append(u1Var.getFeedObject().getId());
                sb6.append(" => ");
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(u1Var.getFeedObject().getMediaList());
                sb6.append(mb4Var2 != null ? mb4Var2.getString(0) : null);
                com.tencent.mars.xlog.Log.i("FinderHorizontalVideoNewFormUIC", sb6.toString());
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.gn(mnVar));
                return f0Var2;
            }
        } else {
            int i18 = fVar.f70616b;
            yz5.p pVar = this.f134641b;
            if (i18 == -4011 || i18 == -4033 || i18 == -4036 || i18 == -5002) {
                bu2.j.f24534a.l(mnVar.f135179d);
                if (pVar != null) {
                    pVar.invoke(java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
                    return f0Var2;
                }
            } else if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), fVar.f70617c);
                return f0Var2;
            }
        }
        return null;
    }
}
