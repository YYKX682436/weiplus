package com.tencent.mm.plugin.readerapp.ui;

/* loaded from: classes4.dex */
public class ReaderAppSubscribeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f155053d;

    /* renamed from: e, reason: collision with root package name */
    public ts3.m f155054e;

    public final void T6(int i17) {
        gm0.j1.u().c().w(868518889, java.lang.Integer.valueOf(i17));
        r45.ap4 ap4Var = new r45.ap4();
        ap4Var.f370175d = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(43, ap4Var));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", "newsapp");
        intent.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, this);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cc9;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f155054e = new ts3.m(this, com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(868518889, null)));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.ljr);
        this.f155053d = listView;
        listView.setAdapter((android.widget.ListAdapter) this.f155054e);
        this.f155053d.setOnItemClickListener(new ts3.i(this));
        this.f155054e.notifyDataSetChanged();
        setBackBtn(new ts3.j(this));
        setToTop(new ts3.k(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.u().c().w(868518890, "in");
        setMMTitle(com.tencent.mm.R.string.bga);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        ts3.m mVar = this.f155054e;
        if (mVar == null) {
            return true;
        }
        T6(mVar.f421682f);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f155054e.notifyDataSetChanged();
    }
}
