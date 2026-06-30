package gn4;

/* loaded from: classes15.dex */
public class d extends fn4.d {
    @Override // fn4.d
    public void b(fn4.b bVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView = bVar.getRecyclerView();
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 instanceof gn4.d0) {
            gn4.d0 d0Var = (gn4.d0) a17;
            int adapterPosition = d0Var != null ? d0Var.getAdapterPosition() : -1;
            if (adapterPosition != bVar.Y2() && bVar.I2().f264576e) {
                bVar.I2().m();
                if (d0Var != null) {
                    bVar.o4().e(d0Var.f264584e);
                }
            }
            bVar.t();
            for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
                android.view.View childAt = recyclerView.getChildAt(i17);
                if (childAt.getTag() != null) {
                    gn4.d0 d0Var2 = (gn4.d0) bVar.getRecyclerView().w0(childAt);
                    if (d0Var2.getAdapterPosition() == adapterPosition) {
                        d0Var2.m();
                        if (!bVar.I2().f264576e) {
                            d0Var2.f273605h.s();
                        }
                    } else {
                        d0Var2.f273605h.t();
                    }
                }
            }
        }
    }

    @Override // fn4.d
    public void c(fn4.b bVar) {
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 != null && (a17 instanceof gn4.d0)) {
            if (!bVar.I2().f264576e) {
                if (bVar.s1().b()) {
                    bVar.a2(a17.f264584e);
                    a17.s(true);
                } else {
                    a17.i().h();
                    bVar.I2().m();
                }
            }
            a17.m();
            bVar.X1(a17.u());
        }
        bVar.o4().c();
    }
}
