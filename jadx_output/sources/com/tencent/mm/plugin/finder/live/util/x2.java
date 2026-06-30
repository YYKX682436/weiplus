package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes2.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(android.graphics.Bitmap bitmap, android.view.View view, java.lang.String str) {
        super(0);
        this.f115746d = bitmap;
        this.f115747e = view;
        this.f115748f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f115746d;
        if (bitmap != null) {
            android.view.View view = this.f115747e;
            view.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), bitmap));
        } else {
            com.tencent.mars.xlog.Log.i("SquareConvertUtil", "bindHighTagView background resource is null, url = " + this.f115748f);
        }
        return jz5.f0.f302826a;
    }
}
