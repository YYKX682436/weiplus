package com.tencent.mm.plugin.sns.lucky.ui;

/* loaded from: classes4.dex */
public class SnsLuckyMoneyDetailUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f164025m = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f164026g;

    /* renamed from: h, reason: collision with root package name */
    public ja4.i f164027h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f164028i = new ja4.e(this);

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489533cv3;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getResources().getDrawable(com.tencent.mm.R.drawable.f481936c91);
        setMMTitle(com.tencent.mm.R.string.jcj);
        setBackBtn(new ja4.f(this));
        this.f164026g = (android.widget.ListView) findViewById(com.tencent.mm.R.id.izx);
        ja4.i iVar = new ja4.i(getContext());
        this.f164027h = iVar;
        this.f164026g.setAdapter((android.widget.ListAdapter) iVar);
        this.f164026g.setOnScrollListener(this.f164028i);
        this.f164026g.setOnItemClickListener(new ja4.g(this));
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List list;
        super.onCreate(bundle);
        initView();
        java.lang.String stringExtra = getIntent().getStringExtra("key_feedid");
        synchronized (cb3.b.class) {
            if (stringExtra != null) {
                if (stringExtra.equals(cb3.b.f40347b)) {
                    list = cb3.b.f40346a;
                }
            }
            list = null;
        }
        if (list != null && list.size() != 0) {
            ja4.i iVar = this.f164027h;
            iVar.f298631d = list;
            iVar.notifyDataSetChanged();
        }
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.a68));
        setMMSubTitle((java.lang.String) null);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
