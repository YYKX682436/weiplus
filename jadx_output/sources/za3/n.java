package za3;

/* loaded from: classes8.dex */
public final class n extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f470994d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f470995e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f470996f;

    /* renamed from: g, reason: collision with root package name */
    public int f470997g;

    public n(android.content.Context context, java.util.List data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f470994d = context;
        this.f470995e = data;
        this.f470997g = -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f470995e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        za3.l holder = (za3.l) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = this.f470994d;
        float a17 = ym5.x.a(context, 8.0f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getColor(com.tencent.mm.R.color.a9e));
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        gradientDrawable2.setCornerRadii(i17 == 0 ? new float[]{a17, a17, a17, a17, 0.0f, 0.0f, 0.0f, 0.0f} : i17 == getItemCount() - 1 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, a17, a17, a17, a17} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        holder.f470973d.setBackground(stateListDrawable);
        com.tencent.mm.plugin.location.ui.impl.f0 f0Var = (com.tencent.mm.plugin.location.ui.impl.f0) this.f470995e.get(i17);
        holder.f470974e.setText(f0Var.f144811c);
        android.widget.TextView textView = holder.f470975f;
        boolean z17 = f0Var.f144810b;
        if (z17) {
            textView.setVisibility(0);
            textView.setText(context.getString(com.tencent.mm.R.string.pgm));
        } else {
            textView.setVisibility(8);
        }
        java.lang.String str = f0Var.f144812d;
        boolean z18 = str == null || str.length() == 0;
        android.widget.TextView textView2 = holder.f470976g;
        if (z18) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        android.widget.ImageView imageView = holder.f470977h;
        boolean z19 = f0Var.f144809a;
        if (z19 || z17) {
            if (z19) {
                imageView.setColorFilter(this.f470997g, android.graphics.PorterDuff.Mode.SRC_IN);
            }
            java.lang.String str2 = f0Var.f144815g;
            if (str2 != null) {
                n11.a.b().g(str2, imageView);
            }
        } else {
            android.graphics.drawable.Drawable drawable = f0Var.f144814f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        if (z19) {
            android.view.View view = holder.f470978i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = holder.f470978i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i17 < getItemCount() - 1) {
            android.view.View view3 = holder.f470979m;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = holder.f470979m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/location/ui/PoiNavigationAppAdapter$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.itemView.setOnClickListener(new za3.m(this, f0Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.els, parent, false);
        this.f470997g = b3.l.getColor(parent.getContext(), com.tencent.mm.R.color.f478822i7);
        kotlin.jvm.internal.o.d(inflate);
        return new za3.l(inflate);
    }
}
