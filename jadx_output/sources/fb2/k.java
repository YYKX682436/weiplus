package fb2;

/* loaded from: classes2.dex */
public final class k implements fb2.m {
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I1).getValue()).r()).intValue() > 0 && resp.d().getInteger(11) == 1 && resp.f227917e >= 1) {
            r45.bx2 bx2Var = new r45.bx2();
            r45.ww2 ww2Var = new r45.ww2();
            ww2Var.set(0, 111L);
            ww2Var.set(10, java.lang.Boolean.FALSE);
            ww2Var.set(2, "热门有更多推荐");
            ww2Var.set(1, "热门推荐");
            ww2Var.set(7, 0);
            ww2Var.getList(4).addAll(resp.getList(1).subList(0, java.lang.Math.min(resp.getList(1).size(), resp.f227917e)));
            bx2Var.getList(1).add(ww2Var);
            java.util.LinkedList list = bx2Var.getList(2);
            java.util.List subList = resp.getList(1).subList(0, resp.f227917e);
            kotlin.jvm.internal.o.f(subList, "subList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
            java.util.Iterator it = subList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
            }
            list.addAll(arrayList);
            bx2Var.getList(2).add(1, 111L);
            resp.set(18, bx2Var);
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        int i18;
        boolean z17;
        java.lang.String str;
        java.util.LinkedList linkedList;
        int i19;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.util.Iterator it6;
        char c17;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        r45.bx2 bx2Var = loadedInfo.f107777o;
        int i27 = loadedInfo.f107766d;
        int i28 = 7;
        if (bx2Var == null) {
            i18 = -1;
        } else {
            java.util.List list = bx2Var.getList(0);
            if (list == null) {
                list = kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list) {
                r45.yw2 yw2Var = (r45.yw2) obj4;
                java.util.LinkedList<r45.ww2> list2 = bx2Var.getList(1);
                if (list2 != null) {
                    for (r45.ww2 ww2Var : list2) {
                        if (ww2Var.getInteger(i28) == 1) {
                            com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", "containLiveList " + pm0.b0.g(ww2Var));
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17 || yw2Var.getInteger(2) == 9 || yw2Var.getInteger(2) == 8 || yw2Var.getInteger(2) == 10 || yw2Var.getInteger(2) == 11 || yw2Var.getInteger(2) == 14) {
                    arrayList2.add(obj4);
                }
                i28 = 7;
            }
            if (arrayList2.size() != list.size()) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj5 : list) {
                    if (!arrayList2.contains((r45.yw2) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkValid] tabType=");
                sb6.append(i27);
                sb6.append(" inValidList=");
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(java.lang.Integer.valueOf(((r45.yw2) it7.next()).getInteger(2)));
                }
                sb6.append(arrayList4);
                com.tencent.mars.xlog.Log.e("Finder.HandleLayoutInfoInterceptor", sb6.toString());
                java.util.LinkedList list3 = bx2Var.getList(0);
                if (list3 != null) {
                    list3.clear();
                }
                java.util.LinkedList list4 = bx2Var.getList(0);
                if (list4 != null) {
                    list4.addAll(arrayList2);
                }
                java.util.LinkedList list5 = bx2Var.getList(2);
                if (list5 != null) {
                    kz5.h0.B(list5, new fb2.h(arrayList3));
                }
            }
            i18 = 0;
        }
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.w("Finder.HandleLayoutInfoInterceptor", "[handle] ret=" + i18);
            return false;
        }
        r45.bx2 bx2Var2 = loadedInfo.f107777o;
        kotlin.jvm.internal.o.d(bx2Var2);
        java.util.LinkedList linkedList2 = loadedInfo.f107767e;
        java.util.Iterator it8 = linkedList2.iterator();
        int i29 = 0;
        while (true) {
            if (!it8.hasNext()) {
                i29 = -1;
                break;
            }
            if (((so2.j5) it8.next()).getItemId() == loadedInfo.f107773k) {
                break;
            }
            i29++;
        }
        java.util.LinkedList linkedList3 = loadedInfo.f107774l > 0 ? new java.util.LinkedList(linkedList2.subList(0, loadedInfo.f107774l)) : new java.util.LinkedList();
        java.util.LinkedList linkedList4 = loadedInfo.f107774l <= 0 ? new java.util.LinkedList(linkedList2) : i29 >= 0 ? new java.util.LinkedList(linkedList2.subList(i29 + 1, linkedList2.size())) : new java.util.LinkedList();
        java.util.LinkedList linkedList5 = new java.util.LinkedList(linkedList2);
        java.util.LinkedList list6 = bx2Var2.getList(1);
        kotlin.jvm.internal.o.f(list6, "getCard(...)");
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj6 : list6) {
            r45.ww2 ww2Var2 = (r45.ww2) obj6;
            if (ww2Var2.getInteger(7) == 2 || ww2Var2.getInteger(7) == 0 || ww2Var2.getInteger(7) == 1) {
                arrayList5.add(obj6);
            }
        }
        java.util.LinkedList list7 = bx2Var2.getList(0);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[handle] dividerObjects=");
        kotlin.jvm.internal.o.d(list7);
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list7, 10));
        java.util.Iterator it9 = list7.iterator();
        while (true) {
            java.lang.String str2 = null;
            if (!it9.hasNext()) {
                break;
            }
            r45.yw2 yw2Var2 = (r45.yw2) it9.next();
            kotlin.jvm.internal.o.d(yw2Var2);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            r45.bx2 bx2Var3 = bx2Var2;
            sb8.append(yw2Var2.getLong(3));
            sb8.append('_');
            sb8.append(yw2Var2.getInteger(2));
            sb8.append('_');
            sb8.append(yw2Var2.getString(1));
            sb8.append('_');
            r45.eo eoVar = (r45.eo) yw2Var2.getCustom(8);
            if (eoVar != null) {
                str2 = eoVar.getString(0);
            }
            sb8.append(str2);
            arrayList6.add(sb8.toString());
            bx2Var2 = bx2Var3;
        }
        r45.bx2 bx2Var4 = bx2Var2;
        sb7.append(arrayList6);
        sb7.append(" cardObjects=");
        java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
        java.util.Iterator it10 = arrayList5.iterator();
        while (it10.hasNext()) {
            r45.ww2 ww2Var3 = (r45.ww2) it10.next();
            kotlin.jvm.internal.o.d(ww2Var3);
            arrayList7.add(fb2.l.a(ww2Var3));
        }
        sb7.append(arrayList7);
        com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", sb7.toString());
        java.util.Iterator it11 = list7.iterator();
        int i37 = 0;
        while (true) {
            if (!it11.hasNext()) {
                i37 = -1;
                break;
            }
            r45.yw2 yw2Var3 = (r45.yw2) it11.next();
            if (yw2Var3.getInteger(2) == 2 || yw2Var3.getInteger(2) == 1) {
                break;
            }
            i37++;
        }
        if ((i37 >= 0) && linkedList4.isEmpty()) {
            kz5.h0.B(list7, fb2.i.f260846d);
            com.tencent.mars.xlog.Log.e("Finder.HandleLayoutInfoInterceptor", "[handle] fallback remove history divider");
        }
        linkedList2.clear();
        java.util.LinkedList list8 = bx2Var4.getList(2);
        java.lang.String str3 = "getLayoutIds(...)";
        kotlin.jvm.internal.o.f(list8, "getLayoutIds(...)");
        java.util.Iterator it12 = list8.iterator();
        int i38 = 0;
        while (it12.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) it12.next();
            java.util.Iterator it13 = linkedList3.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it13.next();
                if (l17 != null && ((so2.j5) obj).getItemId() == l17.longValue()) {
                    break;
                }
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var == null) {
                java.util.Iterator it14 = arrayList5.iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        it6 = it12;
                        obj3 = null;
                        break;
                    }
                    obj3 = it14.next();
                    it6 = it12;
                    if (l17 != null && ((r45.ww2) obj3).getLong(0) == l17.longValue()) {
                        break;
                    }
                    it12 = it6;
                }
                r45.ww2 ww2Var4 = (r45.ww2) obj3;
                j5Var = ww2Var4 != null ? fb2.l.b(ww2Var4, loadedInfo.f107766d) : null;
            } else {
                it6 = it12;
                i38++;
            }
            if (j5Var == null) {
                java.util.Iterator it15 = list7.iterator();
                while (true) {
                    if (!it15.hasNext()) {
                        c17 = 3;
                        obj2 = null;
                        break;
                    }
                    obj2 = it15.next();
                    c17 = 3;
                    if (l17 != null && ((r45.yw2) obj2).getLong(3) == l17.longValue()) {
                        break;
                    }
                }
                r45.yw2 yw2Var4 = (r45.yw2) obj2;
                j5Var = yw2Var4 != null ? fb2.l.c(yw2Var4) : null;
            } else {
                c17 = 3;
            }
            if (j5Var == null) {
                com.tencent.mars.xlog.Log.e("Finder.HandleLayoutInfoInterceptor", "[handle] this id[" + l17 + "] not match any.");
            } else {
                linkedList2.add(j5Var);
            }
            it12 = it6;
        }
        java.util.Iterator it16 = linkedList2.iterator();
        int i39 = 0;
        while (it16.hasNext()) {
            java.lang.Object next = it16.next();
            int i47 = i39 + 1;
            if (i39 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var2 = (so2.j5) next;
            if (j5Var2 instanceof so2.j4) {
                so2.j4 j4Var = (so2.j4) j5Var2;
                it = it16;
                int integer = j4Var.f410443d.getInteger(2);
                r45.yw2 yw2Var5 = j4Var.f410443d;
                i19 = i29;
                arrayList = arrayList5;
                linkedList = list7;
                str = str3;
                if (integer == 10) {
                    int i48 = i39 - 1;
                    if (i48 >= 0) {
                        java.lang.Object obj7 = linkedList2.get(i48);
                        kotlin.jvm.internal.o.f(obj7, "get(...)");
                        so2.j5 j5Var3 = (so2.j5) obj7;
                        if (j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3;
                            baseFinderFeed.Z1(yw2Var5);
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[handle] has divider ");
                            sb9.append(yw2Var5.getInteger(2));
                            sb9.append(" wording=");
                            sb9.append(yw2Var5.getString(1));
                            sb9.append(" nickname=");
                            ya2.b2 contact = baseFinderFeed.getContact();
                            sb9.append(contact != null ? contact.w0() : null);
                            com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", sb9.toString());
                        }
                    }
                } else if (i47 < linkedList2.size()) {
                    java.lang.Object obj8 = linkedList2.get(i47);
                    kotlin.jvm.internal.o.f(obj8, "get(...)");
                    so2.j5 j5Var4 = (so2.j5) obj8;
                    if (j5Var4 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var4;
                        baseFinderFeed2.Z1(yw2Var5);
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[handle] has divider ");
                        sb10.append(yw2Var5.getInteger(2));
                        sb10.append(" wording=");
                        sb10.append(yw2Var5.getString(1));
                        sb10.append(" nickname=");
                        ya2.b2 contact2 = baseFinderFeed2.getContact();
                        sb10.append(contact2 != null ? contact2.w0() : null);
                        com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", sb10.toString());
                        it16 = it;
                        i39 = i47;
                        i29 = i19;
                        arrayList5 = arrayList;
                        list7 = linkedList;
                        str3 = str;
                    }
                }
            } else {
                str = str3;
                linkedList = list7;
                i19 = i29;
                it = it16;
                arrayList = arrayList5;
            }
            it16 = it;
            i39 = i47;
            i29 = i19;
            arrayList5 = arrayList;
            list7 = linkedList;
            str3 = str;
        }
        java.lang.String str4 = str3;
        java.util.LinkedList linkedList6 = list7;
        int i49 = i29;
        java.util.ArrayList arrayList8 = arrayList5;
        kz5.h0.B(linkedList2, fb2.j.f260847d);
        if (i38 != linkedList3.size()) {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[handle] checkCount[");
            sb11.append(i38);
            sb11.append("] != streamList.size[");
            sb11.append(linkedList3.size());
            sb11.append("] rawObjects.size[");
            sb11.append(linkedList5.size());
            sb11.append("] historyList.size[");
            sb11.append(linkedList4.size());
            sb11.append(']');
            java.util.LinkedList<java.lang.Long> list9 = bx2Var4.getList(2);
            kotlin.jvm.internal.o.f(list9, str4);
            java.util.ArrayList arrayList9 = new java.util.ArrayList(kz5.d0.q(list9, 10));
            for (java.lang.Long l18 : list9) {
                kotlin.jvm.internal.o.d(l18);
                arrayList9.add(pm0.v.u(l18.longValue()));
            }
            sb11.append(arrayList9);
            sb11.append(' ');
            java.util.ArrayList arrayList10 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
            java.util.Iterator it17 = linkedList3.iterator();
            while (it17.hasNext()) {
                arrayList10.add(pm0.v.u(((so2.j5) it17.next()).getItemId()));
            }
            sb11.append(arrayList10);
            sb11.append('}');
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            for (java.lang.Object obj9 : linkedList3) {
                so2.j5 j5Var5 = (so2.j5) obj9;
                java.util.Iterator it18 = linkedList2.iterator();
                int i57 = 0;
                while (true) {
                    if (!it18.hasNext()) {
                        i57 = -1;
                        break;
                    }
                    if (((so2.j5) it18.next()).getItemId() == j5Var5.getItemId()) {
                        break;
                    }
                    i57++;
                }
                if (i57 < 0) {
                    arrayList11.add(obj9);
                }
            }
            java.util.ArrayList arrayList12 = new java.util.ArrayList(kz5.d0.q(arrayList11, 10));
            java.util.Iterator it19 = arrayList11.iterator();
            while (it19.hasNext()) {
                arrayList12.add(pm0.v.u(((so2.j5) it19.next()).getItemId()));
            }
            sb11.append(arrayList12);
            com.tencent.mars.xlog.Log.e("Finder.HandleLayoutInfoInterceptor", sb11.toString());
            linkedList2.clear();
            linkedList2.addAll(linkedList5);
        } else {
            linkedList2.addAll(linkedList4);
        }
        com.tencent.mars.xlog.Log.i("Finder.HandleLayoutInfoInterceptor", "[handle] checkCount[" + i38 + "] dividerCount[" + linkedList6.size() + "] cardCount[" + arrayList8.size() + "] streamCount=" + linkedList3.size() + " historyCount=" + linkedList4.size() + " result=" + linkedList2.size() + " historyIndex=" + i49);
        return false;
    }
}
