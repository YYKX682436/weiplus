package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        super(0);
        this.f129754d = finderActivityDescUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f129754d.T;
        if (imageView != null) {
            imageView.setVisibility(0);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("coverImageView");
        throw null;
    }
}
