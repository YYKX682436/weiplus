package k50;

/* loaded from: classes.dex */
public final class k0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f304235d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f304236e;

    public k0(java.util.List items, yz5.p onItemClick) {
        kotlin.jvm.internal.o.g(items, "items");
        kotlin.jvm.internal.o.g(onItemClick, "onItemClick");
        this.f304235d = items;
        this.f304236e = onItemClick;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f304235d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object obj = this.f304235d.get(i17);
        k50.m0 m0Var = obj instanceof k50.m0 ? (k50.m0) obj : null;
        if (m0Var != null) {
            return m0Var.f304241a.f304222e ? 1 : 0;
        }
        throw new java.lang.IllegalArgumentException("Expected ListItem.App at position " + i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f304235d.get(i17);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.forward.ForwardToOtherAppsSheetUIC.ListItem.App");
        k50.i0 i0Var = (k50.i0) holder;
        k50.h0 h0Var = ((k50.m0) obj).f304241a;
        android.widget.ImageView imageView = i0Var.f304226d;
        if (imageView != null) {
            imageView.setImageDrawable(h0Var.f304218a);
        }
        android.widget.TextView textView = i0Var.f304227e;
        if (textView != null) {
            textView.setText(h0Var.f304219b);
        }
        java.lang.String str = h0Var.f304221d;
        boolean z17 = str == null || str.length() == 0;
        android.widget.TextView textView2 = i0Var.f304228f;
        if (!z17) {
            if (textView2 != null) {
                textView2.setText(h0Var.f304221d);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        i0Var.itemView.setOnClickListener(new k50.j0(this, h0Var, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489110ef1, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new k50.i0(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489109ef0, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new k50.i0(inflate2);
    }
}
