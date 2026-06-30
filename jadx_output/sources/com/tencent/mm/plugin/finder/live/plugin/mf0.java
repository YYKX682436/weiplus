package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class mf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f113493e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(android.view.View view, android.graphics.Bitmap bitmap) {
        super(0);
        this.f113492d = view;
        this.f113493e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f113492d;
        view.setBackground(new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), this.f113493e));
        return jz5.f0.f302826a;
    }
}
