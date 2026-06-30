package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.silent_download.n f140472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.silent_download.c0 f140473e;

    public z(com.tencent.mm.plugin.game.model.silent_download.c0 c0Var, com.tencent.mm.plugin.game.model.silent_download.n nVar) {
        this.f140473e = c0Var;
        this.f140472d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f140472d.field_appId;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.w.k(str, false);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.model.silent_download.y(this));
    }
}
