package fy;

/* loaded from: classes11.dex */
public final class i implements ey.o {

    /* renamed from: b, reason: collision with root package name */
    public static final fy.i f267170b = new fy.i();

    public static final boolean c(fy.i iVar, com.tencent.mm.storage.z3 z3Var) {
        iVar.getClass();
        java.lang.String d17 = z3Var.d1();
        boolean z17 = true;
        if (d17 != null) {
            if (!com.tencent.mm.storage.z3.R4(d17) && !com.tencent.mm.storage.z3.D3(z3Var.f1()) && !c01.e2.W(d17) && !com.tencent.mm.storage.z3.G4(d17) && !com.tencent.mm.storage.z3.m4(d17)) {
                z17 = false;
            }
            if (z17) {
                z3Var.P0();
            }
        }
        return z17;
    }

    @Override // ey.o
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.o
    public java.util.Map b() {
        return kz5.c1.k(new jz5.l("search_contacts", fy.e.f267166d), new jz5.l("search_contacts_by_pinyin", fy.g.f267168d), new jz5.l("display_contact_list", fy.h.f267169d));
    }
}
