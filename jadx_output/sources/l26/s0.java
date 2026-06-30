package l26;

/* loaded from: classes16.dex */
public final class s0 extends l26.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f315273b;

    public s0(int i17) {
        super("must have exactly " + i17 + " value parameters", null);
        this.f315273b = i17;
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        kotlin.jvm.internal.o.g(functionDescriptor, "functionDescriptor");
        return functionDescriptor.W().size() == this.f315273b;
    }
}
