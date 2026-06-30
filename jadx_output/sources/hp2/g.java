package hp2;

/* loaded from: classes2.dex */
public class g implements hp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f282927a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f282928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f282929c;

    /* renamed from: d, reason: collision with root package name */
    public final int f282930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f282931e;

    /* renamed from: f, reason: collision with root package name */
    public int f282932f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f282933g;

    /* renamed from: h, reason: collision with root package name */
    public int f282934h;

    public g(java.util.List feedList, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, int i17) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        this.f282927a = feedList;
        this.f282928b = wxRecyclerAdapter;
        this.f282929c = i17;
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "create NearbyLiveAutoPlaySelector focusItemCount: " + i17);
        this.f282930d = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;
        this.f282931e = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels;
        this.f282932f = 1;
        this.f282933g = kz5.p0.f313996d;
    }

    @Override // hp2.a
    public void a(int i17) {
        this.f282932f = i17;
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] setFocusPlayMode: " + this.f282932f);
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f3688a;
            jz5.g gVar = ae2.in.f3905w;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != -1) {
                this.f282932f = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "setFocusPlayModeFromMock: " + this.f282932f);
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f3688a;
            jz5.g gVar2 = ae2.in.f3914x;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() != -1) {
                this.f282932f = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "setFocusPlayModeFromMock: " + this.f282932f);
            }
        }
    }

    @Override // hp2.a
    public boolean b(int i17, boolean z17) {
        int i18;
        this.f282934h = i17;
        boolean z18 = false;
        if (i17 == 0 ? (i18 = this.f282932f) == 0 || i18 == 1 || i18 == 2 : i17 == 1 && this.f282932f == 2) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]setPlayOrder: playOrder=" + i17 + ", focusPlayMode=" + this.f282932f + ", shouldPlay=" + z18);
        return z18;
    }

    @Override // hp2.a
    public int c() {
        return this.f282932f;
    }

    @Override // hp2.a
    public java.util.Set d(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, java.util.HashSet curLivePreviewDataSet) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(curLivePreviewDataSet, "curLivePreviewDataSet");
        if (this.f282933g.isEmpty()) {
            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]findAutoStopItem: cachedTargetPlayItems empty, stop all " + curLivePreviewDataSet.size() + " cards");
            return curLivePreviewDataSet;
        }
        java.util.List list = this.f282933g;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((hp2.b) it.next()).f282922b));
        }
        java.util.HashSet Q0 = kz5.n0.Q0(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : curLivePreviewDataSet) {
            if (!Q0.contains(java.lang.Long.valueOf(((gp2.f) obj).f274217d.getItemId()))) {
                arrayList2.add(obj);
            }
        }
        java.util.HashSet Q02 = kz5.n0.Q0(arrayList2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]findAutoStopItem: cachedItems=");
        java.util.List list2 = this.f282933g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((hp2.b) it6.next()).f282921a));
        }
        sb6.append(arrayList3);
        sb6.append(", curSize=");
        sb6.append(curLivePreviewDataSet.size());
        sb6.append(", toStopItemIds=");
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(Q02, 10));
        java.util.Iterator it7 = Q02.iterator();
        while (it7.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((gp2.f) it7.next()).f274217d.getItemId()));
        }
        sb6.append(arrayList4);
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
        return Q02;
    }

    @Override // hp2.a
    public int[] e(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        kotlin.jvm.internal.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        int[] f17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3800l1).getValue()).r()).intValue() == 1 ? f(layoutManager, firstVisibleItemPos, lastVisibleItemPos) : f(layoutManager, firstVisibleItemPos, lastVisibleItemPos);
        java.util.List x07 = kz5.z.x0(f17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = x07.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            so2.j5 h17 = h(intValue);
            hp2.b bVar = h17 != null ? new hp2.b(intValue, h17.getItemId()) : null;
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        this.f282933g = arrayList;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] findAutoPlayItem: cached positions=");
        java.lang.String arrays = java.util.Arrays.toString(f17);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", items=");
        java.util.List<hp2.b> list = this.f282933g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (hp2.b bVar2 : list) {
            arrayList2.add(new jz5.l(java.lang.Integer.valueOf(bVar2.f282921a), java.lang.Long.valueOf(bVar2.f282922b)));
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
        return f17;
    }

    public int[] f(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        int[] iArr;
        boolean z17;
        hp2.g gVar = this;
        androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager = staggeredGridLayoutManager;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        kotlin.jvm.internal.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        int i17 = gVar.f282934h;
        boolean z18 = false;
        boolean z19 = true;
        if (i17 == 0) {
            int i18 = gVar.f282932f;
            if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: CenterFirstRow mode, playOrder=0, find center visible");
                int i19 = gVar.f282930d / 2;
                int i27 = gVar.f282929c;
                int[] iArr2 = new int[i27];
                iArr2[0] = firstVisibleItemPos[0];
                int i28 = firstVisibleItemPos[0];
                int i29 = lastVisibleItemPos[lastVisibleItemPos.length - 1];
                if (i28 <= i29) {
                    int i37 = 0;
                    while (true) {
                        so2.j5 h17 = gVar.h(i28);
                        if (h17 instanceof so2.h1) {
                            android.view.View findViewByPosition = layoutManager.findViewByPosition(i28);
                            if (findViewByPosition != null) {
                                android.graphics.Rect rect = new android.graphics.Rect();
                                findViewByPosition.getGlobalVisibleRect(rect);
                                if (rect.contains(rect.left, i19)) {
                                    if (z19) {
                                        z19 = false;
                                        i37 = 0;
                                    }
                                    int i38 = i37 + 1;
                                    iArr2[i37] = i28;
                                    if (gVar.i(layoutManager, i28)) {
                                        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit baseline for big card, focus[" + iArr2[0] + "] focusItemIndex:" + i38 + " rect:" + rect + " baseline:" + i19);
                                        iArr = new int[]{i28};
                                        break;
                                    }
                                    if (i38 >= i27) {
                                        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit baseline, focus[" + iArr2[0] + "] focusItemIndex:" + i38 + " rect:" + rect + " baseline:" + i19);
                                        break;
                                    }
                                    i37 = i38;
                                    z17 = false;
                                } else {
                                    if (rect.top > i19) {
                                        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos item hit divider, focus[" + iArr2[0] + "] focusItemIndex:" + i37 + " rect:" + rect + " baseline:" + i19);
                                        break;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderCenterVisibleItemPos item hit cache, focus[");
                                    z17 = false;
                                    sb6.append(iArr2[0]);
                                    sb6.append("] focusItemIndex:");
                                    sb6.append(i37);
                                    sb6.append(" rect:");
                                    sb6.append(rect);
                                    sb6.append(" baseline:");
                                    sb6.append(i19);
                                    com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
                                    int i39 = i37 + 1;
                                    iArr2[i37] = i28;
                                    i37 = i39 >= i27 ? 0 : i39;
                                }
                            } else {
                                z17 = z18;
                                com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos invalid view index:" + i28);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "finderCenterVisibleItemPos invalid feed:" + h17 + " index:" + i28);
                            z17 = z18;
                        }
                        if (i28 == i29) {
                            break;
                        }
                        i28++;
                        layoutManager = staggeredGridLayoutManager;
                        z18 = z17;
                        gVar = this;
                    }
                }
                iArr = iArr2;
            } else if (i18 == 1) {
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalFirstRow mode, playOrder=0, find first full row");
                iArr = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.f.f282926d);
            } else if (i18 != 2) {
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: unknown focusPlayMode=" + gVar.f282932f + ", return empty");
                iArr = new int[0];
            } else {
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalTwoRows mode, playOrder=0, find two rows");
                int[] g17 = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.d.f282924d);
                if (g17.length == 0) {
                    com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderFirstFullVisibleAndBelowItemPos no full visible item found");
                    iArr = new int[0];
                } else {
                    int e07 = kz5.z.e0(g17) + 1;
                    int[] g18 = e07 <= kz5.z.e0(lastVisibleItemPos) ? gVar.g(new int[]{e07}, lastVisibleItemPos, layoutManager, hp2.e.f282925d) : new int[0];
                    int length = g17.length;
                    int length2 = g18.length;
                    int[] copyOf = java.util.Arrays.copyOf(g17, length + length2);
                    java.lang.System.arraycopy(g18, 0, copyOf, length, length2);
                    kotlin.jvm.internal.o.d(copyOf);
                    java.lang.String arrays = java.util.Arrays.toString(copyOf);
                    kotlin.jvm.internal.o.f(arrays, "toString(...)");
                    com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderFirstFullVisibleAndBelowItemPos return focusItemPos:".concat(arrays));
                    iArr = copyOf;
                }
            }
        } else if (i17 != 1) {
            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: playOrder=" + gVar.f282934h + ", return empty");
            iArr = new int[0];
        } else if (gVar.f282932f == 2) {
            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: TotalTwoRows mode, playOrder=1, find first visible row");
            iArr = gVar.g(firstVisibleItemPos, lastVisibleItemPos, layoutManager, hp2.c.f282923d);
        } else {
            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: playOrder=1, focusPlayMode=" + gVar.f282932f + ", return empty");
            iArr = new int[0];
        }
        java.lang.String arrays2 = java.util.Arrays.toString(iArr);
        kotlin.jvm.internal.o.f(arrays2, "toString(...)");
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck] findAutoPlayItemInternal: autoPlayList=".concat(arrays2));
        return iArr;
    }

    public final int[] g(int[] iArr, int[] iArr2, androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, yz5.q qVar) {
        int i17;
        int i18 = this.f282929c;
        int[] iArr3 = new int[i18];
        int i19 = iArr[0];
        boolean z17 = true;
        int i27 = iArr2[iArr2.length - 1];
        if (i19 <= i27) {
            int i28 = 0;
            while (true) {
                so2.j5 h17 = h(i19);
                if (h17 instanceof so2.h1) {
                    android.view.View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i19);
                    if (findViewByPosition != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        findViewByPosition.getGlobalVisibleRect(rect);
                        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos feed.nickname[" + ((so2.h1) h17).getFeedObject().getNickName() + "] index:" + i19 + " rect:" + rect);
                        if (((java.lang.Boolean) qVar.invoke(java.lang.Integer.valueOf(i19), findViewByPosition, rect)).booleanValue()) {
                            if (z17) {
                                i28 = 0;
                                z17 = false;
                            }
                            i17 = i28 + 1;
                            iArr3[i28] = i19;
                            if (i(staggeredGridLayoutManager, i19)) {
                                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos item hit baseline for big card, focus[" + iArr3[0] + "] focusItemIndex:" + i17 + " rect:" + rect);
                                iArr3 = new int[]{i19};
                                break;
                            }
                            if (i17 >= i18) {
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck]finderTargetVisibleItemPos item hit baseline, focus[");
                                java.lang.String arrays = java.util.Arrays.toString(iArr3);
                                kotlin.jvm.internal.o.f(arrays, "toString(...)");
                                sb6.append(arrays);
                                sb6.append("] rect:");
                                sb6.append(rect);
                                sb6.append(" focusItemCount:");
                                sb6.append(i18);
                                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", sb6.toString());
                                break;
                            }
                            i28 = i17;
                        } else {
                            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos item not hit baseline, index:" + i19 + " rect:" + rect);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos invalid view index:" + i19);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "[AutoPlayCheck]finderTargetVisibleItemPos invalid feed:" + h17 + " index:" + i19);
                }
                if (i19 == i27) {
                    i17 = i28;
                    break;
                }
                i19++;
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            return new int[0];
        }
        int[] copyOf = java.util.Arrays.copyOf(iArr3, i17);
        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
        return copyOf;
    }

    public so2.j5 h(int i17) {
        java.util.List list = this.f282927a;
        if (list == null) {
            com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "getFeedByPos return for feedList:" + list);
            return null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f282928b;
        int a07 = i17 - (wxRecyclerAdapter != null ? wxRecyclerAdapter.a0() : 0);
        if (a07 < 0 || a07 >= list.size()) {
            com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelector", "getFeedByPos return for invalid pos:" + i17);
            return null;
        }
        java.lang.Object obj = list.get(a07);
        if (obj instanceof so2.j5) {
            return (so2.j5) obj;
        }
        return null;
    }

    public boolean i(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int i17) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (h(i17) instanceof vp2.d) {
            return true;
        }
        android.view.View findViewByPosition = layoutManager.findViewByPosition(i17);
        if (findViewByPosition != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewByPosition.getGlobalVisibleRect(rect);
            int i18 = rect.right;
            int i19 = this.f282931e;
            boolean z17 = i18 < i19 / 2;
            boolean z18 = rect.left > i19 / 2;
            com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelector", "isSingleOneLine pos: " + i17 + " left: " + rect.left + " right: " + rect.right);
            if (z17) {
                return !(h(i17 + 1) instanceof so2.h1);
            }
            if (z18) {
                return !(h(i17 - 1) instanceof so2.h1);
            }
        }
        return false;
    }
}
