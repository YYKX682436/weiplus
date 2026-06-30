package g63;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.j f269104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f269105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g63.j jVar, z53.i iVar) {
        super(0);
        this.f269104d = jVar;
        this.f269105e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g63.j jVar = this.f269104d;
        java.util.LinkedList linkedList = jVar.f269130g;
        z53.i iVar = this.f269105e;
        int indexOf = linkedList.indexOf(iVar);
        java.util.LinkedList linkedList2 = jVar.f269130g;
        if (indexOf >= 0) {
            linkedList2.remove(indexOf);
            jVar.notifyItemRemoved(indexOf);
        }
        linkedList2.add(0, iVar);
        jVar.notifyItemInserted(0);
        return jz5.f0.f302826a;
    }
}
