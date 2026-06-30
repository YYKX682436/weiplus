package lu1;

/* loaded from: classes15.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static java.text.SimpleDateFormat f321320a;

    public static boolean A() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_IS_SHARE_CARD_ENTRANCE_OPEN_INT_SYNC, null);
        return num != null && num.intValue() == 1;
    }

    public static boolean B(int i17) {
        return i17 == 0 || i17 == 20 || i17 == 30 || i17 == 10 || i17 == 11;
    }

    public static boolean C(r45.w50 w50Var, java.lang.String str) {
        boolean z17;
        if ((w50Var.f388882h & 8) > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "shouldShowWarning show the warning!");
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "ShowWarning not support show the warning!");
            return false;
        }
        if (s(str, w50Var.f388878d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "ShowWarning has show the warning!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "ShowWarning has not show the warning!");
        return true;
    }

    public static java.lang.String D(android.content.Context context, float f17) {
        if (f17 <= 0.0f) {
            return "";
        }
        if (f17 > 0.0f && f17 < 1000.0f) {
            return context.getString(com.tencent.mm.R.string.as_, "" + ((int) f17));
        }
        if (f17 < 1000.0f) {
            return "";
        }
        return context.getString(com.tencent.mm.R.string.as9, "" + new java.text.DecimalFormat("0.00").format(f17 / 1000.0f));
    }

    public static boolean E(com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo) {
        java.util.ArrayList e17;
        if (shareCardInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "processShareCardObject fail, card is null");
            return false;
        }
        com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y07 = xt1.t0.nj().y0("" + shareCardInfo.field_card_id);
        if (y07 != null) {
            shareCardInfo.field_categoryType = y07.field_categoryType;
            shareCardInfo.field_itemIndex = y07.field_itemIndex;
            return xt1.t0.nj().update(shareCardInfo, new java.lang.String[0]);
        }
        boolean insert = xt1.t0.nj().insert(shareCardInfo);
        if (insert) {
            java.lang.String str = shareCardInfo.field_card_id;
            java.lang.String str2 = shareCardInfo.field_card_tp_id;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId card_id:" + str + ", card_tp_id:" + str2);
            java.util.ArrayList e18 = eu1.f.e(1);
            if ((e18 == null || !e18.contains(str)) && ((e17 = eu1.f.e(2)) == null || !e17.contains(str))) {
                fu1.j jVar = (fu1.j) xt1.t0.Di().a("key_share_card_layout_data");
                if (jVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId data == null");
                } else {
                    int D0 = xt1.t0.nj().D0(str2);
                    int d17 = eu1.f.d(str2);
                    com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId realCount:" + D0 + " cacheCount:" + d17);
                    java.util.LinkedList linkedList = jVar.f266846a;
                    if (linkedList != null && linkedList.size() > 0 && (d17 <= 0 || D0 == 1)) {
                        for (int i17 = 0; i17 < jVar.f266846a.size(); i17++) {
                            fu1.k kVar = (fu1.k) jVar.f266846a.get(i17);
                            if (str2 != null && str2.contains(kVar.f266856b)) {
                                e18.add(str);
                                xt1.t0.Di().b("key_share_card_local_city_ids", e18);
                                com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for local ids, card id is " + str);
                                break;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for local_ids");
                    }
                    if (e17 == null || (d17 > 0 && D0 != 1)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId, not add for other_ids");
                    } else {
                        e17.add(str);
                        xt1.t0.Di().b("key_share_card_other_city_ids", e17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardDataMgr", "addCardIdsListByCardId add for other ids, card id is " + str);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "processShareCardObject, insert fail");
        }
        return insert;
    }

    public static void F(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "bitmap recycle %s", bitmap);
        bitmap.recycle();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:24|(2:25|26)|(8:28|29|(1:31)(1:53)|(1:33)(1:52)|34|(1:36)|38|(1:40))|41|42) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void G(tt1.j r35, java.lang.String r36, java.lang.String r37, int r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu1.a0.G(tt1.j, java.lang.String, java.lang.String, int, boolean, boolean):void");
    }

    public static void H(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
        am.mt mtVar = sendMsgEvent.f54752g;
        mtVar.f7362a = str2;
        mtVar.f7363b = str;
        mtVar.f7364c = c01.e2.C(str2);
        mtVar.f7365d = 0;
        sendMsgEvent.e();
    }

    public static void I(android.widget.ImageView imageView, java.lang.String str) {
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new lu1.z(str, imageView, false));
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        xt1.q qVar = new xt1.q(str);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(qVar);
        if (d17 != null) {
            imageView.setImageBitmap(d17);
        }
    }

    public static void J() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(282883, null);
        if (num != null && num.intValue() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "card entrance is open");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "open card entrance");
            gm0.j1.u().c().w(282883, 1);
        }
    }

    public static void K() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_CARD_IS_SHARE_CARD_ENTRANCE_OPEN_INT_SYNC;
        java.lang.Integer num = (java.lang.Integer) c17.m(u3Var, 0);
        if (num != null && num.intValue() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "share card entrance is open");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "open share card entrance");
            gm0.j1.u().c().x(u3Var, 1);
        }
    }

    public static void L(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "setShowWarningFlag card_id or title is empty!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "setShowWarningFlag()");
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_SHOW_WARNING_CARD_IDS_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
        } else {
            java.lang.String[] split = str3.split(",");
            if (split == null || split.length == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
                str3 = str;
            }
            boolean z17 = false;
            for (java.lang.String str4 : split) {
                if (str.equals(str4)) {
                    z17 = true;
                }
            }
            str = z17 ? str3 : str3 + "," + str;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CARD_SHOW_WARNING_CARD_IDS_STRING_SYNC, str);
    }

    public static boolean M(tt1.j jVar) {
        boolean z17 = false;
        if (jVar instanceof com.tencent.mm.plugin.card.model.CardInfo) {
            z17 = xt1.t0.cj().update((com.tencent.mm.plugin.card.model.CardInfo) jVar, new java.lang.String[0]);
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", jVar.g());
            }
        } else if ((jVar instanceof com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) && !(z17 = xt1.t0.nj().update((com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) jVar, new java.lang.String[0]))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "update mCardInfo fail, cardId = %s", jVar.g());
        }
        return z17;
    }

    public static int a(int i17, int i18) {
        return i18 <= 0 ? i17 : com.tencent.mm.ui.uk.a(i17, i18);
    }

    public static int b(java.lang.String str, int i17) {
        return a(android.graphics.Color.parseColor(str), i17);
    }

    public static java.util.List c(java.util.List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.lv lvVar = (r45.lv) list.get(i17);
            xt1.b bVar = new xt1.b();
            bVar.f379843d = lvVar.f379843d;
            bVar.f379844e = lvVar.f379844e;
            bVar.f379845f = lvVar.f379845f;
            bVar.f379846g = lvVar.f379846g;
            bVar.f379847h = lvVar.f379847h;
            bVar.f456444u = false;
            bVar.f379848i = lvVar.f379848i;
            bVar.f379849m = lvVar.f379849m;
            bVar.f379850n = lvVar.f379850n;
            bVar.f379851o = lvVar.f379851o;
            bVar.f379852p = lvVar.f379852p;
            bVar.f379853q = lvVar.f379853q;
            bVar.f379854r = lvVar.f379854r;
            bVar.f379855s = lvVar.f379855s;
            bVar.f456443t = 1;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public static int d(java.lang.String str) {
        int rgb = android.graphics.Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "string format error");
            return rgb;
        }
        try {
            java.lang.String upperCase = str.substring(1).toUpperCase();
            return android.graphics.Color.argb(255, java.lang.Integer.parseInt(upperCase.substring(0, 2), 16), java.lang.Integer.parseInt(upperCase.substring(2, 4), 16), java.lang.Integer.parseInt(upperCase.substring(4, 6), 16));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", e17.toString());
            return rgb;
        }
    }

    public static int e(java.lang.String str, int i17) {
        int rgb = android.graphics.Color.rgb(66, 66, 66);
        if (str == null || str.length() < 7 || !str.startsWith("#")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "string format error");
            return rgb;
        }
        try {
            java.lang.String upperCase = str.substring(1).toUpperCase();
            return android.graphics.Color.argb(i17, java.lang.Integer.parseInt(upperCase.substring(0, 2), 16), java.lang.Integer.parseInt(upperCase.substring(2, 4), 16), java.lang.Integer.parseInt(upperCase.substring(4, 6), 16));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", e17.toString());
            return rgb;
        }
    }

    public static java.lang.String f(long j17) {
        long j18 = j17 * 1000;
        new java.util.GregorianCalendar().setTimeInMillis(j18);
        if (f321320a == null) {
            f321320a = new java.text.SimpleDateFormat("yyyy.MM.dd");
        }
        return f321320a.format(new java.util.Date(j18));
    }

    public static java.lang.String g(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("EnterScene", i17);
            return jSONObject.toString();
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    public static java.util.ArrayList h(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "getContactIdsFromLabels labels is empty!");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String e17 = ((b93.b) c93.a.a()).e((java.lang.String) it.next());
            if (!android.text.TextUtils.isEmpty(e17)) {
                arrayList.add(e17);
            }
        }
        return arrayList;
    }

    public static java.util.ArrayList i(java.util.List list) {
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "getContactNamesFromLabels labels is empty!");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.List j17 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str));
            if (j17 == null || j17.size() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "getContactNamesFromLabels, namelist get bu label is null");
            } else {
                hashSet.addAll(j17);
            }
        }
        arrayList.addAll(hashSet);
        return arrayList;
    }

    public static java.lang.String j(java.lang.String str) {
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(str.split(","));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (gm0.j1.a() && asList != null && asList.size() != 0) {
            for (java.lang.String str2 : asList) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
                if (n17 != null && ((int) n17.E2) != 0) {
                    str2 = n17.g2();
                }
                linkedList.add(str2);
            }
        }
        return com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ",");
    }

    public static java.lang.String k(java.lang.String str, long j17) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        float f17 = xt1.t0.ij().f449281e;
        float f18 = xt1.t0.ij().f449280d;
        if (f17 == -1000.0f || f18 == -85.0f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "getRedirectUrl() location info is empty!");
            return str;
        }
        if ((j17 & 16) <= 0) {
            return str;
        }
        java.lang.String replace = str.replace("#", ("&longitude=" + f17 + "&latitude=" + f18) + "#");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "getRedirectUrl originalUrl:".concat(str));
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "getRedirectUrl afterwardsUrl:" + replace);
        return replace;
    }

    public static android.graphics.drawable.ShapeDrawable l(android.content.Context context, int i17, int i18) {
        float f17 = i18;
        float[] fArr = {f17, f17, f17, f17, f17, f17, f17, f17};
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib);
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(fArr, new android.graphics.RectF(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize), fArr));
        android.graphics.Paint paint = shapeDrawable.getPaint();
        paint.setColor(i17);
        paint.setStrokeWidth(dimensionPixelSize);
        return shapeDrawable;
    }

    public static android.graphics.drawable.ShapeDrawable m(android.content.Context context, int i17) {
        return n(context, i17, context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480169qa));
    }

    public static android.graphics.drawable.ShapeDrawable n(android.content.Context context, int i17, int i18) {
        float f17 = i18;
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, null, null));
        shapeDrawable.getPaint().setColor(i17);
        return shapeDrawable;
    }

    public static r45.o46 o(int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "getShareTag()");
        r45.o46 o46Var = new r45.o46();
        if (i17 == 2) {
            if (arrayList != null && arrayList.size() > 0) {
                o46Var.f381906d.addAll(arrayList);
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    java.lang.String str = (java.lang.String) arrayList2.get(i18);
                    if (!android.text.TextUtils.isEmpty(str) && y(str)) {
                        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str, 0)));
                    }
                }
                o46Var.f381908f.addAll(arrayList3);
            }
        } else if (i17 == 3) {
            if (arrayList != null && arrayList.size() > 0) {
                o46Var.f381907e.addAll(arrayList);
            }
            if (arrayList2 != null && arrayList2.size() > 0) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                    java.lang.String str2 = (java.lang.String) arrayList2.get(i19);
                    if (!android.text.TextUtils.isEmpty(str2) && y(str2)) {
                        arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(str2, 0)));
                    }
                }
                o46Var.f381909g.addAll(arrayList4);
            }
        }
        return o46Var;
    }

    public static java.lang.String p(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String a17 = c01.a2.a(str);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        return !android.text.TextUtils.isEmpty(a17) ? a17 : !android.text.TextUtils.isEmpty(e17) ? e17 : str;
    }

    public static void q(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = context.getString(com.tencent.mm.R.string.aw9);
        }
        db5.e1.F(context, str, "", false);
    }

    public static void r(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.F(context, context.getString(com.tencent.mm.R.string.aw9), "", false);
        } else {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 1).show();
        }
    }

    public static boolean s(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "hasShowTheWarning card_id or title is empty!");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardUtil", "hasShowWarning()");
        java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_SHOW_WARNING_CARD_IDS_STRING_SYNC, "");
        if (android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "hasShowTheWarning cardIdListStr list is empty!");
            return false;
        }
        java.lang.String[] split = str3.split(",");
        if (split == null || split.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardUtil", "hasShowTheWarning cardIds is empty!");
            return false;
        }
        for (java.lang.String str4 : split) {
            if (str.equals(str4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(282883, null);
        return num != null && num.intValue() == 1;
    }

    public static boolean u(int i17) {
        return i17 == 0 || i17 == 1 || i17 == 2 || i17 == 9 || i17 == 12 || i17 == 17 || i17 == 21;
    }

    public static boolean v(int i17) {
        return i17 == 3 || i17 == 4 || i17 == 5 || i17 == 15;
    }

    public static boolean w(int i17) {
        return i17 == 7 || i17 == 8 || i17 == 16 || i17 == 26;
    }

    public static boolean x(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getState() == android.net.NetworkInfo.State.CONNECTED;
    }

    public static boolean y(java.lang.String str) {
        return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static int z(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || str.equals(c01.z1.r())) ? 0 : 1;
    }
}
