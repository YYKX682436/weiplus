package tl5;

/* loaded from: classes10.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f420383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl5.s f420384e;

    public r(androidx.recyclerview.widget.RecyclerView recyclerView, tl5.s sVar) {
        this.f420383d = recyclerView;
        this.f420384e = sVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        tl5.a aVar;
        java.util.List list;
        boolean z17;
        tl5.s sVar;
        java.lang.String str;
        java.util.ArrayList arrayList;
        android.graphics.drawable.Drawable drawable;
        this.f420383d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        tl5.s sVar2 = this.f420384e;
        java.lang.ref.WeakReference weakReference = sVar2.f420390f;
        if (weakReference == null || ((androidx.recyclerview.widget.RecyclerView) weakReference.get()) == null || (aVar = sVar2.f420391g) == null || (list = sVar2.f420394j) == null) {
            return;
        }
        if (sVar2.f420387c != tl5.l.f420370e) {
            com.tencent.mars.xlog.Log.w("PinchZoomEngine", "onToSideLayoutComplete: state=" + sVar2.f420387c + ", aborting");
            return;
        }
        cd5.a aVar2 = (cd5.a) sVar2.f420385a;
        java.util.List a17 = aVar2.a();
        int i17 = sVar2.f420392h;
        com.tencent.mm.view.recyclerview.WxRecyclerView c17 = aVar2.c();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = c17.getLayoutManager();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
        uc5.r rVar = aVar2.f40659a;
        if (gridLayoutManager == null) {
            z17 = false;
        } else {
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar;
            msgHistoryGalleryUI.B.e(i17);
            gridLayoutManager.c0(i17);
            tc5.e eVar = new tc5.e(c17, i17);
            eVar.f12225b = true;
            gridLayoutManager.B = eVar;
            androidx.recyclerview.widget.p2 p2Var = msgHistoryGalleryUI.G;
            if (p2Var != null) {
                c17.S0(p2Var);
            }
            z17 = false;
            ed5.a aVar3 = new ed5.a(i17, i65.a.h(c17.getContext(), msgHistoryGalleryUI.C), 0, 4, null);
            msgHistoryGalleryUI.G = aVar3;
            c17.N(aVar3);
            int i18 = aVar.f420330a;
            if (i18 != -1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(aVar.f420331b));
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(gridLayoutManager, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/pinchzoom/MsgHistoryGalleryPinchZoomAdapter", "restoreLayout", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                gridLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(gridLayoutManager, "com/tencent/mm/ui/chatting/history/pinchzoom/MsgHistoryGalleryPinchZoomAdapter", "restoreLayout", "(III)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            c17.requestLayout();
        }
        if (a17.isEmpty()) {
            com.tencent.mars.xlog.Log.w("PinchZoomEngine", "onToSideLayoutComplete: no to-side items");
            sVar2.a(z17);
            return;
        }
        tl5.h hVar = tl5.h.f420349a;
        int i19 = sVar2.f420392h;
        int i27 = sVar2.f420393i;
        int i28 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar).D;
        tl5.o oVar = new tl5.o(sVar2);
        if (list.isEmpty() || a17.isEmpty()) {
            sVar = sVar2;
            str = "PinchZoomEngine";
            com.tencent.mars.xlog.Log.w("PinchZoomPosCalc", "calculateRenderItems: empty inputs");
        } else {
            java.util.List c18 = hVar.c(list);
            java.util.List c19 = hVar.c(a17);
            long j17 = aVar.f420332c;
            tl5.e a18 = hVar.a(c18, j17);
            tl5.e a19 = hVar.a(c19, j17);
            if (a18 != null && a19 != null) {
                tl5.j jVar = a19.f420344a;
                float centerX = jVar.f420362a.centerX();
                tl5.j jVar2 = a18.f420344a;
                java.util.List list2 = c18;
                float centerX2 = centerX - jVar2.f420362a.centerX();
                android.graphics.RectF rectF = jVar.f420362a;
                float centerY = rectF.centerY();
                android.graphics.RectF rectF2 = jVar2.f420362a;
                float centerY2 = centerY - rectF2.centerY();
                float width = rectF.width() / rectF2.width();
                float height = rectF.height() / rectF2.height();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((tl5.j) it.next()).f420362a);
                }
                int i29 = i19;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(a17, 10));
                java.util.Iterator it6 = a17.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(((tl5.j) it6.next()).f420362a);
                }
                java.util.ArrayList arrayList5 = (java.util.ArrayList) kz5.n0.t0(arrayList3, arrayList4);
                java.util.Iterator it7 = arrayList5.iterator();
                if (!it7.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f17 = ((android.graphics.RectF) it7.next()).top;
                while (it7.hasNext()) {
                    f17 = java.lang.Math.min(f17, ((android.graphics.RectF) it7.next()).top);
                }
                java.util.Iterator it8 = arrayList5.iterator();
                if (!it8.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f18 = ((android.graphics.RectF) it8.next()).bottom;
                while (it8.hasNext()) {
                    f18 = java.lang.Math.max(f18, ((android.graphics.RectF) it8.next()).bottom);
                }
                java.util.Iterator it9 = arrayList5.iterator();
                if (!it9.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                float f19 = ((android.graphics.RectF) it9.next()).right;
                while (it9.hasNext()) {
                    f19 = java.lang.Math.max(f19, ((android.graphics.RectF) it9.next()).right);
                }
                float height2 = rectF2.height();
                str = "PinchZoomEngine";
                float f27 = 2 * height2;
                android.graphics.RectF rectF3 = new android.graphics.RectF(-height2, f17 - f27, f19 + height2, f18 + f27);
                arrayList = new java.util.ArrayList();
                int d17 = kz5.b1.d(kz5.d0.q(list, 10));
                if (d17 < 16) {
                    d17 = 16;
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
                for (java.lang.Object obj : list) {
                    linkedHashMap.put(java.lang.Long.valueOf(((tl5.j) obj).f420364c), obj);
                }
                java.util.Iterator it10 = c19.iterator();
                while (it10.hasNext()) {
                    java.util.Iterator it11 = ((java.util.List) it10.next()).iterator();
                    while (it11.hasNext()) {
                        tl5.e eVar2 = (tl5.e) it11.next();
                        tl5.j jVar3 = eVar2.f420344a;
                        if (!jVar3.f420366e && android.graphics.RectF.intersects(rectF3, jVar3.f420362a)) {
                            tl5.j jVar4 = eVar2.f420344a;
                            java.util.Iterator it12 = it10;
                            java.util.Iterator it13 = it11;
                            float f28 = centerY2;
                            tl5.e eVar3 = a19;
                            java.util.List list3 = list2;
                            float f29 = centerX2;
                            tl5.s sVar3 = sVar2;
                            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                            int i37 = i29;
                            tl5.h hVar2 = hVar;
                            android.graphics.RectF b17 = hVar.b(jVar4.f420362a, -centerX2, -centerY2, 1.0f / width, 1.0f / height, 0, eVar2.f420345b - a19.f420345b, eVar2.f420346c - a19.f420346c);
                            boolean intersects = android.graphics.RectF.intersects(rectF3, b17);
                            long j18 = jVar4.f420364c;
                            tl5.j jVar5 = (tl5.j) linkedHashMap2.get(java.lang.Long.valueOf(j18));
                            if (jVar5 == null || (drawable = jVar5.f420363b) == null) {
                                drawable = (android.graphics.drawable.Drawable) oVar.invoke(java.lang.Long.valueOf(j18));
                            }
                            arrayList.add(new tl5.i(b17, jVar4.f420362a, intersects ? 0 : 255, 255, null, drawable != null ? drawable.mutate() : null, 0, 80, null));
                            hVar = hVar2;
                            linkedHashMap = linkedHashMap2;
                            centerX2 = f29;
                            sVar2 = sVar3;
                            it11 = it13;
                            centerY2 = f28;
                            a19 = eVar3;
                            i29 = i37;
                            list2 = list3;
                            it10 = it12;
                        }
                    }
                }
                sVar = sVar2;
                float f37 = centerY2;
                tl5.h hVar3 = hVar;
                java.util.List list4 = list2;
                int i38 = i29;
                float f38 = centerX2;
                java.util.Iterator it14 = list4.iterator();
                while (it14.hasNext()) {
                    for (tl5.e eVar4 : (java.util.List) it14.next()) {
                        tl5.j jVar6 = eVar4.f420344a;
                        if (!jVar6.f420366e) {
                            android.graphics.RectF b18 = hVar3.b(jVar6.f420362a, f38, f37, width, height, 0, eVar4.f420345b - a18.f420345b, eVar4.f420346c - a18.f420346c);
                            tl5.j jVar7 = eVar4.f420344a;
                            android.graphics.RectF rectF4 = jVar7.f420362a;
                            android.graphics.drawable.Drawable drawable2 = jVar7.f420363b;
                            arrayList.add(new tl5.i(rectF4, b18, 255, 0, null, drawable2 != null ? drawable2.mutate() : null, 0, 80, null));
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("PinchZoomPosCalc", "calculateRenderItems: " + arrayList.size() + " items, " + i38 + (char) 8594 + i27);
                if (arrayList != null || arrayList.isEmpty()) {
                    com.tencent.mars.xlog.Log.e(str, "onToSideLayoutComplete: calculateRenderItems failed");
                    sVar.a(false);
                }
                tl5.s sVar4 = sVar;
                sVar4.f420394j = null;
                tl5.d dVar = sVar4.f420388d;
                if (dVar != null) {
                    dVar.a(arrayList);
                }
                sVar4.f420387c = tl5.l.f420371f;
                com.tencent.mars.xlog.Log.i(str, "onToSideLayoutComplete: MANUAL, " + arrayList.size() + " render items");
                tl5.k kVar = sVar4.f420397m;
                if (kVar == null) {
                    tl5.d dVar2 = sVar4.f420388d;
                    if (dVar2 != null) {
                        dVar2.b(sVar4.f420396l, false);
                        return;
                    }
                    return;
                }
                sVar4.f420397m = null;
                tl5.d dVar3 = sVar4.f420388d;
                if (dVar3 != null) {
                    dVar3.b(sVar4.f420396l, false);
                }
                sVar4.c(kVar.f420367a, kVar.f420368b);
                return;
            }
            sVar = sVar2;
            str = "PinchZoomEngine";
            com.tencent.mars.xlog.Log.e("PinchZoomPosCalc", "calculateRenderItems: anchor not found, from=" + j17 + ", to=" + j17);
        }
        arrayList = null;
        if (arrayList != null) {
        }
        com.tencent.mars.xlog.Log.e(str, "onToSideLayoutComplete: calculateRenderItems failed");
        sVar.a(false);
    }
}
