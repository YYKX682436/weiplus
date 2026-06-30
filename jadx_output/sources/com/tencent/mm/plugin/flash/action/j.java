package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class j extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult f137146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout f137147f;

    public j(com.tencent.mm.plugin.flash.action.FaceFlashActionPreviewLayout faceFlashActionPreviewLayout, com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult) {
        this.f137147f = faceFlashActionPreviewLayout;
        this.f137146e = cronetHttpsCreateResult;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "GetFaceCheckLiveType_use_http_timeout";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult = this.f137146e;
        if (cronetHttpsCreateResult != null) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(cronetHttpsCreateResult.taskId);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.i(this));
        }
    }
}
