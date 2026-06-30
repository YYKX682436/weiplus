package g31;

/* loaded from: classes9.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f268077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, e31.j jVar) {
        super(1);
        this.f268076d = str;
        this.f268077e = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e31.i iVar = (e31.i) obj;
        if (iVar != null) {
            iVar.b(this.f268076d, this.f268077e);
        }
        return jz5.f0.f302826a;
    }
}
