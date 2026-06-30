package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class WcPayRealnameVerifySuccessUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f179309d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f179310e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f179311f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f179312g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f179313h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f179314i;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d9f;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478494f));
        hideActionbarLine();
        showHomeBtn(false);
        setMMTitle("");
        this.f179311f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pqj);
        this.f179312g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pqi);
        this.f179313h = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.pqk);
        this.f179309d = (android.widget.Button) findViewById(com.tencent.mm.R.id.pqg);
        this.f179310e = (android.widget.Button) findViewById(com.tencent.mm.R.id.pqh);
        this.f179314i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pqf);
        int i17 = getInput().getInt("realname_verify_process_finish_err_jump");
        int i18 = getInput().getInt("realname_verify_process_finish_passport_page_style");
        if (i17 == 1) {
            this.f179309d.setVisibility(0);
            this.f179310e.setVisibility(0);
            this.f179313h.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_error1, getResources().getColor(com.tencent.mm.R.color.Red_100)));
            java.lang.String string = getInput().getString("realname_verify_process_finish_page");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                this.f179309d.setText(string);
            }
            this.f179310e.setText(com.tencent.mm.R.string.f490347sg);
            this.f179309d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.y3(this));
            this.f179310e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.z3(this));
        } else if (i18 == 1) {
            this.f179313h.setVisibility(8);
            this.f179309d.setVisibility(0);
            this.f179310e.setVisibility(0);
            java.lang.String string2 = getInput().getString("realname_verify_process_finish_confirm_btn_title");
            java.lang.String string3 = getInput().getString("realname_verify_process_finish_cancel_btn_title");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                this.f179309d.setText(string2);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                this.f179310e.setText(string3);
            }
            this.f179309d.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.c4(this));
            this.f179310e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.d4(this));
        } else {
            this.f179309d.setVisibility(8);
            this.f179310e.setVisibility(0);
            this.f179313h.setImageResource(com.tencent.mm.R.raw.realname_done);
            java.lang.String string4 = getInput().getString("realname_verify_process_finish_page");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                this.f179310e.setText(string4);
            }
            this.f179310e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.id_verify.a4(this));
        }
        java.lang.String string5 = getInput().getString("realname_verify_process_finish_title");
        java.lang.String string6 = getInput().getString("realname_verify_process_finish_desc");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
            this.f179311f.setText(string5);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string6)) {
            this.f179312g.setText(string6);
            this.f179312g.setVisibility(0);
        }
        java.lang.String string7 = getInput().getString("realname_verify_process_finish_bottom_wording");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string7)) {
            this.f179314i.setVisibility(8);
        } else {
            this.f179314i.setVisibility(0);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f179314i, string7, 0, string7.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new com.tencent.mm.plugin.wallet_core.id_verify.w3(this), true), getContext());
        }
        setBackBtn(new com.tencent.mm.plugin.wallet_core.id_verify.x3(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
