package ix5;

/* loaded from: classes12.dex */
public class b implements com.tencent.shadow.core.common.ILoggerFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final ix5.b f295625b = new ix5.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f295626a = new java.util.concurrent.ConcurrentHashMap();

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public com.tencent.shadow.core.common.Logger getLogger(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f295626a;
        com.tencent.shadow.core.common.Logger logger = (com.tencent.shadow.core.common.Logger) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (logger != null) {
            return logger;
        }
        ix5.a aVar = new ix5.a(this, str);
        com.tencent.shadow.core.common.Logger logger2 = (com.tencent.shadow.core.common.Logger) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).putIfAbsent(str, aVar);
        return logger2 == null ? aVar : logger2;
    }

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public long getNativeLogFunc() {
        return 0L;
    }

    @Override // com.tencent.shadow.core.common.ILoggerFactory
    public void init(boolean z17) {
    }
}
