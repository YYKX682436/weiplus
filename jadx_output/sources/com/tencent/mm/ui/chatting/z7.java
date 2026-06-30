package com.tencent.mm.ui.chatting;

/* loaded from: classes7.dex */
public final class z7 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f206284d;

    public z7(org.json.JSONObject jSONObject) {
        this.f206284d = jSONObject;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        return new org.json.JSONObject().put("iot", this.f206284d).toString();
    }
}
