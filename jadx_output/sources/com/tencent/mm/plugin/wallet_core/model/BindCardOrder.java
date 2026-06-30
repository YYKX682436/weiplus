package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class BindCardOrder implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.BindCardOrder> CREATOR = new at4.m();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179611e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179612f;

    /* renamed from: g, reason: collision with root package name */
    public int f179613g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179614h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179615i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179616m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179617n;

    /* renamed from: o, reason: collision with root package name */
    public int f179618o;

    /* renamed from: p, reason: collision with root package name */
    public int f179619p;

    /* renamed from: q, reason: collision with root package name */
    public at4.u0 f179620q;

    /* renamed from: r, reason: collision with root package name */
    public at4.s0 f179621r;

    /* renamed from: s, reason: collision with root package name */
    public at4.t0 f179622s;

    public BindCardOrder() {
        this.f179610d = "";
        this.f179611e = "";
        this.f179612f = "";
        this.f179615i = "";
        this.f179616m = "";
        this.f179617n = "";
    }

    public void a(org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject == null ? "" : jSONObject.toString();
        this.f179610d = jSONObject2;
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardOrder", "feed json %s", jSONObject2);
        try {
            jSONObject.optInt("show_bind_succ_page", 0);
            this.f179611e = jSONObject.optString("bind_succ_btn_wording", "");
            this.f179612f = jSONObject.optString("bind_succ_remind_wording", "");
            this.f179613g = jSONObject.optInt("jump_type", 0);
            this.f179617n = jSONObject.optString("bind_serial");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("activity_info");
            at4.u0 u0Var = new at4.u0();
            this.f179620q = u0Var;
            if (optJSONObject != null) {
                u0Var.a(optJSONObject);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("h5_info");
            if (optJSONObject2 != null) {
                at4.s0 s0Var = new at4.s0();
                this.f179621r = s0Var;
                s0Var.a(optJSONObject2);
            }
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("native_info");
            if (optJSONObject3 != null) {
                at4.s0 s0Var2 = new at4.s0();
                this.f179621r = s0Var2;
                s0Var2.a(optJSONObject3);
            }
            org.json.JSONObject optJSONObject4 = jSONObject.optJSONObject("tinyapp_info");
            if (optJSONObject4 != null) {
                at4.t0 t0Var = new at4.t0();
                this.f179622s = t0Var;
                t0Var.a(optJSONObject4);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BindCardOrder", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f179610d);
    }

    public BindCardOrder(android.os.Parcel parcel) {
        this.f179610d = "";
        this.f179611e = "";
        this.f179612f = "";
        this.f179615i = "";
        this.f179616m = "";
        this.f179617n = "";
        this.f179610d = parcel.readString();
        try {
            a(new org.json.JSONObject(this.f179610d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BindCardOrder", e17, "", new java.lang.Object[0]);
        }
    }
}
