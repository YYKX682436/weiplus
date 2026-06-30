package yt3;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465426d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f465427e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f465428f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f465429g;

    /* renamed from: h, reason: collision with root package name */
    public y9.i f465430h;

    /* renamed from: i, reason: collision with root package name */
    public int f465431i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f465432m;

    /* renamed from: n, reason: collision with root package name */
    public int f465433n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465434o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465435p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465436q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f465437r;

    public f0(android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465426d = parent;
        this.f465427e = "MicroMsg.EditMenuPlugin";
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.lot);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f465428f = imageView;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.lou);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f465429g = (android.widget.LinearLayout) findViewById2;
        this.f465432m = true;
        this.f465437r = new java.util.ArrayList();
        imageView.setVisibility(8);
        imageView.setOnClickListener(this);
    }

    public final java.lang.String a() {
        java.util.List list;
        java.util.List<java.lang.String> list2;
        java.util.List list3;
        java.util.List list4;
        this.f465437r.clear();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f465435p);
        java.util.List list5 = kz5.p0.f313996d;
        java.util.List<java.lang.String> list6 = null;
        if (K0) {
            list = null;
        } else {
            java.lang.String str = this.f465435p;
            kotlin.jvm.internal.o.d(str);
            java.util.List g17 = new r26.t(",").g(str, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        list4 = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list4 = list5;
            java.lang.String[] strArr = (java.lang.String[]) list4.toArray(new java.lang.String[0]);
            list = java.util.Arrays.asList(java.util.Arrays.copyOf(strArr, strArr.length));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f465434o)) {
            list2 = null;
        } else {
            java.lang.String str2 = this.f465434o;
            kotlin.jvm.internal.o.d(str2);
            java.util.List g18 = new r26.t(",").g(str2, 0);
            if (!g18.isEmpty()) {
                java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                while (listIterator2.hasPrevious()) {
                    if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                        list3 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
            }
            list3 = list5;
            java.lang.String[] strArr2 = (java.lang.String[]) list3.toArray(new java.lang.String[0]);
            list2 = java.util.Arrays.asList(java.util.Arrays.copyOf(strArr2, strArr2.length));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f465436q)) {
            java.lang.String str3 = this.f465436q;
            kotlin.jvm.internal.o.d(str3);
            java.util.List g19 = new r26.t(",").g(str3, 0);
            if (!g19.isEmpty()) {
                java.util.ListIterator listIterator3 = g19.listIterator(g19.size());
                while (true) {
                    if (!listIterator3.hasPrevious()) {
                        break;
                    }
                    if (!(((java.lang.String) listIterator3.previous()).length() == 0)) {
                        list5 = kz5.n0.K0(g19, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
            }
            java.lang.String[] strArr3 = (java.lang.String[]) list5.toArray(new java.lang.String[0]);
            list6 = java.util.Arrays.asList(java.util.Arrays.copyOf(strArr3, strArr3.length));
        }
        java.lang.String str4 = this.f465427e;
        if (list != null && list.size() > 0) {
            java.util.Iterator it = list.iterator();
            java.util.HashSet hashSet = new java.util.HashSet();
            while (it.hasNext()) {
                java.util.List j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e((java.lang.String) it.next()));
                if (j17 == null || j17.size() == 0) {
                    com.tencent.mars.xlog.Log.e(str4, "dz: getContactNamesFromLabelsAndOtherUserName,namelist get bu label is null");
                    break;
                }
                java.util.Iterator it6 = j17.iterator();
                while (it6.hasNext()) {
                    hashSet.add((java.lang.String) it6.next());
                }
            }
            this.f465437r = new java.util.ArrayList(hashSet);
        }
        if (list != null) {
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) it7.next());
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (java.lang.String str5 : list2) {
                if (!this.f465437r.contains(str5)) {
                    this.f465437r.add(str5);
                }
            }
        }
        if (list6 != null && !list6.isEmpty()) {
            for (java.lang.String str6 : list6) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List<java.lang.String> n17 = c01.v1.n(str6);
                if (n17 != null) {
                    ((java.util.LinkedList) n17).size();
                    for (java.lang.String str7 : n17) {
                        if (!this.f465437r.contains(str7) && c01.e2.J(str7)) {
                            com.tencent.mars.xlog.Log.i(str4, "getContactNamesFromChatroom memberName:%s", str7);
                            this.f465437r.add(str7);
                        }
                        if (c01.e2.J(str7)) {
                            arrayList.add(str7);
                        }
                    }
                    arrayList.size();
                }
            }
        }
        com.tencent.mars.xlog.Log.i(str4, "mergeSelectedRangeUser count:" + this.f465437r.size());
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.f465437r, ",");
        kotlin.jvm.internal.o.f(c17, "listToString(...)");
        return c17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if ((r1 == null || r1.length() == 0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            android.widget.LinearLayout r0 = r9.f465429g
            r0.removeAllViews()
            boolean r1 = r9.f465432m
            r2 = 2131165757(0x7f07023d, float:1.794574E38)
            r3 = -1
            r4 = 2131167822(0x7f070a4e, float:1.7949928E38)
            android.view.ViewGroup r5 = r9.f465426d
            if (r1 != 0) goto L4b
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r6 = r5.getContext()
            r1.<init>(r6)
            android.content.Context r6 = r5.getContext()
            r7 = 2131690952(0x7f0f05c8, float:1.9010962E38)
            android.graphics.drawable.Drawable r6 = com.tencent.mm.ui.uk.e(r6, r7, r3)
            r1.setImageDrawable(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r7 = r5.getContext()
            int r7 = i65.a.f(r7, r4)
            android.content.Context r8 = r5.getContext()
            int r8 = i65.a.f(r8, r4)
            r6.<init>(r7, r8)
            android.content.Context r7 = r5.getContext()
            int r7 = i65.a.f(r7, r2)
            r6.topMargin = r7
            r0.addView(r1, r6)
        L4b:
            java.lang.String r1 = r9.f465434o
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L5a
            int r1 = r1.length()
            if (r1 != 0) goto L58
            goto L5a
        L58:
            r1 = r6
            goto L5b
        L5a:
            r1 = r7
        L5b:
            if (r1 == 0) goto L7d
            java.lang.String r1 = r9.f465435p
            if (r1 == 0) goto L6a
            int r1 = r1.length()
            if (r1 != 0) goto L68
            goto L6a
        L68:
            r1 = r6
            goto L6b
        L6a:
            r1 = r7
        L6b:
            if (r1 == 0) goto L7d
            java.lang.String r1 = r9.f465436q
            if (r1 == 0) goto L7a
            int r1 = r1.length()
            if (r1 != 0) goto L78
            goto L7a
        L78:
            r1 = r6
            goto L7b
        L7a:
            r1 = r7
        L7b:
            if (r1 != 0) goto L7e
        L7d:
            r6 = r7
        L7e:
            if (r6 == 0) goto Lb9
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r6 = r5.getContext()
            r1.<init>(r6)
            android.content.Context r6 = r5.getContext()
            r7 = 2131690940(0x7f0f05bc, float:1.9010938E38)
            android.graphics.drawable.Drawable r3 = com.tencent.mm.ui.uk.e(r6, r7, r3)
            r1.setImageDrawable(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r6 = r5.getContext()
            int r6 = i65.a.f(r6, r4)
            android.content.Context r7 = r5.getContext()
            int r4 = i65.a.f(r7, r4)
            r3.<init>(r6, r4)
            android.content.Context r4 = r5.getContext()
            int r2 = i65.a.f(r4, r2)
            r3.topMargin = r2
            r0.addView(r1, r3)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.f0.b():void");
    }

    @Override // yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f465427e, "onActivityResult requestCode:" + i17 + " resultCode:" + i18);
        if (i17 == 3 && i18 == -1 && intent != null) {
            this.f465433n = intent.getIntExtra("Ktag_range_index", 0);
            this.f465435p = intent.getStringExtra("Klabel_name_list");
            this.f465434o = intent.getStringExtra("Kother_user_name_list");
            this.f465436q = intent.getStringExtra("Kchat_room_name_list");
            b();
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        wu3.f1 f1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        y9.i iVar = this.f465430h;
        if (iVar != null) {
            iVar.dismiss();
        }
        if (this.f465431i == 3) {
            android.content.Context context = this.f465426d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            f1Var = new wu3.f1(context);
            f1Var.f449742t = this.f465432m;
            f1Var.f449741s = new yt3.e0(this);
        } else {
            f1Var = null;
        }
        this.f465430h = f1Var;
        if (f1Var != null) {
            f1Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditMenuPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void release() {
        this.f465429g.removeAllViews();
        this.f465432m = true;
        this.f465433n = 0;
        this.f465434o = null;
        this.f465435p = null;
        this.f465436q = null;
    }

    @Override // yt3.r2
    public void reset() {
        this.f465429g.removeAllViews();
        this.f465432m = true;
        this.f465433n = 0;
        this.f465434o = null;
        this.f465435p = null;
        this.f465436q = null;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465428f.setVisibility(i17);
    }
}
