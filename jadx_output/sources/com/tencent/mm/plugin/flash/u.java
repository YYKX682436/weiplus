package com.tencent.mm.plugin.flash;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.FaceFlashUI f137253e;

    public u(com.tencent.mm.plugin.flash.FaceFlashUI faceFlashUI, org.json.JSONObject jSONObject) {
        this.f137253e = faceFlashUI;
        this.f137252d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f137253e.V6(this.f137252d);
    }
}
