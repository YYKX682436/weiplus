package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public abstract class i2 {
    public static final qd5.b a(androidx.recyclerview.widget.k3 k3Var) {
        qd5.a aVar;
        if (!(k3Var instanceof qd5.e) || (aVar = ((qd5.e) k3Var).f361907o) == null) {
            return null;
        }
        java.lang.Object tag = k3Var.itemView.getTag();
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = tag instanceof com.tencent.mm.ui.chatting.viewitems.g0 ? (com.tencent.mm.ui.chatting.viewitems.g0) tag : null;
        if (g0Var == null) {
            return null;
        }
        return aVar.a(g0Var);
    }

    public static final qd5.g b(androidx.recyclerview.widget.k3 k3Var) {
        qd5.f fVar;
        com.tencent.mm.mvvm.MvvmView mvvmView;
        z01.w wVar;
        java.util.Map map = null;
        if (!(k3Var instanceof qd5.e) || (fVar = ((qd5.e) k3Var).f361906n) == null) {
            return null;
        }
        java.lang.Object tag = k3Var.itemView.getTag();
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = tag instanceof com.tencent.mm.ui.chatting.viewitems.g0 ? (com.tencent.mm.ui.chatting.viewitems.g0) tag : null;
        if (g0Var == null) {
            return null;
        }
        ye5.a0 a0Var = (ye5.a0) fVar;
        ze5.n8 n8Var = g0Var instanceof ze5.n8 ? (ze5.n8) g0Var : null;
        if (n8Var == null || (mvvmView = n8Var.f472111c) == null) {
            return null;
        }
        java.lang.String b17 = ic5.f.f290437c.b(a0Var.f461240a.f394254d.f445300b);
        z01.v vVar = (z01.v) mvvmView.getViewModel();
        if (vVar != null && (wVar = vVar.f469169g) != null) {
            yz5.a aVar = wVar.f469173a;
            java.util.List list = aVar != null ? (java.util.List) aVar.invoke() : null;
            if (list != null) {
                map = d75.b.d(list, ye5.z.f461290d);
            }
        }
        return new qd5.g(b17, map);
    }

    public static final void c(androidx.recyclerview.widget.RecyclerView recyclerView, java.lang.String groupId, yz5.l lVar) {
        kotlin.jvm.internal.o.g(recyclerView, "<this>");
        kotlin.jvm.internal.o.g(groupId, "groupId");
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        boolean z17 = false;
        if (itemAnimator != null && itemAnimator.o()) {
            z17 = true;
        }
        if (z17) {
            if (lVar != null) {
                lVar.invoke(com.tencent.mm.ui.chatting.view.a.f202869d);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaGroupFoldItemAnimator", "[armMediaFoldOnce] already running!");
            return;
        }
        androidx.recyclerview.widget.n2 itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.k();
        }
        com.tencent.mm.ui.chatting.view.e2 e2Var = new com.tencent.mm.ui.chatting.view.e2(groupId);
        e2Var.f202927x = new com.tencent.mm.ui.chatting.view.f2(lVar, recyclerView, e2Var);
        if (lVar != null) {
            lVar.invoke(com.tencent.mm.ui.chatting.view.a.f202870e);
        }
        recyclerView.setItemAnimator(e2Var);
    }

    public static final void d(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewGroup) {
            d(viewGroup, (android.view.View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        android.graphics.Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }
}
