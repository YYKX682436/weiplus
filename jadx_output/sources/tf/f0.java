package tf;

/* loaded from: classes7.dex */
public final class f0 implements tf.n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f418805a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418806b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f418807c;

    public f0(boolean z17, java.lang.String namePrefix) {
        kotlin.jvm.internal.o.g(namePrefix, "namePrefix");
        this.f418805a = z17;
        this.f418806b = namePrefix;
        this.f418807c = new java.util.concurrent.atomic.AtomicInteger(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "<init>, usePooledImpl: " + z17);
    }

    public static final tf.n b(tf.g0 type) {
        kotlin.jvm.internal.o.g(type, "type");
        return new tf.f0(type != tf.g0.f418808d, type.name() + "Thread_");
    }

    public tf.o a() {
        java.lang.String str = this.f418806b + this.f418807c.getAndIncrement();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "create, name: " + str);
        return this.f418805a ? new tf.b0(str) : new tf.e0(str);
    }
}
