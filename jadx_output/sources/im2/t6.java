package im2;

/* loaded from: classes3.dex */
public final class t6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292554d;

    /* renamed from: e, reason: collision with root package name */
    public int f292555e;

    /* renamed from: f, reason: collision with root package name */
    public int f292556f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k30 f292557g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f292558h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f292559i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f292560m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f292561n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f292562o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f292563p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f292564q;

    /* renamed from: r, reason: collision with root package name */
    public int f292565r;

    /* renamed from: s, reason: collision with root package name */
    public int f292566s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f292567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292554d = "FinderLiveVisitorReportUIC@" + hashCode() + '}';
        this.f292559i = "";
        this.f292560m = "";
        this.f292561n = "";
        this.f292562o = "";
        this.f292565r = -1;
        this.f292566s = -1;
        this.f292567t = "";
    }

    public final java.lang.String O6(java.lang.String str) {
        if (str == null) {
            return "";
        }
        if (!(this.f292567t.length() > 0)) {
            return str;
        }
        try {
            org.json.JSONObject jSONObject = str.length() == 0 ? new org.json.JSONObject() : new org.json.JSONObject(r26.i0.t(str, ";", ",", false));
            jSONObject.put("session_type", this.f292565r);
            jSONObject.put("share_username", this.f292567t);
            jSONObject.put("is_enterprise", this.f292566s);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(this.f292554d, "append ChatFields err: " + e17.getMessage());
            return str;
        }
    }

    public final void P6(r45.gc1 request) {
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.o.g(request, "request");
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f328844m5) == null) {
            obj = this.f292558h;
        } else {
            byte[] bytes = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            obj = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        }
        request.set(22, obj);
        java.lang.String str2 = "[fillJoinLiveReq], request.ux_info = " + request.getByteString(22);
        java.lang.String str3 = this.f292554d;
        com.tencent.mars.xlog.Log.i(str3, str2);
        request.set(24, this.f292560m);
        request.set(28, this.f292561n);
        java.lang.Object l07 = zl2.r4.f473950a.l0("source_type");
        if (l07 == null) {
            l07 = "";
        }
        request.set(29, l07);
        com.tencent.mars.xlog.Log.i(str3, "[fillJoinLiveReq], func_msg_report_ext_info = " + request.getString(29));
        com.tencent.mm.protobuf.g gVar = this.f292563p;
        if (gVar != null) {
            request.set(34, gVar);
            com.tencent.mars.xlog.Log.i(str3, "[fillJoinLiveReq], open_live_h5_buffer size = " + gVar.f192156a.length);
        }
        this.f292560m = "";
        this.f292561n = "";
        this.f292563p = null;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        im2.n nVar = (im2.n) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.n.class);
        nVar.getClass();
        if (request.getLong(2) == nVar.f292449d) {
            r45.li4 li4Var = nVar.f292451f;
            if (li4Var != null) {
                r45.jr0 jr0Var = new r45.jr0();
                jr0Var.set(1, li4Var);
                request.set(26, jr0Var);
            }
            nVar.f292451f = null;
        }
    }

    public final void Q6(long j17, r45.kv0 kv0Var) {
        java.util.LinkedList list;
        if (this.f292559i != null && kv0Var != null && (list = kv0Var.getList(7)) != null) {
            r45.fl2 fl2Var = new r45.fl2();
            fl2Var.set(0, java.lang.Long.valueOf(j17));
            fl2Var.set(1, this.f292559i);
            com.tencent.mars.xlog.Log.i(this.f292554d, "fillObjectBaseInfoOnce id:" + pm0.v.u(fl2Var.getLong(0)) + ", jumperSessionBuffer:" + fl2Var.getString(1));
            list.add(fl2Var);
        }
        this.f292559i = null;
    }

    public final void R6(r45.o72 baseInfo) {
        r45.nw1 nw1Var;
        kotlin.jvm.internal.o.g(baseInfo, "baseInfo");
        baseInfo.set(11, java.lang.Integer.valueOf(this.f292555e));
        if (((r45.x24) baseInfo.getCustom(18)) == null) {
            baseInfo.set(18, new r45.x24());
        }
        r45.x24 x24Var = (r45.x24) baseInfo.getCustom(18);
        if (x24Var != null) {
            x24Var.set(0, java.lang.Integer.valueOf(this.f292556f));
        }
        r45.x24 x24Var2 = (r45.x24) baseInfo.getCustom(18);
        if (x24Var2 != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.v9 v9Var = (zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class);
            gk2.e eVar = gk2.e.f272471n;
            long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
            com.tencent.mm.plugin.finder.live.viewmodel.aa aaVar = (com.tencent.mm.plugin.finder.live.viewmodel.aa) v9Var;
            r45.md5 md5Var = aaVar.f116907e;
            x24Var2.set(1, md5Var != null && (md5Var.getLong(1) > j17 ? 1 : (md5Var.getLong(1) == j17 ? 0 : -1)) == 0 ? aaVar.f116906d : "");
        }
        r45.k30 k30Var = this.f292557g;
        if (k30Var != null) {
            baseInfo.set(16, k30Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillReportBaseInfo noticeType:");
        sb6.append(this.f292555e);
        sb6.append(", notificationMsgType:");
        sb6.append(this.f292556f);
        sb6.append(", last_g_msg_id:");
        r45.x24 x24Var3 = (r45.x24) baseInfo.getCustom(18);
        sb6.append(x24Var3 != null ? x24Var3.getString(1) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f292554d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("fillReportBaseInfo chnlExtraInfo:");
        r45.k30 k30Var2 = this.f292557g;
        sb8.append(pm0.v.u(k30Var2 != null ? k30Var2.getLong(0) : 0L));
        sb8.append(", ");
        r45.k30 k30Var3 = this.f292557g;
        sb8.append(k30Var3 != null ? java.lang.Integer.valueOf(k30Var3.getInteger(1)) : null);
        sb8.append(", sourceType:");
        r45.k30 k30Var4 = this.f292557g;
        sb8.append(k30Var4 != null ? k30Var4.getString(6) : null);
        com.tencent.mars.xlog.Log.i(str, sb8.toString());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.ta4 ta4Var;
        r45.ta4 ta4Var2;
        r45.ta4 ta4Var3;
        r45.ta4 ta4Var4;
        r45.ta4 ta4Var5;
        r45.ta4 ta4Var6;
        r45.ta4 ta4Var7;
        r45.ta4 ta4Var8;
        r45.ta4 ta4Var9;
        r45.ta4 ta4Var10;
        r45.ta4 ta4Var11;
        r45.ta4 ta4Var12;
        r45.nw1 nw1Var;
        gk2.e eVar = gk2.e.f272471n;
        boolean z17 = false;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        dk2.x4 a17 = dk2.x4.C.a(getIntent());
        java.lang.String str = null;
        if (a17 == null && j17 != 0) {
            dk2.ef efVar = dk2.ef.f233372a;
            km2.n nVar = dk2.ef.H;
            a17 = nVar != null ? nVar.f309155g : null;
        }
        this.f292555e = (a17 == null || (ta4Var12 = a17.B) == null) ? 0 : ta4Var12.getInteger(0);
        this.f292556f = (a17 == null || (ta4Var11 = a17.B) == null) ? 0 : ta4Var11.getInteger(12);
        this.f292557g = (a17 == null || (ta4Var10 = a17.B) == null) ? null : (r45.k30) ta4Var10.getCustom(13);
        this.f292558h = (a17 == null || (ta4Var9 = a17.B) == null) ? null : ta4Var9.getByteString(1);
        this.f292559i = (a17 == null || (ta4Var8 = a17.B) == null) ? null : ta4Var8.getString(2);
        r45.ta4 ta4Var13 = a17 != null ? a17.B : null;
        if (ta4Var13 != null) {
            ta4Var13.set(2, null);
        }
        this.f292560m = (a17 == null || (ta4Var7 = a17.B) == null) ? null : ta4Var7.getString(3);
        this.f292561n = (a17 == null || (ta4Var6 = a17.B) == null) ? null : ta4Var6.getString(15);
        r45.ta4 ta4Var14 = a17 != null ? a17.B : null;
        if (ta4Var14 != null) {
            ta4Var14.set(3, null);
        }
        r45.ta4 ta4Var15 = a17 != null ? a17.B : null;
        if (ta4Var15 != null) {
            ta4Var15.set(15, null);
        }
        this.f292563p = (a17 == null || (ta4Var5 = a17.B) == null) ? null : ta4Var5.getByteString(36);
        r45.ta4 ta4Var16 = a17 != null ? a17.B : null;
        if (ta4Var16 != null) {
            ta4Var16.set(36, null);
        }
        int i17 = -1;
        this.f292565r = (a17 == null || (ta4Var4 = a17.B) == null) ? -1 : ta4Var4.getInteger(4);
        if (a17 != null && (ta4Var3 = a17.B) != null) {
            i17 = ta4Var3.getInteger(6);
        }
        this.f292566s = i17;
        if (a17 != null && (ta4Var2 = a17.B) != null) {
            str = ta4Var2.getString(5);
        }
        if (str == null) {
            str = "";
        }
        this.f292567t = str;
        if (a17 != null && (ta4Var = a17.B) != null) {
            z17 = ta4Var.getBoolean(7);
        }
        this.f292564q = z17;
        if (z17) {
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            a52.a.d("194");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.getClass();
            y4Var.f328286a = "194";
        }
        java.lang.String stringExtra = getIntent().getStringExtra("FINDER_PRODUCT_LAST_GLOBAL_MSG_ID");
        this.f292562o = stringExtra != null ? stringExtra : "";
        com.tencent.mars.xlog.Log.i(this.f292554d, "onCreate noticeType:" + this.f292555e + ", notificationMsgType:" + this.f292556f + ", snsUxInfo:" + this.f292558h);
    }
}
