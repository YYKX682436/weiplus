package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes9.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f151027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f151028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e8 f151029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.mv.ui.uic.e8 e8Var) {
        super(0);
        this.f151027d = bitmap;
        this.f151028e = imageView;
        this.f151029f = e8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f151028e.setImageBitmap(com.tencent.mm.sdk.platformtools.x.W(this.f151027d, 0.5f, 15, false, -1L));
        com.tencent.mm.plugin.mv.ui.uic.e8 e8Var = this.f151029f;
        if (e8Var != null) {
            android.graphics.Bitmap bitmap = this.f151027d;
            kotlin.jvm.internal.o.f(bitmap, "$bitmap");
            e8Var.a(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
