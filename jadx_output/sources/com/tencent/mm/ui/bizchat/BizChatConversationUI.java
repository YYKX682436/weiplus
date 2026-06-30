package com.tencent.mm.ui.bizchat;

/* loaded from: classes11.dex */
public class BizChatConversationUI extends com.tencent.mm.ui.conversation.presenter.BaseBizConversationUI {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f197895f;

    /* loaded from: classes11.dex */
    public static class BizChatConversationFmUI extends com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI implements l75.z0, r01.w2 {

        /* renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ int f197896y = 0;

        /* renamed from: d, reason: collision with root package name */
        public android.widget.TextView f197897d;

        /* renamed from: e, reason: collision with root package name */
        public android.widget.LinearLayout f197898e;

        /* renamed from: f, reason: collision with root package name */
        public android.widget.ListView f197899f;

        /* renamed from: g, reason: collision with root package name */
        public com.tencent.mm.ui.widget.dialog.u3 f197900g;

        /* renamed from: h, reason: collision with root package name */
        public hb5.m f197901h;

        /* renamed from: i, reason: collision with root package name */
        public db5.t4 f197902i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f197903m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f197904n;

        /* renamed from: o, reason: collision with root package name */
        public s01.a0 f197905o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f197906p;

        /* renamed from: u, reason: collision with root package name */
        public long f197911u;

        /* renamed from: q, reason: collision with root package name */
        public boolean f197907q = false;

        /* renamed from: r, reason: collision with root package name */
        public int f197908r = 0;

        /* renamed from: s, reason: collision with root package name */
        public int f197909s = 0;

        /* renamed from: t, reason: collision with root package name */
        public int f197910t = 0;

        /* renamed from: v, reason: collision with root package name */
        public final s01.f f197912v = new com.tencent.mm.ui.bizchat.h(this);

        /* renamed from: w, reason: collision with root package name */
        public final s01.l f197913w = new com.tencent.mm.ui.bizchat.i(this);

        /* renamed from: x, reason: collision with root package name */
        public final r01.p f197914x = new com.tencent.mm.ui.bizchat.k(this);

        @Override // r01.w2
        public void K1(int i17, com.tencent.mm.modelbase.m1 m1Var) {
            r45.j53 j53Var;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f197900g;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f197900g = null;
            }
            if (m1Var.getType() == 1355) {
                r45.v90 H = ((s01.g0) m1Var).H();
                if (i17 < 0 || H == null || (j53Var = H.f388000e) == null || j53Var.f377592d == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizChatConversationFmUI", "onBizChatSceneEnd createBizChatInfo failed, resCode=%d", java.lang.Integer.valueOf(i17));
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.i48), 0).show();
                    return;
                }
                s01.h D0 = r01.q3.Ui().D0(H.f388000e.f377592d.f383085d);
                if (D0 == null) {
                    dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, getString(com.tencent.mm.R.string.i48), 0).show();
                } else {
                    m0(D0.field_bizChatLocalId);
                }
            }
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
            return com.tencent.mm.sdk.platformtools.t8.K0(this.f197904n) ? this.f197903m : this.f197904n;
        }

        public final java.lang.String l0() {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f197904n)) {
                this.f197904n = r01.q3.cj().b1(this.f197903m).y0();
            }
            return this.f197904n;
        }

        public final void m0(long j17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("key_biz_chat_id", j17);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            this.f207287ui.startChatting(this.f197903m, bundle, true);
        }

        public final void n0() {
            java.lang.String l07 = l0();
            int a17 = com.tencent.mm.ui.h4.a(getContext(), l07);
            this.f197908r = a17;
            if (a17 == 2 && this.f197898e == null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.atj);
                this.f197898e = linearLayout;
                android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.height = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479627b2);
                this.f197898e.setLayoutParams(layoutParams);
                android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.a9a, (android.view.ViewGroup) this.f197898e, false);
                float q17 = i65.a.q(getContext());
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h6y);
                int i17 = (int) (q17 * cdnImageView.getLayoutParams().height);
                cdnImageView.getLayoutParams().height = i17;
                cdnImageView.getLayoutParams().width = i17;
                cdnImageView.requestLayout();
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
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
                this.f197898e.addView(inflate);
                inflate.setOnClickListener(new com.tencent.mm.ui.bizchat.l(this));
                android.app.Activity context = getContext();
                java.lang.String str2 = this.f197903m;
                if (com.tencent.mm.pluginsdk.model.app.j1.f(context, "com.tencent.wework")) {
                    com.tencent.mm.ui.h4.f(str2, 4, 4);
                } else {
                    com.tencent.mm.ui.h4.f(str2, 5, 4);
                }
                com.tencent.mm.ui.h4.d(getContext(), l07);
            }
            android.widget.LinearLayout linearLayout2 = this.f197898e;
            if (linearLayout2 != null) {
                if (this.f197908r == 2) {
                    linearLayout2.setVisibility(0);
                } else {
                    linearLayout2.setVisibility(8);
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onActivityCreated(android.os.Bundle bundle) {
            s01.a0 a0Var;
            super.onActivityCreated(bundle);
            this.f197903m = thisActivity().getIntent().getStringExtra("Contact_User");
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "[registerListener]");
            r01.q3.aj().f401872e.a(this.f197912v, thisActivity().getMainLooper());
            r01.q3.Ui().f401901e.a(this.f197913w, thisActivity().getMainLooper());
            r01.q3.bj().f368188e.a(this.f197914x, thisActivity().getMainLooper());
            ((l75.a1) c01.d9.b().r()).a(this);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f197903m;
            ((sg3.a) v0Var).getClass();
            setMMTitle(c01.a2.e(str));
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dfo);
            this.f197897d = textView;
            textView.setText(com.tencent.mm.R.string.gql);
            this.f197899f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.odk);
            try {
                n0();
            } catch (java.lang.NullPointerException unused) {
            }
            hb5.m mVar = new hb5.m(thisActivity(), new com.tencent.mm.ui.bizchat.r(this), this.f197903m);
            this.f197901h = mVar;
            this.f197899f.setAdapter((android.widget.ListAdapter) mVar);
            this.f197902i = new com.tencent.mm.ui.bizchat.n(this);
            rl5.r rVar = new rl5.r(thisActivity());
            this.f197899f.setOnTouchListener(new com.tencent.mm.ui.bizchat.o(this));
            this.f197899f.setOnItemLongClickListener(new com.tencent.mm.ui.bizchat.p(this, rVar));
            this.f197899f.setOnItemClickListener(new com.tencent.mm.ui.bizchat.q(this));
            setBackBtn(new com.tencent.mm.ui.bizchat.a(this));
            addIconOptionMenu(1, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.ui.bizchat.b(this));
            addIconOptionMenu(2, com.tencent.mm.R.string.f489817cl, com.tencent.mm.R.raw.actionbar_icon_dark_add, new dg5.n(this.f207287ui, l0()));
            java.lang.String z07 = r01.q3.Vi().z0(this.f197903m);
            s01.a0 y07 = r01.q3.Vi().y0(z07);
            this.f197905o = y07;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = this.f197903m;
            objArr[1] = z07;
            objArr[2] = java.lang.Boolean.valueOf(y07 == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
            if (com.tencent.mm.sdk.platformtools.t8.K0(z07) || (a0Var = this.f197905o) == null || a0Var.u0() || com.tencent.mm.sdk.platformtools.t8.K0(this.f197905o.field_addMemberUrl)) {
                r01.q3.Ni().h(this.f197903m, this);
                this.f197900g = db5.e1.Q(thisActivity(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.bizchat.f(this));
            }
            gm0.j1.e().k(new com.tencent.mm.ui.bizchat.g(this), 300L);
            java.lang.String l07 = l0();
            if (l07 != null) {
                r01.q3.bj().b1(l07, null);
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", l07);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
            }
            r01.q3.bj().y0(l0());
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.ui.bizchat.j(this));
            android.content.Intent intent = thisActivity().getIntent();
            if (com.tencent.mm.sdk.platformtools.c2.c(intent, "biz_chat_need_to_jump_to_chatting_ui", false)) {
                long longExtra = intent.getLongExtra("biz_chat_chat_id", -1L);
                if (longExtra != -1) {
                    m0(longExtra);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @Override // androidx.fragment.app.Fragment
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onActivityResult(int r7, int r8, android.content.Intent r9) {
            /*
                r6 = this;
                super.onActivityResult(r7, r8, r9)
                r0 = -1
                if (r8 == r0) goto L7
                return
            L7:
                r8 = 1
                if (r7 == r8) goto Lb
                return
            Lb:
                java.lang.String r7 = "result_data"
                android.os.Bundle r7 = r9.getBundleExtra(r7)
                r9 = 0
                if (r7 == 0) goto L76
                java.lang.String r0 = "MicroMsg.BizChatConversationFmUI"
                java.lang.String r1 = "bundle != null"
                com.tencent.mars.xlog.Log.i(r0, r1)
                java.lang.String r0 = "enterprise_members"
                java.lang.String r7 = r7.getString(r0)
                r45.j53 r0 = new r45.j53
                r0.<init>()
                s01.h r1 = new s01.h
                r1.<init>()
                s01.a0 r2 = r6.f197905o
                r3 = 0
                if (r2 == 0) goto L33
                java.lang.String r2 = r2.field_addMemberUrl
                goto L34
            L33:
                r2 = r3
            L34:
                r1.field_addMemberUrl = r2
                java.lang.String r2 = r6.f197903m
                r1.field_brandUserName = r2
                boolean r7 = s01.r.a(r1, r7, r3, r0)
                if (r7 == 0) goto L76
                long r1 = r1.field_bizChatLocalId
                r3 = -1
                int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r7 == 0) goto L4c
                r6.m0(r1)
                goto L77
            L4c:
                s01.y r7 = r01.q3.Ni()
                java.lang.String r1 = r6.f197903m
                s01.g0 r7 = r7.e(r1, r0, r6)
                androidx.fragment.app.FragmentActivity r0 = r6.thisActivity()
                r1 = 2131756315(0x7f10051b, float:1.9143534E38)
                java.lang.String r1 = r6.getString(r1)
                r2 = 2131756354(0x7f100542, float:1.9143613E38)
                java.lang.String r2 = r6.getString(r2)
                r3 = 1
                r4 = 1
                com.tencent.mm.ui.bizchat.c r5 = new com.tencent.mm.ui.bizchat.c
                r5.<init>(r6, r7)
                com.tencent.mm.ui.widget.dialog.u3 r7 = db5.e1.Q(r0, r1, r2, r3, r4, r5)
                r6.f197900g = r7
                goto L77
            L76:
                r8 = r9
            L77:
                if (r8 != 0) goto L8b
                androidx.fragment.app.FragmentActivity r7 = r6.thisActivity()
                r8 = 2131774428(0x7f104bdc, float:1.9180272E38)
                java.lang.String r8 = r6.getString(r8)
                android.widget.Toast r7 = dp.a.makeText(r7, r8, r9)
                r7.show()
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.onActivityResult(int, int, android.content.Intent):void");
        }

        @Override // androidx.fragment.app.Fragment, android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
            s01.b bVar = (s01.b) this.f197901h.getItem(adapterContextMenuInfo.position);
            this.f197911u = bVar.field_bizChatId;
            if (bVar.field_unReadCount <= 0) {
                contextMenu.add(adapterContextMenuInfo.position, 1, 1, com.tencent.mm.R.string.gqe);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.tencent.mm.R.string.gqc);
            }
            if (r01.q3.aj().f1(bVar)) {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.tencent.mm.R.string.gqf);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.tencent.mm.R.string.gqd);
            }
            contextMenu.add(adapterContextMenuInfo.position, 0, 3, com.tencent.mm.R.string.gqi);
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
            s01.g aj6 = r01.q3.aj();
            s01.f fVar = this.f197912v;
            l75.v0 v0Var = aj6.f401872e;
            if (v0Var != null) {
                v0Var.j(fVar);
            }
            s01.m Ui = r01.q3.Ui();
            s01.l lVar = this.f197913w;
            l75.v0 v0Var2 = Ui.f401901e;
            if (v0Var2 != null) {
                v0Var2.j(lVar);
            }
            r01.q bj6 = r01.q3.bj();
            r01.p pVar = this.f197914x;
            l75.v0 v0Var3 = bj6.f368188e;
            if (v0Var3 != null) {
                v0Var3.j(pVar);
            }
            if (gm0.j1.a()) {
                ((l75.a1) c01.d9.b().r()).e(this);
            }
            this.f197901h.c();
            hb5.m mVar = this.f197901h;
            java.util.HashMap hashMap = mVar.f280232z;
            if (hashMap != null) {
                hashMap.clear();
                mVar.f280232z = null;
            }
            r01.q3.aj().remove(mVar);
            l75.v0 v0Var4 = r01.q3.aj().f401872e;
            if (v0Var4 != null) {
                v0Var4.j(mVar);
            }
            super.onDestroy();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onPause() {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatConversationFmUI", "on pause");
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(this.f197903m);
            s01.g aj6 = r01.q3.aj();
            java.lang.String str = this.f197903m;
            aj6.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizConversationStorage", "brandUserName is null");
            } else {
                aj6.f401871d.A("BizChatConversation", "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'");
            }
            hb5.m mVar = this.f197901h;
            if (mVar != null) {
                db5.c6 c6Var = mVar.f280223q;
                if (c6Var != null) {
                    c6Var.c();
                }
                mVar.A = false;
            }
            this.f197906p = false;
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = "";
            super.onPause();
        }

        @Override // com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onResume() {
            java.lang.String str;
            super.onResume();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f197903m, true);
            if (n17 == null || !n17.r2()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizChatConversationFmUI", "onResume is not contact now");
                finish();
                return;
            }
            qk.o b17 = r01.z.b(this.f197903m);
            if (b17 == null || (str = b17.field_enterpriseFather) == null || !c01.e2.J(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizChatConversationFmUI", "onResume enterpriseFather is invalid");
                finish();
                return;
            }
            if (c01.e2.P(n17)) {
                setTitleMuteIconVisibility(0);
            } else {
                setTitleMuteIconVisibility(8);
            }
            hb5.m mVar = this.f197901h;
            if (mVar != null) {
                mVar.A = true;
                if (mVar.B) {
                    mVar.f();
                    mVar.B = false;
                }
            }
            this.f197906p = true;
            hb5.m mVar2 = this.f197901h;
            if (mVar2.A) {
                mVar2.f();
            } else {
                mVar2.B = true;
            }
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b = this.f197903m;
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o25.n1.d(this, this.f197895f);
    }

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.f488229nn, (android.view.ViewGroup) null);
        this.f197895f = inflate;
        setContentView(inflate);
        updateContentViewMargin(this.f197895f);
        this.conversationFm = new com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI();
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.h(com.tencent.mm.R.id.jmc, this.conversationFm, null, 1);
        beginTransaction.d();
        o25.n1.d(this, this.f197895f);
    }
}
