package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f114092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f114093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.plugin.v6 v6Var) {
        super(0);
        this.f114092d = bitmap;
        this.f114093e = v6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f114093e;
        android.graphics.Bitmap bitmap = this.f114092d;
        if (bitmap != null) {
            v6Var.f114668q.setLayerPaint(null);
            v6Var.f114668q.setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i(v6Var.f114667p, "updateCheerIcon resource is null!");
            v6Var.f114677z = null;
            android.view.ViewGroup viewGroup = v6Var.f365323d;
            android.graphics.drawable.Drawable drawable = viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_call_good);
            com.tencent.mm.ui.uk.f(drawable, viewGroup.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            v6Var.f114668q.setImageDrawable(drawable);
        }
        return jz5.f0.f302826a;
    }
}
