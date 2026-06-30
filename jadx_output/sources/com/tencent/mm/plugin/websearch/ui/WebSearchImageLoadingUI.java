package com.tencent.mm.plugin.websearch.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/websearch/ui/WebSearchImageLoadingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class WebSearchImageLoadingUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f181653s = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f181655e;

    /* renamed from: g, reason: collision with root package name */
    public long f181657g;

    /* renamed from: i, reason: collision with root package name */
    public int f181659i;

    /* renamed from: m, reason: collision with root package name */
    public long f181660m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f181661n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181662o;

    /* renamed from: r, reason: collision with root package name */
    public long f181665r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f181654d = "MicroMsg.WebSearch.WebSearchImageLoadingUI";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181656f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181658h = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f181663p = true;

    /* renamed from: q, reason: collision with root package name */
    public final vv4.k0 f181664q = new vv4.k0(this);

    public final void T6() {
        com.tencent.mars.xlog.Log.i(this.f181654d, "cancelDownloadImage isDownloading: %b, imgLocalId: %d, msgId: %d, talker: %s", java.lang.Boolean.valueOf(this.f181661n), java.lang.Long.valueOf(this.f181660m), java.lang.Long.valueOf(this.f181655e), this.f181656f);
        if (this.f181661n || this.f181660m != 0) {
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).g(this.f181660m, new com.tencent.mm.plugin.msg.MsgIdTalker(this.f181655e, this.f181656f), 0, this.f181664q);
        }
    }

    public final void U6(int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        pm0.v.K(null, new vv4.o0(str, this, i17, str2, i18, j17));
    }

    public final void V6(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
        p15.e eVar = new p15.e();
        java.lang.String str3 = n17.G;
        if (str3 == null) {
            str3 = "";
        }
        eVar.fromXml(str3);
        p15.s q17 = eVar.q();
        java.lang.String uuid = q17 != null ? q17.getUuid() : null;
        java.lang.String str4 = uuid != null ? uuid : "";
        ry3.p pVar = new ry3.p();
        pVar.f401529c = j17;
        pVar.f401530d = str;
        pVar.f401527a = this.f181657g;
        pVar.f401533g = i17;
        pVar.f401534h = 4;
        r45.cj cjVar = new r45.cj();
        pVar.f401535i = cjVar;
        cjVar.f371579d = com.tencent.mm.plugin.websearch.l2.a(0);
        pVar.f401539m = this.f181663p;
        pVar.f401532f = str4;
        r45.e64 i18 = su4.r2.i();
        if (i18 != null) {
            r45.vi viVar = new r45.vi();
            pVar.f401536j = viVar;
            viVar.f388272e = i18.f373046d;
            viVar.f388271d = i18.f373047e;
            viVar.f388273f = i18.f373048f;
        }
        U6(2, str2, this.f181658h, 0, java.lang.System.currentTimeMillis());
        long Ni = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Ni(pVar, new vv4.s0(this, str2));
        this.f181665r = Ni;
        if (Ni != 0) {
            U6(4, str2, this.f181658h, 0, java.lang.System.currentTimeMillis());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c7, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r2) != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(boolean r20) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.ui.WebSearchImageLoadingUI.W6(boolean):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9m;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        T6();
        U6(11, "", this.f181658h, 0, java.lang.System.currentTimeMillis());
        this.f181662o = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new vv4.l0(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        setMMTitle("");
        this.f181655e = getIntent().getLongExtra("key_msg_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_msg_talker");
        this.f181656f = stringExtra != null ? stringExtra : "";
        this.f181657g = getIntent().getLongExtra("key_session_id", 0L);
        this.f181659i = getIntent().getIntExtra("key_scan_goods_request_type", 0);
        this.f181663p = getIntent().getBooleanExtra("key_upload_image_use_cdn_opt", true);
        java.lang.String c17 = o13.p.c(this.f181657g);
        kotlin.jvm.internal.o.f(c17, "getUnsignedLong(...)");
        this.f181658h = c17;
        W6(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        if (this.f181665r != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f181665r);
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
