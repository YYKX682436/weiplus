package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes7.dex */
public final class o implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f136912d;

    public o(yz5.a aVar) {
        this.f136912d = aVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        android.os.Looper.myQueue().removeIdleHandler(this);
        this.f136912d.invoke();
        return false;
    }
}
