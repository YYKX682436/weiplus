package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class i4 extends com.tencent.mm.ui.chatting.component.a implements yn.e {
    @Override // yn.d
    public void Y(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 w0Var) {
        java.util.LinkedList linkedList;
        if (w0Var == null || (linkedList = w0Var.f293156i) == null || linkedList.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            in5.c cVar = ((in5.x0) it.next()).f293158a;
            rd5.d dVar = cVar instanceof rd5.d ? (rd5.d) cVar : null;
            if (dVar == null) {
                return;
            }
            yb5.d mChattingContext = this.f198580d;
            kotlin.jvm.internal.o.f(mChattingContext, "mChattingContext");
            ((com.tencent.mm.ui.chatting.viewitems.wr) com.tencent.mm.ui.chatting.viewitems.xr.a(mChattingContext)).b(dVar.h()).S(this.f198580d, dVar);
        }
    }
}
