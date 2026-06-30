package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203093f;

    public t1(android.view.View view, com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f203091d = view;
        this.f203092e = e2Var;
        this.f203093f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.e1 e1Var;
        java.lang.Object next;
        java.lang.Long j17;
        java.lang.Long j18;
        int i17;
        float[] fArr;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.util.LinkedHashMap linkedHashMap;
        com.tencent.mm.ui.chatting.view.z2 z2Var;
        java.lang.Long j19;
        long longValue;
        float z17;
        java.lang.Float f17;
        java.lang.Long j27;
        com.tencent.mm.ui.chatting.view.z2 z2Var2;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.chatting.view.e1 e1Var2;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        com.tencent.mm.ui.chatting.view.d1 d1Var;
        long longValue2;
        java.lang.Integer num3;
        java.util.Set set;
        java.util.List list;
        com.tencent.mm.ui.chatting.view.e1 e1Var3;
        com.tencent.mm.ui.chatting.view.w2 w2Var;
        int i18;
        float[] fArr2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        android.graphics.Matrix matrix;
        int i19;
        long longValue3;
        com.tencent.mm.ui.chatting.view.t1 t1Var = this;
        com.tencent.mm.ui.chatting.view.e2 e2Var = t1Var.f203092e;
        com.tencent.mm.ui.chatting.view.z2 z2Var3 = e2Var.f202916m;
        java.lang.String str = e2Var.f202911h;
        if (z2Var3.e(str) || (e1Var = e2Var.f202912i) == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap3 = e2Var.f202913j;
        if (linkedHashMap3.isEmpty()) {
            return;
        }
        com.tencent.mm.ui.chatting.view.b2 b2Var = new com.tencent.mm.ui.chatting.view.b2();
        java.util.List list2 = e1Var.f202909a;
        java.util.List<com.tencent.mm.ui.chatting.view.d1> F0 = kz5.n0.F0(list2, b2Var);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (com.tencent.mm.ui.chatting.view.d1 d1Var2 : F0) {
            jz5.l lVar = (jz5.l) linkedHashMap3.get(d1Var2.f202900a);
            jz5.l lVar2 = lVar == null ? null : new jz5.l(d1Var2, lVar);
            if (lVar2 != null) {
                arrayList5.add(lVar2);
            }
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(arrayList5, 10));
        java.util.Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList6.add(((com.tencent.mm.ui.chatting.view.d1) ((jz5.l) it6.next()).f302833d).f202900a);
        }
        java.util.Set X0 = kz5.n0.X0(arrayList6);
        java.util.Iterator it7 = list2.iterator();
        if (it7.hasNext()) {
            next = it7.next();
            if (it7.hasNext()) {
                java.lang.String uniqueId = ((com.tencent.mm.ui.chatting.view.d1) next).f202900a;
                kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
                java.util.List f07 = r26.n0.f0(uniqueId, new java.lang.String[]{"||"}, false, 0, 6, null);
                long longValue4 = (f07.size() == 3 && (j18 = r26.h0.j((java.lang.String) f07.get(2))) != null) ? j18.longValue() : 0L;
                while (true) {
                    java.lang.Object next2 = it7.next();
                    java.lang.String uniqueId2 = ((com.tencent.mm.ui.chatting.view.d1) next2).f202900a;
                    kotlin.jvm.internal.o.g(uniqueId2, "uniqueId");
                    java.util.List f08 = r26.n0.f0(uniqueId2, new java.lang.String[]{"||"}, false, 0, 6, null);
                    long longValue5 = (f08.size() == 3 && (j17 = r26.h0.j((java.lang.String) f08.get(2))) != null) ? j17.longValue() : 0L;
                    if (longValue4 > longValue5) {
                        next = next2;
                        longValue4 = longValue5;
                    }
                    if (!it7.hasNext()) {
                        break;
                    } else {
                        t1Var = this;
                    }
                }
            }
        } else {
            next = null;
        }
        com.tencent.mm.ui.chatting.view.d1 d1Var3 = (com.tencent.mm.ui.chatting.view.d1) next;
        com.tencent.mm.ui.chatting.view.w2 w2Var2 = d1Var3 != null ? d1Var3.f202901b : null;
        androidx.recyclerview.widget.RecyclerView recyclerView = t1Var.f203093f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(recyclerView.getHeight());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : recyclerView.getRootView().getHeight();
        float h17 = i65.a.h(recyclerView.getContext(), com.tencent.mm.R.dimen.f479646bl);
        if (w2Var2 != null) {
            android.graphics.Bitmap bitmap = w2Var2.f203140a;
            float height = bitmap.getHeight() * 0.5f;
            i17 = 1;
            fArr = new float[]{bitmap.getWidth() * 0.5f, height};
            new android.graphics.Matrix(w2Var2.f203141b).mapPoints(fArr);
        } else {
            i17 = 1;
            fArr = null;
        }
        if (w2Var2 != null) {
            int i27 = w2Var2.f203142c;
            num = java.lang.Integer.valueOf(i27 < i17 ? i17 : i27);
        } else {
            num = null;
        }
        if (w2Var2 != null) {
            int i28 = w2Var2.f203143d;
            if (i28 < i17) {
                i28 = 1;
            }
            num2 = java.lang.Integer.valueOf(i28);
        } else {
            num2 = null;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.Iterator it8 = linkedHashMap3.entrySet().iterator();
        while (true) {
            boolean hasNext = it8.hasNext();
            linkedHashMap = linkedHashMap3;
            z2Var = e2Var.f202916m;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it8.next();
            com.tencent.mm.ui.chatting.view.e2 e2Var2 = e2Var;
            java.lang.String uniqueId3 = (java.lang.String) entry.getKey();
            java.util.ArrayList arrayList9 = arrayList5;
            jz5.l lVar3 = (jz5.l) entry.getValue();
            if (X0.contains(uniqueId3)) {
                num3 = num;
                set = X0;
                list = list2;
                e1Var3 = e1Var;
                w2Var = w2Var2;
                i18 = intValue;
            } else {
                i18 = intValue;
                android.view.View view = (android.view.View) lVar3.f302833d;
                com.tencent.mm.ui.chatting.view.w2 f18 = z2Var.f(recyclerView, lVar3, h17);
                if (f18 == null) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList10.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList10);
                    yj0.a.d(view, arrayList10.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList10.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    num3 = num;
                    set = X0;
                    list = list2;
                    e1Var3 = e1Var;
                    w2Var = w2Var2;
                } else {
                    set = X0;
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix(f18.f203141b);
                    if (w2Var2 == null || fArr == null) {
                        list = list2;
                        e1Var3 = e1Var;
                        w2Var = w2Var2;
                        arrayList4 = arrayList7;
                        matrix = new android.graphics.Matrix(matrix2);
                    } else {
                        android.graphics.Bitmap bitmap2 = f18.f203140a;
                        e1Var3 = e1Var;
                        int width = bitmap2.getWidth();
                        int height2 = bitmap2.getHeight();
                        list = list2;
                        android.graphics.Matrix anchorStartMatrix = w2Var2.f203141b;
                        w2Var = w2Var2;
                        kotlin.jvm.internal.o.g(anchorStartMatrix, "anchorStartMatrix");
                        android.graphics.Matrix matrix3 = new android.graphics.Matrix(anchorStartMatrix);
                        arrayList4 = arrayList7;
                        float[] fArr3 = {width * 0.5f, height2 * 0.5f};
                        matrix3.mapPoints(fArr3);
                        matrix3.postTranslate(fArr[0] - fArr3[0], fArr[1] - fArr3[1]);
                        matrix = matrix3;
                    }
                    android.graphics.RectF rectF = new android.graphics.RectF();
                    if (view != null) {
                        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
                        android.graphics.Matrix matrix4 = new android.graphics.Matrix();
                        matrix4.reset();
                        com.tencent.mm.ui.chatting.view.i2.d(recyclerView, view, matrix4);
                        matrix4.mapRect(rectF);
                    }
                    int width2 = (int) rectF.width();
                    if (width2 < 1) {
                        width2 = 1;
                    }
                    int height3 = (int) rectF.height();
                    if (height3 < 1) {
                        height3 = 1;
                    }
                    int intValue2 = num != null ? num.intValue() : width2;
                    if (num2 != null) {
                        i19 = num2.intValue();
                        num3 = num;
                    } else {
                        num3 = num;
                        i19 = height3;
                    }
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    fArr2 = fArr;
                    arrayList11.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList11.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    arrayList8.add(view);
                    kotlin.jvm.internal.o.g(uniqueId3, "uniqueId");
                    java.util.List f09 = r26.n0.f0(uniqueId3, new java.lang.String[]{"||"}, false, 0, 6, null);
                    if (f09.size() != 3) {
                        longValue3 = 0;
                    } else {
                        java.lang.Long j28 = r26.h0.j((java.lang.String) f09.get(2));
                        longValue3 = j28 != null ? j28.longValue() : 0L;
                    }
                    android.graphics.Matrix matrix5 = matrix;
                    arrayList3 = arrayList4;
                    arrayList3.add(new com.tencent.mm.ui.chatting.view.t2(longValue3, f18.f203140a, new jz5.l(java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i19)), matrix5, new jz5.l(java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(height3)), matrix2, h17, h17));
                    arrayList7 = arrayList3;
                    intValue = i18;
                    X0 = set;
                    list2 = list;
                    w2Var2 = w2Var;
                    num = num3;
                    linkedHashMap3 = linkedHashMap;
                    e2Var = e2Var2;
                    arrayList5 = arrayList9;
                    e1Var = e1Var3;
                    fArr = fArr2;
                }
            }
            fArr2 = fArr;
            arrayList3 = arrayList7;
            arrayList7 = arrayList3;
            intValue = i18;
            X0 = set;
            list2 = list;
            w2Var2 = w2Var;
            num = num3;
            linkedHashMap3 = linkedHashMap;
            e2Var = e2Var2;
            arrayList5 = arrayList9;
            e1Var = e1Var3;
            fArr = fArr2;
        }
        java.util.Set set2 = X0;
        java.util.ArrayList arrayList12 = arrayList5;
        com.tencent.mm.ui.chatting.view.e2 e2Var3 = e2Var;
        com.tencent.mm.ui.chatting.view.e1 e1Var4 = e1Var;
        int i29 = intValue;
        java.util.ArrayList arrayList13 = arrayList7;
        int d17 = kz5.b1.d(kz5.d0.q(list2, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list2) {
            linkedHashMap4.put(((com.tencent.mm.ui.chatting.view.d1) obj).f202900a, obj);
        }
        java.util.ArrayList arrayList14 = new java.util.ArrayList();
        java.util.ArrayList arrayList15 = new java.util.ArrayList();
        com.tencent.mm.ui.chatting.view.e1 e1Var5 = e1Var4;
        java.util.LinkedHashMap linkedHashMap5 = e1Var5.f202910b;
        java.util.Iterator it9 = linkedHashMap5.entrySet().iterator();
        while (it9.hasNext()) {
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it9.next();
            java.lang.String uniqueId4 = (java.lang.String) entry2.getKey();
            android.view.View view2 = (android.view.View) entry2.getValue();
            java.util.Set set3 = set2;
            if (set3.contains(uniqueId4) || (d1Var = (com.tencent.mm.ui.chatting.view.d1) linkedHashMap4.get(uniqueId4)) == null) {
                z2Var2 = z2Var;
                linkedHashMap2 = linkedHashMap4;
                arrayList = arrayList15;
                e1Var2 = e1Var5;
                arrayList2 = arrayList8;
                it = it9;
                set2 = set3;
            } else {
                z2Var2 = z2Var;
                com.tencent.mm.ui.chatting.view.w2 w2Var3 = d1Var.f202901b;
                linkedHashMap2 = linkedHashMap4;
                android.graphics.Matrix matrix6 = new android.graphics.Matrix(w2Var3.f203141b);
                it = it9;
                float[] fArr4 = {0.0f, 0.0f};
                matrix6.mapPoints(fArr4);
                set2 = set3;
                float f19 = i29 - fArr4[1];
                int i37 = w2Var3.f203143d;
                float f27 = i37;
                float f28 = f19 + f27;
                if (f28 >= f27) {
                    f27 = f28;
                }
                android.graphics.Matrix matrix7 = new android.graphics.Matrix(matrix6);
                e1Var2 = e1Var5;
                matrix7.postTranslate(0.0f, f27);
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList2 = arrayList8;
                arrayList16.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view2, arrayList16.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList16.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                arrayList15.add(view2);
                kotlin.jvm.internal.o.g(uniqueId4, "uniqueId");
                java.util.List f010 = r26.n0.f0(uniqueId4, new java.lang.String[]{"||"}, false, 0, 6, null);
                if (f010.size() != 3) {
                    longValue2 = 0;
                } else {
                    java.lang.Long j29 = r26.h0.j((java.lang.String) f010.get(2));
                    longValue2 = j29 != null ? j29.longValue() : 0L;
                }
                android.graphics.Bitmap bitmap3 = w2Var3.f203140a;
                int i38 = w2Var3.f203142c;
                arrayList = arrayList15;
                jz5.l lVar4 = new jz5.l(java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37));
                jz5.l lVar5 = new jz5.l(java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i37));
                float f29 = w2Var3.f203145f;
                arrayList14.add(new com.tencent.mm.ui.chatting.view.t2(longValue2, bitmap3, lVar4, matrix6, lVar5, matrix7, f29, f29));
            }
            linkedHashMap4 = linkedHashMap2;
            it9 = it;
            arrayList15 = arrayList;
            z2Var = z2Var2;
            e1Var5 = e1Var2;
            arrayList8 = arrayList2;
        }
        com.tencent.mm.ui.chatting.view.z2 z2Var4 = z2Var;
        java.util.ArrayList arrayList17 = arrayList15;
        com.tencent.mm.ui.chatting.view.e1 e1Var6 = e1Var5;
        java.util.ArrayList arrayList18 = arrayList8;
        java.util.ArrayList arrayList19 = new java.util.ArrayList(kz5.d0.q(arrayList12, 10));
        java.util.Iterator it10 = arrayList12.iterator();
        while (it10.hasNext()) {
            jz5.l lVar6 = (jz5.l) it10.next();
            com.tencent.mm.ui.chatting.view.d1 d1Var4 = (com.tencent.mm.ui.chatting.view.d1) lVar6.f302833d;
            android.view.View view3 = (android.view.View) ((jz5.l) lVar6.f302834e).f302833d;
            android.view.View view4 = (android.view.View) linkedHashMap5.get(d1Var4.f202900a);
            if (view4 != null) {
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList20.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(view4, arrayList20.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList20.get(0)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList21.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList21);
            yj0.a.d(view3, arrayList21.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList21.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setTranslationX(0.0f);
            view3.setTranslationY(0.0f);
            com.tencent.mm.ui.chatting.view.e2 e2Var4 = e2Var3;
            com.tencent.mm.ui.chatting.view.z2 z2Var5 = e2Var4.f202916m;
            java.lang.String uniqueId5 = d1Var4.f202900a;
            kotlin.jvm.internal.o.g(uniqueId5, "uniqueId");
            java.util.List f011 = r26.n0.f0(uniqueId5, new java.lang.String[]{"||"}, false, 0, 6, null);
            arrayList19.add(z2Var5.c(recyclerView, d1Var4.f202901b, view3, h17, (f011.size() == 3 && (j27 = r26.h0.j((java.lang.String) f011.get(2))) != null) ? j27.longValue() : 0L));
            e2Var3 = e2Var4;
        }
        com.tencent.mm.ui.chatting.view.e2 e2Var5 = e2Var3;
        java.util.HashMap hashMap = new java.util.HashMap(linkedHashMap5.size());
        for (java.util.Map.Entry entry3 : linkedHashMap5.entrySet()) {
            java.lang.String uniqueId6 = (java.lang.String) entry3.getKey();
            android.view.View view5 = (android.view.View) entry3.getValue();
            kotlin.jvm.internal.o.g(uniqueId6, "uniqueId");
            java.util.List f012 = r26.n0.f0(uniqueId6, new java.lang.String[]{"||"}, false, 0, 6, null);
            if (f012.size() == 3 && (j19 = r26.h0.j((java.lang.String) f012.get(2))) != null) {
                longValue = j19.longValue();
                z17 = view5.getZ();
                f17 = (java.lang.Float) hashMap.get(java.lang.Long.valueOf(longValue));
                if (f17 != null || z17 < f17.floatValue()) {
                    hashMap.put(java.lang.Long.valueOf(longValue), java.lang.Float.valueOf(z17));
                }
            }
            longValue = 0;
            z17 = view5.getZ();
            f17 = (java.lang.Float) hashMap.get(java.lang.Long.valueOf(longValue));
            if (f17 != null) {
            }
            hashMap.put(java.lang.Long.valueOf(longValue), java.lang.Float.valueOf(z17));
        }
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.util.List t07 = kz5.n0.t0(kz5.n0.t0(arrayList13, arrayList14), arrayList19);
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        java.util.Iterator it11 = ((java.util.ArrayList) t07).iterator();
        while (it11.hasNext()) {
            java.lang.Object next3 = it11.next();
            if (keySet.contains(java.lang.Long.valueOf(((com.tencent.mm.ui.chatting.view.t2) next3).f203094a))) {
                arrayList22.add(next3);
            } else {
                arrayList23.add(next3);
            }
        }
        java.util.List t08 = kz5.n0.t0(kz5.n0.F0(arrayList23, new com.tencent.mm.ui.chatting.view.c2()), kz5.n0.F0(arrayList22, new com.tencent.mm.ui.chatting.view.a2(hashMap)));
        if (!((java.util.ArrayList) t08).isEmpty()) {
            z2Var4.g(recyclerView, str, t08, new com.tencent.mm.ui.chatting.view.d2(arrayList12, arrayList18, arrayList17, e2Var5, e1Var6));
            return;
        }
        java.util.Iterator it12 = linkedHashMap.values().iterator();
        while (it12.hasNext()) {
            android.view.View view6 = (android.view.View) ((jz5.l) it12.next()).f302833d;
            java.util.ArrayList arrayList24 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList24.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList24);
            yj0.a.d(view6, arrayList24.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList24.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setTranslationX(0.0f);
            view6.setTranslationY(0.0f);
        }
        java.util.Collection<android.view.View> values = linkedHashMap5.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (android.view.View view7 : values) {
            java.util.ArrayList arrayList25 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList25.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList25);
            yj0.a.d(view7, arrayList25.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((java.lang.Float) arrayList25.get(0)).floatValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startExpandAnim", "(Landroidx/recyclerview/widget/RecyclerView;Lcom/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$FoldedSnap;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setTranslationX(0.0f);
            view7.setTranslationY(0.0f);
        }
        e2Var5.f202912i = null;
        linkedHashMap.clear();
        e2Var5.J();
    }
}
