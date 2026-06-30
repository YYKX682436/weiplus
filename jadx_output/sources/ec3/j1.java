package ec3;

/* loaded from: classes9.dex */
public final class j1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489251ej3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int b17;
        int i19;
        android.widget.ImageView imageView;
        ec3.k1 item = (ec3.k1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        com.tencent.mm.plugin.luckymoney.model.p6 p6Var = item.f251045d;
        java.lang.String str = p6Var != null ? p6Var.f145545d : null;
        boolean z18 = p6Var != null && p6Var.f145546e == 1;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) holder.p(com.tencent.mm.R.id.ue7);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f485784ue5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ue6);
        android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ue9);
        android.widget.ImageView imageView5 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.ue8);
        zl5.b bVar = zl5.b.f474086a;
        zl5.b.b(bVar, relativeLayout, i65.a.b(context, 1), false, false, 12, null);
        zl5.b.b(bVar, imageView2, i65.a.b(context, 1), false, false, 12, null);
        zl5.b.b(bVar, imageView3, i65.a.b(context, 1), false, false, 12, null);
        if (str == null || str.length() == 0) {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            if (imageView3 != null) {
                imageView3.setImageBitmap(null);
            }
            if (imageView4 != null) {
                imageView4.setImageBitmap(null);
            }
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            if (imageView5 != null && imageView5.getVisibility() == 4) {
                imageView5.setVisibility(0);
                return;
            }
            return;
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (z18) {
            h0Var.f310123d = imageView4;
            b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 26);
            i19 = (int) (b17 / 0.5818f);
            imageView = imageView3;
        } else {
            h0Var.f310123d = imageView3;
            b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 24);
            i19 = (int) (b17 / 0.59385f);
            imageView = imageView4;
        }
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        r45.wv3 wv3Var = new r45.wv3();
        r45.xv3 xv3Var = new r45.xv3();
        xv3Var.K = str;
        wv3Var.f389501g = xv3Var;
        wv3Var.f389498d = str;
        wv3Var.f389500f = str;
        android.widget.ImageView imageView6 = (android.widget.ImageView) h0Var.f310123d;
        if (imageView6 != null) {
            imageView6.setImageBitmap(null);
        }
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).oj((android.widget.ImageView) h0Var.f310123d, wv3Var, b17, i19, new ec3.i1(h0Var, imageView2, imageView5));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
