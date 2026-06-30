package zy2;

/* loaded from: classes4.dex */
public final class l extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.br2 f477449b = new r45.br2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.l lVar = new zy2.l();
        lVar.f477449b = this.f477449b;
        return lVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        r45.br2 br2Var = this.f477449b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (br2Var != null) {
            try {
                sb7.append("<finderLiveProductShare>");
                sb7.append("<finderLiveID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(0)));
                sb7.append("</finderLiveID>");
                sb7.append("<finderUsername>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(1)));
                sb7.append("</finderUsername>");
                sb7.append("<finderObjectID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(2)));
                sb7.append("</finderObjectID>");
                sb7.append("<finderNonceID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(3)));
                sb7.append("</finderNonceID>");
                sb7.append("<liveStatus>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(4)));
                sb7.append("</liveStatus>");
                sb7.append("<appId>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(5)));
                sb7.append("</appId>");
                sb7.append("<pagePath>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(6)));
                sb7.append("</pagePath>");
                sb7.append("<productId>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(7)));
                sb7.append("</productId>");
                sb7.append("<coverUrl>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(8)));
                sb7.append("</coverUrl>");
                sb7.append("<productTitle>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(9)));
                sb7.append("</productTitle>");
                sb7.append("<marketPrice>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(br2Var.getInteger(10))));
                sb7.append("</marketPrice>");
                sb7.append("<sellingPrice>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(br2Var.getInteger(11))));
                sb7.append("</sellingPrice>");
                sb7.append("<platformHeadImg>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(12)));
                sb7.append("</platformHeadImg>");
                sb7.append("<platformName>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(13)));
                sb7.append("</platformName>");
                sb7.append("<shopWindowId>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(14)));
                sb7.append("</shopWindowId>");
                sb7.append("<flashSalePrice>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(br2Var.getInteger(15))));
                sb7.append("</flashSalePrice>");
                sb7.append("<flashSaleEndTime>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Long.toString(br2Var.getLong(16))));
                sb7.append("</flashSaleEndTime>");
                sb7.append("<ecSource>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(17)));
                sb7.append("</ecSource>");
                sb7.append("<sellingPriceWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(18)));
                sb7.append("</sellingPriceWording>");
                sb7.append("<platformIconURL>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(19)));
                sb7.append("</platformIconURL>");
                sb7.append("<firstProductTagURL>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(20)));
                sb7.append("</firstProductTagURL>");
                sb7.append("<firstProductTagAspectRatioString>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Float.toString(br2Var.getFloat(21))));
                sb7.append("</firstProductTagAspectRatioString>");
                sb7.append("<secondProductTagURL>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(22)));
                sb7.append("</secondProductTagURL>");
                sb7.append("<secondProductTagAspectRatioString>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Float.toString(br2Var.getFloat(23))));
                sb7.append("</secondProductTagAspectRatioString>");
                sb7.append("<firstGuaranteeWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(24)));
                sb7.append("</firstGuaranteeWording>");
                sb7.append("<secondGuaranteeWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(25)));
                sb7.append("</secondGuaranteeWording>");
                sb7.append("<thirdGuaranteeWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(26)));
                sb7.append("</thirdGuaranteeWording>");
                sb7.append("<isPriceBeginShow>");
                sb7.append(br2Var.getBoolean(27));
                sb7.append("</isPriceBeginShow>");
                sb7.append("<lastGMsgID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(28)));
                sb7.append("</lastGMsgID>");
                sb7.append("<promoterKey>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(30)));
                sb7.append("</promoterKey>");
                sb7.append("<discountWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(29)));
                sb7.append("</discountWording>");
                sb7.append("<priceSuffixDescription>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(32)));
                sb7.append("</priceSuffixDescription>");
                sb7.append("<productCardKey>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(33)));
                sb7.append("</productCardKey>");
                sb7.append("<isWxShop>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(34)));
                sb7.append("</isWxShop>");
                sb7.append("<brandIconUrl>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(35)));
                sb7.append("</brandIconUrl>");
                sb7.append("<rIconUrl>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(36)));
                sb7.append("</rIconUrl>");
                sb7.append("<rIconUrlDarkMode>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(37)));
                sb7.append("</rIconUrlDarkMode>");
                sb7.append("<topShopIconUrl>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(38)));
                sb7.append("</topShopIconUrl>");
                sb7.append("<topShopIconUrlDarkMode>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(39)));
                sb7.append("</topShopIconUrlDarkMode>");
                sb7.append("<simplifyTopShopIconUrl>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(40)));
                sb7.append("</simplifyTopShopIconUrl>");
                sb7.append("<simplifyTopShopIconUrlDarkmode>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(41)));
                sb7.append("</simplifyTopShopIconUrlDarkmode>");
                sb7.append("<topShopIconWidth>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getInteger(42) + ""));
                sb7.append("</topShopIconWidth>");
                sb7.append("<topShopIconHeight>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getInteger(43) + ""));
                sb7.append("</topShopIconHeight>");
                sb7.append("<simplifyTopShopIconWidth>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getInteger(44) + ""));
                sb7.append("</simplifyTopShopIconWidth>");
                sb7.append("<simplifyTopShopIconHeight>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getInteger(45) + ""));
                sb7.append("</simplifyTopShopIconHeight>");
                sb7.append("<maskPriceWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(46)));
                sb7.append("</maskPriceWording>");
                if (br2Var.getList(31) != null) {
                    sb7.append("<showBoxItemStringList>");
                    java.util.Iterator it = br2Var.getList(31).iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = new java.lang.String(android.util.Base64.encode(((r45.p56) it.next()).toByteArray(), 2));
                        sb7.append("<showBoxItemString>");
                        sb7.append(com.tencent.mm.sdk.platformtools.aa.a(str2));
                        sb7.append("</showBoxItemString>");
                    }
                    sb7.append("</showBoxItemStringList>");
                }
                sb7.append("<richLabelTitleB64>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(47)));
                sb7.append("</richLabelTitleB64>");
                sb7.append("<richShopDescB64>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(br2Var.getString(48)));
                sb7.append("</richShopDescB64>");
                sb7.append("</finderLiveProductShare>");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        sb6.append(sb7.toString());
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        this.f477449b = zy2.d5.t(".msg.appmsg", values);
    }
}
