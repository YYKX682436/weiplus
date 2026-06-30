package d22;

/* loaded from: classes12.dex */
public final class b0 extends qk.j7 implements d22.v {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f225829h;

    public b0(java.lang.String productId) {
        kotlin.jvm.internal.o.g(productId, "productId");
        this.f225829h = productId;
    }

    @Override // d22.v
    public boolean a() {
        return false;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.c0();
    }

    @Override // d22.v
    public boolean isValid() {
        return this.f225829h.length() > 0;
    }
}
