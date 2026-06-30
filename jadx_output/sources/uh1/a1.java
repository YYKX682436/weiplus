package uh1;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final uh1.a1 f427761d = new uh1.a1();

    public a1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BindSocketToNetworkApi23Ability", "reflect descriptorField fail since " + e17);
            return null;
        }
    }
}
