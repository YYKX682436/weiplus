package n22;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final n22.i f334293a = new n22.i(null);

    /* renamed from: b, reason: collision with root package name */
    public static int f334294b = -1;

    public static final void a(android.content.Context context, java.lang.String productId, java.lang.String priceType, int i17, java.lang.String priceNum, java.lang.String goodName) {
        n22.i iVar = f334293a;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(productId, "productId");
        kotlin.jvm.internal.o.g(priceType, "priceType");
        kotlin.jvm.internal.o.g(priceNum, "priceNum");
        kotlin.jvm.internal.o.g(goodName, "goodName");
        if (iVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] show EmojiStoreWecoinTutorialDialog");
            iVar.b(context).C();
            return;
        }
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.bwd);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{goodName}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_product_id", productId);
        intent.putExtra("key_currency_type", priceType);
        intent.putExtra("key_pay_type", 6);
        intent.putExtra("key_wecoin_price", java.lang.String.valueOf(i17));
        intent.putExtra("key_price", iVar.c(priceNum));
        intent.putExtra("key_desc", format);
        intent.putExtra("key_product_title_insufficient", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bx7));
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiWecoinTool", "[launchWecoinPurchase] enter wecoin pay");
        j45.l.n(context, "wallet_index", ".ui.WecoinIapUI", intent, 2001);
    }
}
