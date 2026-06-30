package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ns extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f113674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f113675g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f113676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, boolean z17, long j17, kotlin.jvm.internal.h0 h0Var) {
        super(4);
        this.f113672d = etVar;
        this.f113673e = str;
        this.f113674f = z17;
        this.f113675g = j17;
        this.f113676h = h0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String string;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113672d;
        java.lang.String str = this.f113673e;
        com.tencent.mm.plugin.finder.live.plugin.et.G1(etVar, intValue, intValue2, str.toString(), resp.getString(1), null, 16, null);
        com.tencent.mm.plugin.finder.live.plugin.et etVar2 = this.f113672d;
        if (intValue == 0 && intValue2 == 0) {
            com.tencent.mm.plugin.finder.live.plugin.et.y1(etVar2, this.f113674f, this.f113675g, str);
        } else {
            r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
            if (zm6Var != null && zm6Var.getBoolean(1)) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eby);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                zl2.q4 q4Var = zl2.q4.f473933a;
                r45.zm6 zm6Var2 = (r45.zm6) resp.getCustom(7);
                if (zm6Var2 != null && (string = zm6Var2.getString(0)) != null) {
                    string2 = string;
                }
                q4Var.P(string2);
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.rt rtVar = etVar2.S;
        if (rtVar != null) {
            java.lang.String string3 = ((r45.ch1) this.f113676h.f310123d).getString(2);
            if (string3 == null) {
                string3 = "";
            }
            rtVar.a("sendAtMsg", string3, intValue, intValue2);
        }
        return jz5.f0.f302826a;
    }
}
