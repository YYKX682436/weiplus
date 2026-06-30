package uc5;

/* loaded from: classes4.dex */
public final class e0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f426480d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f426481e;

    public e0(java.util.List items, java.lang.String talker) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f426480d = items;
        this.f426481e = talker;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f426480d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        uc5.d0 holder = (uc5.d0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        aq.a aVar = (aq.a) kz5.n0.a0(this.f426480d, i17);
        if (aVar == null) {
            return;
        }
        java.lang.String talker = this.f426481e;
        kotlin.jvm.internal.o.g(talker, "talker");
        int h17 = i65.a.h(holder.itemView.getContext(), com.tencent.mm.R.dimen.f479729dl);
        gk0.k kVar = new gk0.k(h17, h17);
        kVar.f272434e = com.tencent.mm.R.color.f478490b;
        ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ai(holder.f426479d, aVar.f12827b, kVar);
        holder.itemView.setOnClickListener(new uc5.c0(aVar, talker, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eko, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new uc5.d0(inflate);
    }
}
