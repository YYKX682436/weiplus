package lc3;

/* loaded from: classes7.dex */
public abstract class q extends lc3.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
    }

    @Override // lc3.o
    public final java.util.Collection w() {
        java.util.HashSet d17 = kz5.p1.d(l());
        java.util.Collection y17 = y();
        if (y17 != null) {
            d17.addAll(y17);
        }
        return d17;
    }

    public abstract java.util.Collection y();
}
