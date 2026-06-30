package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f130273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130274b;

    public j2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f130274b = q3Var;
        this.f130273a = recyclerView;
    }

    public final void a(long j17, long j18, boolean z17) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f130273a;
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130274b;
        if (j17 != 0) {
            int f17 = q3Var.f130369f.f();
            java.util.ArrayList arrayList = q3Var.f130369f.f130360a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            int i17 = -1;
            int i18 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                jv2.i iVar = (jv2.i) next;
                if (iVar.f302223d.t0() == j17) {
                    i17 = i18;
                }
                if (iVar.f302223d.t0() == j17 || iVar.f302223d.J0() == j17) {
                    arrayList2.add(next);
                }
                i18 = i19;
            }
            int size = arrayList2.size();
            arrayList.removeAll(arrayList2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(size);
            if (z17 && valueOf.intValue() >= 0 && valueOf.intValue() + valueOf2.intValue() <= f17 && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeRemoved(valueOf.intValue(), valueOf2.intValue());
            }
        } else {
            java.util.ArrayList arrayList3 = q3Var.f130369f.f130360a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (((jv2.i) next2).f302223d.field_localCommentId == j18) {
                    arrayList4.add(next2);
                }
            }
            arrayList3.removeAll(arrayList4);
        }
        androidx.recyclerview.widget.f2 adapter2 = recyclerView.getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
}
