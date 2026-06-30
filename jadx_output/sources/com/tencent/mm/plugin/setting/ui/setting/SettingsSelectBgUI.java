package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class SettingsSelectBgUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f160653o = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f160654d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.wl f160655e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.GridView f160656f;

    /* renamed from: g, reason: collision with root package name */
    public rz.o f160657g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160659i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160660m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f160658h = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f160661n = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.setting.ui.setting.sl(this), true);

    public static void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI, int i17) {
        settingsSelectBgUI.getClass();
        gm0.j1.u().c().w(66820, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10198, java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSelectBgUI", "set chating bg id:%d", java.lang.Integer.valueOf(i17));
        if (settingsSelectBgUI.f160659i) {
            gm0.j1.u().c().w(12311, java.lang.Integer.valueOf(i17));
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().m0(1);
            return;
        }
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        f21.a m07 = wi6.m0(settingsSelectBgUI.f160660m);
        if (m07 != null) {
            m07.f258833b = i17;
            wi6.s0(m07);
        } else {
            f21.a aVar = new f21.a();
            aVar.f258832a = settingsSelectBgUI.f160660m;
            aVar.f258833b = i17;
            wi6.n0(aVar);
        }
    }

    public final void U6(java.util.List list) {
        if (list.size() <= 0) {
            this.f160657g = null;
        } else {
            this.f160657g = (rz.o) list.remove(0);
            gm0.j1.d().g((com.tencent.mm.modelbase.m1) this.f160657g);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.clz;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iq9);
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.tl(this));
        this.f160659i = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f160660m = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        this.f160661n.c(20L, 20L);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160654d = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479648bn);
        initView();
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        gm0.j1.d().a(160, this);
        if (gm0.j1.u().l()) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            gm0.j1.d().g(new f21.g0(1));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f160657g != null) {
            gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f160657g);
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(((f21.f0) this.f160657g).f258895f, 1);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f160658h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rz.o oVar = (rz.o) it.next();
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(((f21.f0) oVar).f258895f, 1);
        }
        arrayList.clear();
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        gm0.j1.d().q(160, this);
        this.f160655e.c();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.r0.Bi().remove(this.f160655e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof com.tencent.mm.modelbase.q1) && ((com.tencent.mm.modelbase.q1) m1Var).u() == 1) {
            int type = m1Var.getType();
            if ((type == 159 || type == 160) && type == 160) {
                U6(this.f160658h);
            }
        }
    }
}
