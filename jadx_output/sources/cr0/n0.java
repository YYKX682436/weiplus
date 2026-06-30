package cr0;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f221690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(java.lang.Object[] objArr) {
        super(0);
        this.f221690d = objArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String arrays = java.util.Arrays.toString(this.f221690d);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        return "#onTransactStarted: ".concat(arrays);
    }
}
