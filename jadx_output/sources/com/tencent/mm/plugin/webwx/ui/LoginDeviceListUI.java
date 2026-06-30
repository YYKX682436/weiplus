package com.tencent.mm.plugin.webwx.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/webwx/ui/LoginDeviceListUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lc01/y8;", "Lcom/tencent/mm/plugin/webwx/ui/r;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class LoginDeviceListUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, c01.y8, com.tencent.mm.plugin.webwx.ui.r {

    /* renamed from: d, reason: collision with root package name */
    public boolean f187982d;

    /* renamed from: e, reason: collision with root package name */
    public int f187983e;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f187985g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$iUpdateExtDeviceListener$1 f187987i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f187988m;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f187984f = jz5.h.b(new com.tencent.mm.plugin.webwx.ui.n(this));

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f187986h = new java.util.ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$iUpdateExtDeviceListener$1] */
    public LoginDeviceListUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f187987i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateExtDeviceEvent>(a0Var) { // from class: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$iUpdateExtDeviceListener$1
            {
                this.__eventId = 190808156;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateExtDeviceEvent updateExtDeviceEvent) {
                com.tencent.mm.autogen.events.UpdateExtDeviceEvent event = updateExtDeviceEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceListUI", "UpdateExtDeviceEvent");
                com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI loginDeviceListUI = com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI.this;
                loginDeviceListUI.f187986h.clear();
                loginDeviceListUI.f187986h.addAll(ug3.i.K());
                loginDeviceListUI.notifyDataSetChanged();
                return false;
            }
        };
        this.f187988m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusNotifyFunctionEvent>(a0Var) { // from class: com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI$statusNotifyFunctionListener$1
            {
                this.__eventId = 1510396759;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusNotifyFunctionEvent statusNotifyFunctionEvent) {
                com.tencent.mm.autogen.events.StatusNotifyFunctionEvent event = statusNotifyFunctionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54869g.f8612a != 8) {
                    return false;
                }
                com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI.this.finish();
                return false;
            }
        };
    }

    public final androidx.recyclerview.widget.RecyclerView T6() {
        java.lang.Object value = ((jz5.n) this.f187984f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    @Override // c01.y8
    public void a0() {
        if (!c01.d9.b().F()) {
            finish();
        } else if (ug3.i.L()) {
            notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bsy;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        java.util.Set W0 = kz5.n0.W0(importUIComponents);
        W0.add(my4.g.class);
        return W0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.ghx);
        setBackBtn(new com.tencent.mm.plugin.webwx.ui.o(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        hideActionbarLine();
        java.util.ArrayList arrayList = this.f187986h;
        arrayList.addAll(ug3.i.K());
        T6().setAdapter(new com.tencent.mm.plugin.webwx.ui.m(arrayList, arrayList.size() == 1 ? 0 : -1, this));
        com.tencent.mm.view.recyclerview.WxLinearLayoutManager wxLinearLayoutManager = new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(getContext());
        wxLinearLayoutManager.Q(1);
        T6().setLayoutManager(wxLinearLayoutManager);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MULTI_DEVICE_NEW_EDUCATION_SHOWN_BOOLEAN_SYNC;
        if (c17.o(u3Var, false)) {
            return;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.mz9)).setVisibility(0);
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
    }

    public void notifyDataSetChanged() {
        androidx.recyclerview.widget.f2 adapter = T6().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.f187983e = getIntent().getIntExtra("intent.key.online_version", 0);
        }
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        c01.d9.e().a(281, this);
        c01.d9.e().a(gd1.w.CTRL_INDEX, this);
        c01.d9.e().a(uc1.x1.CTRL_INDEX, this);
        alive();
        c01.d9.b().a(this);
        this.f187988m.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        c01.d9.e().q(281, this);
        c01.d9.e().q(gd1.w.CTRL_INDEX, this);
        c01.d9.e().q(uc1.x1.CTRL_INDEX, this);
        c01.d9.b().G(this);
        dead();
        this.f187988m.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f187982d && gm0.j1.a()) {
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 27;
            p53Var.f382762e = c01.z1.K() ? 1 : 2;
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(23, p53Var));
            this.f187982d = false;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        android.app.ProgressDialog progressDialog = this.f187985g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f187985g = null;
        if (scene.getType() == 281) {
            if (i17 != 0 || i18 != 0) {
                dp.a.makeText(this, com.tencent.mm.R.string.l7y, 1).show();
            }
            finish();
            return;
        }
        if (scene.getType() == 526) {
            java.util.ArrayList arrayList = this.f187986h;
            arrayList.clear();
            arrayList.addAll(ug3.i.K());
            notifyDataSetChanged();
        }
    }
}
