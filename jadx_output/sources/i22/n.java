package i22;

/* loaded from: classes15.dex */
public final class n extends i22.p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f288006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f288007b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String productId, int i17) {
        super(productId, null);
        kotlin.jvm.internal.o.g(productId, "productId");
        this.f288006a = productId;
        this.f288007b = i17;
    }

    @Override // i22.p
    public java.lang.String a() {
        return this.f288006a;
    }
}
