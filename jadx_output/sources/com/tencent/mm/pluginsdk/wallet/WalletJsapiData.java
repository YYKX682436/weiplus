package com.tencent.mm.pluginsdk.wallet;

/* loaded from: classes.dex */
public class WalletJsapiData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.wallet.WalletJsapiData> CREATOR = new h45.z();
    public int A;
    public final java.lang.String B;
    public final int C;
    public final java.lang.String D;
    public final java.lang.String E;
    public java.lang.String F;
    public boolean G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f192128J;
    public int K;
    public int L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public long T;
    public final java.lang.String U;
    public java.util.Map V;
    public java.lang.String W;
    public android.support.v4.os.ResultReceiver X;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f192129d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f192131f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f192132g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f192133h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f192134i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f192135m;

    /* renamed from: n, reason: collision with root package name */
    public final int f192136n;

    /* renamed from: o, reason: collision with root package name */
    public final int f192137o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f192138p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f192139q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f192140r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f192141s;

    /* renamed from: t, reason: collision with root package name */
    public int f192142t;

    /* renamed from: u, reason: collision with root package name */
    public int f192143u;

    /* renamed from: v, reason: collision with root package name */
    public int f192144v;

    /* renamed from: w, reason: collision with root package name */
    public int f192145w;

    /* renamed from: x, reason: collision with root package name */
    public int f192146x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f192147y;

    /* renamed from: z, reason: collision with root package name */
    public int f192148z;

    public WalletJsapiData() {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
    }

    public static int a(int i17, int i18) {
        int i19 = (i17 == 1000 || i17 == 1018 || i17 == 1017 || i17 == 1033) ? 0 : i17 == 1019 ? 1 : i17 == 1010 ? 5 : (i17 == 1007 || i17 == 1008) ? 6 : i17 == 1009 ? 7 : (i17 == 1035 || i17 == 1020) ? 8 : (i17 == 1011 || i17 == 1047 || i17 == 1025) ? 12 : (i17 == 1012 || i17 == 1032 || i17 == 1048 || i17 == 1050) ? 13 : (i17 == 1005 || i17 == 1027 || i17 == 1042 || i17 == 1006) ? 15 : (i17 == 1024 || i17 == 1021) ? 16 : (i17 == 1029 || i17 == 1028) ? 23 : (i17 == 1013 || i17 == 1031 || i17 == 1049) ? 24 : (i17 == 1001 || i17 == 1003) ? 25 : (i17 == 1045 || i17 == 1046) ? 26 : i17 == 1022 ? 27 : i17 == 1023 ? 28 : i17 == 1026 ? 29 : i17 == 1039 ? 30 : (i17 == 1034 || i17 == 1060) ? 31 : (i17 == 1014 || i17 == 1043 || i17 == 1044 || i17 == 1036 || i17 == 1346) ? 32 : i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletJsapiData", "parsePayChannelByScene, scene: %s, rawScene: %s, resultChannel: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        return i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f192129d);
        parcel.writeString(this.f192130e);
        parcel.writeString(this.f192131f);
        parcel.writeString(this.f192132g);
        parcel.writeString(this.f192133h);
        parcel.writeString(this.f192134i);
        parcel.writeString(this.f192135m);
        parcel.writeInt(this.f192136n);
        parcel.writeInt(this.f192137o);
        parcel.writeString(this.f192138p);
        parcel.writeString(this.f192139q);
        parcel.writeString(this.f192140r);
        parcel.writeString(this.f192141s);
        parcel.writeInt(this.f192142t);
        parcel.writeInt(this.f192143u);
        parcel.writeInt(this.f192144v);
        parcel.writeInt(this.f192145w);
        parcel.writeInt(this.f192146x);
        parcel.writeString(this.f192147y);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.f192148z);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeString(this.W);
        java.util.Map map = this.V;
        if (map != null) {
            parcel.writeInt(map.size());
            for (java.util.Map.Entry entry : this.V.entrySet()) {
                parcel.writeString((java.lang.String) entry.getKey());
                parcel.writeString((java.lang.String) entry.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeInt(this.f192128J);
        if (this.X != null) {
            parcel.writeString("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD");
            this.X.writeToParcel(parcel, i17);
        } else {
            parcel.writeString(null);
        }
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        parcel.writeString(this.S);
        parcel.writeLong(this.T);
        parcel.writeString(this.U);
    }

    public WalletJsapiData(java.util.Map map) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f192129d = (java.lang.String) map.get("appId");
        this.f192130e = (java.lang.String) map.get("partnerId");
        this.f192131f = (java.lang.String) map.get("signType");
        this.f192132g = (java.lang.String) map.get("nonceStr");
        this.f192133h = (java.lang.String) map.get("timeStamp");
        this.f192134i = (java.lang.String) map.get("package");
        this.f192135m = (java.lang.String) map.get("reqKey");
        this.f192136n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("payScene"), 1);
        this.f192137o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("businessScene"), 1);
        this.f192138p = (java.lang.String) map.get("paySign");
        this.f192140r = (java.lang.String) map.get("url");
        this.f192141s = (java.lang.String) map.get("src_username");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        this.f192142t = P;
        if (P == 0) {
            this.f192142t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("pay_scene"), 0);
        }
        this.f192144v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("pay_channel"), 0);
        this.f192145w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("pay_code_scene"), 0);
        java.lang.String str = (java.lang.String) map.get("ext_info");
        this.f192147y = str == null ? "" : str;
        java.lang.String str2 = (java.lang.String) map.get("token");
        this.B = str2 == null ? "" : str2;
        java.lang.String str3 = (java.lang.String) map.get("result_jump_mode");
        this.C = com.tencent.mm.sdk.platformtools.t8.P(str3 == null ? "0" : str3, 0);
        java.lang.String str4 = (java.lang.String) map.get("key_appbrand_from_path");
        this.D = str4 == null ? "" : str4;
        java.lang.String str5 = (java.lang.String) map.get("key_appbrand_from_username");
        this.E = str5 == null ? "" : str5;
        java.lang.String str6 = (java.lang.String) map.get("key_appbrand_from_scene");
        this.F = str6 == null ? "" : str6;
        this.f192128J = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("key_chat_type"), 0);
        this.K = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("key_send_type"), 0);
        this.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get("key_qrcode_session_type"), 0);
        java.lang.String str7 = (java.lang.String) map.get("key_qrcode_session_name");
        this.M = str7 == null ? "" : str7;
        java.lang.String str8 = (java.lang.String) map.get("key_qrcode_timeline_objid");
        this.N = str8 == null ? "" : str8;
        java.lang.String str9 = (java.lang.String) map.get("is_select_payment");
        this.U = str9 != null ? str9 : "";
    }

    public WalletJsapiData(org.json.JSONObject jSONObject) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f192129d = jSONObject.optString("appId");
        this.f192130e = jSONObject.optString("partnerId");
        this.f192131f = jSONObject.optString("signType");
        this.f192132g = jSONObject.optString("nonceStr");
        this.f192133h = jSONObject.optString("timeStamp");
        this.f192134i = jSONObject.optString("package");
        this.f192135m = jSONObject.optString("reqKey");
        this.f192136n = jSONObject.optInt("payScene", 1);
        this.f192137o = jSONObject.optInt("businessScene", 1);
        this.f192138p = jSONObject.optString("paySign");
        this.f192139q = jSONObject.optString("cookie");
        this.f192140r = jSONObject.optString("url");
        this.f192141s = jSONObject.optString("src_username");
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f192142t = optInt;
        if (optInt == 0) {
            this.f192142t = jSONObject.optInt("pay_scene", 0);
        }
        this.f192144v = jSONObject.optInt("pay_channel", 0);
        this.f192145w = jSONObject.optInt("pay_code_scene", 0);
        this.f192147y = jSONObject.optString("ext_info", "");
        this.B = jSONObject.optString("token", "");
        this.C = com.tencent.mm.sdk.platformtools.t8.P(jSONObject.optString("result_jump_mode", "0"), 0);
        this.A = jSONObject.optInt("pay_for_wallet_type", 0);
        java.lang.String optString = jSONObject.optString("key_appbrand_from_path");
        this.D = optString == null ? "" : optString;
        java.lang.String optString2 = jSONObject.optString("key_appbrand_from_username");
        this.E = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject.optString("key_appbrand_from_scene");
        this.F = optString3 == null ? "" : optString3;
        this.G = jSONObject.optBoolean("key_joint_pay", false);
        this.f192128J = jSONObject.optInt("key_chat_type", 0);
        this.K = jSONObject.optInt("key_send_type", 0);
        this.L = jSONObject.optInt("key_qrcode_session_type", 0);
        this.M = jSONObject.optString("key_qrcode_session_name", "");
        this.N = jSONObject.optString("key_qrcode_timeline_objid", "");
        this.Q = jSONObject.optString("key_qrcode_msg_send_user", "");
        this.R = jSONObject.optString("key_qrcode_msg_svrid", "");
        this.S = jSONObject.optString("key_init_raw_url", "");
        this.T = jSONObject.optLong("key_init_timestamp", 0L);
        this.U = jSONObject.optString("is_select_payment");
    }

    public WalletJsapiData(android.os.Parcel parcel) {
        this.A = 0;
        this.C = 0;
        this.P = "";
        this.S = "";
        this.U = "";
        this.f192129d = parcel.readString();
        this.f192130e = parcel.readString();
        this.f192131f = parcel.readString();
        this.f192132g = parcel.readString();
        this.f192133h = parcel.readString();
        this.f192134i = parcel.readString();
        this.f192135m = parcel.readString();
        this.f192136n = parcel.readInt();
        this.f192137o = parcel.readInt();
        this.f192138p = parcel.readString();
        this.f192139q = parcel.readString();
        this.f192140r = parcel.readString();
        this.f192141s = parcel.readString();
        this.f192142t = parcel.readInt();
        this.f192143u = parcel.readInt();
        this.f192144v = parcel.readInt();
        this.f192145w = parcel.readInt();
        this.f192146x = parcel.readInt();
        this.f192147y = parcel.readString();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.f192148z = parcel.readInt();
        this.G = parcel.readInt() == 1;
        this.W = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.V = new java.util.HashMap();
            for (int i17 = 0; i17 < readInt; i17++) {
                this.V.put(parcel.readString(), parcel.readString());
            }
        }
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f192128J = parcel.readInt();
        if ("PAY_SUCCESS_AHEAD_CALLBACK_RESULT_RECEIVER_MAGIC_WORD".equals(parcel.readString())) {
            this.X = android.support.v4.os.ResultReceiver.CREATOR.createFromParcel(parcel);
        }
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = parcel.readString();
        this.T = parcel.readLong();
        this.U = parcel.readString();
    }
}
