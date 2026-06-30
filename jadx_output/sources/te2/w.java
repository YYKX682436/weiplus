package te2;

/* loaded from: classes3.dex */
public final class w implements te2.u {

    /* renamed from: d, reason: collision with root package name */
    public te2.v f418503d;

    public w(android.content.Context context, gk2.e liveData, qo0.c statusMonitor) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.v callback = (te2.v) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f418503d = callback;
    }

    @Override // fs2.a
    public void onDetach() {
    }
}
