package com.tencent.mm.plugin.label.ui;

/* loaded from: classes11.dex */
public class ContactLabelManagerUI extends com.tencent.mm.plugin.label.ui.ContactLabelBaseUI implements com.tencent.mm.modelbase.u0, android.view.View.OnCreateContextMenuListener, db5.t4 {
    public static final /* synthetic */ int X = 0;
    public k93.j A;

    /* renamed from: J, reason: collision with root package name */
    public rl5.r f143240J;
    public android.widget.TextView K;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f143242f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f143243g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f143244h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f143245i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f143246m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f143247n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f143248o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f143249p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f143250q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f143251r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f143252s;

    /* renamed from: t, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f143253t;

    /* renamed from: u, reason: collision with root package name */
    public k93.c f143254u;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f143256w;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f143258y;

    /* renamed from: e, reason: collision with root package name */
    public f93.m2 f143241e = f93.m2.Normal;

    /* renamed from: v, reason: collision with root package name */
    public boolean f143255v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f143257x = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f143259z = false;
    public java.util.ArrayList B = new java.util.ArrayList();
    public final java.util.ArrayList C = new java.util.ArrayList();
    public final java.util.HashMap D = new java.util.HashMap();
    public final java.util.HashMap E = new java.util.HashMap();
    public final java.util.HashMap F = new java.util.HashMap();
    public final java.util.HashSet G = new java.util.HashSet();
    public boolean H = true;
    public boolean I = false;
    public int L = 0;
    public int M = 0;
    public boolean N = true;
    public int P = -1;
    public final com.tencent.mm.sdk.platformtools.n3 Q = new f93.c2(this);
    public final k93.a R = new f93.e2(this);
    public com.tencent.mm.ui.widget.dialog.j0 S = null;
    public final android.view.View.OnClickListener T = new f93.g2(this);
    public final l75.q0 U = new f93.h2(this);
    public final l75.z0 V = new f93.i2(this);
    public final android.view.MenuItem.OnMenuItemClickListener W = new f93.j2(this);

    public static void V6(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI, android.view.View view, com.tencent.mm.storage.d4 d4Var) {
        contactLabelManagerUI.getClass();
        if (!(view.getTag() instanceof f93.d5) || ((f93.d5) view.getTag()).f260317h == null) {
            return;
        }
        android.widget.CheckBox checkBox = ((f93.d5) view.getTag()).f260317h;
        if (!contactLabelManagerUI.f143257x && !checkBox.isChecked() && contactLabelManagerUI.A.f305894f.size() >= 50) {
            k93.j jVar = contactLabelManagerUI.A;
            boolean z17 = !jVar.f305908w;
            jVar.f305908w = true;
            if (z17) {
                jVar.notifyDataSetChanged();
            }
            android.widget.Toast.makeText(contactLabelManagerUI, contactLabelManagerUI.getResources().getString(com.tencent.mm.R.string.g9x), 0).show();
            return;
        }
        k93.j jVar2 = contactLabelManagerUI.A;
        boolean z18 = jVar2.f305908w;
        jVar2.f305908w = false;
        if (z18) {
            jVar2.notifyDataSetChanged();
        }
        checkBox.setChecked(!checkBox.isChecked());
        if (checkBox.isChecked()) {
            contactLabelManagerUI.A.f305894f.add(java.lang.String.valueOf(d4Var.field_labelID));
        } else {
            contactLabelManagerUI.A.f305894f.remove(java.lang.String.valueOf(d4Var.field_labelID));
        }
        if (contactLabelManagerUI.f143257x) {
            contactLabelManagerUI.g7();
        }
        contactLabelManagerUI.e7();
    }

    public static void W6(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        if (contactLabelManagerUI.f143257x || contactLabelManagerUI.f143255v) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = contactLabelManagerUI.G;
        if (hashSet != null && hashSet.size() > 0) {
            arrayList.addAll(hashSet);
        }
        k93.r y17 = k93.j.y(arrayList, 10);
        int i17 = y17.f305927a;
        if (i17 <= 0) {
            contactLabelManagerUI.A.f305899n = null;
            return;
        }
        k93.q qVar = new k93.q();
        qVar.field_labelName = contactLabelManagerUI.getResources().getString(com.tencent.mm.R.string.g9c);
        qVar.field_labelID = -1000000;
        qVar.field_isTemporary = true;
        qVar.G = i17;
        qVar.F = y17.f305928b;
        contactLabelManagerUI.A.f305899n = qVar;
    }

    public static void X6(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        contactLabelManagerUI.h7(f93.m2.Normal);
        contactLabelManagerUI.d7(contactLabelManagerUI.B);
        java.util.ArrayList arrayList = contactLabelManagerUI.C;
        arrayList.clear();
        arrayList.addAll(contactLabelManagerUI.B);
        java.util.HashMap hashMap = contactLabelManagerUI.D;
        hashMap.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.d4 d4Var = (com.tencent.mm.storage.d4) it.next();
            if (!d4Var.field_isTemporary) {
                hashMap.put(java.lang.Integer.valueOf(d4Var.field_labelID), java.lang.Long.valueOf(d4Var.field_createTime));
            }
        }
        contactLabelManagerUI.A.notifyDataSetChanged();
        k93.j jVar = contactLabelManagerUI.A;
        if (jVar.B) {
            contactLabelManagerUI.f143251r.setEnabled(jVar.getItemCount() > 1);
        } else {
            contactLabelManagerUI.f143251r.setEnabled(jVar.getItemCount() > 0);
        }
        contactLabelManagerUI.f143251r.setTextColor(contactLabelManagerUI.getResources().getColor(contactLabelManagerUI.f143251r.isEnabled() ? com.tencent.mm.R.color.f479312vs : com.tencent.mm.R.color.f478720fb));
        contactLabelManagerUI.e7();
    }

    public static void Y6(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        contactLabelManagerUI.getClass();
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteScene] can not do scene. lable is null");
            return;
        }
        contactLabelManagerUI.U6(contactLabelManagerUI.getString(com.tencent.mm.R.string.g8w));
        e93.c cVar = new e93.c(com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        cVar.f250358g = arrayList2;
        c01.d9.e().g(cVar);
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436645e, vg3.c.f436669x, 0, null, 24, null));
    }

    public final void Z6(java.util.ArrayList arrayList) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, true);
        k0Var.f211872n = new f93.a2(this);
        k0Var.r(getString(com.tencent.mm.R.string.g9v), 17, i65.a.b(this, 14), null);
        k0Var.f211881s = new f93.b2(this, arrayList);
        k0Var.v();
    }

    public final void a7() {
        removeAllOptionMenu();
        this.f143255v = true;
        this.A.f305901p = 1;
        d7(this.B);
        android.view.View view = this.f143243g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f143246m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f143248o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f143250q.setEnabled(false);
        this.K.setText("");
        this.K.setVisibility(4);
        this.f143250q.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478720fb));
        setMMTitle(getString(com.tencent.mm.R.string.f492369g91));
        if (!this.f143257x) {
            android.view.View view4 = this.f143256w;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "enterEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setBackBtn(this.W, com.tencent.mm.R.raw.icons_outlined_close);
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 3L, 0L, 0L, 0L);
    }

    public final void b7() {
        removeAllOptionMenu();
        this.f143255v = false;
        if (this.A.f305903r > 0) {
            b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 8L, this.A.f305903r, 0L, 0L);
        }
        k93.j jVar = this.A;
        jVar.f305901p = 0;
        jVar.E();
        d7(this.B);
        this.f143254u.I.f305885b = false;
        android.view.View view = this.f143243g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f143246m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f143248o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        setMMTitle(getString(com.tencent.mm.R.string.g8t));
        setBackBtn(this.W, com.tencent.mm.R.raw.actionbar_icon_dark_back);
        android.view.View view4 = this.f143256w;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "exitEditLabelMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c7() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.c7():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if (r8.A.getItemCount() > (r8.A.A ? 2 : 0)) goto L54;
     */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(java.util.ArrayList r9) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.d7(java.util.ArrayList):void");
    }

    public void e7() {
        if (this.f143255v) {
            this.f143250q.setEnabled(this.A.f305894f.size() > 0);
            if (this.A.f305894f.size() > 0) {
                this.K.setVisibility(8);
                this.f143250q.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479291v7));
            } else {
                this.K.setVisibility(8);
                this.f143250q.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478720fb));
            }
            if (this.A.f305894f.size() <= 0) {
                this.f143250q.setText(getResources().getString(com.tencent.mm.R.string.bod));
                return;
            }
            this.f143250q.setText(getResources().getString(com.tencent.mm.R.string.bod) + " (" + this.A.f305894f.size() + ")");
        }
    }

    public final synchronized void f7(boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("");
        if (z17 && (n3Var = this.Q) != null) {
            n3Var.sendEmptyMessageDelayed(5002, 400L);
        }
        gm0.j1.e().j(new f93.z1(this, z17));
    }

    public final void g7() {
        if (this.f143259z) {
            k93.j jVar = this.A;
            if (jVar == null || jVar.f305894f.size() <= 0) {
                enableOptionMenu(1, false);
            } else {
                enableOptionMenu(1, true);
            }
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.f490502ww) + "(" + this.A.f305894f.size() + ")");
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public int getCustomBounceId() {
        return com.tencent.mm.R.id.hsa;
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2g;
    }

    public final void h7(f93.m2 m2Var) {
        this.f143241e = m2Var;
        int ordinal = m2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "unkonw mode:%s", this.f143241e + "");
                return;
            }
            android.view.View view = this.f143242f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f143252s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f143246m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view4 = this.f143242f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f143252s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f143257x) {
            android.view.View view6 = this.f143246m;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view7 = this.f143246m;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "updateMode", "(Lcom/tencent/mm/plugin/label/ui/ContactLabelManagerUI$Mode;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f143257x = getIntent().getBooleanExtra("select_label", false);
        this.f143258y = getIntent().getStringExtra("privacy_source_type");
        this.f143259z = getIntent().getBooleanExtra("intent_status_from_privacy_setting", false);
        setMMTitle(getString(com.tencent.mm.R.string.g8t));
        setBackBtn(this.W, com.tencent.mm.R.raw.actionbar_icon_dark_back);
        this.A = new k93.j(this);
        this.f143242f = findViewById(com.tencent.mm.R.id.hsc);
        this.f143252s = findViewById(com.tencent.mm.R.id.f485469hs4);
        this.f143253t = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.hsa);
        this.f143253t.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f143253t.setHasFixedSize(true);
        k93.c cVar = new k93.c(new k93.b(this.R));
        this.f143254u = cVar;
        cVar.d(this.f143253t);
        k93.c cVar2 = this.f143254u;
        cVar2.I.f305885b = false;
        this.A.f305900o = cVar2;
        this.f143246m = findViewById(com.tencent.mm.R.id.jiq);
        this.f143248o = findViewById(com.tencent.mm.R.id.f484151d61);
        this.f143249p = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485987js4);
        this.f143250q = (android.widget.Button) findViewById(com.tencent.mm.R.id.ctd);
        this.f143243g = findViewById(com.tencent.mm.R.id.auk);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k9k);
        android.view.View.OnClickListener onClickListener = this.T;
        textView.setOnClickListener(onClickListener);
        this.f143251r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d5y);
        this.K = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485209gx0);
        this.f143249p.setOnClickListener(new f93.k2(this));
        this.f143250q.setOnClickListener(new f93.l2(this));
        this.f143251r.setOnClickListener(new f93.p1(this));
        this.f143240J = new rl5.r(this);
        k93.j jVar = this.A;
        jVar.f305911z = new f93.q1(this);
        this.f143253t.setAdapter(jVar);
        boolean z17 = this.f143259z;
        if (z17 && this.f143257x) {
            this.A.f305901p = 2;
        }
        k93.j jVar2 = this.A;
        jVar2.f305906u = this.F;
        jVar2.E = new f93.r1(this);
        if (z17 && this.f143257x) {
            addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490502ww), new f93.s1(this), null, com.tencent.mm.ui.fb.GREEN);
            g7();
        }
        android.view.View view = this.f143246m;
        int i17 = !this.f143257x ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.k9l);
        this.f143244h = findViewById;
        findViewById.setOnClickListener(onClickListener);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.k9m);
        this.f143245i = weImageView;
        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(this, com.tencent.mm.R.raw.icons_outlined_add, i65.a.d(this, com.tencent.mm.R.color.f478524a5)));
        this.f143245i.setIconColor(getResources().getColor(com.tencent.mm.R.color.f478524a5));
        this.f143250q.setEnabled(false);
        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 1L, 0L, 0L, 0L);
        this.A.D = !this.f143257x;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.hsq);
        this.f143256w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new f93.t1(this));
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.i3c);
        this.f143247n = findViewById3;
        if (this.f143257x && (findViewById3.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f143247n.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f143247n.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            return;
        }
        if (i17 != 7001) {
            if (i17 == 8001) {
                java.lang.String stringExtra = intent.getStringExtra("contact_choose_label_list");
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra + "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    try {
                        for (java.lang.String str : com.tencent.mm.sdk.platformtools.t8.O1(stringExtra, ",")) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.A.f305894f.contains(str)) {
                                this.A.f305894f.add(str);
                            }
                        }
                        b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), 11L, r0.size(), 0L, 0L);
                        this.A.notifyDataSetChanged();
                        e7();
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } else if (this.f143257x && this.f143259z) {
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra2 + "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Select_Contact", stringExtra2);
            setResult(-1, intent2);
            finish();
        } else {
            java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "dz[onActivityResult] %s", stringExtra3 + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                android.content.Intent intent3 = new android.content.Intent(intent);
                intent3.putExtra("label_source", "label_source_Address");
                intent3.putExtra("last_page_source_type", 1);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactEditLabel ");
                    intent3.setClass(this, com.tencent.mm.plugin.label.ui.ContactEditLabel.class);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "startActivity ContactLabelEditUI ");
                    intent3.setClass(this, com.tencent.mm.plugin.label.ui.ContactLabelEditUI.class);
                }
                intent3.putExtra("Select_Contact", stringExtra3);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/label/ui/ContactLabelManagerUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        gm0.j1.e().j(new f93.u1(this));
        b93.r.wi().add(this.U);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16097, 2, 0, 2);
        if (getIntent().getBooleanExtra("label_edit_mode", false)) {
            a7();
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.ContactLabelManagerUI)).Rj(this, iy1.a.Tags);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.storage.d4 z17;
        int i17 = ((android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo).position;
        k93.j jVar = this.A;
        if (jVar != null && i17 >= 0 && (z17 = jVar.z(i17)) != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = view.getContext();
            java.lang.String str = z17.field_labelName;
            ((ke0.e) xVar).getClass();
            contextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490367t0));
        }
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        b93.r.wi().remove(this.U);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 0 || !this.f143255v) {
            return super.onKeyDown(i17, keyEvent);
        }
        c7();
        return true;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = ((android.widget.AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position;
        k93.j jVar = this.A;
        if (jVar == null || i18 < 0) {
            return;
        }
        com.tencent.mm.storage.d4 z17 = jVar.z(i18);
        if (i17 != 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(z17);
        Z6(arrayList);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(636, this);
        c01.d9.e().q(5882, this);
        ((l75.a1) c01.d9.b().q()).e(this.V);
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.label.ui.ContactLabelBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        c01.d9.e().a(636, this);
        c01.d9.e().a(5882, this);
        ((l75.a1) c01.d9.b().q()).a(this.V);
        if (this.N) {
            f7(true);
        } else {
            this.N = true;
        }
        super.onResume();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int type = m1Var.getType();
        if (type != 636) {
            if (type != 5882) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "unknow type.");
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort fail.");
                return;
            } else if (((r45.bh) ((e93.b) m1Var).f250352d.f70711b.f70700a).f370756d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success is this type.");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "[onSceneEnd] sort success no this type.");
                return;
            }
        }
        if (i17 == 0 && i18 == 0) {
            java.util.ArrayList arrayList = ((e93.c) m1Var).f250358g;
            if (b93.r.wi().P0(arrayList)) {
                hideLoading();
                f7(false);
                if (arrayList != null && arrayList.size() > 0) {
                    if (this.A != null) {
                        java.util.Iterator it = arrayList.iterator();
                        i19 = 0;
                        while (it.hasNext()) {
                            i19 += ((java.lang.Integer) this.A.f305906u.get(java.lang.Integer.valueOf(((com.tencent.mm.storage.d4) it.next()).field_labelID))).intValue();
                        }
                    } else {
                        i19 = 0;
                    }
                    b93.n.a(getIntent().getIntExtra("key_label_click_source", 0), this.P == 2 ? 7L : 12L, arrayList.size(), 0L, i19);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[doDeleteContactLabel] fail.");
                hideLoading();
                db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", new f93.w0(this));
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.Label.ContactLabelManagerUI", "cpan[onSceneEnd] delete fail.");
            hideLoading();
            db5.e1.t(this, getString(com.tencent.mm.R.string.f491043bo5), "", new f93.w0(this));
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436646f, vg3.c.f436669x, i18, null, 16, null));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(j93.w.class);
    }
}
