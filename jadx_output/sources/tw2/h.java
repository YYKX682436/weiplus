package tw2;

/* loaded from: classes2.dex */
public class h extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public int f422472g;

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 10003) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.ech, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return inflate;
        }
        android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.b2h, parent, false);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        return inflate2;
    }

    public final void I(eb5.e eVar, r45.mb4 mb4Var, android.widget.ImageView imageView) {
        if (eVar.p(com.tencent.mm.R.id.tbn) != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M0).getValue()).r()).booleanValue()) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                imageView.setLayoutParams(layoutParams2);
                layoutParams2.gravity = 17;
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            } else if (this.f422472g <= 0 || mb4Var.getFloat(4) <= 0.0f) {
                android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                imageView.setLayoutParams(layoutParams3);
                layoutParams3.gravity = 17;
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            } else {
                android.content.Context context = eVar.itemView.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    jz5.l a17 = hc2.f1.a(activity, mb4Var.getFloat(5) / mb4Var.getFloat(4), this.f422472g, "", 0L, 0, 0, 32, null);
                    jz5.l lVar = (jz5.l) a17.f302834e;
                    android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(((java.lang.Number) lVar.f302833d).intValue(), ((java.lang.Number) lVar.f302834e).intValue());
                    jz5.o oVar = (jz5.o) a17.f302833d;
                    layoutParams4.gravity = ((java.lang.Number) oVar.f302843f).intValue();
                    layoutParams4.topMargin = ((java.lang.Number) oVar.f302841d).intValue();
                    layoutParams4.bottomMargin = ((java.lang.Number) oVar.f302842e).intValue();
                    imageView.setLayoutParams(layoutParams4);
                } else {
                    android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    imageView.setLayoutParams(layoutParams5);
                    layoutParams5.gravity = 17;
                }
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        eVar.itemView.setTag(com.tencent.mm.R.id.teh, 0L);
        eVar.itemView.setTag(com.tencent.mm.R.id.tei, "");
        wo0.c a18 = e17.a(new mn2.u0(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null));
        a18.f447874e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J1).getValue()).r()).intValue() > 0 ? new ap0.g(null, null, 3, null) : null;
        a18.g(g1Var.h(mn2.f1.f329954e));
        a18.f447873d = new tw2.g(eVar, mb4Var);
        a18.c(imageView);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue() && ((r45.mb4) this.f250921d.get(i17)).getInteger(2) == 2) {
            if (((r45.a42) ((r45.mb4) this.f250921d.get(i17)).getCustom(67)) != null) {
                return com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
            }
            return 2;
        }
        return ((r45.mb4) this.f250921d.get(i17)).getInteger(2);
    }

    @Override // eb5.d, androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        eb5.e holder = (eb5.e) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onBindViewHolder(holder, i17);
        holder.f293125i = x(i17);
        int itemViewType = getItemViewType(i17);
        if (itemViewType == 2 || itemViewType == 7) {
            r45.mb4 mb4Var = (r45.mb4) x(i17);
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_j);
            kotlin.jvm.internal.o.d(mb4Var);
            kotlin.jvm.internal.o.d(imageView);
            I(holder, mb4Var, imageView);
            return;
        }
        if (itemViewType != 10003) {
            return;
        }
        r45.mb4 mb4Var2 = (r45.mb4) x(i17);
        com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout finderLivePhotoLayout = (com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout) holder.p(com.tencent.mm.R.id.tbn);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_j);
        r45.a42 a42Var = (r45.a42) mb4Var2.getCustom(67);
        if (finderLivePhotoLayout != null) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M0).getValue()).r()).booleanValue() || this.f422472g <= 0 || a42Var == null || a42Var.getFloat(1) <= 0.0f || a42Var.getFloat(2) <= 0.0f) {
                finderLivePhotoLayout.T();
            } else {
                com.tencent.mm.plugin.finder.view.image.FinderLivePhotoLayout.P(finderLivePhotoLayout, a42Var.getFloat(1), a42Var.getFloat(2), this.f422472g, 0L, 8, null);
            }
        }
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127919rf).getValue()).r()).booleanValue()) {
            kotlin.jvm.internal.o.d(imageView2);
            I(holder, mb4Var2, imageView2);
        }
    }
}
