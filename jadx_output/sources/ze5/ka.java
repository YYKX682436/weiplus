package ze5;

/* loaded from: classes9.dex */
public abstract class ka {
    public static void a(android.widget.LinearLayout linearLayout, rd5.d dVar, yb5.d ui6, com.tencent.mm.ui.chatting.viewitems.g0 g0Var) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        java.lang.Object[] objArr = {ze5.y8.a(te5.q0.f418727d, te5.t0.f418750d, te5.u0.f418751d)};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        ze5.y8.b(java.util.Collections.unmodifiableList(arrayList), linearLayout, ui6, dVar, g0Var);
    }

    public static qd5.a b(rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        ic5.e eVar = ic5.f.f290437c;
        if (eVar.b(f9Var).isEmpty()) {
            return null;
        }
        java.lang.String b17 = eVar.b(dVar.f394254d.f445300b);
        java.lang.String v17 = dVar.v();
        if (v17 == null) {
            v17 = "";
        }
        return new ze5.u9(b17, v17);
    }
}
