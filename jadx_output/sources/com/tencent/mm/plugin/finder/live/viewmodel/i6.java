package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.b8 f117144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var) {
        super(0);
        this.f117144d = b8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        int width = (k0Var == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) k0Var.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null || (viewGroup = o9Var.f365323d) == null) ? 0 : viewGroup.getWidth();
        com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = this.f117144d;
        android.view.View findViewById = b8Var.getRootView().findViewById(com.tencent.mm.R.id.f484763fg3);
        int width2 = findViewById.getWidth();
        int i17 = 2;
        if (j65.f.f297943g <= 1.0f) {
            int i18 = width2 - width;
            i17 = ((i18 >= 0 ? i18 : 0) / 2) + ((int) b8Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9));
        }
        findViewById.setPadding(i17, findViewById.getPaddingTop(), i17, findViewById.getPaddingBottom());
        return jz5.f0.f302826a;
    }
}
