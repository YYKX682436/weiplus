package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class yd0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.de0 f115187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.t12 f115188e;

    public yd0(com.tencent.mm.plugin.finder.live.plugin.de0 de0Var, r45.t12 t12Var) {
        this.f115187d = de0Var;
        this.f115188e = t12Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = this.f115187d;
        int width = de0Var.v1().getWidth();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.view.ViewGroup viewGroup = de0Var.f365323d;
        android.content.Context context = viewGroup.getContext();
        r45.t12 t12Var = this.f115188e;
        java.lang.String string = t12Var.getString(2);
        ((ke0.e) xVar).getClass();
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string), de0Var.v1().getPaint(), width, android.text.Layout.Alignment.ALIGN_NORMAL, de0Var.v1().getLineSpacingMultiplier(), de0Var.v1().getLineSpacingExtra(), true);
        int height = viewGroup.getHeight();
        jz5.g gVar = de0Var.f112278s;
        int height2 = height - ((android.widget.ScrollView) ((jz5.n) gVar).getValue()).getHeight();
        int b17 = i65.a.b(viewGroup.getContext(), 155) - height2;
        if (staticLayout.getHeight() > b17) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = viewGroup.getContext();
            java.lang.String string2 = t12Var.getString(2);
            ((ke0.e) xVar2).getClass();
            int height3 = (int) ((new android.text.StaticLayout(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, string2), de0Var.v1().getPaint(), width, android.text.Layout.Alignment.ALIGN_NORMAL, de0Var.v1().getLineSpacingMultiplier(), de0Var.v1().getLineSpacingExtra(), true).getHeight() / staticLayout.getLineCount()) * 2 * 1.2f);
            viewGroup.getLayoutParams().height = height3 > b17 ? height3 + height2 : b17 + height2;
            ((android.widget.ScrollView) ((jz5.n) gVar).getValue()).getHeight();
        }
        de0Var.v1().post(new com.tencent.mm.plugin.finder.live.plugin.xd0(de0Var));
    }
}
