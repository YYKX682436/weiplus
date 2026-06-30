package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class GameDetailRankLikedUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f140740g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f140741d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.q2 f140742e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Dialog f140743f;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bfj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.flv);
        setBackBtn(new com.tencent.mm.plugin.game.ui.n2(this));
        this.f140741d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.gkn);
        com.tencent.mm.plugin.game.ui.q2 q2Var = new com.tencent.mm.plugin.game.ui.q2(this);
        this.f140742e = q2Var;
        this.f140741d.setAdapter((android.widget.ListAdapter) q2Var);
        android.app.Dialog e17 = r53.f.e(getContext());
        this.f140743f = e17;
        e17.show();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        java.lang.String stringExtra = getIntent().getStringExtra("extra_appdi");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            finish();
            return;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.q2();
        lVar.f70665b = new m53.r2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getuplist";
        lVar.f70667d = 1331;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((m53.q2) a17.f70710a.f70684a).f323985d = stringExtra;
        com.tencent.mm.modelbase.z2.d(a17, new com.tencent.mm.plugin.game.ui.o2(this), false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
    }
}
