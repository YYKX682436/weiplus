package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class zm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f133478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f133479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm(kotlin.jvm.internal.h0 h0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f133478d = h0Var;
        this.f133479e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((android.widget.ImageView) this.f133478d.f310123d).setImageBitmap(this.f133479e);
        return jz5.f0.f302826a;
    }
}
