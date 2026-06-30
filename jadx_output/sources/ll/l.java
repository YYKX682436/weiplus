package ll;

/* loaded from: classes12.dex */
public class l implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ThreadGroup f319109d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f319110e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f319111f;

    public l() {
        this.f319110e = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f319111f = "";
        this.f319109d = new java.lang.ThreadGroup("AUDIO_MIX_THREAD_POOL_GROUP");
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (android.text.TextUtils.isEmpty(this.f319111f)) {
            this.f319111f = "audio_mix_thread#";
        }
        java.lang.Thread thread = new java.lang.Thread(this.f319109d, runnable, this.f319111f + this.f319110e.getAndIncrement(), 0L);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }

    public l(java.lang.String str, java.lang.String str2) {
        this.f319110e = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f319111f = "";
        this.f319109d = new java.lang.ThreadGroup(str);
        this.f319111f = str2;
    }
}
