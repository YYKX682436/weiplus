package l26;

/* loaded from: classes16.dex */
public final class u0 extends l26.v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l26.u0 f315277b = new l26.u0();

    public u0() {
        super("must have a single value parameter", null);
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        return functionDescriptor.W().size() == 1;
    }
}
