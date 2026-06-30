package d52;

/* loaded from: classes13.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d52.n f226544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d52.n nVar) {
        super(0);
        this.f226544d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("hellhound_msgq", new d52.l(this.f226544d));
        n3Var.setLogging(false);
        return n3Var;
    }
}
