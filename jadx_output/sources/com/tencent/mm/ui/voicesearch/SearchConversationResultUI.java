package com.tencent.mm.ui.voicesearch;

/* loaded from: classes11.dex */
public class SearchConversationResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f211170d;

    /* renamed from: e, reason: collision with root package name */
    public yk5.e f211171e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f211172f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f211173g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4m;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f211170d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f487616p70);
        this.f211173g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dg6);
        yk5.e eVar = new yk5.e(getApplicationContext(), new yk5.f(this));
        this.f211171e = eVar;
        eVar.f462875o = new java.util.LinkedList();
        eVar.onNotifyChange(null, null);
        this.f211170d.setAdapter((android.widget.ListAdapter) this.f211171e);
        this.f211173g.setVisibility(8);
        this.f211172f = getIntent().getStringExtra("SearchConversationResult_User");
        getIntent().getStringExtra("SearchConversationResult_Error");
        setMMTitle(getString(com.tencent.mm.R.string.k_c));
        setBackBtn(new yk5.g(this));
        this.f211170d.setOnItemClickListener(new yk5.h(this));
        java.lang.String str = this.f211172f;
        this.f211173g.setVisibility(8);
        yk5.e eVar2 = this.f211171e;
        if (eVar2 != null) {
            eVar2.f462879s = str;
            eVar2.c();
            eVar2.q();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f211171e.c();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        return super.onKeyDown(i17, keyEvent);
    }
}
