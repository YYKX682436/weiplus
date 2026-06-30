package g45;

/* loaded from: classes9.dex */
public abstract class c {
    public static final boolean a(oi3.g gVar) {
        kotlin.jvm.internal.o.g(gVar, "<this>");
        int integer = gVar.getInteger(gVar.f345617d + 4);
        return integer == 3 || integer == 13 || integer == 23 || integer == 33 || integer == 39;
    }

    public static final j15.a b(com.tencent.mm.storage.f9 f9Var) {
        kotlin.jvm.internal.o.g(f9Var, "<this>");
        if (f9Var.H > 0 && f9Var.I > 0) {
            j15.a aVar = new j15.a();
            aVar.Y(f9Var.H);
            aVar.U(f9Var.I);
            return aVar;
        }
        j15.d dVar = new j15.d();
        java.lang.String j17 = f9Var.j();
        if (j17 == null) {
            j17 = "";
        }
        dVar.fromXml(j17);
        if ((!com.tencent.mm.sdk.platformtools.t8.K0(dVar.o().y())) && dVar.o().q() == 0 && dVar.o().n() == 0) {
            dVar.o().Y(dVar.o().I());
            dVar.o().U(dVar.o().F());
        }
        return dVar.o();
    }
}
