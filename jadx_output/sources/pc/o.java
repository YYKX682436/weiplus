package pc;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f353214a;

    /* renamed from: b, reason: collision with root package name */
    public volatile pc.n f353215b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f353216c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f353217d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f353218e;

    public o() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f353218e = linkedList;
        linkedList.clear();
    }

    public final void a() {
        if (this.f353215b == null) {
            return;
        }
        this.f353215b.removeMessages(1);
        this.f353215b = null;
        android.os.HandlerThread handlerThread = this.f353214a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f353214a.quitSafely();
    }
}
