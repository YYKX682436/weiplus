package com.tencent.mm.plugin.setting.ui.qrcode;

/* loaded from: classes11.dex */
public class ShareToQQUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f160114i = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f160116e;

    /* renamed from: f, reason: collision with root package name */
    public int f160117f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.l f160118g;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f160115d = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f160119h = false;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488722a55;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.iic);
        this.f160116e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.cgi);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487744po1);
        android.widget.EditText editText = this.f160116e;
        editText.addTextChangedListener(new al5.p1(editText, textView, 280));
        int intExtra = getIntent().getIntExtra("show_to", 2);
        this.f160117f = intExtra;
        if (intExtra == 4) {
            this.f160116e.setText(com.tencent.mm.R.string.ihc);
        } else {
            this.f160116e.setText(com.tencent.mm.R.string.ihe);
        }
        setBackBtn(new p14.e0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490558yg), new p14.h0(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(26, this);
        initView();
        if (c01.z1.u()) {
            com.tencent.mm.ui.mmfb.sdk.l lVar = new com.tencent.mm.ui.mmfb.sdk.l();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(65830, null);
            if (str == null) {
                str = "";
            }
            lVar.g(str);
            new v61.q0(lVar, new p14.j0(this)).c();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(26, this);
        com.tencent.mm.ui.mmfb.sdk.l lVar = this.f160118g;
        if (lVar != null) {
            lVar.c(this);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        if (m1Var.getType() != 26) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f160115d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f160115d = null;
        }
        if (i17 == 4 && i18 == -68) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = "error";
            }
            db5.e1.u(this, str, getString(com.tencent.mm.R.string.f490573yv), new p14.i0(this), null);
            return;
        }
        if (i17 == 0 && i18 == 0) {
            hideVKB();
            java.lang.String string = getString(com.tencent.mm.R.string.j3v);
            if (isFinishing()) {
                return;
            }
            dp.a.makeText(this, string, 0).show();
            return;
        }
        this.f160119h = false;
        o25.s1 a17 = f14.g.a();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.j3u, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
