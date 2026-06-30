package cw1;

/* loaded from: classes12.dex */
public class j3 extends android.widget.BaseAdapter implements com.tencent.mm.ui.gridviewheaders.t {

    /* renamed from: t, reason: collision with root package name */
    public static int f223021t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f223022u = {"application/msword", "application/pdf", "application/vnd.ms-excel", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f223023v = {com.tencent.mm.R.color.f12if, com.tencent.mm.R.color.f478830ig, com.tencent.mm.R.color.f478834ij, com.tencent.mm.R.color.f478831ih, com.tencent.mm.R.color.f478831ih, com.tencent.mm.R.color.f478834ij, com.tencent.mm.R.color.f12if};

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI f223025e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f223027g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f223028h;

    /* renamed from: i, reason: collision with root package name */
    public final long f223029i;

    /* renamed from: m, reason: collision with root package name */
    public final long f223030m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f223031n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f223032o = false;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.gridviewheaders.m f223033p = new cw1.j3$$a(this);

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f223034q = new cw1.k3(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f223035r = new cw1.l3(this);

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f223036s = new cw1.m3(this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f223024d = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f223026f = new java.util.ArrayList();

    public j3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI, java.lang.String str, int[] iArr, long j17, long j18) {
        this.f223025e = cleanChattingDetailOldUI;
        this.f223027g = str;
        this.f223028h = iArr;
        this.f223029i = j17;
        this.f223030m = j18;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bw1.l getItem(int i17) {
        return (bw1.l) this.f223026f.get(i17);
    }

    public final void c() {
        java.util.HashSet hashSet = this.f223024d;
        int size = hashSet.size();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = this.f223025e;
        cleanChattingDetailOldUI.getClass();
        cleanChattingDetailOldUI.f95728g.setEnabled(size > 0);
        boolean isEmpty = hashSet.isEmpty();
        java.util.ArrayList arrayList = this.f223026f;
        cleanChattingDetailOldUI.f95726e.setText(!isEmpty && hashSet.size() == arrayList.size() ? com.tencent.mm.R.string.aq8 : com.tencent.mm.R.string.f489994hu);
        java.util.Iterator it = hashSet.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += ((bw1.l) arrayList.get(((java.lang.Integer) it.next()).intValue())).f24809a;
        }
        if (j17 > 0) {
            cleanChattingDetailOldUI.f95727f.setText(cleanChattingDetailOldUI.getString(com.tencent.mm.R.string.bom, fp.n0.a(j17)));
        } else {
            cleanChattingDetailOldUI.f95727f.setText("");
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f223026f.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        cw1.p3 p3Var;
        android.view.View view2;
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailOldUI cleanChattingDetailOldUI = this.f223025e;
        if (view == null) {
            view2 = cleanChattingDetailOldUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488619j8, viewGroup, false);
            p3Var = new cw1.p3();
            p3Var.f223216a = (com.tencent.mm.ui.MMImageView) view2.findViewById(com.tencent.mm.R.id.chd);
            p3Var.f223219d = (android.widget.CheckBox) view2.findViewById(com.tencent.mm.R.id.mie);
            p3Var.f223220e = view2.findViewById(com.tencent.mm.R.id.mig);
            p3Var.f223221f = view2.findViewById(com.tencent.mm.R.id.mkj);
            p3Var.f223222g = view2.findViewById(com.tencent.mm.R.id.f486571lp1);
            p3Var.f223217b = view2.findViewById(com.tencent.mm.R.id.oro);
            p3Var.f223218c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ors);
            p3Var.f223223h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.oru);
            p3Var.f223224i = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k3s);
            p3Var.f223225j = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f482922rw);
            view2.setTag(p3Var);
        } else {
            p3Var = (cw1.p3) view.getTag();
            view2 = view;
        }
        bw1.l item = getItem(i17);
        boolean z17 = (p3Var.f223216a.getTag() == null || java.lang.String.valueOf(p3Var.f223216a.getTag()).equals(item.f24812d)) ? false : true;
        p3Var.f223216a.setTag(item.f24812d);
        n11.a.b().a(null, p3Var.f223216a);
        p3Var.f223220e.setOnClickListener(new android.view.View.OnClickListener() { // from class: cw1.j3$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view3) {
                cw1.j3 j3Var = cw1.j3.this;
                j3Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i18 = i17;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(view3);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", j3Var, array);
                com.tencent.mars.xlog.Log.i("MicroMsg.CleanChattingDetailAdapter", "select position=%d", java.lang.Integer.valueOf(i18));
                java.util.HashSet hashSet = j3Var.f223024d;
                if (!hashSet.remove(java.lang.Integer.valueOf(i18))) {
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
                j3Var.c();
                j3Var.notifyDataSetChanged();
                yj0.a.h(j3Var, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (this.f223024d.contains(java.lang.Integer.valueOf(i17))) {
            p3Var.f223219d.setChecked(true);
            android.view.View view3 = p3Var.f223221f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            p3Var.f223219d.setChecked(false);
            android.view.View view4 = p3Var.f223221f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3Var.f223216a.setVisibility(0);
        p3Var.f223225j.setVisibility(8);
        if (item.f24810b == 3) {
            android.view.View view5 = p3Var.f223217b;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = p3Var.f223218c;
            int i18 = item.f24819k;
            textView.setText(i18 >= 0 ? com.tencent.mm.sdk.platformtools.t8.u(i18) : "");
        } else {
            android.view.View view6 = p3Var.f223217b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i19 = item.f24810b;
        if (i19 == 4) {
            p3Var.f223223h.setText(com.tencent.mm.R.string.f490903b82);
            p3Var.f223223h.setVisibility(0);
            java.lang.String str = item.f24812d;
            if (str != null) {
                android.widget.TextView textView2 = p3Var.f223224i;
                java.lang.String str2 = item.f24817i;
                if (str2 == null) {
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
                    java.lang.String str3 = a17.f213279f;
                    if (str3 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                        if (!str3.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    java.lang.String str4 = a17.f213279f;
                    int lastIndexOf = str4.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str4 = str4.substring(lastIndexOf + 1);
                    }
                    str2 = str4;
                }
                textView2.setText(str2);
                p3Var.f223224i.setVisibility(0);
                java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(com.tencent.mm.vfs.w6.n(item.f24812d));
                int binarySearch = mimeTypeFromExtension == null ? -1 : java.util.Arrays.binarySearch(f223022u, mimeTypeFromExtension);
                p3Var.f223216a.setImageDrawable(new android.graphics.drawable.ColorDrawable(cleanChattingDetailOldUI.getResources().getColor(binarySearch >= 0 ? f223023v[binarySearch] : com.tencent.mm.R.color.f478833ii)));
            }
            android.view.View view7 = p3Var.f223222g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i19 == 5 || i19 == 6) {
            p3Var.f223223h.setText(i19 == 5 ? com.tencent.mm.R.string.f490905b84 : com.tencent.mm.R.string.f490904b83);
            android.widget.TextView textView3 = p3Var.f223224i;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = p3Var.f223224i.getContext();
            java.lang.String str5 = item.f24817i;
            float textSize = p3Var.f223224i.getTextSize();
            ((ke0.e) xVar).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str5, textSize));
            p3Var.f223223h.setVisibility(0);
            p3Var.f223224i.setVisibility(0);
            android.view.View view8 = p3Var.f223222g;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o11.f fVar = new o11.f();
            fVar.f342085i = 1;
            fVar.f342080d = false;
            int i27 = f223021t;
            fVar.f342087k = i27;
            fVar.f342086j = i27;
            fVar.f342082f = item.f24812d;
            if (p3Var.f223216a.getDrawable() == null || z17) {
                fVar.f342095s = false;
                n11.a.b().h(item.f24812d, p3Var.f223216a, fVar.a());
            }
        } else {
            if (f223021t == 0) {
                f223021t = view2.getMeasuredWidth();
            }
            o11.f fVar2 = new o11.f();
            fVar2.f342085i = 1;
            fVar2.f342080d = false;
            int i28 = f223021t;
            fVar2.f342087k = i28;
            fVar2.f342086j = i28;
            if (item.f24810b == 1) {
                fVar2.f342082f = item.f24812d;
                o11.g a18 = fVar2.a();
                if (p3Var.f223216a.getDrawable() == null || z17) {
                    fVar2.f342095s = false;
                    n11.a.b().h(item.f24812d, p3Var.f223216a, a18);
                }
            } else if (item.f24816h == 486539313) {
                fVar2.f342082f = tv.a.b(item.f24811c);
                fVar2.f342085i = 5;
                n11.a.b().h(item.f24811c, p3Var.f223216a, fVar2.a());
            } else {
                fVar2.f342082f = item.f24811c;
                o11.g a19 = fVar2.a();
                if (p3Var.f223216a.getDrawable() == null || z17) {
                    fVar2.f342095s = false;
                    n11.a.b().h(item.f24811c, p3Var.f223216a, a19);
                }
            }
            p3Var.f223223h.setVisibility(8);
            p3Var.f223224i.setVisibility(8);
            android.view.View view9 = p3Var.f223222g;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.System.currentTimeMillis();
        return view2;
    }
}
