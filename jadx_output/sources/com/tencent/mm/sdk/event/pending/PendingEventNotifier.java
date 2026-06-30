package com.tencent.mm.sdk.event.pending;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/PendingEventNotifier;", "La75/a;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "", "delay", "", "handleThreadTag", "La75/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(JLjava/lang/String;La75/b;Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class PendingEventNotifier<T extends a75.a> implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f192383d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192384e;

    /* renamed from: f, reason: collision with root package name */
    public final a75.b f192385f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.y f192386g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f192387h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f192388i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f192389m;

    public PendingEventNotifier(long j17, java.lang.String handleThreadTag, a75.b handler, androidx.lifecycle.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(handleThreadTag, "handleThreadTag");
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f192383d = j17;
        this.f192384e = handleThreadTag;
        this.f192385f = handler;
        this.f192386g = lifecycleOwner;
        if (j17 > 0) {
            d75.b.g(new a75.c(this));
            this.f192387h = new java.util.HashMap();
            this.f192388i = jz5.h.b(new a75.e(this));
            this.f192389m = true;
            return;
        }
        throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
    }

    public final com.tencent.mm.sdk.platformtools.n3 a() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f192388i).getValue();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        a().removeCallbacksAndMessages(null);
        a().sendEmptyMessage(2);
    }

    public /* synthetic */ PendingEventNotifier(long j17, java.lang.String str, a75.b bVar, androidx.lifecycle.y yVar, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, (i17 & 2) != 0 ? "PendingEventNotifierTag" : str, bVar, yVar);
    }
}
