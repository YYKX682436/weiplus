package com.tencent.mm.pluginsdk.ui;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.uc.CTRL_INDEX)
/* loaded from: classes15.dex */
public class VoiceInputUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f189870x = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f189871d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f189872e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.VoiceInputFooter f189873f;

    /* renamed from: g, reason: collision with root package name */
    public int f189874g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f189875h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f189876i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f189877m;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f189883s;

    /* renamed from: n, reason: collision with root package name */
    public long f189878n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f189879o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f189880p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f189881q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f189882r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnTouchListener f189884t = new com.tencent.mm.pluginsdk.ui.e4(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.n3 f189885u = new com.tencent.mm.pluginsdk.ui.f4(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f189886v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f189887w = false;

    public void T6(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("VoiceInputUI", "voiceinputui finish type: %d, call stack: %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        this.f189886v = true;
        if (i17 == 8) {
            V6(7);
        } else {
            V6(i17);
        }
        com.tencent.mm.autogen.events.VoiceInputResultEvent voiceInputResultEvent = new com.tencent.mm.autogen.events.VoiceInputResultEvent();
        am.n00 n00Var = voiceInputResultEvent.f54934g;
        if (i17 == 7) {
            n00Var.f7385a = 1;
        } else if (i17 == 8) {
            n00Var.f7385a = 4;
        } else {
            n00Var.f7385a = 2;
        }
        if (this.f189881q) {
            n00Var.f7386b = 1;
        } else {
            n00Var.f7386b = 2;
        }
        n00Var.f7387c = this.f189871d.getText().toString();
        n00Var.f7388d = this.f189877m;
        com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = this.f189873f;
        if (voiceInputFooter != null) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = voiceInputFooter.f189842o;
            if (chatFooterPanel != null) {
                chatFooterPanel.l();
                voiceInputFooter.f189842o.a();
            }
            com.tencent.mm.pluginsdk.ui.chat.ib ibVar = voiceInputFooter.f189843p;
            if (ibVar != null) {
                ibVar.f();
            }
        }
        voiceInputResultEvent.e();
        com.tencent.mm.sdk.platformtools.t8.t0(this.f189871d);
        if (this.f189887w) {
            super.finish();
        }
    }

    public final void U6(com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior) {
        com.tencent.mars.xlog.Log.i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(voiceInputBehavior.cancel), java.lang.Integer.valueOf(voiceInputBehavior.send), java.lang.Integer.valueOf(voiceInputBehavior.click), java.lang.Integer.valueOf(voiceInputBehavior.longClick), java.lang.Long.valueOf(voiceInputBehavior.longClickTime), java.lang.Integer.valueOf(voiceInputBehavior.textClick), java.lang.Integer.valueOf(voiceInputBehavior.textChangeCount), java.lang.Long.valueOf(voiceInputBehavior.textChangeTime), java.lang.Integer.valueOf(voiceInputBehavior.textChangeReturn), java.lang.Long.valueOf(voiceInputBehavior.voiceInputTime), java.lang.Integer.valueOf(voiceInputBehavior.fail), java.lang.Integer.valueOf(voiceInputBehavior.clear), java.lang.Integer.valueOf(voiceInputBehavior.smileIconClick), java.lang.Integer.valueOf(voiceInputBehavior.voiceIconClick), java.lang.Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), java.lang.Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = new com.tencent.mm.plugin.report.kvdata.log_13905();
        log_13905Var.viOp_ = voiceInputBehavior;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.I(13905, log_13905Var, false, false);
    }

    public final void V6(int i17) {
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        voiceInputBehavior.textChangeCount = this.f189879o;
        voiceInputBehavior.textChangeReturn = i17;
        long j17 = this.f189878n;
        if (j17 != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            voiceInputBehavior.textChangeTime = android.os.SystemClock.elapsedRealtime() - j17;
            this.f189878n = 0L;
        }
        U6(voiceInputBehavior);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4d;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.f189875h = intent.getStringExtra(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
            this.f189874g = intent.getIntExtra("offset", -1);
            this.f189876i = intent.getStringExtra("punctuation");
            this.f189877m = intent.getStringExtra("userCode");
            this.f189882r = intent.getBooleanExtra("isFromWeNote", false);
        }
        getWindow().setSoftInputMode(32);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f189878n = android.os.SystemClock.elapsedRealtime();
        this.f189879o = 0;
        this.f189881q = false;
        this.f189880p = true;
        this.f189871d = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.p5k);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.p5j);
        this.f189872e = button;
        if (this.f189882r) {
            button.setText(getString(com.tencent.mm.R.string.lx6));
        }
        this.f189871d.addTextChangedListener(new com.tencent.mm.pluginsdk.ui.g4(this));
        this.f189872e.setOnClickListener(new com.tencent.mm.pluginsdk.ui.h4(this));
        setMMTitle(getString(com.tencent.mm.R.string.k9e));
        enableOptionMenu(true);
        setBackBtn(new com.tencent.mm.pluginsdk.ui.d4(this));
        this.f189871d.setOnTouchListener(this.f189884t);
        this.f189871d.n(this.f189875h);
        int i17 = this.f189874g;
        if (i17 != -1) {
            this.f189871d.setSelection(i17);
        }
        com.tencent.mm.pluginsdk.ui.VoiceInputFooter voiceInputFooter = (com.tencent.mm.pluginsdk.ui.VoiceInputFooter) findViewById(com.tencent.mm.R.id.m9x);
        this.f189873f = voiceInputFooter;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f189871d;
        java.lang.String str = this.f189876i;
        java.lang.String str2 = this.f189877m;
        voiceInputFooter.f189844q = mMEditText;
        mMEditText.setOnClickListener(new com.tencent.mm.pluginsdk.ui.h3(voiceInputFooter));
        mMEditText.setOnEditorActionListener(new com.tencent.mm.pluginsdk.ui.i3(voiceInputFooter));
        if (voiceInputFooter.f189843p == null) {
            com.tencent.mm.pluginsdk.ui.chat.ib ibVar = new com.tencent.mm.pluginsdk.ui.chat.ib(voiceInputFooter.getContext(), true, voiceInputFooter.f189844q);
            voiceInputFooter.f189843p = ibVar;
            ibVar.setCallback(new com.tencent.mm.pluginsdk.ui.m3(voiceInputFooter));
            voiceInputFooter.f189843p.setPortHeightPX(com.tencent.mm.sdk.platformtools.d2.g(voiceInputFooter.getContext()));
        }
        voiceInputFooter.f189843p.h();
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar2 = voiceInputFooter.f189843p;
        if (ibVar2.f190409l1) {
            ibVar2.f190409l1 = false;
            android.view.View findViewById = ibVar2.findViewById(com.tencent.mm.R.id.p5q);
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i18 = ibVar2.f190425y0;
            if (layoutParams == null) {
                layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i18);
            }
            layoutParams.height = i18;
            findViewById.setLayoutParams(layoutParams);
            ibVar2.o();
            ibVar2.requestLayout();
        }
        voiceInputFooter.f189843p.setVisibility(8);
        voiceInputFooter.f189843p.setToUser(str2);
        voiceInputFooter.f189843p.setFullScreenData(str);
        voiceInputFooter.f189847t.addView(voiceInputFooter.f189843p, -1, 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = voiceInputFooter.f189843p.getLayoutParams();
        layoutParams2.height = com.tencent.mm.sdk.platformtools.d2.g(voiceInputFooter.getContext());
        voiceInputFooter.f189843p.setLayoutParams(layoutParams2);
        this.f189873f.setVoiceInputFooterListener(this.f189885u);
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.f189883s = f5Var;
        f5Var.f210400e = this;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById2 != null) {
            com.tencent.mm.ui.a4.f(findViewById2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            T6(2);
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f189883s.d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f189871d.requestFocus();
        this.f189871d.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.pluginsdk.ui.j4(this));
        this.f189883s.f();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        T6(3);
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        if (z17) {
            this.f189883s.f();
        } else {
            this.f189883s.d();
        }
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        if (i17 <= 0) {
            this.f189887w = true;
            if (this.f189886v) {
                super.finish();
            }
        } else {
            this.f189887w = false;
        }
        float f17 = -i17;
        this.f189873f.setTranslationY(f17);
        this.f189872e.setTranslationY(f17);
    }
}
