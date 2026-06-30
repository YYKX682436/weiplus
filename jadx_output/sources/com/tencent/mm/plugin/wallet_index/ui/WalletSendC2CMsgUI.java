package com.tencent.mm.plugin.wallet_index.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class WalletSendC2CMsgUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f181121d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f181122e;

    public final boolean U6(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        if (this.f181122e == 1) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_receiver");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_sender_des");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_receiver_des");
            java.lang.String encode = java.net.URLEncoder.encode(getIntent().getStringExtra("key_url"));
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_templateid");
            java.lang.String stringExtra5 = getIntent().getStringExtra("key_sceneid");
            java.lang.String stringExtra6 = getIntent().getStringExtra("key_receivertitle");
            str7 = stringExtra3;
            str8 = encode;
            str9 = stringExtra5;
            str4 = getIntent().getStringExtra("key_sendertitle");
            str2 = stringExtra;
            str6 = stringExtra2;
            str5 = stringExtra4;
            str3 = stringExtra6;
        } else {
            java.util.Map V6 = V6();
            if (V6 == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str2 = str;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            } else {
                java.lang.String str10 = (java.lang.String) V6.get("receivertitle");
                if (str10 == null) {
                    str10 = "";
                }
                java.lang.String decode = java.net.URLDecoder.decode(str10);
                java.lang.String str11 = (java.lang.String) V6.get("sendertitle");
                if (str11 == null) {
                    str11 = "";
                }
                java.lang.String decode2 = java.net.URLDecoder.decode(str11);
                java.lang.String str12 = (java.lang.String) V6.get("senderdes");
                if (str12 == null) {
                    str12 = "";
                }
                java.lang.String decode3 = java.net.URLDecoder.decode(str12);
                java.lang.String str13 = (java.lang.String) V6.get("receiverdes");
                if (str13 == null) {
                    str13 = "";
                }
                java.lang.String decode4 = java.net.URLDecoder.decode(str13);
                java.lang.String str14 = (java.lang.String) V6.get("url");
                if (str14 == null) {
                    str14 = "";
                }
                java.lang.String str15 = (java.lang.String) V6.get("templateid");
                if (str15 == null) {
                    str15 = "";
                }
                java.lang.String decode5 = java.net.URLDecoder.decode(str15);
                java.lang.String str16 = (java.lang.String) V6.get("senceid");
                str2 = str;
                str9 = java.net.URLDecoder.decode(str16 != null ? str16 : "");
                str8 = str14;
                str4 = decode2;
                str6 = decode3;
                str7 = decode4;
                str3 = decode;
                str5 = decode5;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str8) && !com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            doSceneProgress(new nt4.o(str2, str3, str4, str5, str6, str7, str8, str9));
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletSendC2CMsgUI", "url = " + com.tencent.mm.sdk.platformtools.t8.K0(str8) + "templateId=" + com.tencent.mm.sdk.platformtools.t8.K0(str5));
        return false;
    }

    public final java.util.Map V6() {
        if (this.f181121d == null) {
            java.lang.String stringExtra = getIntent().getStringExtra("packageExt");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.lang.String[] split = stringExtra.split("&");
                this.f181121d = new java.util.HashMap();
                if (split != null && split.length > 0) {
                    for (int i17 = 0; i17 < split.length; i17++) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(split[i17])) {
                            java.lang.String[] split2 = split[i17].split("=");
                            if (split2.length == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(split2[0])) {
                                this.f181121d.put(split2[0], split2[1]);
                            }
                        }
                    }
                }
            }
        }
        return this.f181121d;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            intent.toString();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = " + i17);
        } else {
            if (i18 != -1 || intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
                setResult(0);
                finish();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (U6(stringExtra)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
            setResult(-1000);
            finish();
        }
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f181122e = getIntent().getIntExtra("key_scene", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.f181122e);
        if (this.f181122e != 0) {
            if (U6(null)) {
                return;
            }
            setResult(-1000);
            finish();
            return;
        }
        addSceneEndListener(580);
        if (getIntent() != null) {
            doSceneForceProgress(new ss4.d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6, "getSendC2CMessageRequest", getIntent().getIntExtra("pay_channel", 0)));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
        setResult(-1000);
        finish();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = false;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof ss4.d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
                h45.y.f278968a = ((ss4.d) m1Var).H();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
                java.util.Map V6 = V6();
                if (V6 != null && V6.containsKey("togroup") && "0".equals(V6.get("togroup"))) {
                    z17 = true;
                }
                android.content.Intent intent = new android.content.Intent();
                int i19 = z17 ? 7 : 3;
                intent.putExtra("select_is_ret", true);
                intent.putExtra("Select_Conv_Type", i19);
                j45.l.v(this, ".ui.transmit.SelectConversationUI", intent, 1);
                return true;
            }
            if (m1Var instanceof nt4.o) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
                if (this.f181122e == 1) {
                    db5.e1.T(this, getString(com.tencent.mm.R.string.kzm));
                } else {
                    db5.e1.T(this, getString(com.tencent.mm.R.string.fw6));
                    setResult(-1);
                }
                finish();
                return true;
            }
        } else {
            if (m1Var instanceof ss4.d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
                setResult(-1000);
                finish();
                return true;
            }
            if (m1Var instanceof nt4.o) {
                if (this.f181122e == 1) {
                    db5.e1.T(this, str);
                } else {
                    setResult(-1000);
                }
                finish();
                return true;
            }
            setResult(-1000);
            finish();
        }
        return false;
    }
}
