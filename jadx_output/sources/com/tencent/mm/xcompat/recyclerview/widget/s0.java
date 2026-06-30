package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class s0 implements com.tencent.mm.xcompat.recyclerview.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214631a;

    public s0(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214631a = recyclerView;
    }

    public void a(com.tencent.mm.xcompat.recyclerview.widget.b bVar) {
        int i17 = bVar.f214453a;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214631a;
        if (i17 == 1) {
            recyclerView.f214413t.getClass();
            return;
        }
        if (i17 == 2) {
            recyclerView.f214413t.getClass();
        } else if (i17 == 4) {
            recyclerView.f214413t.getClass();
        } else {
            if (i17 != 8) {
                return;
            }
            recyclerView.f214413t.getClass();
        }
    }

    public com.tencent.mm.xcompat.recyclerview.widget.y1 b(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214631a;
        int h17 = recyclerView.f214402i.h();
        int i18 = 0;
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = null;
        while (true) {
            if (i18 >= h17) {
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(recyclerView.f214402i.g(i18));
            if (K != null && !K.m() && K.f214705f == i17) {
                if (!recyclerView.f214402i.j(K.f214703d)) {
                    y1Var = K;
                    break;
                }
                y1Var = K;
            }
            i18++;
        }
        if (y1Var == null) {
            return null;
        }
        if (!recyclerView.f214402i.j(y1Var.f214703d)) {
            return y1Var;
        }
        boolean z17 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1;
        return null;
    }

    public void c(int i17, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214631a;
        int h17 = recyclerView.f214402i.h();
        int i28 = i18 + i17;
        for (int i29 = 0; i29 < h17; i29++) {
            android.view.View g17 = recyclerView.f214402i.g(i29);
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(g17);
            if (K != null && !K.y() && (i27 = K.f214705f) >= i17 && i27 < i28) {
                K.c(2);
                K.b(obj);
                ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) g17.getLayoutParams()).f214427c = true;
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView.f214399f;
        java.util.ArrayList arrayList = n1Var.f214590c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                recyclerView.J1 = true;
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(size);
            if (y1Var != null && (i19 = y1Var.f214705f) >= i17 && i19 < i28) {
                y1Var.c(2);
                n1Var.f(size);
            }
        }
    }

    public void d(int i17, int i18) {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214631a;
        int h17 = recyclerView.f214402i.h();
        for (int i19 = 0; i19 < h17; i19++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(recyclerView.f214402i.g(i19));
            if (K != null && !K.y() && K.f214705f >= i17) {
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    K.toString();
                }
                K.v(i18, false);
                recyclerView.F1.f214651f = true;
            }
        }
        java.util.ArrayList arrayList = recyclerView.f214399f.f214590c;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i27);
            if (y1Var != null && y1Var.f214705f >= i17) {
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    y1Var.toString();
                }
                y1Var.v(i18, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.I1 = true;
    }

    public void e(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214631a;
        int h17 = recyclerView.f214402i.h();
        int i47 = -1;
        if (i17 < i18) {
            i27 = i17;
            i19 = i18;
            i28 = -1;
        } else {
            i19 = i17;
            i27 = i18;
            i28 = 1;
        }
        for (int i48 = 0; i48 < h17; i48++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.K(recyclerView.f214402i.g(i48));
            if (K != null && (i39 = K.f214705f) >= i27 && i39 <= i19) {
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    K.toString();
                }
                if (K.f214705f == i17) {
                    K.v(i18 - i17, false);
                } else {
                    K.v(i28, false);
                }
                recyclerView.F1.f214651f = true;
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = recyclerView.f214399f;
        n1Var.getClass();
        if (i17 < i18) {
            i37 = i17;
            i29 = i18;
        } else {
            i29 = i17;
            i37 = i18;
            i47 = 1;
        }
        java.util.ArrayList arrayList = n1Var.f214590c;
        int size = arrayList.size();
        for (int i49 = 0; i49 < size; i49++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i49);
            if (y1Var != null && (i38 = y1Var.f214705f) >= i37 && i38 <= i29) {
                if (i38 == i17) {
                    y1Var.v(i18 - i17, false);
                } else {
                    y1Var.v(i47, false);
                }
                if (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z1) {
                    y1Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.I1 = true;
    }
}
