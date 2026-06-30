package com.tencent.mm.plugin.voiceprint.ui;

/* loaded from: classes15.dex */
public abstract class BaseVoicePrintUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f176163w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f176164d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f176165e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f176166f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter f176167g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView f176168h;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f176173p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f176174q;

    /* renamed from: i, reason: collision with root package name */
    public fq4.d0 f176169i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f176170m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f176171n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f176172o = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f176175r = false;

    /* renamed from: s, reason: collision with root package name */
    public final fq4.a0 f176176s = new com.tencent.mm.plugin.voiceprint.ui.a(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f176177t = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.voiceprint.ui.b(this), true);

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f176178u = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.voiceprint.ui.c(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f176179v = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.voiceprint.ui.e(this));

    public void T6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseVoicePrintUI", "hideLoadingProgress: ");
        android.view.View view = this.f176174q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176164d.setVisibility(0);
    }

    public void U6() {
        android.view.View view = this.f176173p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public abstract void V6();

    public abstract void W6();

    public void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseVoicePrintUI", "showLoadingProgress: ");
        android.view.View view = this.f176174q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176164d.setVisibility(8);
    }

    public void Y6() {
        android.view.View view = this.f176173p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (getIntent().hasExtra("trans_out_anim")) {
            overridePendingTransition(com.tencent.mm.R.anim.f477728p, getIntent().getIntExtra("trans_out_anim", 0));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489604db5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f176168h = (com.tencent.mm.plugin.voiceprint.ui.VoiceTipInfoView) findViewById(com.tencent.mm.R.id.o_i);
        this.f176164d = (android.widget.Button) findViewById(com.tencent.mm.R.id.ln8);
        this.f176165e = findViewById(com.tencent.mm.R.id.ln9);
        this.f176173p = findViewById(com.tencent.mm.R.id.l3l);
        this.f176174q = findViewById(com.tencent.mm.R.id.ln_);
        this.f176166f = findViewById(com.tencent.mm.R.id.p89);
        this.f176167g = (com.tencent.mm.plugin.voiceprint.ui.VoicePrintVolumeMeter) findViewById(com.tencent.mm.R.id.p8_);
        this.f176168h.a();
        this.f176167g.setArchView(this.f176164d);
        fq4.d0 d0Var = new fq4.d0();
        this.f176169i = d0Var;
        d0Var.f265586g = this.f176176s;
        this.f176164d.setOnTouchListener(new com.tencent.mm.plugin.voiceprint.ui.g(this));
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.f176163w;
                com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.this.finish();
                return true;
            }
        }, com.tencent.mm.R.raw.actionbar_icon_dark_close);
        V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f176167g.f176217h.d();
        fq4.d0 d0Var = this.f176169i;
        if (d0Var != null) {
            d0Var.f265586g = null;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(fq4.u.a("voice_pt_voice_print_record.rec", false));
        if (r6Var.m()) {
            r6Var.l();
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(fq4.u.a("voice_pt_voice_print_noise_detect.rec", false));
        if (r6Var2.m()) {
            r6Var2.l();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseVoicePrintUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        } else if (i17 == 80 && iArr[0] != 0) {
            ((com.tencent.mm.plugin.voiceprint.ui.a) this.f176176s).a();
        }
    }
}
