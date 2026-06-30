package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes11.dex */
public class ContactSearchResultUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f172420d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f172421e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f172422f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f172423g;

    static {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a2s;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.bkf);
        setBackBtn(new gg4.n(this));
        this.f172423g = new java.util.HashMap();
        this.f172420d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.m1s);
        this.f172420d.setEmptyView((android.widget.TextView) findViewById(com.tencent.mm.R.id.dez));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("result");
        int intExtra = getIntent().getIntExtra("add_more_friend_search_scene", 0);
        if (byteArrayExtra != null) {
            try {
                r45.iw5 iw5Var = (r45.iw5) new r45.iw5().parseFrom(byteArrayExtra);
                if (iw5Var != null) {
                    this.f172421e = iw5Var.E;
                    this.f172422f = iw5Var.N;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e17, "SearchContactResponse", new java.lang.Object[0]);
                try {
                    this.f172422f.add((r45.cx5) new r45.cx5().parseFrom(byteArrayExtra));
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactSearchResultUI", e18, "SearchOpenIMContactItem", new java.lang.Object[0]);
                }
            }
        }
        if (this.f172421e.size() == 0 && this.f172422f.isEmpty()) {
            return;
        }
        this.f172420d.setAdapter((android.widget.ListAdapter) new gg4.p(this, this));
        this.f172420d.setOnItemClickListener(new gg4.o(this, intExtra));
        this.f172420d.setOnScrollListener(new bb5.a());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().a();
        java.util.Map map = this.f172423g;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
        super.onDestroy();
    }
}
