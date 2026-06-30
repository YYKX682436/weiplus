package com.tencent.mm.plugin.subapp.ui.autoadd;

/* loaded from: classes15.dex */
public class AutoAddFriendUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f172157d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f172158e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f172159f = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f172160g = new android.util.SparseIntArray();

    /* renamed from: h, reason: collision with root package name */
    public int f172161h;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488163iw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        int i17;
        this.f172157d = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.k6k);
        this.f172158e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a9a);
        this.f172159f = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.a9_);
        this.f172157d.setCheck((this.f172161h & 32) != 0);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AutoAddFriendShow");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            d17 = "0";
        }
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(d17, 0);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        if (i17 == 1) {
            this.f172159f.setCheck((this.f172161h & 2097152) != 0);
            this.f172159f.setSwitchListener(new dg4.a(this));
        } else {
            this.f172158e.setVisibility(8);
            this.f172159f.setVisibility(8);
        }
        this.f172157d.setSwitchListener(new dg4.b(this));
        setBackBtn(new dg4.c(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.a6t);
        this.f172161h = c01.z1.p();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        c01.d9.b().p().w(7, java.lang.Integer.valueOf(this.f172161h));
        int i17 = 0;
        while (true) {
            android.util.SparseIntArray sparseIntArray = this.f172160g;
            if (i17 >= sparseIntArray.size()) {
                sparseIntArray.clear();
                return;
            }
            int keyAt = sparseIntArray.keyAt(i17);
            int valueAt = sparseIntArray.valueAt(i17);
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = keyAt;
            p53Var.f382762e = valueAt;
            ((e21.z0) c01.d9.b().w()).c(new xg3.p0(23, p53Var));
            i17++;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
