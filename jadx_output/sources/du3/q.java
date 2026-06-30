package du3;

/* loaded from: classes.dex */
public final class q extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f243679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f243680e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f243681f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f243682g;

    public q(yz5.l clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        this.f243679d = clickListener;
        this.f243680e = "MicroMsg.ImproveEditPhotoAiListAdapter";
        this.f243681f = new java.util.ArrayList();
        x(false);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f243681f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((du3.b) this.f243681f.get(i17)).f243520a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        du3.d holder = (du3.d) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f243681f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        du3.b bVar = (du3.b) obj;
        ((android.widget.TextView) ((jz5.n) holder.f243555d).getValue()).setText(bVar.f243522c);
        du3.a aVar = du3.b.f243513e;
        if (bVar.f243520a == 0) {
            holder.itemView.setOnClickListener(null);
            return;
        }
        holder.itemView.setOnClickListener(new du3.n(this, bVar));
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.pk(itemView, "sns_ai_template_btn");
        aVar2.fk(itemView, "sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi());
        aVar2.fk(itemView, "yb_content_type", java.lang.Integer.valueOf(this.f243682g ? 1 : 2));
        aVar2.fk(itemView, "yb_template_id", bVar.f243521b);
        aVar2.ik(itemView, 40, 36244);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == du3.b.f243519k) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eha, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return new du3.d((android.view.ViewGroup) inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ehb, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        return new du3.d((android.view.ViewGroup) inflate2);
    }

    public final void x(boolean z17) {
        java.util.ArrayList arrayList = this.f243681f;
        arrayList.clear();
        if (z17) {
            du3.a aVar = du3.b.f243513e;
            jz5.l lVar = du3.b.f243514f;
            java.lang.String str = (java.lang.String) lVar.f302833d;
            java.lang.Object obj = lVar.f302834e;
            kotlin.jvm.internal.o.f(obj, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar, str, (java.lang.String) obj, null, 4, null));
            jz5.l lVar2 = du3.b.f243515g;
            java.lang.String str2 = (java.lang.String) lVar2.f302833d;
            java.lang.Object obj2 = lVar2.f302834e;
            kotlin.jvm.internal.o.f(obj2, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar, str2, (java.lang.String) obj2, null, 4, null));
        } else {
            du3.a aVar2 = du3.b.f243513e;
            jz5.l lVar3 = du3.b.f243516h;
            java.lang.String str3 = (java.lang.String) lVar3.f302833d;
            java.lang.Object obj3 = lVar3.f302834e;
            kotlin.jvm.internal.o.f(obj3, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar2, str3, (java.lang.String) obj3, null, 4, null));
            jz5.l lVar4 = du3.b.f243517i;
            java.lang.String str4 = (java.lang.String) lVar4.f302833d;
            java.lang.Object obj4 = lVar4.f302834e;
            kotlin.jvm.internal.o.f(obj4, "<get-second>(...)");
            arrayList.add(du3.a.a(aVar2, str4, (java.lang.String) obj4, null, 4, null));
        }
        du3.a aVar3 = du3.b.f243513e;
        int i17 = du3.b.f243519k;
        java.lang.String str5 = du3.b.f243518j;
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.pdk);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_photo_edit_ai_template_host, "https://yuanbao.tencent.com/aigi/templates/", true);
        kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
        arrayList.add(new du3.b(i17, str5, r17, Zi));
        arrayList.add(aVar3.b());
        notifyDataSetChanged();
    }
}
