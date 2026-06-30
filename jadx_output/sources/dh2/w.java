package dh2;

/* loaded from: classes10.dex */
public final class w implements ah2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232466a;

    public w(dh2.x xVar) {
        this.f232466a = xVar;
    }

    public int a() {
        return ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) this.f232466a.f232468e.a(om2.e.class)).f346292h).getValue()).intValue();
    }

    public int b() {
        return ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) this.f232466a.f232468e.a(om2.e.class)).f346291g).getValue()).intValue();
    }

    public boolean c() {
        dh2.x xVar = this.f232466a;
        return ((mm2.c1) xVar.f232468e.a(mm2.c1.class)).O4 || ((mm2.o4) xVar.f232468e.a(mm2.o4.class)).C7();
    }

    public boolean d() {
        dh2.x xVar = this.f232466a;
        int ordinal = xVar.f232472i.ordinal();
        if (ordinal == 0) {
            return ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) xVar.f232468e.a(om2.e.class)).f346290f).getValue()).booleanValue();
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        mm2.m6 m6Var = (mm2.m6) xVar.f232468e.a(mm2.m6.class);
        java.lang.Object value = ((kotlinx.coroutines.flow.h3) m6Var.f329251s).getValue();
        mm2.i6 i6Var = value instanceof mm2.i6 ? (mm2.i6) value : null;
        return ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) m6Var.f329256x).getValue()).booleanValue() && (i6Var != null ? i6Var.f329143c : true);
    }
}
