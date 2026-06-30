package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes12.dex */
public class q2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.p2 f211953d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.v2 f211954e;

    public q2(com.tencent.mm.ui.widget.dialog.l2 l2Var) {
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.ui.widget.dialog.p2 p2Var = this.f211953d;
        if (p2Var == null) {
            return 0;
        }
        return p2Var.a();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.ui.widget.dialog.r2 r2Var = (com.tencent.mm.ui.widget.dialog.r2) k3Var;
        r2Var.f211961d.setText(this.f211953d.c(i17));
        java.lang.CharSequence b17 = this.f211953d.b(i17);
        android.widget.TextView textView = r2Var.f211962e;
        if (b17 != null) {
            textView.setVisibility(0);
            textView.setText(b17);
        } else {
            textView.setVisibility(8);
        }
        boolean z17 = this.f211953d.f211947c == i17;
        android.widget.ImageView imageView = r2Var.f211963f;
        if (z17) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.byf, viewGroup, false);
        final com.tencent.mm.ui.widget.dialog.r2 r2Var = new com.tencent.mm.ui.widget.dialog.r2(inflate);
        inflate.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.q2$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.ui.widget.dialog.v2 v2Var;
                com.tencent.mm.ui.widget.dialog.q2 q2Var = com.tencent.mm.ui.widget.dialog.q2.this;
                q2Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.ui.widget.dialog.r2 r2Var2 = r2Var;
                arrayList.add(r2Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", q2Var, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(r2Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", q2Var, array2);
                int adapterPosition = r2Var2.getAdapterPosition();
                if (adapterPosition == -1 || (v2Var = q2Var.f211954e) == null) {
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else {
                    v2Var.a(adapterPosition, q2Var.f211953d);
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    yj0.a.h(q2Var, "com/tencent/mm/ui/widget/dialog/MMFilterDialog$DropdownAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        });
        return r2Var;
    }
}
