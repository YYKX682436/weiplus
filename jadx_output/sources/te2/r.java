package te2;

/* loaded from: classes.dex */
public final class r implements te2.p {

    /* renamed from: d, reason: collision with root package name */
    public te2.q f418365d;

    public r(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.q callback = (te2.q) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f418365d = callback;
    }

    @Override // fs2.a
    public void onDetach() {
    }
}
