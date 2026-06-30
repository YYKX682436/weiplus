package yw;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dw5.i f466402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yw.y f466403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f466404f;

    public n(dw5.i iVar, yw.y yVar, int i17) {
        this.f466402d = iVar;
        this.f466403e = yVar;
        this.f466404f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int c17 = yw.q0.f466429a.c();
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("officialaccounts");
        if (!((p17 == null || !p17.d2(64) || p17.d2(16)) ? false : true)) {
            c17 = 0;
        }
        dw5.i iVar = this.f466402d;
        iVar.f244368f = c17;
        iVar.f244369g[3] = true;
        com.tencent.wechat.mm.biz.c cVar = this.f466403e.f466509a;
        if (cVar != null) {
            cVar.b1(this.f466404f, iVar);
        }
    }
}
