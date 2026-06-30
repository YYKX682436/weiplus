package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class i1 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.q1 f206882a;

    public i1(com.tencent.mm.ui.contact.item.q1 q1Var) {
        this.f206882a = q1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cci, viewGroup, false);
        com.tencent.mm.ui.contact.item.h1 h1Var = (com.tencent.mm.ui.contact.item.h1) ((jz5.n) this.f206882a.H).getValue();
        kotlin.jvm.internal.o.e(h1Var, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.RecentForwardListDataItem.RecentForwardListViewHolder");
        androidx.recyclerview.widget.RecyclerView recyclerView = inflate != null ? (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.llt) : null;
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        h1Var.f206875b = recyclerView;
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gze) : null;
        kotlin.jvm.internal.o.e(textView, "null cannot be cast to non-null type android.widget.TextView");
        h1Var.f206876c = textView;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.widget.LinearLayout linearLayout = inflate != null ? (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.m7p) : null;
        kotlin.jvm.internal.o.e(linearLayout, "null cannot be cast to non-null type android.widget.LinearLayout");
        h1Var.f206874a = linearLayout;
        inflate.setTag(h1Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        if ((bVar instanceof com.tencent.mm.ui.contact.item.h1) && (dVar instanceof com.tencent.mm.ui.contact.item.q1)) {
            com.tencent.mm.ui.contact.item.q1 q1Var = this.f206882a;
            java.util.ArrayList arrayList = q1Var.C;
            com.tencent.mm.ui.contact.item.h1 h1Var = (com.tencent.mm.ui.contact.item.h1) bVar;
            q1Var.h(arrayList != null ? com.tencent.mm.ui.contact.t8.a(arrayList) : false, h1Var);
            boolean z19 = q1Var.f206836e;
            java.util.ArrayList arrayList2 = q1Var.C;
            if (arrayList2 != null) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.ui.contact.w8 w8Var = ((com.tencent.mm.ui.contact.v8) it.next()).f207220d;
                    w8Var.f207234d = z19;
                    if (!z19) {
                        w8Var.f207233c = false;
                    }
                }
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = h1Var.f206875b;
            if (recyclerView != null) {
                if (recyclerView.getAdapter() == null) {
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 0, false));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(q1Var.G);
                } else {
                    androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
            }
            if (q1Var.f206836e) {
                q1Var.i(false);
            }
        }
    }
}
