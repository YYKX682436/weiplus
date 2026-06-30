package gr5;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f274942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i17) {
        super(1);
        this.f274942d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf((((java.lang.Number) obj).intValue() & this.f274942d) != 0);
    }
}
