package tt2;

/* loaded from: classes3.dex */
public final class i1 extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f421939h = new java.util.ArrayList();

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(tt2.h1 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        r45.p45 pairingInfo = (r45.p45) ((java.util.ArrayList) this.f421939h).get(i17);
        kotlin.jvm.internal.o.g(pairingInfo, "pairingInfo");
        holder.f421928o.setText(pairingInfo.getString(1));
        holder.f421930q.setText(holder.f421927n.getContext().getString(com.tencent.mm.R.string.nty, java.lang.Integer.valueOf(pairingInfo.getList(4).size())));
        holder.f421929p.setOnClickListener(new tt2.g1(holder, pairingInfo));
        java.util.LinkedList list = pairingInfo.getList(4);
        kotlin.jvm.internal.o.f(list, "getImg_list(...)");
        r45.o45 o45Var = (r45.o45) kz5.n0.Z(list);
        androidx.recyclerview.widget.RecyclerView recyclerView = holder.f421931r;
        if (o45Var != null) {
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            layoutParams.height = (int) ((o45Var.getInteger(1) / o45Var.getInteger(2)) * com.tencent.mm.ui.bk.o(1.0f));
            recyclerView.setLayoutParams(layoutParams);
        }
        recyclerView.setLayoutManager(holder.f421932s);
        tt2.k1 k1Var = holder.f421933t;
        recyclerView.setAdapter(k1Var);
        k1Var.getClass();
        k1Var.f421951e = pairingInfo;
        java.util.ArrayList arrayList = (java.util.ArrayList) k1Var.f421950d;
        arrayList.clear();
        java.util.LinkedList list2 = pairingInfo.getList(4);
        kotlin.jvm.internal.o.f(list2, "getImg_list(...)");
        arrayList.addAll(list2);
        k1Var.notifyDataSetChanged();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327264s;
        cl0.g gVar = new cl0.g();
        ml2.f4 f4Var = ml2.f4.f327431e;
        gVar.o("commerceAction", 1068);
        gVar.p("pairing_id", pairingInfo.getLong(0));
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f421939h).size();
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        tt2.h1 holder = (tt2.h1) r0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ebh, (android.view.ViewGroup) null, false);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        return new tt2.h1(this, inflate);
    }
}
