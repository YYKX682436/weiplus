package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rs implements ek2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f114182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f114183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114184e;

    public rs(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, boolean z17, long j17, java.lang.String str2) {
        this.f114180a = etVar;
        this.f114181b = str;
        this.f114182c = z17;
        this.f114183d = j17;
        this.f114184e = str2;
    }

    @Override // ek2.p0
    public void a(int i17, int i18, java.lang.String str, r45.wp2 resp) {
        r45.xy1 xy1Var;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114180a;
        java.lang.String str2 = this.f114181b;
        com.tencent.mm.plugin.finder.live.plugin.et.G1(etVar, i17, i18, str2.toString(), resp.getString(1), null, 16, null);
        com.tencent.mm.plugin.finder.live.plugin.et etVar2 = this.f114180a;
        if (etVar2.f112448p.getLiveRole() == 0 && i17 == 0 && i18 == 0) {
            km2.z zVar = ((on2.z2) etVar2.P0(on2.z2.class)).f347092m;
            if (zVar != null && zVar.f309229a == 1) {
                r45.cz1 cz1Var = zVar.f309232d;
                if (kotlin.jvm.internal.o.b(str2, (cz1Var == null || (xy1Var = (r45.xy1) cz1Var.getCustom(5)) == null) ? null : xy1Var.getString(1))) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_reply_lucky_comment", etVar2.f112464z, null, 25561);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f327797h, str2.toString(), null, 0, null, 28, null);
            com.tencent.mm.plugin.finder.live.plugin.et.y1(etVar2, this.f114182c, this.f114183d, str2);
        }
        com.tencent.mm.plugin.finder.live.plugin.rt rtVar = etVar2.S;
        if (rtVar != null) {
            rtVar.a("sendNormalMsg", this.f114184e, i17, i18);
        }
    }
}
