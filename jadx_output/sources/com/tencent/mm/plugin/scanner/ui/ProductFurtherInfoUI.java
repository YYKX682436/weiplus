package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class ProductFurtherInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f159298d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMPageControlView f159299e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f159300f;

    /* renamed from: g, reason: collision with root package name */
    public e04.m3 f159301g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f159302h;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.ca7;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ca6;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494911bd;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getIntent().getStringExtra("key_title"));
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.u(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.scanner.ui.w(this));
        this.f159298d = getPreferenceScreen();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f159301g.f246025a.iterator();
        while (it.hasNext()) {
            arrayList.add(((e04.k3) it.next()).f246005a);
        }
        this.f159300f = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.kod);
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = (com.tencent.mm.ui.base.MMPageControlView) findViewById(com.tencent.mm.R.id.hc7);
        this.f159299e = mMPageControlView;
        mMPageControlView.setIndicatorLayoutRes(com.tencent.mm.R.layout.c8v);
        this.f159299e.setVisibility(0);
        this.f159300f.setOnTouchListener(new com.tencent.mm.plugin.scanner.ui.x(this));
        this.f159300f.setOnPageChangeListener(new com.tencent.mm.plugin.scanner.ui.y(this));
        com.tencent.mm.plugin.scanner.ui.a0 a0Var = new com.tencent.mm.plugin.scanner.ui.a0(this, this);
        this.f159300f.setAdapter(a0Var);
        if (arrayList.size() > 0) {
            a0Var.f159497e = arrayList;
            com.tencent.mm.ui.base.MMPageControlView mMPageControlView2 = this.f159299e;
            mMPageControlView2.f197514e = arrayList.size();
            mMPageControlView2.a(0);
            a0Var.notifyDataSetChanged();
            this.f159300f.setVisibility(0);
        }
        for (int i17 = 0; i17 < this.f159301g.f246026b.size(); i17++) {
            e04.l3 l3Var = (e04.l3) this.f159301g.f246026b.get(i17);
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
            preference.C(i17 + "");
            preference.G = com.tencent.mm.R.layout.c2y;
            preference.L(l3Var.f246020a);
            preference.H(l3Var.f246021b);
            ((com.tencent.mm.ui.base.preference.h0) this.f159298d).d(preference, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f159298d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        e04.m3 m3Var;
        super.onCreate(bundle);
        e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b17 == null || (m3Var = b17.f246033b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProductFurtherInfoUI", "initView(), product or product field detail null -> finish");
            finish();
        } else {
            this.f159301g = m3Var;
            this.f159302h = b17.field_feedbackurl;
            initView();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }
}
