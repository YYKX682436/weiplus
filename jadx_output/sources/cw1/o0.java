package cw1;

/* loaded from: classes12.dex */
public final class o0 extends ql5.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223186d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f223187e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f223188f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f223189g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f223190h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[][] f223191i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List[] f223192j;

    public o0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f223186d = activity;
        java.lang.Integer[][] numArr = cw1.t2.f223333a;
        this.f223187e = new long[12];
        this.f223188f = new boolean[12];
        this.f223189g = new boolean[12];
        int i17 = 0;
        for (boolean z17 : cw1.t2.f223334b) {
            if (z17) {
                i17++;
            }
        }
        this.f223190h = new java.util.ArrayList(i17 + 12);
        java.lang.Integer[][] numArr2 = cw1.t2.f223333a;
        this.f223191i = new boolean[12];
        this.f223192j = new java.util.List[12];
        h(new long[21]);
    }

    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f223186d.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488612yl, viewGroup, false);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bxf);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.odf);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.mzv);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            view.setTag(new cw1.l0((android.widget.CheckBox) findViewById, (android.widget.TextView) findViewById2, (android.widget.TextView) findViewById3));
        }
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.ChildViewHolder");
        cw1.l0 l0Var = (cw1.l0) tag;
        java.lang.Object obj = this.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List list = this.f223192j[intValue];
        kotlin.jvm.internal.o.d(list);
        boolean[] zArr = this.f223191i[intValue];
        l0Var.f223095a.setChecked(zArr != null ? zArr[i18] : false);
        l0Var.f223096b.setText(((cw1.j) list.get(i18)).f223010b);
        l0Var.f223097c.setText(fp.n0.a(((cw1.j) list.get(i18)).f223011c));
        return view;
    }

    @Override // ql5.d
    public int c(int i17) {
        java.util.List list;
        java.lang.Object obj = this.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0 && (list = this.f223192j[intValue]) != null) {
            return list.size();
        }
        return 0;
    }

    public final void d(boolean z17) {
        kz5.v.v(this.f223188f, z17, 0, 0, 6, null);
        for (boolean[] zArr : this.f223191i) {
            if (zArr != null) {
                kz5.v.v(zArr, z17, 0, 0, 6, null);
            }
        }
        notifyDataSetChanged();
    }

    public final java.util.List e(int i17, boolean z17) {
        java.util.List list;
        boolean[] zArr = this.f223191i[i17];
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (zArr == null || (list = this.f223192j[i17]) == null) {
            return p0Var;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int length = zArr.length;
        for (int i18 = 0; i18 < length; i18++) {
            if (zArr[i18] == z17) {
                java.lang.Object obj = list.get(i18);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.ChildData<T of com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.getCheckedChildren>");
                arrayList.add((cw1.j) obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r8[r7] == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f() {
        /*
            r10 = this;
            long[] r0 = r10.f223187e
            int r0 = r0.length
            r1 = 0
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r0) goto L41
            boolean[] r5 = r10.f223188f
            boolean r5 = r5[r4]
            if (r5 == 0) goto L15
            long[] r5 = r10.f223187e
            r6 = r5[r4]
            long r1 = r1 + r6
            goto L3e
        L15:
            java.util.List[] r5 = r10.f223192j
            r5 = r5[r4]
            if (r5 != 0) goto L1c
            goto L3e
        L1c:
            int r6 = r5.size()
            r7 = r3
        L21:
            if (r7 >= r6) goto L3e
            boolean[][] r8 = r10.f223191i
            r8 = r8[r4]
            if (r8 == 0) goto L2f
            boolean r8 = r8[r7]
            r9 = 1
            if (r8 != r9) goto L2f
            goto L30
        L2f:
            r9 = r3
        L30:
            if (r9 == 0) goto L3b
            java.lang.Object r8 = r5.get(r7)
            cw1.j r8 = (cw1.j) r8
            long r8 = r8.f223011c
            long r1 = r1 + r8
        L3b:
            int r7 = r7 + 1
            goto L21
        L3e:
            int r4 = r4 + 1
            goto L7
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cw1.o0.f():long");
    }

    public final void g(int i17, java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f223192j[i17] = data;
        boolean z17 = this.f223188f[i17];
        int size = data.size();
        boolean[] zArr = new boolean[size];
        for (int i18 = 0; i18 < size; i18++) {
            zArr[i18] = z17;
        }
        this.f223191i[i17] = zArr;
        boolean[] zArr2 = this.f223189g;
        if (zArr2[i17]) {
            java.util.Iterator it = this.f223190h.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                } else if (((java.lang.Number) it.next()).intValue() == i17) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 >= 0) {
                com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = this.f223186d.f95689d;
                kotlin.jvm.internal.o.d(animatedExpandableListView);
                animatedExpandableListView.d(i19);
            }
            zArr2[i17] = false;
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getChild(int i17, int i18) {
        java.lang.Object obj = this.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.util.List list = this.f223192j[((java.lang.Number) obj).intValue()];
        kotlin.jvm.internal.o.d(list);
        return list.get(i18);
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(">>> getChildId: ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        java.util.ArrayList arrayList = this.f223190h;
        sb6.append(arrayList);
        sb6.append(", ");
        java.util.List[] listArr = this.f223192j;
        sb6.append(listArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCacheUI", sb6.toString());
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.util.List list = listArr[((java.lang.Number) obj).intValue()];
        kotlin.jvm.internal.o.d(list);
        return ((cw1.j) list.get(i18)).f223009a;
    }

    @Override // android.widget.ExpandableListAdapter
    public java.lang.Object getGroup(int i17) {
        java.lang.Object obj = this.f223190h.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        return java.lang.Long.valueOf(this.f223187e[intValue]);
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        return this.f223190h.size();
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i17) {
        return ((java.lang.Number) this.f223190h.get(i17)).intValue();
    }

    @Override // android.widget.ExpandableListAdapter
    public android.view.View getGroupView(int i17, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI;
        android.view.View view2;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI2 = this.f223186d;
        if (view == null) {
            view2 = cleanCacheUI2.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488613ym, viewGroup, false);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.bxj);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.bxi);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.bxf);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.odf);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.cut);
            kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
            android.view.View findViewById6 = view2.findViewById(com.tencent.mm.R.id.mzv);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            android.view.View findViewById7 = view2.findViewById(com.tencent.mm.R.id.dka);
            kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
            android.view.View findViewById8 = view2.findViewById(com.tencent.mm.R.id.dk9);
            kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
            android.view.View findViewById9 = view2.findViewById(com.tencent.mm.R.id.dk_);
            kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
            cleanCacheUI = cleanCacheUI2;
            view2.setTag(new cw1.m0(findViewById, findViewById2, (android.widget.CheckBox) findViewById3, (android.widget.TextView) findViewById4, (android.widget.TextView) findViewById5, (android.widget.TextView) findViewById6, (android.widget.TextView) findViewById7, (android.widget.ImageView) findViewById8, findViewById9));
        } else {
            cleanCacheUI = cleanCacheUI2;
            view2 = view;
        }
        java.lang.Object tag = view2.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheAdapter.GroupViewHolder");
        cw1.m0 m0Var = (cw1.m0) tag;
        java.util.ArrayList arrayList = this.f223190h;
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            android.view.View view3 = m0Var.f223128b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = m0Var.f223127a;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = m0Var.f223134h;
            imageView.setVisibility(0);
            android.view.View view5 = m0Var.f223135i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i18 = i17 - 1;
            java.lang.Object obj2 = arrayList.get(i18);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            int intValue2 = ((java.lang.Number) obj2).intValue();
            com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = cleanCacheUI.f95689d;
            kotlin.jvm.internal.o.d(animatedExpandableListView);
            boolean isGroupExpanded = animatedExpandableListView.isGroupExpanded(i18);
            android.widget.TextView textView = m0Var.f223133g;
            if (isGroupExpanded) {
                textView.setText(com.tencent.mm.R.string.b7u);
                imageView.setRotation(270.0f);
            } else {
                textView.setText(com.tencent.mm.R.string.b7v);
                imageView.setRotation(90.0f);
                if (this.f223189g[intValue2]) {
                    imageView.setVisibility(8);
                    android.view.View view6 = m0Var.f223135i;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI3 = cleanCacheUI;
            android.view.View view7 = m0Var.f223127a;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = m0Var.f223128b;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheAdapter", "getGroupView", "(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0Var.f223129c.setChecked(this.f223188f[intValue]);
            m0Var.f223130d.setText(cleanCacheUI3.getResources().getStringArray(com.tencent.mm.R.array.f477975e)[intValue]);
            m0Var.f223132f.setText(fp.n0.a(this.f223187e[intValue]));
            java.lang.String str = cleanCacheUI3.getResources().getStringArray(com.tencent.mm.R.array.f477976b5)[intValue];
            android.widget.TextView textView2 = m0Var.f223131e;
            if (str != null) {
                if (!(str.length() == 0)) {
                    textView2.setVisibility(0);
                    textView2.setText(str);
                }
            }
            textView2.setVisibility(8);
        }
        return view2;
    }

    public final void h(long[] tagsResult) {
        kotlin.jvm.internal.o.g(tagsResult, "tagsResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCacheUI", "setGroupData: " + tagsResult);
        java.lang.Integer[][] numArr = cw1.t2.f223333a;
        long[] jArr = new long[12];
        int i17 = 0;
        while (true) {
            long j17 = 0;
            if (i17 >= 12) {
                break;
            }
            for (java.lang.Integer num : cw1.t2.f223333a[i17]) {
                j17 += tagsResult[num.intValue()];
            }
            jArr[i17] = j17;
            i17++;
        }
        this.f223187e = jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        int length = jArr.length;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(jArr[i18])));
            i18++;
            i19++;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.f223187e.length);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) ((jz5.l) next).f302834e).longValue() > 0) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            kz5.g0.t(arrayList2, new cw1.n0());
        }
        java.util.ArrayList arrayList3 = this.f223190h;
        arrayList3.clear();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) ((jz5.l) it6.next()).f302833d).intValue();
            arrayList3.add(java.lang.Integer.valueOf(intValue));
            if (cw1.t2.f223334b[intValue]) {
                arrayList3.add(-1);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i17, int i18) {
        return true;
    }
}
