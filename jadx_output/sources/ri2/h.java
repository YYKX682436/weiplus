package ri2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ri2.j jVar) {
        super(0);
        this.f396053d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ri2.j jVar = this.f396053d;
        jVar.d(8);
        kotlinx.coroutines.r2 r2Var = jVar.A;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        jVar.A = null;
        bg2.d dVar = (bg2.d) jVar.f396059b.N6(bg2.d.class);
        if (dVar != null) {
            dVar.f19996h = null;
        }
        return jz5.f0.f302826a;
    }
}
