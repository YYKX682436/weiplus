package com.tencent.mm.plugin.websearch.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchSnsImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class WebSearchSnsImageLoadingUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f181666t = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f181668e;

    /* renamed from: f, reason: collision with root package name */
    public long f181669f;

    /* renamed from: h, reason: collision with root package name */
    public int f181671h;

    /* renamed from: i, reason: collision with root package name */
    public int f181672i;

    /* renamed from: o, reason: collision with root package name */
    public r45.jj4 f181675o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f181677q;

    /* renamed from: s, reason: collision with root package name */
    public long f181679s;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f181667d = "MicroMsg.WebSearch.WebSearchSnsImageLoadingUI";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181670g = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f181673m = true;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181674n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f181676p = "";

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f181678r = jz5.h.b(new vv4.a1(this));

    public final void T6(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        pm0.v.K(null, new vv4.y0(this, i17, str2, str, i18, j17));
    }

    public final void U6(java.lang.String imagePath) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        ry3.p pVar = new ry3.p();
        pVar.f401533g = this.f181668e;
        pVar.f401531e = imagePath;
        pVar.f401534h = 4;
        r45.cj cjVar = new r45.cj();
        pVar.f401535i = cjVar;
        cjVar.f371579d = com.tencent.mm.plugin.websearch.l2.a(0);
        pVar.f401539m = this.f181673m;
        r45.e64 i17 = su4.r2.i();
        if (i17 != null) {
            r45.vi viVar = new r45.vi();
            pVar.f401536j = viVar;
            viVar.f388272e = i17.f373046d;
            viVar.f388271d = i17.f373047e;
            viVar.f388273f = i17.f373048f;
            pVar.f401527a = this.f181669f;
        }
        r45.jj4 jj4Var = this.f181675o;
        if (jj4Var != null) {
            try {
                pVar.f401542p.putByteArray("key_sns_media_data", jj4Var.toByteArray());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f181667d, e17, "startImageSearch mediaObj toByteArray exception", new java.lang.Object[0]);
            }
        }
        T6(2, imagePath, this.f181670g, 0, java.lang.System.currentTimeMillis());
        long Ni = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ni(pVar, new vv4.d1(this, imagePath));
        this.f181679s = Ni;
        if (Ni != 0) {
            T6(4, imagePath, this.f181670g, 0, java.lang.System.currentTimeMillis());
        }
    }

    public final void a() {
        ((com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.im6)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.iml)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.dhe)).setVisibility(8);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.dkg)).setVisibility(0);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.dkd)).setVisibility(0);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.dkd)).setOnClickListener(new vv4.x0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9m;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6(11, "", this.f181670g, 0, java.lang.System.currentTimeMillis());
        this.f181677q = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f181669f = getIntent().getLongExtra("key_session_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_sns_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f181674n = stringExtra;
        getIntent().getStringExtra("key_sns_username");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_sns_image_path");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f181676p = stringExtra2;
        this.f181668e = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f181671h = getIntent().getIntExtra("key_scene", 0);
        java.lang.String c17 = o13.p.c(this.f181669f);
        kotlin.jvm.internal.o.f(c17, "getUnsignedLong(...)");
        this.f181670g = c17;
        this.f181672i = getIntent().getIntExtra("key_source", 0);
        this.f181673m = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        int i17 = this.f181671h;
        if (i17 == 0) {
            i17 = 83;
        }
        this.f181671h = i17;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_sns_media");
        if (byteArrayExtra != null) {
            r45.jj4 jj4Var = new r45.jj4();
            try {
                jj4Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception unused) {
            }
            this.f181675o = jj4Var;
        }
        setBackBtn(new vv4.v0(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        setMMTitle("");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e(this.f181667d, "startImageSearch account not ready");
            a();
            return;
        }
        if (com.tencent.mm.vfs.w6.j(this.f181676p)) {
            showLoading();
            U6(this.f181676p);
            ((android.widget.Button) findViewById(com.tencent.mm.R.id.dhe)).setOnClickListener(new vv4.w0(this));
            return;
        }
        r45.jj4 jj4Var2 = this.f181675o;
        if (jj4Var2 == null) {
            a();
            return;
        }
        ((com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1) ((jz5.n) this.f181678r).getValue()).alive();
        showLoading();
        com.tencent.mm.autogen.events.SnsImageDownloadedEvent snsImageDownloadedEvent = new com.tencent.mm.autogen.events.SnsImageDownloadedEvent();
        am.yv yvVar = snsImageDownloadedEvent.f54816g;
        yvVar.f8482b = jj4Var2;
        yvVar.f8483c = jj4Var2.f377855d;
        yvVar.f8481a = 4;
        snsImageDownloadedEvent.e();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.plugin.websearch.ui.WebSearchSnsImageLoadingUI$snsImageDownloadListener$2$1) ((jz5.n) this.f181678r).getValue()).dead();
        if (this.f181679s != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f181679s);
        }
        super.onDestroy();
    }

    public final void showLoading() {
        if (com.tencent.mm.ui.bk.C()) {
            ((com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.im6)).setImageResource(com.tencent.mm.R.raw.websearch_dark_loading);
        } else {
            ((com.tencent.mm.plugin.gif.MMAnimateView) findViewById(com.tencent.mm.R.id.im6)).setImageResource(com.tencent.mm.R.raw.websearch_light_loading);
        }
    }
}
