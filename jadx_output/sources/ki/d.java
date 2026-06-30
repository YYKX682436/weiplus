package ki;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f308087d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f308088e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f308089f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.IBackgroundStatefulOwner f308090g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f308091h;

    /* renamed from: i, reason: collision with root package name */
    public final ki.b f308092i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f308093m;

    public d(java.lang.String name, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner backgroundOwner, java.util.ArrayList trimCallback, ki.b config, boolean z17) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(backgroundOwner, "backgroundOwner");
        kotlin.jvm.internal.o.g(trimCallback, "trimCallback");
        kotlin.jvm.internal.o.g(config, "config");
        this.f308089f = name;
        this.f308090g = backgroundOwner;
        this.f308091h = trimCallback;
        this.f308092i = config;
        this.f308093m = z17;
        android.os.HandlerThread b17 = oj.g.b();
        kotlin.jvm.internal.o.f(b17, "MatrixHandlerThread.getDefaultHandlerThread()");
        this.f308087d = new android.os.Handler(b17.getLooper());
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f308088e;
        if (i17 >= this.f308092i.f308085b.size()) {
            oj.j.b("Matrix.TrimMemoryNotifier", "index[" + i17 + "] out of bounds[" + this.f308092i.f308085b.size() + ']', new java.lang.Object[0]);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("!!![");
        sb6.append(this.f308089f);
        sb6.append("] trim timeout [");
        int i18 = i17 + 1;
        sb6.append(i18);
        sb6.append('/');
        sb6.append(this.f308092i.f308085b.size());
        sb6.append("] ");
        sb6.append((java.lang.Long) this.f308092i.f308085b.get(i17));
        oj.j.c("Matrix.TrimMemoryNotifier", sb6.toString(), new java.lang.Object[0]);
        ki.i.f308101c.d(this.f308091h);
        if (i18 < this.f308092i.f308085b.size()) {
            this.f308088e = i18;
            java.lang.Object obj = this.f308092i.f308085b.get(i18);
            kotlin.jvm.internal.o.f(obj, "config.delayMillis[nextIndex]");
            long longValue = ((java.lang.Number) obj).longValue();
            this.f308087d.postDelayed(this, longValue);
            oj.j.c("Matrix.TrimMemoryNotifier", "...[" + this.f308089f + "] trim delay[" + (i18 + 1) + '/' + this.f308092i.f308085b.size() + "] " + longValue, new java.lang.Object[0]);
        }
    }
}
