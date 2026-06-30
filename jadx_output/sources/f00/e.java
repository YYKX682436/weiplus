package f00;

/* loaded from: classes9.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.widget.TextView priceTv, int i17, int i18, bw5.u8 item) {
        kotlin.jvm.internal.o.g(priceTv, "priceTv");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String e17 = item.e();
        boolean z17 = false;
        if (e17 != null) {
            if (e17.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            priceTv.setText(item.e());
        } else {
            priceTv.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ner, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(i18)));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingPriceView", "set product price for " + item.i() + ", price = " + ((java.lang.Object) priceTv.getText()));
        if (i18 > i17 || i18 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveShoppingPriceView", "invalid price,min:" + i18 + ",max:" + i17);
        }
    }
}
