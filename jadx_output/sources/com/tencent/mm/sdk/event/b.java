package com.tencent.mm.sdk.event;

/* loaded from: classes12.dex */
public abstract class b extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final e75.g f192369d = new com.tencent.mm.sdk.event.a();

    public final void N6(androidx.lifecycle.y lifecycleOwner, java.lang.String threadTag, e75.a observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(threadTag, "threadTag");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f192369d.observe(lifecycleOwner, threadTag, observer);
    }

    public final void O6(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f192369d.notify(data);
    }
}
