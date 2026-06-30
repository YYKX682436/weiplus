package com.tencent.mm.plugin.rtos.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class RtosWatchLoginUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f158589d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f158590e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f158591f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f158592g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f158593h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f158594i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f158595m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.loading.MMProgressLoading f158596n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f158597o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f158598p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f158599q;

    /* renamed from: r, reason: collision with root package name */
    public android.app.ProgressDialog f158600r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f158602t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f158603u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f158604v;

    /* renamed from: y, reason: collision with root package name */
    public int f158607y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f158608z;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f158601s = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f158605w = "";

    /* renamed from: x, reason: collision with root package name */
    public final ky3.b f158606x = new ky3.b();
    public final fy3.f C = new oy3.t(this);
    public final com.tencent.mm.sdk.platformtools.n3 D = new com.tencent.mm.sdk.platformtools.n3(new oy3.i(this));

    public static final void T6(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI, oy3.h hVar, int i17) {
        rtosWatchLoginUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "switchStatusView status: " + hVar);
        switch (hVar.ordinal()) {
            case 0:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = rtosWatchLoginUI.f158591f;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading != null) {
                    mMProgressLoading.setVisibility(0);
                }
                android.widget.ProgressBar progressBar = rtosWatchLoginUI.f158595m;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                android.widget.Button button = rtosWatchLoginUI.f158589d;
                if (button != null) {
                    button.setVisibility(4);
                }
                rtosWatchLoginUI.A = false;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView = rtosWatchLoginUI.f158593h;
                if (textView != null) {
                    textView.setText(com.tencent.mm.R.string.l3o);
                }
                android.widget.LinearLayout linearLayout = rtosWatchLoginUI.f158598p;
                if (linearLayout == null) {
                    return;
                }
                linearLayout.setVisibility(8);
                return;
            case 1:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = rtosWatchLoginUI.f158591f;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(8);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading2 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading2 != null) {
                    mMProgressLoading2.setVisibility(8);
                }
                android.widget.ProgressBar progressBar2 = rtosWatchLoginUI.f158595m;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = rtosWatchLoginUI.f158597o;
                if (weImageView3 != null) {
                    weImageView3.setVisibility(0);
                }
                android.widget.Button button2 = rtosWatchLoginUI.f158589d;
                if (button2 != null) {
                    button2.setVisibility(8);
                }
                rtosWatchLoginUI.A = false;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView2 = rtosWatchLoginUI.f158593h;
                if (textView2 != null) {
                    textView2.setText(com.tencent.mm.R.string.l3a);
                }
                android.widget.TextView textView3 = rtosWatchLoginUI.f158590e;
                if (textView3 != null) {
                    textView3.setText(com.tencent.mm.R.string.f492294fz1);
                }
                android.widget.TextView textView4 = rtosWatchLoginUI.f158590e;
                if (textView4 != null) {
                    textView4.setTextAppearance(com.tencent.mm.R.style.f494360kz);
                }
                android.widget.TextView textView5 = rtosWatchLoginUI.f158590e;
                if (textView5 != null) {
                    textView5.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
                }
                android.widget.TextView textView6 = rtosWatchLoginUI.f158590e;
                if (textView6 != null) {
                    textView6.setOnClickListener(new oy3.z(rtosWatchLoginUI));
                }
                android.widget.LinearLayout linearLayout2 = rtosWatchLoginUI.f158598p;
                if (linearLayout2 == null) {
                    return;
                }
                linearLayout2.setVisibility(8);
                return;
            case 2:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = rtosWatchLoginUI.f158591f;
                if (weImageView4 != null) {
                    weImageView4.setVisibility(8);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading3 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading3 != null) {
                    mMProgressLoading3.setVisibility(8);
                }
                android.widget.ProgressBar progressBar3 = rtosWatchLoginUI.f158595m;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(0);
                }
                android.widget.Button button3 = rtosWatchLoginUI.f158589d;
                if (button3 != null) {
                    button3.setVisibility(4);
                }
                rtosWatchLoginUI.A = false;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView7 = rtosWatchLoginUI.f158593h;
                if (textView7 != null) {
                    textView7.setText(com.tencent.mm.R.string.l39);
                }
                android.widget.LinearLayout linearLayout3 = rtosWatchLoginUI.f158598p;
                if (linearLayout3 == null) {
                    return;
                }
                linearLayout3.setVisibility(8);
                return;
            case 3:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = rtosWatchLoginUI.f158591f;
                if (weImageView5 != null) {
                    weImageView5.setVisibility(8);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading4 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading4 != null) {
                    mMProgressLoading4.setVisibility(8);
                }
                android.widget.ProgressBar progressBar4 = rtosWatchLoginUI.f158595m;
                if (progressBar4 != null) {
                    progressBar4.setVisibility(8);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = rtosWatchLoginUI.f158597o;
                if (weImageView6 != null) {
                    weImageView6.setVisibility(0);
                }
                if (rtosWatchLoginUI.B && i17 == 19) {
                    android.widget.Button button4 = rtosWatchLoginUI.f158589d;
                    if (button4 != null) {
                        button4.setVisibility(0);
                    }
                    rtosWatchLoginUI.A = true;
                    android.widget.Button button5 = rtosWatchLoginUI.f158589d;
                    if (button5 != null) {
                        button5.setText(com.tencent.mm.R.string.f493645n31);
                    }
                    android.widget.Button button6 = rtosWatchLoginUI.f158589d;
                    if (button6 != null) {
                        button6.setOnClickListener(new oy3.a0(rtosWatchLoginUI));
                    }
                } else {
                    android.widget.Button button7 = rtosWatchLoginUI.f158589d;
                    if (button7 != null) {
                        button7.setVisibility(8);
                    }
                    rtosWatchLoginUI.A = false;
                }
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView8 = rtosWatchLoginUI.f158593h;
                if (textView8 != null) {
                    textView8.setText(com.tencent.mm.R.string.l3g);
                }
                android.widget.TextView textView9 = rtosWatchLoginUI.f158590e;
                if (textView9 != null) {
                    textView9.setText(com.tencent.mm.R.string.f492294fz1);
                }
                android.widget.TextView textView10 = rtosWatchLoginUI.f158590e;
                if (textView10 != null) {
                    textView10.setTextAppearance(com.tencent.mm.R.style.f494360kz);
                }
                android.widget.TextView textView11 = rtosWatchLoginUI.f158590e;
                if (textView11 != null) {
                    textView11.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
                }
                android.widget.TextView textView12 = rtosWatchLoginUI.f158590e;
                if (textView12 != null) {
                    textView12.setOnClickListener(new oy3.b0(rtosWatchLoginUI));
                }
                if (i17 == 9) {
                    android.widget.TextView textView13 = rtosWatchLoginUI.f158593h;
                    if (textView13 != null) {
                        textView13.setText(com.tencent.mm.R.string.l3l);
                    }
                } else if (i17 == 11) {
                    android.widget.TextView textView14 = rtosWatchLoginUI.f158593h;
                    if (textView14 != null) {
                        textView14.setText(com.tencent.mm.R.string.l3h);
                    }
                } else if (i17 == 19) {
                    android.widget.TextView textView15 = rtosWatchLoginUI.f158593h;
                    if (textView15 != null) {
                        textView15.setText(com.tencent.mm.R.string.n2z);
                    }
                } else if (i17 == 13) {
                    android.widget.TextView textView16 = rtosWatchLoginUI.f158593h;
                    if (textView16 != null) {
                        textView16.setText(com.tencent.mm.R.string.l38);
                    }
                } else if (i17 != 14) {
                    android.widget.TextView textView17 = rtosWatchLoginUI.f158593h;
                    if (textView17 != null) {
                        textView17.setText(com.tencent.mm.R.string.l3g);
                    }
                } else {
                    android.widget.TextView textView18 = rtosWatchLoginUI.f158593h;
                    if (textView18 != null) {
                        textView18.setText(com.tencent.mm.R.string.l3k);
                    }
                }
                android.widget.LinearLayout linearLayout4 = rtosWatchLoginUI.f158598p;
                if (linearLayout4 == null) {
                    return;
                }
                linearLayout4.setVisibility(8);
                return;
            case 4:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView7 = rtosWatchLoginUI.f158591f;
                if (weImageView7 != null) {
                    weImageView7.setVisibility(0);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading5 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading5 != null) {
                    mMProgressLoading5.setVisibility(8);
                }
                android.widget.ProgressBar progressBar5 = rtosWatchLoginUI.f158595m;
                if (progressBar5 != null) {
                    progressBar5.setVisibility(8);
                }
                if (rtosWatchLoginUI.B) {
                    android.widget.Button button8 = rtosWatchLoginUI.f158589d;
                    if (button8 != null) {
                        button8.setVisibility(8);
                    }
                } else {
                    android.widget.Button button9 = rtosWatchLoginUI.f158589d;
                    if (button9 != null) {
                        button9.setVisibility(0);
                    }
                }
                rtosWatchLoginUI.A = true;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView19 = rtosWatchLoginUI.f158593h;
                if (textView19 != null) {
                    textView19.setText(com.tencent.mm.R.string.l3j);
                }
                boolean z17 = rtosWatchLoginUI.f158608z;
                android.widget.LinearLayout linearLayout5 = rtosWatchLoginUI.f158598p;
                if (z17) {
                    if (linearLayout5 == null) {
                        return;
                    }
                    linearLayout5.setVisibility(8);
                    return;
                } else {
                    if (linearLayout5 == null) {
                        return;
                    }
                    linearLayout5.setVisibility(0);
                    return;
                }
            case 5:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView8 = rtosWatchLoginUI.f158591f;
                if (weImageView8 != null) {
                    weImageView8.setVisibility(0);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading6 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading6 != null) {
                    mMProgressLoading6.setVisibility(8);
                }
                android.widget.ProgressBar progressBar6 = rtosWatchLoginUI.f158595m;
                if (progressBar6 != null) {
                    progressBar6.setVisibility(8);
                }
                if (rtosWatchLoginUI.B) {
                    android.widget.Button button10 = rtosWatchLoginUI.f158589d;
                    if (button10 != null) {
                        button10.setVisibility(8);
                    }
                } else {
                    android.widget.Button button11 = rtosWatchLoginUI.f158589d;
                    if (button11 != null) {
                        button11.setVisibility(0);
                    }
                }
                rtosWatchLoginUI.A = true;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView20 = rtosWatchLoginUI.f158593h;
                if (textView20 != null) {
                    textView20.setText(com.tencent.mm.R.string.l3j);
                    return;
                }
                return;
            case 6:
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView9 = rtosWatchLoginUI.f158591f;
                if (weImageView9 != null) {
                    weImageView9.setVisibility(0);
                }
                com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading7 = rtosWatchLoginUI.f158596n;
                if (mMProgressLoading7 != null) {
                    mMProgressLoading7.setVisibility(8);
                }
                android.widget.ProgressBar progressBar7 = rtosWatchLoginUI.f158595m;
                if (progressBar7 != null) {
                    progressBar7.setVisibility(8);
                }
                android.widget.Button button12 = rtosWatchLoginUI.f158589d;
                if (button12 != null) {
                    button12.setVisibility(0);
                }
                rtosWatchLoginUI.A = false;
                rtosWatchLoginUI.Z6();
                android.widget.TextView textView21 = rtosWatchLoginUI.f158593h;
                if (textView21 != null) {
                    textView21.setText(com.tencent.mm.R.string.l3j);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void U6(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI, int i17) {
        rtosWatchLoginUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "updateViewWhenError " + i17);
        com.tencent.mm.sdk.platformtools.n3 n3Var = rtosWatchLoginUI.D;
        n3Var.postUI(new oy3.j(rtosWatchLoginUI));
        rtosWatchLoginUI.f158606x.f313617d = i17;
        n3Var.postUI(new oy3.c0(i17, rtosWatchLoginUI));
    }

    public final void V6() {
        fy3.f fVar;
        fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
        ((my3.q) eVar).f332833s = this.C;
        java.lang.String deviceMac = this.f158601s;
        java.lang.String avatar = this.f158605w;
        my3.q qVar = (my3.q) eVar;
        kotlin.jvm.internal.o.g(deviceMac, "deviceMac");
        kotlin.jvm.internal.o.g(avatar, "avatar");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "UI requestHandleScan " + deviceMac + " in status " + qVar.f332832r);
        int ordinal = qVar.f332832r.ordinal();
        if (ordinal == 0) {
            qVar.bj();
            return;
        }
        if (ordinal == 1) {
            qVar.bj();
        } else if (ordinal == 6 && (fVar = qVar.f332833s) != null) {
            ((oy3.t) fVar).c();
        }
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "cancelLogin");
        ky3.b bVar = this.f158606x;
        bVar.f313618e = 1;
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).hj(bVar);
        fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
        int i17 = this.f158607y;
        my3.q qVar = (my3.q) eVar;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "onClickCancelLogin");
        qVar.aj(i17);
    }

    public final void X6() {
        java.lang.String str;
        java.lang.String string;
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        java.lang.String str2 = "";
        if (sharedPreferences == null || (str = sharedPreferences.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "")) == null) {
            str = "";
        }
        if (sharedPreferences != null && (string = sharedPreferences.getString(dm.i4.COL_USERNAME, "")) != null) {
            str2 = string;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "checkMac store:" + str + " -- scan: " + this.f158601s + " storeUsername:" + str2 + " reconnect:" + this.B);
        if (str2.length() > 0) {
            if (str.length() > 0) {
                if (r26.i0.p(this.f158601s, str, true)) {
                    V6();
                    return;
                }
                this.f158607y = 11;
                android.os.Message message = new android.os.Message();
                message.what = 1004;
                message.arg1 = this.f158607y;
                this.D.sendMessage(message);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "no bind info, begin handle scan");
        V6();
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.RtosWatchLoginUI", "request bluetooth permission fail");
        this.f158607y = 14;
        android.os.Message message = new android.os.Message();
        message.what = 1004;
        message.arg1 = this.f158607y;
        this.D.sendMessage(message);
    }

    public final void Z6() {
        android.widget.Button button = this.f158589d;
        if (button == null) {
            return;
        }
        button.setEnabled(this.A && this.f158608z);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "finish");
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chd;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        W6();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "scan UI onCreate");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aao));
        setMMTitle(com.tencent.mm.R.string.l3f);
        setBackBtn(new oy3.m(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f158601s = stringExtra;
        this.f158602t = getIntent().getStringExtra("native_ver");
        this.f158603u = getIntent().getStringExtra("jsapp_ver");
        this.B = getIntent().getBooleanExtra("reconnect", false);
        this.f158604v = getIntent().getStringExtra("channel_type");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "native_ver:" + this.f158602t + "  jsapp_ver:" + this.f158603u + " channel_type:" + this.f158604v + " reconnect:" + this.B);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        this.f158608z = ((java.lang.Boolean) m17).booleanValue();
        java.lang.String stringExtra2 = getIntent().getStringExtra("avatar");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f158605w = stringExtra2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.nhu);
        this.f158591f = weImageView;
        if (weImageView != null) {
            weImageView.setImageResource(com.tencent.mm.R.raw.rtos_connect_watch);
        }
        this.f158593h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487099ni1);
        this.f158594i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nhp);
        this.f158595m = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.nho);
        this.f158596n = (com.tencent.mm.ui.widget.loading.MMProgressLoading) findViewById(com.tencent.mm.R.id.nhr);
        this.f158597o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.nht);
        this.f158598p = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.o2m);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.lrt);
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new oy3.n(this));
        }
        this.f158599q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lrs);
        com.tencent.mm.sdk.platformtools.m2.e();
        java.lang.String string = getString(com.tencent.mm.R.string.gb7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getString(com.tencent.mm.R.string.l3d);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = getString(com.tencent.mm.R.string.l37);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        java.lang.String string4 = getString(com.tencent.mm.R.string.l3m);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        java.lang.String str = string + string2 + string3 + string4;
        com.tencent.mm.pluginsdk.ui.span.u uVar = new com.tencent.mm.pluginsdk.ui.span.u(str, string.length(), string.length() + string2.length());
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        h0Var.f310123d = obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.m2.e();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d) && !com.tencent.mm.sdk.platformtools.t8.x0((java.lang.String) h0Var.f310123d)) {
            h0Var.f310123d = "";
        }
        uVar.f191292f = new oy3.k(this, h0Var);
        com.tencent.mm.pluginsdk.ui.span.u uVar2 = new com.tencent.mm.pluginsdk.ui.span.u(str, string.length() + string2.length() + 1, str.length());
        uVar2.f191292f = new oy3.l(this, h0Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(uVar);
        arrayList.add(uVar2);
        if (((le0.u) i95.n0.c(le0.u.class)) != null) {
            android.widget.TextView textView = this.f158599q;
            kotlin.jvm.internal.o.g(textView, "textView");
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.pluginsdk.ui.span.u uVar3 = (com.tencent.mm.pluginsdk.ui.span.u) next;
                spannableString.setSpan(new com.tencent.mm.pluginsdk.ui.span.v(i17, uVar3), uVar3.f191288b, uVar3.f191289c, 17);
                i17 = i18;
            }
            textView.setText(spannableString);
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.x(spannableString, textView));
        }
        this.f158592g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kbf);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.iol);
        this.f158589d = button;
        if (button != null) {
            button.setOnClickListener(new oy3.o(this));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5p);
        this.f158590e = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new oy3.p(this));
        }
        this.A = false;
        Z6();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        this.D.sendEmptyMessage(1001);
        if (android.os.Build.VERSION.SDK_INT < 31) {
            X6();
            return;
        }
        boolean z17 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_SCAN") == 0;
        boolean z18 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_ADVERTISE") == 0;
        boolean z19 = b3.l.checkSelfPermission(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.BLUETOOTH_CONNECT") == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "SDK_INT >= 31 hasScan:" + z17 + " hasAdvertise:" + z18 + " hasConnect:" + z19);
        if (!z19) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8848);
            arrayList2.add(new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT"});
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "checkPermission", "()V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            requestPermissions((java.lang.String[]) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "checkPermission", "()V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
            return;
        }
        if (!z17 || !z18 || !z19) {
            X6();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "still need to request BLUETOOTH_CONNECT");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8848);
        arrayList3.add(new java.lang.String[]{"android.permission.BLUETOOTH_CONNECT"});
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "checkPermission", "()V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        requestPermissions((java.lang.String[]) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI", "checkPermission", "()V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onDestroy");
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).f332833s = null;
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onRequestPermissionsResult " + i17 + ' ' + grantResults.length);
        if (i17 == 8848) {
            if (grantResults.length == 0) {
                Y6();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onRequestPermissionsResult " + i17 + ' ' + grantResults[0]);
            if (grantResults[0] == 0) {
                X6();
            } else {
                Y6();
            }
        }
    }
}
