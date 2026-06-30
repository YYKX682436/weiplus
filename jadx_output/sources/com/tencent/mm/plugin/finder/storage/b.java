package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f126490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f126490d = jSONObject;
        this.f126491e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = this.f126490d;
        jSONObject.put("result", 2);
        jSONObject.put("cacheDbPath", this.f126491e);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
