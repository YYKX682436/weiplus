package pk2;

/* loaded from: classes3.dex */
public final class t extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356252h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356253i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f356254j;

    /* renamed from: k, reason: collision with root package name */
    public final int f356255k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(pk2.o9 helper, int i17, int i18, int i19) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356252h = i19;
        this.f356253i = "";
        this.f356254j = jz5.h.b(new pk2.s(helper));
        this.f356255k = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        jf2.j jVar;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        jf2.u uVar = (jf2.u) ((jz5.n) this.f356254j).getValue();
        if (uVar != null) {
            java.util.Iterator it = uVar.f299402q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    jVar = 0;
                    break;
                } else {
                    jVar = it.next();
                    if (((jf2.h) jVar).type() == this.f356252h) {
                        break;
                    }
                }
            }
            jf2.j jVar2 = jVar instanceof jf2.j ? jVar : null;
            if (jVar2 != null) {
                jVar2.e(0);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356253i;
    }

    @Override // qk2.f
    public boolean o() {
        java.lang.Object obj;
        jf2.u uVar = (jf2.u) ((jz5.n) this.f356254j).getValue();
        if (uVar == null) {
            return false;
        }
        java.util.Iterator it = uVar.f299402q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.h) obj).type() == this.f356252h) {
                break;
            }
        }
        return obj != null;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        jf2.u uVar = (jf2.u) ((jz5.n) this.f356254j).getValue();
        if (uVar != null) {
            java.util.Iterator it = uVar.f299402q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((jf2.h) obj).type() == this.f356252h) {
                        break;
                    }
                }
            }
            jf2.j jVar = obj instanceof jf2.j ? (jf2.j) obj : null;
            jz5.l d17 = jVar != null ? jVar.d() : null;
            if (d17 != null) {
                r(menu, this.f356255k, ((java.lang.Number) d17.f302834e).intValue(), ((java.lang.Number) d17.f302833d).intValue());
            }
        }
    }

    @Override // qk2.h
    public int y() {
        return this.f356255k;
    }
}
