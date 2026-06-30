package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class z1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f192103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MultiSelectContactView f192104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView, android.view.View view, int i17) {
        super(view);
        this.f192104e = multiSelectContactView;
        if (i17 != 1 || multiSelectContactView.f189792o.booleanValue()) {
            this.f192103d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9m);
            int i18 = multiSelectContactView.f189795r;
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i18, com.tencent.mm.ui.zk.e(multiSelectContactView.getContext(), com.tencent.mm.R.dimen.f479688cn) + i18);
            layoutParams.rightMargin = multiSelectContactView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
            view.setLayoutParams(layoutParams);
            view.setOnClickListener(new com.tencent.mm.pluginsdk.ui.u1(this, multiSelectContactView));
            return;
        }
        multiSelectContactView.f189800w = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486066k14);
        multiSelectContactView.j();
        multiSelectContactView.f189797t = (com.tencent.mm.ui.widget.MMEditText) view.findViewById(com.tencent.mm.R.id.f486065k13);
        multiSelectContactView.f189798u = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m7g);
        ck5.f b17 = ck5.f.b(multiSelectContactView.f189797t);
        b17.f42561f = 0;
        b17.f42560e = 100;
        b17.d(null);
        multiSelectContactView.f189797t.addTextChangedListener(new com.tencent.mm.pluginsdk.ui.v1(this, multiSelectContactView));
        multiSelectContactView.f189797t.setOnKeyListener(new com.tencent.mm.pluginsdk.ui.w1(this, multiSelectContactView));
        try {
            multiSelectContactView.f189797t.clearFocus();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiSeclectContactView", "clearFocus exception:%s", e17);
        }
        multiSelectContactView.f189797t.setOnFocusChangeListener(new com.tencent.mm.pluginsdk.ui.x1(this, multiSelectContactView));
        multiSelectContactView.f189797t.post(new com.tencent.mm.pluginsdk.ui.y1(this, multiSelectContactView));
        if (com.tencent.mm.sdk.platformtools.t8.K0(multiSelectContactView.f189799v)) {
            return;
        }
        multiSelectContactView.f189797t.setHint(multiSelectContactView.f189799v);
    }
}
