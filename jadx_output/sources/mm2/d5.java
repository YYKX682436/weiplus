package mm2;

/* loaded from: classes3.dex */
public final class d5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.e5 f328958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(mm2.e5 e5Var) {
        super(0);
        this.f328958d = e5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.e5 e5Var = this.f328958d;
        synchronized (e5Var) {
            e5Var.f329006m.clear();
        }
        return jz5.f0.f302826a;
    }
}
