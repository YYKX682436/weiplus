package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class SettingsTeenModeMainOther extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172893d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f172894e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172895f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f172896g;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cmb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        int i17;
        int i18;
        int i19;
        int i27;
        super.onCreate(bundle);
        java.lang.String str2 = "";
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f172893d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.h7s);
        this.f172894e = (com.tencent.mm.ui.MMImageView) findViewById(com.tencent.mm.R.id.gnd);
        this.f172895f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        this.f172896g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cut);
        int intExtra = getIntent().getIntExtra("biz_type", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainOther", "type:%s", java.lang.Integer.valueOf(intExtra));
        int i28 = com.tencent.mm.R.color.f478496g;
        int i29 = com.tencent.mm.R.color.f478532ac;
        switch (intExtra) {
            case 1:
                string = getString(com.tencent.mm.R.string.jsp);
                string2 = getString(com.tencent.mm.R.string.f491046bp2);
                i17 = com.tencent.mm.R.raw.icons_outlined_news;
                i19 = com.tencent.mm.R.color.f478526a7;
                break;
            case 2:
                string = getString(com.tencent.mm.R.string.jsd);
                string2 = getString(com.tencent.mm.R.string.bou);
                i18 = com.tencent.mm.R.raw.icons_outlined_searchlogo;
                int i37 = i29;
                i27 = i18;
                i28 = i37;
                int i38 = i27;
                i19 = i28;
                i17 = i38;
                break;
            case 3:
                this.f172893d.setVisibility(8);
                this.f172894e.setVisibility(0);
                str = getString(com.tencent.mm.R.string.jsh);
                str2 = getString(com.tencent.mm.R.string.bow);
                i17 = -1;
                i19 = -1;
                java.lang.String str3 = str;
                string2 = str2;
                string = str3;
                break;
            case 4:
                string = getString(com.tencent.mm.R.string.jsj);
                string2 = getString(com.tencent.mm.R.string.box);
                i27 = com.tencent.mm.R.raw.icons_outlined_nearby;
                int i382 = i27;
                i19 = i28;
                i17 = i382;
                break;
            case 5:
                string = getString(com.tencent.mm.R.string.jsn);
                string2 = getString(com.tencent.mm.R.string.f491044bp0);
                i27 = com.tencent.mm.R.raw.icons_outlined_shake;
                int i3822 = i27;
                i19 = i28;
                i17 = i3822;
                break;
            case 6:
                string = getString(com.tencent.mm.R.string.jso);
                string2 = getString(com.tencent.mm.R.string.f491045bp1);
                i18 = com.tencent.mm.R.raw.icons_outlined_shop;
                int i372 = i29;
                i27 = i18;
                i28 = i372;
                int i38222 = i27;
                i19 = i28;
                i17 = i38222;
                break;
            case 7:
                string = getString(com.tencent.mm.R.string.jsq);
                string2 = getString(com.tencent.mm.R.string.f491047bp3);
                i18 = com.tencent.mm.R.raw.icons_wecoin_entrance;
                i29 = com.tencent.mm.R.color.f478502m;
                int i3722 = i29;
                i27 = i18;
                i28 = i3722;
                int i382222 = i27;
                i19 = i28;
                i17 = i382222;
                break;
            case 8:
                if (((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai()) {
                    string = getString(com.tencent.mm.R.string.jsl);
                    string2 = getString(com.tencent.mm.R.string.boz);
                } else {
                    string = getString(com.tencent.mm.R.string.jsk);
                    string2 = getString(com.tencent.mm.R.string.boy);
                }
                i27 = com.tencent.mm.R.raw.icons_outlined_live_nearby;
                int i3822222 = i27;
                i19 = i28;
                i17 = i3822222;
                break;
            case 9:
                this.f172893d.setImageDrawable(i65.a.i(getContext(), com.tencent.mm.R.raw.icons_outlined_float_window_on));
                this.f172893d.setIconColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479428yz));
                this.f172895f.setText(com.tencent.mm.R.string.jsg);
                this.f172896g.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.bov));
                this.f172896g.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.bov));
                str = "";
                i17 = -1;
                i19 = -1;
                java.lang.String str32 = str;
                string2 = str2;
                string = str32;
                break;
            case 10:
                string = getString(com.tencent.mm.R.string.jse);
                string2 = getString(com.tencent.mm.R.string.jrm);
                i17 = com.tencent.mm.R.raw.icons_outlined_emoji;
                i19 = com.tencent.mm.R.color.f478526a7;
                break;
            case 11:
                string = getString(com.tencent.mm.R.string.jrt);
                string2 = getString(com.tencent.mm.R.string.jru);
                i17 = com.tencent.mm.R.raw.icons_outlined_add_friends;
                i19 = com.tencent.mm.R.color.f478526a7;
                break;
            case 12:
                string = getString(com.tencent.mm.R.string.jsz);
                string2 = getString(com.tencent.mm.R.string.f493339jt0);
                i17 = com.tencent.mm.R.raw.icons_outlined_colorful_moment;
                i19 = -1;
                break;
            case 13:
                string = getString(com.tencent.mm.R.string.jsf);
                string2 = getString(com.tencent.mm.R.string.f493336js2);
                i17 = com.tencent.mm.R.raw.icons_outlined_finder_icon;
                i19 = com.tencent.mm.R.color.f478526a7;
                break;
            case 14:
                string = getString(com.tencent.mm.R.string.m5_);
                string2 = getString(com.tencent.mm.R.string.f99);
                i18 = com.tencent.mm.R.raw.music_regular;
                i29 = com.tencent.mm.R.color.af8;
                int i37222 = i29;
                i27 = i18;
                i28 = i37222;
                int i38222222 = i27;
                i19 = i28;
                i17 = i38222222;
                break;
            case 15:
                string = getString(com.tencent.mm.R.string.pil);
                string2 = getString(com.tencent.mm.R.string.oak);
                i18 = com.tencent.mm.R.raw.weixin_store_regular;
                int i372222 = i29;
                i27 = i18;
                i28 = i372222;
                int i382222222 = i27;
                i19 = i28;
                i17 = i382222222;
                break;
            default:
                str = "";
                i17 = -1;
                i19 = -1;
                java.lang.String str322 = str;
                string2 = str2;
                string = str322;
                break;
        }
        if (i17 > 0 && this.f172893d.getVisibility() == 0) {
            this.f172893d.setImageDrawable(i65.a.i(getContext(), i17));
            if (i19 != -1) {
                this.f172893d.setIconColor(i65.a.d(getContext(), i19));
            } else {
                this.f172893d.setEnableColorFilter(false);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f172895f.setText(string);
            this.f172895f.setContentDescription(string);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            this.f172896g.setText(string2);
            this.f172896g.setContentDescription(string2);
        }
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.q5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }
}
