package gn4;

/* loaded from: classes15.dex */
public class x0 extends fn4.d {
    @Override // fn4.d
    public void b(fn4.b bVar) {
        androidx.recyclerview.widget.RecyclerView recyclerView = bVar.getRecyclerView();
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 instanceof gn4.d1) {
            gn4.d1 d1Var = (gn4.d1) a17;
            int adapterPosition = d1Var != null ? d1Var.getAdapterPosition() : -1;
            if (adapterPosition != bVar.Y2() && bVar.I2().f264576e) {
                bVar.I2().m();
                if (d1Var != null) {
                    bVar.o4().e(d1Var.f264584e);
                }
            }
            bVar.t();
            for (int i17 = 0; i17 < recyclerView.getChildCount(); i17++) {
                android.view.View childAt = recyclerView.getChildAt(i17);
                if (childAt.getTag() != null) {
                    gn4.d1 d1Var2 = (gn4.d1) bVar.getRecyclerView().w0(childAt);
                    if (d1Var2.getAdapterPosition() == adapterPosition) {
                        d1Var2.m();
                        if (!bVar.I2().f264576e) {
                            d1Var2.f273605h.s();
                        }
                    } else {
                        d1Var2.f273605h.t();
                    }
                }
            }
        }
    }

    @Override // fn4.d
    public void c(fn4.b bVar) {
        fn4.m a17 = fn4.d.a(bVar);
        if (a17 instanceof gn4.d1) {
            if (!bVar.I2().f264576e) {
                if (bVar.s1().b()) {
                    a17.s(true);
                } else {
                    a17.i().h();
                    bVar.I2().m();
                }
            }
            a17.m();
            bVar.X1(a17.u());
            bVar.o4().c();
        }
    }
}
