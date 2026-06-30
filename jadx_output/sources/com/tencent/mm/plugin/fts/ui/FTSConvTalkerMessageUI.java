package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class FTSConvTalkerMessageUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137968p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f137969q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f137970r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f137971s;

    /* renamed from: t, reason: collision with root package name */
    public int f137972t;

    /* renamed from: u, reason: collision with root package name */
    public int f137973u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.h2 f137974v;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str2, str2, list, oVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137974v == null) {
            this.f137974v = new com.tencent.mm.plugin.fts.ui.h2(this, this.f137970r, this.f137968p, this.f137969q, this.f137973u, this.f137972t);
        }
        return this.f137974v;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137969q = getIntent().getStringExtra("key_conv");
        this.f137970r = getIntent().getStringExtra("key_talker");
        this.f137971s = getIntent().getStringExtra("key_query");
        this.f137968p = getIntent().getStringExtra("key_talker_query");
        this.f137972t = getIntent().getIntExtra("detail_type", 1);
        this.f137973u = getIntent().getIntExtra("Search_Scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSConvTalkerMessageUI", "initSearchData query=%s talker=%s conversation=%s showType=%d", this.f137971s, this.f137970r, this.f137969q, java.lang.Integer.valueOf(this.f137972t));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bd6;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        com.tencent.mm.plugin.fts.ui.j2 j2Var = new com.tencent.mm.plugin.fts.ui.j2(this, null);
        j2Var.f138082d = this.f137968p;
        com.tencent.mm.plugin.fts.ui.j2 j2Var2 = new com.tencent.mm.plugin.fts.ui.j2(this, null);
        j2Var2.f138082d = ">";
        com.tencent.mm.plugin.fts.ui.j2 j2Var3 = new com.tencent.mm.plugin.fts.ui.j2(this, null);
        j2Var3.f138082d = o13.n.d(this.f137969q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f137972t == 2) {
            arrayList.add(j2Var);
            arrayList.add(j2Var2);
            arrayList.add(j2Var3);
        } else {
            arrayList.add(j2Var3);
            arrayList.add(j2Var2);
            arrayList.add(j2Var);
        }
        java.lang.String str = this.f137971s;
        this.f137910n = str;
        this.f137907h.getFtsEditText().n(str, arrayList);
        d7();
    }
}
