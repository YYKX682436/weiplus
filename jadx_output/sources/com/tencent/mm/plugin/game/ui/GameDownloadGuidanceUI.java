package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class GameDownloadGuidanceUI extends com.tencent.mm.plugin.game.ui.GameCenterBaseUI implements com.tencent.mm.modelbase.u0 {

    /* renamed from: r, reason: collision with root package name */
    public android.app.Dialog f140753r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f140754s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f140755t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f140756u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f140757v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f140758w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f140759x = "";

    /* renamed from: y, reason: collision with root package name */
    public m53.e2 f140760y;

    public void Z6(com.tencent.mm.plugin.game.model.v1 v1Var, int i17) {
        if (isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI hasFinished");
            return;
        }
        if (v1Var != null) {
            m53.e2 e2Var = v1Var.f140494a;
            if ((e2Var != null ? e2Var.f323648d : null) != null) {
                if ((e2Var != null ? e2Var.f323649e : null) != null) {
                    this.f140759x = (e2Var != null ? e2Var.f323649e : null).f323922d;
                } else {
                    this.f140759x = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f140759x)) {
                    if (this.f140758w) {
                        removeOptionMenu(0);
                        this.f140758w = false;
                    }
                } else if (!this.f140758w) {
                    addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_setting_icon, new com.tencent.mm.plugin.game.ui.z2(this));
                    this.f140758w = true;
                }
                this.f140754s.setVisibility(0);
                m53.a0 a0Var = e2Var != null ? e2Var.f323648d : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f323547d)) {
                    this.f140755t.setVisibility(8);
                } else {
                    this.f140755t.setText(a0Var.f323547d);
                    this.f140755t.setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f323548e)) {
                    this.f140756u.setVisibility(8);
                } else {
                    this.f140756u.setText(a0Var.f323548e);
                    this.f140756u.setVisibility(0);
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f323549f)) {
                    this.f140757v.setVisibility(8);
                } else {
                    this.f140757v.setText(a0Var.f323549f);
                    this.f140757v.setVisibility(0);
                }
                if (i17 == 2) {
                    r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.y2(this));
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameDownloadGuidanceUI", "Null data");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bg9;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.game.ui.u2(this));
        setMMTitle(com.tencent.mm.R.string.fq7);
        this.f140754s = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cg7);
        this.f140755t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j8i);
        this.f140756u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mgc);
        this.f140757v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486781mg4);
    }

    @Override // com.tencent.mm.plugin.game.ui.GameCenterBaseUI, com.tencent.mm.plugin.game.ui.GameCenterActivity, com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(2586, this);
        initView();
        r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.x2(this));
    }

    @Override // com.tencent.mm.plugin.game.ui.GameBaseActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadGuidanceUI", "onDestroy");
        super.onDestroy();
        r53.d dVar = r53.b.f392640a;
        synchronized (dVar) {
            java.util.Map map = dVar.f392647a;
            if (map != null) {
                ((java.util.LinkedHashMap) map).clear();
            }
            dVar.f392648b = false;
        }
        gm0.j1.d().q(2586, this);
        com.tencent.mm.plugin.game.model.a wi6 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        wi6.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameAppCacheService", "clear cached apppinfos");
        java.util.LinkedList linkedList = wi6.f140190b;
        if (linkedList != null) {
            linkedList.clear();
        }
        java.util.LinkedList linkedList2 = wi6.f140189a;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameDownloadGuidanceUI", "errType: %d errCode: %d, scene: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(m1Var.hashCode()));
        if (i17 == 0 && i18 == 0) {
            if (m1Var.getType() != 2586) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r53.f.l().postToWorker(new com.tencent.mm.plugin.game.ui.b3(this, ((com.tencent.mm.plugin.game.model.f3) m1Var).f140312d.f70711b.f70700a, currentTimeMillis));
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.fna, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
        android.app.Dialog dialog = this.f140753r;
        if (dialog != null) {
            dialog.cancel();
        }
    }
}
