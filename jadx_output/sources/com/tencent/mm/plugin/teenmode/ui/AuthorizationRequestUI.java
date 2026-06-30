package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AuthorizationRequestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f172810d = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.f0(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172811e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.w(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172812f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.y(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f172813g = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.x(this));

    /* renamed from: h, reason: collision with root package name */
    public boolean f172814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f172815i;

    public final void T6() {
        if (this.f172814h) {
            return;
        }
        this.f172814h = true;
        int intExtra = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_extra_key");
        boolean z17 = ((uh4.c0) i95.n0.c(uh4.c0.class)).kf(intExtra, stringExtra) && this.f172815i;
        jz5.g gVar = vh4.c.f437058a;
        if (stringExtra == null) {
            return;
        }
        java.lang.String str = intExtra + '#' + stringExtra;
        jz5.g gVar2 = vh4.c.f437058a;
        uh4.a0 a0Var = (uh4.a0) ((java.util.Map) ((jz5.n) gVar2).getValue()).get(str);
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AuthorizationReqCallbackMgr", "callback bizType:" + intExtra + " bizKey:" + stringExtra + " canGoOn:" + z17);
            pm0.v.L("AuthorizationReqCallbackMgr", true, new vh4.a(a0Var, intExtra, stringExtra, z17));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cy7;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 101 && i18 == -1) {
            uh4.g0 g0Var = new uh4.g0();
            g0Var.field_businessType = getIntent().getIntExtra("intent_extra_type", Integer.MAX_VALUE);
            g0Var.field_businessKey = getIntent().getStringExtra("intent_extra_key");
            com.tencent.mm.storage.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
            g0Var.field_guardianUserName = df6 != null ? df6.d1() : null;
            g0Var.field_wardUserName = c01.z1.r();
            g0Var.field_time = c01.id.c();
            wh4.j.f446012a.a().replace(g0Var);
            ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
            this.f172815i = true;
            setResult(-1);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.z(this));
        boolean booleanExtra = getIntent().getBooleanExtra("intent_extra_can_auth", true);
        jz5.g gVar = this.f172813g;
        jz5.g gVar2 = this.f172812f;
        if (booleanExtra) {
            ((android.widget.LinearLayout) ((jz5.n) gVar2).getValue()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
        } else {
            ((android.widget.LinearLayout) ((jz5.n) gVar2).getValue()).setVisibility(8);
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(8);
        }
        ((android.widget.RelativeLayout) ((jz5.n) this.f172810d).getValue()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.a0(this));
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).df() != null) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.f172811e).getValue();
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.d0(relativeLayout, this));
            relativeLayout.setVisibility(0);
        }
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f483758bz2)).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.e0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthorizationRequestUI", "onDestroy hadCallback:" + this.f172814h);
        T6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.AuthorizationRequestUI", "onStop isFinishing:" + isFinishing());
        if (isFinishing()) {
            T6();
        }
    }
}
