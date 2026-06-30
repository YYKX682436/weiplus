package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rm0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(0);
        this.f114167d = viewGroup;
        this.f114168e = wn0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114167d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f114168e;
        com.tencent.mm.plugin.finder.live.wish.widget.x xVar = new com.tencent.mm.plugin.finder.live.wish.widget.x(context, wn0Var, wn0Var, wn0Var);
        wd2.g gVar = xVar.f118384g;
        android.content.Context context2 = gVar.f444834a;
        gVar.f444837d.setBackgroundDrawable(context2.getResources().getDrawable(com.tencent.mm.R.drawable.aji));
        gVar.f444843j.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        gVar.f444844k.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        gVar.f444845l.setTextColor(context2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        gVar.f444840g.setBackground(context2.getResources().getDrawable(com.tencent.mm.R.drawable.a6z));
        gVar.f444841h.setIconColor(context2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        return xVar;
    }
}
