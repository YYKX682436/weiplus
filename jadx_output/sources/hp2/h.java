package hp2;

/* loaded from: classes2.dex */
public final class h implements hp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f282935a;

    /* renamed from: b, reason: collision with root package name */
    public int f282936b;

    public h(java.util.ArrayList feedList) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        this.f282935a = feedList;
        this.f282936b = 1;
    }

    @Override // hp2.a
    public void a(int i17) {
        this.f282936b = i17;
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayMode: " + this.f282936b);
        zl2.q4 q4Var = zl2.q4.f473933a;
        if (q4Var.E()) {
            ae2.in inVar = ae2.in.f3688a;
            jz5.g gVar = ae2.in.f3905w;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != -1) {
                this.f282936b = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayModeFromMock: " + this.f282936b);
            }
        }
        if (q4Var.E()) {
            ae2.in inVar2 = ae2.in.f3688a;
            jz5.g gVar2 = ae2.in.f3914x;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() != -1) {
                this.f282936b = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setFocusPlayModeFromMock: " + this.f282936b);
            }
        }
    }

    @Override // hp2.a
    public boolean b(int i17, boolean z17) {
        boolean z18 = false;
        if (i17 == 0 ? z17 : !(i17 != 1 || this.f282936b != 2)) {
            z18 = true;
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelectorHorizontal", "setPlayOrder: playOrder=" + i17 + ", focusPlayMode=" + this.f282936b + ", shouldPlay=" + z18 + "，isYAxisFullyVisible=" + z17);
        return z18;
    }

    @Override // hp2.a
    public int c() {
        return this.f282936b;
    }

    @Override // hp2.a
    public java.util.Set d(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, java.util.HashSet curLivePreviewDataSet) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(curLivePreviewDataSet, "curLivePreviewDataSet");
        java.util.HashSet hashSet = new java.util.HashSet();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        layoutManager.u(iArr);
        layoutManager.v(iArr2);
        int[] f17 = f(layoutManager, iArr, iArr2);
        int length = f17.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = f17[i17];
            java.util.Iterator it = curLivePreviewDataSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (i18 == ((gp2.f) obj).f274214a) {
                    break;
                }
            }
            gp2.f fVar = (gp2.f) obj;
            if (fVar != null) {
                hashSet.add(fVar);
                com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoStopItem hit cur play view index:" + fVar.f274214a + " size:" + hashSet.size());
            }
        }
        java.util.Set<gp2.f> g17 = kz5.q1.g(curLivePreviewDataSet, hashSet);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findAutoStopItem list ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(g17, 10));
        for (gp2.f fVar2 : g17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(fVar2.f274214a);
            sb7.append(' ');
            arrayList.add(sb7.toString());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("NearbyLiveAutoPlaySelectorHorizontal", sb6.toString());
        return g17;
    }

    @Override // hp2.a
    public int[] e(androidx.recyclerview.widget.StaggeredGridLayoutManager layoutManager, int[] firstVisibleItemPos, int[] lastVisibleItemPos) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(firstVisibleItemPos, "firstVisibleItemPos");
        kotlin.jvm.internal.o.g(lastVisibleItemPos, "lastVisibleItemPos");
        return f(layoutManager, firstVisibleItemPos, lastVisibleItemPos);
    }

    public final int[] f(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int[] iArr, int[] iArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = iArr[0];
        int i18 = iArr2[0];
        if (i17 <= i18) {
            while (true) {
                so2.j5 j5Var = null;
                java.util.ArrayList arrayList2 = this.f282935a;
                if (arrayList2 == null) {
                    com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for feedList:" + arrayList2);
                } else if (i17 < 0 || i17 >= arrayList2.size()) {
                    com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "getFeedByPos return for invalid pos:" + i17);
                } else {
                    j5Var = (so2.j5) arrayList2.get(i17);
                }
                if (j5Var instanceof so2.h1) {
                    android.view.View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i17);
                    if (findViewByPosition != null) {
                        findViewByPosition.getGlobalVisibleRect(new android.graphics.Rect());
                        dp2.a aVar = dp2.a.f242183a;
                        android.graphics.Rect rect = new android.graphics.Rect();
                        findViewByPosition.getGlobalVisibleRect(rect);
                        if ((((float) rect.height()) * 1.0f) / ((float) findViewByPosition.getHeight()) >= 0.5f && (((float) rect.width()) * 1.0f) / ((float) findViewByPosition.getWidth()) >= 0.5f) {
                            arrayList.add(java.lang.Integer.valueOf(i17));
                            com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem hit view index:" + i17 + ' ' + arrayList);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid view index:" + i17);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("NearbyLiveAutoPlaySelectorHorizontal", "findAutoPlayItem invalid feed:" + j5Var + " index:" + i17);
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return kz5.n0.R0(arrayList);
    }
}
