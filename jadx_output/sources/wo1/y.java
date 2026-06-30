package wo1;

/* loaded from: classes5.dex */
public final class y implements fo1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f448054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f448055b;

    public y(com.tencent.wechat.aff.affroam.g gVar, boolean z17) {
        this.f448054a = gVar;
        this.f448055b = z17;
    }

    @Override // fo1.o
    public final void a(fo1.n it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "[checkPermissionAndStartTask] errorCode=" + it);
        if (wo1.x.f448047a[it.ordinal()] == 1) {
            com.tencent.mm.plugin.backup.roambackup.b bVar = com.tencent.mm.plugin.backup.roambackup.b.f92568a;
            com.tencent.wechat.aff.affroam.g gVar = this.f448054a;
            bVar.c(gVar.f215829d, com.tencent.mm.plugin.backup.roambackup.a.f92560d, java.lang.Boolean.valueOf(this.f448055b));
            com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(gVar.f215829d);
        }
    }
}
