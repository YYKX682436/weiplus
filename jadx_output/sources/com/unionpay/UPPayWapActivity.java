package com.unionpay;

/* loaded from: classes13.dex */
public class UPPayWapActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f220665o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.webkit.WebView f220666d;

    /* renamed from: e, reason: collision with root package name */
    public com.unionpay.b f220667e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.AlertDialog f220668f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f220669g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220670h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220671i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f220672m;

    /* renamed from: n, reason: collision with root package name */
    public com.unionpay.g f220673n;

    public static java.lang.String L6(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String M6(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final void K6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            try {
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    java.lang.String str = "";
                    java.lang.String string = extras.containsKey("pay_result") ? extras.getString("pay_result") : extras.containsKey("code") ? extras.getString("code") : "";
                    if (android.text.TextUtils.isEmpty(string)) {
                        string = "";
                    }
                    java.lang.String string2 = extras.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) ? extras.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : "";
                    if (!android.text.TextUtils.isEmpty(string2)) {
                        str = string2;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("code", string);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
                    com.unionpay.g gVar = this.f220673n;
                    if (gVar != null) {
                        ((com.unionpay.d) gVar).a(M6("0", null, jSONObject));
                    }
                } else {
                    com.unionpay.g gVar2 = this.f220673n;
                    if (gVar2 != null) {
                        ((com.unionpay.d) gVar2).a(L6("1", "No pay result", null));
                    }
                }
            } catch (java.lang.Exception unused) {
                com.unionpay.g gVar3 = this.f220673n;
                if (gVar3 != null) {
                    ((com.unionpay.d) gVar3).a(L6("1", "No pay result", null));
                }
            }
            this.f220673n = null;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.View.OnClickListener onClickListener;
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        try {
            try {
                if (!"949A1CC".equalsIgnoreCase(getIntent().getStringExtra("magic_data"))) {
                    finish();
                }
                this.f220669g = "link".equals(getIntent().getStringExtra("actionType"));
                java.lang.String stringExtra = getIntent().getStringExtra("ex_mode");
                this.f220670h = stringExtra;
                if (android.text.TextUtils.isEmpty(stringExtra)) {
                    this.f220670h = "00";
                }
                str = "";
                getWindow().requestFeature(1);
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(this);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
                linearLayout.setOrientation(1);
                relativeLayout.addView(linearLayout, new android.widget.RelativeLayout.LayoutParams(-1, -1));
                relativeLayout.setFitsSystemWindows(true);
                setContentView(relativeLayout);
                this.f220666d = new android.webkit.WebView(this);
                java.lang.String stringExtra2 = getIntent().getStringExtra("actionType");
                this.f220671i = stringExtra2;
                if ("link".equals(stringExtra2)) {
                    str = getIntent().getStringExtra("wapurl");
                } else {
                    java.lang.String stringExtra3 = getIntent().getStringExtra("waptype");
                    java.lang.String stringExtra4 = getIntent().getStringExtra("wapurl");
                    if ("new_page".equals(stringExtra3)) {
                        str = stringExtra4 != null ? stringExtra4 : "";
                        onClickListener = new com.unionpay.m(this);
                    } else {
                        java.lang.String stringExtra5 = getIntent().getStringExtra("paydata");
                        if (stringExtra5 != null) {
                            str = stringExtra4 + "?s=" + stringExtra5;
                        }
                        onClickListener = null;
                    }
                    android.widget.ImageView imageView = new android.widget.ImageView(this);
                    imageView.setBackgroundDrawable(qy5.f.a(2));
                    int i17 = (int) ((24.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    int i18 = (int) ((18.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    int i19 = (int) ((14.0f * getResources().getDisplayMetrics().density) + 0.5f);
                    android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, i17);
                    layoutParams.addRule(9, -1);
                    layoutParams.addRule(10, -1);
                    layoutParams.setMargins(i18, i19, 0, 0);
                    relativeLayout.addView(imageView, layoutParams);
                    if (onClickListener == null) {
                        onClickListener = new com.unionpay.t(this);
                    }
                    imageView.setOnClickListener(onClickListener);
                    this.f220672m = imageView;
                }
                this.f220666d.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
                linearLayout.addView(this.f220666d);
                com.unionpay.b bVar = new com.unionpay.b(this, this.f220666d, null);
                this.f220667e = bVar;
                bVar.f220704h = true;
                android.webkit.WebView webView = this.f220666d;
                if (webView != null) {
                    webView.loadUrl(str);
                }
                com.unionpay.b bVar2 = this.f220667e;
                if (bVar2 != null) {
                    bVar2.a(fc1.a.NAME, new com.unionpay.w(this));
                    this.f220667e.a("saveData", new com.unionpay.x(this));
                    this.f220667e.a("getData", new com.unionpay.y(this));
                    this.f220667e.a("removeData", new com.unionpay.z(this));
                    this.f220667e.a("setPageBackEnable", new com.unionpay.a0(this));
                    this.f220667e.a("payBySDK", new com.unionpay.b0(this));
                    this.f220667e.a("payResult", new com.unionpay.n(this));
                    this.f220667e.a("closePage", new com.unionpay.o(this));
                    this.f220667e.a("openNewPage", new com.unionpay.p(this));
                    this.f220667e.a("checkBankSchemes", new com.unionpay.q(this));
                    this.f220667e.a("openBankApp", new com.unionpay.r(this));
                    this.f220667e.a("openScheme", new com.unionpay.s(this));
                }
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Exception unused2) {
            finish();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.graphics.drawable.Drawable background;
        android.graphics.Bitmap bitmap;
        super.onDestroy();
        android.view.View view = this.f220672m;
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        background.setCallback(null);
        if (!(background instanceof android.graphics.drawable.BitmapDrawable) || (bitmap = ((android.graphics.drawable.BitmapDrawable) background).getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (this.f220669g) {
            android.webkit.WebView webView = this.f220666d;
            if (webView != null && webView.canGoBack()) {
                this.f220666d.goBack();
                return true;
            }
            K6("cancel", null);
        } else {
            onPause();
        }
        return true;
    }
}
