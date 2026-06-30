package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class h0 extends android.widget.BaseAdapter implements com.tencent.mm.ui.base.preference.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.base.preference.o0 f197805d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.SharedPreferences f197812n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f197813o;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.ListView f197819u;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.q0 f197822x;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f197806e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f197807f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f197808g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f197809h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f197810i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f197811m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f197814p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f197815q = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int[] f197816r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public boolean f197817s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f197818t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197820v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f197821w = true;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f197823y = new com.tencent.mm.ui.base.preference.e0(this, android.os.Looper.getMainLooper());

    /* renamed from: z, reason: collision with root package name */
    public long f197824z = 0;
    public long A = 0;

    public h0(android.content.Context context, android.widget.ListView listView, android.content.SharedPreferences sharedPreferences) {
        this.f197805d = new com.tencent.mm.ui.base.preference.o0(context);
        this.f197813o = context;
        this.f197819u = listView;
        this.f197812n = sharedPreferences;
    }

    public static java.lang.String k(com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        if (str != null && str.length() > 0) {
            return preference.f197780q;
        }
        return "_anonymous_pref@" + preference.hashCode();
    }

    public static java.lang.String l(com.tencent.mm.ui.base.preference.Preference preference) {
        return preference.getClass().getName() + "L" + preference.k() + androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST + preference.H;
    }

    public static boolean p(int i17) {
        return i17 == com.tencent.mm.R.layout.byv || i17 == com.tencent.mm.R.layout.f489295c11 || i17 == com.tencent.mm.R.layout.f489297c13 || i17 == com.tencent.mm.R.layout.b3d;
    }

    public static void s(com.tencent.mm.ui.base.preference.Preference preference, android.content.SharedPreferences sharedPreferences) {
        if (preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
            if (checkBoxPreference.f197785v) {
                checkBoxPreference.O(sharedPreferences.getBoolean(preference.f197780q, ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()));
            }
        }
        if (preference instanceof com.tencent.mm.ui.base.preference.DialogPreference) {
            com.tencent.mm.ui.base.preference.DialogPreference dialogPreference = (com.tencent.mm.ui.base.preference.DialogPreference) preference;
            if (dialogPreference.f197785v) {
                java.lang.String string = sharedPreferences.getString(preference.f197780q, null);
                com.tencent.mm.ui.base.preference.i iVar = dialogPreference.L;
                iVar.f197829h = string;
            }
        }
        if (preference instanceof com.tencent.mm.ui.base.preference.EditPreference) {
            com.tencent.mm.ui.base.preference.EditPreference editPreference = (com.tencent.mm.ui.base.preference.EditPreference) preference;
            if (editPreference.f197785v) {
                java.lang.String string2 = sharedPreferences.getString(preference.f197780q, null);
                editPreference.P = string2;
                editPreference.H(string2);
            }
        }
    }

    public void a(com.tencent.mm.ui.base.preference.g0 g0Var) {
        java.util.List list = this.f197814p;
        if (((java.util.LinkedList) list).contains(g0Var)) {
            return;
        }
        ((java.util.LinkedList) list).add(g0Var);
    }

    public void c(android.widget.AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f197815q;
        if (copyOnWriteArrayList.size() == 0) {
            this.f197819u.setOnScrollListener(new com.tencent.mm.ui.base.preference.f0(this));
        }
        if (copyOnWriteArrayList.contains(onScrollListener)) {
            return;
        }
        copyOnWriteArrayList.add(onScrollListener);
    }

    public void d(com.tencent.mm.ui.base.preference.Preference preference, int i17) {
        f(preference, i17);
        if (this.f197817s) {
            return;
        }
        notifyDataSetChanged();
    }

    public final void f(com.tencent.mm.ui.base.preference.Preference preference, int i17) {
        java.lang.String k17 = k(preference);
        this.f197807f.put(k17, preference);
        java.util.LinkedList linkedList = this.f197806e;
        if (i17 == -1) {
            i17 = linkedList.size();
        }
        linkedList.add(i17, k17);
        java.util.HashMap hashMap = this.f197810i;
        if (!hashMap.containsKey(l(preference)) && this.f197817s) {
            hashMap.put(l(preference), java.lang.Integer.valueOf(hashMap.size()));
        }
        java.lang.String str = preference.f197786w;
        if (str != null) {
            this.f197811m.put(str + "|" + preference.f197780q, preference.f197780q);
        }
    }

    public void g(int i17) {
        this.f197817s = true;
        com.tencent.mm.ui.base.preference.o0 o0Var = this.f197805d;
        o0Var.getClass();
        android.content.res.XmlResourceParser xml = o0Var.f197850a.getResources().getXml(i17);
        try {
            o0Var.c(xml, this, true);
            xml.close();
            this.f197817s = false;
            android.widget.ListView listView = this.f197819u;
            if (listView == null) {
                notifyDataSetChanged();
            } else {
                listView.setAdapter((android.widget.ListAdapter) this);
                notifyDataSetChanged();
            }
        } catch (java.lang.Throwable th6) {
            xml.close();
            throw th6;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f197809h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f197807f.get(this.f197809h.get(i17));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f197809h;
        if (i17 > linkedList.size() - 1) {
            return -1;
        }
        java.lang.Integer num = (java.lang.Integer) this.f197810i.get(l((com.tencent.mm.ui.base.preference.Preference) this.f197807f.get(linkedList.get(i17))));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        android.view.ViewGroup viewGroup2;
        java.util.LinkedList linkedList = this.f197809h;
        if (i17 > linkedList.size()) {
            return view;
        }
        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) this.f197807f.get(linkedList.get(i17));
        if (preference instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
            preference.D(this.f197822x);
        }
        if (this.f197810i.containsKey(l(preference))) {
            view2 = view;
            viewGroup2 = viewGroup;
        } else {
            viewGroup2 = viewGroup;
            view2 = null;
        }
        android.view.View p17 = preference.p(view2, viewGroup2);
        p17.setTag(com.tencent.mm.R.id.pgt, linkedList.get(i17));
        int i18 = this.f197816r[i17];
        android.view.View findViewById = p17.findViewById(com.tencent.mm.R.id.cgi);
        android.view.View findViewById2 = p17.findViewById(com.tencent.mm.R.id.ofy);
        if (findViewById != null) {
            android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.cg7);
            if (findViewById3 == null) {
                findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.oct);
            }
            findViewById.getPaddingLeft();
            findViewById.getPaddingRight();
            findViewById.getPaddingTop();
            findViewById.getPaddingBottom();
            int paddingLeft = p17.getPaddingLeft();
            int paddingRight = p17.getPaddingRight();
            int paddingTop = p17.getPaddingTop();
            int paddingBottom = p17.getPaddingBottom();
            int i19 = i18 & 2;
            android.content.Context context = this.f197813o;
            if (i19 != 0) {
                int paddingLeft2 = findViewById.getPaddingLeft();
                if (this.f197821w) {
                    findViewById.setBackground(com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478322gp));
                }
                findViewById.setPadding(paddingLeft2, 0, 0, 0);
                if (findViewById3 != null && findViewById3.getBackground() != null) {
                    findViewById3.setBackground(null);
                }
            } else if (findViewById3 != null) {
                int paddingTop2 = findViewById3.getPaddingTop();
                int paddingBottom2 = findViewById3.getPaddingBottom();
                findViewById3.setBackground(com.tencent.mm.ui.zk.d(context, com.tencent.mm.R.attr.f478322gp));
                findViewById3.setPadding(0, paddingTop2, 0, paddingBottom2);
                if (findViewById.getBackground() != null) {
                    findViewById.setBackground(null);
                }
            }
            p17.setBackgroundResource(com.tencent.mm.R.drawable.azm);
            p17.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
        if (findViewById2 != null) {
            if ((i18 & 1) == 0 || !this.f197820v) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/ui/base/preference/MMPreferenceAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        java.util.Iterator it = this.f197814p.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.ui.base.preference.g0) it.next()).a(p17, preference);
        }
        return p17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        if (!this.f197818t) {
            this.f197818t = true;
        }
        return java.lang.Math.max(1, this.f197810i.size());
    }

    public com.tencent.mm.ui.base.preference.Preference h(java.lang.String str) {
        return (com.tencent.mm.ui.base.preference.Preference) this.f197807f.get(str);
    }

    public java.util.List j() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f197807f.values());
        java.util.Collections.sort(arrayList, new com.tencent.mm.ui.base.preference.d0(this));
        return arrayList;
    }

    public com.tencent.mm.ui.base.preference.CheckBoxPreference m(java.lang.String str, boolean z17) {
        java.util.HashSet hashSet = this.f197808g;
        if (z17) {
            if (hashSet.contains(str)) {
                return null;
            }
            hashSet.add(str);
        } else if (!hashSet.remove(str)) {
            return null;
        }
        notifyDataSetChanged();
        return null;
    }

    public int n(java.lang.String str) {
        return this.f197806e.indexOf(str);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        if (com.tencent.mm.ui.bk.y()) {
            if (j62.e.g().i("clicfg_hwmagic_mmpreference_notify_switch", 1, true, true) == 1) {
                hashCode();
                java.lang.System.currentTimeMillis();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = this.A;
                if (j17 == 0 || currentTimeMillis - j17 <= 5000 || currentTimeMillis - this.f197824z >= 1000) {
                    r();
                    this.f197824z = currentTimeMillis;
                    return;
                }
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f197823y;
                boolean hasMessages = n3Var.hasMessages(1);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMPreferenceAdapter", "ignore notifyDataSetChanged(%s %s), had:%s", java.lang.Long.valueOf(this.f197824z), java.lang.Long.valueOf(currentTimeMillis), java.lang.Boolean.valueOf(hasMessages));
                if (hasMessages) {
                    return;
                }
                n3Var.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
        }
        r();
    }

    public int o(java.lang.String str) {
        java.util.LinkedList linkedList = this.f197809h;
        if (linkedList == null) {
            return -1;
        }
        return linkedList.indexOf(str);
    }

    public boolean q(java.lang.String str) {
        return !this.f197808g.contains(str);
    }

    public final void r() {
        java.util.HashMap hashMap;
        java.util.LinkedList linkedList = this.f197809h;
        linkedList.clear();
        java.util.Iterator it = this.f197806e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f197807f;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f197808g.contains(str)) {
                if (hashMap.get(str) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMPreferenceAdapter", "not found pref by key " + str);
                } else {
                    linkedList.add(str);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            ((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(0))).k();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i17));
            if ((preference instanceof com.tencent.mm.ui.base.preference.PreferenceCategory) && com.tencent.mm.sdk.platformtools.t8.K0(preference.f197780q) && i17 != 0) {
                com.tencent.mm.ui.base.preference.Preference preference2 = (com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i17 - 1));
                if (preference2 instanceof com.tencent.mm.ui.base.preference.PreferenceCategory) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(preference2.f197780q) && (preference2.o() == null || preference2.o().toString().trim().length() <= 0)) {
                        hashSet.add(k(preference2));
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(preference.f197780q) && (preference.o() == null || preference.o().toString().trim().length() <= 0)) {
                        hashSet.add(k(preference));
                    }
                }
            }
        }
        linkedList.removeAll(hashSet);
        int[] iArr = new int[linkedList.size()];
        this.f197816r = iArr;
        if (iArr.length <= 0) {
            super.notifyDataSetChanged();
            return;
        }
        int length = iArr.length;
        android.content.SharedPreferences sharedPreferences = this.f197812n;
        if (length == 1) {
            int k17 = ((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(0))).k();
            com.tencent.mm.ui.base.preference.Preference preference3 = (com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(0));
            if (!p(k17)) {
                this.f197816r[0] = 4;
            } else if (preference3 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
                int[] iArr2 = this.f197816r;
                int i18 = iArr2[0] | 8;
                iArr2[0] = i18;
                iArr2[0] = i18 | 1;
            } else {
                this.f197816r[0] = 3;
            }
            s((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(0)), sharedPreferences);
            super.notifyDataSetChanged();
            return;
        }
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            s((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i19)), sharedPreferences);
            com.tencent.mm.ui.base.preference.Preference preference4 = (com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i19));
            int k18 = preference4.k();
            if (p(k18)) {
                if (preference4 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference) {
                    int[] iArr3 = this.f197816r;
                    iArr3[i19] = iArr3[i19] | 8;
                }
                if (i19 == 0) {
                    int[] iArr4 = this.f197816r;
                    int i27 = iArr4[i19] | 1;
                    iArr4[i19] = i27;
                    iArr4[i19] = i27 | 16;
                } else {
                    if (i19 == linkedList.size() - 1) {
                        int[] iArr5 = this.f197816r;
                        iArr5[i19] = iArr5[i19] | 2;
                    }
                    int k19 = ((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i19 - 1))).k();
                    if ((k19 != com.tencent.mm.R.layout.byv && k19 != com.tencent.mm.R.layout.b3d && k19 != com.tencent.mm.R.layout.a2l) || k19 == com.tencent.mm.R.layout.f489295c11 || k19 == com.tencent.mm.R.layout.f489297c13) {
                        int[] iArr6 = this.f197816r;
                        iArr6[i19] = iArr6[i19] | 1;
                    }
                }
            } else if (k18 != com.tencent.mm.R.layout.c0d) {
                int[] iArr7 = this.f197816r;
                int i28 = iArr7[i19] | 4;
                iArr7[i19] = i28;
                if (i19 == 0) {
                    iArr7[i19] = i28 | 16;
                } else {
                    int i29 = i19 - 1;
                    int k27 = ((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i29))).k();
                    if (p(k27) || k27 == com.tencent.mm.R.layout.c0d) {
                        int[] iArr8 = this.f197816r;
                        iArr8[i29] = iArr8[i29] | 2;
                    }
                }
            } else if (i19 == 0) {
                int[] iArr9 = this.f197816r;
                int i37 = iArr9[i19] | 4;
                iArr9[i19] = i37;
                iArr9[i19] = i37 | 16;
            } else {
                int i38 = i19 - 1;
                int k28 = ((com.tencent.mm.ui.base.preference.Preference) hashMap.get(linkedList.get(i38))).k();
                if (k28 == com.tencent.mm.R.layout.byv || k28 == com.tencent.mm.R.layout.f489295c11 || k28 == com.tencent.mm.R.layout.f489297c13) {
                    int[] iArr10 = this.f197816r;
                    iArr10[i38] = iArr10[i38] | 2;
                }
            }
        }
        super.notifyDataSetChanged();
    }

    public void t() {
        this.f197809h.clear();
        this.f197807f.clear();
        this.f197806e.clear();
        this.f197808g.clear();
        notifyDataSetChanged();
    }

    public void u(android.widget.AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null) {
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f197815q;
        copyOnWriteArrayList.remove(onScrollListener);
        if (copyOnWriteArrayList.size() == 0) {
            this.f197819u.setOnScrollListener(null);
        }
    }

    public boolean v(com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference == null) {
            return false;
        }
        java.lang.String k17 = k(preference);
        this.f197806e.remove(k17);
        this.f197807f.remove(k17);
        this.f197808g.remove(preference.f197780q);
        notifyDataSetChanged();
        return true;
    }

    public boolean w(java.lang.String str) {
        return v(h(str));
    }
}
