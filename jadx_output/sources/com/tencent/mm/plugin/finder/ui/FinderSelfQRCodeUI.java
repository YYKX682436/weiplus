package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderSelfQRCodeUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int E = 0;
    public android.view.View A;
    public android.widget.ProgressBar B;
    public android.view.View C;
    public android.widget.ImageView D;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f128701t = "";

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f128702u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f128703v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f128704w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f128705x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f128706y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f128707z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 10;
    }

    public final void c7(java.lang.String str) {
        android.widget.ProgressBar progressBar = this.B;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(0);
        android.view.View view = this.C;
        if (view == null) {
            kotlin.jvm.internal.o.o("refreshArea");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "doGetQRCodeScene", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(qt2Var.getInteger(5)));
        cq.j1.i((cq.k) c17, str, 0, 0L, 0L, qt2Var, new com.tencent.mm.plugin.finder.ui.cg(this), new com.tencent.mm.plugin.finder.ui.eg(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b8y;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.e_e);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128702u = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fuv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128703v = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f483299a85);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128704w = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.a89);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f128705x = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f487468sb5);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f128706y = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f484947g11);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f128707z = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.f486493lf2);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.A = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.imd);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.B = (android.widget.ProgressBar) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.g1a);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.C = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.g1b);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.D = (android.widget.ImageView) findViewById10;
        ya2.b2 b17 = ya2.h.f460484a.b(this.f128701t);
        if (b17 != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b17.getAvatarUrl(), null, 2, null);
            android.widget.ImageView imageView = this.f128702u;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            android.widget.TextView textView = this.f128703v;
            if (textView == null) {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
            textView.setText(b17.w0());
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = b17.field_authInfo;
            int authIconType = finderAuthInfo != null ? finderAuthInfo.getAuthIconType() : 0;
            android.widget.TextView textView2 = this.f128705x;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("authJob");
                throw null;
            }
            textView2.setVisibility(8);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f460511a;
            android.widget.ImageView imageView2 = this.f128704w;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("authIcon");
                throw null;
            }
            zy2.tb.a(m1Var, imageView2, b17.field_authInfo, 0, 4, null);
            if (authIconType <= 0) {
                android.widget.TextView textView3 = this.f128705x;
                if (textView3 == null) {
                    kotlin.jvm.internal.o.o("authJob");
                    throw null;
                }
                textView3.setVisibility(8);
            } else if (authIconType == 1) {
                android.widget.ImageView imageView3 = this.f128704w;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("authIcon");
                    throw null;
                }
                imageView3.setVisibility(0);
                android.widget.TextView textView4 = this.f128705x;
                if (textView4 == null) {
                    kotlin.jvm.internal.o.o("authJob");
                    throw null;
                }
                textView4.setVisibility(0);
                android.widget.TextView textView5 = this.f128705x;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("authJob");
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo2 = b17.field_authInfo;
                if (finderAuthInfo2 == null || (str = finderAuthInfo2.getAuthProfession()) == null) {
                    str = "";
                }
                textView5.setText(str);
            } else if (authIconType == 100) {
                android.widget.TextView textView6 = this.f128705x;
                if (textView6 == null) {
                    kotlin.jvm.internal.o.o("authJob");
                    throw null;
                }
                textView6.setVisibility(8);
            }
            c7(b17.D0());
            android.widget.ImageView imageView4 = this.D;
            if (imageView4 == null) {
                kotlin.jvm.internal.o.o("refreshIcon");
                throw null;
            }
            imageView4.setOnClickListener(new com.tencent.mm.plugin.finder.ui.fg(this, b17));
            android.view.View view = this.A;
            if (view == null) {
                kotlin.jvm.internal.o.o("qrcodeContainer");
                throw null;
            }
            android.widget.TextView textView7 = this.f128703v;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("nickTv");
                throw null;
            }
            java.lang.Object text = textView7.getText();
            view.setTag(com.tencent.mm.R.id.e79, text != null ? text : "");
        }
        android.widget.TextView textView8 = this.f128706y;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("saveToGalleryTv");
            throw null;
        }
        textView8.setVisibility(8);
        android.widget.TextView textView9 = this.f128706y;
        if (textView9 == null) {
            kotlin.jvm.internal.o.o("saveToGalleryTv");
            throw null;
        }
        com.tencent.mm.ui.dl.i(textView9.getPaint());
        android.widget.TextView textView10 = this.f128706y;
        if (textView10 != null) {
            textView10.setOnClickListener(new com.tencent.mm.plugin.finder.ui.gg(this));
        } else {
            kotlin.jvm.internal.o.o("saveToGalleryTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
        java.lang.String str = stringExtra != null ? stringExtra : "";
        this.f128701t = str;
        if (str.length() == 0) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f128701t = xy2.c.e(context);
        }
        initView();
        setBackBtn(new com.tencent.mm.plugin.finder.ui.hg(this));
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderSelfQRCodeUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(d92.r1.class);
    }
}
