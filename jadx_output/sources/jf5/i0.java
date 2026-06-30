package jf5;

/* loaded from: classes11.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f299469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f299470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.text.Spanned spanned, int i17) {
        super(1);
        this.f299469d = spanned;
        this.f299470e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jf5.k it = (jf5.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f299469d.getSpanStart(it) == this.f299470e);
    }
}
