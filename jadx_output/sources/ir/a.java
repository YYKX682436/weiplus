package ir;

/* loaded from: classes12.dex */
public abstract class a implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ir.r f293811a;

    /* renamed from: b, reason: collision with root package name */
    public final ir.i0 f293812b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f293813c;

    public a(ir.r groupInfo) {
        kotlin.jvm.internal.o.g(groupInfo, "groupInfo");
        this.f293811a = groupInfo;
        this.f293812b = new ir.i0(groupInfo);
        this.f293813c = new java.util.LinkedList();
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f293813c;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof ir.a) && kotlin.jvm.internal.o.b(((ir.a) obj).f293811a.c(), this.f293811a.c());
    }

    @Override // ir.k0
    public final ir.r p() {
        return this.f293811a;
    }
}
