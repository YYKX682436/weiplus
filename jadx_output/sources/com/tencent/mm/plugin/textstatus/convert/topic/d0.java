package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.e0 f173269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tj4.e f173271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.textstatus.convert.topic.e0 e0Var, in5.s0 s0Var, tj4.e eVar) {
        super(2);
        this.f173269d = e0Var;
        this.f173270e = s0Var;
        this.f173271f = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        java.lang.String statusId = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(statusId, "statusId");
        boolean b17 = kotlin.jvm.internal.o.b(statusId, "-1");
        qj4.s sVar = qj4.s.f363958a;
        in5.s0 s0Var = this.f173270e;
        com.tencent.mm.plugin.textstatus.convert.topic.e0 e0Var = this.f173269d;
        if (b17) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TopicSelfItemConvert", "goToSetTextStatus");
            bi4.d1 d1Var = new bi4.d1();
            d1Var.f354942i = 17L;
            d1Var.f354941h = ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Bi();
            bi4.o1.f21075a.b((android.app.Activity) context, d1Var, 1001);
            java.lang.String a17 = en1.a.a();
            java.lang.String str2 = d1Var.f354941h;
            kotlin.jvm.internal.o.d(a17);
            kotlin.jvm.internal.o.d(str2);
            sVar.u(new qj4.l(a17, false, 17L, null, str2, null, null, 104, null));
            java.lang.String str3 = ej4.e0.f253348g;
            qj4.s.n(sVar, 21L, null, 0, null, null, null, 0, 0L, 0L, null, null, null, null, str3 == null ? "" : str3, 8190, null);
        } else {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            kotlinx.coroutines.r2 r2Var = e0Var.f173274f;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            e0Var.f173274f = kotlinx.coroutines.l.d(e0Var.f173273e, null, null, new com.tencent.mm.plugin.textstatus.convert.topic.c0(context2, statusId, null), 3, null);
            java.lang.Object obj3 = this.f173271f.f419827d.get(intValue);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            tj4.a aVar = (tj4.a) obj3;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("icon_pos", intValue - 1);
                jSONObject.put("days_before", aVar.f419814b);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                str = jSONObject2;
            } catch (org.json.JSONException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TopicSelfItemConvert", "reportJumpHistoryUI error");
                str = "";
            }
            int i17 = aVar.f419817e;
            java.lang.String str4 = (java.lang.String) kz5.n0.X(aVar.f419815c);
            java.lang.String str5 = ej4.e0.f253348g;
            qj4.s.n(sVar, 22L, str4, 0, null, null, null, 0, 0L, 0L, null, java.lang.Integer.valueOf(i17), null, str, str5 == null ? "" : str5, 3068, null);
        }
        return jz5.f0.f302826a;
    }
}
