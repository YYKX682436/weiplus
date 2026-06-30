package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class SnsLabelUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int C = 0;
    public java.util.ArrayList A;
    public java.util.ArrayList B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.AnimatedExpandableListView f167219d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f167220e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167221f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f167222g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f167223h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f167224i;

    /* renamed from: m, reason: collision with root package name */
    public ae4.a f167225m;

    /* renamed from: n, reason: collision with root package name */
    public int f167226n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167227o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167228p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167229q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f167230r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f167231s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167232t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f167233u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f167234v;

    /* renamed from: w, reason: collision with root package name */
    public int f167235w;

    /* renamed from: x, reason: collision with root package name */
    public int f167236x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f167237y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f167238z;

    public static /* synthetic */ ae4.a T6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = snsLabelUI.f167225m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return aVar;
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = snsLabelUI.f167225m;
        if (aVar == null || aVar.f4359g != 1) {
            if (arrayList.contains(str)) {
                arrayList.remove(str);
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.drawable.f481256oo);
            } else {
                arrayList.add(str);
                if (i17 == 1) {
                    ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                } else {
                    ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.checkbox_selected_red);
                }
            }
        } else if (arrayList.contains(str)) {
            arrayList.remove(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected);
            } else {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
            }
        } else {
            arrayList.add(str);
            if (i17 == 1) {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected);
            } else {
                ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.n9h)).setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public static /* synthetic */ java.util.ArrayList V6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = snsLabelUI.f167220e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList W6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI, java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f167220e = arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ java.util.ArrayList X6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = snsLabelUI.f167238z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return arrayList;
    }

    public static /* synthetic */ int Y6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        int i17 = snsLabelUI.f167231s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i17;
    }

    public static /* synthetic */ int Z6(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        snsLabelUI.f167231s = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.listview.AnimatedExpandableListView a7(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView = snsLabelUI.f167219d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return animatedExpandableListView;
    }

    public final void b7() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList2 = this.f167220e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            java.util.ArrayList arrayList3 = this.f167225m.f4363k;
            if (arrayList3 != null) {
                arrayList3.clear();
            }
            java.util.ArrayList arrayList4 = this.f167225m.f4364l;
            if (arrayList4 != null) {
                arrayList4.clear();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        int i17 = this.f167226n;
        if (i17 == 2 && (arrayList = this.f167225m.f4363k) != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f167220e.contains(str)) {
                    arrayList5.add(str);
                }
            }
            this.f167225m.f4363k.removeAll(arrayList5);
        } else if (i17 == 3) {
            java.util.Iterator it6 = this.f167225m.f4364l.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!this.f167220e.contains(str2)) {
                    arrayList5.add(str2);
                }
            }
            this.f167225m.f4364l.removeAll(arrayList5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkInnerSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void c7() {
        java.util.ArrayList P1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.util.ArrayList arrayList = this.f167220e;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f167221f = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String str = this.f167221f;
        if (str != null && (P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","))) != null) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!this.f167220e.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            P1.removeAll(arrayList2);
            this.f167221f = com.tencent.mm.sdk.platformtools.t8.c1(P1, ",");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOuterSelectedLabelNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final int d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return intValue;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            e7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return dispatchKeyEvent;
    }

    public final void e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        ae4.a aVar = this.f167225m;
        int i17 = aVar.f4360h;
        boolean z17 = true;
        if (i17 == this.f167226n ? (i17 != 2 || (com.tencent.mm.sdk.platformtools.t8.c1(aVar.f4363k, ",").equals(this.f167221f) && com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4365m, ",").equals(this.f167222g) && com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4367o, ",").equals(this.f167223h))) && (i17 != 3 || (com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4364l, ",").equals(this.f167221f) && com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4366n, ",").equals(this.f167222g) && com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4368p, ",").equals(this.f167223h))) : (i17 != 2 || (aVar.f4363k.size() == 0 && this.f167225m.f4365m.size() == 0)) && ((i17 != 3 || (this.f167225m.f4364l.size() == 0 && this.f167225m.f4366n.size() == 0)) && i17 != 1 && i17 != 0)) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.tencent.mm.R.string.jbg), "", getString(com.tencent.mm.R.string.jbf), getString(com.tencent.mm.R.string.jbe), new com.tencent.mm.plugin.sns.ui.vk(this), new com.tencent.mm.plugin.sns.ui.wk(this));
        } else {
            f7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f167226n);
        int i17 = this.f167226n;
        if (i17 == 2 || i17 == 3) {
            c7();
            intent.putExtra("Klabel_name_list", this.f167221f);
            intent.putExtra("Kother_user_name_list", this.f167222g);
            intent.putExtra("Kchat_room_name_list", this.f167223h);
        }
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    public final void g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11455, "", "", java.lang.Integer.valueOf(this.f167235w), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        this.f167238z = null;
        this.f167230r = false;
        this.f167229q = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167232t;
        if (u3Var != null && u3Var.isShowing()) {
            this.f167232t.dismiss();
        }
        if (this.f167228p) {
            this.f167228p = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else {
            db5.e1.m(this, d7() > 1 ? com.tencent.mm.R.string.f493217jc2 : com.tencent.mm.R.string.f493218jc3, com.tencent.mm.R.string.f490507x1, new com.tencent.mm.plugin.sns.ui.mk(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        return com.tencent.mm.R.layout.cs8;
    }

    public final void h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        android.content.Intent intent = new android.content.Intent();
        ae4.a aVar = this.f167225m;
        int i17 = aVar.f4360h;
        if (i17 == 2) {
            this.f167221f = com.tencent.mm.sdk.platformtools.t8.c1(aVar.f4363k, ",");
            this.f167222g = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4365m, ",");
            this.f167223h = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4367o, ",");
            this.f167224i = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4369q, ",");
            c7();
            intent.putExtra("Klabel_name_list", this.f167221f);
            intent.putExtra("Kother_user_name_list", this.f167222g);
            intent.putExtra("Kchat_room_name_list", this.f167223h);
            intent.putExtra("KNew_label_name_list", this.f167224i);
        } else if (i17 == 3) {
            this.f167221f = com.tencent.mm.sdk.platformtools.t8.c1(aVar.f4364l, ",");
            this.f167222g = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4366n, ",");
            this.f167223h = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4368p, ",");
            this.f167224i = com.tencent.mm.sdk.platformtools.t8.c1(this.f167225m.f4370r, ",");
            c7();
            intent.putExtra("Klabel_name_list", this.f167221f);
            intent.putExtra("Kother_user_name_list", this.f167222g);
            intent.putExtra("Kchat_room_name_list", this.f167223h);
            intent.putExtra("KNew_label_name_list", this.f167224i);
        }
        intent.putExtra("Ktag_range_index", this.f167225m.f4360h);
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f167219d = (com.tencent.mm.ui.widget.listview.AnimatedExpandableListView) findViewById(com.tencent.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f167220e = arrayList;
        ae4.a aVar = this.f167225m;
        aVar.f4362j = booleanExtra;
        aVar.h(arrayList);
        b7();
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f167219d.addHeaderView(view);
        this.f167219d.setAdapter(this.f167225m);
        int i17 = this.f167225m.f4360h;
        if (i17 == 2) {
            this.f167219d.expandGroup(2);
        } else if (i17 == 3) {
            this.f167219d.expandGroup(3);
        }
        this.f167219d.setOnGroupClickListener(new com.tencent.mm.plugin.sns.ui.pk(this));
        this.f167219d.setOnChildClickListener(new com.tencent.mm.plugin.sns.ui.qk(this));
        setBackBtn(new com.tencent.mm.plugin.sns.ui.rk(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.jbc), new com.tencent.mm.plugin.sns.ui.sk(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 4003) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                    j45.l.n(getContext(), "label", ".ui.ContactEditLabel", intent2, 4002);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                    j45.l.n(getContext(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra2 + "");
            int i19 = this.f167231s;
            if (i19 == 2) {
                this.f167225m.f4365m.clear();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f167225m.f4365m.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f167225m.f4360h = this.f167231s;
                }
            } else if (i19 == 3) {
                this.f167225m.f4366n.clear();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f167225m.f4366n.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f167225m.f4360h = this.f167231s;
                }
            }
            this.f167225m.notifyDataSetChanged();
            this.f167219d.expandGroup(this.f167231s);
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
        } else {
            if (i18 == -1 && i17 == 4001) {
                java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra3 + "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Select_Contact", stringExtra3);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactEditLabel ");
                        j45.l.n(getContext(), "label", ".ui.ContactEditLabel", intent3, 4002);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "startActivity ContactLabelEditUI ");
                        j45.l.n(getContext(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                    }
                }
            } else if (i18 == 0 && i17 == 4002 && intent != null) {
                java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
                this.f167233u = intent.getStringExtra("k_sns_label_add_label");
                this.f167234v = intent.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f167219d.postDelayed(new com.tencent.mm.plugin.sns.ui.uk(this, stringExtra4), 600L);
            } else if (i18 == -1 && i17 == 4004) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "the Activity completed");
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[onActivityResult] %s", stringExtra5 + "");
                int i27 = this.f167231s;
                if (i27 == 2) {
                    this.f167225m.f4367o.clear();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                        this.f167225m.f4367o.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
                        this.f167225m.f4360h = this.f167231s;
                    }
                } else if (i27 == 3) {
                    this.f167225m.f4368p.clear();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                        this.f167225m.f4368p.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
                        this.f167225m.f4360h = this.f167231s;
                    }
                }
                this.f167225m.notifyDataSetChanged();
                this.f167219d.expandGroup(this.f167231s);
            }
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsLabelUI";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "onCreate");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f493249jg0);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(kd1.c.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(638, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        ae4.a aVar = new ae4.a(this);
        this.f167225m = aVar;
        com.tencent.mm.plugin.sns.ui.nk nkVar = new com.tencent.mm.plugin.sns.ui.nk(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        aVar.f4371s = nkVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.visiblerange.oldversion.OldSnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            this.f167226n = 0;
            this.f167225m.f4359g = 0;
            this.f167221f = null;
            this.f167222g = null;
            this.f167223h = null;
        } else {
            this.f167227o = intent.getBooleanExtra("Kis_from_text_status", false);
            this.f167226n = intent.getIntExtra("KLabel_range_index", 0);
            this.f167225m.f4359g = intent.getIntExtra("k_sns_label_ui_style", 0);
            this.f167221f = intent.getStringExtra("Klabel_name_list");
            this.f167222g = intent.getStringExtra("Kother_user_name_list");
            this.f167223h = intent.getStringExtra("Kchat_room_name_list");
            this.f167236x = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
                setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
            }
        }
        ae4.a aVar2 = this.f167225m;
        aVar2.f4360h = this.f167226n;
        aVar2.f4361i = this.f167227o;
        if (aVar2.f4359g == 1) {
            findViewById(com.tencent.mm.R.id.n9l).setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        }
        int i17 = this.f167226n;
        if (i17 == 2) {
            if (!android.text.TextUtils.isEmpty(this.f167221f)) {
                this.f167225m.f4363k = com.tencent.mm.sdk.platformtools.t8.P1(this.f167221f.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f167222g)) {
                this.f167225m.f4365m = com.tencent.mm.sdk.platformtools.t8.P1(this.f167222g.split(","));
            }
            java.lang.String str = this.f167223h;
            if (str != null && !str.isEmpty()) {
                this.f167225m.f4367o = com.tencent.mm.sdk.platformtools.t8.P1(this.f167223h.split(","));
            }
        } else if (i17 == 3) {
            if (!android.text.TextUtils.isEmpty(this.f167221f)) {
                this.f167225m.f4364l = com.tencent.mm.sdk.platformtools.t8.P1(this.f167221f.split(","));
            }
            if (!android.text.TextUtils.isEmpty(this.f167222g)) {
                this.f167225m.f4366n = com.tencent.mm.sdk.platformtools.t8.P1(this.f167222g.split(","));
            }
            java.lang.String str2 = this.f167223h;
            if (str2 != null && !str2.isEmpty()) {
                this.f167225m.f4368p = com.tencent.mm.sdk.platformtools.t8.P1(this.f167223h.split(","));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(335873, java.lang.Boolean.TRUE)).booleanValue()) {
            this.f167229q = true;
            this.f167230r = true;
            if (d7() >= 1) {
                this.f167228p = true;
            }
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagNames", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(kd1.c.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(638, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        super.onDestroy();
        dx1.g.f244489a.j("SnsPublishProcess", "privacyPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "onResume");
        if (this.f167225m != null && this.f167233u == null && (animatedExpandableListView = this.f167219d) != null) {
            animatedExpandableListView.postDelayed(new com.tencent.mm.plugin.sns.ui.kk(this), 600L);
        }
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0246, code lost:
    
        if (r13 != false) goto L80;
     */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, com.tencent.mm.modelbase.m1 r15) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsLabelUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
