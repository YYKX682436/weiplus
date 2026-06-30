package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public class s2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.v2 f211968d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f211969e;

    /* renamed from: f, reason: collision with root package name */
    public int f211970f = -1;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y2 f211971g;

    public s2(java.util.List list, com.tencent.mm.ui.widget.dialog.y2 y2Var) {
        this.f211969e = list;
        this.f211971g = y2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f211969e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        final com.tencent.mm.ui.widget.dialog.u2 u2Var = new com.tencent.mm.ui.widget.dialog.u2(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ejz, viewGroup, false));
        u2Var.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.s2$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.ui.widget.dialog.v2 v2Var;
                com.tencent.mm.ui.widget.dialog.s2 s2Var = com.tencent.mm.ui.widget.dialog.s2.this;
                s2Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.ui.widget.dialog.u2 u2Var2 = u2Var;
                arrayList.add(u2Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", s2Var, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(u2Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", s2Var, array2);
                int adapterPosition = u2Var2.getAdapterPosition();
                if (adapterPosition == -1 || (v2Var = s2Var.f211968d) == null) {
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    v2Var.a(adapterPosition, s2Var.f211969e.get(adapterPosition));
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(s2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$FilterAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = u2Var.f212003e;
        weImageView.setIconColor(weImageView.getContext().getColor(com.tencent.mm.R.color.agh));
        return u2Var;
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(com.tencent.mm.ui.widget.dialog.u2 u2Var, int i17) {
        u2Var.f212002d.setText(((com.tencent.mm.ui.widget.dialog.p2) this.f211969e.get(i17)).f211946b);
        u2Var.f212003e.setRotation(i17 == this.f211970f ? 270.0f : 90.0f);
        com.tencent.mm.ui.widget.dialog.y2 y2Var = this.f211971g;
        if (y2Var == com.tencent.mm.ui.widget.dialog.y2.Border) {
            u2Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.d_5);
        } else if (y2Var == com.tencent.mm.ui.widget.dialog.y2.Grey) {
            u2Var.itemView.setBackgroundResource(com.tencent.mm.R.drawable.d5c);
        } else {
            u2Var.itemView.setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        com.tencent.mm.ui.widget.dialog.u2 u2Var = (com.tencent.mm.ui.widget.dialog.u2) k3Var;
        if (list.isEmpty()) {
            onBindViewHolder(u2Var, i17);
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            java.lang.Object obj = pair.first;
            if (obj == com.tencent.mm.ui.widget.dialog.t2.IsExpand) {
                boolean booleanValue = ((java.lang.Boolean) pair.second).booleanValue();
                if (booleanValue) {
                    this.f211970f = i17;
                } else if (this.f211970f == i17) {
                    this.f211970f = -1;
                }
                android.view.ViewPropertyAnimator animate = u2Var.f212003e.animate();
                animate.cancel();
                animate.rotation(booleanValue ? 270.0f : 90.0f);
                animate.setDuration(300L);
                animate.start();
            } else if (obj == com.tencent.mm.ui.widget.dialog.t2.UpdateTitle) {
                u2Var.f212002d.setText((java.lang.String) pair.second);
            } else {
                onBindViewHolder(u2Var, i17);
            }
        }
    }
}
