package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f117817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f117818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f117819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.widget.e30 e30Var, yz5.l lVar) {
        super(0);
        this.f117817d = bitmap;
        this.f117818e = e30Var;
        this.f117819f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f117819f;
        com.tencent.mm.plugin.finder.live.widget.e30 e30Var = this.f117818e;
        android.graphics.Bitmap bitmap = this.f117817d;
        if (bitmap != null) {
            e30Var.f118217v.setLayerPaint(null);
            e30Var.f118217v.setImageBitmap(bitmap);
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            com.tencent.mars.xlog.Log.i(e30Var.f118213r, "updateCheerIcon resource is null!");
            e30Var.f118217v.setImageDrawable(com.tencent.mm.ui.uk.e(e30Var.f365323d.getContext(), com.tencent.mm.R.raw.icons_filled_call_good, e30Var.G));
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        }
        return jz5.f0.f302826a;
    }
}
