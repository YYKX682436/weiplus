package kj2;

/* loaded from: classes10.dex */
public final class b implements si2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.o f308385a;

    public b(kj2.o oVar) {
        this.f308385a = oVar;
    }

    @Override // si2.c
    public void a(int i17, r45.xn1 contact) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(contact, "contact");
        kj2.o oVar = this.f308385a;
        vi2.h hVar = (vi2.h) kz5.n0.a0(oVar.f308429h, i17);
        if (hVar != null) {
            hVar.f437550d = vi2.g.f437547e;
        }
        oVar.f308430i.notifyItemChanged(i17);
        fj2.s sVar = fj2.s.f263183a;
        ml2.w4 w4Var = ml2.w4.f328190h;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) contact.getCustom(0);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        kotlinx.coroutines.y0 a17 = oVar.f308424c.a();
        if (a17 != null) {
            kotlinx.coroutines.l.d(a17, null, null, new kj2.d(oVar, contact, i17, null), 3, null);
        }
    }
}
