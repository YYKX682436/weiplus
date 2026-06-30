package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSettingPersonalizedUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f128738o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f128739d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.CheckBoxPreference f128740e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f128741f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f128742g;

    /* renamed from: h, reason: collision with root package name */
    public r45.il5 f128743h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f128744i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f128745m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f128746n = jz5.h.b(new com.tencent.mm.plugin.finder.ui.rh(this));

    public final void V6() {
        boolean z17 = this.f128744i;
        this.f128745m = null;
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f128746n).getValue()).dead();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        g92.b.f269769e.M0(23).l().K(new com.tencent.mm.plugin.finder.ui.kh(z17));
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("action", str);
        jSONObject.put("rec_type", str2);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "individual_privacy", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public final void X6(boolean z17, boolean z18) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", z18 ? "live_personalized_setting" : "finder_newlife_personalized_setting");
        lVarArr[1] = new jz5.l("finder_context_id", this.f128742g);
        lVarArr[2] = new jz5.l("finder_tab_context_id", this.f128741f);
        lVarArr[3] = new jz5.l("purview_switch", java.lang.Integer.valueOf(z17 ? 1 : 0));
        ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
    }

    public final void Y6(boolean z17) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.ikb);
            e4Var.b(com.tencent.mm.R.raw.toast_ok);
            e4Var.c();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f128740e;
            if (checkBoxPreference != null && (mMSwitchBtn2 = checkBoxPreference.M) != null) {
                mMSwitchBtn2.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.ikb));
            }
        } else {
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = getContext().getString(com.tencent.mm.R.string.f492981ij5);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f128740e;
            if (checkBoxPreference2 != null && (mMSwitchBtn = checkBoxPreference2.M) != null) {
                mMSwitchBtn.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.f492981ij5));
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f460525a, z17, 2, null, 4, null);
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().getCustom(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().getCustom(17);
        if (e33Var != null) {
            e33Var.set(1, java.lang.Boolean.valueOf(z17));
        }
        bVar.S1(fVar, m92.j.f325005w);
    }

    public final void Z6(boolean z17) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2;
        com.tencent.mars.xlog.Log.i("FinderSettingPersonalizedUI", "setVideoRec " + z17);
        if (z17) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.ikb);
            e4Var.b(com.tencent.mm.R.raw.toast_ok);
            e4Var.c();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f128739d;
            if (checkBoxPreference != null && (mMSwitchBtn2 = checkBoxPreference.M) != null) {
                mMSwitchBtn2.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.ikb));
            }
        } else {
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.f211776c = getContext().getString(com.tencent.mm.R.string.f492981ij5);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f128739d;
            if (checkBoxPreference2 != null && (mMSwitchBtn = checkBoxPreference2.M) != null) {
                mMSwitchBtn.announceForAccessibility(getContext().getString(com.tencent.mm.R.string.f492981ij5));
            }
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.j9.a(ya2.r.f460525a, z17, 1, null, 4, null);
        g92.b bVar = g92.b.f269769e;
        m92.f fVar = new m92.f();
        if (((r45.e33) fVar.d().getCustom(17)) == null) {
            fVar.d().set(17, new r45.e33());
        }
        r45.e33 e33Var = (r45.e33) fVar.d().getCustom(17);
        if (e33Var != null) {
            e33Var.set(0, java.lang.Boolean.valueOf(z17));
        }
        bVar.S1(fVar, m92.j.f325005w);
    }

    public final void a7(android.content.Context context, java.lang.String str, boolean z17, yz5.a onConfirm, yz5.a onCancel) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489055du3, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_w);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        textView.setText(zy2.s6.l6((zy2.s6) c17, str == null ? "" : str, (int) textView.getTextSize(), false, null, 0, false, null, 120, null));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.c9x);
        android.widget.Button button2 = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.b5d);
        com.tencent.mm.ui.bk.r0(button.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(button2.getPaint(), 0.8f);
        button.setOnClickListener(new com.tencent.mm.plugin.finder.ui.sh(onConfirm, y1Var));
        button2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.th(onCancel, y1Var));
        y1Var.k(inflate);
        y1Var.f212038t = new com.tencent.mm.plugin.finder.ui.uh(onCancel);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_tab_context_id", this.f128741f);
        lVarArr[1] = new jz5.l("finder_context_id", this.f128742g);
        lVarArr[2] = new jz5.l("finder_username", xy2.c.e(this));
        lVarArr[3] = new jz5.l("cp_describe_type", java.lang.Integer.valueOf(z17 ? 2 : 1));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(button, "close_personalized_describe_close");
        ((cy1.a) aVar.ik(button, 8, 25496)).gk(button, k17);
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(button2, "close_personalized_describe_cancel");
        ((cy1.a) aVar2.ik(button2, 8, 25496)).gk(button2, k17);
        cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar3.pk(inflate, "close_personalized_describe");
        ((cy1.a) aVar3.ik(inflate, 32, 25496)).gk(inflate, k17);
        y1Var.s();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public android.view.View getBottomView() {
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eea, (android.view.ViewGroup) null);
        inflate.findViewById(com.tencent.mm.R.id.uvn).setOnClickListener(new com.tencent.mm.plugin.finder.ui.lh(this));
        return inflate;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494888ap;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.eth);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.qh(this));
        this.f128739d = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_allow_recommend_video");
        this.f128740e = (com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("settings_allow_recommend_live");
        r45.il5 il5Var = (r45.il5) g92.b.f269769e.k2().e().getCustom(19);
        this.f128743h = il5Var;
        if (il5Var == null || il5Var.getInteger(0) == 0) {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_allow_recommend_category", true);
        } else {
            ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).m("settings_allow_recommend_category", false);
        }
        if (il5Var == null || il5Var.getInteger(2) == 0) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.tuj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.tuj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f128742g = getIntent().getStringExtra("key_context_id");
        this.f128741f = getIntent().getStringExtra("key_click_tab_context_id");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getContext(), iy1.c.FinderSettingPersonalizedUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(getContext(), "WCFinderPersonalizedSettingViewController");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(getContext(), 12, 27010);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(getContext(), kz5.c1.k(new jz5.l("finder_context_id", this.f128742g), new jz5.l("finder_tab_context_id", this.f128741f), new jz5.l("finder_username", xy2.c.e(this))));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f128745m != null) {
            V6();
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        r45.il5 il5Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String str = preference != null ? preference.f197780q : null;
        com.tencent.mars.xlog.Log.i("FinderSettingPersonalizedUI", "click " + str);
        if (str != null) {
            switch (str.hashCode()) {
                case 643074675:
                    if (str.equals("settings_allow_recommend_category") && (il5Var = this.f128743h) != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) il5Var.getCustom(1)) != null) {
                        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U3).getValue()).r()).booleanValue()) {
                            r45.h33 h33Var = (r45.h33) g92.b.f269769e.k2().e().getCustom(20);
                            this.f128744i = h33Var != null ? h33Var.getBoolean(3) : false;
                            r45.k74 lite_app_info = finderJumpInfo.getLite_app_info();
                            java.lang.String string = lite_app_info != null ? lite_app_info.getString(0) : null;
                            boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                            com.tencent.mars.xlog.Log.i("FinderSettingPersonalizedUI", "[onPreferenceTreeClick] enter recommend category liteapp, appId=" + string + ", elderlyMode=" + this.f128744i + ", isTeenMode: " + isTeenMode);
                            if (!(string == null || string.length() == 0) && !isTeenMode) {
                                this.f128745m = string;
                                ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f128746n).getValue()).alive();
                            }
                        }
                        xc2.y2 y2Var = xc2.y2.f453343a;
                        androidx.appcompat.app.AppCompatActivity context = getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                        break;
                    }
                    break;
                case 645219110:
                    if (str.equals("settings_allow_recommend_video")) {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f128739d;
                        X6(checkBoxPreference != null ? checkBoxPreference.N() : true, false);
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f128739d;
                        if (checkBoxPreference2 != null) {
                            if (!checkBoxPreference2.N()) {
                                android.content.Context context2 = checkBoxPreference2.f197770d;
                                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                                a7(context2, context2.getString(((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() ? com.tencent.mm.R.string.mgc : com.tencent.mm.R.string.cl8, "<_wc_custom_img_ src=\"FinderObjectDynamicImageKey_FinderLikeOffIconPng\" color=\"#e5000000\" darkColor=\"#ccffffff\"/>"), false, new com.tencent.mm.plugin.finder.ui.oh(this), new com.tencent.mm.plugin.finder.ui.ph(checkBoxPreference2, this));
                                break;
                            } else {
                                Z6(true);
                                W6("1", "channel");
                                break;
                            }
                        }
                    }
                    break;
                case 990347489:
                    if (str.equals("settings_allow_recommend_live")) {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference3 = this.f128740e;
                        X6(checkBoxPreference3 != null ? checkBoxPreference3.N() : true, true);
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference4 = this.f128740e;
                        if (checkBoxPreference4 != null) {
                            if (!checkBoxPreference4.N()) {
                                android.content.Context context3 = checkBoxPreference4.f197770d;
                                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                                a7(context3, context3.getString(com.tencent.mm.R.string.cl6), true, new com.tencent.mm.plugin.finder.ui.mh(this), new com.tencent.mm.plugin.finder.ui.nh(checkBoxPreference4, this));
                                break;
                            } else {
                                Y6(true);
                                W6("1", "live");
                                break;
                            }
                        }
                    }
                    break;
                case 1217080283:
                    if (str.equals("settings_block_poster")) {
                        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        androidx.appcompat.app.AppCompatActivity context4 = getContext();
                        kotlin.jvm.internal.o.f(context4, "getContext(...)");
                        ((com.tencent.mm.plugin.finder.assist.i0) c17).mj(context4, null, 3);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        boolean a17 = hc2.e.a();
        r45.e33 e33Var = (r45.e33) g92.b.f269769e.k2().d().getCustom(17);
        boolean z17 = e33Var != null ? e33Var.getBoolean(1) : true;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f128739d;
        if (checkBoxPreference != null) {
            checkBoxPreference.O(a17);
            checkBoxPreference.f197785v = false;
        }
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = this.f128740e;
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.O(z17);
            checkBoxPreference2.f197785v = false;
        }
        ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).notifyDataSetChanged();
    }
}
