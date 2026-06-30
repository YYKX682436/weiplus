package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class ECardInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.ECardInfo> CREATOR = new at4.u();

    /* renamed from: d, reason: collision with root package name */
    public int f179629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179630e;

    /* renamed from: f, reason: collision with root package name */
    public int f179631f;

    /* renamed from: g, reason: collision with root package name */
    public int f179632g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f179633h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179634i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f179635m;

    /* renamed from: n, reason: collision with root package name */
    public int f179636n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179637o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f179638p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f179639q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f179640r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f179641s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179642t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179643u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179644v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f179645w;

    public ECardInfo() {
    }

    public static com.tencent.mm.plugin.wallet_core.model.ECardInfo a() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        arrayList.add(optJSONArray.optString(i17));
                    }
                }
                if (!jSONObject.has("ecard_info")) {
                    return null;
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("ecard_info");
                com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo = new com.tencent.mm.plugin.wallet_core.model.ECardInfo();
                eCardInfo.f179644v = jSONObject.optString("guide_flag");
                eCardInfo.f179638p = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                eCardInfo.f179645w = jSONObject.optString("subtitle");
                eCardInfo.f179639q = new java.util.ArrayList(arrayList);
                eCardInfo.f179641s = jSONObject.optString("protocol_url");
                eCardInfo.f179642t = jSONObject.optString("left_protocol_wording");
                eCardInfo.f179643u = jSONObject.optString("right_protocol_wording");
                eCardInfo.f179640r = jSONObject.optString("done_button_wording");
                eCardInfo.f179629d = optJSONObject.optInt("ecard_open_scene", 0);
                eCardInfo.f179630e = optJSONObject.optString("ecard_type", "");
                eCardInfo.f179631f = optJSONObject.optInt("show_check_box", 0);
                eCardInfo.f179632g = optJSONObject.optInt("check_box_selected", 0);
                eCardInfo.f179633h = optJSONObject.optString("check_box_left_wording", "");
                eCardInfo.f179634i = optJSONObject.optString("check_box_right_wording", "");
                eCardInfo.f179635m = optJSONObject.optString("check_box_url", "");
                eCardInfo.f179636n = optJSONObject.optInt("is_upload_credid", 0);
                eCardInfo.f179637o = optJSONObject.optString("upload_credit_url", "");
                return eCardInfo;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ECardInfo", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static void b(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, jSONObject.toString());
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, "");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f179629d);
        parcel.writeString(this.f179630e);
        parcel.writeInt(this.f179631f);
        parcel.writeInt(this.f179632g);
        parcel.writeString(this.f179633h);
        parcel.writeString(this.f179634i);
        parcel.writeString(this.f179635m);
        parcel.writeInt(this.f179636n);
        parcel.writeString(this.f179638p);
        parcel.writeStringList(this.f179639q);
        parcel.writeString(this.f179640r);
        parcel.writeString(this.f179641s);
        parcel.writeString(this.f179642t);
        parcel.writeString(this.f179643u);
        parcel.writeString(this.f179644v);
        parcel.writeString(this.f179645w);
    }

    public ECardInfo(android.os.Parcel parcel) {
        this.f179629d = parcel.readInt();
        this.f179630e = parcel.readString();
        this.f179631f = parcel.readInt();
        this.f179632g = parcel.readInt();
        this.f179633h = parcel.readString();
        this.f179634i = parcel.readString();
        this.f179635m = parcel.readString();
        this.f179636n = parcel.readInt();
        this.f179638p = parcel.readString();
        parcel.readStringList(this.f179639q);
        this.f179640r = parcel.readString();
        this.f179641s = parcel.readString();
        this.f179642t = parcel.readString();
        this.f179643u = parcel.readString();
        this.f179644v = parcel.readString();
        this.f179645w = parcel.readString();
    }
}
