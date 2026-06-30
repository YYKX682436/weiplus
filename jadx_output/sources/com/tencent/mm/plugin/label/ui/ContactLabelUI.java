package com.tencent.mm.plugin.label.ui;

/* loaded from: classes11.dex */
public class ContactLabelUI extends com.tencent.mm.plugin.label.ui.ContactLabelBaseUI implements com.tencent.mm.modelbase.u0, com.tencent.mm.ui.tools.c5 {
    public static final /* synthetic */ int L = 0;
    public final java.util.HashSet F;
    public final java.util.HashSet G;
    public final java.util.HashSet H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f143296J;
    public android.animation.ObjectAnimator K;

    /* renamed from: e, reason: collision with root package name */
    public db5.f3 f143297e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f143298f;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTagPanelScrollView f143301i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.label.ui.widget.MMLabelPanel f143302m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f143303n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f143304o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f143305p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f143306q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.label.ui.widget.MMLabelPanel f143307r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ListView f143308s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ScrollView f143309t;

    /* renamed from: u, reason: collision with root package name */
    public f93.x2 f143310u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f143311v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f143312w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.ArrayList f143313x;

    /* renamed from: g, reason: collision with root package name */
    public boolean f143299g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143300h = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.HashSet f143314y = new java.util.HashSet();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f143315z = new java.util.HashSet();
    public final java.util.ArrayList A = new java.util.ArrayList();
    public final java.util.HashSet B = new java.util.HashSet();
    public java.util.ArrayList C = new java.util.ArrayList();
    public java.util.ArrayList D = new java.util.ArrayList();
    public boolean E = false;

    public ContactLabelUI() {
        new java.util.HashSet();
        this.F = new java.util.HashSet();
        this.G = new java.util.HashSet();
        this.H = new java.util.HashSet();
        this.I = true;
        this.f143296J = false;
        this.K = null;
    }

    public static void V6(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI, java.lang.String str) {
        java.util.ArrayList arrayList = contactLabelUI.f143313x;
        if (arrayList != null && arrayList.contains(str)) {
            contactLabelUI.f143314y.add(str);
        }
        java.util.ArrayList arrayList2 = contactLabelUI.A;
        if (arrayList2 != null && arrayList2.contains(str)) {
            arrayList2.remove(str);
        }
        java.util.HashSet hashSet = contactLabelUI.f143315z;
        if (hashSet != null && hashSet.contains(str)) {
            hashSet.remove(str);
        }
        if (contactLabelUI.Z6()) {
            contactLabelUI.enableOptionMenu(true);
        }
    }

    public static void W6(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143302m;
        if (mMLabelPanel != null) {
            mMLabelPanel.f();
        }
        android.content.Intent intent = new android.content.Intent();
        if (contactLabelUI.Z6()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = contactLabelUI.getIntent().getStringArrayListExtra("label_str_list");
        java.util.ArrayList k17 = b93.r.wi().k1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!k17.contains(next)) {
                arrayList.add(next);
            }
        }
        stringArrayListExtra.removeAll(arrayList);
        intent.putExtra("result_label_id_list", stringArrayListExtra);
        intent.putExtra("contact_search_label_new_list", new java.util.ArrayList());
        intent.putExtra("contact_search_label_add_list", new java.util.ArrayList());
        intent.putExtra("contact_select_label_add_list", new java.util.ArrayList());
        intent.putExtra("contact_select_label_new_list", new java.util.ArrayList());
        contactLabelUI.setResult(-1, intent);
        super.finish();
    }

    public static void X6(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        contactLabelUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[save]");
        if (contactLabelUI.f143302m == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelUI", "save fail. input view is null.");
            return;
        }
        contactLabelUI.U6(contactLabelUI.getString(com.tencent.mm.R.string.g9k));
        boolean z17 = contactLabelUI.E;
        java.util.HashSet hashSet = contactLabelUI.B;
        java.util.HashSet hashSet2 = contactLabelUI.f143315z;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabel]");
            com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = contactLabelUI.f143302m;
            if (mMLabelPanel != null) {
                java.lang.String editText = mMLabelPanel.getEditText();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(editText)) {
                    java.lang.String trim = editText.trim();
                    contactLabelUI.f143302m.d(trim, true);
                    contactLabelUI.f143302m.g();
                    contactLabelUI.Y6(trim, contactLabelUI.E);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (hashSet2 != null) {
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!hashSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (hashSet2 != null && !hashSet2.isEmpty()) {
                    if (contactLabelUI.C == null || hashSet2.isEmpty()) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 0, 0);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 0, 1);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doSaveContact");
                contactLabelUI.b7();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLable] doScene: %s", arrayList.toString());
            c01.d9.e().g(new e93.a(arrayList));
            if (contactLabelUI.C == null || hashSet2.isEmpty()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 0, 0);
                return;
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11347, 0, 1);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]");
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel2 = contactLabelUI.f143302m;
        if (mMLabelPanel2 != null) {
            java.lang.String editText2 = mMLabelPanel2.getEditText();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(editText2)) {
                contactLabelUI.f143302m.d(editText2, true);
                contactLabelUI.f143302m.g();
                contactLabelUI.Y6(editText2, contactLabelUI.E);
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger] save local");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!hashSet.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (int i17 = 0; i17 < size; i17++) {
                    com.tencent.mm.storage.d4 d4Var = new com.tencent.mm.storage.d4();
                    java.lang.String str3 = (java.lang.String) arrayList2.get(i17);
                    d4Var.field_isTemporary = true;
                    d4Var.field_labelName = str3;
                    d4Var.field_labelPYFull = x51.k.a(str3);
                    d4Var.field_labelPYShort = x51.k.b(str3);
                    int i18 = -((int) java.lang.System.nanoTime());
                    d4Var.field_labelID = i18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveLabelStranger]field_labelID:%s field_labelName:%s", java.lang.Integer.valueOf(i18), d4Var.field_labelName);
                    arrayList3.add(d4Var);
                }
                b93.r.wi().T1(arrayList3);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveStranger]");
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(contactLabelUI.f143311v);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel3 = contactLabelUI.f143302m;
        if (mMLabelPanel3 != null) {
            java.lang.String h17 = ((b93.b) c93.a.a()).h(mMLabelPanel3.getTagList());
            if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                z07.field_contactLabels = "";
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            } else {
                z07.field_contactLabels = h17;
                if (com.tencent.mm.sdk.platformtools.t8.K0(z07.field_encryptUsername)) {
                    z07.field_encryptUsername = contactLabelUI.f143311v;
                }
                ((com.tencent.mm.storage.ab) c01.d9.b().B()).replace(z07);
            }
        }
        contactLabelUI.c7();
    }

    public final void Y6(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelUI", "tag is empty");
            return;
        }
        java.lang.String trim = str.trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
            return;
        }
        com.tencent.mm.storage.d4 o17 = b93.r.wi().o1(trim);
        java.util.HashSet hashSet = this.f143315z;
        if (z17) {
            java.util.ArrayList arrayList = this.C;
            if (arrayList == null || !arrayList.contains(trim) || o17 == null) {
                hashSet.add(trim);
            }
        } else {
            java.util.ArrayList arrayList2 = this.C;
            if (arrayList2 == null || !arrayList2.contains(trim) || (o17 != null && o17.field_isTemporary)) {
                hashSet.add(trim);
            }
        }
        java.util.ArrayList arrayList3 = this.A;
        if (arrayList3 != null && !arrayList3.contains(trim)) {
            arrayList3.add(trim);
        }
        java.util.HashSet hashSet2 = this.f143314y;
        if (hashSet2 != null && hashSet2.contains(trim)) {
            hashSet2.remove(trim);
        }
        if (Z6()) {
            enableOptionMenu(true);
        }
    }

    public final boolean Z6() {
        if (this.f143302m == null) {
            return false;
        }
        java.util.ArrayList arrayList = this.f143313x;
        if (arrayList == null || arrayList.size() <= 0) {
            return this.f143302m.getTagList() != null && this.f143302m.getTagList().size() > 0;
        }
        if (this.f143302m.getTagList() == null && this.f143302m.getTagList().size() <= 0) {
            return true;
        }
        java.util.ArrayList<java.lang.String> tagList = this.f143302m.getTagList();
        java.util.Collections.sort(this.f143313x);
        java.util.Collections.sort(tagList);
        return !this.f143313x.equals(tagList);
    }

    public final void a7(java.util.HashSet hashSet, java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        hashSet.removeAll(arrayList2);
    }

    public final void b7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
        if (this.f143302m != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
            java.util.ArrayList<java.lang.String> tagList = this.f143302m.getTagList();
            java.lang.String u17 = (tagList == null || tagList.size() <= 0) ? "" : b93.r.wi().u1(tagList);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.gw6 gw6Var = new r45.gw6();
            gw6Var.f375582e = u17;
            gw6Var.f375581d = this.f143311v;
            linkedList.add(gw6Var);
            c01.d9.e().g(new e93.e(linkedList));
            java.util.HashSet hashSet = this.f143315z;
            int size = hashSet != null ? hashSet.size() : 0;
            java.util.ArrayList arrayList = this.f143313x;
            int size2 = arrayList != null ? arrayList.size() : 0;
            java.util.HashSet hashSet2 = this.f143314y;
            int size3 = ((this.f143302m.getTagList().size() + (hashSet2 != null ? hashSet2.size() : 0)) - size2) - size;
            if (size > 0 || size3 > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11220, c01.z1.r(), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size3), 0, 0);
            }
            if (size > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 1, 1);
            }
        }
    }

    public final void c7() {
        hideLoading();
        this.f143315z.clear();
        this.f143314y.clear();
        finish();
    }

    public final void d7(f93.n4 n4Var) {
        int ordinal = n4Var.ordinal();
        if (ordinal == 0) {
            this.f143308s.setVisibility(8);
            android.view.View view = this.f143304o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f143309t.setVisibility(0);
            this.f143303n.setVisibility(8);
            return;
        }
        if (ordinal == 1) {
            this.f143309t.setVisibility(8);
            this.f143308s.setVisibility(0);
            android.view.View view2 = this.f143304o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f143303n.setVisibility(8);
            return;
        }
        if (ordinal == 2) {
            this.f143308s.setVisibility(8);
            this.f143309t.setVisibility(8);
            android.view.View view3 = this.f143304o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f143303n.setVisibility(0);
            this.f143303n.setText(com.tencent.mm.R.string.g9g);
            return;
        }
        if (ordinal != 3) {
            return;
        }
        this.f143308s.setVisibility(8);
        this.f143309t.setVisibility(8);
        android.view.View view4 = this.f143304o;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f143303n.setVisibility(0);
        this.f143303n.setText(com.tencent.mm.R.string.g9g);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = this.f143302m;
        if (mMLabelPanel != null) {
            mMLabelPanel.f();
        }
        android.content.Intent intent = new android.content.Intent();
        if (Z6()) {
            intent.putExtra("hasLableChange", true);
        } else {
            intent.putExtra("hasLableChange", false);
        }
        intent.putExtra("result_label_id_list", this.f143302m.getSelectTagList());
        java.util.ArrayList<java.lang.String> selectTagList = this.f143302m.getSelectTagList();
        java.util.ArrayList<java.lang.String> selectTagList2 = this.f143307r.getSelectTagList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = selectTagList.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (!selectTagList2.contains(next)) {
                arrayList.add(next);
            }
        }
        if (getIntent().getStringArrayExtra("contact_search_label_new_list") != null) {
            for (java.lang.String str : getIntent().getStringArrayExtra("contact_search_label_new_list")) {
                arrayList.add(str);
            }
        }
        intent.putExtra("contact_search_label_new_list", arrayList);
        java.util.ArrayList k17 = b93.r.wi().k1();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = this.F;
        a7(hashSet, k17);
        arrayList2.addAll(hashSet);
        intent.putExtra("contact_search_label_add_list", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.HashSet hashSet2 = this.H;
        a7(hashSet2, k17);
        arrayList3.addAll(hashSet2);
        intent.putExtra("contact_select_label_add_list", arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.HashSet hashSet3 = this.G;
        a7(hashSet3, k17);
        arrayList4.addAll(hashSet3);
        intent.putExtra("contact_select_label_new_list", arrayList4);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2j;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.f489831cz));
        getController().x0(getString(com.tencent.mm.R.string.f490347sg), new java.lang.Runnable() { // from class: f93.x3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.label.ui.ContactLabelUI.this.onBackPressed();
            }
        });
        setBackBtnVisible(false);
        addTextOptionMenu(0, getString(this.f143299g ? com.tencent.mm.R.string.f490507x1 : com.tencent.mm.R.string.f490547y6), new f93.e4(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.ui.base.MMTagPanelScrollView mMTagPanelScrollView = (com.tencent.mm.ui.base.MMTagPanelScrollView) findViewById(com.tencent.mm.R.id.hsj);
        this.f143301i = mMTagPanelScrollView;
        mMTagPanelScrollView.setMaxLine(3);
        this.f143302m = (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) findViewById(com.tencent.mm.R.id.hsh);
        this.f143303n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hsl);
        this.f143301i.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f143304o = findViewById(com.tencent.mm.R.id.hsg);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hsf);
        this.f143305p = findViewById;
        findViewById.setBackgroundDrawable(null);
        ((android.widget.TextView) this.f143305p.findViewById(android.R.id.title)).setText(com.tencent.mm.R.string.g9j);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f143305p.findViewById(com.tencent.mm.R.id.d6e);
        this.f143306q = linearLayout;
        linearLayout.setVisibility(0);
        this.f143306q.setOnClickListener(new f93.f4(this));
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = (com.tencent.mm.plugin.label.ui.widget.MMLabelPanel) findViewById(com.tencent.mm.R.id.hsd);
        this.f143307r = mMLabelPanel;
        mMLabelPanel.setNeedNewLebal(true);
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel2 = this.f143307r;
        int a17 = i65.a.a(mMLabelPanel2.M, 12.0f);
        int a18 = i65.a.a(mMLabelPanel2.M, 5.0f);
        int a19 = i65.a.a(mMLabelPanel2.M, 12.0f);
        int a27 = i65.a.a(mMLabelPanel2.M, 6.0f);
        com.tencent.mm.ui.widget.MMEditText mMEditText = mMLabelPanel2.F;
        if (mMEditText != null) {
            mMEditText.setPadding(a17, a18, a19, a27);
        }
        this.f143307r.setClickNewLebalCallBack(new f93.g4(this));
        this.f143308s = (android.widget.ListView) findViewById(com.tencent.mm.R.id.hsk);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.hso);
        this.f143309t = scrollView;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new f93.k4(this));
        }
        com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel3 = this.f143302m;
        mMLabelPanel3.f197585q = true;
        mMLabelPanel3.k(true);
        this.f143302m.setEdittextMaxSize(36);
        this.f143302m.setCallBack(new f93.m4(this));
        if (getIntent().getStringArrayExtra("contact_search_label_add_list") != null) {
            for (java.lang.String str : getIntent().getStringArrayExtra("contact_search_label_add_list")) {
                this.F.add(str);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_add_list") != null) {
            for (java.lang.String str2 : getIntent().getStringArrayExtra("contact_select_label_add_list")) {
                this.H.add(str2);
            }
        }
        if (getIntent().getStringArrayExtra("contact_select_label_new_list") != null) {
            for (java.lang.String str3 : getIntent().getStringArrayExtra("contact_select_label_new_list")) {
                this.G.add(str3);
            }
        }
        this.f143307r.k(false);
        this.f143307r.setNeedNewLebal(true);
        this.f143307r.setCallBack(new f93.y3(this));
        this.f143308s.setAdapter((android.widget.ListAdapter) this.f143310u);
        this.f143308s.setOnItemClickListener(new f93.z3(this));
        enableOptionMenu(false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Z6()) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.i8_), "", getString(com.tencent.mm.R.string.apf), getString(com.tencent.mm.R.string.api), new f93.b4(this), new f93.c4(this));
            return;
        }
        try {
            super.onBackPressed();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Label.ContactLabelUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList arrayList;
        super.onCreate(bundle);
        this.f143312w = getIntent().getStringExtra("label_id_list");
        this.f143313x = getIntent().getStringArrayListExtra("label_str_list");
        this.f143311v = getIntent().getStringExtra("label_username");
        this.E = getIntent().getBooleanExtra("is_stranger", false);
        this.f143299g = getIntent().getBooleanExtra("save_label_to_contact_on_prepage", false);
        this.f143310u = new f93.x2(this);
        initView();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f143312w) && (arrayList = this.f143313x) != null && arrayList.size() > 0) {
            com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = this.f143302m;
            java.util.ArrayList arrayList2 = this.f143313x;
            mMLabelPanel.r(arrayList2, arrayList2);
        }
        if (this.E) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("label_str_list");
            this.f143302m.r(stringArrayListExtra, stringArrayListExtra);
        }
        this.D = b93.r.wi().k1();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 0, 1);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        c01.d9.e().q(638, this);
        com.tencent.mm.ui.tools.f5 f5Var = this.f143298f;
        if (f5Var != null) {
            f5Var.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
        c01.d9.e().a(638, this);
        com.tencent.mm.sdk.platformtools.u3.h(new f93.d4(this));
        com.tencent.mm.ui.tools.f5 f5Var = this.f143298f;
        if (f5Var != null) {
            f5Var.f();
        }
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int type = m1Var.getType();
        if (type != 635) {
            if (type != 638) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelUI", "unknow type.");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
                c7();
                return;
            } else {
                hideLoading();
                db5.e1.t(this, getString(com.tencent.mm.R.string.f489827cv), "", new f93.w0(this));
                return;
            }
        }
        if (i17 != 0 || i18 != 0) {
            hideLoading();
            db5.e1.t(this, getString(com.tencent.mm.R.string.f489827cv), "", new f93.w0(this));
            return;
        }
        if (!this.f143300h || !(m1Var instanceof e93.a)) {
            if (this.f143299g) {
                c7();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.asd");
                b7();
                return;
            }
        }
        this.f143300h = false;
        hideLoading();
        java.util.LinkedList linkedList = ((r45.c4) ((e93.a) m1Var).f250348d.f70711b.f70700a).f371260e;
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            if (linkedList.get(i19) != null) {
                java.lang.String str2 = ((r45.f54) linkedList.get(i19)).f374021d;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    return;
                }
                com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel = this.f143302m;
                mMLabelPanel.w(str2, true, mMLabelPanel.getChildCount() - 1);
                com.tencent.mm.plugin.label.ui.widget.MMLabelPanel mMLabelPanel2 = this.f143307r;
                mMLabelPanel2.w(str2, true, mMLabelPanel2.getChildCount() - 1);
                Y6(str2, this.E);
                this.G.add(str2);
                this.B.add(str2);
                this.D.add(str2);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f143298f;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, height:%s", java.lang.Integer.valueOf(i17));
        if (fp.h.c(30)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged: return");
            return;
        }
        android.animation.ObjectAnimator objectAnimator = this.K;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.K.cancel();
        }
        db5.f3 f3Var = this.f143297e;
        if (f3Var == null || (view = f3Var.f212058g) == null || view.getParent() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelUI", "onKeyboardHeightChanged, mAddLebalTipsDialog: isNull");
            return;
        }
        android.view.View view2 = this.f143297e.f212058g.getParent() instanceof android.view.View ? (android.view.View) this.f143297e.f212058g.getParent() : null;
        if (view2 == null) {
            return;
        }
        if (i17 > 0) {
            if (view2.getTranslationY() != 0.0f) {
                view2.setTranslationY(0.0f);
            }
            this.K = android.animation.ObjectAnimator.ofFloat(view2, "translationY", 0.0f, -i17);
        } else {
            this.K = android.animation.ObjectAnimator.ofFloat(view2, "translationY", view2.getTranslationY(), 0.0f);
        }
        this.K.setDuration(200L);
        this.K.setInterpolator(new y3.b());
        this.K.addUpdateListener(new f93.l4(this));
        this.K.start();
    }
}
