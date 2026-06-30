package com.tencent.mm.plugin.kidswatch.ui.reg;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class KidsWatchRegSuccessUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143177d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143178e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143179f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f143180g = jz5.h.b(new z83.d0(this));

    public final w83.k T6() {
        return (w83.k) ((jz5.n) this.f143180g).getValue();
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
        return com.tencent.mm.R.layout.f489193bn4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchHeadComponent kidsWatchHeadComponent = T6().f444028e;
        java.lang.String string = getString(com.tencent.mm.R.string.g7n);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kidsWatchHeadComponent.setTitle(string);
        T6().f444028e.setCloseBtnCallBack(new z83.b0(this));
        java.lang.String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        kotlin.jvm.internal.o.d(stringExtra);
        this.f143177d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        kotlin.jvm.internal.o.d(stringExtra2);
        this.f143178e = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("intent.key.reg.openid");
        kotlin.jvm.internal.o.d(stringExtra3);
        this.f143179f = stringExtra3;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = this.f143178e;
        if (str == null) {
            kotlin.jvm.internal.o.o("nickname");
            throw null;
        }
        objArr[0] = str;
        java.lang.String string2 = getString(com.tencent.mm.R.string.g8m, objArr);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        T6().f444026c.setText(string2);
        T6().f444027d.setOnClickListener(new z83.c0(this));
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.c(context, T6().f444029f, T6().f444025b);
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
}
