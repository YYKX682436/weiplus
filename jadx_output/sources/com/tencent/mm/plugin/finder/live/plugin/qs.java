package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qs implements ek2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f114045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f114046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114047e;

    public qs(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, boolean z17, long j17, java.lang.String str2) {
        this.f114043a = etVar;
        this.f114044b = str;
        this.f114045c = z17;
        this.f114046d = j17;
        this.f114047e = str2;
    }

    @Override // ek2.p0
    public void a(int i17, int i18, java.lang.String str, r45.wp2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.et.G1(this.f114043a, i17, i18, this.f114044b, resp.getString(1), null, 16, null);
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114043a;
        if (etVar.f112448p.getLiveRole() == 0 && i17 == 0 && i18 == 0) {
            km2.z zVar = ((on2.z2) ((mm2.c1) etVar.P0(mm2.c1.class)).business(on2.z2.class)).f347092m;
            java.lang.String str2 = this.f114044b;
            if (zVar != null && zVar.f309229a == 1) {
                r45.cz1 cz1Var = zVar.f309232d;
                if (kotlin.jvm.internal.o.b(str2, cz1Var != null ? cz1Var.getString(4) : null)) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_reply_lucky_comment", etVar.f112464z, null, 25561);
                }
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ek((ml2.r0) c17, ml2.p4.f327797h, this.f114044b, null, 0, null, 28, null);
            com.tencent.mm.plugin.finder.live.plugin.et.y1(etVar, this.f114045c, this.f114046d, str2);
        }
        com.tencent.mm.plugin.finder.live.plugin.rt rtVar = etVar.S;
        if (rtVar != null) {
            rtVar.a("sendFastCommentMsg", this.f114047e, i17, i18);
        }
    }
}
