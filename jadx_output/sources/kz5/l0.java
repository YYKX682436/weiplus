package kz5;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i17) {
        super(1);
        this.f313983d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        throw new java.lang.IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f313983d + '.');
    }
}
