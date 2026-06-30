package xt2;

/* loaded from: classes3.dex */
public final class a6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList f456624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList) {
        super(1);
        this.f456624d = finderLiveShoppingSkuList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        int i17 = com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList.f126333p;
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingSkuList", "on bounce offset = " + intValue);
        com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList finderLiveShoppingSkuList = this.f456624d;
        if (intValue < (-i65.a.b(finderLiveShoppingSkuList.getContext(), 40))) {
            android.os.Vibrator vibrator = finderLiveShoppingSkuList.f126338h;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
            yz5.a onLoadMoreCallback = finderLiveShoppingSkuList.getOnLoadMoreCallback();
            if (onLoadMoreCallback != null) {
                onLoadMoreCallback.invoke();
            }
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingSkuList.a(finderLiveShoppingSkuList);
        }
        return jz5.f0.f302826a;
    }
}
