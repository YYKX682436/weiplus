package it2;

/* loaded from: classes3.dex */
public final class b implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f294501d;

    public b(java.lang.ref.WeakReference rPlugin) {
        kotlin.jvm.internal.o.g(rPlugin, "rPlugin");
        this.f294501d = rPlugin;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String giftId = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(giftId, "giftId");
        com.tencent.mars.xlog.Log.i("CustomGiftResourceDownloadListener", giftId + " download success:" + booleanValue);
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = (com.tencent.mm.plugin.finder.live.plugin.hm) this.f294501d.get();
        if (hmVar != null && booleanValue) {
            d75.b.g(new it2.a(hmVar));
        }
        return jz5.f0.f302826a;
    }
}
