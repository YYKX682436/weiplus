package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class i implements db5.i4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190962a;

    public i(com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190962a = vVar;
    }

    @Override // db5.i4
    public final void a(android.widget.ImageView imageView, android.view.MenuItem menuItem) {
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) this.f190962a.f191012m.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (wVar != null) {
            if (wVar.h() != 3) {
                imageView.setVisibility(8);
                return;
            }
            int h17 = i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.f479672c9);
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = h17;
                layoutParams2.height = h17;
                layoutParams2.rightMargin = i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.f479688cn);
                layoutParams2.bottomMargin = i65.a.h(imageView.getContext(), com.tencent.mm.R.dimen.f479672c9);
            }
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.d8i);
            imageView.setImageResource(com.tencent.mm.R.raw.app_brand_open_material_badge_icon);
        }
    }
}
