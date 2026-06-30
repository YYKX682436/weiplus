package vk;

@j95.b
/* loaded from: classes12.dex */
public final class n extends i95.w implements ob0.f3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vk.l f437741d = new vk.l(null);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f437742e = jz5.h.b(vk.i.f437738d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f437743f = jz5.h.b(vk.k.f437740d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f437744g = jz5.h.b(vk.j.f437739d);

    public void Ai(java.lang.String activityName, boolean z17) {
        kotlin.jvm.internal.o.g(activityName, "activityName");
        vk.l lVar = f437741d;
        synchronized (vk.l.c(lVar)) {
            for (ob0.e3 e3Var : vk.l.c(lVar)) {
                if (z17) {
                    com.tencent.mm.feature.performance.adpf.e0 e0Var = (com.tencent.mm.feature.performance.adpf.e0) e3Var;
                    e0Var.getClass();
                    e0Var.a();
                } else {
                    com.tencent.mm.feature.performance.adpf.e0 e0Var2 = (com.tencent.mm.feature.performance.adpf.e0) e3Var;
                    e0Var2.getClass();
                    e0Var2.a();
                }
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new vk.m());
        }
    }

    public void wi(java.lang.String moduleName, boolean z17) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        vk.l lVar = f437741d;
        synchronized (vk.l.b(lVar)) {
            for (ob0.d3 d3Var : vk.l.b(lVar)) {
                if (z17) {
                    com.tencent.mm.feature.performance.adpf.y yVar = (com.tencent.mm.feature.performance.adpf.y) d3Var;
                    yVar.getClass();
                    if (kotlin.jvm.internal.o.b(moduleName, "FinderLive")) {
                        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) yVar.f67513a).getValue()).turnOnSync();
                    } else if (kotlin.jvm.internal.o.b(moduleName, "FinderLiveAnchor")) {
                        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) yVar.f67514b).getValue()).turnOnSync();
                    }
                } else {
                    com.tencent.mm.feature.performance.adpf.y yVar2 = (com.tencent.mm.feature.performance.adpf.y) d3Var;
                    yVar2.getClass();
                    if (kotlin.jvm.internal.o.b(moduleName, "FinderLive")) {
                        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) yVar2.f67513a).getValue()).turnOffSync();
                    } else if (kotlin.jvm.internal.o.b(moduleName, "FinderLiveAnchor")) {
                        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) yVar2.f67514b).getValue()).turnOffSync();
                    }
                }
            }
        }
    }
}
