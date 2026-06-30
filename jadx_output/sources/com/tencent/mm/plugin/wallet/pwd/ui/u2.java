package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f179085a;

    /* renamed from: b, reason: collision with root package name */
    public int f179086b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f179087c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179089e;

    public static com.tencent.mm.plugin.wallet.pwd.ui.u2 a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet.pwd.ui.u2 u2Var = new com.tencent.mm.plugin.wallet.pwd.ui.u2();
        u2Var.f179085a = jSONObject.optString("button_wording");
        u2Var.f179086b = jSONObject.optInt("jump_type");
        u2Var.f179087c = jSONObject.optString("jump_h5_url");
        u2Var.f179088d = jSONObject.optString("tinyapp_name");
        u2Var.f179089e = jSONObject.optString("tinyapp_path");
        return u2Var;
    }
}
