package jf5;

/* loaded from: classes11.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f299455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f299456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.text.Spanned spanned, int i17) {
        super(1);
        this.f299455d = spanned;
        this.f299456e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jf5.k it = (jf5.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.text.Spanned spanned = this.f299455d;
        int spanStart = spanned.getSpanStart(it);
        int spanEnd = spanned.getSpanEnd(it);
        int i17 = this.f299456e;
        return java.lang.Boolean.valueOf(spanStart <= i17 && i17 < spanEnd);
    }
}
