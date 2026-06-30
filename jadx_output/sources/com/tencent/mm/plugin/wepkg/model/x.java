package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class x extends com.tencent.mm.plugin.wepkg.model.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wepkg.model.a f188478c;

    public x(java.lang.String str, com.tencent.mm.plugin.wepkg.model.a aVar) {
        this.f188477b = str;
        this.f188478c = aVar;
    }

    @Override // com.tencent.mm.plugin.wepkg.model.a
    public void a(com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask baseWepkgProcessTask) {
        com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask wepkgCrossProcessTask = new com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask();
        wepkgCrossProcessTask.f188343h = 3006;
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = wepkgCrossProcessTask.f188344i;
        wepkgVersion.f188374d = this.f188477b;
        wepkgVersion.f188391x = false;
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.plugin.wepkg.model.a aVar = this.f188478c;
        if (n17) {
            com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.wepkg.model.m0(wepkgCrossProcessTask, aVar));
        } else {
            wepkgCrossProcessTask.f188350r = new com.tencent.mm.plugin.wepkg.model.n0(aVar, wepkgCrossProcessTask);
            wepkgCrossProcessTask.d();
        }
    }
}
