package yw;

/* loaded from: classes11.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f466477d;

    public u1(long j17) {
        this.f466477d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f466477d != yw.w1.f466490d) {
            return;
        }
        yw.w1.f466491e = true;
        yw.w1.f466487a.b("Timer");
    }
}
