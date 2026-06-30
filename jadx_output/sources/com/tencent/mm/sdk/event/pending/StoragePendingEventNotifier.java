package com.tencent.mm.sdk.event.pending;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/StoragePendingEventNotifier;", "Ll75/f0;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/x;", "", "delay", "", "handleThreadTag", "La75/b;", "Lo75/c;", "handler", "<init>", "(JLjava/lang/String;La75/b;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class StoragePendingEventNotifier<T extends l75.f0> implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f192390d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192391e;

    /* renamed from: f, reason: collision with root package name */
    public final a75.b f192392f;

    /* renamed from: g, reason: collision with root package name */
    public final o75.c f192393g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f192394h;

    public StoragePendingEventNotifier(long j17, java.lang.String handleThreadTag, a75.b handler) {
        kotlin.jvm.internal.o.g(handleThreadTag, "handleThreadTag");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f192390d = j17;
        this.f192391e = handleThreadTag;
        this.f192392f = handler;
        if (j17 > 0) {
            o75.b bVar = o75.b.f343581b;
            o75.c cVar = new o75.c(o75.b.f343585f, "BATCH_PENDING_KEY", "MicroMsg.Mvvm.StoragePendingEventNotifier");
            cVar.f343591e = new java.util.HashMap();
            this.f192393g = cVar;
            this.f192394h = jz5.h.b(new a75.g(this));
            return;
        }
        throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
    }

    public final com.tencent.mm.sdk.platformtools.n3 a() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f192394h).getValue();
    }

    public /* synthetic */ StoragePendingEventNotifier(long j17, java.lang.String str, a75.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? "StoragePendingEventNotifierTag" : str, bVar);
    }
}
