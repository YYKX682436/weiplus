package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class rv extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f135836d;

    public rv(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        this.f135836d = sxVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f135836d.S6().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        x91.c cVar;
        com.tencent.mm.plugin.finder.viewmodel.component.sv holder = (com.tencent.mm.plugin.finder.viewmodel.component.sv) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f135836d;
        com.tencent.mm.plugin.finder.viewmodel.component.tv tvVar = (com.tencent.mm.plugin.finder.viewmodel.component.tv) kz5.n0.a0(sxVar.S6(), i17);
        if (tvVar != null) {
            x91.h hVar = tvVar.f136061a;
            holder.f135921d.setText((hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452639g);
            holder.f135922e.setVisibility(8);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.qv(sxVar, tvVar));
            android.app.Activity context = sxVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(holder.itemView, "projection_choice");
            aVar.ik(holder.itemView, 40, 25496);
            android.view.View view = holder.itemView;
            jz5.l[] lVarArr = new jz5.l[2];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(sxVar.f135943y));
            lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View inflate = android.view.View.inflate(view.getContext(), com.tencent.mm.R.layout.b7t, null);
        inflate.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a1f));
        return new com.tencent.mm.plugin.finder.viewmodel.component.sv(this.f135836d, inflate);
    }
}
