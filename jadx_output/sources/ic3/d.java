package ic3;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290394d;

    public d(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290394d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290394d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        java.util.Objects.toString(magicAdServiceDemoActivity.f147851e);
        xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
        wj.t0 posId = magicAdServiceDemoActivity.f147851e;
        ((wj.j0) iVar).getClass();
        kotlin.jvm.internal.o.g(posId, "posId");
        gk.b bVar = gk.b.f272408a;
        java.lang.String str2 = posId.f446518d;
        java.util.Set c17 = bVar.c(str2);
        java.lang.String str3 = null;
        java.lang.String str4 = c17 != null ? (java.lang.String) kz5.n0.Y(c17) : null;
        if (str4 == null || str4.length() == 0) {
            com.tencent.mars.xlog.Log.w("MagicAdCommonFeatureService", "[dumpAdsInfo] no aid for posId: ".concat(str2));
        } else {
            r45.e5 a17 = bVar.a(str4);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.w("MagicAdCommonFeatureService", "[dumpAdsInfo] adsInfo is null, posId: " + str2 + ", aid: " + str4);
            } else {
                byte[] byteArray = a17.toByteArray();
                java.lang.String encodeToString = android.util.Base64.encodeToString(byteArray, 2);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "================== [dumpAdsInfo] BEGIN posId=" + str2 + " ==================");
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] aid=" + str4 + " bytesLen=" + byteArray.length);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dumpAdsInfo] hintTxt    = ");
                com.tencent.mm.protobuf.g byteString = a17.getByteString(8);
                sb6.append(byteString != null ? byteString.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[dumpAdsInfo] adDesc     = ");
                com.tencent.mm.protobuf.g byteString2 = a17.getByteString(23);
                sb7.append(byteString2 != null ? byteString2.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb7.toString());
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[dumpAdsInfo] imageUrl   = ");
                com.tencent.mm.protobuf.g byteString3 = a17.getByteString(9);
                sb8.append(byteString3 != null ? byteString3.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb8.toString());
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] imageUrlDk = " + a17.getString(10));
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[dumpAdsInfo] urlScheme  = ");
                com.tencent.mm.protobuf.g byteString4 = a17.getByteString(12);
                sb9.append(byteString4 != null ? byteString4.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb9.toString());
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[dumpAdsInfo] apkName    = ");
                com.tencent.mm.protobuf.g byteString5 = a17.getByteString(14);
                sb10.append(byteString5 != null ? byteString5.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb10.toString());
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] appId      = " + a17.getLong(13));
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[dumpAdsInfo] appName    = ");
                com.tencent.mm.protobuf.g byteString6 = a17.getByteString(26);
                sb11.append(byteString6 != null ? byteString6.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb11.toString());
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] urlSchemeMinAndroidVersion = " + a17.getLong(15));
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[dumpAdsInfo] canvasId          = ");
                com.tencent.mm.protobuf.g byteString7 = a17.getByteString(18);
                sb12.append(byteString7 != null ? byteString7.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb12.toString());
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder("[dumpAdsInfo] canvasDynamicInfo = ");
                com.tencent.mm.protobuf.g byteString8 = a17.getByteString(19);
                sb13.append(byteString8 != null ? byteString8.i() : null);
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb13.toString());
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] uxinfo            = " + a17.getString(0));
                kotlin.jvm.internal.o.d(encodeToString);
                java.util.Iterator it = ((java.util.ArrayList) r26.p0.x0(encodeToString, 1024)).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[dumpAdsInfo] base64[" + i17 + "]=" + ((java.lang.String) next));
                    i17 = i18;
                }
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "================== [dumpAdsInfo] END ==================");
                str3 = encodeToString;
            }
        }
        if (str3 == null || str3.length() == 0) {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "⚠️ 当前 posId 无 AdsInfo 缓存，请先调 ExposeAsync 拉取");
        } else {
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "✅ AdsInfo 已 dump 到 logcat（搜 [dumpAdsInfo]），base64 长度: " + str3.length());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
