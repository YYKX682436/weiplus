package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class n0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult f137163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.s0 f137164f;

    public n0(com.tencent.mm.plugin.flash.action.s0 s0Var, com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult) {
        this.f137164f = s0Var;
        this.f137163e = cronetHttpsCreateResult;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "GetFaceCheckAction_use_http_timeout";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult = this.f137163e;
        if (cronetHttpsCreateResult != null) {
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(cronetHttpsCreateResult.taskId);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.flash.action.m0(this));
        }
    }
}
