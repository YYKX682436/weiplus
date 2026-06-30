package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class GameChatCommentFooter extends com.tencent.mm.ui.widget.InputPanelLinearLayout implements xn5.a0 {
    public static final /* synthetic */ int P = 0;
    public int A;
    public boolean B;
    public boolean C;
    public com.tencent.mm.plugin.game.chatroom.view.q2 D;
    public final java.util.Map E;
    public java.lang.String F;
    public java.lang.String G;
    public final com.tencent.mm.plugin.game.chatroom.view.p2 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.game.autogen.chatroom.Channel f138939J;
    public boolean K;
    public com.tencent.mm.ui.widget.dialog.z2 L;
    public boolean M;
    public final com.tencent.mm.pluginsdk.ui.chat.e8 N;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f138940g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f138941h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f138942i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f138943m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f138944n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f138945o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f138946p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f138947q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f138948r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f138949s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.g8 f138950t;

    /* renamed from: u, reason: collision with root package name */
    public int f138951u;

    /* renamed from: v, reason: collision with root package name */
    public int f138952v;

    /* renamed from: w, reason: collision with root package name */
    public int f138953w;

    /* renamed from: x, reason: collision with root package name */
    public int f138954x;

    /* renamed from: y, reason: collision with root package name */
    public int f138955y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f138956z;

    public GameChatCommentFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138948r = false;
        this.f138951u = -1;
        this.f138952v = -1;
        this.f138953w = -1;
        this.f138954x = 0;
        this.f138955y = 0;
        this.f138956z = false;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.E = new java.util.HashMap();
        this.F = "";
        this.G = "";
        this.H = new com.tencent.mm.plugin.game.chatroom.view.p2(this);
        this.I = false;
        this.K = false;
        this.M = false;
        this.N = new com.tencent.mm.plugin.game.chatroom.view.o2(this);
        this.f138940g = (com.tencent.mm.ui.MMActivity) context;
    }

    public static void g(final com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter, java.lang.String str) {
        final com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter2;
        if (gameChatCommentFooter.M) {
            return;
        }
        if ((gameChatCommentFooter.F + "@").equals(str)) {
            gameChatCommentFooter.n(8, 1);
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(gameChatCommentFooter.getContext(), 0, 0, true, true);
            gameChatCommentFooter.L = z2Var;
            z2Var.l(new com.tencent.mm.ui.widget.dialog.q3() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$b
                @Override // com.tencent.mm.ui.widget.dialog.q3
                public final void dismiss() {
                    int i17 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.P;
                    final com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter gameChatCommentFooter3 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.this;
                    gameChatCommentFooter3.getClass();
                    gameChatCommentFooter3.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i18 = com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.P;
                            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.this.n(0, 1);
                        }
                    }, 200L);
                }
            });
            com.tencent.mm.ui.widget.dialog.z2 mentionSomeoneDialog = gameChatCommentFooter.L;
            android.content.Context context = gameChatCommentFooter.getContext();
            com.tencent.mm.plugin.game.chatroom.view.g2 g2Var = new com.tencent.mm.plugin.game.chatroom.view.g2(gameChatCommentFooter);
            kotlin.jvm.internal.o.g(mentionSomeoneDialog, "mentionSomeoneDialog");
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.MMActivity fragmentActivity = gameChatCommentFooter.f138940g;
            kotlin.jvm.internal.o.g(fragmentActivity, "fragmentActivity");
            androidx.lifecycle.c1 a17 = androidx.lifecycle.k1.a(fragmentActivity, null).a(g43.x.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            g43.x xVar = (g43.x) a17;
            long longExtra = fragmentActivity.getIntent().getLongExtra("game_report_ssid", 0L);
            long longExtra2 = fragmentActivity.getIntent().getLongExtra("game_report_sourceid", 0L);
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489149bg4, (android.view.ViewGroup) null, false);
            int i17 = com.tencent.mm.R.id.dhv;
            com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) x4.b.a(inflate, com.tencent.mm.R.id.dhv);
            if (mMClearEditText != null) {
                i17 = com.tencent.mm.R.id.g7q;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.g7q);
                if (frameLayout != null) {
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.hkv);
                    if (imageView != null) {
                        int i18 = com.tencent.mm.R.id.f485508hx4;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f485508hx4);
                        if (linearLayout != null) {
                            i18 = com.tencent.mm.R.id.iip;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.iip);
                            if (linearLayout2 != null) {
                                i18 = com.tencent.mm.R.id.f486720m90;
                                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(inflate, com.tencent.mm.R.id.f486720m90);
                                if (recyclerView != null) {
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) inflate;
                                    x33.d dVar = new x33.d(linearLayout3, mMClearEditText, frameLayout, imageView, linearLayout, linearLayout2, recyclerView);
                                    imageView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.ui.l(mentionSomeoneDialog));
                                    frameLayout.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.ui.m(dVar, longExtra, longExtra2));
                                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                                    fVar.e(700L, 1L, longExtra, longExtra2, null);
                                    java.lang.String str2 = xVar.f268796f;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    com.tencent.mm.plugin.game.chatroom.ui.t tVar = new com.tencent.mm.plugin.game.chatroom.ui.t(str2, longExtra, longExtra2);
                                    mMClearEditText.addTextChangedListener(new com.tencent.mm.plugin.game.chatroom.ui.n(xVar, tVar));
                                    tVar.f138862h = g2Var;
                                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
                                    recyclerView.setAdapter(tVar);
                                    kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(xVar), (oz5.l) xVar.f268801n.getValue(), null, new g43.s(xVar, null), 2, null);
                                    xVar.f268794d.observe(fragmentActivity, new com.tencent.mm.plugin.game.chatroom.ui.o(tVar));
                                    xVar.f268795e.observe(fragmentActivity, new com.tencent.mm.plugin.game.chatroom.ui.p(tVar));
                                    mentionSomeoneDialog.k(linearLayout3, 0, 0);
                                    android.view.ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                                    layoutParams.height = (com.tencent.mm.ui.bh.a(context).f197136b * 3) / 4;
                                    linearLayout3.setLayoutParams(layoutParams);
                                    gameChatCommentFooter2 = gameChatCommentFooter;
                                    gameChatCommentFooter2.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.this.L.C();
                                        }
                                    }, 100L);
                                    fVar.e(0L, 1L, gameChatCommentFooter.getSsid(), gameChatCommentFooter.getSourceId(), null);
                                }
                            }
                        }
                        i17 = i18;
                    } else {
                        i17 = com.tencent.mm.R.id.hkv;
                    }
                }
            }
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
        }
        gameChatCommentFooter2 = gameChatCommentFooter;
        gameChatCommentFooter2.F = str;
    }

    private java.lang.String getLastText() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f138944n;
        return mMEditText == null ? "" : mMEditText.getText().toString();
    }

    private int getSelectionStart() {
        return this.f138944n.getSelectionStart();
    }

    private long getSourceId() {
        return this.f138940g.getIntent().getLongExtra("game_report_sourceid", 0L);
    }

    private long getSsid() {
        return this.f138940g.getIntent().getLongExtra("game_report_ssid", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if ((r1.channel_id == 0) == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setFooterVisibilityImpl(int r6) {
        /*
            r5 = this;
            super.setVisibility(r6)
            if (r6 != 0) goto L9c
            android.view.ViewGroup r6 = r5.f138941h
            if (r6 == 0) goto L9c
            com.tencent.mm.plugin.game.chatroom.view.p2 r0 = r5.H
            boolean r1 = r0.f139256a
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            r6.setVisibility(r1)
            android.view.ViewGroup r6 = r5.f138941h
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r0.f139258c
            r6.setTag(r1)
            android.widget.TextView r6 = r5.f138942i
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r0.f139258c
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "话题："
            r1.<init>(r4)
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r4 = r0.f139258c
            java.lang.String r4 = r4.name
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L3b
        L39:
            java.lang.String r1 = ""
        L3b:
            r6.setText(r1)
            boolean r6 = r0.f139257b
            if (r6 == 0) goto L44
            r6 = r3
            goto L45
        L44:
            r6 = r2
        L45:
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r1 = r5.f138939J
            r4 = 1
            if (r1 == 0) goto L54
            int r1 = r1.channel_id
            if (r1 != 0) goto L50
            r1 = r4
            goto L51
        L50:
            r1 = r3
        L51:
            if (r1 != 0) goto L54
            goto L55
        L54:
            r2 = r6
        L55:
            android.widget.ImageView r6 = r5.f138943m
            r6.setVisibility(r2)
            boolean r6 = r0.f139256a
            if (r6 == 0) goto L7b
            com.tencent.mm.plugin.game.autogen.chatroom.Channel r6 = r5.f138939J
            if (r6 == 0) goto L7b
            int r6 = r6.channel_id
            if (r6 != 0) goto L68
            r6 = r4
            goto L69
        L68:
            r6 = r3
        L69:
            if (r6 != 0) goto L7b
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.p(r3, r3)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.setShowStore(r3)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.setShowSearch(r3)
            goto L8e
        L7b:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.setShowStore(r4)
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.setShowSearch(r4)
            boolean r6 = r5.I
            if (r6 == 0) goto L8e
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.p(r4, r3)
        L8e:
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r6 = r5.f138949s
            r6.i()
            if (r2 != 0) goto L9c
            r0.f139256a = r3
            r6 = 0
            r0.f139258c = r6
            r0.f139257b = r3
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter.setFooterVisibilityImpl(int):void");
    }

    private void setLastText(java.lang.String str) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f138944n;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f138944n.getTextSize();
        ((ke0.e) xVar).getClass();
        mMEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f138944n;
        mMEditText2.setSelection(mMEditText2.getText().length());
    }

    @Override // com.tencent.mm.ui.widget.InputPanelLinearLayout, al5.e0
    public void J2(boolean z17, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.J2(z17, i17);
        com.tencent.mars.xlog.Log.i("GameChatRoom.GameChatCommentFooter", "onInputPanelChange, isKeyboardShow:%b, keyboardHeight:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        this.f138944n.m(z17);
        if (this.f138954x != i17 && i17 != 0) {
            this.f138954x = i17;
            m();
            fp.w.m(getContext(), i17);
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f138949s;
            if (chatFooterPanel != null && (layoutParams = chatFooterPanel.getLayoutParams()) != null) {
                layoutParams.height = this.f138955y;
            }
        }
        if (z17 && this.f138949s.getVisibility() == 8) {
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f138949s.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = this.f138954x;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.c2 c2Var = new com.tencent.mm.plugin.game.chatroom.view.c2(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(c2Var, 50L, false);
        } else if (this.f138949s.getVisibility() != 8 && !this.K) {
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            valueAnimator.setIntValues(z17 ? this.f138955y : this.f138954x, z17 ? this.f138954x : this.f138955y);
            valueAnimator.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.e2(this));
            valueAnimator.setDuration(200L);
            valueAnimator.addListener(new com.tencent.mm.plugin.game.chatroom.view.f2(this));
            valueAnimator.start();
        }
        if (!this.f138956z || z17) {
            return;
        }
        setVisibility(8);
    }

    public char getCharAtCursor() {
        int selectionStart = getSelectionStart();
        if (selectionStart <= 0) {
            return 'x';
        }
        return getLastText().charAt(selectionStart - 1);
    }

    public final void h(java.lang.String str, java.lang.String str2, boolean z17) {
        java.lang.String str3;
        if (z17) {
            str3 = "@" + str2 + (char) 8197;
        } else {
            str3 = str2 + (char) 8197;
        }
        java.util.Map map = this.E;
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
        if (list == null) {
            list = new java.util.ArrayList();
        }
        list.add(str2);
        ((java.util.HashMap) map).put(str, list);
        i(str3, null);
    }

    public void i(java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.Channel channel) {
        if (channel != null) {
            com.tencent.mm.plugin.game.chatroom.view.p2 p2Var = this.H;
            p2Var.f139256a = true;
            p2Var.f139258c = channel;
            p2Var.f139257b = true;
        }
        if (com.tencent.mm.ui.tools.v4.e(this.f138944n.getText().toString() + str, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) <= 1000) {
            this.f138944n.n(str);
        }
    }

    public boolean j(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() == 0) {
                if (getCharAtCursor() == 8197) {
                    this.C = true;
                } else {
                    this.C = false;
                }
            }
            if (keyEvent.getAction() == 1 && this.C) {
                this.C = false;
                int selectionStart = getSelectionStart();
                java.lang.String lastText = getLastText();
                java.lang.String substring = lastText.substring(0, selectionStart);
                int lastIndexOf = substring.lastIndexOf(64);
                if (lastIndexOf < substring.length() && lastIndexOf >= 0) {
                    setLastText(substring.substring(0, lastIndexOf) + lastText.substring(selectionStart));
                    this.f138944n.setSelection(lastIndexOf);
                }
            }
        }
        return false;
    }

    public final void k() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(this.f138955y, 0);
        valueAnimator.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.r1(this));
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new com.tencent.mm.plugin.game.chatroom.view.s1(this));
        valueAnimator.start();
    }

    public final void l(boolean z17) {
        this.f138949s.h();
        if (com.tencent.mm.sdk.platformtools.d2.j(getContext())) {
            getInputPanelHelper().f(new com.tencent.mm.plugin.game.chatroom.view.i2(this, z17));
        } else if (z17) {
            k();
        }
    }

    public final void m() {
        this.f138955y = java.lang.Math.max(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479805fq), this.f138954x);
        com.tencent.mm.sdk.platformtools.Log.a("GameChatRoom.GameChatCommentFooter", "keyboardHeight:%d, smileyPanelHeight:%d", java.lang.Integer.valueOf(this.f138954x), java.lang.Integer.valueOf(this.f138955y));
    }

    public void n(int i17, int i18) {
        this.f138951u = i18;
        boolean z17 = i17 == 0;
        this.f138948r = false;
        if (i18 == 0 && z17) {
            this.f138948r = true;
        } else if (i18 == 1 && !z17) {
            this.f138948r = true;
        }
        if (this.f138949s != null) {
            com.tencent.mm.sdk.platformtools.Log.c("GameChatRoom.GameChatCommentFooter", "showState " + z17, new java.lang.Object[0]);
            if (z17) {
                this.f138946p.performClick();
                this.f138948r = false;
            } else {
                l(this.f138948r);
                this.f138956z = false;
                this.f138940g.hideVKB();
                requestLayout();
            }
        }
        postDelayed(new com.tencent.mm.plugin.game.chatroom.view.d2(this, i17, z17), 100L);
    }

    public final void o() {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(0, this.f138955y);
        valueAnimator.addUpdateListener(new com.tencent.mm.plugin.game.chatroom.view.p1(this));
        valueAnimator.setDuration(200L);
        valueAnimator.addListener(new com.tencent.mm.plugin.game.chatroom.view.q1(this));
        valueAnimator.start();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        com.tencent.mm.ui.MMActivity mMActivity = this.f138940g;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.bel, this);
        this.f138941h = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.glw);
        this.f138942i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.glx);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.glv);
        this.f138943m = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.j2(this));
        this.f138944n = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.f485119gm1);
        this.f138945o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.glz);
        this.f138946p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.gly);
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.got);
        this.f138947q = textView;
        textView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.k2(this));
        int desiredWidth = ((int) android.text.Layout.getDesiredWidth(this.f138947q.getText(), this.f138947q.getPaint())) + this.f138947q.getPaddingStart() + this.f138947q.getPaddingEnd();
        this.A = desiredWidth;
        if (desiredWidth < com.tencent.mm.ui.zk.e(mMActivity, com.tencent.mm.R.dimen.f479727dj)) {
            this.A = com.tencent.mm.ui.zk.e(mMActivity, com.tencent.mm.R.dimen.f479727dj);
        }
        this.f138944n.setFilters(new android.text.InputFilter[]{new com.tencent.mm.plugin.game.chatroom.view.t1(this, 1000, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2)});
        this.f138944n.addTextChangedListener(new com.tencent.mm.plugin.game.chatroom.view.y1(this));
        this.f138944n.setOnTouchListener(new com.tencent.mm.plugin.game.chatroom.view.z1(this));
        this.f138946p.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.l2(this));
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f138949s = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f138949s = wi6;
        wi6.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
        this.f138954x = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        m();
        linearLayout.addView(this.f138949s, -1, this.f138955y);
        this.f138949s.setShowGame(false);
        this.f138949s.o(false, false);
        this.f138949s.p(false, false);
        this.f138949s.setShowSmiley(true);
        this.f138949s.setShowSearch(true);
        this.f138949s.setEntranceScene(102);
        this.f138949s.setSearchSource(3);
        this.f138949s.setTalkerName(this.G);
        this.f138949s.setToSendText(this.f138944n.getText().toString());
        this.f138949s.i();
        this.f138949s.setOnTextOperationListener(new com.tencent.mm.plugin.game.chatroom.view.m2(this));
        com.tencent.mm.feature.emoji.api.x6 x6Var = (com.tencent.mm.feature.emoji.api.x6) i95.n0.c(com.tencent.mm.feature.emoji.api.x6.class);
        android.content.Context context = getContext();
        android.view.View rootView = getRootView();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f138944n;
        mMEditText.getClass();
        ((com.tencent.mm.feature.emoji.cb) x6Var).getClass();
        com.tencent.mm.pluginsdk.ui.chat.ra raVar = new com.tencent.mm.pluginsdk.ui.chat.ra(context, rootView, this, mMEditText);
        this.f138950t = raVar;
        raVar.f190617h = this.N;
        raVar.f190615f = this.f138946p;
        com.tencent.mm.plugin.game.chatroom.view.n2 n2Var = new com.tencent.mm.plugin.game.chatroom.view.n2(this);
        this.f138949s.setCallback(n2Var);
        ((com.tencent.mm.pluginsdk.ui.chat.ra) this.f138950t).f190616g = n2Var;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f138952v;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f138952v = i28;
        this.f138953w = i27;
    }

    public void setCanAtAll(boolean z17) {
    }

    public void setChannelInfo(com.tencent.mm.plugin.game.autogen.chatroom.Channel channel) {
        this.f138939J = channel;
    }

    public void setFooterActionListener(com.tencent.mm.plugin.game.chatroom.view.q2 q2Var) {
        this.D = q2Var;
    }

    public void setHostUserName(java.lang.String str) {
        this.G = str;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f138949s;
        if (chatFooterPanel != null) {
            chatFooterPanel.setTalkerName(str);
        }
    }

    public void setIsRealTimeRoom(boolean z17) {
        this.M = z17;
    }

    public void setRobotUserName(java.lang.String str) {
    }

    public void setShowCustom(boolean z17) {
        this.I = z17;
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f138949s;
        if (chatFooterPanel != null) {
            chatFooterPanel.p(z17, false);
            this.f138949s.setShowGame(false);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        n(i17, 1);
    }
}
