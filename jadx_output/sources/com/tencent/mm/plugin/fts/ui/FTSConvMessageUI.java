package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class FTSConvMessageUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137964p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f137965q;

    /* renamed from: r, reason: collision with root package name */
    public int f137966r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.e2 f137967s;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str2, str2, list, oVar);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public boolean G0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137967s == null) {
            this.f137967s = new com.tencent.mm.plugin.fts.ui.e2(w0Var, this.f137964p, this.f137966r);
        }
        return this.f137967s;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public java.lang.String W6() {
        return getString(com.tencent.mm.R.string.f492949ie2);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137964p = getIntent().getStringExtra("key_conv");
        this.f137965q = getIntent().getStringExtra("key_query");
        this.f137966r = getIntent().getIntExtra("Search_Scene", 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbx;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.fts.ui.g2 g2Var = new com.tencent.mm.plugin.fts.ui.g2(this, null);
        g2Var.f138064d = o13.n.d(this.f137964p);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(g2Var);
        java.lang.String str = this.f137965q;
        this.f137910n = str;
        this.f137907h.getFtsEditText().n(str, arrayList);
        d7();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f137967s.g();
        super.onDestroy();
    }
}
