package qk;

/* loaded from: classes9.dex */
public class o extends dm.h1 implements rv.t2 {

    /* renamed from: p1, reason: collision with root package name */
    public java.util.List f364300p1;

    /* renamed from: x1, reason: collision with root package name */
    public qk.n f364301x1;

    /* renamed from: y1, reason: collision with root package name */
    public static final l75.e0 f364298y1 = dm.h1.initAutoDBInfo(qk.o.class);

    /* renamed from: z1, reason: collision with root package name */
    public static int f364299z1 = 0;
    public static qk.n A1 = null;

    public qk.n A0() {
        return D0(false);
    }

    public qk.n D0(boolean z17) {
        if (this.f364301x1 == null || z17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_extInfo) || f364299z1 != this.field_extInfo.hashCode()) {
                if (com.tencent.mm.storage.z3.M4(this.field_username)) {
                    com.tencent.mm.sdk.platformtools.x9.a();
                }
                qk.n a17 = qk.n.a(this.field_extInfo);
                this.f364301x1 = a17;
                A1 = a17;
                java.lang.String str = this.field_extInfo;
                if (str == null) {
                    str = "";
                }
                f364299z1 = str.hashCode();
            } else {
                this.f364301x1 = A1;
            }
        }
        return this.f364301x1;
    }

    public boolean F0() {
        qk.g d17;
        A0();
        qk.n nVar = this.f364301x1;
        if (nVar == null || (d17 = nVar.d()) == null) {
            return false;
        }
        boolean z17 = d17.f364117b == 1;
        if (z17) {
            int i17 = this.field_bitFlag;
            if (!((1 & i17) != 0)) {
                this.field_bitFlag = 1 | i17;
                ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(this);
            }
        }
        return z17;
    }

    public boolean G0() {
        A0();
        return this.field_type == 3;
    }

    public boolean I0() {
        A0();
        return this.field_type == 2;
    }

    public boolean J0() {
        A0();
        int i17 = this.field_type;
        return i17 == 2 || i17 == 3;
    }

    public boolean L0() {
        A0();
        qk.n nVar = this.f364301x1;
        if (nVar == null || nVar.d() == null) {
            return false;
        }
        boolean z17 = this.f364301x1.f364266k.f364117b == 2;
        if (z17) {
            int i17 = this.field_bitFlag;
            if (!((2 & i17) != 0)) {
                this.field_bitFlag = 2 | i17;
                ((c01.p0) ((qk.q6) i95.n0.c(qk.q6.class))).wi(this);
            }
        }
        return z17;
    }

    public boolean P0() {
        A0();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "is report location, user %s %B", this.field_username, java.lang.Boolean.valueOf(this.f364301x1.o()));
        return this.f364301x1.o();
    }

    public boolean Q0() {
        A0();
        return this.field_type == 1;
    }

    public boolean R0() {
        A0();
        qk.n nVar = this.f364301x1;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo() null");
            return true;
        }
        if (nVar.i() != null) {
            return !this.f364301x1.i().f364247c;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo().getRegisterSource() null");
        return true;
    }

    public boolean T0() {
        A0();
        return this.field_type == 0;
    }

    public boolean U0() {
        if (java.lang.System.currentTimeMillis() - this.field_updateTime > 86400000) {
            return true;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return this.field_updateTime < calendar.getTimeInMillis();
    }

    public boolean W0() {
        return (this.field_brandFlag & 1) == 0;
    }

    @Override // dm.h1, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
    }

    @Override // dm.h1, l75.f0
    public android.content.ContentValues convertTo() {
        return super.convertTo();
    }

    @Override // dm.h1, l75.f0
    public l75.e0 getDBInfo() {
        return f364298y1;
    }

    public void t0() {
        A0();
        qk.n nVar = this.f364301x1;
        org.json.JSONObject jSONObject = nVar.f364256a;
        if (jSONObject != null) {
            nVar.f364269n = jSONObject.optInt("ConnectorMsgType");
        }
        this.field_acceptType = nVar.f364269n;
        this.field_type = D0(false).j();
        if (F0()) {
            this.field_bitFlag |= 1;
        } else {
            this.field_bitFlag &= -2;
        }
    }

    public boolean u0() {
        return (this.field_brandFlag & 4) != 0;
    }

    public java.util.List v0() {
        java.util.List list = this.f364300p1;
        if (list != null) {
            return list;
        }
        this.f364300p1 = new java.util.LinkedList();
        java.lang.String str = this.field_brandInfo;
        if (str == null || str.length() == 0) {
            return this.f364300p1;
        }
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(this.field_brandInfo).optJSONArray("urls");
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                qk.d dVar = new qk.d();
                org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                dVar.f364061a = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                dVar.f364063c = optJSONObject.optString("url");
                dVar.f364062b = optJSONObject.optString("title_key");
                dVar.f364064d = optJSONObject.optString("description");
                this.f364300p1.add(dVar);
            }
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        return this.f364300p1;
    }

    public long w0() {
        qk.g d17;
        A0();
        qk.n nVar = this.f364301x1;
        if (nVar != null && (d17 = nVar.d()) != null) {
            long j17 = d17.f364120e;
            if (j17 != 0) {
                return j17;
            }
        }
        return 0L;
    }

    public java.lang.String y0() {
        java.lang.String str;
        try {
            str = D0(false).d().f364116a;
        } catch (java.lang.NullPointerException unused) {
            str = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizInfo", "check father: %s, %s", this.field_username, str);
        }
        return str;
    }

    public java.lang.String z0() {
        qk.g d17;
        java.lang.String str;
        A0();
        qk.n nVar = this.f364301x1;
        if (nVar == null || (d17 = nVar.d()) == null || (str = d17.f364118c) == null || str.isEmpty()) {
            return null;
        }
        return d17.f364118c;
    }
}
