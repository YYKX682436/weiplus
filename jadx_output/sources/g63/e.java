package g63;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f269100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f269101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g63.j jVar, z53.i iVar) {
        super(0);
        this.f269100d = jVar;
        this.f269101e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g63.j jVar = this.f269100d;
        int indexOf = jVar.f269130g.indexOf(this.f269101e);
        if (indexOf >= 0) {
            jVar.f269130g.remove(indexOf);
            jVar.notifyItemRemoved(indexOf);
        }
        return jz5.f0.f302826a;
    }
}
