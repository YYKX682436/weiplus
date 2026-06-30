package r26;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ char[] f368898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f368899e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(char[] cArr, boolean z17) {
        super(2);
        this.f368898d = cArr;
        this.f368899e = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.CharSequence $receiver = (java.lang.CharSequence) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g($receiver, "$this$$receiver");
        int M = r26.n0.M($receiver, this.f368898d, intValue, this.f368899e);
        if (M < 0) {
            return null;
        }
        return new jz5.l(java.lang.Integer.valueOf(M), 1);
    }
}
