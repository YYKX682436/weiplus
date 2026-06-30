package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bw extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f117924h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l f117925i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(android.content.Context context) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f118384g.c(context.getResources().getDrawable(com.tencent.mm.R.drawable.cof));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View b() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118381d);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_close);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public android.view.View c() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(this.f118381d);
        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_help);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        weImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(weImageView.getContext(), 24), i65.a.b(weImageView.getContext(), 24)));
        return weImageView;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488994dj1;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.nr7);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.aw(this));
        }
        ya2.g gVar = ya2.h.f460484a;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        ya2.b2 b17 = gVar.b(c1Var != null ? c1Var.f328852o : null);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.kou);
        if (textView == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = b17 != null ? b17.w0() : "";
        textView.setText(this.f118381d.getString(com.tencent.mm.R.string.lv_, objArr));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void v() {
        yz5.a aVar = this.f117924h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
