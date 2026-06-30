package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class EnterpriseConversationUI extends com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f207344f;

    /* loaded from: classes11.dex */
    public static class EnterpriseConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI implements l75.z0 {

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f207345d;

        /* renamed from: g, reason: collision with root package name */
        public android.widget.TextView f207348g;

        /* renamed from: h, reason: collision with root package name */
        public android.widget.ListView f207349h;

        /* renamed from: i, reason: collision with root package name */
        public com.tencent.mm.ui.conversation.q7 f207350i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f207351m;

        /* renamed from: o, reason: collision with root package name */
        public com.tencent.mm.sdk.platformtools.n3 f207353o;

        /* renamed from: v, reason: collision with root package name */
        public int f207360v;

        /* renamed from: w, reason: collision with root package name */
        public dg5.i f207361w;

        /* renamed from: x, reason: collision with root package name */
        public dg5.u f207362x;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f207346e = null;

        /* renamed from: f, reason: collision with root package name */
        public android.view.View f207347f = null;

        /* renamed from: n, reason: collision with root package name */
        public int f207352n = 0;

        /* renamed from: p, reason: collision with root package name */
        public boolean f207354p = false;

        /* renamed from: q, reason: collision with root package name */
        public long f207355q = 0;

        /* renamed from: r, reason: collision with root package name */
        public long f207356r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f207357s = -2;

        /* renamed from: t, reason: collision with root package name */
        public long f207358t = 0;

        /* renamed from: u, reason: collision with root package name */
        public java.lang.String f207359u = null;

        /* renamed from: y, reason: collision with root package name */
        public final r01.p f207363y = new com.tencent.mm.ui.conversation.h4(this);

        public static dg5.v l0(com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI, com.tencent.mm.ui.conversation.p7 p7Var) {
            enterpriseConversationFmUI.getClass();
            if (p7Var == null) {
                return null;
            }
            int i17 = p7Var.f207963a;
            if (i17 == 0 && p7Var.f207966d != null) {
                if (enterpriseConversationFmUI.f207361w == null) {
                    enterpriseConversationFmUI.f207361w = new dg5.i(enterpriseConversationFmUI.f207287ui, new com.tencent.mm.ui.conversation.d4(enterpriseConversationFmUI));
                }
                return enterpriseConversationFmUI.f207361w;
            }
            if (i17 != 1 || p7Var.f207965c == null) {
                return null;
            }
            if (enterpriseConversationFmUI.f207362x == null) {
                enterpriseConversationFmUI.f207362x = new dg5.u(enterpriseConversationFmUI.f207287ui, enterpriseConversationFmUI.f207351m);
            }
            return enterpriseConversationFmUI.f207362x;
        }

        @Override // l75.z0
        public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment
        /* renamed from: getLayoutId */
        public int getF72225d() {
            return com.tencent.mm.R.layout.a9_;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI
        public java.lang.String getUserName() {
            return this.f207351m;
        }

        public final void m0() {
            int a17 = com.tencent.mm.ui.h4.a(getContext(), this.f207351m);
            this.f207352n = a17;
            if (a17 == 2 && this.f207346e == null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.atj);
                this.f207346e = linearLayout;
                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479627b2);
                this.f207346e.setLayoutParams(layoutParams);
                this.f207347f = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a9a, (android.view.ViewGroup) this.f207346e, false);
                float q17 = i65.a.q(getContext());
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f207347f.findViewById(com.tencent.mm.R.id.h6y);
                int i17 = (int) (q17 * cdnImageView.getLayoutParams().height);
                cdnImageView.getLayoutParams().height = i17;
                cdnImageView.getLayoutParams().width = i17;
                cdnImageView.requestLayout();
                android.widget.TextView textView = (android.widget.TextView) this.f207347f.findViewById(com.tencent.mm.R.id.odf);
                r01.q bj6 = r01.q3.bj();
                r01.q3.bj();
                java.lang.String z07 = bj6.z0(0);
                if (z07 == null || z07.length() <= 0) {
                    textView.setText(com.tencent.mm.R.string.c1o);
                } else {
                    textView.setText(z07);
                }
                int D0 = r01.q3.bj().D0();
                if (D0 != 0) {
                    textView.setTextColor(D0);
                }
                r01.q3.bj().getClass();
                if (r01.q.f368186g == null) {
                    r01.q.f368186g = new r45.ud();
                }
                java.lang.String str = r01.q.f368186g.f387251g;
                if (str != null && str.length() > 0) {
                    cdnImageView.setUrl(str);
                }
                com.tencent.mm.ui.h4.e(this.f207351m, 1, 2);
                this.f207346e.addView(this.f207347f);
                this.f207347f.setOnClickListener(new com.tencent.mm.ui.conversation.l4(this));
                android.app.Activity context = getContext();
                java.lang.String str2 = this.f207351m;
                if (com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.wework")) {
                    com.tencent.mm.ui.h4.f(str2, 4, 3);
                } else {
                    com.tencent.mm.ui.h4.f(str2, 5, 3);
                }
                com.tencent.mm.ui.h4.d(getContext(), this.f207351m);
            }
            android.widget.LinearLayout linearLayout2 = this.f207346e;
            if (linearLayout2 != null) {
                if (this.f207352n != 2) {
                    linearLayout2.setVisibility(8);
                    return;
                }
                linearLayout2.setVisibility(0);
                r01.m y07 = r01.q3.bj().y0(this.f207351m);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13656, java.lang.Integer.valueOf(y07 != null ? y07.field_qyUin : 0), java.lang.Integer.valueOf(y07 != null ? y07.field_userUin : 0), 6, 3, java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L));
            }
        }

        public final void n0() {
            if (this.f207350i == null) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f207353o;
            if (n3Var == null) {
                this.f207353o = new com.tencent.mm.ui.conversation.g4(this);
            } else {
                n3Var.removeMessages(1);
            }
            this.f207353o.sendEmptyMessageDelayed(1, 500L);
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            super.onActivityCreated(bundle);
            this.f207351m = thisActivity().getIntent().getStringExtra("enterprise_biz_name");
            this.f207345d = thisActivity().getIntent().getStringExtra("enterprise_biz_display_name");
            this.f207360v = thisActivity().getIntent().getIntExtra("enterprise_from_scene", 5);
            setMMTitle(this.f207345d);
            this.f207349h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            this.f207348g = textView;
            textView.setText(com.tencent.mm.R.string.c1a);
            setBackBtn(new com.tencent.mm.ui.conversation.i4(this));
            setToTop(new com.tencent.mm.ui.conversation.j4(this));
            if (r01.z.b(this.f207351m) != null) {
                m0();
                if (this.f207351m != null) {
                    r01.q3.bj().b1(this.f207351m, new com.tencent.mm.ui.conversation.k4(this));
                    com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseConversationUI", "update father attr from svr bizName:%s", this.f207351m);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseConversationUI", "bizName is null!!!");
                }
                addIconOptionMenu(1, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.ui.conversation.m4(this));
                addIconOptionMenu(2, com.tencent.mm.R.string.f489817cl, com.tencent.mm.R.raw.actionbar_icon_dark_add, new dg5.n(this.f207287ui, this.f207351m));
                com.tencent.mm.ui.conversation.q7 q7Var = new com.tencent.mm.ui.conversation.q7(thisActivity(), this.f207351m, new com.tencent.mm.ui.conversation.n4(this));
                this.f207350i = q7Var;
                q7Var.f208023q.getClass();
                q7Var.f208024r.getClass();
                com.tencent.mm.ui.conversation.q7 q7Var2 = this.f207350i;
                q7Var2.f208023q.getClass();
                q7Var2.f208024r.getClass();
                com.tencent.mm.ui.conversation.q7 q7Var3 = this.f207350i;
                q7Var3.f208023q.getClass();
                q7Var3.f208024r.getClass();
                this.f207349h.setAdapter((android.widget.ListAdapter) this.f207350i);
                this.f207349h.setOnItemClickListener(new com.tencent.mm.ui.conversation.c4(this));
                android.graphics.Point point = new android.graphics.Point();
                this.f207349h.setOnTouchListener(new com.tencent.mm.ui.conversation.e4(this, point));
                this.f207349h.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.f4(this, point));
            }
            this.f207355q = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.storage.m4) c01.d9.b().r()).p(this.f207351m);
            if (p17 != null) {
                int d17 = p17.d1();
                this.f207357s = d17;
                if (d17 == 0 && p17.f1() > 0) {
                    this.f207357s = -1;
                }
                this.f207358t = p17.w0() / 1000;
                this.f207359u = p17.Q0() == 1 ? null : p17.z0();
            }
            r01.q3.bj().f368188e.a(this.f207363y, thisActivity().getMainLooper());
            ((l75.a1) c01.d9.b().r()).a(this);
            ((l75.a1) c01.d9.b().q()).a(this);
            n0();
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityResult(int i17, int i18, android.content.Intent intent) {
            super.onActivityResult(i17, i18, intent);
            if (i17 == 1 && i18 == -1 && intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("be_send_card_name");
                java.lang.String stringExtra2 = intent.getStringExtra("received_card_name");
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                java.lang.String stringExtra3 = intent.getStringExtra("custom_send_text");
                ((dk5.s5) tg3.t1.a()).Di(stringExtra, stringExtra2, booleanExtra, null);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra3, stringExtra2);
                com.tencent.mm.ui.widget.snackbar.j.c(getContext().getString(com.tencent.mm.R.string.f_p), null, thisActivity(), null, null);
            }
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            r01.q bj6 = r01.q3.bj();
            r01.p pVar = this.f207363y;
            l75.v0 v0Var = bj6.f368188e;
            if (v0Var != null) {
                v0Var.j(pVar);
            }
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this);
                ((l75.a1) c01.d9.b().q()).e(this);
            }
            com.tencent.mm.ui.conversation.q7 q7Var = this.f207350i;
            if (q7Var != null) {
                com.tencent.mm.ui.conversation.b4 b4Var = q7Var.f208023q;
                b4Var.C.d();
                java.util.HashMap hashMap = b4Var.f207468r;
                if (hashMap != null) {
                    hashMap.clear();
                    b4Var.f207468r = null;
                }
                b4Var.c();
                b4Var.f212611h = null;
                ((l75.a1) c01.d9.b().r()).e(b4Var);
                hb5.m mVar = q7Var.f208024r;
                java.util.HashMap hashMap2 = mVar.f280232z;
                if (hashMap2 != null) {
                    hashMap2.clear();
                    mVar.f280232z = null;
                }
                r01.q3.aj().remove(mVar);
                l75.v0 v0Var2 = r01.q3.aj().f401872e;
                if (v0Var2 != null) {
                    v0Var2.j(mVar);
                }
                android.database.DataSetObserver dataSetObserver = q7Var.f208025s;
                b4Var.unregisterDataSetObserver(dataSetObserver);
                mVar.unregisterDataSetObserver(dataSetObserver);
            }
            dg5.u uVar = this.f207362x;
            if (uVar != null) {
                c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, uVar);
            }
            long j17 = this.f207355q;
            if (j17 > 0) {
                long j18 = this.f207356r;
                if (j18 > 0) {
                    long j19 = j18 - j17;
                    r01.m y07 = r01.q3.bj().y0(this.f207351m);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13465, "", java.lang.Integer.valueOf(y07 != null ? y07.field_qyUin : 0), 0, java.lang.Integer.valueOf(y07 != null ? y07.field_userUin : 0), 1, java.lang.Long.valueOf(j19));
                }
            }
            super.onDestroy();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(this.f207351m);
            com.tencent.mm.ui.conversation.q7 q7Var = this.f207350i;
            if (q7Var != null) {
                com.tencent.mm.ui.conversation.b4 b4Var = q7Var.f208023q;
                db5.c6 c6Var = b4Var.f207469s;
                if (c6Var != null) {
                    c6Var.c();
                }
                b4Var.f207473w = false;
                hb5.m mVar = q7Var.f208024r;
                db5.c6 c6Var2 = mVar.f280223q;
                if (c6Var2 != null) {
                    c6Var2.c();
                }
                mVar.A = false;
            }
            super.onPause();
            this.f207354p = true;
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            java.util.HashMap hashMap;
            dg5.i iVar = this.f207361w;
            if (iVar != null) {
                long j17 = iVar.f232372f;
                if (0 != j17) {
                    dg5.h hVar = iVar.f232371e;
                    if (hVar != null) {
                        try {
                            ((com.tencent.mm.ui.conversation.d4) hVar).f207630a.f207350i.f208024r.u(j17);
                        } catch (java.lang.Throwable unused) {
                        }
                    }
                    iVar.f232372f = 0L;
                }
            }
            com.tencent.mm.ui.conversation.q7 q7Var = this.f207350i;
            if (q7Var != null) {
                com.tencent.mm.ui.conversation.b4 b4Var = q7Var.f208023q;
                b4Var.f207473w = true;
                android.text.format.Time time = new android.text.format.Time();
                time.setToNow();
                java.lang.String charSequence = k35.s.a("MM/dd", time).toString();
                boolean z17 = !b4Var.f207475y.equals(charSequence);
                b4Var.f207475y = charSequence;
                if (z17 && (hashMap = b4Var.f207468r) != null) {
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.ui.conversation.z3) ((java.util.Map.Entry) it.next()).getValue()).f208294b = null;
                    }
                }
                if (b4Var.f207474x) {
                    b4Var.f();
                    b4Var.f207474x = false;
                }
                hb5.m mVar = q7Var.f208024r;
                mVar.A = true;
                if (mVar.B) {
                    mVar.f();
                    mVar.B = false;
                }
            }
            super.onResume();
            if (!c01.e2.J(this.f207351m)) {
                finish();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseConversationUI", "onResume needCheck:%s", java.lang.Boolean.valueOf(this.f207354p));
            if (this.f207354p) {
                n0();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null && (baseConversationFmUI instanceof com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI)) {
            com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI enterpriseConversationFmUI = (com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI) baseConversationFmUI;
            enterpriseConversationFmUI.getClass();
            enterpriseConversationFmUI.f207356r = java.lang.System.currentTimeMillis() / 1000;
        }
        super.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateContentViewMargin(this.f207344f);
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488229nn, (android.view.ViewGroup) null);
        this.f207344f = inflate;
        setContentView(inflate);
        this.conversationFm = new com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        o25.n1.d(this, this.f207344f);
    }
}
