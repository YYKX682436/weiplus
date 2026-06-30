package tf;

/* loaded from: classes7.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.b0 f418846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tf.b0 b0Var) {
        super(0);
        this.f418846d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tf.b0 b0Var = this.f418846d;
        java.lang.String str = b0Var.f418782a;
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a(str, 5);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Thread ");
        java.lang.String str2 = b0Var.f418782a;
        sb6.append(str2);
        sb6.append(" created");
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", sb6.toString());
        a17.start();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayerPluginHandlerThreadProvider", "Thread " + str2 + " started");
        b0Var.f418784c = a17;
        return new android.os.Handler(a17.getLooper());
    }
}
