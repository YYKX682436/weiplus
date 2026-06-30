package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final e40.a0 f143764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f143765b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f143766c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143767d;

    public r5(e40.a0 state, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        num = (i17 & 4) != 0 ? null : num;
        str2 = (i17 & 8) != 0 ? null : str2;
        kotlin.jvm.internal.o.g(state, "state");
        this.f143764a = state;
        this.f143765b = str;
        this.f143766c = num;
        this.f143767d = str2;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("status", this.f143764a.f247610d);
        java.lang.String str = this.f143765b;
        if (str != null) {
            jSONObject.put("fileId", str);
        }
        java.lang.Integer num = this.f143766c;
        if (num != null) {
            jSONObject.put("progress", num.intValue());
        }
        java.lang.String str2 = this.f143767d;
        if (str2 != null) {
            jSONObject.put("errMsg", str2);
        }
        return jSONObject;
    }
}
