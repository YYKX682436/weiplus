package io2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io2.p f293489d;

    public n(io2.p pVar) {
        this.f293489d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io2.p pVar = this.f293489d;
        pVar.f293491a.f293477d.requestInit(false);
        pVar.f293491a.f293477d.requestRefresh();
    }
}
