package ir;

/* loaded from: classes15.dex */
public final class w extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final ir.v f293910b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ir.v introInfo) {
        super(10);
        kotlin.jvm.internal.o.g(introInfo, "introInfo");
        this.f293910b = introInfo;
    }

    @Override // ir.u0
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj) && (obj instanceof ir.w) && kotlin.jvm.internal.o.b(((ir.w) obj).f293910b, this.f293910b);
    }
}
