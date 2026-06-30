package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class ProductPurchaseAreaUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f159303d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f159304e;

    /* renamed from: f, reason: collision with root package name */
    public int f159305f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f159306g;

    public final void V6(android.content.Context context, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsapi_args_appid", com.tencent.mm.plugin.scanner.model.k0.a(i17));
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("pay_channel", 3);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494912be;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.h0(this));
        this.f159303d = getPreferenceScreen();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b17 == null || b17.f246032a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
            return;
        }
        this.f159306g = b17.field_productid;
        this.f159305f = b17.field_functionType;
        java.lang.String stringExtra = getIntent().getStringExtra("referkey");
        com.tencent.mars.xlog.Log.i("MicroMsg.ProductPurchaseAreaUI", "referkey:" + stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        for (int i17 = 0; i17 < b17.f246032a.size(); i17++) {
            if (stringExtra.equals(((com.tencent.mm.plugin.scanner.model.b) b17.f246032a.get(i17)).f158814d)) {
                this.f159304e = ((com.tencent.mm.plugin.scanner.model.b) b17.f246032a.get(i17)).f158816f;
                setMMTitle(((com.tencent.mm.plugin.scanner.model.b) b17.f246032a.get(i17)).f158812b);
                if (this.f159304e == null) {
                    return;
                }
                for (int i18 = 0; i18 < this.f159304e.size(); i18++) {
                    com.tencent.mm.plugin.scanner.model.a aVar = (com.tencent.mm.plugin.scanner.model.a) this.f159304e.get(i18);
                    java.lang.String str = "" + i18;
                    if (aVar != null) {
                        com.tencent.mm.plugin.scanner.ui.b bVar = new com.tencent.mm.plugin.scanner.ui.b(this);
                        bVar.C(str);
                        bVar.L(aVar.f158782b);
                        bVar.H(aVar.f158783c);
                        bVar.Q = aVar.f158787g;
                        ((com.tencent.mm.ui.base.preference.h0) this.f159303d).d(bVar, -1);
                        if (i18 != this.f159304e.size() - 1) {
                            ((com.tencent.mm.ui.base.preference.h0) this.f159303d).d(new com.tencent.mm.plugin.scanner.ui.t(getContext()), -1);
                        }
                    }
                }
                ((com.tencent.mm.ui.base.preference.h0) this.f159303d).notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        com.tencent.mm.plugin.scanner.model.a aVar;
        java.lang.String str;
        java.lang.String str2;
        if (this.f159304e == null) {
            return false;
        }
        try {
            int intValue = java.lang.Integer.valueOf(preference.f197780q).intValue();
            if (intValue < 0 || intValue >= ((java.util.LinkedList) this.f159304e).size() || (aVar = (com.tencent.mm.plugin.scanner.model.a) ((java.util.LinkedList) this.f159304e).get(intValue)) == null) {
                return false;
            }
            int i17 = aVar.f158781a;
            if (i17 != 1) {
                str = null;
                if (i17 == 9) {
                    java.lang.String str3 = aVar.f158795o;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_product_id", aVar.f158795o);
                        intent.putExtra("key_product_scene", 12);
                        j45.l.j(this, "product", ".ui.MallProductUI", intent, null);
                    }
                    str2 = str3;
                    gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(this.f159306g, aVar.f158794n, aVar.f158781a, str2, ((java.util.LinkedList) this.f159304e).size(), 11294, aVar.f158788h, null));
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ProductPurchaseAreaUI", "Default go url:" + aVar.f158784d);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f158784d)) {
                    V6(getContext(), aVar.f158784d, this.f159305f);
                }
            } else {
                str = aVar.f158784d;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
                } else {
                    V6(getContext(), aVar.f158784d, this.f159305f);
                }
            }
            str2 = str;
            gm0.j1.d().g(new com.tencent.mm.plugin.scanner.model.h0(this.f159306g, aVar.f158794n, aVar.f158781a, str2, ((java.util.LinkedList) this.f159304e).size(), 11294, aVar.f158788h, null));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProductPurchaseAreaUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
