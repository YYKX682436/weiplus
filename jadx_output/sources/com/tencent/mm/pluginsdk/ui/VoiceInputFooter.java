package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class VoiceInputFooter extends com.tencent.mm.ui.BasePanelKeybordLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f189840x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f189841n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f189842o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ib f189843p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f189844q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageButton f189845r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f189846s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f189847t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f189848u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f189849v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.n3 f189850w;

    public VoiceInputFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189844q = null;
        this.f189848u = false;
        this.f189849v = false;
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        this.f189841n = mMActivity;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.d4e, this);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.f482925s0);
        this.f189846s = imageButton;
        imageButton.setOnClickListener(new com.tencent.mm.pluginsdk.ui.j3(this));
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) viewGroup.findViewById(com.tencent.mm.R.id.f482835p9);
        this.f189845r = imageButton2;
        imageButton2.setOnClickListener(new com.tencent.mm.pluginsdk.ui.k3(this));
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f189842o = new com.tencent.mm.pluginsdk.ui.chat.t5(mMActivity);
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel wi6 = ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(getContext());
        this.f189842o = wi6;
        wi6.setEntranceScene(0);
        this.f189842o.setVisibility(8);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.m7g);
        this.f189847t = linearLayout;
        linearLayout.setOnClickListener(null);
        this.f189847t.addView(this.f189842o, -1, com.tencent.mm.sdk.platformtools.d2.g(getContext()));
        this.f189842o.c();
        this.f189842o.i();
        this.f189842o.setOnTextOperationListener(new com.tencent.mm.pluginsdk.ui.l3(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f189842o.getLayoutParams();
        layoutParams.height = com.tencent.mm.sdk.platformtools.d2.g(getContext());
        this.f189842o.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.BasePanelKeybordLayout
    public java.util.List<android.view.View> getPanelView() {
        return new java.util.ArrayList();
    }

    public final void i() {
        this.f189849v = false;
        this.f189842o.h();
        this.f189842o.setVisibility(8);
    }

    public final void j() {
        this.f189848u = false;
        com.tencent.mm.pluginsdk.ui.chat.ib ibVar = this.f189843p;
        if (ibVar != null) {
            ibVar.j();
            this.f189843p.setVisibility(8);
            this.f189846s.setImageResource(com.tencent.mm.R.drawable.b9u);
            this.f189845r.setVisibility(0);
            com.tencent.mm.pluginsdk.ui.n3 n3Var = this.f189850w;
            if (n3Var != null) {
                ((com.tencent.mm.pluginsdk.ui.f4) n3Var).f190835a.f189872e.setVisibility(0);
            }
        }
    }

    public final void k(int i17) {
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        if (i17 == 1) {
            voiceInputBehavior.smileIconClick = 1;
        } else if (i17 != 2) {
            return;
        } else {
            voiceInputBehavior.voiceIconClick = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputFooter", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(voiceInputBehavior.cancel), java.lang.Integer.valueOf(voiceInputBehavior.send), java.lang.Integer.valueOf(voiceInputBehavior.click), java.lang.Integer.valueOf(voiceInputBehavior.longClick), java.lang.Long.valueOf(voiceInputBehavior.longClickTime), java.lang.Integer.valueOf(voiceInputBehavior.textClick), java.lang.Integer.valueOf(voiceInputBehavior.textChangeCount), java.lang.Long.valueOf(voiceInputBehavior.textChangeTime), java.lang.Integer.valueOf(voiceInputBehavior.textChangeReturn), java.lang.Long.valueOf(voiceInputBehavior.voiceInputTime), java.lang.Integer.valueOf(voiceInputBehavior.fail), java.lang.Integer.valueOf(voiceInputBehavior.clear), java.lang.Integer.valueOf(voiceInputBehavior.smileIconClick), java.lang.Integer.valueOf(voiceInputBehavior.voiceIconClick), java.lang.Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), java.lang.Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = new com.tencent.mm.plugin.report.kvdata.log_13905();
        log_13905Var.viOp_ = voiceInputBehavior;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.I(13905, log_13905Var, false, false);
    }

    public void setVoiceInputFooterListener(com.tencent.mm.pluginsdk.ui.n3 n3Var) {
        this.f189850w = n3Var;
    }
}
