package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.i f115494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f115496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115497g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115498h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115499i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.util.i iVar, android.graphics.Bitmap bitmap, java.lang.String str, android.graphics.Bitmap bitmap2, android.view.View view, yz5.l lVar) {
        super(0);
        this.f115494d = iVar;
        this.f115495e = bitmap;
        this.f115496f = str;
        this.f115497g = bitmap2;
        this.f115498h = view;
        this.f115499i = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f115494d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPlayerBackground bitmap size: ");
        android.graphics.Bitmap bitmap = this.f115495e;
        sb6.append(bitmap.getWidth());
        sb6.append('x');
        sb6.append(bitmap.getHeight());
        sb6.append(", fromURL: ");
        java.lang.String str = this.f115496f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("BlurAvatarUtil", sb6.toString());
        android.graphics.Bitmap bitmap2 = this.f115497g;
        if (bitmap2 != null) {
            android.view.View view = this.f115498h;
            if (view != null) {
                zl2.r4.f473950a.R2(view, bitmap2);
            }
            this.f115499i.invoke(bitmap);
            com.tencent.mm.plugin.finder.live.util.i.f115541b.put(str, new jz5.l(bitmap, bitmap2));
        }
        return jz5.f0.f302826a;
    }
}
