package com.tencent.mm.plugin.kidswatch.ui.login;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class KidsWatchLoginCardChooseUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f143111o = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143114f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f143115g;

    /* renamed from: h, reason: collision with root package name */
    public int f143116h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f143117i;

    /* renamed from: m, reason: collision with root package name */
    public r45.u44 f143118m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f143119n = jz5.h.b(new y83.j(this));

    public final w83.c T6() {
        return (w83.c) ((jz5.n) this.f143119n).getValue();
    }

    public final void U6(r45.u44 u44Var) {
        com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", "reLogin:" + u44Var + ", userName:" + u44Var.f387020d);
        gm0.j1.d().a(972, this);
        java.lang.String str = this.f143112d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        gm0.j1.d().g(new x83.k(str, this.f143114f, false, 2, u44Var));
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
        return com.tencent.mm.R.layout.bmv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", "initView");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f443965d;
        java.lang.String string = getString(com.tencent.mm.R.string.g7l);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f443965d.setCloseBtnCallBack(new y83.e(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143112d = stringExtra;
        this.f143113e = getIntent().getStringExtra("intent.key.device.name");
        this.f143115g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f143114f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f143117i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("intent.key.kids.list");
        kotlin.jvm.internal.o.d(parcelableArrayListExtra);
        this.f143116h = parcelableArrayListExtra.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("intent:<");
        java.lang.String str = this.f143112d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        sb6.append(str);
        sb6.append(", ");
        sb6.append(this.f143113e);
        sb6.append(", ");
        sb6.append(this.f143115g);
        sb6.append(", ");
        sb6.append(this.f143114f);
        sb6.append(", ");
        sb6.append(this.f143116h);
        sb6.append('>');
        com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", sb6.toString());
        int i17 = this.f143116h;
        for (int i18 = 0; i18 < i17; i18++) {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout kidsWatchCardLayout = new com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout(context, null, 0);
            kidsWatchCardLayout.setId(i18);
            java.lang.Object obj = parcelableArrayListExtra.get(i18);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            kidsWatchCardLayout.setData((com.tencent.mm.plugin.kidswatch.model.KidsWatchAcctInfo) obj);
            if (i18 == this.f143116h - 1) {
                w83.a aVar = kidsWatchCardLayout.f143104f;
                android.view.ViewGroup.LayoutParams layoutParams = aVar.f443953c.getLayoutParams();
                kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                int b17 = com.tencent.mm.ui.zk.b(kidsWatchCardLayout.getContext(), i65.a.B(kidsWatchCardLayout.getContext()));
                int a17 = com.tencent.mm.ui.zk.a(kidsWatchCardLayout.getContext(), 8);
                if (b17 >= 375) {
                    a17 = com.tencent.mm.ui.zk.a(kidsWatchCardLayout.getContext(), 24);
                }
                layoutParams2.setMargins(a17, 0, a17, 0);
                aVar.f443953c.setLayoutParams(layoutParams2);
            }
            kidsWatchCardLayout.setOnClickListener(new y83.g(this, parcelableArrayListExtra, i18));
            T6().f443964c.addView(kidsWatchCardLayout);
        }
        T6().f443967f.setOnClickListener(new y83.h(this));
        T6().f443966e.post(new y83.i(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        r45.u44 u44Var;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", "onActivityResult, " + i17 + ", " + i18);
            if (i18 != -1 || (u44Var = this.f143118m) == null) {
                return;
            }
            kotlin.jvm.internal.o.d(u44Var);
            U6(u44Var);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
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
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var instanceof x83.k) {
            gm0.j1.d().q(972, this);
            a93.a aVar = a93.a.f2429a;
            x83.g gVar = x83.g.f452568a;
            if (i17 == 0) {
                v83.a[] aVarArr = v83.a.f434079d;
                if (i18 == 0) {
                    db5.t7.h(getContext(), getContext().getString(com.tencent.mm.R.string.f492364g81));
                    x83.c cVar = x83.c.f452553f;
                    java.lang.String str2 = this.f143112d;
                    if (str2 == null) {
                        kotlin.jvm.internal.o.o("loginUrl");
                        throw null;
                    }
                    gVar.a(cVar, str2, x83.e.f452562e, x83.d.f452556e, this.f143116h, i18);
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    aVar.a(context, "", true);
                    return;
                }
            }
            if (i17 == 4) {
                v83.a[] aVarArr2 = v83.a.f434079d;
                if (i18 == -9) {
                    com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", i17 + ", " + i18 + ", showBlockBySpam");
                    ((is.o1) ((js.c1) i95.n0.c(js.c1.class))).getClass();
                    x51.i1.c(this, str, 30846);
                    return;
                }
            }
            x83.c cVar2 = x83.c.f452553f;
            java.lang.String str3 = this.f143112d;
            if (str3 == null) {
                kotlin.jvm.internal.o.o("loginUrl");
                throw null;
            }
            gVar.a(cVar2, str3, x83.e.f452562e, x83.d.f452559h, this.f143116h, i18);
            com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", i17 + ", " + i18 + ", showAlertWhenError");
            androidx.appcompat.app.AppCompatActivity context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            aVar.d(context2, i18, str);
        }
    }
}
