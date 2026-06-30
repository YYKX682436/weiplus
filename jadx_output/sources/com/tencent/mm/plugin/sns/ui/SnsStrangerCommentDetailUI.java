package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsStrangerCommentDetailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f167423y = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f167424d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsCommentFooter f167425e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f167426f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f167427g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f167428h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f167429i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f167430m;

    /* renamed from: n, reason: collision with root package name */
    public long f167431n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f167432o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.kj f167433p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.hr f167434q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f167435r;

    /* renamed from: v, reason: collision with root package name */
    public int f167439v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f167440w;

    /* renamed from: s, reason: collision with root package name */
    public boolean f167436s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f167437t = -1;

    /* renamed from: u, reason: collision with root package name */
    public boolean f167438u = false;

    /* renamed from: x, reason: collision with root package name */
    public final l75.q0 f167441x = new com.tencent.mm.plugin.sns.ui.zq(this);

    public static /* synthetic */ android.widget.ListView T6(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        android.widget.ListView listView = snsStrangerCommentDetailUI.f167424d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return listView;
    }

    public static /* synthetic */ com.tencent.mm.storage.z3 U6(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.storage.z3 z3Var = snsStrangerCommentDetailUI.f167440w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return z3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013a  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.V6():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        return com.tencent.mm.R.layout.f489496cr0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f167424d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482833p7);
        this.f167425e = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) findViewById(com.tencent.mm.R.id.c76);
        this.f167426f = android.view.View.inflate(this, com.tencent.mm.R.layout.cts, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initHeader", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f167427g = (android.widget.LinearLayout) this.f167426f.findViewById(com.tencent.mm.R.id.f482874qg);
        this.f167429i = (android.widget.ImageView) this.f167426f.findViewById(com.tencent.mm.R.id.f482806od);
        this.f167430m = (android.widget.TextView) this.f167426f.findViewById(com.tencent.mm.R.id.f482882qo);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(this.f167429i, this.f167432o.getUserName(), pc4.d.f353410a.l());
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String userName = this.f167432o.getUserName();
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(userName);
        android.widget.TextView textView = this.f167430m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f167430m.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this, e17, textSize));
        this.f167429i.setContentDescription(java.lang.String.format(getResources().getString(com.tencent.mm.R.string.j1u), e17));
        V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f167428h).size(); i17++) {
            com.tencent.mm.plugin.sns.ui.oj ojVar = new com.tencent.mm.plugin.sns.ui.oj();
            ojVar.f170102a = this.f167432o.getLocalid();
            ojVar.f170103b = i17;
            ((android.view.View) ((java.util.ArrayList) this.f167428h).get(i17)).setTag(ojVar);
            ((android.view.View) ((java.util.ArrayList) this.f167428h).get(i17)).setOnClickListener(new com.tencent.mm.plugin.sns.ui.br(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initHeader", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommentList", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f167424d.addHeaderView(this.f167426f);
        this.f167434q = new com.tencent.mm.plugin.sns.ui.hr(this, this);
        this.f167424d.post(new com.tencent.mm.plugin.sns.ui.cr(this));
        this.f167424d.setAdapter((android.widget.ListAdapter) this.f167434q);
        this.f167424d.setOnScrollListener(new com.tencent.mm.plugin.sns.ui.dr(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommentList", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFooter", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        this.f167425e.setAfterEditAction(new com.tencent.mm.plugin.sns.ui.sq(this));
        this.f167425e.M();
        this.f167425e.L();
        this.f167425e.setOnCommentSendImp(new com.tencent.mm.plugin.sns.ui.tq(this));
        this.f167425e.setCommentHint(getString(com.tencent.mm.R.string.f493233je0) + this.f167435r + getString(com.tencent.mm.R.string.j8z));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFooter", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        setToTop(new com.tencent.mm.plugin.sns.ui.uq(this));
        setBackBtn(new com.tencent.mm.plugin.sns.ui.vq(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.sns.ui.wq(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStrangerCommentDetailUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
            return;
        }
        if (i17 == 1 && i18 == -1) {
            android.database.Cursor managedQuery = managedQuery(intent.getData(), null, null, null, null);
            if (managedQuery.moveToFirst()) {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.EDIT", android.net.Uri.parse("content://com.android.contacts/contacts/" + managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"))));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/SnsStrangerCommentDetailUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.j9r);
        this.f167431n = getIntent().getLongExtra("INTENT_SNSID", 0L);
        this.f167435r = getIntent().getStringExtra("INTENT_TALKER");
        this.f167432o = com.tencent.mm.plugin.sns.model.l4.Fj().W0(this.f167431n);
        this.f167439v = getIntent().getIntExtra("INTENT_SOURCE", -1);
        gm0.j1.i();
        this.f167440w = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f167435r, true);
        if (this.f167432o == null || this.f167435r == null) {
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        } else {
            this.f167433p = new com.tencent.mm.plugin.sns.ui.kj(this);
            com.tencent.mm.plugin.sns.model.l4.Aj().add(this.f167441x);
            initView();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Aj().remove(this.f167441x);
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        com.tencent.mm.plugin.sns.ui.hr hrVar = this.f167434q;
        if (hrVar != null) {
            hrVar.c();
        }
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        super.onResume();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        V6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
    }
}
