package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class SayHiEditUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f206534d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f206535e = null;

    public static void T6(com.tencent.mm.ui.contact.SayHiEditUI sayHiEditUI) {
        sayHiEditUI.getClass();
        fo3.s.INSTANCE.O6(2, 1, 5);
        java.lang.String stringExtra = sayHiEditUI.getIntent().getStringExtra("Contact_User");
        int intExtra = sayHiEditUI.getIntent().getIntExtra("Contact_Scene", 18);
        java.lang.String stringExtra2 = sayHiEditUI.getIntent().getStringExtra("AntispamTicket");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(stringExtra);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(intExtra));
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            linkedList3.add(stringExtra2);
        }
        java.lang.String trim = sayHiEditUI.f206534d.getText().toString().trim();
        if (trim.length() > 50) {
            trim = trim.substring(0, 50);
        }
        r35.e4 e4Var = new r35.e4(sayHiEditUI.getContext(), null);
        e4Var.f369094q = trim;
        e4Var.g(linkedList, linkedList2);
        sayHiEditUI.f206535e = db5.e1.Q(sayHiEditUI.getContext(), sayHiEditUI.getString(com.tencent.mm.R.string.f490573yv), sayHiEditUI.getString(com.tencent.mm.R.string.iin), true, true, new com.tencent.mm.ui.contact.a9(sayHiEditUI, e4Var));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.chh;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.m9y);
        this.f206534d = mMEditText;
        mMEditText.requestFocus();
        this.f206534d.addTextChangedListener(new com.tencent.mm.ui.contact.b9(null));
        this.f206534d.setOnEditorActionListener(new com.tencent.mm.ui.contact.x8(this));
        ck5.f b17 = ck5.f.b(this.f206534d);
        b17.f42561f = 0;
        b17.f42560e = 100;
        b17.d(null);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.ui.contact.y8(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.ui.contact.z8(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(30, this);
        setMMTitle(com.tencent.mm.R.string.h6c);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(30, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiEditUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        try {
            android.app.ProgressDialog progressDialog = this.f206535e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f206535e = null;
            }
            boolean z17 = true;
            if (i18 == -34 || i18 == -24) {
                dp.a.makeText(this, com.tencent.mm.R.string.h6g, 0).show();
            } else if (i18 != -22) {
                z17 = false;
            } else {
                dp.a.makeText(this, com.tencent.mm.R.string.h6d, 0).show();
            }
            if (z17) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getString(com.tencent.mm.R.string.f490940bb2));
                finish();
                return;
            }
            java.lang.String str2 = "";
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((b17 = tm.a.b(str)) == null || (str2 = b17.f420399b) == null)) {
                str2 = str;
            }
            if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            } else if (i18 != -101 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                dp.a.makeText(this, com.tencent.mm.R.string.h6e, 0).show();
            } else {
                db5.e1.y(this, str2, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490507x1), null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiEditUI", "exception in onSceneEnd : " + e17.getMessage());
        }
    }
}
