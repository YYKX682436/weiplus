package com.tencent.mm.sdk.event.pending;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "La75/a;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/x;", "Ljz5/f0;", "onDestroy", "", "delay", "La75/b;", "handler", "Landroidx/lifecycle/y;", "lifecycleOwner", "<init>", "(JLa75/b;Landroidx/lifecycle/y;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class UIPendingEventNotifier<T extends a75.a> implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final long f192395d;

    /* renamed from: e, reason: collision with root package name */
    public final a75.b f192396e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.y f192397f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f192398g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f192399h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f192400i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.k3 f192401m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f192402n;

    public UIPendingEventNotifier(long j17, a75.b handler, androidx.lifecycle.y lifecycleOwner) {
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f192395d = j17;
        this.f192396e = handler;
        this.f192397f = lifecycleOwner;
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("not allow use zero or smaller delay");
        }
        d75.b.g(new a75.h(this));
        this.f192398g = new java.lang.Object();
        this.f192399h = new java.util.HashMap();
        this.f192400i = new java.util.concurrent.atomic.AtomicBoolean(false);
        a75.i iVar = new a75.i(this);
        this.f192401m = iVar;
        this.f192402n = new com.tencent.mm.sdk.platformtools.n3(xu5.b.b(), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (((a75.a) r2.put(r3, r1)) == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a75.a r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r6, r0)
            androidx.lifecycle.y r0 = r5.f192397f
            androidx.lifecycle.o r0 = r0.mo133getLifecycle()
            androidx.lifecycle.n r0 = r0.b()
            androidx.lifecycle.n r1 = androidx.lifecycle.n.DESTROYED
            if (r0 == r1) goto L76
            java.lang.Object r0 = r5.f192398g
            monitor-enter(r0)
            java.util.HashMap r1 = r5.f192399h     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r6.get_key()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L73
            a75.a r1 = (a75.a) r1     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L3b
            java.util.HashMap r2 = r5.f192399h     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = r1.get_key()     // Catch: java.lang.Throwable -> L73
            a75.a r1 = r1.mergeEvent(r6)     // Catch: java.lang.Throwable -> L73
            java.lang.String r4 = "null cannot be cast to non-null type T of com.tencent.mm.sdk.event.pending.UIPendingEventNotifier.doNotify$lambda$6$lambda$4"
            kotlin.jvm.internal.o.e(r1, r4)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r1 = r2.put(r3, r1)     // Catch: java.lang.Throwable -> L73
            a75.a r1 = (a75.a) r1     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L47
        L3b:
            java.util.HashMap r1 = r5.f192399h     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r6.get_key()     // Catch: java.lang.Throwable -> L73
            java.lang.Object r6 = r1.put(r2, r6)     // Catch: java.lang.Throwable -> L73
            a75.a r6 = (a75.a) r6     // Catch: java.lang.Throwable -> L73
        L47:
            monitor-exit(r0)
            r6 = 0
            if (r7 == 0) goto L66
            java.util.concurrent.atomic.AtomicBoolean r7 = r5.f192400i
            boolean r0 = r7.get()
            if (r0 != 0) goto L76
            java.lang.String r0 = "send pending message 0"
            java.lang.String r1 = "MicroMsg.Mvvm.UIPendingEventNotifier"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 1
            r7.set(r0)
            com.tencent.mm.sdk.platformtools.n3 r7 = r5.f192402n
            long r0 = r5.f192395d
            r7.sendEmptyMessageDelayed(r6, r0)
            goto L76
        L66:
            java.lang.String r7 = "send message 0"
            java.lang.String r0 = "MicroMsg.Mvvm.UIPendingEventNotifier"
            com.tencent.mars.xlog.Log.i(r0, r7)
            com.tencent.mm.sdk.platformtools.n3 r7 = r5.f192402n
            r7.sendEmptyMessage(r6)
            goto L76
        L73:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.event.pending.UIPendingEventNotifier.a(a75.a, boolean):void");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onDestroy() {
        this.f192402n.removeCallbacksAndMessages(null);
        this.f192400i.set(false);
        synchronized (this.f192398g) {
            this.f192399h.clear();
        }
    }
}
