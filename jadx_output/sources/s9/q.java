package s9;

/* loaded from: classes13.dex */
public class q extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.ConditionVariable f404972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s9.r f404973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s9.r rVar, java.lang.String str, android.os.ConditionVariable conditionVariable) {
        super(str);
        this.f404973e = rVar;
        this.f404972d = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f404973e) {
            this.f404972d.open();
            try {
                s9.r.l(this.f404973e);
            } catch (s9.a e17) {
                this.f404973e.f404980g = e17;
            }
            this.f404973e.f404975b.getClass();
        }
    }
}
