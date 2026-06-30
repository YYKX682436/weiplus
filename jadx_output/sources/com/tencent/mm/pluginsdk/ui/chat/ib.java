package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class ib extends android.widget.LinearLayout {
    public final int A;
    public boolean B;
    public boolean C;
    public long D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.Toast f190402J;
    public final java.util.List K;
    public com.tencent.mm.pluginsdk.ui.o3 L;
    public com.tencent.mm.sdk.event.IListener M;
    public android.telephony.TelephonyManager N;
    public b31.d P;
    public java.lang.String Q;
    public int R;
    public final java.util.ArrayList S;
    public final java.util.ArrayList T;
    public java.lang.String U;
    public boolean V;
    public final com.tencent.mm.pluginsdk.ui.t3 W;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.VoiceInputLayout f190403d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f190404e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f190405f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f190406g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f190407h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f190408i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f190409l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.gb f190410m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f190411n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f190412o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.VoiceInputScrollView f190413p;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.hb f190414p0;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f190415q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.lb f190416r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f190417s;

    /* renamed from: t, reason: collision with root package name */
    public long f190418t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f190419u;

    /* renamed from: v, reason: collision with root package name */
    public float f190420v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f190421w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f190422x;

    /* renamed from: x0, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.u3 f190423x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f190424y;

    /* renamed from: y0, reason: collision with root package name */
    public int f190425y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f190426z;

    public ib(android.content.Context context, boolean z17, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        super(context);
        com.tencent.mm.ui.widget.MMEditText mMEditText2;
        this.f190412o = null;
        this.f190418t = 0L;
        this.f190419u = false;
        this.f190420v = 0.0f;
        this.f190421w = false;
        this.f190422x = false;
        this.f190424y = false;
        this.f190426z = false;
        this.A = 300;
        this.B = false;
        this.C = false;
        this.D = 0L;
        this.E = 0L;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = "";
        this.K = new java.util.ArrayList();
        this.Q = "";
        this.R = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.S = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.T = arrayList2;
        this.U = "";
        this.V = false;
        this.W = new com.tencent.mm.pluginsdk.ui.chat.ta(this);
        this.f190423x0 = new com.tencent.mm.pluginsdk.ui.chat.ua(this);
        this.f190425y0 = i65.a.b(getContext(), zd.d.CTRL_INDEX);
        this.f190409l1 = true;
        this.f190417s = context;
        this.f190419u = z17;
        this.f190412o = mMEditText;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d4c, this);
        this.f190404e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.p5p);
        this.f190405f = (android.widget.Button) findViewById(com.tencent.mm.R.id.p5o);
        this.f190407h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.voe);
        this.f190408i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vof);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.p5u);
        this.f190406g = button;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f190404e;
        if (weImageView == null || this.f190405f == null || this.f190407h == null || this.f190408i == null || button == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "init: findViewById returned null");
        } else {
            if (z17) {
                weImageView.setVisibility(8);
            } else {
                weImageView.setVisibility(0);
            }
            this.f190406g.setVisibility(8);
            this.f190405f.setVisibility(8);
            if (!z17 || (mMEditText2 = this.f190412o) == null) {
                com.tencent.mm.ui.widget.MMEditText mMEditText3 = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.p5w);
                this.f190411n = mMEditText3;
                mMEditText3.setHintTextColor(getResources().getColor(com.tencent.mm.R.color.a09));
                this.f190411n.setClickable(true);
                this.f190411n.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.va(this));
                this.f190411n.setOnLongClickListener(new com.tencent.mm.pluginsdk.ui.chat.wa(this));
                this.f190411n.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.chat.xa(this));
                this.f190416r = new com.tencent.mm.pluginsdk.ui.chat.lb(getContext(), this, new com.tencent.mm.pluginsdk.ui.chat.ya(this), 10);
            } else {
                this.f190411n = mMEditText2;
            }
            this.f190413p = (com.tencent.mm.pluginsdk.ui.VoiceInputScrollView) findViewById(com.tencent.mm.R.id.p5t);
            this.f190404e.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.za(this));
            this.f190406g.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.ab(this));
            this.f190405f.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.bb(this));
            this.f190407h.setOnClickListener(new com.tencent.mm.pluginsdk.ui.chat.eb(this));
            if ((this.f190411n.getText() != null && this.f190411n.getText().length() > 0) || (this.f190411n.getHint() != null && this.f190411n.getHint().length() > 0)) {
                this.f190407h.setVisibility(8);
            }
            this.f190411n.addTextChangedListener(new com.tencent.mm.pluginsdk.ui.chat.fb(this));
            this.f190413p.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.chat.sa(this));
        }
        this.L = new com.tencent.mm.pluginsdk.ui.o3(context);
        java.lang.String str = "MicroMsg.VoiceInputPanel" + java.lang.String.valueOf(java.lang.System.nanoTime());
        this.Q = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "mToUser %s", str);
        h();
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            arrayList.add(getContext().getString(com.tencent.mm.R.string.k99));
            arrayList2.add(1);
            if ((b17 & 2) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.k98));
                arrayList2.add(2);
            }
            if ((b17 & 4) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.k9_));
                arrayList2.add(4);
            }
            if ((b17 & 8) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.k9a));
                arrayList2.add(8);
            }
        } else if (com.tencent.mm.sdk.platformtools.m2.d().equals("en")) {
            arrayList.add(getContext().getString(com.tencent.mm.R.string.k9_));
            arrayList2.add(4);
            arrayList.add(getContext().getString(com.tencent.mm.R.string.k99));
            arrayList2.add(1);
            if ((b17 & 2) != 0) {
                arrayList.add(getContext().getString(com.tencent.mm.R.string.k98));
                arrayList2.add(2);
            }
        }
        this.R = 0;
        this.f190408i.setText((java.lang.CharSequence) arrayList.get(0));
        this.f190403d.setLangType(((java.lang.Integer) arrayList2.get(this.R)).intValue());
        if (arrayList2.size() < 2) {
            this.f190407h.setVisibility(8);
        }
    }

    public static void a(com.tencent.mm.pluginsdk.ui.chat.ib ibVar, int i17) {
        android.widget.Toast toast = ibVar.f190402J;
        if (toast != null) {
            toast.cancel();
        }
        android.content.Context context = ibVar.f190417s;
        android.widget.Toast makeText = dp.a.makeText(context, context.getResources().getString(i17), 0);
        ibVar.f190402J = makeText;
        makeText.setGravity(17, 0, 0);
        ibVar.f190402J.show();
    }

    public static boolean b(com.tencent.mm.pluginsdk.ui.chat.ib ibVar, android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        android.content.SharedPreferences d17;
        ibVar.getClass();
        if (motionEvent.getAction() == 0) {
            if (ibVar.f190413p.getScrollY() <= 0) {
                ibVar.f190422x = true;
                ibVar.f190420v = motionEvent.getRawY();
            }
            ibVar.f190426z = true;
        } else if (motionEvent.getAction() == 2) {
            ibVar.f190421w = true;
        } else if (motionEvent.getAction() == 1) {
            float rawY = (ibVar.f190421w && ibVar.f190422x) ? motionEvent.getRawY() - ibVar.f190420v : 0.0f;
            ibVar.f190426z = false;
            ibVar.f190421w = false;
            ibVar.f190422x = false;
            ibVar.f190420v = 0.0f;
            if (rawY > ibVar.A) {
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = ibVar.f190411n;
                if (mMEditText2 != null && mMEditText2.getText() != null && ibVar.f190411n.getText().length() > 0 && (d17 = com.tencent.mm.sdk.platformtools.x2.d()) != null) {
                    d17.edit().putString("voiceinput_downdistance_content", ibVar.f190411n.getText().toString()).apply();
                }
                ibVar.e();
            } else if (ibVar.f190424y) {
                ibVar.f190424y = false;
            } else if ((view instanceof com.tencent.mm.ui.widget.MMEditText) && (mMEditText = ibVar.f190411n) != null && mMEditText.getText() != null && ibVar.f190411n.getText().length() > 0) {
                com.tencent.mm.ui.widget.MMEditText mMEditText3 = (com.tencent.mm.ui.widget.MMEditText) view;
                android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(mMEditText3.getText());
                motionEvent.getAction();
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int totalPaddingLeft = x17 - mMEditText3.getTotalPaddingLeft();
                int totalPaddingTop = y17 - mMEditText3.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + mMEditText3.getScrollX();
                int scrollY = totalPaddingTop + mMEditText3.getScrollY();
                android.text.Layout layout = mMEditText3.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    clickableSpanArr[0].onClick(view);
                } else {
                    ibVar.p(mMEditText3.getOffsetForPosition(motionEvent.getX(), motionEvent.getY()));
                }
            }
            if (view instanceof com.tencent.mm.ui.widget.MMEditText) {
                return true;
            }
            return false;
        }
        if (view instanceof com.tencent.mm.ui.widget.MMEditText) {
            return true;
        }
        return false;
    }

    public static void c(com.tencent.mm.pluginsdk.ui.chat.ib ibVar) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = ibVar.f190411n;
        if (mMEditText == null || mMEditText.getText() == null) {
            return;
        }
        java.lang.String obj = ibVar.f190411n.getText().toString();
        if (obj.length() > 0) {
            if (!ibVar.f190419u || ibVar.f190411n.getSelectionStart() >= obj.length()) {
                ibVar.I = obj.substring(obj.length() - 1, obj.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "delPunctuation msg = %s ,msg.length() = %s, punctuation = %s", com.tencent.mm.sdk.platformtools.t8.G1(obj), java.lang.Integer.valueOf(obj.length()), ibVar.I);
                if (ibVar.I.equalsIgnoreCase("。") || ibVar.I.equalsIgnoreCase(".")) {
                    ibVar.f190411n.setText(obj.substring(0, obj.length() - 1));
                }
            }
        }
    }

    public static void d(com.tencent.mm.pluginsdk.ui.chat.ib ibVar, int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = ibVar.f190411n;
        if (mMEditText == null || mMEditText.getText() == null) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var = ibVar.f190415q;
            if (j0Var == null || !j0Var.isShowing()) {
                ibVar.f190415q = db5.e1.i(ibVar.getContext(), com.tencent.mm.R.string.b1m, com.tencent.mm.R.string.f490573yv);
                return;
            }
            return;
        }
        java.lang.String obj = ibVar.f190411n.getText().toString();
        if (obj.trim().length() == 0 && obj.length() == 0) {
            com.tencent.mm.ui.widget.dialog.j0 j0Var2 = ibVar.f190415q;
            if (j0Var2 == null || !j0Var2.isShowing()) {
                ibVar.f190415q = db5.e1.i(ibVar.getContext(), com.tencent.mm.R.string.b1m, com.tencent.mm.R.string.f490573yv);
                return;
            }
            return;
        }
        if (ibVar.f190410m != null) {
            boolean z17 = ibVar.f190419u;
            if (!z17) {
                com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
                voiceInputBehavior.send = 1;
                if (ibVar.G) {
                    voiceInputBehavior.send = 2;
                }
                if (i17 != 1) {
                    if (i17 == 4) {
                        voiceInputBehavior.send = 4;
                    }
                    ibVar.i(voiceInputBehavior);
                }
                if (i17 == 1 || i17 == 2 || i17 == 4) {
                    java.util.List list = ibVar.K;
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "cgiReport size = %s", java.lang.Integer.valueOf(arrayList.size()));
                    if (ibVar.P == null) {
                        ibVar.P = new b31.d();
                    }
                    com.tencent.mm.storage.c z07 = com.tencent.mm.model.newabtest.z.Ai().z0("100235");
                    int P = z07.isValid() ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) z07.t0().get("MMVoipVadOn"), 0) : 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "cgiReport: abTestFlag = [%s]", java.lang.Integer.valueOf(P));
                    b31.d dVar = ibVar.P;
                    java.lang.String valueOf = java.lang.String.valueOf(P);
                    dVar.getClass();
                    gm0.j1.e().j(new b31.b(dVar, new java.util.ArrayList(list), obj, valueOf));
                    arrayList.clear();
                }
            }
            if (i17 == 2) {
                ibVar.l(z17 ? 5 : 6);
            } else if (i17 == 1) {
                ibVar.l(5);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "sendMsg onSendMsg");
            ibVar.f190410m.b(obj);
        }
    }

    public void e() {
        j();
        if (this.f190410m != null) {
            this.F = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
            com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190411n;
            if (mMEditText == null || mMEditText.getText() == null || this.f190411n.getText().length() <= 0) {
                if (this.F) {
                    voiceInputBehavior.cancel = 2;
                } else {
                    voiceInputBehavior.cancel = 15;
                }
            } else if (this.F) {
                voiceInputBehavior.cancel = 14;
            } else {
                voiceInputBehavior.cancel = 16;
            }
            long j17 = this.f190418t;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                voiceInputBehavior.voiceInputTime = android.os.SystemClock.elapsedRealtime() - j17;
                this.f190418t = 0L;
            }
            i(voiceInputBehavior);
            this.f190410m.a();
        }
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "destroy");
        n();
        com.tencent.mm.sdk.event.IListener iListener = this.M;
        if (iListener != null) {
            iListener.dead();
            this.M = null;
        }
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f190403d;
        if (voiceInputLayout != null) {
            voiceInputLayout.setVoiceDetectListener(null);
            this.f190403d = null;
        }
        if (this.P != null) {
            this.P = null;
        }
        if (this.N != null && this.f190414p0 != null) {
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(this.f190414p0);
            this.f190414p0.f190382a = null;
            this.f190414p0 = null;
        }
        this.N = null;
        this.f190412o = null;
        if (!this.Q.startsWith("MicroMsg.VoiceInputPanel")) {
            this.L.b(this.Q, ((java.lang.Integer) this.T.get(this.R)).intValue());
        }
        com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl voiceInputLayoutImpl = (com.tencent.mm.pluginsdk.ui.VoiceInputLayoutImpl) findViewById(com.tencent.mm.R.id.p5x);
        if (voiceInputLayoutImpl != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "voiceInputLayout do stop!");
            voiceInputLayoutImpl.c();
            com.tencent.mm.sdk.platformtools.n3 n3Var = voiceInputLayoutImpl.f189861o;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = voiceInputLayoutImpl.f189862p;
            if (n3Var2 != null) {
                n3Var2.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = voiceInputLayoutImpl.f189863q;
            if (b4Var != null) {
                b4Var.d();
            }
        }
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "idkReport type = %s", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(455L, i17, 1L, false);
    }

    public void h() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f190418t = android.os.SystemClock.elapsedRealtime();
        if (this.M == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceInputResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceInputResultEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel$12
                {
                    this.__eventId = -191167627;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.VoiceInputResultEvent voiceInputResultEvent) {
                    am.n00 n00Var;
                    com.tencent.mm.autogen.events.VoiceInputResultEvent voiceInputResultEvent2 = voiceInputResultEvent;
                    if (!(voiceInputResultEvent2 instanceof com.tencent.mm.autogen.events.VoiceInputResultEvent)) {
                        return false;
                    }
                    if (voiceInputResultEvent2 == null || (n00Var = voiceInputResultEvent2.f54934g) == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent event data is null");
                        return false;
                    }
                    com.tencent.mm.pluginsdk.ui.chat.ib ibVar = com.tencent.mm.pluginsdk.ui.chat.ib.this;
                    if (ibVar.f190419u) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent fromFullScreen true");
                        return false;
                    }
                    if (!n00Var.f7388d.equalsIgnoreCase(ibVar.Q)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent userCode not equals!");
                        ibVar.f();
                        return false;
                    }
                    ibVar.setToUser(ibVar.Q);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent action = %s, textChange: %b", java.lang.Integer.valueOf(n00Var.f7385a), java.lang.Integer.valueOf(n00Var.f7386b));
                    int i17 = n00Var.f7385a;
                    if (i17 == 2) {
                        if (n00Var.f7386b == 1) {
                            ibVar.G = true;
                        } else {
                            ibVar.G = false;
                        }
                        java.lang.String str = n00Var.f7387c;
                        ibVar.L.c(ibVar.f190411n);
                        ibVar.L.e(ibVar.f190411n, str, false);
                        ibVar.L.d(ibVar.f190411n);
                        ibVar.L.c(ibVar.f190411n);
                        ibVar.o();
                        ibVar.f190413p.fullScroll(130);
                        ibVar.k(false);
                    } else if (i17 == 3) {
                        com.tencent.mm.pluginsdk.ui.chat.gb gbVar = ibVar.f190410m;
                        if (gbVar != null) {
                            gbVar.a();
                        }
                    } else if (i17 == 1 || i17 == 4) {
                        if (n00Var.f7386b == 1) {
                            ibVar.G = true;
                        } else {
                            ibVar.G = false;
                        }
                        ibVar.L.e(ibVar.f190411n, n00Var.f7387c, false);
                        ibVar.L.d(ibVar.f190411n);
                        ibVar.L.c(ibVar.f190411n);
                        ibVar.o();
                        ibVar.f190413p.fullScroll(130);
                        com.tencent.mm.pluginsdk.ui.chat.ib.d(ibVar, n00Var.f7385a);
                    } else {
                        ibVar.n();
                    }
                    return true;
                }
            };
            this.M = iListener;
            iListener.alive();
        }
        if (this.f190403d == null) {
            com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = (com.tencent.mm.pluginsdk.ui.VoiceInputLayout) findViewById(com.tencent.mm.R.id.p5x);
            this.f190403d = voiceInputLayout;
            voiceInputLayout.setVoiceDetectListener(this.f190423x0);
            this.f190403d.setLongClickLisnter(this.W);
            this.f190403d.setFromFullScreen(this.f190419u);
        }
        if (this.P == null) {
            this.P = new b31.d();
        }
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 != null) {
            java.lang.String string = d17.getString("voiceinput_downdistance_content", "");
            if (!string.equalsIgnoreCase("")) {
                this.L.c(this.f190411n);
                this.L.e(this.f190411n, string, false);
                this.L.d(this.f190411n);
                this.L.c(this.f190411n);
                o();
                this.f190413p.fullScroll(130);
                k(false);
                d17.edit().remove("voiceinput_downdistance_content").apply();
            }
        }
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("phone");
        this.N = telephonyManager;
        if (telephonyManager != null) {
            if (this.f190414p0 == null) {
                this.f190414p0 = new com.tencent.mm.pluginsdk.ui.chat.hb(this.f190403d);
            }
            ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.f190414p0);
        }
    }

    public final void i(com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(voiceInputBehavior.cancel), java.lang.Integer.valueOf(voiceInputBehavior.send), java.lang.Integer.valueOf(voiceInputBehavior.click), java.lang.Integer.valueOf(voiceInputBehavior.longClick), java.lang.Long.valueOf(voiceInputBehavior.longClickTime), java.lang.Integer.valueOf(voiceInputBehavior.textClick), java.lang.Integer.valueOf(voiceInputBehavior.textChangeCount), java.lang.Long.valueOf(voiceInputBehavior.textChangeTime), java.lang.Integer.valueOf(voiceInputBehavior.textChangeReturn), java.lang.Long.valueOf(voiceInputBehavior.voiceInputTime), java.lang.Integer.valueOf(voiceInputBehavior.fail), java.lang.Integer.valueOf(voiceInputBehavior.clear), java.lang.Integer.valueOf(voiceInputBehavior.smileIconClick), java.lang.Integer.valueOf(voiceInputBehavior.voiceIconClick), java.lang.Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), java.lang.Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = new com.tencent.mm.plugin.report.kvdata.log_13905();
        log_13905Var.viOp_ = voiceInputBehavior;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.I(13905, log_13905Var, false, false);
    }

    public void j() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "pause");
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f190403d;
        if (voiceInputLayout != null) {
            voiceInputLayout.a();
        }
        this.f190420v = 0.0f;
        this.f190421w = false;
        this.f190422x = false;
        this.f190424y = false;
        this.f190426z = false;
        this.F = false;
        this.f190409l1 = true;
    }

    public void k(boolean z17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        if (z17) {
            com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f190403d;
            if ((voiceInputLayout == null || voiceInputLayout.getCurrentState() == 1) && ((mMEditText = this.f190411n) == null || mMEditText.getText() == null || this.f190411n.getText().length() <= 0)) {
                this.U = com.tencent.mm.sdk.platformtools.t8.Y(16);
            } else {
                z17 = false;
            }
        }
        com.tencent.mm.pluginsdk.ui.chat.lb lbVar = this.f190416r;
        if (lbVar != null) {
            lbVar.e(z17);
        }
    }

    public void l(int i17) {
        m(i17, "");
    }

    public void m(int i17, java.lang.String str) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        int i18 = this.R;
        java.util.ArrayList arrayList = this.T;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "action:%d, applang:%s, voiceLang:%s, sessionId:%s, wording:%d", valueOf, d17, ((java.lang.Integer) arrayList.get(i18)).toString(), this.U, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.S(str)));
        com.tencent.mm.autogen.mmdata.rpt.StreamVoiceInputStruct streamVoiceInputStruct = new com.tencent.mm.autogen.mmdata.rpt.StreamVoiceInputStruct();
        streamVoiceInputStruct.f60988d = i17;
        streamVoiceInputStruct.f60989e = streamVoiceInputStruct.b("WechatLanguage", com.tencent.mm.sdk.platformtools.m2.d(), true);
        streamVoiceInputStruct.f60990f = streamVoiceInputStruct.b("InputLanguage", ((java.lang.Integer) arrayList.get(this.R)).toString(), true);
        streamVoiceInputStruct.f60991g = streamVoiceInputStruct.b("SessionID", this.U, true);
        streamVoiceInputStruct.f60992h = streamVoiceInputStruct.b("Wording", str, true);
        streamVoiceInputStruct.k();
    }

    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
        j();
        this.G = false;
        ((java.util.ArrayList) this.K).clear();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190411n;
        if (mMEditText != null) {
            com.tencent.mm.pluginsdk.ui.o3 o3Var = this.L;
            if (o3Var != null) {
                o3Var.c(mMEditText);
                this.L.e(this.f190411n, "", false);
                this.L.d(this.f190411n);
                this.L.c(this.f190411n);
            }
            o();
        }
        k(true);
    }

    public final void o() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190411n;
        boolean z17 = this.f190419u;
        if (mMEditText == null || mMEditText.getText() == null || this.f190411n.getText().length() != 0) {
            com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f190411n;
            if (mMEditText2 != null) {
                mMEditText2.setCursorVisible(true);
            }
            this.f190406g.setVisibility(0);
            if (!z17) {
                this.f190404e.setVisibility(8);
                this.f190405f.setVisibility(0);
            }
        } else {
            this.f190411n.setSelection(0);
            this.f190411n.setCursorVisible(false);
            this.f190406g.setVisibility(8);
            if (!z17) {
                this.f190404e.setVisibility(0);
            }
            this.f190405f.setVisibility(8);
        }
        if (z17) {
            com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f190412o;
            if (mMEditText3 == null || mMEditText3.getText() == null || this.f190412o.getText().length() != 0) {
                this.f190406g.setVisibility(0);
            } else {
                this.f190406g.setVisibility(8);
            }
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f190411n;
        if (mMEditText4 != null) {
            mMEditText4.clearFocus();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "resumeMusic");
        ym1.f.f463134h.n();
        if (this.C) {
            return;
        }
        this.C = true;
        java.lang.System.currentTimeMillis();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public void p(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "startVoiceInputUIActivity offset = %s", java.lang.Integer.valueOf(i17));
        if (this.f190403d != null) {
            com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
            voiceInputBehavior.textClick = this.f190403d.getCurrentState();
            i(voiceInputBehavior);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(getContext(), com.tencent.mm.pluginsdk.ui.VoiceInputUI.class);
        intent.putExtra("offset", i17);
        intent.putExtra("userCode", this.Q);
        intent.putExtra("isFromWeNote", this.V);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190411n;
        if (mMEditText != null && mMEditText.getText() != null) {
            intent.putExtra(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, this.f190411n.getText().toString());
            com.tencent.mm.pluginsdk.ui.o3 o3Var = this.L;
            if (o3Var != null) {
                o3Var.c(this.f190411n);
            }
        }
        if (this.I.equalsIgnoreCase("。") || this.I.equalsIgnoreCase(".")) {
            intent.putExtra("punctuation", this.I);
        }
        this.L.b(this.Q, ((java.lang.Integer) this.T.get(this.R)).intValue());
        android.content.Context context = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "startVoiceInputUIActivity", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "startVoiceInputUIActivity", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f190403d;
        if (voiceInputLayout != null) {
            com.tencent.mm.sdk.platformtools.t8.t0(voiceInputLayout);
            this.f190403d.a();
        }
    }

    public void setCallback(com.tencent.mm.pluginsdk.ui.chat.gb gbVar) {
        this.f190410m = gbVar;
    }

    public void setChatUsername(java.lang.String value) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setChatUsername: ");
        sb6.append(value);
        sb6.append(", voiceInputWetypeGuideHolder=");
        sb6.append(this.f190416r != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", sb6.toString());
        com.tencent.mm.pluginsdk.ui.chat.lb lbVar = this.f190416r;
        if (lbVar != null) {
            lbVar.getClass();
            kotlin.jvm.internal.o.g(value, "value");
            lbVar.f190475o = value;
        }
    }

    public void setFullScreenData(java.lang.String str) {
        if (str != null) {
            this.I = str;
        }
        o();
    }

    public void setIsFromWeNote(boolean z17) {
        this.V = z17;
        if (z17) {
            this.f190406g.setText(this.f190417s.getString(com.tencent.mm.R.string.lx6));
        }
    }

    public void setPortHeightPX(int i17) {
        if (this.f190425y0 != i17) {
            this.f190425y0 = i17;
            this.f190409l1 = true;
        }
    }

    public void setToUser(java.lang.String str) {
        int intValue;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
            return;
        }
        this.Q = str;
        this.R = 0;
        com.tencent.mm.pluginsdk.ui.o3 o3Var = this.L;
        synchronized (o3Var) {
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.pluginsdk.ui.o3.f190914i;
            if (r2Var.size() == 0) {
                o3Var.a();
            }
            intValue = r2Var.k(str) ? ((java.lang.Integer) r2Var.get(str)).intValue() : 0;
        }
        for (int i17 = 0; i17 < this.T.size(); i17++) {
            if (intValue == ((java.lang.Integer) this.T.get(i17)).intValue()) {
                this.R = i17;
                this.f190408i.setText((java.lang.CharSequence) this.S.get(i17));
                this.f190403d.setLangType(((java.lang.Integer) this.T.get(this.R)).intValue());
                if (this.T.size() < 2) {
                    this.f190407h.setVisibility(8);
                    return;
                }
                return;
            }
        }
    }
}
