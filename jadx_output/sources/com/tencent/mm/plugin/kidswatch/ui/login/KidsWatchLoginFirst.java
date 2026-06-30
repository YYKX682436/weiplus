package com.tencent.mm.plugin.kidswatch.ui.login;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchLoginFirst extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143120d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143122f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f143123g;

    /* renamed from: h, reason: collision with root package name */
    public int f143124h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f143125i;

    /* renamed from: m, reason: collision with root package name */
    public v83.b f143126m = v83.b.f434080d;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f143127n = jz5.h.b(new y83.p(this));

    public final w83.e T6() {
        return (w83.e) ((jz5.n) this.f143127n).getValue();
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
        return com.tencent.mm.R.layout.bmx;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchLoginFirst", "initView");
        setMMTitle("");
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143120d = stringExtra;
        this.f143124h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        this.f143121e = getIntent().getStringExtra("intent.key.device.name");
        this.f143122f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f143123g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f143125i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        T6().f443972b.setCloseBtnCallBack(new y83.l(this));
        T6().f443972b.f143110e.f443960c.setVisibility(0);
        android.widget.Button button = T6().f443973c;
        kotlin.jvm.internal.o.d(button);
        button.setOnClickListener(new y83.m(this));
        android.widget.LinearLayout linearLayout = T6().f443974d;
        if (linearLayout != null) {
            linearLayout.setVisibility(this.f143123g ? 0 : 4);
        }
        android.widget.TextView textView = T6().f443975e;
        kotlin.jvm.internal.o.d(textView);
        textView.setOnClickListener(new y83.o(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        supportActionBar.o();
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i("KidsWatchUtil", "setWindowStyle, activity:" + this + ", isShowStatusBar:true, isShowNavigationBar: false");
            getWindow().getDecorView().setSystemUiVisibility(5890);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            getWindow().setFormat(-3);
        }
    }
}
