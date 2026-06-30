package mm2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f329359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ce2 f329360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(mm2.w wVar, r45.ce2 ce2Var) {
        super(0);
        this.f329359d = wVar;
        this.f329360e = ce2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string = this.f329360e.getString(0);
        if (string == null) {
            string = "";
        }
        mm2.w.N6(this.f329359d, string);
        return jz5.f0.f302826a;
    }
}
