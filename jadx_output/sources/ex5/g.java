package ex5;

/* loaded from: classes7.dex */
public class g extends android.widget.BaseAdapter implements ex5.b {

    /* renamed from: d, reason: collision with root package name */
    public final ex5.h f257251d;

    /* renamed from: n, reason: collision with root package name */
    public final android.content.SharedPreferences f257258n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f257259o;

    /* renamed from: s, reason: collision with root package name */
    public android.preference.Preference.OnPreferenceChangeListener f257263s;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f257252e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f257253f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f257254g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f257255h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f257256i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f257257m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public int[] f257260p = new int[0];

    /* renamed from: q, reason: collision with root package name */
    public boolean f257261q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257262r = false;

    public g(android.content.Context context, android.content.SharedPreferences sharedPreferences) {
        this.f257251d = new ex5.h(context);
        this.f257259o = context;
        this.f257258n = sharedPreferences;
    }

    public static java.lang.String d(android.preference.Preference preference) {
        return preference.getClass().getName() + "L" + preference.getLayoutResource() + androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST + preference.getWidgetLayoutResource();
    }

    public static boolean f(int i17) {
        return i17 == com.tencent.mm.R.layout.byv || i17 == com.tencent.mm.R.layout.f489295c11 || i17 == com.tencent.mm.R.layout.f489297c13;
    }

    public static void g(android.preference.Preference preference, android.content.SharedPreferences sharedPreferences) {
        if (preference instanceof com.tencent.weui.base.preference.CheckBoxPreference) {
            com.tencent.weui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.weui.base.preference.CheckBoxPreference) preference;
            if (checkBoxPreference.isPersistent()) {
                checkBoxPreference.f220100d = sharedPreferences.getBoolean(preference.getKey(), ((com.tencent.weui.base.preference.CheckBoxPreference) preference).h());
            }
        }
    }

    public final void a(android.preference.Preference preference, int i17) {
        java.lang.String str;
        if (preference.getKey() == null || preference.getKey().length() <= 0) {
            str = "_anonymous_pref@" + preference.hashCode();
        } else {
            str = preference.getKey();
        }
        this.f257253f.put(str, preference);
        java.util.LinkedList linkedList = this.f257252e;
        if (i17 == -1) {
            i17 = linkedList.size();
        }
        linkedList.add(i17, str);
        java.util.HashMap hashMap = this.f257256i;
        if (!hashMap.containsKey(d(preference)) && !this.f257262r) {
            hashMap.put(d(preference), java.lang.Integer.valueOf(hashMap.size()));
        }
        if (preference.getDependency() != null) {
            this.f257257m.put(preference.getDependency() + "|" + preference.getKey(), preference.getKey());
        }
    }

    public android.preference.Preference c(java.lang.String str) {
        return (android.preference.Preference) this.f257253f.get(str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f257255h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f257253f.get(this.f257255h.get(i17));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.LinkedList linkedList = this.f257255h;
        if (i17 > linkedList.size()) {
            return -1;
        }
        java.lang.Integer num = (java.lang.Integer) this.f257256i.get(d((android.preference.Preference) this.f257253f.get(linkedList.get(i17))));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        java.util.LinkedList linkedList = this.f257255h;
        if (i17 > linkedList.size()) {
            return view;
        }
        android.preference.Preference preference = (android.preference.Preference) this.f257253f.get(linkedList.get(i17));
        if (preference instanceof com.tencent.weui.base.preference.CheckBoxPreference) {
            preference.setOnPreferenceChangeListener(this.f257263s);
        }
        android.view.View view2 = preference.getView(!this.f257256i.containsKey(d(preference)) ? null : view, viewGroup);
        int i19 = this.f257260p[i17];
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.cgi);
        int i27 = 0;
        if (findViewById == null) {
            com.tencent.mm.ui.yk.a("MicroMsg.WeUIPreferenceAdapter", "find content view error", new java.lang.Object[0]);
            return view2;
        }
        android.view.View findViewById2 = view2.findViewById(android.R.id.widget_frame);
        if ((i19 & 4) == 0) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingRight = findViewById.getPaddingRight();
            int paddingTop = findViewById.getPaddingTop();
            int paddingBottom = findViewById.getPaddingBottom();
            int paddingLeft2 = view2.getPaddingLeft();
            int paddingRight2 = view2.getPaddingRight();
            int paddingTop2 = view2.getPaddingTop();
            int paddingBottom2 = view2.getPaddingBottom();
            if ((i19 & 8) != 0) {
                i27 = (i17 == linkedList.size() + (-1) || (i17 == linkedList.size() + (-2) && (getItem(linkedList.size() + (-1)) instanceof com.tencent.weui.base.preference.PreferenceCategory)) || (i19 & 2) != 0) ? com.tencent.mm.R.drawable.f481981ap3 : com.tencent.mm.R.drawable.bfj;
                i18 = com.tencent.mm.R.color.aaw;
            } else if ((i19 & 16) == 0 && (i19 & 2) != 0) {
                i18 = com.tencent.mm.R.drawable.azm;
            } else {
                i18 = com.tencent.mm.R.drawable.azm;
                i27 = com.tencent.mm.R.drawable.bfj;
            }
            findViewById.setBackgroundResource(i27);
            findViewById.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(i27);
            }
            view2.setBackgroundResource(i18);
            view2.setPadding(paddingLeft2, paddingTop2, paddingRight2, paddingBottom2);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        if (!this.f257262r) {
            this.f257262r = true;
        }
        return java.lang.Math.max(1, this.f257256i.size());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        java.util.HashMap hashMap;
        int i17;
        java.util.LinkedList linkedList = this.f257255h;
        linkedList.clear();
        java.util.Iterator it = this.f257252e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f257253f;
            if (!hasNext) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f257254g.contains(str)) {
                if (hashMap.get(str) == null) {
                    com.tencent.mm.ui.yk.b("MicroMsg.WeUIPreferenceAdapter", "not found pref by key " + str, new java.lang.Object[0]);
                } else {
                    linkedList.add(str);
                }
            }
        }
        if (!linkedList.isEmpty() && f(((android.preference.Preference) hashMap.get(linkedList.get(0))).getLayoutResource())) {
            a(new com.tencent.weui.base.preference.PreferenceSmallCategory(this.f257259o, null), 0);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            if (i18 != 0) {
            }
        }
        linkedList.removeAll(hashSet);
        int[] iArr = new int[linkedList.size()];
        this.f257260p = iArr;
        if (iArr.length <= 0) {
            return;
        }
        int length = iArr.length;
        android.content.SharedPreferences sharedPreferences = this.f257258n;
        if (length == 1) {
            int layoutResource = ((android.preference.Preference) hashMap.get(linkedList.get(0))).getLayoutResource();
            android.preference.Preference preference = (android.preference.Preference) hashMap.get(linkedList.get(0));
            if (!f(layoutResource)) {
                this.f257260p[0] = 4;
            } else if (preference instanceof com.tencent.weui.base.preference.CheckBoxPreference) {
                int[] iArr2 = this.f257260p;
                iArr2[0] = iArr2[0] | 8;
            } else {
                this.f257260p[0] = 3;
            }
            g((android.preference.Preference) hashMap.get(linkedList.get(0)), sharedPreferences);
            super.notifyDataSetChanged();
            return;
        }
        for (i17 = 0; i17 < linkedList.size(); i17++) {
            g((android.preference.Preference) hashMap.get(linkedList.get(i17)), sharedPreferences);
            android.preference.Preference preference2 = (android.preference.Preference) hashMap.get(linkedList.get(i17));
            int layoutResource2 = preference2.getLayoutResource();
            if (f(layoutResource2)) {
                if (preference2 instanceof com.tencent.weui.base.preference.CheckBoxPreference) {
                    int[] iArr3 = this.f257260p;
                    iArr3[i17] = iArr3[i17] | 8;
                } else if (i17 == 0) {
                    int[] iArr4 = this.f257260p;
                    iArr4[i17] = iArr4[i17] | 1;
                } else {
                    if (i17 == linkedList.size() - 1) {
                        int[] iArr5 = this.f257260p;
                        iArr5[i17] = iArr5[i17] | 2;
                    }
                    int layoutResource3 = ((android.preference.Preference) hashMap.get(linkedList.get(i17 - 1))).getLayoutResource();
                    if (layoutResource3 != com.tencent.mm.R.layout.byv || layoutResource3 == com.tencent.mm.R.layout.f489295c11 || layoutResource3 == com.tencent.mm.R.layout.f489297c13) {
                        int[] iArr6 = this.f257260p;
                        iArr6[i17] = iArr6[i17] | 1;
                    }
                }
            } else if (layoutResource2 != com.tencent.mm.R.layout.c0d) {
                int[] iArr7 = this.f257260p;
                iArr7[i17] = iArr7[i17] | 4;
                if (i17 != 0) {
                    int i19 = i17 - 1;
                    int layoutResource4 = ((android.preference.Preference) hashMap.get(linkedList.get(i19))).getLayoutResource();
                    if (f(layoutResource4) || layoutResource4 == com.tencent.mm.R.layout.c0d) {
                        int[] iArr8 = this.f257260p;
                        iArr8[i19] = iArr8[i19] | 2;
                    }
                }
            } else if (i17 == 0) {
                int[] iArr9 = this.f257260p;
                iArr9[i17] = iArr9[i17] | 4;
            } else {
                int[] iArr10 = this.f257260p;
                iArr10[i17] = iArr10[i17] | 16;
                int i27 = i17 - 1;
                int layoutResource5 = ((android.preference.Preference) hashMap.get(linkedList.get(i27))).getLayoutResource();
                if (layoutResource5 == com.tencent.mm.R.layout.byv || layoutResource5 == com.tencent.mm.R.layout.f489295c11 || layoutResource5 == com.tencent.mm.R.layout.f489297c13) {
                    int[] iArr11 = this.f257260p;
                    iArr11[i27] = iArr11[i27] | 2;
                }
            }
        }
        super.notifyDataSetChanged();
    }
}
