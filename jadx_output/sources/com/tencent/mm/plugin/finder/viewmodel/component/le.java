package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class le extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.oe f135056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f135057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f135058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar, android.widget.TextView textView, com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        super(1);
        this.f135055d = view;
        this.f135056e = oeVar;
        this.f135057f = textView;
        this.f135058g = finderFullSeekBarLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar = this.f135056e;
            this.f135055d.setBackgroundColor(oeVar.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            java.lang.String string = oeVar.getContext().getResources().getString(com.tencent.mm.R.string.f2c);
            android.widget.TextView textView = this.f135057f;
            textView.setText(string);
            textView.setTextColor(oeVar.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
        this.f135058g.t("");
        return jz5.f0.f302826a;
    }
}
