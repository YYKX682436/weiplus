package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nf0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113630b;

    public nf0(java.lang.String str, android.view.View view) {
        this.f113629a = str;
        this.f113630b = view;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!kotlin.jvm.internal.o.b(((mn2.h3) aVar.f293573a).getUrl(), this.f113629a) || bitmap == null) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.mf0(this.f113630b, com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, i65.a.b(r2.getContext(), 22))));
    }
}
