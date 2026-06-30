package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask f188473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f188475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kh0.f f188476g;

    public u(com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask, java.lang.String str, com.tencent.mm.vfs.r6 r6Var, kh0.f fVar) {
        this.f188473d = wepkgCrossProcessTask;
        this.f188474e = str;
        this.f188475f = r6Var;
        this.f188476g = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = this.f188473d;
        if (wepkgCrossProcessTask.f188333f) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.t(this));
        }
        wepkgCrossProcessTask.x();
    }
}
