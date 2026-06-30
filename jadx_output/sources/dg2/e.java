package dg2;

/* loaded from: classes2.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f232288d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f232289e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f232290f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f232291g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f232292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dg2.m f232293i;

    public e(dg2.m mVar, java.util.LinkedList optionList) {
        kotlin.jvm.internal.o.g(optionList, "optionList");
        this.f232293i = mVar;
        this.f232288d = optionList;
        this.f232289e = new java.util.LinkedList();
        this.f232290f = jz5.h.b(new dg2.b(mVar));
        this.f232291g = jz5.h.b(new dg2.a(mVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f232288d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        dg2.f holder = (dg2.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f232288d.get(i17);
        holder.itemView.setOnClickListener(new dg2.c(holder));
        android.widget.CheckBox checkBox = holder.f232294d;
        checkBox.setChecked(false);
        checkBox.setOnCheckedChangeListener(new dg2.d(this, obj));
        android.view.View view = holder.f232296f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(i17 == getItemCount() + (-1) ? ((java.lang.Number) ((jz5.n) this.f232291g).getValue()).intValue() : ((java.lang.Number) ((jz5.n) this.f232290f).getValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        } else {
            marginLayoutParams = null;
        }
        view.setLayoutParams(marginLayoutParams);
        yz5.l lVar = this.f232293i.f232312g;
        holder.f232295e.setText(lVar != null ? (java.lang.String) lVar.invoke(obj) : null);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f488888dh0, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new dg2.f(inflate);
    }
}
