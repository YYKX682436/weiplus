package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class v3 extends com.tencent.mm.plugin.wepkg.model.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f140496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f140497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f140498d;

    public v3(com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.a aVar, android.os.Bundle bundle, boolean z17, com.tencent.mm.ipcinvoker.r rVar) {
        this.f140496b = bundle;
        this.f140497c = z17;
        this.f140498d = rVar;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        if ((baseWepkgProcessTask instanceof com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask) && baseWepkgProcessTask.f188333f) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.game.model.u3(this));
        }
    }
}
