package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public is0.c f149888a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.SurfaceTexture f149889b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Surface f149890c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f149891d;

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f149892e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f149893f;

    /* renamed from: g, reason: collision with root package name */
    public int f149894g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f149895h = 1;

    /* renamed from: i, reason: collision with root package name */
    public os0.c f149896i;

    public final void a(final yz5.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        android.os.Handler handler = this.f149893f;
        if (handler != null) {
            handler.post(new java.lang.Runnable(task) { // from class: com.tencent.mm.plugin.multitalk.model.y2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f150211d;

                {
                    kotlin.jvm.internal.o.g(task, "function");
                    this.f150211d = task;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f150211d.invoke();
                }
            });
        }
    }
}
