package wk2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17) {
        super(1);
        this.f446944d = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wk2.d it = (wk2.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f446938a == this.f446944d);
    }
}
