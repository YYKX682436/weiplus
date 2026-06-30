package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f209469a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.nd f209470b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f209471c;

    public od(com.tencent.mm.ui.nd status) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f209469a = new java.lang.Object();
        this.f209470b = status;
    }

    public final void a(com.tencent.mm.ui.nd value) {
        kotlin.jvm.internal.o.g(value, "value");
        synchronized (this.f209469a) {
            this.f209470b = value;
            this.f209469a.notifyAll();
        }
    }
}
