package jk4;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jk4.d f300149d = new jk4.d();

    public d() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return ((java.lang.Number) it.getKey()).intValue() + ":[" + it.getValue() + "] ";
    }
}
