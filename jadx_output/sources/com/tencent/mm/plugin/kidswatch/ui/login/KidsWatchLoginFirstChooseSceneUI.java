package com.tencent.mm.plugin.kidswatch.ui.login;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchLoginFirstChooseSceneUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public int f143131f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143132g;

    /* renamed from: h, reason: collision with root package name */
    public int f143133h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f143134i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f143135m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f143136n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.CheckBox f143137o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143129d = "MicroMsg.KidsWatchLoginFirstChooseSceneUI";

    /* renamed from: e, reason: collision with root package name */
    public final int f143130e = com.tencent.mm.ui.zk.a(getContext(), 16);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f143138p = jz5.h.b(new y83.y(this));

    public final boolean T6(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i(this.f143129d, "doLoginOK, login:" + str + ", okSession:" + str2 + ", scene:" + i17);
        gm0.j1.d().a(972, this);
        android.widget.CheckBox checkBox = this.f143137o;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("syncMsgCb");
            throw null;
        }
        gm0.j1.d().g(new x83.k(str, str2, checkBox.isChecked(), i17, null));
        return true;
    }

    public final w83.g U6() {
        return (w83.g) ((jz5.n) this.f143138p).getValue();
    }

    public final void V6() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = U6().f443986g;
        if (weImageView != null) {
            weImageView.setVisibility(this.f143131f == 0 ? 0 : 8);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = U6().f443988i;
        if (weImageView2 != null) {
            weImageView2.setVisibility(this.f143131f == 1 ? 0 : 8);
        }
        android.widget.RelativeLayout relativeLayout = this.f143136n;
        if (relativeLayout != null) {
            relativeLayout.setVisibility((this.f143135m && this.f143131f == 0) ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("syncMsgRl");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bmz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f143132g = getIntent().getStringExtra("intent.key.login.url");
        this.f143133h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        getIntent().getStringExtra("intent.key.device.name");
        this.f143134i = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f143135m = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        U6().f443985f.setCloseIconResId(com.tencent.mm.R.drawable.bu7);
        U6().f443985f.setCloseBtnCallBack(new y83.s(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nuf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f143136n = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nue);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f143137o = (android.widget.CheckBox) findViewById2;
        java.lang.String r17 = c01.z1.r();
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = U6().f443981b;
        int i17 = this.f143130e;
        roundCornerImageView.f211406f = i17;
        roundCornerImageView.f211407g = i17;
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(r17);
        if (a17 == null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            a17 = com.tencent.mm.modelavatar.z.h(com.tencent.mm.modelavatar.d1.Ai().j(r17, false), r17, false);
        }
        if (a17 != null) {
            U6().f443981b.setImageBitmap(a17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = U6().f443986g;
        java.lang.Object parent = weImageView != null ? weImageView.getParent() : null;
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setOnClickListener(new y83.t(this));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = U6().f443988i;
        java.lang.Object parent2 = weImageView2 != null ? weImageView2.getParent() : null;
        kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent2).setOnClickListener(new y83.u(this));
        V6();
        android.widget.LinearLayout linearLayout = U6().f443984e;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new y83.v(this));
        }
        U6().f443987h.setOnClickListener(new y83.w(this));
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.c(context, U6().f443983d, U6().f443982c);
        android.widget.RelativeLayout relativeLayout = this.f143136n;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("syncMsgRl");
            throw null;
        }
        relativeLayout.setVisibility((this.f143135m && this.f143131f == 0) ? 0 : 8);
        android.widget.CheckBox checkBox = this.f143137o;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("syncMsgCb");
            throw null;
        }
        checkBox.setChecked(true);
        android.widget.RelativeLayout relativeLayout2 = this.f143136n;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new y83.x(this));
        } else {
            kotlin.jvm.internal.o.o("syncMsgRl");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            com.tencent.mars.xlog.Log.i(this.f143129d, "onActivityResult, " + i17 + ", " + i18);
            if (i18 == -1) {
                java.lang.String str = this.f143132g;
                kotlin.jvm.internal.o.d(str);
                T6(str, this.f143134i, this.f143131f);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.YellowK));
        setMMTitle("");
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        java.lang.String str2 = this.f143129d;
        com.tencent.mars.xlog.Log.i(str2, "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof x83.k) {
            ((x83.k) m1Var).getClass();
            com.tencent.mars.xlog.Log.i(str2, "onSceneEnd type[%d]", 972);
            gm0.j1.d().q(972, this);
            a93.a aVar = a93.a.f2429a;
            x83.g gVar = x83.g.f452568a;
            if (i17 != 0 || i18 != 0) {
                if (i17 == 4) {
                    v83.a[] aVarArr = v83.a.f434079d;
                    if (i18 == -9) {
                        com.tencent.mars.xlog.Log.i(str2, "showBlockBySpam");
                        ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                        x51.i1.c(this, str, 30846);
                        return;
                    }
                }
                x83.c cVar = x83.c.f452552e;
                java.lang.String str3 = this.f143132g;
                kotlin.jvm.internal.o.d(str3);
                gVar.a(cVar, str3, this.f143131f == 0 ? x83.e.f452563f : x83.e.f452564g, x83.d.f452559h, this.f143133h, i18);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                aVar.d(context, i18, str);
                return;
            }
            if (this.f143131f == 0) {
                com.tencent.mars.xlog.Log.i(str2, "top");
                x83.c cVar2 = x83.c.f452552e;
                java.lang.String str4 = this.f143132g;
                kotlin.jvm.internal.o.d(str4);
                gVar.a(cVar2, str4, x83.e.f452563f, x83.d.f452556e, this.f143133h, i18);
                i19 = com.tencent.mm.R.string.f492363g80;
            } else {
                x83.c cVar3 = x83.c.f452552e;
                java.lang.String str5 = this.f143132g;
                kotlin.jvm.internal.o.d(str5);
                gVar.a(cVar3, str5, x83.e.f452564g, x83.d.f452556e, this.f143133h, i18);
                i19 = com.tencent.mm.R.string.f492364g81;
            }
            java.lang.String string = getContext().getString(i19);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mars.xlog.Log.i(str2, "Tips: ".concat(string));
            db5.t7.h(getContext(), string);
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            aVar.a(context2, "", true);
        }
    }
}
