package k63;

/* loaded from: classes14.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k63.m0 f304533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k63.m0 m0Var) {
        super(0);
        this.f304533d = m0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        k63.m0 m0Var = this.f304533d;
        m0Var.f304556g.m(true);
        os0.a aVar = m0Var.f304556g.f330951g;
        if (aVar != null) {
            aVar.f348006o = true;
        }
        int i17 = m0Var.f304558i;
        int i18 = m0Var.f304559m;
        ft0.h hVar = m0Var.f304557h;
        hVar.e(null, i17, i18);
        is0.c c17 = hVar.c();
        if (c17 != null) {
            int i19 = m0Var.f304558i;
            int i27 = m0Var.f304559m;
            c17.f294400m = i19;
            c17.f294401n = i27;
        }
        int i28 = m0Var.f304558i;
        int i29 = m0Var.f304559m;
        k63.w wVar = new k63.w(i28, i29, i28, i29, 2, 1);
        wVar.f348006o = false;
        wVar.f348007p = true;
        m0Var.f304561o = wVar;
        yz5.a aVar2 = m0Var.f304565s;
        if (aVar2 != null) {
            ((k63.e0) aVar2).invoke();
        }
        return jz5.f0.f302826a;
    }
}
