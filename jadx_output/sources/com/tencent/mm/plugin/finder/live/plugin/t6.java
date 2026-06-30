package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f114349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var) {
        super(0);
        this.f114349d = v6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f114349d;
        v6Var.f114677z = null;
        android.view.ViewGroup viewGroup = v6Var.f365323d;
        android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_call_good);
        com.tencent.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        v6Var.f114668q.setImageDrawable(drawable);
        return jz5.f0.f302826a;
    }
}
