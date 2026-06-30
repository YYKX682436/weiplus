package uv4;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv4.p f431443d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uv4.p pVar) {
        super(1);
        this.f431443d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        return java.lang.Boolean.valueOf(this.f431443d.w(path));
    }
}
