package ht2;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f284919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284922g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.protocal.protobuf.FinderObject finderObject, zy2.r6 r6Var, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, ht2.y0 y0Var) {
        super(2);
        this.f284919d = finderObject;
        this.f284920e = r6Var;
        this.f284921f = weImageView;
        this.f284922g = y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setIconInTimeLineFeedLike] ");
        sb6.append(pm0.v.u(this.f284919d.getId()));
        sb6.append(" bitmap is null?");
        sb6.append(bitmap == null);
        sb6.append(" url=");
        sb6.append(url);
        com.tencent.mars.xlog.Log.i("Finder.DynamicIconResService", sb6.toString());
        zy2.r6 r6Var = this.f284920e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f284921f;
        if (bitmap != null) {
            if (r6Var.f477551b) {
                weImageView.setAlpha(1.0f);
            } else {
                weImageView.setAlpha(0.8f);
            }
            weImageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(weImageView.getResources(), bitmap));
        } else {
            this.f284922g.rj(weImageView, r6Var);
        }
        return jz5.f0.f302826a;
    }
}
