package cu2;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final cu2.f0 f222391a = new cu2.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f222392b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.LinkedList f222393c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static java.util.LinkedList f222394d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static java.util.LinkedList f222395e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f222396f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static r45.cm2 f222397g = new r45.cm2();

    static {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_OBJECT_WORDING_CONFIG_STRING_SYNC, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        try {
            f222397g.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        f222391a.i("ConfigStorage", f222397g, false, java.lang.Boolean.FALSE);
    }

    public final r45.rl2 a(java.lang.String key) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Iterator it = f222393c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.rl2) obj).getString(3), key)) {
                break;
            }
        }
        return (r45.rl2) obj;
    }

    public final r45.rl2 b(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = f222393c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.rl2) obj).getInteger(0) == i17) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        return (r45.rl2) obj;
    }

    public final r45.tl2 c(java.lang.String key) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Iterator it = f222394d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.tl2) obj).getString(0), key)) {
                break;
            }
        }
        return (r45.tl2) obj;
    }

    public final java.lang.String d(java.lang.String key) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(key, "key");
        java.util.Iterator it = f222395e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((r45.sl2) obj).getString(4), key)) {
                break;
            }
        }
        r45.sl2 sl2Var = (r45.sl2) obj;
        if (sl2Var == null) {
            return null;
        }
        int integer = sl2Var.getInteger(1);
        java.lang.String string = integer != 1 ? integer != 2 ? null : sl2Var.getString(3) : sl2Var.getString(2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return null;
        }
        return string;
    }

    public final r45.bm2 e(int i17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.C2).getValue()).r()).intValue() == 1) {
            i17 = 1;
        }
        return (r45.bm2) f222392b.get(java.lang.Integer.valueOf(i17));
    }

    public final r45.xa5 f(java.lang.String appid) {
        kotlin.jvm.internal.o.g(appid, "appid");
        return (r45.xa5) f222396f.get(appid);
    }

    public final java.lang.String g() {
        java.lang.String d17 = f222391a.d("FinderObjectDynamicItemKey_FinderFav");
        if (d17 != null) {
            return d17;
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f5u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    public final void h(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().b(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329953d));
    }

    public final void i(java.lang.String source, r45.cm2 infoList, boolean z17, java.lang.Boolean bool) {
        java.util.LinkedList<r45.xa5> list;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetConfig: source=");
        sb6.append(source);
        sb6.append(", needUpdateMemory=");
        sb6.append(z17);
        sb6.append(", needRefreshStorage=");
        sb6.append(bool);
        sb6.append(", objectExtInfoListSize=");
        int i17 = 0;
        sb6.append(infoList.getList(0).size());
        sb6.append(", imagesSize=");
        int i18 = 5;
        sb6.append(infoList.getList(5).size());
        sb6.append(", wordsSize=");
        sb6.append(infoList.getList(6).size());
        com.tencent.mars.xlog.Log.i("FinderObjectWordingConfig", sb6.toString());
        java.util.HashMap hashMap = f222392b;
        hashMap.clear();
        java.util.LinkedList<r45.bm2> list2 = infoList.getList(0);
        cu2.f0 f0Var = f222391a;
        int i19 = 7;
        if (list2 != null) {
            for (r45.bm2 bm2Var : list2) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resetConfig: source=");
                sb7.append(source);
                sb7.append(", objectExtInfo=");
                kotlin.jvm.internal.o.d(bm2Var);
                sb7.append(pm0.b0.g(bm2Var));
                com.tencent.mars.xlog.Log.i("FinderObjectWordingConfig", sb7.toString());
                hashMap.put(java.lang.Integer.valueOf(bm2Var.getInteger(i17)), bm2Var);
                mn2.g1 g1Var = mn2.g1.f329975a;
                vo0.d e17 = g1Var.e();
                java.lang.String string = bm2Var.getString(i19);
                com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
                mn2.q3 q3Var = new mn2.q3(string, y90Var);
                mn2.f1 f1Var = mn2.f1.B;
                e17.b(q3Var, g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.getString(8), y90Var), g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.getString(9), y90Var), g1Var.h(f1Var));
                g1Var.e().b(new mn2.q3(bm2Var.getString(10), y90Var), g1Var.h(f1Var));
                hashMap = hashMap;
                i17 = 0;
                i18 = 5;
                i19 = 7;
            }
        }
        java.util.LinkedList<r45.rl2> list3 = infoList.getList(i18);
        kotlin.jvm.internal.o.f(list3, "getImages(...)");
        for (r45.rl2 rl2Var : list3) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("resetConfig: source=");
            sb8.append(source);
            sb8.append(", image=");
            kotlin.jvm.internal.o.d(rl2Var);
            sb8.append(pm0.b0.g(rl2Var));
            com.tencent.mars.xlog.Log.i("FinderObjectWordingConfig", sb8.toString());
        }
        java.util.LinkedList<r45.sl2> list4 = infoList.getList(6);
        kotlin.jvm.internal.o.f(list4, "getWords(...)");
        for (r45.sl2 sl2Var : list4) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("resetConfig: source=");
            sb9.append(source);
            sb9.append(", word=");
            kotlin.jvm.internal.o.d(sl2Var);
            sb9.append(pm0.b0.g(sl2Var));
            com.tencent.mars.xlog.Log.i("FinderObjectWordingConfig", sb9.toString());
        }
        java.util.LinkedList<r45.rl2> list5 = infoList.getList(5);
        if (list5 == null) {
            list5 = new java.util.LinkedList();
        }
        f222393c = list5;
        for (r45.rl2 rl2Var2 : list5) {
            if (com.tencent.mm.ui.bk.C()) {
                f0Var.h(rl2Var2.getString(2));
            } else {
                f0Var.h(rl2Var2.getString(1));
            }
        }
        java.util.LinkedList list6 = infoList.getList(6);
        if (list6 == null) {
            list6 = new java.util.LinkedList();
        }
        f222395e = list6;
        java.util.LinkedList list7 = infoList.getList(7);
        if (list7 == null) {
            list7 = new java.util.LinkedList();
        }
        f222394d = list7;
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new cu2.d0(null), 2, null);
        java.util.HashMap hashMap2 = f222396f;
        hashMap2.clear();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127869p0).getValue()).r()).intValue() == 1) {
            r45.xa5 xa5Var = new r45.xa5();
            xa5Var.set(8, "https://miaojian.weixin.qq.com/download/apps?channel=1104");
            xa5Var.set(9, "com.tencent.phoenix");
            xa5Var.set(7, "miaojian://createVideo?scene=channels&from=channels-samestyle&miaojianExtInfo=");
            xa5Var.set(10, "A24DC0755072F64C480DC06DCD3412BF");
            xa5Var.set(6, "https://apps.apple.com/app/apple-store/id1530922601?pt=69276&ct=channels1&mt=8");
            xa5Var.set(2, null);
            xa5Var.set(1, "http://dldir1v6.qq.com/weixin/checkresupdate/outlined_miaojian_658e3fe317814fc8a1c209e9a5937e01.png");
            xa5Var.set(0, "秒剪做同款");
            xa5Var.set(3, 0);
            xa5Var.set(5, "https://v.vuevideo.net/vfromwx/createvideo?scene=channels");
            xa5Var.set(4, "ConstantsProtocal.MAAS_APPID");
            xa5Var.set(11, "http://dldir1v6.qq.com/weixin/checkresupdate/outlined_miaojian_dark_6b87f03b481440249680c17b73dac97b.png");
            hashMap2.put("wxa5e0de08d96cc09d", xa5Var);
        }
        r45.ya5 ya5Var = (r45.ya5) infoList.getCustom(4);
        if (ya5Var != null && (list = ya5Var.getList(0)) != null) {
            for (r45.xa5 xa5Var2 : list) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("resetConfig: source=");
                sb10.append(source);
                sb10.append(", sheet=");
                kotlin.jvm.internal.o.d(xa5Var2);
                sb10.append(pm0.b0.g(xa5Var2));
                com.tencent.mars.xlog.Log.i("FinderObjectWordingConfig", sb10.toString());
                java.lang.String string2 = xa5Var2.getString(4);
                if (!(string2 == null || string2.length() == 0)) {
                    hashMap2.put(string2, xa5Var2);
                    f0Var.h(xa5Var2.getString(1));
                    f0Var.h(xa5Var2.getString(11));
                }
            }
        }
        if (z17) {
            f222397g = infoList;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            pm0.v.O("FinderObjectWordingConfig", new cu2.e0(infoList));
        }
    }
}
