package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class q0 implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public boolean f120991d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f120992e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f120994g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f120996i;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.b0 f120993f = new androidx.lifecycle.b0(this, true);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f120995h = new java.util.ArrayList();

    public final synchronized void a(yz5.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f120994g) {
            event.invoke();
        } else {
            ((java.util.ArrayList) this.f120995h).add(event);
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f120993f;
    }
}
