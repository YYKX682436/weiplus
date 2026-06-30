package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f116710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f116712f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f116710d = imageView;
        this.f116711e = finderLiveMiniView;
        this.f116712f = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = this.f116711e;
        this.f116710d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(finderLiveMiniView.getContext().getResources(), this.f116712f));
        com.tencent.mars.xlog.Log.i(finderLiveMiniView.getTAG(), "loadBackgroundImage success!");
        return jz5.f0.f302826a;
    }
}
