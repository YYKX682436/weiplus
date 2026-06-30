package com.tencent.mm.plugin.fts.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSKefuBoxUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseUI;", "<init>", "()V", "ui-fts_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class FTSKefuBoxUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: q, reason: collision with root package name */
    public int f137982q;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137984s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.o2 f137985t;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f137981p = "MicroMsg.FTS.FTSDetailUI";

    /* renamed from: r, reason: collision with root package name */
    public java.util.HashSet f137983r = new java.util.HashSet();

    public FTSKefuBoxUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137984s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI$mUpdateFtsSearchDataEvent$1
            {
                this.__eventId = -1317958916;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent updateFtsSearchDataEvent) {
                com.tencent.mm.autogen.events.UpdateFtsSearchDataEvent event = updateFtsSearchDataEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI fTSKefuBoxUI = com.tencent.mm.plugin.fts.ui.FTSKefuBoxUI.this;
                fTSKefuBoxUI.d7();
                com.tencent.mars.xlog.Log.i(fTSKefuBoxUI.f137981p, "UpdateFtsSearchDataEvent");
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.f137985t == null) {
            this.f137985t = new com.tencent.mm.plugin.fts.ui.o2(w0Var, this.f137983r, this.f137982q);
        }
        return this.f137985t;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void X6() {
        this.f137982q = getIntent().getIntExtra("Search_Scene", 0);
        int intExtra = getIntent().getIntExtra("box_search_type", 0);
        if (intExtra == 1) {
            this.f137983r = kz5.p1.d(12291, 12292);
        } else {
            if (intExtra != 2) {
                return;
            }
            this.f137983r = kz5.p1.d(12289, 12290);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489117bc2;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c = true;
        this.f137910n = "";
        this.f137907h.getFtsEditText().n("", null);
        this.f137907h.getFtsEditText().g();
        this.f137984s.alive();
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 3L;
        kFContactSessionSearchLogStruct.f58544e = g23.j.f267931b;
        kFContactSessionSearchLogStruct.p(g23.j.f267933d);
        kFContactSessionSearchLogStruct.f58546g = g23.j.f267934e;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
        this.f137907h.getFtsEditText().m();
        pm0.v.V(500L, new com.tencent.mm.plugin.fts.ui.p2(this));
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.fts.ui.o2 o2Var = this.f137985t;
        if (o2Var != null) {
            o2Var.g();
        }
        this.f137984s.dead();
        ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).h();
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
    }
}
