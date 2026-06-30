package qx5;

/* loaded from: classes13.dex */
public class y implements qx5.l {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f367535a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f367536b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.xweb.WebView f367537c;

    /* renamed from: d, reason: collision with root package name */
    public qx5.k f367538d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f367539e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f367540f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f367541g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f367542h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f367543i;

    public y(android.content.Context context, android.view.ViewGroup viewGroup) {
        this.f367539e = null;
        this.f367540f = null;
        this.f367541g = null;
        this.f367542h = null;
        this.f367543i = null;
        this.f367535a = context;
        this.f367536b = viewGroup;
        this.f367537c = null;
        g();
    }

    @Override // qx5.l
    public void a() {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (!by5.d4.e().getBoolean("bShowSavePage", false)) {
            by5.c4.f("XWebDebugView", "refreshSavePageView, show save page is disabled");
            android.widget.Button button = this.f367543i;
            if (button != null) {
                button.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f367537c == null) {
            android.widget.Button button2 = this.f367543i;
            if (button2 != null) {
                button2.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.Button button3 = this.f367543i;
        if (button3 != null) {
            button3.setVisibility(0);
            return;
        }
        android.widget.Button button4 = new android.widget.Button(getContext());
        this.f367543i = button4;
        button4.setText("保存页面");
        this.f367543i.setOnClickListener(new qx5.e0(this));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -2);
        this.f367536b.addView(this.f367543i, layoutParams);
    }

    @Override // qx5.l
    public void b() {
        android.widget.TextView textView = this.f367540f;
        if (textView != null) {
            textView.setVisibility(0);
            return;
        }
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        this.f367540f = textView2;
        textView2.setTextColor(-16777216);
        this.f367540f.setBackgroundColor(-1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.xweb.WebView webView = this.f367537c;
        sb6.append(qx5.x.c(webView));
        sb6.append("\n");
        sb6.append(qx5.x.b(webView));
        sb6.append("\n");
        sb6.append(qx5.u.d());
        java.lang.String sb7 = sb6.toString();
        this.f367540f.setText(sb7);
        this.f367540f.setOnLongClickListener(new qx5.h0(this, sb7));
        android.widget.ScrollView scrollView = new android.widget.ScrollView(getContext());
        scrollView.addView(this.f367540f);
        this.f367536b.addView(scrollView);
    }

    @Override // qx5.l
    public void c() {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (!by5.d4.e().getBoolean("bShowVersion", false)) {
            by5.c4.f("XWebDebugView", "refreshVersionView, show version is disabled");
            android.widget.TextView textView = this.f367539e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        com.tencent.xweb.WebView webView = this.f367537c;
        if (webView == null) {
            android.widget.TextView textView2 = this.f367539e;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.TextView textView3 = this.f367539e;
        if (textView3 != null) {
            textView3.setVisibility(0);
            return;
        }
        this.f367539e = new android.widget.TextView(getContext());
        this.f367539e.setText(qx5.x.c(webView));
        this.f367539e.setOnLongClickListener(new qx5.g0(this));
        this.f367536b.addView(this.f367539e);
    }

    @Override // qx5.l
    public boolean d(java.lang.String str) {
        by5.c4.f("XWebDebugView", "onInterceptTestUrl, url:" + str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ya.b.SOURCE, 1);
        bundle.putString("command", str);
        qx5.a b17 = by5.d1.b(bundle, this);
        return b17.f367479a && e(getContext(), b17);
    }

    @Override // qx5.l
    public boolean e(android.content.Context context, qx5.a aVar) {
        if (!aVar.f367479a) {
            android.widget.Toast.makeText(context, "执行失败", 0).show();
            return false;
        }
        if (aVar.f367480b) {
            new android.app.AlertDialog.Builder(getContext()).setTitle("执行成功").setMessage("部分配置需重启生效，请确认是否立即重启?").setPositiveButton("确定", new qx5.a0(this, context)).setNegativeButton("取消", new qx5.z(this)).show();
            return true;
        }
        android.widget.Toast.makeText(context, "执行成功", 0).show();
        return true;
    }

    @Override // qx5.l
    public void f(final android.webkit.ValueCallback valueCallback) {
        try {
            new android.app.AlertDialog.Builder(getContext()).setTitle("权限请求").setMessage("是否打开微信浏览器调试能力？").setPositiveButton("确定", new android.content.DialogInterface.OnClickListener() { // from class: qx5.y$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                    by5.d4.e().edit().putBoolean("bEnableOpenDebugURL", true).commit();
                    by5.d4.e().edit().putLong("bEnableOpenDebugURLDate", java.lang.System.currentTimeMillis()).commit();
                    android.webkit.ValueCallback valueCallback2 = valueCallback;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(java.lang.Boolean.TRUE);
                    }
                }
            }).setNegativeButton("取消", new android.content.DialogInterface.OnClickListener() { // from class: qx5.y$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                    by5.d4.e().edit().putBoolean("bEnableOpenDebugURL", false).commit();
                    android.webkit.ValueCallback valueCallback2 = valueCallback;
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(java.lang.Boolean.FALSE);
                    }
                }
            }).show();
        } catch (java.lang.Exception e17) {
            by5.c4.f("XWebDebugView", "showAuthDialog failed." + e17.getMessage());
        }
    }

    @Override // qx5.l
    public void g() {
        android.view.View view = this.f367541g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/xweb/debug/XWebDebugView", "refreshDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/xweb/debug/XWebDebugView", "refreshDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.content.Context context = this.f367535a;
        boolean z17 = context instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) context).getBaseContext() instanceof androidx.appcompat.app.AppCompatActivity : context instanceof androidx.appcompat.app.AppCompatActivity;
        by5.c4.f("XWebDebugView", "refreshDebugView, context:" + this.f367535a + ", isAppCompatActivity:" + z17 + ", appCompatActivity:" + j());
        if (!z17) {
            android.widget.Toast.makeText(this.f367535a, "当前界面不支持显示调试组件", 0).show();
            return;
        }
        android.view.View inflate = android.view.View.inflate(this.f367535a, com.tencent.xwebsdk.R.layout.xweb_debug_view, null);
        this.f367541g = inflate;
        this.f367536b.addView(inflate);
        this.f367542h = (androidx.viewpager.widget.ViewPager) this.f367541g.findViewById(com.tencent.xwebsdk.R.id.view_pager);
        androidx.appcompat.app.AppCompatActivity j17 = j();
        java.util.Objects.requireNonNull(j17);
        this.f367542h.setAdapter(new qx5.d(j17.getSupportFragmentManager(), this));
        ((com.google.android.material.tabs.TabLayout) this.f367541g.findViewById(com.tencent.xwebsdk.R.id.tab_layout)).setupWithViewPager(this.f367542h);
        ((android.widget.Button) this.f367541g.findViewById(com.tencent.xwebsdk.R.id.button_close_debug)).setOnClickListener(new qx5.f0(this));
    }

    @Override // qx5.l
    public android.content.Context getContext() {
        com.tencent.xweb.WebView webView = this.f367537c;
        if (webView != null) {
            this.f367535a = webView.getContext();
            androidx.appcompat.app.AppCompatActivity j17 = j();
            if (j17 != null) {
                this.f367535a = j17;
                return j17;
            }
        }
        return this.f367535a;
    }

    @Override // qx5.l
    public com.tencent.xweb.WebView getWebView() {
        return this.f367537c;
    }

    @Override // qx5.l
    public void h() {
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        if (!by5.d4.e().getBoolean("bShowFps", false)) {
            by5.c4.f("XWebDebugView", "refreshFpsView, show fps is disabled");
            return;
        }
        com.tencent.xweb.WebView webView = this.f367537c;
        if (webView != null) {
            webView.evaluateJavascript(by5.a1.d(getContext(), "xweb_show_fps.js"), new qx5.b0(this));
        }
    }

    @Override // qx5.l
    public boolean i(java.lang.String str) {
        java.util.HashSet hashSet = by5.d1.f36430a;
        if (str == null) {
            return false;
        }
        return str.startsWith("https://debugxweb.qq.com") || str.startsWith("http://debugxweb.qq.com");
    }

    public androidx.appcompat.app.AppCompatActivity j() {
        android.content.Context context = this.f367535a;
        if (!(context instanceof android.content.MutableContextWrapper ? ((android.content.MutableContextWrapper) context).getBaseContext() instanceof androidx.appcompat.app.AppCompatActivity : context instanceof androidx.appcompat.app.AppCompatActivity)) {
            return null;
        }
        android.content.Context context2 = this.f367535a;
        return context2 instanceof android.content.MutableContextWrapper ? (androidx.appcompat.app.AppCompatActivity) ((android.content.MutableContextWrapper) context2).getBaseContext() : (androidx.appcompat.app.AppCompatActivity) context2;
    }

    public y(com.tencent.xweb.WebView webView) {
        this.f367539e = null;
        this.f367540f = null;
        this.f367541g = null;
        this.f367542h = null;
        this.f367543i = null;
        this.f367537c = webView;
        this.f367535a = webView.getContext();
        this.f367536b = webView.getTopView();
        if (webView != null) {
            c();
            h();
            a();
            return;
        }
        g();
    }
}
