package com.tencent.mm.plugin.label.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/ContactEditLabel;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/ui/contact/l4;", "Ll75/z0;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "f93/y", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ContactEditLabel extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.contact.l4, l75.z0, com.tencent.mm.modelbase.u0 {
    public f93.y A;
    public int B;
    public int C;
    public android.widget.EditText D;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143194g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143195h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143196i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.storage.d4 f143197m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f143198n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f143199o;

    /* renamed from: v, reason: collision with root package name */
    public android.app.ProgressDialog f143206v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f143207w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f143208x;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ListView f143210z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143191d = "MicroMsg.Label.ContactEditLabel";

    /* renamed from: e, reason: collision with root package name */
    public final int f143192e = com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL;

    /* renamed from: f, reason: collision with root package name */
    public final int f143193f = com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;

    /* renamed from: p, reason: collision with root package name */
    public boolean f143200p = true;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f143201q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f143202r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f143203s = new java.util.HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f143204t = new java.util.HashSet();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashSet f143205u = new java.util.HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f143209y = "intent_status_mgr";
    public final com.tencent.mm.sdk.platformtools.n3 E = new f93.l0(this, android.os.Looper.getMainLooper());

    public static final void T6(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "cpan[saveLabelChange]");
        java.lang.String string = contactEditLabel.getString(com.tencent.mm.R.string.g9k);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        contactEditLabel.f143206v = db5.e1.Q(contactEditLabel, contactEditLabel.getString(com.tencent.mm.R.string.f490573yv), string, true, true, f93.n0.f260394d);
        java.lang.String str = contactEditLabel.f143195h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        contactEditLabel.f143195h = str;
        int length = str.length() - 1;
        int i17 = 0;
        boolean z18 = false;
        while (i17 <= length) {
            boolean z19 = kotlin.jvm.internal.o.i(str.charAt(!z18 ? i17 : length), 32) <= 0;
            if (z18) {
                if (!z19) {
                    break;
                } else {
                    length--;
                }
            } else if (z19) {
                i17++;
            } else {
                z18 = true;
            }
        }
        java.lang.String obj = str.subSequence(i17, length + 1).toString();
        contactEditLabel.f143195h = obj;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(obj);
        f93.m0 m0Var = f93.m0.f260384d;
        if (K0) {
            contactEditLabel.hideLoading();
            db5.e1.t(contactEditLabel, contactEditLabel.getString(com.tencent.mm.R.string.g96), "", m0Var);
            return;
        }
        if (com.tencent.mm.ui.tools.v4.f(contactEditLabel.f143195h) > 36) {
            contactEditLabel.hideLoading();
            java.lang.String string2 = contactEditLabel.getString(com.tencent.mm.R.string.f489830cy);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.tencent.mm.ui.tools.v4.b(36, ""))}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            db5.e1.t(contactEditLabel, format, "", m0Var);
            return;
        }
        kotlin.jvm.internal.o.d(contactEditLabel.f143195h);
        if (!(!com.tencent.mm.sdk.platformtools.t8.K0(b93.r.wi().p1(r0))) || !contactEditLabel.f143200p) {
            kotlin.jvm.internal.o.d(contactEditLabel.f143195h);
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(b93.r.wi().p1(r0))) || com.tencent.mm.sdk.platformtools.t8.K0(contactEditLabel.f143194g) || kotlin.jvm.internal.o.b(contactEditLabel.f143194g, contactEditLabel.f143195h)) {
                com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(contactEditLabel.f143196i);
                if (contactEditLabel.f143200p || n17.field_isTemporary) {
                    java.lang.String str2 = contactEditLabel.f143195h;
                    kotlin.jvm.internal.o.d(str2);
                    c01.d9.e().g(new e93.a(str2));
                    return;
                } else {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(contactEditLabel.f143196i, 0);
                    java.lang.String str3 = contactEditLabel.f143195h;
                    kotlin.jvm.internal.o.d(str3);
                    c01.d9.e().g(new e93.f(P, str3));
                    return;
                }
            }
        }
        contactEditLabel.hideLoading();
        db5.e1.t(contactEditLabel, contactEditLabel.getString(com.tencent.mm.R.string.f489826cu), "", m0Var);
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        android.widget.ListView listView = this.f143210z;
        if (listView != null) {
            return listView;
        }
        kotlin.jvm.internal.o.o("listView");
        throw null;
    }

    public final void U6() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.util.HashSet hashSet = this.f143203s;
        objArr[0] = java.lang.Integer.valueOf(hashSet != null ? hashSet.size() : 0);
        java.util.HashSet hashSet2 = this.f143205u;
        objArr[1] = java.lang.Integer.valueOf(hashSet2 != null ? hashSet2.size() : 0);
        java.lang.String str = this.f143191d;
        com.tencent.mars.xlog.Log.i(str, "cpan[doUpdateContactList] addcount:%d,delcount:%d", objArr);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (hashSet != null && hashSet.size() > 0) {
            hashSet.size();
            java.util.Iterator it = hashSet.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.String");
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n((java.lang.String) next, true);
                java.lang.String D0 = n17.D0();
                java.lang.String b17 = b93.n.b(D0, this.f143196i);
                com.tencent.mars.xlog.Log.i(str, "labels:%s mixLabelIds:%s", D0, b17);
                if (!r26.i0.p(b17, D0, true)) {
                    r45.gw6 gw6Var = new r45.gw6();
                    gw6Var.f375581d = n17.d1();
                    gw6Var.f375582e = b17;
                    linkedList.add(gw6Var);
                }
            }
        }
        if (hashSet2 != null && hashSet2.size() > 0) {
            hashSet2.size();
            java.util.Iterator it6 = hashSet2.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                kotlin.jvm.internal.o.e(next2, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) next2;
                java.lang.String D02 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true).D0();
                java.lang.String c17 = b93.n.c(D02, this.f143196i);
                com.tencent.mars.xlog.Log.i(str, "username:%s labels:%s mixLabelIds:%s", str2, D02, c17);
                if (!r26.i0.p(c17, D02, true)) {
                    r45.gw6 gw6Var2 = new r45.gw6();
                    gw6Var2.f375581d = str2;
                    gw6Var2.f375582e = c17;
                    linkedList.add(gw6Var2);
                }
            }
        }
        if (linkedList.size() > 0) {
            c01.d9.e().g(new e93.e(linkedList));
        } else {
            V6();
        }
    }

    public final void V6() {
        java.lang.String str = this.f143191d;
        com.tencent.mars.xlog.Log.i(str, "cpan[savaSuccess]");
        hideLoading();
        java.util.HashSet hashSet = this.f143203s;
        int size = hashSet != null ? hashSet.size() : 0;
        java.util.HashSet hashSet2 = this.f143205u;
        int size2 = hashSet2 != null ? hashSet2.size() : 0;
        com.tencent.mars.xlog.Log.i(str, "cpan[doUpdateContactList]addnum:%d", java.lang.Integer.valueOf(size));
        if (size > 0) {
            int size3 = this.f143204t.size();
            int max = java.lang.Math.max(0, size - size3);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[7];
            objArr[0] = c01.z1.r();
            objArr[1] = 0;
            objArr[2] = 0;
            objArr[3] = java.lang.Integer.valueOf(size);
            objArr[4] = java.lang.Integer.valueOf(this.f143198n ? 1 : 2);
            objArr[5] = java.lang.Integer.valueOf(size3);
            objArr[6] = java.lang.Integer.valueOf(max);
            g0Var.d(11220, objArr);
        }
        if (this.f143200p) {
            android.content.Intent intent = getIntent();
            intent.putExtra("k_sns_label_add_label", this.f143195h);
            intent.putStringArrayListExtra("k_sns_label_add_label_usernames", new java.util.ArrayList<>(hashSet));
            setResult(0, intent);
            if (this.f143208x) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 1, 2);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 1, 3);
            }
        } else {
            if (size > 0) {
                if (this.f143208x) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 3, 2);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 3, 3);
                }
            }
            if (size2 > 0) {
                if (this.f143208x) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 4, 2);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 1, 4, 3);
                }
            }
            setResult(0);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.contact.l4
    public java.lang.String W5(com.tencent.mm.ui.contact.item.d dVar) {
        return null;
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i(this.f143191d, "cpan[saveFailed]");
        hideLoading();
        db5.e1.t(this, getString(com.tencent.mm.R.string.f489827cv), "", f93.m0.f260384d);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        f93.y yVar = this.A;
        if (yVar != null) {
            yVar.s();
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c8j;
    }

    public final void hideLoading() {
        android.app.ProgressDialog progressDialog = this.f143206v;
        if (progressDialog != null) {
            kotlin.jvm.internal.o.d(progressDialog);
            if (progressDialog.isShowing()) {
                android.app.ProgressDialog progressDialog2 = this.f143206v;
                kotlin.jvm.internal.o.d(progressDialog2);
                progressDialog2.dismiss();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)};
        java.lang.String str = this.f143191d;
        com.tencent.mars.xlog.Log.i(str, "cpan[onActivityResult] requestCode:%d resultCode:%d", objArr);
        if (i18 == -1 && i17 == this.f143192e) {
            kotlin.jvm.internal.o.d(intent);
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            com.tencent.mars.xlog.Log.i(str, "cpan[onActivityResult] %s", stringExtra + "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            kotlin.jvm.internal.o.d(stringExtra);
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i19 = 0; i19 < size; i19++) {
                    java.lang.String str2 = (java.lang.String) P1.get(i19);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        if (!c01.e2.J(str2) || this.f143201q.contains(str2) || kotlin.jvm.internal.o.b(str2, this.f143207w)) {
                            com.tencent.mars.xlog.Log.i(str, "dz[getIntent] %s is no friend or is user self and just filter", str2);
                        } else {
                            this.f143201q.add(str2);
                            java.util.ArrayList arrayList = this.f143202r;
                            if (arrayList != null && !arrayList.contains(P1.get(i19))) {
                                this.f143203s.add(str2);
                            }
                            if (booleanExtra) {
                                this.f143204t.add(str2);
                            }
                            java.util.HashSet hashSet = this.f143205u;
                            if (hashSet != null && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                            }
                        }
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f143195h)) {
                    enableOptionMenu(true);
                }
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
            if (n3Var != null) {
                n3Var.sendEmptyMessage(com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(this.f143195h) && !kotlin.jvm.internal.o.b(this.f143195h, this.f143194g)) || (((hashSet = this.f143203s) != null && hashSet.size() > 0) || ((hashSet2 = this.f143205u) != null && hashSet2.size() > 0))) {
            db5.e1.A(this, getString(com.tencent.mm.R.string.i8_), "", getString(com.tencent.mm.R.string.apf), getString(com.tencent.mm.R.string.api), new f93.o0(this), new f93.p0(this));
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f143207w = c01.z1.r();
        this.f143196i = getIntent().getStringExtra("label_id");
        java.lang.String stringExtra = getIntent().getStringExtra("label_name");
        this.f143194g = stringExtra;
        if (stringExtra == null || kotlin.jvm.internal.o.b(stringExtra, "")) {
            this.f143194g = " ";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("label_name");
        this.f143195h = stringExtra2;
        if (stringExtra2 == null || kotlin.jvm.internal.o.b(stringExtra2, "")) {
            this.f143195h = " ";
        }
        this.f143198n = getIntent().getBooleanExtra("Is_Chatroom", false);
        java.lang.String stringExtra3 = getIntent().getStringExtra("label_source");
        this.f143208x = stringExtra3 != null && r26.i0.q(stringExtra3, "label_source_Address", false, 2, null);
        getIntent().getBooleanExtra("is_show_delete", true);
        java.lang.String stringExtra4 = getIntent().getStringExtra("Select_Contact");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
            kotlin.jvm.internal.o.d(stringExtra4);
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra4, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
            this.f143201q = new java.util.ArrayList();
            if (P1 != null && P1.size() > 0) {
                int size = P1.size();
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.String str = (java.lang.String) P1.get(i17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        if (!c01.e2.J(str) || this.f143201q.contains(str) || kotlin.jvm.internal.o.b(str, this.f143207w)) {
                            com.tencent.mars.xlog.Log.i(this.f143191d, "dz[getIntent] %s is no friend or is user self and just filter", str);
                        } else {
                            this.f143201q.add(str);
                            this.f143203s.add(str);
                            if (this.f143198n) {
                                this.f143204t.add(str);
                            }
                        }
                    }
                }
            }
        }
        c01.d9.e().a(kd1.c.CTRL_INDEX, this);
        c01.d9.e().a(637, this);
        c01.d9.e().a(638, this);
        gm0.j1.e().j(new f93.k0(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f143196i)) {
            this.f143200p = true;
            this.f143199o = getString(com.tencent.mm.R.string.f492719hl2);
        } else {
            this.f143200p = false;
            this.f143197m = b93.r.wi().n1(this.f143196i);
            this.f143199o = getString(com.tencent.mm.R.string.f492718hl1);
        }
        setMMTitle(this.f143199o);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485880jf5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f143210z = (android.widget.ListView) findViewById;
        setToTop(new f93.z(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dfx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        ((android.widget.TextView) findViewById2).setVisibility(8);
        this.A = new f93.y(this, this);
        if (getIntent().getBooleanExtra(this.f143209y, false)) {
            f93.y yVar = this.A;
            if (yVar == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            yVar.f207078f = true;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.jiq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById3).setVisibility(8);
        android.widget.ListView listView = this.f143210z;
        if (listView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView.setOnItemClickListener(new f93.a0(this));
        android.widget.ListView listView2 = this.f143210z;
        if (listView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView2.setOnItemLongClickListener(new f93.d0(this));
        android.widget.ListView listView3 = this.f143210z;
        if (listView3 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        listView3.setOnTouchListener(new f93.e0(this));
        android.widget.ListView listView4 = this.f143210z;
        if (listView4 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        f93.y yVar2 = this.A;
        if (yVar2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        listView4.setAdapter((android.widget.ListAdapter) yVar2);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.jft);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        ((com.tencent.mm.chatroom.ui.SelectMemberScrollBar) findViewById4).setOnScrollBarTouchListener(new f93.f0(this));
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.mjh);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById5;
        this.D = editText;
        editText.addTextChangedListener(new f93.h0(this));
        setBackBtn(new f93.i0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491020bm0), new f93.j0(this), null, com.tencent.mm.ui.fb.GREEN);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        c01.d9.e().q(kd1.c.CTRL_INDEX, this);
        c01.d9.e().q(637, this);
        c01.d9.e().q(638, this);
        f93.y yVar = this.A;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        yVar.k();
        this.E.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str};
        java.lang.String str2 = this.f143191d;
        com.tencent.mars.xlog.Log.i(str2, "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", objArr);
        kotlin.jvm.internal.o.d(m1Var);
        int type = m1Var.getType();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.E;
        switch (type) {
            case kd1.c.CTRL_INDEX /* 635 */:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                r45.c4 c4Var = (r45.c4) ((e93.a) m1Var).f250348d.f70711b.f70700a;
                kotlin.jvm.internal.o.f(c4Var, "getResponse(...)");
                java.util.LinkedList LabelPairList = c4Var.f371260e;
                kotlin.jvm.internal.o.f(LabelPairList, "LabelPairList");
                if (LabelPairList.size() <= 0) {
                    W6();
                    return;
                }
                java.lang.Object obj = LabelPairList.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.f54 f54Var = (r45.f54) obj;
                com.tencent.mars.xlog.Log.i(str2, "cpan[onSceneEnd] add label pair.LabelID:%s pair.LabelName:%s", f54Var.f374022e + "", f54Var.f374021d);
                this.f143196i = f54Var.f374022e + "";
                U6();
                return;
            case 636:
                f93.m0 m0Var = f93.m0.f260384d;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.w(str2, "cpan[onSceneEnd] delete fail.");
                    db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", m0Var);
                    return;
                }
                com.tencent.mm.storage.d4 d4Var = this.f143197m;
                com.tencent.mm.storage.h4 wi6 = b93.r.wi();
                kotlin.jvm.internal.o.d(d4Var);
                if (wi6.delete(d4Var, "labelID")) {
                    setResult(-1);
                    finish();
                } else {
                    com.tencent.mars.xlog.Log.w(str2, "cpan[doDeleteContactLabel] fail.");
                    db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", m0Var);
                }
                if (n3Var != null) {
                    n3Var.sendEmptyMessageDelayed(6002, 300L);
                    return;
                }
                return;
            case 637:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                java.lang.String str3 = this.f143196i;
                java.lang.String str4 = this.f143195h;
                com.tencent.mars.xlog.Log.i(str2, "cpan[doInsertOrUpdateLable]");
                try {
                    kotlin.jvm.internal.o.d(str3);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(str3);
                    kotlin.jvm.internal.o.f(valueOf, "valueOf(...)");
                    i19 = valueOf.intValue();
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e(str2, "id is not integer type:%s", str3 + "");
                    i19 = -1;
                }
                if (i19 != -1) {
                    com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(str3);
                    if (n17 == null) {
                        n17 = new com.tencent.mm.storage.d4();
                    }
                    n17.field_labelID = i19;
                    n17.field_labelName = str4;
                    n17.field_labelPYFull = x51.k.a(str4);
                    n17.field_labelPYShort = x51.k.b(str4);
                    b93.r.wi().update(n17, "labelID");
                } else {
                    W6();
                }
                U6();
                return;
            case 638:
                if (i17 != 0 || i18 != 0) {
                    W6();
                    return;
                }
                V6();
                if (n3Var != null) {
                    n3Var.sendEmptyMessageDelayed(6002, 300L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean p5(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (!(dVar instanceof com.tencent.mm.ui.contact.item.u)) {
            return false;
        }
        f93.y yVar = this.A;
        if (yVar != null) {
            return yVar.f260514r.contains(((com.tencent.mm.ui.contact.item.u) dVar).f206819z);
        }
        kotlin.jvm.internal.o.o("adapter");
        throw null;
    }
}
