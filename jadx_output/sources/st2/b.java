package st2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.c f412222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(st2.c cVar) {
        super(1);
        this.f412222d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qa5 it = (r45.qa5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        st2.c cVar = this.f412222d;
        st2.c.a(cVar);
        yz5.l lVar = cVar.f412239d;
        if (lVar != null) {
            lVar.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
