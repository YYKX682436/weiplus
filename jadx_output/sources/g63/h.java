package g63;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f269119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f269120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g63.j jVar, z53.i iVar) {
        super(0);
        this.f269119d = jVar;
        this.f269120e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g63.j jVar = this.f269119d;
        java.util.LinkedList linkedList = jVar.f269130g;
        z53.i iVar = this.f269120e;
        int indexOf = linkedList.indexOf(iVar);
        if (indexOf >= 0) {
            jVar.f269130g.set(indexOf, iVar);
            jVar.notifyItemChanged(indexOf);
        }
        return jz5.f0.f302826a;
    }
}
