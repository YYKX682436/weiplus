package com.tencent.mm.plugin.qqmail.ui;

/* loaded from: classes8.dex */
public class AttachDownloadPage extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int F = 0;
    public long B;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f154810d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f154811e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f154812f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f154813g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f154814h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154815i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154816m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f154817n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f154818o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f154819p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f154820q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154821r;

    /* renamed from: s, reason: collision with root package name */
    public int f154822s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f154824u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f154825v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f154826w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f154827x;

    /* renamed from: y, reason: collision with root package name */
    public long f154828y;

    /* renamed from: t, reason: collision with root package name */
    public boolean f154823t = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f154829z = true;
    public int A = 0;
    public int C = 0;
    public boolean D = false;

    public static void T6(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage, java.lang.String str) {
        attachDownloadPage.getClass();
        java.lang.String n17 = com.tencent.mm.vfs.w6.n(str);
        if (n17 == null || n17.length() == 0) {
            return;
        }
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(attachDownloadPage, str, n17, 3);
    }

    public static void U6(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        long k17 = com.tencent.mm.vfs.w6.k(attachDownloadPage.Z6(true));
        attachDownloadPage.f154812f.setProgress((int) ((100 * k17) / attachDownloadPage.f154828y));
        attachDownloadPage.f154815i.setText(attachDownloadPage.getString(com.tencent.mm.R.string.gpl, com.tencent.mm.sdk.platformtools.t8.f0(k17), com.tencent.mm.sdk.platformtools.t8.f0(attachDownloadPage.f154828y)));
        if (attachDownloadPage.A != 1 || (attachDownloadPage.B == 0 && com.tencent.mm.sdk.platformtools.t8.K0(attachDownloadPage.E))) {
            attachDownloadPage.f154815i.setVisibility(8);
        } else {
            attachDownloadPage.f154815i.setVisibility(0);
        }
    }

    public final void V6() {
        if (com.tencent.mm.vfs.w6.j(Z6(true))) {
            com.tencent.mm.vfs.w6.k(Z6(true));
            this.A = 2;
            return;
        }
        if (com.tencent.mm.vfs.w6.j(Z6(false))) {
            this.A = 3;
            return;
        }
        if (!com.tencent.mm.vfs.w6.j(Y6())) {
            this.A = 0;
            return;
        }
        if (com.tencent.mm.vfs.w6.k(Y6()) == this.f154828y) {
            com.tencent.mm.vfs.w6.P(this.f154821r, this.f154824u, X6());
            this.A = 3;
        } else if (com.tencent.mm.vfs.w6.k(Y6()) <= this.f154828y) {
            this.A = 0;
        } else {
            com.tencent.mm.vfs.w6.h(Y6());
            this.A = 4;
        }
    }

    public final void W6() {
        V6();
        int i17 = this.A;
        if (i17 == 4) {
            int i18 = this.C;
            if (i18 < 5) {
                this.C = i18 + 1;
                W6();
            } else {
                b7();
            }
        } else if (i17 == 3) {
            com.tencent.mm.vfs.w6.P(this.f154821r, X6() + ".temp", X6());
            this.A = 3;
            b7();
        }
        java.lang.String Z6 = Z6(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AttachDownloadPage", "download attach url %s, isBigAttach %b", this.f154827x, java.lang.Boolean.valueOf(this.D));
        if (this.D) {
            this.E = com.tencent.mm.sdk.platformtools.w2.a(this.f154827x);
            com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
            c2CDownloadRequest.fileKey = this.E;
            c2CDownloadRequest.url = this.f154827x;
            c2CDownloadRequest.setSavePath(Z6);
            c2CDownloadRequest.customHeader = java.lang.String.format("cookie:%s", getIntent().getStringExtra("qqmail_cookie"), "");
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, null, new os3.m(this), 0);
            return;
        }
        java.lang.String str = this.f154827x;
        java.lang.String stringExtra = getIntent().getStringExtra("qqmail_cookie");
        os3.a aVar = new os3.a(this);
        java.lang.String str2 = is3.d.f294481a;
        is3.c cVar = new is3.c(str, Z6, aVar);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("param_cookie", stringExtra);
        cVar.f(bundle);
    }

    public final java.lang.String X6() {
        java.lang.String str;
        java.lang.String str2;
        int hashCode = this.f154826w.hashCode() & 65535;
        int lastIndexOf = this.f154824u.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str = this.f154824u.substring(0, lastIndexOf);
            java.lang.String str3 = this.f154824u;
            str2 = str3.substring(lastIndexOf, str3.length());
        } else {
            str = this.f154824u;
            str2 = "";
        }
        return java.lang.String.format("%s_%d%s", str, java.lang.Integer.valueOf(hashCode), str2);
    }

    public final java.lang.String Y6() {
        return this.f154821r + this.f154824u;
    }

    public final java.lang.String Z6(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f154821r);
        sb6.append(X6());
        sb6.append(!z17 ? "" : ".temp");
        return sb6.toString();
    }

    public final void a7() {
        android.view.View view = this.f154811e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154816m.setVisibility(8);
        this.f154817n.setVisibility(8);
        this.f154813g.setVisibility(0);
        this.f154814h.setVisibility(8);
        this.f154815i.setVisibility(8);
        this.f154819p.setVisibility(8);
        this.f154820q.setVisibility(8);
        this.f154813g.setOnClickListener(new os3.e(this));
        this.f154814h.setOnClickListener(new os3.f(this));
    }

    public final void b7() {
        int i17 = this.f154822s;
        if (i17 != 1) {
            if (i17 == 0) {
                android.view.View view = this.f154811e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f154816m.setVisibility(8);
                this.f154817n.setVisibility(0);
                this.f154815i.setVisibility(8);
                this.f154819p.setVisibility(0);
                this.f154820q.setVisibility(8);
                int i18 = this.A;
                if (i18 == 3) {
                    this.f154817n.setText(com.tencent.mm.R.string.gpk);
                    enableOptionMenu(true);
                } else if (i18 == 2) {
                    this.f154817n.setText(com.tencent.mm.R.string.gpr);
                } else {
                    this.f154817n.setText(com.tencent.mm.R.string.gph);
                }
                this.f154819p.setText(com.tencent.mm.R.string.gpj);
                this.f154817n.setOnClickListener(new os3.j(this));
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.g1.a(this.f154824u)) {
            int i19 = this.A;
            if (i19 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_favorite", true);
                intent.putExtra("key_favorite_source_type", 9);
                intent.putExtra("key_image_path", Z6(false));
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.B(getContext(), intent);
                finish();
                return;
            }
            if (i19 == 0 || this.f154829z) {
                this.C = 0;
                this.f154829z = false;
                W6();
                a7();
                return;
            }
        }
        android.view.View view2 = this.f154811e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154819p.setVisibility(0);
        this.f154815i.setVisibility(8);
        this.f154816m.setVisibility(0);
        this.f154817n.setVisibility(8);
        this.f154820q.setVisibility(0);
        this.f154816m.setOnClickListener(new os3.g(this));
        if (this.A == 3) {
            this.f154819p.setText(com.tencent.mm.R.string.gpq);
            this.f154820q.setText(com.tencent.mm.R.string.gpn);
            this.f154820q.setOnClickListener(new os3.h(this));
            enableOptionMenu(true);
            return;
        }
        this.f154819p.setText(com.tencent.mm.R.string.gpq);
        if (this.A == 2) {
            this.f154820q.setText(com.tencent.mm.R.string.gpp);
        } else {
            this.f154820q.setText(com.tencent.mm.R.string.gpo);
        }
        this.f154820q.setOnClickListener(new os3.i(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488160is;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f154810d = (com.tencent.mm.ui.MMImageView) findViewById(com.tencent.mm.R.id.f484125d45);
        this.f154811e = findViewById(com.tencent.mm.R.id.d3v);
        this.f154812f = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.d3t);
        this.f154813g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f484120d40);
        this.f154814h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.d3z);
        this.f154815i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a68);
        this.f154816m = (android.widget.Button) findViewById(com.tencent.mm.R.id.a6_);
        this.f154817n = (android.widget.Button) findViewById(com.tencent.mm.R.id.a67);
        this.f154818o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f483285a66);
        this.f154819p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a69);
        this.f154820q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a6a);
        if (com.tencent.mm.sdk.platformtools.g1.a(this.f154824u)) {
            this.f154810d.setBackgroundResource(com.tencent.mm.R.raw.download_image_icon);
        } else {
            java.lang.String str = this.f154824u;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String lowerCase = str.toLowerCase();
            if (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".wma") || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".rm")) {
                this.f154810d.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_video);
            } else {
                this.f154810d.setImageResource(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).fj(false, com.tencent.mm.vfs.w6.n(this.f154824u), false, false));
            }
        }
        setBackBtn(new os3.b(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_share, new os3.d(this));
        enableOptionMenu(false);
        V6();
        if (this.A == 1) {
            a7();
        } else {
            b7();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 3);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = getResources().getConfiguration().orientation;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f154818o.getLayoutParams();
        if (i17 == 2) {
            layoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 60);
        } else if (i17 == 1) {
            layoutParams.bottomMargin = com.tencent.mm.ui.zk.a(getContext(), 120);
        }
        this.f154818o.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154822s = getIntent().getIntExtra("is_preview", 0);
        this.f154823t = getIntent().getBooleanExtra("is_compress", false);
        this.f154824u = getIntent().getStringExtra("attach_name");
        this.f154825v = getIntent().getStringExtra("mail_id");
        this.f154826w = getIntent().getStringExtra("attach_id");
        this.f154827x = ks3.k0.c() + getIntent().getStringExtra("attach_url");
        this.f154828y = (long) getIntent().getIntExtra("total_size", 0);
        this.D = getIntent().getBooleanExtra("is_big_attach", false);
        this.f154821r = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().d();
        setMMTitle(this.f154824u);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().b(this.B);
        if (!this.D || com.tencent.mm.vfs.w6.j(Y6()) || com.tencent.mm.sdk.platformtools.t8.K0(this.E)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AttachDownloadPage", "onDestroy: cancel downloading big attach, delete temp file");
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(this.E);
        this.E = null;
        com.tencent.mm.vfs.w6.h(Z6(true));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
