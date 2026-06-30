package ir0;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ir0.a f293923d = new ir0.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(ih.a.f(e42.d0.clicfg_matrix_lifecycle_ext_executor, true));
        com.tencent.mars.xlog.Log.i("MicroMsg.MatrixLifecycleBoot", "enable external executor: " + valueOf.booleanValue());
        return valueOf;
    }
}
