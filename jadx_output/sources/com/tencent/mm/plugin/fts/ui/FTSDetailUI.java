package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class FTSDetailUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: p, reason: collision with root package name */
    public int f137975p;

    /* renamed from: q, reason: collision with root package name */
    public int f137976q;

    /* renamed from: r, reason: collision with root package name */
    public long f137977r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137978s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.fts.ui.FTSDetailUI.1
        {
            this.__eventId = -1317958916;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent updateFtsSearchDataEvent) {
            if (updateFtsSearchDataEvent == null) {
                return false;
            }
            com.tencent.mm.plugin.fts.ui.FTSDetailUI.this.d7();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDetailUI", "UpdateFtsSearchDataEvent");
            return false;
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.l2 f137979t;

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137979t == null) {
            this.f137979t = new com.tencent.mm.plugin.fts.ui.l2(w0Var, this.f137976q, this.f137975p, this.f137977r);
        }
        return this.f137979t;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public java.lang.String W6() {
        java.lang.String f17 = com.tencent.mm.plugin.fts.ui.n3.f(this.f137976q);
        return f17 == null ? getString(com.tencent.mm.R.string.f490549y8) : f17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137976q = getIntent().getIntExtra("detail_type", 0);
        this.f137975p = getIntent().getIntExtra("Search_Scene", 0);
        this.f137977r = getIntent().getLongExtra("home_page_search_id", 0L);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489117bc2;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        java.lang.String stringExtra = getIntent().getStringExtra("detail_query");
        this.f137910n = stringExtra;
        this.f137907h.getFtsEditText().n(stringExtra, null);
        boolean booleanExtra = getIntent().getBooleanExtra("Floating_VoiceText", false);
        this.f137909m = booleanExtra;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = booleanExtra ? "voice" : "";
        objArr[1] = this.f137910n;
        objArr[2] = java.lang.Integer.valueOf(this.f137976q);
        objArr[3] = java.lang.Integer.valueOf(this.f137975p);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSDetailUI", "onCreate %s query=%s, searchType=%d, kvScene=%d", objArr);
        d7();
        this.f137909m = false;
        this.f137907h.getFtsEditText().g();
        this.f137978s.alive();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f137979t.g();
        this.f137978s.dead();
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).h();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}
