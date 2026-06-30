package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pf0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f113872b;

    public pf0(java.lang.String str, android.widget.ImageView imageView) {
        this.f113871a = str;
        this.f113872b = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!kotlin.jvm.internal.o.b(((mn2.h3) aVar.f293573a).getUrl(), this.f113871a) || bitmap == null) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.of0(this.f113872b, bitmap));
    }
}
