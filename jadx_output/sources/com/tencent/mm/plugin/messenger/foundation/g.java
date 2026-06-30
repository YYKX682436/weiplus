package com.tencent.mm.plugin.messenger.foundation;

@j95.b
/* loaded from: classes11.dex */
public final class g extends i95.w implements vg3.n3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f148647d = jz5.h.b(com.tencent.mm.plugin.messenger.foundation.d.f148631d);

    /* renamed from: e, reason: collision with root package name */
    public volatile long f148648e;

    /* renamed from: f, reason: collision with root package name */
    public volatile vg3.c f148649f;

    /* renamed from: g, reason: collision with root package name */
    public volatile vg3.d f148650g;

    public void wi(vg3.e reportInfo) {
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f148647d).getValue(), null, new com.tencent.mm.plugin.messenger.foundation.e(reportInfo, this, android.os.SystemClock.elapsedRealtime(), null), 1, null);
    }
}
