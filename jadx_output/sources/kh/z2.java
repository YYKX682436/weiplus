package kh;

/* loaded from: classes12.dex */
public final class z2 extends kh.a3 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f307964f;

    /* renamed from: g, reason: collision with root package name */
    public final int f307965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(java.lang.String pattern, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(pattern, "pattern");
        this.f307964f = pattern;
        this.f307965g = i17;
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        kotlin.jvm.internal.o.g(threadIdCard, "threadIdCard");
        java.lang.String str = threadIdCard.f307799a;
        java.lang.String str2 = this.f307964f;
        if (!r26.i0.A(str, str2, false, 2, null)) {
            if (!kotlin.jvm.internal.o.b(str, str2 + 'J')) {
                return 0;
            }
        }
        return this.f307965g;
    }

    public /* synthetic */ z2(java.lang.String str, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(str, (i18 & 2) != 0 ? 1 : i17);
    }
}
