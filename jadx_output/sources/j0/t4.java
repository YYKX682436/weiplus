package j0;

/* loaded from: classes14.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.t4 f296571d = new j0.t4();

    public t4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List restored = (java.util.List) obj;
        kotlin.jvm.internal.o.g(restored, "restored");
        return new j0.u4(((java.lang.Boolean) restored.get(1)).booleanValue() ? b0.y1.Vertical : b0.y1.Horizontal, ((java.lang.Float) restored.get(0)).floatValue());
    }
}
