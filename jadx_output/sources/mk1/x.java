package mk1;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str) {
        super(0);
        this.f327128d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String url = this.f327128d;
        kotlin.jvm.internal.o.g(url, "url");
        return new mk1.w(this.f327128d, url, ve1.g.m(url), null, null, null);
    }
}
