package xl2;

/* loaded from: classes.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f455113a;

    public b(yz5.q qVar) {
        this.f455113a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        yz5.q qVar = this.f455113a;
        if (qVar == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70616b);
        java.util.LinkedList list = ((r45.g13) fVar.f70618d).getList(2);
        kotlin.jvm.internal.o.f(list, "getSong_infos(...)");
        java.util.LinkedList list2 = ((r45.g13) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list2, "getBlock_song_names(...)");
        qVar.invoke(valueOf, list, list2);
        return jz5.f0.f302826a;
    }
}
