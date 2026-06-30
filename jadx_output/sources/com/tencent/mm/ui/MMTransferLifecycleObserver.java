package com.tencent.mm.ui;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/MMTransferLifecycleObserver;", "Landroidx/lifecycle/f;", "Landroid/os/ResultReceiver;", "receiver", "<init>", "(Landroid/os/ResultReceiver;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MMTransferLifecycleObserver implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.ResultReceiver f196918d;

    public MMTransferLifecycleObserver(android.os.ResultReceiver receiver) {
        kotlin.jvm.internal.o.g(receiver, "receiver");
        this.f196918d = receiver;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onCreate(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_CREATE.ordinal(), null);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_DESTROY.ordinal(), null);
        owner.mo133getLifecycle().c(this);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onPause(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_PAUSE.ordinal(), null);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onResume(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_RESUME.ordinal(), null);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStart(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_START.ordinal(), null);
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStop(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f196918d.send(androidx.lifecycle.m.ON_STOP.ordinal(), null);
    }
}
