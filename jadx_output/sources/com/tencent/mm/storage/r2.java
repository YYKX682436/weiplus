package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f195264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s1 f195266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f195267g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(java.util.Map map, int i17, com.tencent.mm.storage.s1 s1Var, android.content.Context context) {
        super(0);
        this.f195264d = map;
        this.f195265e = i17;
        this.f195266f = s1Var;
        this.f195267g = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Map map = this.f195264d;
        java.lang.String str = (java.lang.String) map.get(".msg.fromusername");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".msg.appmsg.mmreader.");
        int i17 = this.f195265e;
        sb6.append(com.tencent.mm.storage.s2.g(i17));
        sb6.append(".weapp_username");
        java.lang.String str2 = (java.lang.String) map.get(sb6.toString());
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".weapp_path");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".weapp_version"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(i17) + ".weapp_state"), 0);
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.template_id");
        if (str4 == null) {
            str4 = "";
        }
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        com.tencent.mm.storage.s1 s1Var = this.f195266f;
        sb7.append(s1Var.field_msgSvrId);
        sb7.append(':');
        sb7.append(str);
        sb7.append(':');
        sb7.append(s1Var.field_talker);
        sb7.append(':');
        sb7.append(str4);
        appBrandStatObject.f87791g = sb7.toString();
        if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(str)) {
            appBrandStatObject.f87790f = 1174;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(this.f195267g, str2, null, P2, P, str3, appBrandStatObject);
        } else {
            appBrandStatObject.f87790f = 1174;
            qk.o b17 = r01.z.b(str);
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Vi(this.f195267g, str2, null, P2, P, str3, appBrandStatObject, b17 == null ? null : b17.field_appId);
        }
        return jz5.f0.f302826a;
    }
}
