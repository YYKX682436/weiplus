package vg2;

/* loaded from: classes3.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f436611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f436612e;

    public w(vg2.a0 a0Var, java.util.List itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f436612e = a0Var;
        this.f436611d = itemList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f436611d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        vg2.u holder = (vg2.u) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = holder.f436592d;
        x(textView);
        android.widget.TextView textView2 = holder.f436593e;
        x(textView2);
        java.util.List list = this.f436611d;
        textView2.setTextSize(list.size() > 5 ? 15.0f : 17.0f);
        textView.setTextSize(list.size() <= 5 ? 17.0f : 15.0f);
        textView2.setText(java.lang.String.valueOf(((r45.pv1) list.get(i17)).getInteger(0)));
        holder.itemView.setOnClickListener(new vg2.v(this.f436612e, this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f436612e.f436465a).inflate(com.tencent.mm.R.layout.as6, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.d(inflate);
        return new vg2.u(this, inflate);
    }

    public final void x(android.widget.TextView textView) {
        try {
            textView.setTypeface(android.graphics.Typeface.createFromAsset(this.f436612e.f436465a.getAssets(), "fonts/SF-Pro-Display-BoldItalic.otf"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("GiftBatchSelectToastWidget", "setLiveGiftTypeFace error", e17);
        }
    }
}
