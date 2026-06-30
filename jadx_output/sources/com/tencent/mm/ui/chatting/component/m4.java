package com.tencent.mm.ui.chatting.component;

/* loaded from: classes3.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f199477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f199478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f199479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(android.view.ViewGroup viewGroup, android.graphics.drawable.BitmapDrawable bitmapDrawable, android.graphics.Bitmap bitmap) {
        super(0);
        this.f199477d = viewGroup;
        this.f199478e = bitmapDrawable;
        this.f199479f = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f199477d.getOverlay().remove(this.f199478e);
        this.f199479f.recycle();
        return jz5.f0.f302826a;
    }
}
