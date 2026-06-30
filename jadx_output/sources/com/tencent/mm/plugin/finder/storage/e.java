package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f126677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f126678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f126679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(org.json.JSONObject jSONObject, java.lang.String str, java.lang.Throwable th6) {
        super(0);
        this.f126677d = jSONObject;
        this.f126678e = str;
        this.f126679f = th6;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        org.json.JSONObject jSONObject = this.f126677d;
        jSONObject.put("result", -2);
        jSONObject.put("cacheDbPath", this.f126678e);
        jSONObject.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, this.f126679f.getMessage());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
