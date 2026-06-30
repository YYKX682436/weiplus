package kp3;

/* loaded from: classes12.dex */
public final class f extends y9.i {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f310977n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f310978o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f310979p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.VideoView f310980q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f310981r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.cardview.widget.CardView f310982s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f310983t;

    /* renamed from: u, reason: collision with root package name */
    public long f310984u;

    /* renamed from: v, reason: collision with root package name */
    public long f310985v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f310986w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, java.lang.String str) {
        super(context, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.f310977n = str;
        this.f310986w = "";
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.elo, (android.view.ViewGroup) null);
        if (inflate != null) {
            this.f310978o = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486241up1);
            this.f310979p = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f486240up0);
            this.f310980q = (android.widget.VideoView) inflate.findViewById(com.tencent.mm.R.id.f486242up2);
            this.f310981r = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f486244up4);
            androidx.cardview.widget.CardView cardView = (androidx.cardview.widget.CardView) inflate.findViewById(com.tencent.mm.R.id.f486243up3);
            this.f310982s = cardView;
            if (cardView != null) {
                cardView.post(new kp3.a(this));
            }
            ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.uoz)).setOnClickListener(new kp3.b(this));
            setContentView(inflate);
        }
    }

    public final void E(java.lang.String str) {
        if (isShowing()) {
            this.f310986w = str;
            dismiss();
        }
    }

    public final void F(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.widget.VideoView videoView;
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmGuideDialog", "[showGuideDialog] title:" + str + ", content:" + str2 + ", videoMaskUrl:" + str3 + ", videoUrl: " + str4);
        if (str == null || str.length() == 0) {
            str = getContext().getString(com.tencent.mm.R.string.obv);
        }
        if (!(str == null || str.length() == 0) && (textView = this.f310978o) != null) {
            textView.setText(str);
        }
        if (str2 == null || str2.length() == 0) {
            str2 = getContext().getString(com.tencent.mm.R.string.obu);
        }
        java.lang.String str5 = str2;
        if (!(str5 == null || str5.length() == 0)) {
            android.widget.LinearLayout linearLayout = this.f310979p;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            java.util.List<java.lang.String> f07 = r26.n0.f0(str5, new java.lang.String[]{"\n"}, false, 0, 6, null);
            for (java.lang.String str6 : f07) {
                android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.elp, (android.view.ViewGroup) null);
                if (inflate != null) {
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.uox);
                    if (imageView2 != null) {
                        imageView2.setVisibility(f07.size() > 1 ? 0 : 8);
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uoy);
                    if (textView2 != null) {
                        textView2.setText(str6);
                    }
                    if (linearLayout != null) {
                        linearLayout.addView(inflate);
                    }
                }
            }
        }
        if (str4 == null || str4.length() == 0) {
            str3 = "https://cdn.palmda.com/static/img/palm_guide_img_right.jpg";
        }
        if (str4 == null || str4.length() == 0) {
            str4 = "https://cdn.palmda.com/static/video/right.mp4";
        }
        if (!(str3 == null || str3.length() == 0) && (imageView = this.f310981r) != null) {
            ((wo0.b) vo0.e.f438468b.a(str3)).c(imageView);
            imageView.setVisibility(0);
        }
        if (!(str4 == null || str4.length() == 0) && (videoView = this.f310980q) != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f310985v = 0L;
            if (videoView != null) {
                if (videoView.isPlaying()) {
                    videoView.stopPlayback();
                }
                videoView.setOnPreparedListener(null);
                videoView.setOnInfoListener(null);
            }
            videoView.setOnPreparedListener(kp3.d.f310969a);
            videoView.setOnInfoListener(new kp3.e(new kotlin.jvm.internal.c0(), this, currentTimeMillis, videoView));
            videoView.setVideoURI(android.net.Uri.parse(str4));
        }
        show();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        long j17;
        if (isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmGuideDialog", "[dismiss]");
            jp3.t tVar = jp3.t.f301029a;
            if (this.f310984u != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j17 = java.lang.System.currentTimeMillis() - this.f310984u;
            } else {
                j17 = 0;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            java.lang.String str = this.f310986w;
            java.lang.String str2 = str == null || str.length() == 0 ? "cancel" : this.f310986w;
            java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f310985v);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doGuidePopUpInfoReport] sessionId:");
            java.lang.String str3 = this.f310977n;
            sb6.append(str3);
            sb6.append(", showDuringMs:");
            sb6.append(valueOf);
            sb6.append(", closeReason:");
            sb6.append(str2);
            sb6.append(", guideVideoLoadCostMs:");
            sb6.append(valueOf2);
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmReportHelper", sb6.toString());
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            if (str3 == null) {
                str3 = "";
            }
            objArr[0] = str3;
            objArr[1] = 0;
            objArr[2] = "";
            objArr[3] = "palm_guide_popup_info";
            objArr[4] = java.lang.Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
            objArr[5] = java.lang.Long.valueOf(valueOf2 != null ? valueOf2.longValue() : 0L);
            objArr[6] = 0;
            if (str2 == null) {
                str2 = "";
            }
            objArr[7] = str2;
            g0Var.d(31121, objArr);
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f310983t;
            if (b4Var != null) {
                b4Var.d();
            }
            android.widget.VideoView videoView = this.f310980q;
            if (videoView != null) {
                if (videoView.isPlaying()) {
                    videoView.stopPlayback();
                }
                videoView.setOnPreparedListener(null);
                videoView.setOnInfoListener(null);
            }
            androidx.cardview.widget.CardView cardView = this.f310982s;
            if (cardView != null) {
                cardView.removeAllViews();
            }
            super.dismiss();
        }
    }

    @Override // y9.i, androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.Window window2 = getWindow();
        if (window2 == null) {
            return;
        }
        window2.setNavigationBarColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f478494f));
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        if (isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PalmGuideDialog", "[show]");
            this.f310986w = "";
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f310984u = java.lang.System.currentTimeMillis();
        }
    }
}
