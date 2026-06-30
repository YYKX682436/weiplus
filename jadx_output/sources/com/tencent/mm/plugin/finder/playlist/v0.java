package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class v0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.s1 f122478d;

    public v0(com.tencent.mm.plugin.finder.playlist.s1 s1Var) {
        this.f122478d = s1Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        long j17;
        int i18;
        java.lang.Object obj;
        java.lang.Object obj2;
        int i19;
        java.lang.Object obj3;
        java.lang.Object obj4;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) holder.f293125i;
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawerPresenter", "onItemClick: position:" + i17 + ", item:" + z1Var.getItemId() + ", scene:" + this.f122478d.f122442v);
        boolean z17 = !this.f122478d.j() && (this.f122478d.f122421a instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI);
        if (this.f122478d.j()) {
            android.content.Context context = this.f122478d.f122421a;
            if (context instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
                androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) context).p7().getRecyclerView();
                com.tencent.mm.plugin.finder.playlist.s1 s1Var = this.f122478d;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
                if (finderLinearLayoutManager == null) {
                    return;
                }
                java.util.Iterator it = ((com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) s1Var.f122421a).E7().getDataList().iterator();
                int i27 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i27 = -1;
                        break;
                    } else if (((so2.j5) it.next()).getItemId() == z1Var.getItemId()) {
                        break;
                    } else {
                        i27++;
                    }
                }
                if (i27 == -1) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList);
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager2 = finderLinearLayoutManager;
                yj0.a.d(finderLinearLayoutManager2, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(finderLinearLayoutManager2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                recyclerView.post(new com.tencent.mm.plugin.finder.playlist.t0(s1Var, recyclerView, finderLinearLayoutManager));
                java.util.Iterator it6 = s1Var.f122422b.f122296a.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it6.next();
                    so2.j5 j5Var = (so2.j5) obj3;
                    com.tencent.mm.plugin.finder.playlist.z1 z1Var2 = j5Var instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var : null;
                    if (z1Var2 != null && z1Var2.f122508d) {
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj3;
                if (j5Var2 != null) {
                    com.tencent.mm.plugin.finder.playlist.z1 z1Var3 = j5Var2 instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var2 : null;
                    if (z1Var3 != null) {
                        z1Var3.f122508d = false;
                    }
                }
                java.util.Iterator it7 = s1Var.f122422b.f122296a.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj4 = it7.next();
                        if (((so2.j5) obj4).getItemId() == z1Var.getItemId()) {
                            break;
                        }
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                so2.j5 j5Var3 = (so2.j5) obj4;
                if (j5Var3 != null) {
                    boolean z18 = j5Var3 instanceof com.tencent.mm.plugin.finder.playlist.z1;
                    if (z18) {
                    }
                    com.tencent.mm.plugin.finder.playlist.z1 z1Var4 = z18 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var3 : null;
                    if (z1Var4 != null) {
                        z1Var4.f122508d = true;
                    }
                }
                adapter.notifyDataSetChanged();
                com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = s1Var.f122424d;
                if (finderPlayListDrawer != null) {
                    finderPlayListDrawer.u();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("drawer");
                    throw null;
                }
            }
        }
        if (!(this.f122478d.f122421a instanceof com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_topic_type", 16);
            r45.vx0 vx0Var = this.f122478d.h().f122285e;
            if (vx0Var != null) {
                if (vx0Var.getInteger(21) != 0) {
                    intent.putExtra("key_topic_type", vx0Var.getInteger(21));
                }
                intent.putExtra("key_topic_type", vx0Var.getInteger(21));
                com.tencent.mm.protobuf.g byteString = vx0Var.getByteString(22);
                intent.putExtra("KEY_HOT_TOPIC_BUFFER", byteString != null ? byteString.f192156a : null);
            }
            r45.vx0 vx0Var2 = this.f122478d.h().f122285e;
            str = "";
            if (vx0Var2 != null) {
                java.lang.String string = vx0Var2.getString(1);
                str = string != null ? string : "";
                j17 = vx0Var2.getLong(0);
            } else {
                j17 = 0;
            }
            intent.putExtra("key_topic_title", str);
            intent.putExtra("KEY_TOPIC_ID", j17);
            r45.vx0 vx0Var3 = this.f122478d.h().f122285e;
            intent.putExtra("key_topic_type", vx0Var3 != null ? java.lang.Integer.valueOf(vx0Var3.getInteger(21)) : 0L);
            intent.putExtra("key_ref_object_id", this.f122478d.h().f122281a);
            intent.putExtra("key_ref_object_dup_flag", this.f122478d.h().f122282b);
            intent.putExtra("KEY_CLICK_FEED_ID", z1Var.getItemId());
            intent.putExtra("KEY_CLICK_FEED_POSITION", i17);
            intent.putExtra("KEY_PASSIVE_ENTER", z17);
            r45.vx0 vx0Var4 = this.f122478d.h().f122285e;
            intent.putExtra("KEY_COLLECTION_INFO", vx0Var4 != null ? vx0Var4.toByteArray() : null);
            intent.putExtra("KEY_UP_CONTINUE_FLAG", this.f122478d.f122439s);
            intent.putExtra("KEY_DOWN_CONTINUE_FLAG", this.f122478d.f122440t);
            intent.putExtra("KEY_FEED_ID", this.f122478d.h().f122281a);
            intent.putExtra("KEY_OBJECT_NONCE_ID", this.f122478d.h().f122283c);
            intent.putExtra("KEY_OBJECT_NONCE_ID", this.f122478d.h().f122283c);
            intent.putExtra("key_member_preview_mode", this.f122478d.h().f122289i);
            intent.putExtra("key_reuqest_scene", ((java.lang.Number) ((jz5.n) this.f122478d.f122430j).getValue()).intValue());
            intent.putExtra("tab_type", ((java.lang.Number) ((jz5.n) this.f122478d.f122431k).getValue()).intValue());
            intent.putExtra("key_from_user_name", (java.lang.String) ((jz5.n) this.f122478d.f122432l).getValue());
            intent.putExtra("key_to_user_name", (java.lang.String) ((jz5.n) this.f122478d.f122433m).getValue());
            intent.putExtra("key_session_id", (java.lang.String) ((jz5.n) this.f122478d.f122434n).getValue());
            com.tencent.mm.plugin.finder.playlist.s1 s1Var2 = this.f122478d;
            com.tencent.mm.plugin.finder.playlist.e2 e2Var = s1Var2.f122422b;
            com.tencent.mm.plugin.finder.feed.g30 g30Var = new com.tencent.mm.plugin.finder.feed.g30(null, s1Var2.f122437q);
            com.tencent.mm.protobuf.g gVar = this.f122478d.f122437q;
            e2Var.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = e2Var.f122296a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                if (next instanceof com.tencent.mm.plugin.finder.playlist.z1) {
                    arrayList4.add(next);
                }
            }
            java.util.List<com.tencent.mm.plugin.finder.playlist.z1> S0 = kz5.n0.S0(arrayList4);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(S0, 10));
            for (com.tencent.mm.plugin.finder.playlist.z1 z1Var5 : S0) {
                z1Var5.getFeedObject().setCommentScene(0);
                arrayList5.add(cu2.u.f222441a.p(z1Var5.getFeedObject()));
            }
            arrayList2.addAll(arrayList5);
            e2Var.f122297b.b(new com.tencent.mm.plugin.finder.feed.model.r9(arrayList2, gVar, i17, g30Var, null, 16, null), intent);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, this.f122478d.f122421a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(this.f122478d.f122421a, intent);
            com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer2 = this.f122478d.f122424d;
            if (finderPlayListDrawer2 != null) {
                finderPlayListDrawer2.u();
                return;
            } else {
                kotlin.jvm.internal.o.o("drawer");
                throw null;
            }
        }
        if (z1Var.getFeedObject().getMediaType() == 15) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var = ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) this.f122478d.f122421a).E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = v20Var.getRecyclerView();
        com.tencent.mm.plugin.finder.playlist.s1 s1Var3 = this.f122478d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager3 = layoutManager2 instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager2 : null;
        if (finderLinearLayoutManager3 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader = ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) s1Var3.f122421a).F;
        if (finderTopicTimelineUIContract$TopicLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        java.util.ArrayList dataList = finderTopicTimelineUIContract$TopicLoader.getDataList();
        java.util.Iterator it9 = dataList.iterator();
        int i28 = 0;
        while (true) {
            if (!it9.hasNext()) {
                i18 = -1;
                break;
            }
            if (((so2.j5) it9.next()).getItemId() == z1Var.getItemId()) {
                i18 = i28;
                break;
            }
            i28++;
        }
        if (i18 == -1) {
            dataList.clear();
            com.tencent.mm.plugin.finder.playlist.e2 e2Var2 = s1Var3.f122422b;
            boolean z19 = s1Var3.h().f122289i;
            e2Var2.getClass();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.util.ArrayList arrayList8 = e2Var2.f122296a;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.util.Iterator it10 = arrayList8.iterator();
            while (it10.hasNext()) {
                java.lang.Object next2 = it10.next();
                if (next2 instanceof com.tencent.mm.plugin.finder.playlist.z1) {
                    arrayList9.add(next2);
                }
            }
            for (com.tencent.mm.plugin.finder.playlist.z1 z1Var6 : kz5.n0.S0(arrayList9)) {
                if (z1Var6.getFeedObject().getMediaType() != 15) {
                    z1Var6.getFeedObject().setCommentScene(0);
                    cu2.t tVar = cu2.u.f222441a;
                    tVar.p(z1Var6.getFeedObject());
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = tVar.p(z1Var6.getFeedObject());
                    p17.k1(z19);
                    arrayList7.add(p17);
                }
            }
            arrayList6.addAll(arrayList7);
            dataList.addAll(arrayList6);
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter2 instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter2 : null;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
            java.util.Iterator it11 = dataList.iterator();
            int i29 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((so2.j5) it11.next()).getItemId() == z1Var.getItemId()) {
                    i19 = i29;
                    break;
                }
                i29++;
            }
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader finderTopicTimelineUIContract$TopicLoader2 = ((com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI) s1Var3.f122421a).F;
            if (finderTopicTimelineUIContract$TopicLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            yz5.a aVar = finderTopicTimelineUIContract$TopicLoader2.f106159f;
            if (aVar != null) {
                aVar.invoke();
            }
            i18 = i19;
        }
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList10.add(0);
        arrayList10.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList10);
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager4 = finderLinearLayoutManager3;
        yj0.a.d(finderLinearLayoutManager4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        finderLinearLayoutManager3.P(((java.lang.Integer) arrayList10.get(0)).intValue(), ((java.lang.Integer) arrayList10.get(1)).intValue());
        yj0.a.f(finderLinearLayoutManager4, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerPresenter$getAdapter$2", "onItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;ILcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        recyclerView2.post(new com.tencent.mm.plugin.finder.playlist.u0(s1Var3, recyclerView2, finderLinearLayoutManager3));
        java.util.Iterator it12 = s1Var3.f122422b.f122296a.iterator();
        while (true) {
            if (!it12.hasNext()) {
                obj = null;
                break;
            }
            obj = it12.next();
            so2.j5 j5Var4 = (so2.j5) obj;
            com.tencent.mm.plugin.finder.playlist.z1 z1Var7 = j5Var4 instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var4 : null;
            if (z1Var7 != null && z1Var7.f122508d) {
                break;
            }
        }
        so2.j5 j5Var5 = (so2.j5) obj;
        if (j5Var5 != null) {
            com.tencent.mm.plugin.finder.playlist.z1 z1Var8 = j5Var5 instanceof com.tencent.mm.plugin.finder.playlist.z1 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var5 : null;
            if (z1Var8 != null) {
                z1Var8.f122508d = false;
            }
        }
        java.util.Iterator it13 = s1Var3.f122422b.f122296a.iterator();
        while (true) {
            if (it13.hasNext()) {
                obj2 = it13.next();
                if (((so2.j5) obj2).getItemId() == z1Var.getItemId()) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        so2.j5 j5Var6 = (so2.j5) obj2;
        if (j5Var6 != null) {
            boolean z27 = j5Var6 instanceof com.tencent.mm.plugin.finder.playlist.z1;
            if (z27) {
            }
            com.tencent.mm.plugin.finder.playlist.z1 z1Var9 = z27 ? (com.tencent.mm.plugin.finder.playlist.z1) j5Var6 : null;
            if (z1Var9 != null) {
                z1Var9.f122508d = true;
            }
        }
        adapter.notifyDataSetChanged();
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer3 = s1Var3.f122424d;
        if (finderPlayListDrawer3 == null) {
            kotlin.jvm.internal.o.o("drawer");
            throw null;
        }
        finderPlayListDrawer3.u();
    }
}
