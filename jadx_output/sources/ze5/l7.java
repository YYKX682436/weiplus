package ze5;

/* loaded from: classes9.dex */
public final class l7 extends ze5.i7 {
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean a0() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (dVar == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.j7(f9Var, dVar), ze5.k7.f472050d);
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.mvvm.MvvmView k17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).k(context);
        k17.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
        k17.setForeground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481171me));
        k17.setPadding(0, 0, i65.a.b(context, 5), 0);
        return k17;
    }
}
