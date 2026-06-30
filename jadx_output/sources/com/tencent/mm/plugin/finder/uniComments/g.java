package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f130246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130247b;

    public g(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f130247b = o0Var;
        this.f130246a = recyclerView;
    }

    public final void a(long j17, long j18, boolean z17) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f130246a;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130247b;
        if (j17 != 0) {
            int e17 = o0Var.f130326h.e();
            java.util.ArrayList arrayList = o0Var.f130326h.f130342a;
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
                jv2.d dVar = (jv2.d) next;
                if (dVar.f302207d.t0() == j17) {
                    i17 = i18;
                }
                if (dVar.f302207d.t0() == j17 || dVar.f302207d.A0() == j17) {
                    arrayList2.add(next);
                }
                i18 = i19;
            }
            int size = arrayList2.size();
            arrayList.removeAll(arrayList2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(size);
            if (z17 && valueOf.intValue() >= 0 && valueOf.intValue() + valueOf2.intValue() <= e17 && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyItemRangeRemoved(valueOf.intValue(), valueOf2.intValue());
            }
        } else {
            java.util.ArrayList arrayList3 = o0Var.f130326h.f130342a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next2 = it6.next();
                if (((jv2.d) next2).f302207d.field_localCommentId == j18) {
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
