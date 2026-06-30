package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes3.dex */
public final class ui extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui(android.widget.ImageView imageView) {
        super(0);
        this.f124271d = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f124271d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
