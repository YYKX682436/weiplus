package id2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final id2.m f290662a = new id2.m();

    public final java.lang.String a(int i17, int i18, int i19) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return i17 + '-' + i18 + '-' + i19 + '-' + r26.i0.t(uuid, "-", "", false);
    }

    public final void b(java.lang.String eid, java.lang.String pagId) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(pagId, "pagId");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderBroadcastEidClickStruct.u(xy2.c.e(context));
        finderBroadcastEidClickStruct.p("");
        finderBroadcastEidClickStruct.B("");
        finderBroadcastEidClickStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidClickStruct.w(Ri);
        finderBroadcastEidClickStruct.r(f290662a.a(3, 28, 65));
        ml2.q1 q1Var = ml2.q1.f327812e;
        finderBroadcastEidClickStruct.q("temp_6");
        finderBroadcastEidClickStruct.A("");
        finderBroadcastEidClickStruct.x("");
        finderBroadcastEidClickStruct.v("");
        finderBroadcastEidClickStruct.s(eid);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_id", pagId);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderBroadcastEidClickStruct.t(r26.i0.t(jSONObject2, ",", ";", false));
        finderBroadcastEidClickStruct.z("");
        finderBroadcastEidClickStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderChatRoomLiveReporter", "report23059 eid:" + eid + ", pagId:" + pagId);
    }

    public final void c(java.lang.String pagId) {
        kotlin.jvm.internal.o.g(pagId, "pagId");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
        ml2.q1 q1Var = ml2.q1.f327812e;
        finderBroadcastPageInStruct.p("temp_6");
        finderBroadcastPageInStruct.q(a(3, 28, 65));
        finderBroadcastPageInStruct.r(pagId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_finder_role", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() ? 1 : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderBroadcastPageInStruct.s(r26.i0.t(jSONObject2, ",", ";", false));
        finderBroadcastPageInStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderChatRoomLiveReporter", "report22946 pagId:".concat(pagId));
    }

    public final void d(java.lang.String pagId) {
        kotlin.jvm.internal.o.g(pagId, "pagId");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct();
        ml2.q1 q1Var = ml2.q1.f327812e;
        finderBroadcastPageOutStruct.p("temp_6");
        finderBroadcastPageOutStruct.q(a(3, 28, 65));
        finderBroadcastPageOutStruct.r(pagId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_finder_role", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() ? 1 : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderBroadcastPageOutStruct.s(r26.i0.t(jSONObject2, ",", ";", false));
        finderBroadcastPageOutStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderChatRoomLiveReporter", "report22947 pagId:".concat(pagId));
    }

    public final void e(java.lang.String eid, java.lang.String pagId) {
        kotlin.jvm.internal.o.g(eid, "eid");
        kotlin.jvm.internal.o.g(pagId, "pagId");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderBroadcastEidExposeStruct.u(xy2.c.e(context));
        finderBroadcastEidExposeStruct.p("");
        finderBroadcastEidExposeStruct.A("");
        finderBroadcastEidExposeStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidExposeStruct.w(Ri);
        finderBroadcastEidExposeStruct.r(f290662a.a(3, 28, 65));
        ml2.q1 q1Var = ml2.q1.f327812e;
        finderBroadcastEidExposeStruct.q("temp_6");
        finderBroadcastEidExposeStruct.f56545l = finderBroadcastEidExposeStruct.b("TabContextID", "", true);
        finderBroadcastEidExposeStruct.x("");
        finderBroadcastEidExposeStruct.v("");
        finderBroadcastEidExposeStruct.s(eid);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_id", pagId);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderBroadcastEidExposeStruct.t(r26.i0.t(jSONObject2, ",", ";", false));
        finderBroadcastEidExposeStruct.z("");
        finderBroadcastEidExposeStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderChatRoomLiveReporter", "report23057 eid:" + eid + ", pagId:" + pagId);
    }
}
