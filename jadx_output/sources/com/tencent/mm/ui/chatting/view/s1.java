package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203087f;

    public s1(android.view.View view, com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f203085d = view;
        this.f203086e = e2Var;
        this.f203087f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object next;
        java.lang.Long j17;
        java.lang.Long j18;
        com.tencent.mm.ui.chatting.view.z2 z2Var;
        java.lang.Long j19;
        long longValue;
        float z17;
        java.lang.Float f17;
        java.util.Iterator it;
        int i17;
        java.util.ArrayList arrayList;
        java.lang.Long j27;
        long longValue2;
        char c17;
        long longValue3;
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203086e;
        if (e2Var.f202916m.e(e2Var.f202911h) || e2Var.f202914k.isEmpty() || e2Var.f202915l.isEmpty()) {
            return;
        }
        java.util.HashMap hashMap = e2Var.f202914k;
        java.util.LinkedHashMap linkedHashMap = e2Var.f202915l;
        e2Var.getClass();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f203087f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(recyclerView.getHeight());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : recyclerView.getRootView().getHeight();
        float h17 = i65.a.h(recyclerView.getContext(), com.tencent.mm.R.dimen.f479738dv);
        java.util.Iterator it6 = linkedHashMap.entrySet().iterator();
        java.lang.String str = "uniqueId";
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                java.lang.String uniqueId = (java.lang.String) ((java.util.Map.Entry) next).getKey();
                kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
                java.util.List f07 = r26.n0.f0(uniqueId, new java.lang.String[]{"||"}, false, 0, 6, null);
                long longValue4 = (f07.size() == 3 && (j18 = r26.h0.j((java.lang.String) f07.get(2))) != null) ? j18.longValue() : 0L;
                do {
                    java.lang.Object next2 = it6.next();
                    java.lang.String uniqueId2 = (java.lang.String) ((java.util.Map.Entry) next2).getKey();
                    kotlin.jvm.internal.o.g(uniqueId2, "uniqueId");
                    java.util.List f08 = r26.n0.f0(uniqueId2, new java.lang.String[]{"||"}, false, 0, 6, null);
                    long longValue5 = (f08.size() == 3 && (j17 = r26.h0.j((java.lang.String) f08.get(2))) != null) ? j17.longValue() : 0L;
                    if (longValue4 > longValue5) {
                        next = next2;
                        longValue4 = longValue5;
                    }
                } while (it6.hasNext());
            }
        } else {
            next = null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        android.view.View view = entry != null ? (android.view.View) entry.getValue() : null;
        java.util.List<java.util.Map.Entry> F0 = kz5.n0.F0(linkedHashMap.entrySet(), new com.tencent.mm.ui.chatting.view.x1());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.util.Map.Entry entry2 : F0) {
            java.lang.String str2 = (java.lang.String) entry2.getKey();
            android.view.View view2 = (android.view.View) entry2.getValue();
            com.tencent.mm.ui.chatting.view.d1 d1Var = (com.tencent.mm.ui.chatting.view.d1) hashMap.get(str2);
            jz5.l lVar = d1Var == null ? null : new jz5.l(d1Var, view2);
            if (lVar != null) {
                arrayList2.add(lVar);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            arrayList3.add((android.view.View) ((jz5.l) it7.next()).f302834e);
        }
        java.util.Set<android.view.View> X0 = kz5.n0.X0(arrayList3);
        java.util.Collection values = hashMap.values();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj : values) {
            if (!linkedHashMap.keySet().contains(((com.tencent.mm.ui.chatting.view.d1) obj).f202900a)) {
                arrayList4.add(obj);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj2 : F0) {
            if (!hashMap.keySet().contains((java.lang.String) ((java.util.Map.Entry) obj2).getKey())) {
                arrayList5.add(obj2);
            }
        }
        for (android.view.View view3 : X0) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList6.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.util.Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            android.view.View view4 = (android.view.View) ((java.util.Map.Entry) it8.next()).getValue();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList7.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            jz5.l lVar2 = (jz5.l) it9.next();
            com.tencent.mm.ui.chatting.view.d1 d1Var2 = (com.tencent.mm.ui.chatting.view.d1) lVar2.f302833d;
            android.view.View view5 = (android.view.View) lVar2.f302834e;
            com.tencent.mm.ui.chatting.view.z2 z2Var2 = e2Var.f202916m;
            java.lang.String str3 = d1Var2.f202900a;
            kotlin.jvm.internal.o.g(str3, str);
            java.util.List f09 = r26.n0.f0(str3, new java.lang.String[]{"||"}, false, 0, 6, null);
            java.util.ArrayList arrayList11 = arrayList10;
            java.util.ArrayList arrayList12 = arrayList4;
            if (f09.size() != 3) {
                c17 = 2;
            } else {
                c17 = 2;
                java.lang.Long j28 = r26.h0.j((java.lang.String) f09.get(2));
                if (j28 != null) {
                    longValue3 = j28.longValue();
                    arrayList11.add(z2Var2.c(recyclerView, d1Var2.f202901b, view5, h17, longValue3));
                    arrayList9 = arrayList9;
                    str = str;
                    arrayList10 = arrayList11;
                    arrayList4 = arrayList12;
                    arrayList2 = arrayList2;
                    linkedHashMap = linkedHashMap;
                    arrayList8 = arrayList8;
                    h17 = h17;
                }
            }
            longValue3 = 0;
            arrayList11.add(z2Var2.c(recyclerView, d1Var2.f202901b, view5, h17, longValue3));
            arrayList9 = arrayList9;
            str = str;
            arrayList10 = arrayList11;
            arrayList4 = arrayList12;
            arrayList2 = arrayList2;
            linkedHashMap = linkedHashMap;
            arrayList8 = arrayList8;
            h17 = h17;
        }
        java.util.ArrayList arrayList13 = arrayList8;
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        java.lang.String str4 = str;
        java.util.ArrayList arrayList14 = arrayList9;
        float f18 = h17;
        java.util.ArrayList arrayList15 = arrayList4;
        java.util.ArrayList arrayList16 = arrayList2;
        java.util.ArrayList arrayList17 = arrayList10;
        if (view != null) {
            java.util.Iterator it10 = arrayList15.iterator();
            while (it10.hasNext()) {
                com.tencent.mm.ui.chatting.view.d1 d1Var3 = (com.tencent.mm.ui.chatting.view.d1) it10.next();
                com.tencent.mm.ui.chatting.view.z2 z2Var3 = e2Var.f202916m;
                java.lang.String str5 = d1Var3.f202900a;
                kotlin.jvm.internal.o.g(str5, str4);
                java.util.List f010 = r26.n0.f0(str5, new java.lang.String[]{"||"}, false, 0, 6, null);
                if (f010.size() != 3) {
                    longValue2 = 0;
                } else {
                    java.lang.Long j29 = r26.h0.j((java.lang.String) f010.get(2));
                    longValue2 = j29 != null ? j29.longValue() : 0L;
                }
                arrayList14.add(z2Var3.c(recyclerView, d1Var3.f202901b, view, f18, longValue2));
            }
        }
        java.util.Iterator it11 = arrayList5.iterator();
        while (true) {
            boolean hasNext = it11.hasNext();
            z2Var = e2Var.f202916m;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry3 = (java.util.Map.Entry) it11.next();
            java.lang.String str6 = (java.lang.String) entry3.getKey();
            android.view.View view6 = (android.view.View) entry3.getValue();
            float f19 = f18;
            com.tencent.mm.ui.chatting.view.w2 f27 = z2Var.f(recyclerView, new jz5.l(view6, null), f19);
            if (f27 == null) {
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList18.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(view6, arrayList18.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view6.setAlpha(((java.lang.Float) arrayList18.get(0)).floatValue());
                yj0.a.f(view6, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                it = it11;
                i17 = intValue;
                arrayList = arrayList13;
            } else {
                android.graphics.Matrix matrix = new android.graphics.Matrix(f27.f203141b);
                float[] fArr = {0.0f, 0.0f};
                matrix.mapPoints(fArr);
                float f28 = intValue - fArr[1];
                int i18 = f27.f203143d;
                float f29 = i18;
                float f37 = f28 + f29;
                if (f37 >= f29) {
                    f29 = f37;
                }
                android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
                matrix2.postTranslate(0.0f, f29);
                kotlin.jvm.internal.o.g(str6, str4);
                java.util.List f011 = r26.n0.f0(str6, new java.lang.String[]{"||"}, false, 0, 6, null);
                it = it11;
                long longValue6 = (f011.size() == 3 && (j27 = r26.h0.j((java.lang.String) f011.get(2))) != null) ? j27.longValue() : 0L;
                android.graphics.Bitmap bitmap = f27.f203140a;
                int i19 = f27.f203142c;
                i17 = intValue;
                com.tencent.mm.ui.chatting.view.t2 t2Var = new com.tencent.mm.ui.chatting.view.t2(longValue6, bitmap, new jz5.l(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18)), matrix2, new jz5.l(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18)), matrix, f19, f19);
                arrayList = arrayList13;
                arrayList.add(t2Var);
            }
            arrayList13 = arrayList;
            f18 = f19;
            it11 = it;
            intValue = i17;
        }
        java.util.ArrayList arrayList19 = arrayList13;
        java.util.HashMap hashMap2 = new java.util.HashMap(linkedHashMap2.size());
        for (java.util.Map.Entry entry4 : linkedHashMap2.entrySet()) {
            java.lang.String str7 = (java.lang.String) entry4.getKey();
            android.view.View view7 = (android.view.View) entry4.getValue();
            kotlin.jvm.internal.o.g(str7, str4);
            java.util.List f012 = r26.n0.f0(str7, new java.lang.String[]{"||"}, false, 0, 6, null);
            if (f012.size() == 3 && (j19 = r26.h0.j((java.lang.String) f012.get(2))) != null) {
                longValue = j19.longValue();
                z17 = view7.getZ();
                f17 = (java.lang.Float) hashMap2.get(java.lang.Long.valueOf(longValue));
                if (f17 != null || z17 < f17.floatValue()) {
                    hashMap2.put(java.lang.Long.valueOf(longValue), java.lang.Float.valueOf(z17));
                }
            }
            longValue = 0;
            z17 = view7.getZ();
            f17 = (java.lang.Float) hashMap2.get(java.lang.Long.valueOf(longValue));
            if (f17 != null) {
            }
            hashMap2.put(java.lang.Long.valueOf(longValue), java.lang.Float.valueOf(z17));
        }
        java.util.Set keySet = hashMap2.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.util.List t07 = kz5.n0.t0(kz5.n0.t0(arrayList14, arrayList19), arrayList17);
        java.util.ArrayList arrayList20 = new java.util.ArrayList();
        java.util.ArrayList arrayList21 = new java.util.ArrayList();
        java.util.Iterator it12 = ((java.util.ArrayList) t07).iterator();
        while (it12.hasNext()) {
            java.lang.Object next3 = it12.next();
            if (keySet.contains(java.lang.Long.valueOf(((com.tencent.mm.ui.chatting.view.t2) next3).f203094a))) {
                arrayList20.add(next3);
            } else {
                arrayList21.add(next3);
            }
        }
        java.util.List t08 = kz5.n0.t0(kz5.n0.F0(arrayList21, new com.tencent.mm.ui.chatting.view.y1()), kz5.n0.F0(arrayList20, new com.tencent.mm.ui.chatting.view.w1(hashMap2)));
        if (!((java.util.ArrayList) t08).isEmpty()) {
            z2Var.g(recyclerView, e2Var.f202911h, t08, new com.tencent.mm.ui.chatting.view.z1(arrayList16, arrayList5, e2Var));
            return;
        }
        for (android.view.View view8 : linkedHashMap2.values()) {
            java.util.ArrayList arrayList22 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList22.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList22);
            yj0.a.d(view8, arrayList22.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view8.setAlpha(((java.lang.Float) arrayList22.get(0)).floatValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator", "startCollapseAnim", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/Map;Ljava/util/Map;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        e2Var.f202914k.clear();
        e2Var.f202915l.clear();
        e2Var.J();
    }
}
