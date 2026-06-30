package yi2;

/* loaded from: classes10.dex */
public final class s implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462588d;

    public s(yi2.i0 i0Var) {
        this.f462588d = i0Var;
    }

    public static final void a(vi2.b bVar, java.util.Map map) {
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        km2.q qVar = bVar.f437536f;
        java.lang.String username = (qVar == null || (xn1Var = qVar.f309187r) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername();
        if (username == null || username.length() == 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", "username is null or empty");
        } else {
            map.put(username, new hi2.a(bVar.f437536f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        yi2.i0 i0Var = this.f462588d;
        int u07 = i0Var.E.u0(view);
        if (u07 < 0 || u07 >= i0Var.f462521g.size()) {
            return;
        }
        java.lang.Object obj = i0Var.f462521g.get(u07);
        vi2.b bVar = obj instanceof vi2.b ? (vi2.b) obj : null;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorWidget", " dataList[position] is not FinderLiveMicAnchorWidgetConvertData");
            return;
        }
        int h17 = ((in5.c) i0Var.f462521g.get(u07)).h();
        if (h17 == 2) {
            if (i0Var.C) {
                i0Var.C = false;
                fj2.s.f263183a.d(ml2.q2.V, i0Var.f462535x, null);
                return;
            }
            return;
        }
        if (h17 == 3) {
            a(bVar, i0Var.f462537z);
            return;
        }
        if (h17 == 6) {
            a(bVar, i0Var.A);
            return;
        }
        switch (h17) {
            case 9:
                a(bVar, i0Var.B);
                return;
            case 10:
                i0Var.k();
                return;
            case 11:
                a(bVar, i0Var.f462537z);
                return;
            default:
                return;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
