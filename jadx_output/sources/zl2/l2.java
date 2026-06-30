package zl2;

/* loaded from: classes3.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f473871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f473874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f473875h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473876i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f473877m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473878n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473879o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var, java.lang.String str, r45.y23 y23Var, int i17, gk2.e eVar, long j17, java.lang.String str2, android.content.Context context) {
        super(2);
        this.f473871d = r2Var;
        this.f473872e = h0Var;
        this.f473873f = str;
        this.f473874g = y23Var;
        this.f473875h = i17;
        this.f473876i = eVar;
        this.f473877m = j17;
        this.f473878n = str2;
        this.f473879o = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.ru1 ru1Var = (r45.ru1) obj2;
        kotlinx.coroutines.p2.a(this.f473871d, null, 1, null);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f473872e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (booleanValue) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r45.y23 y23Var = this.f473874g;
            long j17 = y23Var.getLong(0);
            boolean v17 = st2.g3.f412326a.v(y23Var);
            r0Var.getClass();
            java.lang.String sessionId = this.f473873f;
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.f327431e;
            jSONObject.put("type", 1007);
            jSONObject.put("session", sessionId);
            jSONObject.put("productid", j17);
            jSONObject.put("seckill", v17 ? 1 : 0);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            int i17 = this.f473875h;
            jSONObject2.put("entrance", i17);
            ml2.r0.hj(r0Var, ml2.b4.f327264s, jSONObject.toString(), 0L, jSONObject2.toString(), null, null, null, null, 244, null);
            r45.bw2 bw2Var = new r45.bw2();
            gk2.e eVar = this.f473876i;
            bw2Var.set(0, ((mm2.c1) eVar.a(mm2.c1.class)).f328846n);
            bw2Var.set(4, y23Var);
            bw2Var.set(1, 1);
            bw2Var.set(2, ru1Var != null ? ru1Var.getString(2) : null);
            bw2Var.set(3, java.lang.Long.valueOf(this.f473877m));
            bw2Var.set(7, sessionId);
            bw2Var.set(6, java.lang.String.valueOf(i17));
            bw2Var.set(8, this.f473878n.toString());
            android.content.Intent intent = new android.content.Intent();
            ((mm2.c1) eVar.a(mm2.c1.class)).O1 = false;
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null) {
                w0Var.a0();
            }
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = this.f473879o;
            q4Var.c(context, eVar, 2);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3.f435921a.b(intent, "shop", 0);
            intent.putExtra("KEY_PARAMS_KEY_VALUE", bw2Var.toByteArray());
            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 3);
            intent.putExtra("KEY_PARAMS_NEED_CLOSE_LIVE", false);
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).hj(context, intent, true);
            co0.s u07 = efVar.u0();
            if (u07 != null) {
                u07.f1(true);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveUtil", "shop report requestId goReplay, " + y23Var.getString(17));
        }
        return jz5.f0.f302826a;
    }
}
