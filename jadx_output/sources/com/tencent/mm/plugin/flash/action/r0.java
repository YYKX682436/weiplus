package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class r0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult f137176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.s0 f137177f;

    public r0(com.tencent.mm.plugin.flash.action.s0 s0Var, com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult) {
        this.f137177f = s0Var;
        this.f137176e = cronetHttpsCreateResult;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "GetFaceCheckResult_use_http_timeout";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult = this.f137176e;
        if (cronetHttpsCreateResult != null) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(cronetHttpsCreateResult.taskId);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.q0(this));
        }
    }
}
