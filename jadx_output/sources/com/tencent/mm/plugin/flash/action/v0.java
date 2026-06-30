package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionUI f137187e;

    public v0(com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI, org.json.JSONObject jSONObject) {
        this.f137187e = faceFlashActionUI;
        this.f137186d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f137187e.V6(this.f137186d);
    }
}
