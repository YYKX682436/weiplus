package com.tencent.mm.plugin.finder.storage;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/storage/FinderConfigXLabData;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "<init>", "()V", "com/tencent/mm/plugin/finder/storage/m80", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderConfigXLabData extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ConfigUpdatedEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126370d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f126371e;

    public FinderConfigXLabData() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f126370d = "FinderConfigXLabData";
        this.f126371e = jz5.h.b(com.tencent.mm.plugin.finder.storage.n80.f127235d);
        alive();
        this.__eventId = 320120113;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f126371e).getValue();
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ConfigUpdatedEvent configUpdatedEvent) {
        com.tencent.mm.plugin.finder.storage.m80 m80Var;
        com.tencent.mm.autogen.events.ConfigUpdatedEvent event = configUpdatedEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.k3 k3Var = event.f54072g;
        java.lang.String str = k3Var.f7126a;
        if (!(str == null || str.length() == 0) && (m80Var = (com.tencent.mm.plugin.finder.storage.m80) c().get(k3Var.f7126a)) != null) {
            java.lang.Object obj = m80Var.f127178b;
            boolean z17 = m80Var.f127179c;
            e42.b0 b0Var = m80Var.f127177a;
            com.tencent.mars.xlog.Log.i(this.f126370d, java.lang.Thread.currentThread().getName() + " config: " + b0Var + " has update to " + d(b0Var, obj, z17));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016e A[Catch: IllegalStateException -> 0x01a1, c -> 0x01dc, TryCatch #2 {c -> 0x01dc, IllegalStateException -> 0x01a1, blocks: (B:4:0x0020, B:6:0x0024, B:10:0x016e, B:11:0x0181, B:16:0x0040, B:18:0x0044, B:19:0x0060, B:21:0x0064, B:22:0x0080, B:24:0x0084, B:25:0x0099, B:27:0x009d, B:29:0x00b9, B:31:0x00bd, B:32:0x00d9, B:35:0x00e0, B:38:0x0101, B:39:0x00fd, B:40:0x0106, B:42:0x010a, B:43:0x0125, B:45:0x0129, B:46:0x013c, B:48:0x0140, B:51:0x0161, B:52:0x015d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(e42.b0 r17, java.lang.Object r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.FinderConfigXLabData.d(e42.b0, java.lang.Object, boolean):java.lang.Object");
    }
}
