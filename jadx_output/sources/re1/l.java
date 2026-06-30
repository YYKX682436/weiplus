package re1;

/* loaded from: classes13.dex */
public class l extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ConditionVariable f394346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re1.m f394347e;

    public l(re1.m mVar, android.os.ConditionVariable conditionVariable) {
        this.f394347e = mVar;
        this.f394346d = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f394347e) {
            this.f394346d.open();
            re1.m.a(this.f394347e);
        }
    }
}
