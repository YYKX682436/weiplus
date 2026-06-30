package com.tencent.mm.plugin.sns.ui.visiblerange;

/* loaded from: classes11.dex */
public abstract class BaseSelectVisibleRangeUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int D = 0;
    public zd4.m A;
    public java.util.ArrayList B;
    public int C;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.listview.AnimatedExpandableListView f170674e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f170675f;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.xk f170683q;

    /* renamed from: r, reason: collision with root package name */
    public zd4.o f170684r;

    /* renamed from: s, reason: collision with root package name */
    public int f170685s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f170686t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f170687u;

    /* renamed from: v, reason: collision with root package name */
    public int f170688v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f170689w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f170690x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f170691y;

    /* renamed from: z, reason: collision with root package name */
    public zd4.p f170692z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170673d = ",";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f170676g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170677h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f170678i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f170679m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f170680n = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f170681o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f170682p = false;

    public BaseSelectVisibleRangeUI() {
        b7();
        this.f170685s = 0;
        this.f170686t = false;
        this.f170687u = false;
    }

    public static /* synthetic */ int T6(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int i17 = baseSelectVisibleRangeUI.f170688v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return i17;
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11455, "", "", 0, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue() + 1;
        gm0.j1.i();
        gm0.j1.u().c().w(335874, java.lang.Integer.valueOf(intValue));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("RecordTagToLabelFailed", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.B = null;
        baseSelectVisibleRangeUI.f170687u = false;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = baseSelectVisibleRangeUI.f170689w;
        if (u3Var != null && u3Var.isShowing()) {
            baseSelectVisibleRangeUI.f170689w.dismiss();
        }
        db5.e1.m(baseSelectVisibleRangeUI, baseSelectVisibleRangeUI.d7() > 1 ? com.tencent.mm.R.string.f493217jc2 : com.tencent.mm.R.string.f493218jc3, com.tencent.mm.R.string.f490507x1, new zd4.b(baseSelectVisibleRangeUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleTransformError", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public static void V6(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI, int i17, java.util.ArrayList arrayList, java.lang.String str, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        baseSelectVisibleRangeUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.xk xkVar = baseSelectVisibleRangeUI.f170683q;
        if (xkVar == null || xkVar.f171539j != 1) {
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("insertOrRemove", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public static /* synthetic */ java.util.ArrayList W6(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        java.util.ArrayList arrayList = baseSelectVisibleRangeUI.f170675f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return arrayList;
    }

    public static void X6(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (arrayList == null || arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.List j17 = ((b93.b) c93.a.a()).j(str);
            if (j17 == null || j17.isEmpty()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BaseSelectVisibleRangeUI", "remove invalid lable:%s", str);
                it.remove();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLabelListValid", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public com.tencent.mm.plugin.sns.ui.x6 Y6(android.content.Context context, zd4.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createListAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.x6 x6Var = new com.tencent.mm.plugin.sns.ui.x6(context, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createListAdapter", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return x6Var;
    }

    public abstract zd4.o Z6();

    public void a7(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public int b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDefaultVisibleState", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return 0;
    }

    public android.content.Intent c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        android.content.Intent intent = new android.content.Intent();
        if (this.f170684r.o(this.f170688v, 2)) {
            intent.putStringArrayListExtra("label_id", this.f170683q.f171543n);
        } else if (this.f170684r.o(this.f170688v, 3)) {
            intent.putStringArrayListExtra("label_id", this.f170683q.f171544o);
        }
        intent.setClassName(this, "com.tencent.mm.plugin.label.ui.ContactLabelSelectUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectLabelIntent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return intent;
    }

    public final int d7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(335874, 0)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagToLabelFailedTime", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return intValue;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            e7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return dispatchKeyEvent;
    }

    public void e7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        int i17 = this.f170684r.i(this.f170683q.f171540k);
        boolean z17 = true;
        if (this.f170683q.f171540k == this.f170685s ? (!this.f170684r.b(i17, 2) || (com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171543n, ",").equals(this.f170677h) && com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171545p, ",").equals(this.f170679m) && com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171547r, ",").equals(this.f170680n))) && (!this.f170684r.b(i17, 3) || (com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171544o, ",").equals(this.f170677h) && com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171546q, ",").equals(this.f170679m) && com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171548s, ",").equals(this.f170680n))) : (!this.f170684r.b(i17, 2) || (this.f170683q.f171543n.size() == 0 && this.f170683q.f171545p.size() == 0)) && ((!this.f170684r.b(i17, 3) || (this.f170683q.f171544o.size() == 0 && this.f170683q.f171546q.size() == 0)) && !this.f170684r.b(i17, 1) && !this.f170684r.b(i17, 0) && !this.f170684r.b(i17, 6) && !this.f170684r.b(i17, 4))) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelectChange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (z17) {
            db5.e1.K(this, true, getString(com.tencent.mm.R.string.jbg), "", getString(com.tencent.mm.R.string.jbf), getString(com.tencent.mm.R.string.jbe), new zd4.k(this), new zd4.l(this));
        } else {
            f7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public final void f7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ktag_range_index", this.f170685s);
        if (this.f170684r.o(this.f170685s, 2) || this.f170684r.o(this.f170685s, 3)) {
            intent.putExtra("Klabel_name_list", this.f170676g);
            intent.putExtra("Kother_user_name_list", this.f170679m);
            intent.putExtra("Kchat_room_name_list", this.f170680n);
            intent.putExtra("Kexclude_all_friends", this.f170682p);
        }
        boolean o17 = this.f170684r.o(this.f170685s, 2);
        java.util.ArrayList arrayList = this.f170678i;
        if (o17) {
            intent.putExtra("label_id", arrayList);
        } else if (this.f170684r.o(this.f170685s, 3)) {
            intent.putExtra("label_id", arrayList);
        }
        a7(intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBackWithStates", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void g7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "gotoSelectContact: ");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.tencent.mm.R.string.jbt));
        intent.putExtra("snsPostWhoCanSee", true);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206790k));
        if (this.f170684r.o(this.f170688v, 2)) {
            if (this.f170683q.f171545p.size() > 0) {
                intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171545p, ","));
            }
        } else if (this.f170684r.o(this.f170688v, 3) && this.f170683q.f171546q.size() > 0) {
            intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171546q, ","));
        }
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", this.C);
        intent.putExtra("max_limit_num", Integer.MAX_VALUE);
        intent.putExtra("menu_label", i65.a.r(getContext(), com.tencent.mm.R.string.f490352sk));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return com.tencent.mm.R.layout.cs8;
    }

    public void h7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "goto select group");
        startActivityForResult(c7(), com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectLabel", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public boolean i7(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        if (com.tencent.mm.plugin.sns.model.j4.a() && getIntent().getBooleanExtra("Kis_with_together", false) && this.f170684r.b(i17, 1)) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
            u1Var.g(getString(com.tencent.mm.R.string.jhr));
            u1Var.m(com.tencent.mm.R.string.f490454vi);
            u1Var.q(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        int i18 = this.f170684r.i(this.f170683q.f171540k);
        int n17 = this.f170684r.n(i17);
        if (!this.f170684r.p(this.f170683q.f171540k, n17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onGroupClick: newState:%d failed, oldState:%d", java.lang.Integer.valueOf(this.f170683q.f171540k), java.lang.Integer.valueOf(n17));
            if (this.f170684r.o(n17, 2) || this.f170684r.o(n17, 3)) {
                this.f170674e.c(i17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.U(n17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "user click [previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (!this.f170684r.b(i17, 2) && !this.f170684r.b(i17, 3)) {
            if (!this.f170684r.b(i17, 0) && !this.f170684r.b(i17, 1) && !this.f170684r.b(i17, 6)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                return false;
            }
            enableOptionMenu(true);
            if (this.f170684r.b(i18, 2) || this.f170684r.b(i18, 3)) {
                this.f170674e.c(i18);
            }
            this.f170683q.f171540k = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return false;
        }
        java.util.ArrayList arrayList = this.B;
        if (arrayList != null && arrayList.size() != 0 && d7() == 0) {
            this.f170688v = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            db5.e1.y(this, getString(com.tencent.mm.R.string.f493220jc5), null, getString(com.tencent.mm.R.string.f493219jc4), new zd4.i(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[previousGroup: need transform]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            return true;
        }
        if (i18 != i17) {
            if (this.f170684r.b(i18, 2)) {
                this.f170674e.collapseGroup(this.f170684r.i(2));
                enableOptionMenu(j7());
                if (android.text.TextUtils.isEmpty(this.f170679m)) {
                    this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171545p, ",");
                }
            } else if (this.f170684r.b(i18, 3)) {
                this.f170674e.collapseGroup(this.f170684r.i(3));
                enableOptionMenu(k7());
                if (android.text.TextUtils.isEmpty(this.f170679m)) {
                    this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171546q, ",");
                }
            } else if (this.f170684r.b(i18, 1) || this.f170684r.b(i18, 0) || this.f170684r.b(i18, 6) || this.f170684r.b(i18, 4)) {
                enableOptionMenu(j7() || k7());
            }
            this.f170674e.post(new zd4.c(this, i17));
        } else if (this.f170674e.isGroupExpanded(i17)) {
            this.f170674e.c(i17);
        } else {
            this.f170674e.d(i17);
        }
        this.f170683q.f171540k = n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOnGroupClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean booleanExtra = getIntent().getBooleanExtra("KLabel_is_filter_private", false);
        this.f170674e = (com.tencent.mm.ui.widget.listview.AnimatedExpandableListView) findViewById(com.tencent.mm.R.id.n9k);
        java.util.ArrayList arrayList = (java.util.ArrayList) ((b93.b) c93.a.a()).d();
        this.f170675f = arrayList;
        com.tencent.mm.plugin.sns.ui.xk xkVar = this.f170683q;
        xkVar.f171542m = booleanExtra;
        xkVar.l(arrayList);
        android.widget.AbsListView.LayoutParams layoutParams = new android.widget.AbsListView.LayoutParams(-1, -2);
        layoutParams.height = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi);
        android.view.View view = new android.view.View(this);
        view.setLayoutParams(layoutParams);
        this.f170674e.addHeaderView(view);
        this.f170674e.setAdapter(this.f170683q);
        if (this.f170684r.o(this.f170683q.f171540k, 2)) {
            this.f170674e.expandGroup(this.f170684r.i(2));
        } else if (this.f170684r.o(this.f170683q.f171540k, 3)) {
            this.f170674e.expandGroup(this.f170684r.i(3));
        }
        this.f170674e.setOnGroupClickListener(new zd4.e(this));
        this.f170674e.setOnChildClickListener(new zd4.f(this));
        setBackBtn(new zd4.g(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.jbc), new zd4.h(this), null, com.tencent.mm.ui.fb.GREEN);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public boolean j7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = (this.f170683q.f171544o.isEmpty() && this.f170683q.f171546q.isEmpty() && !this.f170683q.f171534e) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectExcludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z17;
    }

    public boolean k7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        boolean z17 = (this.f170683q.f171543n.isEmpty() && this.f170683q.f171545p.isEmpty()) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectIncludeData", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        return z17;
    }

    public void l7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f170689w;
        if (u3Var != null && u3Var.isShowing()) {
            this.f170689w.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void m7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        zd4.p pVar = this.f170692z;
        if (pVar == null || !pVar.C6()) {
            android.content.Intent intent = new android.content.Intent();
            if (this.f170684r.o(this.f170683q.f171540k, 2)) {
                this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171545p, ",");
                this.f170680n = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171547r, ",");
                X6(this.f170683q.f171543n);
                intent.putStringArrayListExtra("label_id", this.f170683q.f171543n);
                intent.putExtra("Klabel_name_list", ((android.text.SpannableStringBuilder) com.tencent.mm.plugin.sns.ui.xk.k(this.f170683q.f171543n, false, -1)).toString());
                intent.putExtra("Kother_user_name_list", this.f170679m);
                intent.putExtra("Kchat_room_name_list", this.f170680n);
            } else if (this.f170684r.o(this.f170683q.f171540k, 3)) {
                this.f170679m = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171546q, ",");
                this.f170680n = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171548s, ",");
                X6(this.f170683q.f171544o);
                intent.putStringArrayListExtra("label_id", this.f170683q.f171544o);
                intent.putExtra("Klabel_name_list", ((android.text.SpannableStringBuilder) com.tencent.mm.plugin.sns.ui.xk.k(this.f170683q.f171544o, false, -1)).toString());
                intent.putExtra("Kother_user_name_list", this.f170679m);
                intent.putExtra("Kchat_room_name_list", this.f170680n);
                intent.putExtra("Kexclude_all_friends", this.f170683q.f171534e);
            }
            intent.putExtra("Ktag_range_index", this.f170683q.f171540k);
            a7(intent);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[saveAndExit] dynamicChangeVisibleRange result=%b", java.lang.Boolean.valueOf(this.f170692z.I3()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAndExit", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    public void n7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f170689w = db5.e1.Q(this, null, i65.a.r(getContext(), com.tencent.mm.R.string.f493212jb3), false, true, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showProgressDialog", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "requestCode:%d resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 4005) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("label_id");
            X6(stringArrayListExtra2);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult select label back, mTempSelectGroup:%d, labels:%s", java.lang.Integer.valueOf(this.f170688v), com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra2, ","));
            if (stringArrayListExtra2 != null) {
                if (this.f170684r.o(this.f170688v, 2)) {
                    this.f170683q.f171543n.clear();
                    this.f170683q.f171543n.addAll(stringArrayListExtra2);
                    enableOptionMenu(k7());
                } else if (this.f170684r.o(this.f170688v, 3)) {
                    this.f170683q.f171544o.clear();
                    this.f170683q.f171544o.addAll(stringArrayListExtra2);
                    this.f170683q.f171534e = false;
                    enableOptionMenu(j7());
                } else {
                    z17 = false;
                    this.f170683q.notifyDataSetChanged();
                }
                z17 = true;
                this.f170683q.notifyDataSetChanged();
            } else {
                z17 = false;
            }
            if (z17 && (stringArrayListExtra = intent.getStringArrayListExtra("contact_select_label_id_list_from_search")) != null) {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
                int i19 = this.f170688v;
                s0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.util.Set w17 = s0Var.w(i19);
                if (w17 != null) {
                    w17.addAll(stringArrayListExtra);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSearchLabelOfDynaLabel", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        if (i18 == -1 && i17 == 4003) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "the Activity completed");
            java.lang.String stringExtra = intent.getStringExtra("Select_Contacts_To_Create_New_Label");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.sns.ui.xk xkVar = this.f170683q;
                xkVar.f171534e = false;
                xkVar.notifyDataSetChanged();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Contact", stringExtra);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                    j45.l.n(getContext(), "label", ".ui.ContactEditLabel", intent2, 4002);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                    j45.l.n(getContext(), "label", ".ui.ContactLabelEditUI", intent2, 4002);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("Select_Contact");
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra2 + "");
            if (this.f170684r.o(this.f170688v, 2)) {
                this.f170683q.e();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f170683q.f171545p.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f170683q.f171540k = this.f170688v;
                }
                enableOptionMenu(k7());
            } else if (this.f170684r.o(this.f170688v, 3)) {
                this.f170683q.d();
                this.f170683q.f171534e = false;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    this.f170683q.f171546q.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(",")));
                    this.f170683q.f171540k = this.f170688v;
                }
                enableOptionMenu(j7());
            }
            this.f170683q.notifyDataSetChanged();
            this.f170674e.expandGroup(this.f170684r.i(this.f170688v));
            str2 = "onActivityResult";
            str3 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
        } else {
            str = "";
            if (i18 == -1 && i17 == 4001) {
                java.lang.String stringExtra3 = intent.getStringExtra("Select_Contact");
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra3 + str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Select_Contact", stringExtra3);
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                        j45.l.n(getContext(), "label", ".ui.ContactEditLabel", intent3, 4002);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                        j45.l.n(getContext(), "label", ".ui.ContactLabelEditUI", intent3, 4002);
                    }
                }
            } else if (i18 == 0 && i17 == 4002 && intent != null) {
                java.lang.String stringExtra4 = intent.getStringExtra("k_sns_label_add_label");
                this.f170690x = intent.getStringExtra("k_sns_label_add_label");
                java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("k_sns_label_add_label_usernames");
                this.f170691y = stringArrayListExtra3;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = stringExtra4 == null ? str : stringExtra4;
                java.lang.String str4 = this.f170690x;
                objArr[1] = str4 != null ? str4 : "";
                objArr[2] = com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra3, ",");
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onActivityResult add label edit name,addedLabel:%s, addLabel:%s, addLabelUserNames:%s", objArr);
                this.f170674e.postDelayed(new zd4.j(this, stringExtra4), 600L);
            } else if (i18 == -1 && i17 == 4004) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "the Activity completed");
                java.lang.String stringExtra5 = intent.getStringExtra("select_chatrooms");
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "dz[onActivityResult] %s", stringExtra5 + str);
                if (this.f170684r.o(this.f170688v, 2)) {
                    this.f170683q.f171547r.clear();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                        this.f170683q.f171547r.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
                        this.f170683q.f171540k = this.f170688v;
                    }
                } else if (this.f170684r.o(this.f170688v, 3)) {
                    this.f170683q.f171548s.clear();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5)) {
                        this.f170683q.f171548s.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra5.split(",")));
                        this.f170683q.f171540k = this.f170688v;
                    }
                }
                this.f170683q.notifyDataSetChanged();
                this.f170674e.expandGroup(this.f170684r.i(this.f170688v));
            }
            str2 = "onActivityResult";
            str3 = "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[%d]onCreate", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f493249jg0);
        this.A = new zd4.m(new java.lang.ref.WeakReference(this));
        gm0.j1.i();
        gm0.j1.n().f273288b.a(kd1.c.CTRL_INDEX, this.A);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(638, this.A);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this.A);
        zd4.o Z6 = Z6();
        this.f170684r = Z6;
        com.tencent.mm.plugin.sns.ui.x6 Y6 = Y6(this, Z6);
        this.f170683q = Y6;
        zd4.d dVar = new zd4.d(this);
        Y6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        Y6.f171549t = dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInnerClickListener", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        android.content.Intent intent = getIntent();
        if (intent == null) {
            b7();
            this.f170685s = 0;
            this.f170683q.f171539j = 0;
            this.f170676g = null;
            this.f170679m = null;
            this.f170680n = null;
        } else {
            this.C = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 10);
            zd4.p pVar = this.f170692z;
            if (pVar == null || !pVar.C6()) {
                this.f170686t = intent.getBooleanExtra("Kis_from_finder", false);
                b7();
                this.f170685s = intent.getIntExtra("KLabel_range_index", 0);
                this.f170676g = intent.getStringExtra("Klabel_name_list");
                this.f170679m = intent.getStringExtra("Kother_user_name_list");
                this.f170680n = intent.getStringExtra("Kchat_room_name_list");
                boolean booleanExtra = intent.getBooleanExtra("Kexclude_all_friends", false);
                this.f170682p = booleanExtra;
                com.tencent.mm.plugin.sns.ui.xk xkVar = this.f170683q;
                xkVar.f171533d = this.f170681o;
                xkVar.f171534e = booleanExtra;
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
                if (com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra)) {
                    stringArrayListExtra = new java.util.ArrayList<>();
                }
                X6(stringArrayListExtra);
                boolean o17 = this.f170684r.o(this.f170685s, 2);
                java.util.ArrayList arrayList = this.f170678i;
                if (o17) {
                    if (intent.hasExtra("label_id")) {
                        arrayList.addAll(stringArrayListExtra);
                        this.f170683q.f171543n.clear();
                        this.f170683q.f171543n.addAll(stringArrayListExtra);
                        this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171543n, ",");
                    }
                    if (!android.text.TextUtils.isEmpty(this.f170679m)) {
                        this.f170683q.f171545p = com.tencent.mm.sdk.platformtools.t8.P1(this.f170679m.split(","));
                    }
                    java.lang.String str = this.f170680n;
                    if (str != null && !str.isEmpty()) {
                        this.f170683q.f171547r = com.tencent.mm.sdk.platformtools.t8.P1(this.f170680n.split(","));
                    }
                } else if (this.f170684r.o(this.f170685s, 3)) {
                    if (intent.hasExtra("label_id")) {
                        arrayList.addAll(stringArrayListExtra);
                        this.f170683q.f171544o.clear();
                        this.f170683q.f171544o.addAll(stringArrayListExtra);
                        this.f170677h = com.tencent.mm.sdk.platformtools.t8.c1(this.f170683q.f171544o, ",");
                    }
                    if (!android.text.TextUtils.isEmpty(this.f170679m)) {
                        this.f170683q.f171546q = com.tencent.mm.sdk.platformtools.t8.P1(this.f170679m.split(","));
                    }
                    java.lang.String str2 = this.f170680n;
                    if (str2 != null && !str2.isEmpty()) {
                        this.f170683q.f171548s = com.tencent.mm.sdk.platformtools.t8.P1(this.f170680n.split(","));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "FromPostedFeed init result=%b", java.lang.Boolean.valueOf(this.f170692z.A6()));
            }
        }
        if (!android.text.TextUtils.isEmpty(intent.getStringExtra("k_sns_label_ui_title"))) {
            setMMTitle(intent.getStringExtra("k_sns_label_ui_title"));
        }
        this.f170683q.f171539j = intent.getIntExtra("k_sns_label_ui_style", 0);
        com.tencent.mm.plugin.sns.ui.xk xkVar2 = this.f170683q;
        xkVar2.f171540k = this.f170685s;
        xkVar2.f171541l = this.f170686t;
        if (xkVar2.f171539j == 1) {
            findViewById(com.tencent.mm.R.id.n9l).setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        }
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(kd1.c.CTRL_INDEX, this.A);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(638, this.A);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this.A);
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.widget.listview.AnimatedExpandableListView animatedExpandableListView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "onResume");
        if (this.f170683q != null && this.f170690x == null && (animatedExpandableListView = this.f170674e) != null) {
            animatedExpandableListView.postDelayed(new zd4.a(this), 600L);
        }
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
    }
}
