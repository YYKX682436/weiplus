package k75;

/* loaded from: classes8.dex */
public abstract class b extends k75.c implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f304814d = getClass().getSimpleName();

    @Override // k75.c
    public void a() {
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", "entering " + this.f304814d);
    }

    @Override // k75.c
    public void b() {
        com.tencent.mars.xlog.Log.i("LogStateTransitionState", "exiting " + this.f304814d);
    }
}
