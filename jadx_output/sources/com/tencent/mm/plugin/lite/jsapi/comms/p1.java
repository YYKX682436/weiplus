package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q1 f143717e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.q1 q1Var) {
        super(2);
        this.f143716d = str;
        this.f143717e = q1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.lite.jsapi.comms.q1 q1Var = this.f143717e;
        if (booleanValue) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(this.f143716d, intValue);
            q1Var.f143443f.c(jSONObject, false);
        } else {
            q1Var.f143443f.a(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR);
        }
        return jz5.f0.f302826a;
    }
}
