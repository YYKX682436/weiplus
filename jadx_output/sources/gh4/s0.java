package gh4;

@j95.b(dependencies = {gh4.s.class})
/* loaded from: classes8.dex */
public final class s0 extends i95.w implements hh4.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f271954d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f271955e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl f271956f = new com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl();

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        lq.c cVar = lq.d.f320447a;
        com.tencent.mm.plugin.taskbar.ui.dynamicbackground.DynamicBgServiceImpl dynamicBgService = this.f271956f;
        kotlin.jvm.internal.o.h(dynamicBgService, "dynamicBgService");
        mq.h.b("MicroMsg.DynamicBgServiceManager", "alvinluo setDynamicBgService", new java.lang.Object[0]);
        lq.d.f320447a = dynamicBgService;
    }
}
