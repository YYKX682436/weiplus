package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsWsFoldDetailUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.ui.r4, com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f167635r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.Map f167636s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.Map f167637t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f167638u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f167639v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f167640w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f167641x;

    /* renamed from: z, reason: collision with root package name */
    public gc4.b f167643z;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f167624d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f167625e = null;

    /* renamed from: f, reason: collision with root package name */
    public sb4.h0 f167626f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.storage.e8 f167627g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.l1 f167628h = null;

    /* renamed from: i, reason: collision with root package name */
    public long f167629i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f167630m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f167631n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f167632o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f167633p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f167634q = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f167642y = false;
    public final i64.b1 A = new i64.b1(this, 0);
    public final com.tencent.mm.plugin.sns.ui.uv B = new com.tencent.mm.plugin.sns.ui.uv();
    public final com.tencent.mm.sdk.event.IListener C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GalleryPhotoInfoEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.1
        {
            this.__eventId = 1036677180;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
            com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent2 = galleryPhotoInfoEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
            am.ie ieVar = galleryPhotoInfoEvent2.f54355g;
            int i17 = ieVar.f6946b;
            int i18 = ieVar.f6945a;
            if (i18 >= 0 && i17 >= 0) {
                int i19 = com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.this;
                sb4.h0 h0Var = snsWsFoldDetailUI.f167626f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                if (i18 < h0Var.getCount()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                    com.tencent.mm.plugin.sns.ui.bs bsVar = snsWsFoldDetailUI.f167628h.f169709j;
                    bsVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    int count = bsVar.f168035a.getCount();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                    if (i18 >= count) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                    } else {
                        int firstVisiblePosition = (i18 - snsWsFoldDetailUI.f167628h.f169701b.getFirstVisiblePosition()) + snsWsFoldDetailUI.f167628h.f169701b.getHeaderViewsCount();
                        if (firstVisiblePosition >= snsWsFoldDetailUI.f167628h.f169701b.getChildCount()) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                        } else {
                            com.tencent.mm.plugin.sns.storage.SnsInfo c17 = snsWsFoldDetailUI.f167628h.f169709j.c(i18);
                            android.view.View childAt = snsWsFoldDetailUI.f167628h.f169701b.getChildAt(firstVisiblePosition);
                            if (childAt != null && childAt.getTag() != null && (childAt.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
                                if (c17 != null) {
                                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = c17.getTimeLine();
                                    if (c17.isPhoto() && timeLine.ContentObj.f369840h.size() == 4 && i17 > 1) {
                                        i17++;
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldDetailUI", "snsInfo is null");
                                }
                                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) childAt.getTag();
                                com.tencent.mm.plugin.sns.ui.PhotosContent photosContent = baseViewHolder.T;
                                android.view.View f17 = photosContent != null ? photosContent.f(i17) : baseViewHolder.f169265d0 != null ? baseViewHolder.f169300v : null;
                                if (f17 != null) {
                                    int[] iArr = new int[2];
                                    f17.getLocationOnScreen(iArr);
                                    int i27 = iArr[0];
                                    am.je jeVar = galleryPhotoInfoEvent2.f54356h;
                                    jeVar.f7027a = i27;
                                    jeVar.f7028b = iArr[1];
                                    jeVar.f7029c = f17.getWidth();
                                    jeVar.f7030d = f17.getHeight();
                                }
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
                    return false;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldDetailUI", "galleryPhotoInfoListener position error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$1");
            return false;
        }
    };

    @Override // com.tencent.mm.plugin.sns.ui.r4
    public boolean L5(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        boolean a17 = this.f167628h.f169717r.a(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return a17;
    }

    public final void T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnfoldFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        if (this.f167639v != null && this.f167640w != null && this.f167641x != null) {
            java.lang.String string = getString(com.tencent.mm.R.string.f493269ji4);
            com.tencent.mm.storage.z3 z3Var = this.f167635r;
            if (z3Var != null) {
                int i17 = z3Var.I;
                if (i17 == 1) {
                    string = getString(com.tencent.mm.R.string.f493268ji3);
                } else if (i17 == 2) {
                    string = getString(com.tencent.mm.R.string.f493267ji2);
                }
            }
            this.f167639v.setText(string);
            this.f167639v.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479232tk));
            android.view.View view = this.f167640w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f167641x;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setUnfoldFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f167639v.setOnClickListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnfoldFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.r4
    public boolean a1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        boolean d17 = this.f167628h.f169717r.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return d17;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return com.tencent.mm.R.layout.f489530cv0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int keyboardState() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        gc4.b bVar = this.f167643z;
        if (bVar == null || !bVar.b()) {
            int keyboardState = super.keyboardState();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            return keyboardState;
        }
        gc4.b bVar2 = this.f167643z;
        bVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        int i17 = bVar2.f270443g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDelegateKeyBoardState", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentAdjustNothingKeyboardStateDelegate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        return i17;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "on ActivityResult, requestCode %d, resultCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 26) {
            this.f167628h.f169710k.K(i18, intent);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        o25.n1.f(this);
        super.onCreate(bundle);
        boolean z17 = true;
        com.tencent.mm.ui.r0.a(this, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f167642y = false;
        this.f167629i = getIntent().getLongExtra("key_ws_group_id", 0L);
        this.f167630m = getIntent().getLongExtra("key_ws_detail_max_id", 0L);
        this.f167631n = getIntent().getLongExtra("key_ws_detail_min_id", 0L);
        this.f167632o = getIntent().getStringExtra("key_ws_detail_username");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "groupId:%s", java.lang.Long.valueOf(this.f167629i));
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_ws_str_sns_id_list");
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(stringArrayListExtra);
        java.util.List list = this.f167633p;
        if (!L0) {
            for (java.lang.String str : stringArrayListExtra) {
                long F0 = ca4.z0.F0(str);
                ((java.util.ArrayList) list).add(java.lang.Long.valueOf(F0));
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "snsId:%s-%s", str, java.lang.Long.valueOf(F0));
            }
        }
        gm0.j1.i();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        this.f167627g = Bi;
        if (Bi != null) {
            this.f167635r = Bi.n(this.f167632o, true);
        }
        this.f167634q = com.tencent.mm.plugin.sns.model.l4.sj();
        this.f167636s = new java.util.HashMap();
        this.f167637t = new java.util.HashMap();
        this.f167638u = new java.util.ArrayList();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        setMMTitle(com.tencent.mm.R.string.jhz);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        setBackBtn(new com.tencent.mm.plugin.sns.ui.vv(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.qy qyVar = new com.tencent.mm.plugin.sns.ui.qy(this);
        this.f167628h = qyVar;
        qyVar.f169711l = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.f487061nd2);
        this.f167628h.f169713n = new com.tencent.mm.plugin.sns.ui.kj(this);
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f167628h;
        l1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        i64.b1 b1Var = this.A;
        l1Var.f169702c = b1Var;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = l1Var.f169722w;
        if (iVar != null) {
            iVar.T(b1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f167624d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.ncz);
        this.f167625e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.f487059nd0);
        android.widget.ListView listView = this.f167624d;
        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f167628h;
        sb4.h0 h0Var = new sb4.h0(this, listView, l1Var2.f169722w, l1Var2, 10, com.tencent.mm.plugin.sns.model.l4.sj(), null);
        this.f167626f = h0Var;
        this.f167624d.setAdapter((android.widget.ListAdapter) h0Var);
        this.f167628h.f169719t = new ra4.b(this, this.f167626f.a().f168039e, this.f167628h.f169711l, null);
        com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f167628h;
        com.tencent.mm.plugin.sns.ui.listener.i iVar2 = this.f167626f.a().f168039e;
        com.tencent.mm.plugin.sns.ui.l1 l1Var4 = this.f167628h;
        l1Var3.f169718s = new com.tencent.mm.plugin.sns.ui.j(this, iVar2, l1Var4.f169711l, null, l1Var4.f169719t);
        this.f167628h.f169721v = new com.tencent.mm.plugin.sns.ui.ay(this, this.f167626f.a().f168039e, this.f167628h.f169711l, null);
        this.f167628h.f169720u = new com.tencent.mm.plugin.sns.ui.m7(this, this.f167626f.a().f168039e, this.f167628h.f169711l, (android.view.View) null);
        this.f167628h.f169717r = new com.tencent.mm.plugin.sns.ui.vx(this, this.f167626f.a(), this.f167628h.f169711l, null);
        this.f167628h.f169709j = this.f167626f.a();
        this.f167628h.f169710k = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) findViewById(com.tencent.mm.R.id.c76);
        this.f167628h.f169710k.setEnlargeEmoticonSmileyHeight(j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsCmtEmoFooterHeight()) == 1);
        this.f167628h.f169710k.setUseTransAniToLargeFooter(false);
        this.f167643z = new gc4.b(this, this.f167628h.f169710k);
        com.tencent.mm.plugin.sns.ui.l1 l1Var5 = this.f167628h;
        android.widget.ListView listView2 = this.f167624d;
        l1Var5.f169701b = listView2;
        l1Var5.f169712m = new com.tencent.mm.plugin.sns.ui.zx(listView2, l1Var5.f169710k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        if (this.f167624d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldDetailUI", "updateFooterView listview error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        } else {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ws_unfold_enable, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "setUnfoldBtn enable%s", java.lang.Boolean.valueOf(fj6));
            if (fj6) {
                android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.cuz, (android.view.ViewGroup) null);
                inflate.setMinimumHeight(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479663c1));
                this.f167639v = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ncc);
                this.f167640w = inflate.findViewById(com.tencent.mm.R.id.i09);
                this.f167641x = inflate.findViewById(com.tencent.mm.R.id.m3u);
                com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
                java.lang.String str2 = this.f167632o;
                qj6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                boolean contains = qj6.f168318h.contains(str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUnfold", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
                if (contains) {
                    T6();
                } else {
                    java.lang.String string = getString(com.tencent.mm.R.string.ji9);
                    com.tencent.mm.storage.z3 z3Var = this.f167635r;
                    if (z3Var != null) {
                        int i17 = z3Var.I;
                        if (i17 == 1) {
                            string = getString(com.tencent.mm.R.string.f493266ji1);
                        } else if (i17 == 2) {
                            string = getString(com.tencent.mm.R.string.f493265ji0);
                        }
                    }
                    this.f167639v.setText(string);
                    this.f167639v.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478524a5));
                    android.view.View view = this.f167640w;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view2 = this.f167641x;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI", "setFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f167639v.setOnClickListener(new com.tencent.mm.plugin.sns.ui.yv(this));
                }
                this.f167624d.addFooterView(inflate);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFooterView", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        }
        this.f167624d.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.wv(this));
        this.f167624d.setOnScrollListener(new com.tencent.mm.plugin.sns.ui.xv(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f167625e.setVisibility(0);
        this.f167624d.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        this.f167626f.d(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadRemoteData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.l2(list));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadRemoteData", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        gm0.j1.n().f273288b.a(5987, this);
        gm0.j1.n().f273288b.a(213, this);
        gm0.j1.n().f273288b.a(218, this);
        gm0.j1.n().f273288b.a(214, this);
        o25.n1.c(this);
        com.tencent.mm.plugin.sns.ui.uv uvVar = this.B;
        uvVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.sv svVar = new com.tencent.mm.plugin.sns.ui.sv(uvVar);
        com.tencent.mm.plugin.sns.ui.zm zmVar = uvVar.f170597a;
        zmVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        zmVar.f171700a = svVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        uvVar.f170598b = je4.b.f299316a.a(zmVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_WS_FOLD_AUTOPLAY_INT_SYNC, 0);
        if (r17 == 0 || r17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsWsFoldAutoPlayConfig", "com.tencent.mm.plugin.sns.model.SnsConfig");
            z17 = false;
        }
        uvVar.f170599c = z17;
        uvVar.f170600d = getSupportActionBar();
        uvVar.f170601e = this;
        uvVar.f170602f = (int) (getResources().getDisplayMetrics().heightPixels * 0.4d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        this.C.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onDestroy();
        this.f167642y = true;
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f167628h;
        if (l1Var != null) {
            l1Var.c();
        }
        this.f167627g = null;
        ((java.util.HashMap) this.f167636s).clear();
        ((java.util.HashMap) this.f167637t).clear();
        ((java.util.ArrayList) this.f167638u).clear();
        gm0.j1.n().f273288b.q(5987, this);
        gm0.j1.n().f273288b.q(213, this);
        gm0.j1.n().f273288b.q(218, this);
        gm0.j1.n().f273288b.q(214, this);
        sb4.h0 h0Var = this.f167626f;
        if (h0Var != null) {
            h0Var.a().getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.M();
        com.tencent.mm.plugin.sns.ui.uv uvVar = this.B;
        uvVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIDestroy");
        com.tencent.mm.plugin.sns.ui.zm zmVar = uvVar.f170597a;
        zmVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(zmVar.f171702c);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        zmVar.f171700a = null;
        zmVar.f171701b = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        this.C.dead();
        yc4.b0 b0Var = yc4.b0.f460839a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markExitWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        yc4.b0.f460842d = yc4.b0.f460840b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markExitWsDetail", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onKeyboardStateChanged() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onKeyboardStateChanged();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.zv(this));
        if (keyboardState() == 2) {
            com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f167628h;
            if (l1Var2 != null && (snsCommentFooter = l1Var2.f169710k) != null && !snsCommentFooter.y()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "onKeyBoardStateChange find");
            }
        } else if (keyboardState() == 1 && (l1Var = this.f167628h) != null) {
            l1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyBoardUp", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            if (l1Var.f169704e) {
                l1Var.f169704e = false;
                l1Var.f169712m.d();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyBoardUp", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onPause();
        com.tencent.mm.plugin.sns.ui.bs a17 = this.f167626f.a();
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        a17.f168060z.dead();
        a17.A.dead();
        a17.B.dead();
        a17.L.dead();
        a17.M.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.uv uvVar = this.B;
        uvVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIPause");
        if (uvVar.f170598b && uvVar.f170599c) {
            xd4.o0.d().i();
            xd4.g.a().b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        gc4.b bVar = this.f167643z;
        if (bVar != null) {
            bVar.a();
        }
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.bs a17 = this.f167626f.a();
        a17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        a17.f168060z.alive();
        a17.A.alive();
        a17.B.alive();
        a17.L.alive();
        a17.M.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.uv uvVar = this.B;
        uvVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldAutoPlayManager", "onUIResume");
        com.tencent.mm.plugin.sns.ui.zm zmVar = uvVar.f170597a;
        zmVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        zmVar.f171701b = zmVar.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        android.widget.ListView listView = this.f167624d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        kotlin.jvm.internal.o.g(listView, "listView");
        listView.postDelayed(new com.tencent.mm.plugin.sns.ui.tv(uvVar, listView), 15L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
        gc4.b bVar = this.f167643z;
        if (bVar != null) {
            bVar.c();
        }
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f167628h.f169710k;
        if (snsCommentFooter != null) {
            snsCommentFooter.B();
        }
        yc4.b0.f460839a.a();
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType());
        if (m1Var.getType() == 5987) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            r45.xf xfVar = ((com.tencent.mm.plugin.sns.model.l2) m1Var).f164380f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResp", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
            if (xfVar != null) {
                java.util.LinkedList linkedList = xfVar.f390044d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    com.tencent.mm.plugin.sns.model.s5.h("@__batch", 128, linkedList, ca4.z0.A(ca4.z0.t0(((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getFirst()).Id)));
                }
            }
        }
        if (m1Var.getType() == 218 && (m1Var instanceof com.tencent.mm.plugin.sns.model.q2)) {
            com.tencent.mm.plugin.sns.model.q2 q2Var = (com.tencent.mm.plugin.sns.model.q2) m1Var;
            if ((q2Var.L() == 1 || q2Var.L() == 6 || q2Var.L() == 4) && (u3Var = this.f167628h.f169723x) != null) {
                u3Var.dismiss();
            }
        }
        sb4.h0 h0Var = this.f167626f;
        if (h0Var != null) {
            h0Var.d(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
        super.onWindowFocusChanged(z17);
        gc4.b bVar = this.f167643z;
        if (bVar != null && z17) {
            bVar.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
    }
}
