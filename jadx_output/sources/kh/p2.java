package kh;

/* loaded from: classes12.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.p2 f307885a = new kh.p2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f307886b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f307887c;

    static {
        jz5.i iVar = jz5.i.f302829d;
        f307886b = jz5.h.a(iVar, kh.n2.f307872d);
        f307887c = jz5.h.a(iVar, kh.o2.f307879d);
    }

    public final void a(kh.e2 taskStats) {
        kotlin.jvm.internal.o.g(taskStats, "taskStats");
        jz5.g gVar = f307887c;
        ((java.util.List) gVar.getValue()).contains(taskStats);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskTrackerGlobal", "init TaskStats: " + taskStats.getClass().getName() + '@' + taskStats.hashCode());
        ((java.util.List) gVar.getValue()).add(taskStats);
    }
}
