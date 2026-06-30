package com.tencent.mm.plugin.welab.ui;

/* loaded from: classes15.dex */
public class WelabAppInfoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188082d;

    /* renamed from: e, reason: collision with root package name */
    public yy4.a f188083e;

    /* renamed from: f, reason: collision with root package name */
    public int f188084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f188085g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView f188086h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f188087i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f188088m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f188089n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f188090o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f188091p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f188092q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f188093r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f188094s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f188095t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f188096u;

    /* renamed from: v, reason: collision with root package name */
    public zy4.f f188097v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f188098w = new zy4.e(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d__;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        if (this.f188083e == null) {
            com.tencent.mars.xlog.Log.e("WelabAppInfoUI", "info is null");
            return;
        }
        setMMTitleVisibility(8);
        android.view.Window window = getWindow();
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aav));
        if (getSupportActionBar() != null) {
            getSupportActionBar().j().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.aav));
        }
        setBackBtn(new zy4.a(this));
        this.f188086h = (com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView) findViewById(com.tencent.mm.R.id.a19);
        this.f188087i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f188088m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ns9);
        this.f188089n = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.hat);
        this.f188090o = findViewById(com.tencent.mm.R.id.f483230a20);
        this.f188091p = (android.widget.Button) findViewById(com.tencent.mm.R.id.kio);
        this.f188092q = findViewById(com.tencent.mm.R.id.e0k);
        this.f188093r = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.btf);
        this.f188094s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ntu);
        this.f188095t = findViewById(com.tencent.mm.R.id.njf);
        this.f188096u = findViewById(com.tencent.mm.R.id.kib);
        this.f188089n.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 0, false));
        this.f188089n.setOverScrollMode(2);
        zy4.f fVar = new zy4.f(this);
        this.f188097v = fVar;
        this.f188089n.setAdapter(fVar);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setIsDarkActionbarBg(true);
        hideActionbarLine();
        android.content.Intent intent = getIntent();
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("para_appid");
            this.f188082d = stringExtra;
            yy4.a b17 = sy4.m.f413884c.b(stringExtra);
            this.f188083e = b17;
            this.f188084f = b17.field_Switch;
            this.f188085g = getIntent().getIntExtra("para_from_with_red_point", 0) == 1;
        }
        initView();
        sy4.r.a(this.f188082d, 2, this.f188085g);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f188084f != this.f188083e.field_Switch) {
            sy4.m mVar = sy4.m.f413884c;
            com.tencent.mars.xlog.Log.i("WelabAppInfoUI", "update welab info [%b] originSwitch[%d] newSwitch[%d]", java.lang.Boolean.valueOf(mVar.c().update(this.f188083e, new java.lang.String[0])), java.lang.Integer.valueOf(this.f188084f), java.lang.Integer.valueOf(this.f188083e.field_Switch));
            this.f188084f = this.f188083e.field_Switch;
            r45.i54 i54Var = new r45.i54();
            r45.h54 h54Var = new r45.h54();
            yy4.a aVar = this.f188083e;
            h54Var.f375854d = aVar.field_bItemFromXExpt == 1 ? 0 : com.tencent.mm.sdk.platformtools.t8.D1(aVar.field_expId, 0);
            yy4.a aVar2 = this.f188083e;
            h54Var.f375855e = aVar2.field_LabsAppId;
            h54Var.f375856f = aVar2.field_Switch != 2 ? 2 : 1;
            i54Var.f376747d.add(h54Var);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(207, i54Var));
            sy4.r.a(this.f188082d, this.f188083e.field_Switch == 2 ? 4 : 5, this.f188085g);
            if (this.f188083e.field_Switch == 2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.f188083e);
                mVar.f(arrayList);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String str;
        super.onResume();
        if (!this.f188083e.y0()) {
            android.view.View view = this.f188090o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (this.f188083e.field_Type != 1) {
            android.view.View view2 = this.f188090o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = this.f188090o;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setAppSiwtch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f188094s.setText(getResources().getString(com.tencent.mm.R.string.l_b) + this.f188083e.u0("field_Title"));
            android.content.SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
            this.f188093r.setEnabled(true);
            if (this.f188083e.field_Switch == 2) {
                sharedPreferences.edit().putBoolean("switch_" + this.f188083e.field_LabsAppId, true).commit();
                this.f188093r.setCheck(true);
            } else {
                sharedPreferences.edit().putBoolean("switch_" + this.f188083e.field_LabsAppId, false).commit();
                this.f188093r.setCheck(false);
            }
            this.f188093r.setSwitchListener(new zy4.b(this));
        }
        if (this.f188083e.y0()) {
            this.f188091p.setText(getResources().getString(com.tencent.mm.R.string.l__) + this.f188083e.u0("field_Title"));
            if (this.f188083e.field_Type == 1) {
                this.f188091p.setVisibility(8);
            } else {
                this.f188091p.setVisibility(0);
                this.f188091p.setOnClickListener(new zy4.c(this));
            }
        } else {
            this.f188091p.setVisibility(8);
        }
        this.f188087i.setText(sy4.m.f413884c.a(this.f188083e));
        this.f188088m.setText(this.f188083e.u0("field_Introduce"));
        if (this.f188083e.y0()) {
            android.view.View view4 = this.f188092q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f188092q.setOnClickListener(new zy4.d(this));
        } else {
            android.view.View view5 = this.f188092q;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setFeedbackState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f188083e.y0()) {
            android.view.View view6 = this.f188095t;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f188096u;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view8 = this.f188095t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view9 = this.f188096u;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/welab/ui/WelabAppInfoUI", "setLabWarningState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String u07 = this.f188083e.u0("field_ImgUrl_android");
        if (android.text.TextUtils.isEmpty(u07)) {
            u07 = this.f188083e.u0("field_ImgUrl");
        }
        java.util.List asList = android.text.TextUtils.isEmpty(u07) ? java.util.Collections.EMPTY_LIST : java.util.Arrays.asList(u07.split(";"));
        java.util.Iterator it = asList.iterator();
        while (it.hasNext()) {
            if (android.text.TextUtils.isEmpty((java.lang.String) it.next())) {
                it.remove();
            }
        }
        if (asList.isEmpty()) {
            this.f188089n.setVisibility(8);
        } else {
            this.f188089n.setVisibility(0);
            zy4.f fVar = this.f188097v;
            fVar.f477678d = asList;
            fVar.notifyDataSetChanged();
        }
        this.f188086h.setCornerRadiusPercent(0.5f);
        n11.a b17 = n11.a.b();
        sy4.m mVar = sy4.m.f413884c;
        yy4.a aVar = this.f188083e;
        mVar.getClass();
        uy4.w e17 = mVar.e(aVar.field_LabsAppId);
        if (e17 != null) {
            str = e17.xe(aVar.field_LabsAppId);
            com.tencent.mars.xlog.Log.i("WelabMgr", "get icon url from opener , appid %s, url %s", aVar.field_LabsAppId, str);
        } else {
            str = "";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = aVar.field_Icon;
        }
        b17.h(str, this.f188086h, mVar.f413886b);
    }
}
