package wr;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f448737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wr.j jVar) {
        super(0);
        this.f448737d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar;
        wr.j jVar = this.f448737d;
        wr.c cVar = jVar.f448752c;
        if (cVar != null && (lVar = cVar.f448736d) != null) {
            lVar.invoke(cVar.f448733a);
        }
        jVar.f448751b = false;
        wr.j.a(jVar);
        return jz5.f0.f302826a;
    }
}
