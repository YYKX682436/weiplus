package com.tencent.mm.plugin.order.model;

/* loaded from: classes9.dex */
public class MallTransactionObject implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.order.model.MallTransactionObject> CREATOR = new dp3.i();
    public java.lang.String A;
    public int A1;
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public double f152780J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public int R;
    public double S;
    public java.lang.String T;
    public int U;
    public java.lang.String V;
    public int W;
    public int X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: d, reason: collision with root package name */
    public int f152781d;

    /* renamed from: e, reason: collision with root package name */
    public int f152782e;

    /* renamed from: f, reason: collision with root package name */
    public int f152783f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f152784g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152785h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f152786i;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f152787l1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f152788m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f152789n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f152790o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f152791p;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f152792p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f152793p1;

    /* renamed from: q, reason: collision with root package name */
    public double f152794q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f152795r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f152796s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f152797t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f152798u;

    /* renamed from: v, reason: collision with root package name */
    public int f152799v;

    /* renamed from: w, reason: collision with root package name */
    public int f152800w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f152801x;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f152802x0;

    /* renamed from: x1, reason: collision with root package name */
    public double f152803x1;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f152804y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f152805y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f152806y1;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f152807z;

    /* renamed from: z1, reason: collision with root package name */
    public java.util.List f152808z1;

    public MallTransactionObject() {
        this.f152794q = 0.0d;
        this.f152808z1 = new java.util.LinkedList();
        this.A1 = -1;
    }

    public static com.tencent.mm.plugin.order.model.MallTransactionObject a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        com.tencent.mm.plugin.order.model.MallTransactionObject mallTransactionObject = new com.tencent.mm.plugin.order.model.MallTransactionObject();
        jSONObject.optInt("rec_type", 1);
        mallTransactionObject.f152781d = jSONObject.optInt("sub_pay_type", 0);
        mallTransactionObject.f152782e = jSONObject.optInt("pay_scene");
        mallTransactionObject.f152783f = jSONObject.optInt("user_type");
        mallTransactionObject.f152784g = jSONObject.optString("buy_uin");
        mallTransactionObject.f152785h = jSONObject.optString("buy_name");
        mallTransactionObject.f152786i = jSONObject.optString("sale_uin");
        mallTransactionObject.f152788m = jSONObject.optString("sale_name");
        mallTransactionObject.f152801x = jSONObject.optString("trans_id");
        mallTransactionObject.f152804y = jSONObject.optString("sp_billno");
        mallTransactionObject.f152789n = jSONObject.optString("goods_name");
        mallTransactionObject.f152790o = jSONObject.optString("goods_detail");
        mallTransactionObject.f152794q = jSONObject.optDouble("fee") / 100.0d;
        mallTransactionObject.f152795r = jSONObject.optString("fee_color");
        mallTransactionObject.f152796s = jSONObject.optString("trade_state");
        mallTransactionObject.f152797t = jSONObject.optString("trade_state_name");
        mallTransactionObject.f152798u = jSONObject.optString("trade_state_color");
        mallTransactionObject.f152807z = jSONObject.optString("buy_bank_name");
        mallTransactionObject.A = jSONObject.optString("card_tail");
        mallTransactionObject.f152799v = jSONObject.optInt("create_timestamp");
        mallTransactionObject.f152800w = jSONObject.optInt("modify_timestamp");
        mallTransactionObject.B = jSONObject.optString("fee_type");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("appinfo");
        if (optJSONObject != null) {
            mallTransactionObject.C = optJSONObject.optString("app_username");
            mallTransactionObject.D = optJSONObject.optString("app_telephone");
            mallTransactionObject.E = optJSONObject.optString("app_nickname");
            mallTransactionObject.F = optJSONObject.optString("app_icon_url");
            mallTransactionObject.N = optJSONObject.optString("safeguard_url");
            mallTransactionObject.P = optJSONObject.optString("display_name");
        }
        mallTransactionObject.G = jSONObject.optString("deliver_price");
        mallTransactionObject.H = jSONObject.optString("preferential_price");
        mallTransactionObject.I = jSONObject.optString("discount");
        mallTransactionObject.f152780J = jSONObject.optDouble("original_total_fee") / 100.0d;
        mallTransactionObject.K = jSONObject.optString("total_price");
        mallTransactionObject.L = jSONObject.optString("receipt_company");
        mallTransactionObject.M = jSONObject.optString("biz_pledge");
        mallTransactionObject.Q = jSONObject.optInt("pre_fetch_timestamp");
        mallTransactionObject.R = jSONObject.optInt("arrived_timestamp");
        mallTransactionObject.S = jSONObject.optDouble("transfer_fee") / 100.0d;
        mallTransactionObject.T = jSONObject.optString("receiver_name");
        mallTransactionObject.U = jSONObject.optInt("allow_resend_msg");
        mallTransactionObject.V = jSONObject.optString("charge_fee");
        mallTransactionObject.W = jSONObject.optInt("receive_timestamp");
        mallTransactionObject.X = jSONObject.optInt("refund_timestamp");
        mallTransactionObject.Y = jSONObject.optInt("create_timestamp");
        mallTransactionObject.Z = jSONObject.optString("buy_bank_type");
        mallTransactionObject.f152792p0 = jSONObject.optString("payer_name");
        mallTransactionObject.f152802x0 = jSONObject.optString("true_name");
        mallTransactionObject.f152805y0 = jSONObject.optString("refund_bank_type");
        mallTransactionObject.f152787l1 = jSONObject.optString("rateinfo");
        mallTransactionObject.f152793p1 = jSONObject.optString("original_feeinfo");
        mallTransactionObject.f152803x1 = jSONObject.optDouble("fetch_total_fee") / 100.0d;
        mallTransactionObject.f152806y1 = jSONObject.optString("fetch_total_fee_color");
        mallTransactionObject.A1 = jSONObject.optInt("userroll_type");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("help_center");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter mallOrderDetailObject$HelpCenter = new com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter();
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                mallOrderDetailObject$HelpCenter.f152779f = jSONObject2.optBoolean("is_show_button");
                mallOrderDetailObject$HelpCenter.f152777d = jSONObject2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                mallOrderDetailObject$HelpCenter.f152778e = jSONObject2.optString("url");
                linkedList.add(mallOrderDetailObject$HelpCenter);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallTransactionObject", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.e("MicroMsg.MallTransactionObject", "parseHelpCenter error %s", e17.getMessage());
        }
        mallTransactionObject.f152808z1 = linkedList;
        return mallTransactionObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f152781d);
        parcel.writeInt(this.f152782e);
        parcel.writeInt(this.f152783f);
        parcel.writeString(this.f152784g);
        parcel.writeString(this.f152785h);
        parcel.writeString(this.f152786i);
        parcel.writeString(this.f152788m);
        parcel.writeString(this.f152789n);
        parcel.writeString(this.f152790o);
        parcel.writeString(this.f152791p);
        parcel.writeDouble(this.f152794q);
        parcel.writeString(this.f152795r);
        parcel.writeString(this.f152796s);
        parcel.writeString(this.f152797t);
        parcel.writeString(this.f152798u);
        parcel.writeInt(this.f152799v);
        parcel.writeInt(this.f152800w);
        parcel.writeString(this.f152801x);
        parcel.writeString(this.f152804y);
        parcel.writeString(this.f152807z);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeDouble(this.f152780J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.W);
        parcel.writeDouble(this.S);
        parcel.writeString(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f152792p0);
        parcel.writeString(this.f152802x0);
        parcel.writeString(this.f152805y0);
        parcel.writeString(this.f152787l1);
        parcel.writeString(this.f152793p1);
        parcel.writeDouble(this.f152803x1);
        parcel.writeString(this.f152806y1);
        parcel.writeString(this.P);
        parcel.writeInt(this.A1);
        parcel.writeInt(this.f152808z1.size());
        java.util.Iterator it = this.f152808z1.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter) it.next(), i17);
        }
    }

    public MallTransactionObject(android.os.Parcel parcel) {
        this.f152794q = 0.0d;
        this.f152808z1 = new java.util.LinkedList();
        this.A1 = -1;
        this.f152781d = parcel.readInt();
        this.f152782e = parcel.readInt();
        this.f152783f = parcel.readInt();
        this.f152784g = parcel.readString();
        this.f152785h = parcel.readString();
        this.f152786i = parcel.readString();
        this.f152788m = parcel.readString();
        this.f152789n = parcel.readString();
        this.f152790o = parcel.readString();
        this.f152791p = parcel.readString();
        this.f152794q = parcel.readDouble();
        this.f152795r = parcel.readString();
        this.f152796s = parcel.readString();
        this.f152797t = parcel.readString();
        this.f152798u = parcel.readString();
        this.f152799v = parcel.readInt();
        this.f152800w = parcel.readInt();
        this.f152801x = parcel.readString();
        this.f152804y = parcel.readString();
        this.f152807z = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.f152780J = parcel.readDouble();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.Q = parcel.readInt();
        this.W = parcel.readInt();
        this.S = parcel.readDouble();
        this.T = parcel.readString();
        this.U = parcel.readInt();
        this.V = parcel.readString();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readString();
        this.f152792p0 = parcel.readString();
        this.f152802x0 = parcel.readString();
        this.f152805y0 = parcel.readString();
        this.f152787l1 = parcel.readString();
        this.f152793p1 = parcel.readString();
        this.f152803x1 = parcel.readDouble();
        this.f152806y1 = parcel.readString();
        this.P = parcel.readString();
        this.A1 = parcel.readInt();
        int readInt = parcel.readInt();
        this.f152808z1 = new java.util.LinkedList();
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f152808z1.add((com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter) parcel.readParcelable(com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter.class.getClassLoader()));
        }
    }
}
