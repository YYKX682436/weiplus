package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class dh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kh f112291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(com.tencent.mm.plugin.finder.live.plugin.kh khVar) {
        super(1);
        this.f112291d = khVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.nz6 vp6 = (r45.nz6) obj;
        kotlin.jvm.internal.o.g(vp6, "vp");
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233376c = vp6.f381778d;
        efVar.q0(vp6);
        efVar.U(vp6.f381778d);
        ml2.a5[] a5VarArr = ml2.a5.f327208d;
        int i17 = vp6.f381778d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = this.f112291d;
        khVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, 1);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.M2, jSONObject.toString(), null, 4, null);
        db5.t7.h(khVar.f365323d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egw));
        return jz5.f0.f302826a;
    }
}
