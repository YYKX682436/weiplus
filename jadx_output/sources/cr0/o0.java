package cr0;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f221696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.Object[] objArr) {
        super(0);
        this.f221696d = objArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String arrays = java.util.Arrays.toString(this.f221696d);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        return "#onTransactEnded: ".concat(arrays);
    }
}
