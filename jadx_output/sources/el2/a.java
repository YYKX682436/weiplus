package el2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253740d;

    public a(el2.i0 i0Var) {
        this.f253740d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList list;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        r45.j94 j94Var;
        yg2.b bVar;
        java.lang.String username;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$addItemWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        el2.i0 i0Var = this.f253740d;
        r45.jg1 jg1Var = i0Var.f253810J;
        if (jg1Var != null && (list = jg1Var.getList(2)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((r45.a52) obj).getInteger(0) == 1) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.a52 a52Var = (r45.a52) obj;
            if (a52Var != null) {
                com.tencent.mm.protobuf.g byteString = a52Var.getByteString(5);
                if (byteString != null) {
                    j94Var = new r45.j94();
                    try {
                        j94Var.parseFrom(byteString.g());
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                } else {
                    j94Var = null;
                }
                if ((j94Var != null ? j94Var.getInteger(0) : 0) > 0) {
                    ya2.g gVar = ya2.h.f460484a;
                    gk2.e eVar = dk2.ef.I;
                    ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null);
                    if (b17 != null) {
                        com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
                        com.tencent.mm.plugin.finder.live.view.k7 l07 = i0Var.l0();
                        com.tencent.mm.plugin.finder.live.view.gb gbVar = (com.tencent.mm.plugin.finder.live.view.gb) ((jz5.n) i0Var.V).getValue();
                        java.util.LinkedList linkedList = i0Var.Q.f22362e;
                        if (linkedList != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            for (java.lang.Object obj2 : linkedList) {
                                if (((r45.z42) obj2).getInteger(1) == 1) {
                                    arrayList3.add(obj2);
                                }
                            }
                            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                            java.util.Iterator it6 = arrayList3.iterator();
                            while (it6.hasNext()) {
                                r45.z42 z42Var = (r45.z42) it6.next();
                                r45.h32 h32Var = new r45.h32();
                                com.tencent.mm.protobuf.g byteString2 = z42Var.getByteString(2);
                                byte[] g17 = byteString2 != null ? byteString2.g() : null;
                                if (g17 != null) {
                                    try {
                                        h32Var.parseFrom(g17);
                                    } catch (java.lang.Exception e18) {
                                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                                    }
                                }
                                java.lang.String string = h32Var.getString(4);
                                if (string == null) {
                                    string = "";
                                }
                                arrayList4.add(string);
                            }
                            arrayList = arrayList4;
                        }
                        el2.h hVar = new el2.h(i0Var);
                        l07.getClass();
                        com.tencent.mm.plugin.finder.live.widget.e0.W(l07, gbVar, false, 0, 6, null);
                        l07.f116441J = i17;
                        l07.P = hVar;
                        l07.K = arrayList;
                        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = l07.S;
                        if (wxRefreshLayout != null) {
                            wxRefreshLayout.E(false);
                        }
                        com.tencent.mm.protocal.protobuf.FinderContact finderContact = l07.f116441J;
                        com.tencent.mm.plugin.finder.live.view.k7.e0(l07, true, null, (finderContact == null || (username = finderContact.getUsername()) == null) ? "" : username, 0, 2, null);
                        android.view.View view2 = l07.M;
                        if (view2 != null) {
                            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                            int i18 = ((k0Var instanceof com.tencent.mm.plugin.finder.live.view.v1) || (k0Var instanceof com.tencent.mm.plugin.finder.live.view.a2) || (l07.f118183e instanceof com.tencent.mm.plugin.finder.feed.ui.FinderGameLivePostUI)) ? 0 : 8;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList5.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList5);
                            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "show", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;Lcom/tencent/mm/protocal/protobuf/FinderContact;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveMultiNoticeWidget", "show", "(Lcom/tencent/mm/plugin/finder/live/widget/BaseBottomPanelSheetPage;Lcom/tencent/mm/protocal/protobuf/FinderContact;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else {
                    ya2.b2 b18 = ya2.h.f460484a.b(xy2.c.e(i0Var.f118183e));
                    if (b18 != null) {
                        com.tencent.mm.protocal.protobuf.FinderContact i19 = ya2.d.i(b18);
                        gk2.e eVar2 = dk2.ef.I;
                        if (eVar2 != null && (bVar = eVar2.f272475i) != null) {
                            kotlinx.coroutines.l.d(bVar, null, null, new el2.k(i0Var, i19, null), 3, null);
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAnchorPromoteView$addItemWidget$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
