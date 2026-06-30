package gk4;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f272593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gk4.r rVar) {
        super(0);
        this.f272593d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gk4.r rVar = this.f272593d;
        if (rVar.f272614s) {
            rVar.f(rVar.f272617v);
        } else {
            yz5.a aVar = rVar.f272601f;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f272593d.c();
        }
        return jz5.f0.f302826a;
    }
}
