package jf5;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f299464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f299465e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(android.text.Spanned spanned, int i17) {
        super(1);
        this.f299464d = spanned;
        this.f299465e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jf5.k it = (jf5.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f299464d.getSpanEnd(it) == this.f299465e);
    }
}
