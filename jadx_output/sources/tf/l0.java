package tf;

/* loaded from: classes7.dex */
public class l0 implements tf.q {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f418836d = new java.util.concurrent.ConcurrentHashMap();

    @Override // tf.q
    public java.lang.String getName() {
        return "VideoPlayer#Stub";
    }

    @Override // tf.q
    public tf.r h(java.lang.Class cls) {
        tf.r rVar = (tf.r) ((java.util.concurrent.ConcurrentHashMap) this.f418836d).get(cls);
        if (rVar == null || !cls.isInstance(rVar)) {
            return null;
        }
        return rVar;
    }
}
