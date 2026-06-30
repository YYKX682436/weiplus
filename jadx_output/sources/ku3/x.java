package ku3;

/* loaded from: classes10.dex */
public final class x extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312451d;

    public x(ku3.i0 i0Var) {
        this.f312451d = i0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f312451d.f312251d.f475579g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        zt3.c cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        ku3.i0 i0Var = this.f312451d;
        java.lang.Integer num = (java.lang.Integer) i0Var.f312251d.f475578f.get(java.lang.Integer.valueOf(i17));
        if (num != null) {
            int intValue = num.intValue();
            androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) i0Var.f312251d.f475579g.get(java.lang.Integer.valueOf(intValue));
            if (j0Var == null || (cVar = (zt3.c) j0Var.getValue()) == null) {
                cVar = new zt3.c(intValue, false, null, false, false, 30, null);
            }
            zt3.c cVar2 = cVar;
            x(cVar2, frameLayout);
            frameLayout.setOnClickListener(new ku3.v(this.f312451d, i17, intValue, cVar2, this, frameLayout));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new ku3.w(com.tencent.mm.ui.id.b(this.f312451d.f312255h).inflate(com.tencent.mm.R.layout.f488261of, parent, false));
    }

    public final void x(zt3.c cVar, android.widget.FrameLayout frameLayout) {
        int i17;
        switch (cVar.f475587a) {
            case 1:
                i17 = com.tencent.mm.R.raw.icons_menu_light;
                break;
            case 2:
                i17 = com.tencent.mm.R.raw.icons_menu_night;
                break;
            case 3:
                i17 = com.tencent.mm.R.raw.icons_menu_portrait;
                break;
            case 4:
                i17 = com.tencent.mm.R.raw.icons_menu_hdr;
                break;
            case 5:
                i17 = com.tencent.mm.R.raw.icons_menu_filter;
                break;
            case 6:
                i17 = com.tencent.mm.R.raw.icons_menu_beauty;
                break;
            case 7:
                android.os.Bundle bundle = cVar.f475589c;
                int i18 = bundle != null ? bundle.getInt("PARAM_1_INT") : 3;
                if (i18 == 2) {
                    i17 = com.tencent.mm.R.raw.icons_menu_ratio_4_3;
                    break;
                } else if (i18 == 3) {
                    i17 = com.tencent.mm.R.raw.icons_menu_ratio_16_9;
                    break;
                } else {
                    i17 = com.tencent.mm.R.raw.icons_menu_ratio_1_1;
                    break;
                }
            case 8:
                i17 = com.tencent.mm.R.raw.icons_menu_guides;
                break;
            case 9:
                i17 = com.tencent.mm.R.raw.icons_menu_countdown;
                break;
            default:
                i17 = -1;
                break;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout.findViewById(com.tencent.mm.R.id.jgr);
        boolean z17 = cVar.f475588b;
        int i19 = z17 ? com.tencent.mm.R.drawable.f481087kd : com.tencent.mm.R.drawable.f481088ke;
        int i27 = cVar.f475590d ? z17 ? com.tencent.mm.R.color.f478772gs : com.tencent.mm.R.color.f478773gt : com.tencent.mm.R.color.f478771gr;
        frameLayout.setBackground(i65.a.i(this.f312451d.f312255h, i19));
        weImageView.s(i17, i27);
    }
}
