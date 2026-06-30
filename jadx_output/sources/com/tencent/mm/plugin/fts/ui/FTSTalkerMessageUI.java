package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class FTSTalkerMessageUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137995p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f137996q;

    /* renamed from: r, reason: collision with root package name */
    public int f137997r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.k3 f137998s;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str2, str2, list, oVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137998s == null) {
            this.f137998s = new com.tencent.mm.plugin.fts.ui.k3(this, this.f137995p, this.f137997r);
        }
        return this.f137998s;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137995p = getIntent().getStringExtra("key_talker_query");
        this.f137996q = getIntent().getStringExtra("key_query");
        this.f137997r = getIntent().getIntExtra("Search_Scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSTalkerMessageUI", "initSearchData query=%s talkerQuery=%s", this.f137996q, this.f137995p);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bd6;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        com.tencent.mm.plugin.fts.ui.m3 m3Var = new com.tencent.mm.plugin.fts.ui.m3(this, null);
        m3Var.f138117d = this.f137995p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(m3Var);
        java.lang.String str = this.f137996q;
        this.f137910n = str;
        this.f137907h.getFtsEditText().n(str, arrayList);
        d7();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f137998s.g();
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
        super.onDestroy();
    }
}
