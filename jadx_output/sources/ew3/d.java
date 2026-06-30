package ew3;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ew3.d f257063d = new ew3.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.Object newInstance = com.tencent.mm.plugin.reflect.factory.BootReflectClassFactory.class.getConstructors()[0].newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.reflect.IReflectClassFactory");
            return (ew3.c) newInstance;
        } catch (java.lang.Exception unused) {
            return new ew3.b();
        }
    }
}
