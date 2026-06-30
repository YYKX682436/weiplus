package vg2;

/* loaded from: classes3.dex */
public final class b1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f436480d;

    /* renamed from: e, reason: collision with root package name */
    public int f436481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436482f;

    public b1(vg2.r1 r1Var, java.util.LinkedList data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f436482f = r1Var;
        this.f436480d = data;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f436480d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vg2.y0 holder = (vg2.y0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f436480d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.yi6 yi6Var = (r45.yi6) obj;
        try {
            holder.f436620d.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(yi6Var.getString(6))));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("GiftSkinSelectPanelWidget", "color:" + yi6Var.getString(6) + " is not valid");
        }
        holder.itemView.setTag(com.tencent.mm.R.id.f3a, java.lang.Integer.valueOf(i17));
        int i18 = this.f436481e;
        android.view.View view = holder.f436621e;
        if (i18 == i17) {
            view.setScaleX(1.3f);
            view.setScaleY(1.3f);
        } else {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "live_gift_color_select");
        dy1.r ik6 = aVar.ik(holder.itemView, 8, 25652);
        android.view.View view2 = holder.itemView;
        vg2.r1 r1Var = this.f436482f;
        ((cy1.a) ik6).gk(view2, kz5.c1.k(new jz5.l("gift_id", r1Var.f436567h.field_rewardProductId), new jz5.l("thing_index", vg2.r1.b(r1Var)), new jz5.l("gift_color", yi6Var.getString(6))));
        holder.itemView.setOnClickListener(new vg2.a1(this, holder, r1Var, yi6Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f436482f.f436560a).inflate(com.tencent.mm.R.layout.as8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        return new vg2.y0(this, inflate);
    }
}
