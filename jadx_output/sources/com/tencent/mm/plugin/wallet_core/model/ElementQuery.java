package com.tencent.mm.plugin.wallet_core.model;

/* loaded from: classes9.dex */
public class ElementQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wallet_core.model.ElementQuery> CREATOR = new at4.v();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f179646J;
    public java.lang.String K;
    public java.util.List L;
    public boolean M;
    public java.lang.String N;
    public int P;
    public java.util.ArrayList Q;
    public boolean R;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179647d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f179648e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179649f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f179650g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f179651h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f179652i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179653m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179654n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f179655o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f179656p;

    /* renamed from: q, reason: collision with root package name */
    public int f179657q;

    /* renamed from: r, reason: collision with root package name */
    public int f179658r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f179659s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f179660t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f179661u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f179662v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f179663w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f179664x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f179665y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f179666z;

    public ElementQuery() {
        this.L = null;
        this.R = false;
    }

    public java.util.List a() {
        java.util.List list = this.L;
        if (list != null) {
            return list;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f179646J)) {
            return null;
        }
        this.L = new java.util.ArrayList();
        for (java.lang.String str : this.f179646J.split("\\|")) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
            if (P > 0) {
                this.L.add(java.lang.Integer.valueOf(P));
            }
        }
        return this.L;
    }

    public boolean b() {
        return 1 == this.f179658r;
    }

    public boolean c() {
        java.lang.String str = this.f179661u;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return "0".equals(str.trim());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(org.json.JSONObject jSONObject) {
        this.f179648e = jSONObject.optString("bank_name");
        this.f179659s = jSONObject.optString("bank_type");
        this.f179660t = jSONObject.optString("bankacc_type_name");
        this.f179662v = jSONObject.optString("bank_phone");
        this.f179665y = jSONObject.optString("forbid_word");
        this.f179664x = jSONObject.optString("bank_recommend_desc");
        this.f179663w = jSONObject.optString("bank_app_user_name");
        this.f179658r = jSONObject.optInt("bankacc_type", 1);
        this.f179650g = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "canModifyName");
        this.f179651h = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "canModifyCreID");
        this.f179656p = "0".equals(jSONObject.optString("is_sure"));
        this.f179652i = "1".equals(jSONObject.optString("needCVV"));
        this.f179653m = "1".equals(jSONObject.optString("needValiDate"));
        this.f179649f = jSONObject.optString("time_stamp");
        this.f179655o = jSONObject.optString("uesr_name");
        this.f179661u = jSONObject.optString("bank_flag");
        this.f179666z = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needFirstName");
        this.A = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needLastName");
        this.B = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needCountry");
        this.C = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needArea");
        this.D = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needCity");
        this.E = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needAddress");
        this.F = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needZip");
        this.G = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needPhone");
        this.H = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needEmail");
        this.M = com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "needShowProtocol");
        this.f179646J = jSONObject.optString("support_cre_type");
        this.f179654n = jSONObject.optString("cre_id");
        int optInt = jSONObject.optInt("bank_card_tag", 1);
        this.I = optInt;
        if (optInt == 1) {
            if (!com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "IsSaveYfq")) {
                this.f179657q = 0;
            } else if (com.tencent.mm.wallet_core.ui.r1.k0(jSONObject, "canReturnYfq")) {
                this.f179657q = 4;
            } else {
                this.f179657q = 3;
            }
        } else if (jSONObject.optInt("auth_mode") == 1) {
            this.f179657q = 1;
        } else {
            this.f179657q = 2;
        }
        java.lang.String optString = jSONObject.optString("support_micropay");
        if (android.text.TextUtils.isEmpty(optString)) {
            this.R = true;
        } else if ("1".equals(optString)) {
            this.R = true;
        } else if ("0".equals(optString)) {
            this.R = false;
        }
        this.K = jSONObject.optString("arrive_type");
        this.N = jSONObject.optString("pre_auth_word");
        this.P = jSONObject.optInt("support_foreign_mobile", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("cre_rule_array");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                com.tencent.mm.plugin.wallet_core.model.CreExtInfo creExtInfo = null;
                if (optJSONObject != null) {
                    com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo creTypeRuleInfo = new com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo();
                    creTypeRuleInfo.f179627d = optJSONObject.optInt("support_cre_type", 0);
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("cre_need_info");
                    if (optJSONObject2 != null) {
                        creExtInfo = new com.tencent.mm.plugin.wallet_core.model.CreExtInfo();
                        creExtInfo.f179623d = optJSONObject2.optInt("need_creid_renewal", 0);
                        creExtInfo.f179624e = optJSONObject2.optInt("need_birth_date", 0);
                        creExtInfo.f179625f = optJSONObject2.optInt("need_cre_expire_date", 0);
                        creExtInfo.f179626g = optJSONObject2.optInt("need_show_cre_type", 0);
                    }
                    creTypeRuleInfo.f179628e = creExtInfo;
                    creExtInfo = creTypeRuleInfo;
                }
                if (creExtInfo != null) {
                    arrayList.add(creExtInfo);
                }
            }
        }
        this.Q = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f179647d;
        parcel.writeString(str == null ? "" : str);
        java.lang.String str2 = this.f179648e;
        if (str2 == null) {
            str2 = "";
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f179649f;
        if (str3 == null) {
            str3 = "";
        }
        parcel.writeString(str3);
        parcel.writeInt(this.f179650g ? 1 : 0);
        parcel.writeInt(this.f179651h ? 1 : 0);
        parcel.writeInt(this.f179652i ? 1 : 0);
        parcel.writeInt(this.f179653m ? 1 : 0);
        java.lang.String str4 = this.f179655o;
        if (str4 == null) {
            str4 = "";
        }
        parcel.writeString(str4);
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.f179656p ? 1 : 0);
        parcel.writeInt(this.f179657q);
        parcel.writeInt(this.f179658r);
        java.lang.String str5 = this.f179659s;
        if (str5 == null) {
            str5 = "";
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f179660t;
        if (str6 == null) {
            str6 = "";
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f179661u;
        if (str7 == null) {
            str7 = "";
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f179662v;
        if (str8 == null) {
            str8 = "";
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f179665y;
        if (str9 == null) {
            str9 = "";
        }
        parcel.writeString(str9);
        java.lang.String str10 = this.f179664x;
        if (str10 == null) {
            str10 = "";
        }
        parcel.writeString(str10);
        java.lang.String str11 = this.f179663w;
        parcel.writeString(str11 != null ? str11 : "");
        parcel.writeInt(this.f179666z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I);
        parcel.writeString(this.f179646J);
        parcel.writeInt(this.R ? 1 : 0);
        parcel.writeString(this.K);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeString(this.N);
        parcel.writeInt(this.P);
        parcel.writeList(this.Q);
    }

    public ElementQuery(android.os.Parcel parcel) {
        this.L = null;
        this.R = false;
        this.f179647d = parcel.readString();
        this.f179648e = parcel.readString();
        this.f179649f = parcel.readString();
        this.f179650g = 1 == parcel.readInt();
        this.f179651h = 1 == parcel.readInt();
        this.f179652i = 1 == parcel.readInt();
        this.f179653m = 1 == parcel.readInt();
        this.f179655o = parcel.readString();
        this.f179647d = parcel.readString();
        this.f179656p = 1 == parcel.readInt();
        this.f179657q = parcel.readInt();
        this.f179658r = parcel.readInt();
        this.f179659s = parcel.readString();
        this.f179660t = parcel.readString();
        this.f179661u = parcel.readString();
        this.f179662v = parcel.readString();
        this.f179665y = parcel.readString();
        this.f179664x = parcel.readString();
        this.f179663w = parcel.readString();
        this.f179666z = 1 == parcel.readInt();
        this.A = 1 == parcel.readInt();
        this.B = 1 == parcel.readInt();
        this.C = 1 == parcel.readInt();
        this.D = 1 == parcel.readInt();
        this.E = 1 == parcel.readInt();
        this.G = 1 == parcel.readInt();
        this.F = 1 == parcel.readInt();
        this.H = 1 == parcel.readInt();
        this.I = parcel.readInt();
        this.f179646J = parcel.readString();
        this.R = 1 == parcel.readInt();
        this.K = parcel.readString();
        this.M = 1 == parcel.readInt();
        this.N = parcel.readString();
        this.P = parcel.readInt();
        this.Q = parcel.readArrayList(com.tencent.mm.plugin.wallet_core.model.CreTypeRuleInfo.class.getClassLoader());
    }
}
