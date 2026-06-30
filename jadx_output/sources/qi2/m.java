package qi2;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363569e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qi2.n nVar, android.content.Context context) {
        super(0);
        this.f363568d = nVar;
        this.f363569e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qi2.n nVar = this.f363568d;
        gk2.e g17 = nVar.f363577h.g();
        qi2.l lVar = new qi2.l(nVar);
        return new qi2.v(g17, nVar.f363577h, this.f363569e, lVar);
    }
}
