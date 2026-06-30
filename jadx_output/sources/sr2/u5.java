package sr2;

/* loaded from: classes10.dex */
public final class u5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.v5 f411735a;

    public u5(sr2.v5 v5Var) {
        this.f411735a = v5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            if (!((r45.gq2) fVar.f70618d).getList(1).isEmpty()) {
                sr2.v5 v5Var = this.f411735a;
                v5Var.f411744e = true;
                v5Var.f411745f = ((r45.gq2) fVar.f70618d).getList(1).size();
                java.util.LinkedList list = ((r45.gq2) fVar.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list, "getUsual_topics(...)");
                v5Var.f411747h = list;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) v5Var.getActivity().findViewById(com.tencent.mm.R.id.gca);
                v5Var.f411743d = linearLayout;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(sr2.r5.f411706d);
                }
                android.widget.LinearLayout linearLayout2 = v5Var.f411743d;
                androidx.recyclerview.widget.RecyclerView recyclerView = linearLayout2 != null ? (androidx.recyclerview.widget.RecyclerView) linearLayout2.findViewById(com.tencent.mm.R.id.gcb) : null;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(v5Var.getActivity(), 0, false));
                    recyclerView.N(new sr2.s5(v5Var));
                    sr2.p5 p5Var = new sr2.p5(list, new sr2.t5(v5Var));
                    v5Var.f411748i = p5Var;
                    recyclerView.setAdapter(p5Var);
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.PostTopicUIC", "[requestPostPreData] usual_topics.size=" + ((r45.gq2) fVar.f70618d).getList(1).size());
        } else {
            com.tencent.mars.xlog.Log.i("Finder.PostTopicUIC", "[requestPostPreData] errType=" + fVar.f70615a + " errCode=" + fVar.f70616b + " errMsg=" + fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
