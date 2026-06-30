package com.tencent.mm.plugin.w1wpersonalmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgBaseConvListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class W1wPersonalMsgBaseConvListUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment f177546e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f177548g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177549h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177550i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177551m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f177552n;

    /* renamed from: d, reason: collision with root package name */
    public final int f177545d = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f177547f = 1;

    public final com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment T6() {
        com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment w1wPersonalMsgBaseConvFragment = this.f177546e;
        if (w1wPersonalMsgBaseConvFragment != null) {
            return w1wPersonalMsgBaseConvFragment;
        }
        kotlin.jvm.internal.o.o("fragment");
        throw null;
    }

    public java.lang.String U6() {
        return "";
    }

    public com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment V6() {
        return new com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqk;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        ((ty.o0) i95.n0.c(ty.o0.class)).getClass();
        return kz5.o1.c(wn.v.class);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f177545d && i18 == -1 && intent != null) {
            if (!intent.getBooleanExtra("key_remind_changed", false)) {
                intent = null;
            }
            if (intent != null) {
                ((lr4.k) ((jz5.n) T6().f177544x).getValue()).notifyDataSetChanged();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.w1wpersonalmsg.ui.W1wPersonalMsgBaseConvFragment V6 = V6();
        android.os.Bundle bundle2 = new android.os.Bundle();
        int intExtra = getIntent().getIntExtra("KEY_CONV_TYPE", 1);
        this.f177547f = intExtra;
        bundle2.putInt("KEY_CONV_TYPE", intExtra);
        V6.setArguments(bundle2);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        beginTransaction.k(com.tencent.mm.R.id.gd9, V6, null);
        beginTransaction.f();
        this.f177546e = V6;
        this.f177549h = getIntent().getStringExtra("key_w1w_refer_scene");
        this.f177550i = getIntent().getStringExtra("key_w1w_refer_scene_note");
        this.f177551m = getIntent().getStringExtra("key_w1w_refer_session_id");
        this.f177552n = getIntent().getStringExtra("key_w1w_refer_ext_info");
        ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).getClass();
        java.lang.String c17 = mr4.a.c(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        kotlin.jvm.internal.o.f(c17, "generatePageId(...)");
        this.f177548g = c17;
        gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
        vu4.d dVar = vu4.d.f440295h;
        java.lang.String str = this.f177549h;
        java.lang.String str2 = this.f177550i;
        java.lang.String str3 = this.f177551m;
        java.lang.String str4 = this.f177552n;
        java.lang.String str5 = this.f177548g;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("currentPageId");
            throw null;
        }
        ((fr4.g0) fVar).cj(dVar, str, str2, str3, str4, str5, vu4.e.f440306e, "", "", "", this.f177547f == 1 ? vu4.g.f440323e : vu4.g.f440324f);
        T6().f177543w = new lr4.b(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f177548g != null) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_w1w_refer_scene");
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_w1w_refer_scene_note");
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_w1w_refer_session_id");
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_w1w_refer_ext_info");
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            vu4.d dVar = vu4.d.f440296i;
            java.lang.String str = this.f177548g;
            if (str != null) {
                ((fr4.g0) fVar).cj(dVar, stringExtra, stringExtra2, stringExtra3, stringExtra4, str, vu4.e.f440306e, "", "", "", this.f177547f == 1 ? vu4.g.f440323e : vu4.g.f440324f);
            } else {
                kotlin.jvm.internal.o.o("currentPageId");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        setMMTitle(U6());
        java.lang.String stringExtra = getIntent().getStringExtra("key_w1w_self_contact_data");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            try {
                ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).hj(new org.json.JSONObject(stringExtra));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("W1wPersonalMsgConvListUI", "Failed to parse contact data", e17);
            }
        }
        T6().K0(vu4.d.f440297m, "", "", "");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        T6().K0(vu4.d.f440298n, "", "", "");
    }
}
