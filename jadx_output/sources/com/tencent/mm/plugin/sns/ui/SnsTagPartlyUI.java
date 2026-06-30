package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class SnsTagPartlyUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f167453h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f167454d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.zr f167455e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f167456f = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f167457g = new com.tencent.mm.plugin.sns.ui.xr(this);

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.zr T6(com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI snsTagPartlyUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        com.tencent.mm.plugin.sns.ui.zr zrVar = snsTagPartlyUI.f167455e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        return zrVar;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        return com.tencent.mm.R.layout.ctv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        setMMTitle(com.tencent.mm.R.string.iwz);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.sr(this));
        android.widget.ListView listView = (android.widget.ListView) findViewById(com.tencent.mm.R.id.nbt);
        this.f167454d = listView;
        listView.setOnItemClickListener(new com.tencent.mm.plugin.sns.ui.tr(this));
        this.f167455e = new com.tencent.mm.plugin.sns.ui.zr(this, this);
        this.f167454d.addFooterView(android.view.View.inflate(this, com.tencent.mm.R.layout.ctu, null));
        this.f167454d.setAdapter((android.widget.ListAdapter) this.f167455e);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.jft), new com.tencent.mm.plugin.sns.ui.ur(this));
        this.f167455e.f212611h = new com.tencent.mm.plugin.sns.ui.vr(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
            return;
        }
        if (i17 == 1) {
            if (intent == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            java.lang.String stringExtra2 = intent.getStringExtra("Select_room_name");
            if (stringExtra == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("k_sns_tag_id", 0);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            intent2.putExtra("k_sns_tag_name", stringExtra2);
            intent2.putExtra("k_sns_tag_list", stringExtra);
            intent2.setClass(this, com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/sns/ui/SnsTagPartlyUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        com.tencent.mm.plugin.sns.ui.zr zrVar = this.f167455e;
        if (zrVar != null) {
            zrVar.c();
        }
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.zr zrVar = this.f167455e;
        if (zrVar != null) {
            zrVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagPartlyUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f167456f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f167456f = null;
        }
        com.tencent.mm.plugin.sns.ui.zr zrVar = this.f167455e;
        if (zrVar != null) {
            zrVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTagPartlyUI");
    }
}
