package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class m extends android.widget.LinearLayout {
    public android.media.AudioManager A;
    public final com.tencent.mm.pluginsdk.ui.t3 B;
    public com.tencent.mm.sdk.platformtools.h5 C;
    public final com.tencent.mm.pluginsdk.ui.u3 D;
    public final int E;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.VoiceInputLayout f192065d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f192066e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f192067f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f192068g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.websearch.l f192069h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f192070i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f192071m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.Context f192072n;

    /* renamed from: o, reason: collision with root package name */
    public long f192073o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f192074p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f192075q;

    /* renamed from: r, reason: collision with root package name */
    public long f192076r;

    /* renamed from: s, reason: collision with root package name */
    public long f192077s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f192078t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f192079u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f192080v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Toast f192081w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f192082x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f192083y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f192084z;

    public m(android.content.Context context, boolean z17, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        super(context);
        this.f192073o = 0L;
        this.f192074p = false;
        this.f192075q = false;
        this.f192076r = 0L;
        this.f192077s = 0L;
        this.f192078t = false;
        this.f192079u = false;
        this.f192080v = false;
        this.f192082x = new java.util.ArrayList();
        this.f192084z = "";
        this.B = new com.tencent.mm.pluginsdk.ui.websearch.i(this);
        this.C = new com.tencent.mm.pluginsdk.ui.websearch.j(this);
        this.D = new com.tencent.mm.pluginsdk.ui.websearch.k(this);
        this.E = i65.a.b(getContext(), 280);
        this.F = true;
        this.f192072n = context;
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d9n, this);
        this.f192066e = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.p5p);
        this.f192067f = (android.widget.Button) findViewById(com.tencent.mm.R.id.p5o);
        this.f192068g = (android.widget.Button) findViewById(com.tencent.mm.R.id.p5u);
        this.f192071m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487098ni0);
        this.f192066e.setVisibility(0);
        this.f192068g.setVisibility(4);
        this.f192067f.setVisibility(8);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.p5w);
        this.f192070i = mMEditText2;
        mMEditText2.setHintTextColor(getResources().getColor(com.tencent.mm.R.color.a09));
        this.f192070i.setClickable(false);
        this.f192066e.setOnClickListener(new com.tencent.mm.pluginsdk.ui.websearch.h(this));
        this.f192070i.clearFocus();
        this.f192070i.setFocusable(false);
        this.f192070i.setClickable(false);
        this.f192070i.setLongClickable(false);
        this.A = (android.media.AudioManager) getContext().getSystemService("audio");
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.nanoTime());
        this.f192084z = valueOf;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "mToUser %s", valueOf);
        d();
    }

    public static void a(com.tencent.mm.pluginsdk.ui.websearch.m mVar, int i17) {
        android.widget.Toast toast = mVar.f192081w;
        if (toast != null) {
            toast.cancel();
        }
        android.content.Context context = mVar.f192072n;
        android.widget.Toast makeText = dp.a.makeText(context, context.getResources().getString(i17), 0);
        mVar.f192081w = makeText;
        makeText.setGravity(17, 0, 0);
        mVar.f192081w.show();
    }

    public static void b(com.tencent.mm.pluginsdk.ui.websearch.m mVar, int i17) {
        com.tencent.mm.ui.widget.MMEditText mMEditText = mVar.f192070i;
        if (mMEditText == null || mMEditText.getText() == null) {
            return;
        }
        java.lang.String obj = mVar.f192070i.getText().toString();
        if ((obj.trim().length() == 0 && obj.length() == 0) || mVar.f192069h == null) {
            return;
        }
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.send = 1;
        if (mVar.f192079u) {
            voiceInputBehavior.send = 2;
        }
        if (i17 != 1 && i17 == 4) {
            voiceInputBehavior.send = 4;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "sendMsg onSendMsg");
        zk5.c cVar = (zk5.c) mVar.f192069h;
        cVar.getClass();
        if (!android.text.TextUtils.isEmpty(obj) && obj.length() > 2) {
            obj = obj.substring(0, obj.length() - 1);
        }
        java.lang.String str = obj;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str);
        com.tencent.mm.ui.websearch.WebSearchVoiceUI webSearchVoiceUI = cVar.f473549a;
        webSearchVoiceUI.setResult(0, intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15178, 3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), str, webSearchVoiceUI.f211226f, webSearchVoiceUI.f211227g, java.lang.Integer.valueOf(webSearchVoiceUI.f211228h), java.lang.Integer.valueOf(webSearchVoiceUI.f211229i));
        webSearchVoiceUI.finish();
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "destroy");
        e();
        com.tencent.mm.sdk.event.IListener iListener = this.f192083y;
        if (iListener != null) {
            iListener.dead();
            this.f192083y = null;
        }
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f192065d;
        if (voiceInputLayout != null) {
            voiceInputLayout.a();
            this.f192065d.setVoiceDetectListener(null);
            this.f192065d.c();
            com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout2 = this.f192065d;
            com.tencent.mm.sdk.platformtools.n3 n3Var = voiceInputLayout2.f189861o;
            if (n3Var != null) {
                n3Var.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = voiceInputLayout2.f189862p;
            if (n3Var2 != null) {
                n3Var2.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = voiceInputLayout2.f189863q;
            if (b4Var != null) {
                b4Var.d();
            }
            this.f192065d = null;
        }
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).Di(this.C);
        this.C = null;
        this.f192072n = null;
    }

    public void d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f192073o = android.os.SystemClock.elapsedRealtime();
        if (this.f192083y == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceInputResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoiceInputResultEvent>(a0Var) { // from class: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$3
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
                    java.lang.String str = n00Var.f7388d;
                    com.tencent.mm.pluginsdk.ui.websearch.m mVar = com.tencent.mm.pluginsdk.ui.websearch.m.this;
                    if (!str.equalsIgnoreCase(mVar.f192084z)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent userCode not equals!");
                        mVar.c();
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent action = %s, textChange: %b", java.lang.Integer.valueOf(n00Var.f7385a), java.lang.Integer.valueOf(n00Var.f7386b));
                    int i17 = n00Var.f7385a;
                    if (i17 == 2) {
                        if (n00Var.f7386b == 1) {
                            mVar.f192079u = true;
                        } else {
                            mVar.f192079u = false;
                        }
                        mVar.f192070i.setText(n00Var.f7387c);
                        mVar.f();
                    } else if (i17 == 3) {
                        com.tencent.mm.pluginsdk.ui.websearch.l lVar = mVar.f192069h;
                        if (lVar != null) {
                            ((zk5.c) lVar).a();
                        }
                    } else if (i17 == 1 || i17 == 4) {
                        if (n00Var.f7386b == 1) {
                            mVar.f192079u = true;
                        } else {
                            mVar.f192079u = false;
                        }
                        mVar.f192070i.setText(n00Var.f7387c);
                        mVar.f();
                        com.tencent.mm.pluginsdk.ui.websearch.m.b(mVar, n00Var.f7385a);
                    } else {
                        mVar.e();
                    }
                    return true;
                }
            };
            this.f192083y = iListener;
            iListener.alive();
        }
        if (this.f192065d == null) {
            com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = (com.tencent.mm.pluginsdk.ui.VoiceInputLayout) findViewById(com.tencent.mm.R.id.p5x);
            this.f192065d = voiceInputLayout;
            voiceInputLayout.setVoiceDetectListener(this.D);
            this.f192065d.setLongClickLisnter(this.B);
        }
        this.f192071m.setVisibility(0);
        ((com.tencent.mm.sdk.platformtools.l5) i95.n0.c(com.tencent.mm.sdk.platformtools.l5.class)).wi(this.C);
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputPanel", "pause");
        com.tencent.mm.pluginsdk.ui.VoiceInputLayout voiceInputLayout = this.f192065d;
        if (voiceInputLayout != null) {
            voiceInputLayout.a();
        }
        this.f192078t = false;
        this.F = true;
        this.f192079u = false;
        ((java.util.ArrayList) this.f192082x).clear();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f192070i;
        if (mMEditText != null) {
            mMEditText.setText("");
            f();
        }
    }

    public final void f() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f192070i;
        if (mMEditText == null || mMEditText.getText() == null || this.f192070i.getText().length() != 0) {
            this.f192066e.setVisibility(4);
            this.f192071m.setVisibility(8);
        } else {
            this.f192068g.setVisibility(4);
            this.f192066e.setVisibility(0);
            this.f192067f.setVisibility(8);
            this.f192071m.setVisibility(0);
        }
        android.media.AudioManager audioManager = this.A;
        if (audioManager != null) {
            audioManager.setStreamMute(3, false);
        }
        if (this.f192075q) {
            return;
        }
        this.f192075q = true;
        java.lang.System.currentTimeMillis();
    }

    public void setCallback(com.tencent.mm.pluginsdk.ui.websearch.l lVar) {
        this.f192069h = lVar;
    }

    public void setToUser(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
        } else {
            this.f192084z = str;
        }
    }
}
