package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lw implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ow f113440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113441b;

    public lw(com.tencent.mm.plugin.finder.live.plugin.ow owVar, int i17) {
        this.f113440a = owVar;
        this.f113441b = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = this.f113440a;
            java.util.ArrayList arrayList = owVar.f113799y;
            int i17 = this.f113441b;
            synchronized (arrayList) {
                int i18 = no0.i.f338727a;
                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i18, i18, true);
                kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
                owVar.f113799y.add(createScaledBitmap);
                owVar.f113801z.add(java.lang.Integer.valueOf(i17));
            }
        }
    }
}
