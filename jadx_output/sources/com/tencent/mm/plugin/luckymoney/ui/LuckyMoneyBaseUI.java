package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public abstract class LuckyMoneyBaseUI extends com.tencent.mm.ui.MMActivity implements np5.f, com.tencent.mm.wallet_core.model.s {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.r4 f145972d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f145973e = true;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f145974f = new java.util.LinkedList();

    public void T6() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
    }

    public void U6() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().L();
            setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479342wx));
        }
    }

    public void addSceneEndListener(int i17) {
        this.f145972d.c(i17);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        this.f145972d.d(m1Var, z17);
    }

    public void forceCancel() {
        this.f145972d.e();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = ((java.util.List) this.f145974f.clone()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.p0 p0Var = ((com.tencent.mm.wallet_core.model.n0) ((com.tencent.mm.wallet_core.model.u) it.next())).f213950a;
            p0Var.f213972k.dead();
            p0Var.f213973l.dead();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        com.tencent.mm.plugin.luckymoney.model.r4 r4Var = new com.tencent.mm.plugin.luckymoney.model.r4(this, this);
        this.f145972d = r4Var;
        r4Var.c(1554);
        this.f145972d.c(1575);
        this.f145972d.c(1668);
        this.f145972d.c(fe1.l.CTRL_INDEX);
        this.f145972d.c(1685);
        this.f145972d.c(com.tencent.mm.plugin.appbrand.jsapi.u6.CTRL_INDEX);
        this.f145972d.c(1514);
        this.f145972d.c(1682);
        this.f145972d.c(1612);
        this.f145972d.c(1643);
        this.f145972d.c(1558);
        this.f145972d.c(2715);
        this.f145972d.c(4605);
        this.f145972d.c(4915);
        this.f145972d.c(4536);
        this.f145972d.c(5148);
        this.f145972d.c(4395);
        this.f145972d.c(2832);
        this.f145972d.c(1647);
        this.f145972d.c(4373);
        this.f145972d.c(4595);
        this.f145972d.c(4339);
        this.f145972d.c(4717);
        this.f145972d.c(4878);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479342wx));
        if (this.f145973e) {
            setActionbarElementColor(getResources().getColor(com.tencent.mm.R.color.f479349x3));
        }
        getLayoutId();
        java.util.Iterator it = ((java.util.List) this.f145974f.clone()).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.wallet_core.model.u) it.next()).getClass();
        }
        com.tencent.mm.wallet_core.ui.b0.c(getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.f145972d.f(1554);
        this.f145972d.f(1575);
        this.f145972d.f(1668);
        this.f145972d.f(fe1.l.CTRL_INDEX);
        this.f145972d.f(1685);
        this.f145972d.f(com.tencent.mm.plugin.appbrand.jsapi.u6.CTRL_INDEX);
        this.f145972d.f(1514);
        this.f145972d.f(1682);
        this.f145972d.f(1612);
        this.f145972d.f(1643);
        this.f145972d.f(1558);
        this.f145972d.f(2715);
        this.f145972d.f(4605);
        this.f145972d.f(4915);
        this.f145972d.f(4536);
        this.f145972d.f(5148);
        this.f145972d.f(4395);
        this.f145972d.f(2832);
        this.f145972d.f(1647);
        this.f145972d.f(4373);
        this.f145972d.f(4595);
        this.f145972d.f(4339);
        this.f145972d.f(4717);
        this.f145972d.f(4878);
        java.util.LinkedList linkedList = this.f145974f;
        java.util.Iterator it = ((java.util.List) linkedList.clone()).iterator();
        while (it.hasNext()) {
            com.tencent.mm.wallet_core.model.p0 p0Var = ((com.tencent.mm.wallet_core.model.n0) ((com.tencent.mm.wallet_core.model.u) it.next())).f213950a;
            p0Var.f213972k.dead();
            p0Var.f213973l.dead();
        }
        linkedList.clear();
        super.onDestroy();
        com.tencent.mm.wallet_core.ui.b0.d(getClass().getSimpleName());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.tencent.mm.plugin.luckymoney.model.r4 r4Var = this.f145972d;
            if (r4Var != null) {
                if ((r4Var.f145578g.isEmpty() && r4Var.f145577f.isEmpty()) ? false : true) {
                    this.f145972d.e();
                }
            }
            if (getContentView().getVisibility() == 8 || getContentView().getVisibility() == 4) {
                finish();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // np5.f
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, boolean z17) {
        if (onSceneEnd(i17, i18, str, m1Var)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.e1.T(this, str);
        finish();
    }

    public abstract boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var);

    @Override // com.tencent.mm.wallet_core.model.s
    public void register(com.tencent.mm.wallet_core.model.u uVar) {
        java.util.LinkedList linkedList = this.f145974f;
        if (linkedList.contains(uVar)) {
            return;
        }
        linkedList.add(uVar);
    }

    public void removeSceneEndListener(int i17) {
        this.f145972d.f(i17);
    }

    public void doSceneProgress(com.tencent.mm.modelbase.m1 m1Var) {
        this.f145972d.d(m1Var, true);
    }
}
