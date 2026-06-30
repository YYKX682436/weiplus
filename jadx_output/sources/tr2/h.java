package tr2;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17) {
        super(1);
        this.f421383d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = this.f421383d;
        if (intValue < i17) {
            intValue = i17;
        }
        return java.lang.Integer.valueOf(intValue);
    }
}
