package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213958a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213959b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f213960c;

    /* renamed from: d, reason: collision with root package name */
    public final int f213961d;

    public o1(org.json.JSONObject jSONObject) {
        this.f213958a = "";
        this.f213959b = "";
        this.f213960c = "";
        this.f213961d = 0;
        jSONObject.optString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID);
        this.f213958a = jSONObject.optString("device_name");
        this.f213959b = jSONObject.optString("device_os");
        this.f213961d = jSONObject.optInt("Is_cur_device");
        this.f213960c = jSONObject.optString("crt_no");
        com.tencent.mm.wallet_core.model.i iVar = com.tencent.mm.wallet_core.model.i.values()[jSONObject.optInt("cert_encrypt_type")];
    }
}
