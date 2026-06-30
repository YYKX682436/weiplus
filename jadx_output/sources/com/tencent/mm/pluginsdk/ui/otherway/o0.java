package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public class o0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.otherway.n0 f190982e = new com.tencent.mm.pluginsdk.ui.otherway.n0(null);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e5d;
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.tencent.mm.pluginsdk.ui.otherway.w data, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel appBrandOpenMaterialModel;
        com.tencent.mm.pluginsdk.model.o0 o0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e1s);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e1t);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.tad);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.ta9);
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(null);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        holder.itemView.setEnabled(true);
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        if (i18 == 1) {
            textView.setText(holder.f293121e.getString(com.tencent.mm.R.string.o_v));
            imageView.setImageResource(com.tencent.mm.R.drawable.d8j);
            weImageView.setVisibility(0);
            weImageView.s(com.tencent.mm.R.raw.dot_3_regular, com.tencent.mm.R.color.abw);
            return;
        }
        com.tencent.mm.pluginsdk.ui.otherway.n0 n0Var = f190982e;
        if (i18 == 2) {
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = data.f191014d;
            if (xVar != null) {
                textView.setText(xVar.f191029e.toString());
                if (xVar.f191030f == null) {
                    android.content.Context context = holder.itemView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    android.content.pm.ResolveInfo ri6 = xVar.f191028d;
                    kotlin.jvm.internal.o.f(ri6, "ri");
                    xVar.f191030f = n0Var.b(context, ri6);
                }
                imageView.setImageDrawable(xVar.f191030f);
                return;
            }
            return;
        }
        if (i18 == 3) {
            com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel appBrandOpenMaterialDetailModel = data.f191015e;
            if (appBrandOpenMaterialDetailModel == null || (appBrandOpenMaterialModel = appBrandOpenMaterialDetailModel.f86255d) == null) {
                return;
            }
            textView.setText(appBrandOpenMaterialModel.f86267i);
            imageView2.setBackgroundResource(com.tencent.mm.R.drawable.d8i);
            imageView2.setImageResource(com.tencent.mm.R.raw.app_brand_open_material_badge_icon);
            java.lang.String str = appBrandOpenMaterialModel.f86265g;
            kotlin.jvm.internal.o.d(imageView);
            com.tencent.mm.pluginsdk.ui.otherway.n0.d(n0Var, str, imageView, 0.0f, false, 12, null);
            imageView2.setVisibility(0);
            return;
        }
        if (i18 != 4) {
            if (i18 == 5 && (o0Var = data.f191017g) != null) {
                textView.setText(o0Var.f189390b);
                java.lang.Integer num = o0Var.f189392d;
                if (num != null) {
                    imageView.setImageResource(num.intValue());
                    imageView.setColorFilter(0);
                }
                holder.itemView.setEnabled(o0Var.f189393e);
                return;
            }
            return;
        }
        com.tencent.mm.feature.exdevice.NetworkDeviceInfo networkDeviceInfo = data.f191016f;
        if (networkDeviceInfo != null) {
            if (imageView != null) {
                imageView.setImageResource(com.tencent.mm.R.drawable.d8j);
            }
            if (weImageView != null) {
                weImageView.setVisibility(0);
                com.tencent.mm.pluginsdk.ui.otherway.n0.d(n0Var, networkDeviceInfo.f66589g, weImageView, 0.0f, false, 12, null);
            }
            textView.setText(networkDeviceInfo.f66588f);
        }
    }
}
