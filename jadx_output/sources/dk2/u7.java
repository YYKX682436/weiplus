package dk2;

/* loaded from: classes3.dex */
public final class u7 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f234182b;

    /* renamed from: j, reason: collision with root package name */
    public static int f234190j;

    /* renamed from: n, reason: collision with root package name */
    public static r45.aw1 f234194n;

    /* renamed from: o, reason: collision with root package name */
    public static r45.zo0 f234195o;

    /* renamed from: p, reason: collision with root package name */
    public static r45.wi6 f234196p;

    /* renamed from: s, reason: collision with root package name */
    public static yz5.p f234199s;

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.u7 f234181a = new dk2.u7();

    /* renamed from: c, reason: collision with root package name */
    public static java.util.Map f234183c = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f234184d = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f234185e = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f234186f = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f234187g = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f234188h = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f234189i = java.util.Collections.synchronizedMap(new java.util.LinkedHashMap());

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Map f234191k = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f234192l = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f234193m = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.Map f234197q = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.Set f234198r = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f234200t = jz5.h.b(dk2.d7.f233322d);

    public final void a(ce2.i gift) {
        kotlin.jvm.internal.o.g(gift, "gift");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "addIfNotExistGift " + gift);
        java.lang.String str = gift.field_rewardProductId;
        boolean z17 = str == null || str.length() == 0;
        java.util.Map map = f234185e;
        if (!z17 && !map.containsKey(str)) {
            kotlin.jvm.internal.o.d(map);
            map.put(str, gift);
            l(gift, str);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "addIfNotExistGift id:" + str + ", giftCache.containsKey:" + map.containsKey(str));
        }
    }

    public final java.lang.String b(java.lang.String giftId, r45.yv1 randomItem) {
        kotlin.jvm.internal.o.g(giftId, "giftId");
        kotlin.jvm.internal.o.g(randomItem, "randomItem");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(giftId);
        sb6.append('_');
        java.lang.String string = randomItem.getString(0);
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        return sb6.toString();
    }

    public final void c(java.lang.String source, ce2.i giftInfo, r45.na0 customGiftInfo) {
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(giftInfo, "giftInfo");
        kotlin.jvm.internal.o.g(customGiftInfo, "customGiftInfo");
        rs5.f fVar = (rs5.f) i95.n0.c(rs5.f.class);
        java.lang.String string3 = customGiftInfo.getString(7);
        java.lang.String str = string3 == null ? "" : string3;
        r45.gs5 gs5Var = (r45.gs5) customGiftInfo.getCustom(8);
        java.lang.String str2 = (gs5Var == null || (string2 = gs5Var.getString(0)) == null) ? "" : string2;
        r45.gs5 gs5Var2 = (r45.gs5) customGiftInfo.getCustom(8);
        java.lang.String str3 = (gs5Var2 == null || (string = gs5Var2.getString(1)) == null) ? "" : string;
        dk2.b7 b7Var = new dk2.b7(giftInfo, source, customGiftInfo);
        it2.x xVar = (it2.x) fVar;
        xVar.getClass();
        nf.e.f(new it2.v(xVar, b7Var, str, str2, str3, false));
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        yg2.b bVar;
        if (str == null || str.length() == 0) {
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar == null || (bVar = eVar.f272475i) == null) {
            return;
        }
        kotlinx.coroutines.l.b(bVar, kotlinx.coroutines.q1.f310570c, null, new dk2.c7(str, z17, z18, str2, null), 2, null);
    }

    public final ce2.i e(java.lang.String str) {
        ce2.i iVar = (ce2.i) f234185e.get(str);
        return iVar == null ? (ce2.i) f234189i.get(str) : iVar;
    }

    public final java.util.Map f() {
        java.util.Map map;
        je2.t tVar = (je2.t) dk2.ef.f233372a.i(je2.t.class);
        java.util.Map giftPkgGiftBatchCache = f234188h;
        if (tVar != null) {
            kotlin.jvm.internal.o.f(giftPkgGiftBatchCache, "giftPkgGiftBatchCache");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeFreeGiftsToPkg, before merge: ");
            java.util.List list = tVar.f299275u;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(je2.u.a((r45.oq1) it.next()));
            }
            sb6.append(arrayList);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = tVar.f299263f;
            com.tencent.mars.xlog.Log.i(str, sb7);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (kz5.n0.O(tVar.f299277w, ((r45.oq1) next).f382441d)) {
                    arrayList3.add(next);
                }
            }
            java.util.Iterator it7 = arrayList3.iterator();
            while (true) {
                boolean hasNext = it7.hasNext();
                map = f234189i;
                if (!hasNext) {
                    break;
                }
                r45.oq1 oq1Var = (r45.oq1) it7.next();
                java.lang.String str2 = oq1Var.f382442e;
                java.util.LinkedList linkedList = (java.util.LinkedList) giftPkgGiftBatchCache.get(str2);
                if (linkedList != null) {
                    linkedList.removeIf(new je2.o(oq1Var));
                    if (linkedList.isEmpty()) {
                        kotlin.jvm.internal.m0.c(giftPkgGiftBatchCache).remove(str2);
                        map.remove(str2);
                    }
                }
            }
            java.util.Iterator it8 = ((java.util.ArrayList) tVar.P6()).iterator();
            while (it8.hasNext()) {
                r45.oq1 oq1Var2 = (r45.oq1) it8.next();
                java.lang.String str3 = oq1Var2.f382442e;
                if (!(str3 == null || str3.length() == 0)) {
                    if (giftPkgGiftBatchCache.containsKey(str3)) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) giftPkgGiftBatchCache.get(str3);
                        java.lang.Object obj = null;
                        if (linkedList2 != null) {
                            java.util.Iterator it9 = linkedList2.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    break;
                                }
                                java.lang.Object next2 = it9.next();
                                if (kotlin.jvm.internal.o.b(((r45.ad5) next2).getString(5), oq1Var2.f382441d)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            obj = (r45.ad5) obj;
                        }
                        if (obj == null && linkedList2 != null) {
                            linkedList2.add(0, tVar.S6(oq1Var2));
                        }
                    } else {
                        kotlin.jvm.internal.o.f(map, "<get-pkgGiftCache>(...)");
                        map.put(str3, f234185e.get(str3));
                        java.util.LinkedList linkedList3 = new java.util.LinkedList();
                        linkedList3.add(0, tVar.S6(oq1Var2));
                        giftPkgGiftBatchCache.put(str3, linkedList3);
                    }
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mergeFreeGiftsToPkg, after merge: ");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it10 = arrayList2.iterator();
            while (it10.hasNext()) {
                arrayList4.add(je2.u.a((r45.oq1) it10.next()));
            }
            sb8.append(arrayList4);
            com.tencent.mars.xlog.Log.i(str, sb8.toString());
        }
        return giftPkgGiftBatchCache;
    }

    public final boolean g(ce2.i iVar) {
        java.lang.Boolean valueOf = iVar != null ? java.lang.Boolean.valueOf(iVar.Z0()) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreciousGift id:");
        sb6.append(iVar != null ? iVar.field_rewardProductId : null);
        sb6.append(" name:");
        sb6.append(iVar != null ? iVar.field_name : null);
        sb6.append(" animationPagUrl:");
        sb6.append(iVar != null ? iVar.field_animationPagUrl : null);
        sb6.append(", isRandomGift:");
        sb6.append(valueOf);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        return !com.tencent.mm.sdk.platformtools.t8.K0(iVar != null ? iVar.field_animationPagUrl : null) || kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE);
    }

    public final boolean h(java.lang.String str, boolean z17) {
        ce2.i iVar = (ce2.i) f234185e.get(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isValidGift isPreview:");
        sb6.append(z17);
        sb6.append(" id:");
        sb6.append(iVar != null ? iVar.field_rewardProductId : null);
        sb6.append(" name:");
        sb6.append(iVar != null ? iVar.field_name : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        return true;
    }

    public final void i() {
        f234182b = false;
        f234185e.clear();
        java.util.List<ce2.i> z07 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().z0();
        if (z07.isEmpty()) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveGiftLoader", "prepareLocalGift giftList from db is nullOrNil");
        }
        for (ce2.i iVar : z07) {
            java.util.Map map = f234185e;
            kotlin.jvm.internal.o.d(map);
            map.put(iVar.field_rewardProductId, iVar);
        }
        f234183c.clear();
        java.util.LinkedHashMap D0 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().D0();
        if (D0 != null) {
            f234183c = java.util.Collections.synchronizedMap(D0);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "prepareLocalGift cur gift cache:" + f234185e + ", giftTabInfoList:" + f234183c);
    }

    public final void j(java.lang.String productId) {
        long j17;
        kotlin.jvm.internal.o.g(productId, "productId");
        java.util.LinkedList linkedList = (java.util.LinkedList) f().get(productId);
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            j17 = 0;
            while (it.hasNext()) {
                j17 += ((r45.ad5) it.next()).getLong(1);
            }
        } else {
            j17 = 0;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "[removePkgGiftIfBatchEmpty] productId:" + productId + " , left_cnt_sum = " + j17);
        if (j17 <= 0) {
            f().remove(productId);
            f234189i.remove(productId);
        }
    }

    public final java.lang.Object k(r45.kv1 kv1Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String string = kv1Var.getString(0);
        boolean z17 = string == null || string.length() == 0;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "syncGiftResource id is empty");
            return f0Var;
        }
        kotlinx.coroutines.l.f(null, new dk2.o7(ce2.i.U1.b(kv1Var), string, null), 1, null);
        return f0Var;
    }

    public final void l(ce2.i iVar, java.lang.String str) {
        yg2.b bVar;
        java.util.LinkedList list;
        java.util.LinkedList<r45.yq4> list2;
        yg2.b bVar2;
        new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(iVar.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f)).d();
        java.lang.String str2 = iVar.field_previewPagUrl;
        java.lang.String field_rewardProductId = iVar.field_rewardProductId;
        kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
        java.lang.String field_name = iVar.field_name;
        kotlin.jvm.internal.o.f(field_name, "field_name");
        d(str2, field_rewardProductId, field_name, true, false);
        java.lang.String str3 = iVar.field_animationPagUrl;
        java.lang.String field_rewardProductId2 = iVar.field_rewardProductId;
        kotlin.jvm.internal.o.f(field_rewardProductId2, "field_rewardProductId");
        java.lang.String field_name2 = iVar.field_name;
        kotlin.jvm.internal.o.f(field_name2, "field_name");
        d(str3, field_rewardProductId2, field_name2, false, false);
        java.lang.String str4 = iVar.field_landscapePagUrl;
        java.lang.String field_rewardProductId3 = iVar.field_rewardProductId;
        kotlin.jvm.internal.o.f(field_rewardProductId3, "field_rewardProductId");
        java.lang.String field_name3 = iVar.field_name;
        kotlin.jvm.internal.o.f(field_name3, "field_name");
        d(str4, field_rewardProductId3, field_name3, false, true);
        if (iVar.Y0()) {
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(iVar);
            r45.zq4 zq4Var = iVar.field_multiAnimationList;
            if (zq4Var != null && (list2 = zq4Var.getList(0)) != null) {
                for (r45.yq4 yq4Var : list2) {
                    gk2.e eVar = dk2.ef.I;
                    if (eVar != null && (bVar2 = eVar.f272475i) != null) {
                        kotlinx.coroutines.l.d(bVar2, kotlinx.coroutines.q1.f310570c, null, new dk2.z6(yq4Var, null), 2, null);
                    }
                }
            }
        } else if (iVar.Z0()) {
            ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().J0(iVar);
            java.lang.String str5 = iVar.field_rewardProductId;
            if (str5 == null) {
                str5 = "";
            }
            r45.zq4 zq4Var2 = iVar.field_multiAnimationList;
            java.util.LinkedList list3 = zq4Var2 != null ? zq4Var2.getList(0) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAndDownloadMultiAnimation reset, multiAnimationList:");
            sb6.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
            if (list3 == null || list3.size() <= 0) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkAndDownloadMultiAnimation id:");
                sb7.append(str5);
                sb7.append(" name:");
                sb7.append(iVar.field_name);
                sb7.append(" multiAnimationList is empty:");
                sb7.append(list3 != null ? java.lang.Integer.valueOf(list3.size()) : null);
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveGiftLoader", sb7.toString());
            } else {
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new dk2.a7(list3, str5, iVar, null), 3, null);
            }
        }
        if (iVar.a1()) {
            r45.xi6 xi6Var = iVar.field_switchSkinInfo;
            if ((xi6Var == null || (list = xi6Var.getList(0)) == null || !(list.isEmpty() ^ true)) ? false : true) {
                java.util.LinkedList<r45.yi6> list4 = iVar.field_switchSkinInfo.getList(0);
                kotlin.jvm.internal.o.f(list4, "getSwitch_skin_info_list(...)");
                for (r45.yi6 yi6Var : list4) {
                    dk2.u7 u7Var = f234181a;
                    r45.gs5 gs5Var = (r45.gs5) yi6Var.getCustom(1);
                    java.lang.String string = gs5Var != null ? gs5Var.getString(0) : null;
                    java.lang.String field_rewardProductId4 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId4, "field_rewardProductId");
                    java.lang.String field_name4 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name4, "field_name");
                    u7Var.d(string, field_rewardProductId4, field_name4, false, false);
                    r45.gs5 gs5Var2 = (r45.gs5) yi6Var.getCustom(2);
                    java.lang.String string2 = gs5Var2 != null ? gs5Var2.getString(0) : null;
                    java.lang.String field_rewardProductId5 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId5, "field_rewardProductId");
                    java.lang.String field_name5 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name5, "field_name");
                    u7Var.d(string2, field_rewardProductId5, field_name5, false, true);
                    r45.gs5 gs5Var3 = (r45.gs5) yi6Var.getCustom(4);
                    java.lang.String string3 = gs5Var3 != null ? gs5Var3.getString(0) : null;
                    java.lang.String field_rewardProductId6 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId6, "field_rewardProductId");
                    java.lang.String field_name6 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name6, "field_name");
                    u7Var.d(string3, field_rewardProductId6, field_name6, true, false);
                    r45.gs5 gs5Var4 = (r45.gs5) yi6Var.getCustom(16);
                    java.lang.String string4 = gs5Var4 != null ? gs5Var4.getString(0) : null;
                    java.lang.String field_rewardProductId7 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId7, "field_rewardProductId");
                    java.lang.String field_name7 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name7, "field_name");
                    u7Var.d(string4, field_rewardProductId7, field_name7, false, false);
                    r45.gs5 gs5Var5 = (r45.gs5) yi6Var.getCustom(17);
                    java.lang.String string5 = gs5Var5 != null ? gs5Var5.getString(0) : null;
                    java.lang.String field_rewardProductId8 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId8, "field_rewardProductId");
                    java.lang.String field_name8 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name8, "field_name");
                    u7Var.d(string5, field_rewardProductId8, field_name8, false, true);
                    r45.gs5 gs5Var6 = (r45.gs5) yi6Var.getCustom(14);
                    java.lang.String string6 = gs5Var6 != null ? gs5Var6.getString(0) : null;
                    java.lang.String field_rewardProductId9 = iVar.field_rewardProductId;
                    kotlin.jvm.internal.o.f(field_rewardProductId9, "field_rewardProductId");
                    java.lang.String field_name9 = iVar.field_name;
                    kotlin.jvm.internal.o.f(field_name9, "field_name");
                    u7Var.d(string6, field_rewardProductId9, field_name9, true, false);
                }
            }
        }
        gk2.e eVar2 = dk2.ef.I;
        if (eVar2 != null && (bVar = eVar2.f272475i) != null) {
            kotlinx.coroutines.l.d(bVar, kotlinx.coroutines.q1.f310570c, null, new dk2.t7(iVar, null), 2, null);
        }
        r45.l43 l43Var = iVar.field_foregroundInfo;
        if (l43Var != null) {
            java.util.Map map = f234191k;
            kotlin.jvm.internal.o.d(map);
            map.put(iVar.field_rewardProductId, l43Var);
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("id:");
        sb8.append(iVar.field_rewardProductId);
        sb8.append(" name:");
        sb8.append(iVar.field_name);
        sb8.append(" isFullPag:");
        sb8.append(iVar.field_giftType == 2);
        sb8.append("  isLandscapeGift:");
        sb8.append(!com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_landscapePagUrl));
        sb8.append(" isSwitchSkin:");
        sb8.append(iVar.a1());
        sb8.append(",isCustomGift:");
        sb8.append(iVar.U0());
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb8.toString());
    }

    public final void m() {
        f234185e.clear();
        java.util.List<ce2.i> z07 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().z0();
        if (z07.isEmpty()) {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveGiftLoader", "skip fetch gift, giftList from db is nullOrNil");
        }
        java.util.Map map = f234186f;
        kotlin.jvm.internal.o.d(map);
        synchronized (map) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    java.util.Map map2 = f234185e;
                    kotlin.jvm.internal.o.d(map2);
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
        }
        for (ce2.i iVar : z07) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", "[trySyncGift] giftFromDb: " + iVar);
            java.util.Map map3 = f234185e;
            kotlin.jvm.internal.o.d(map3);
            map3.put(iVar.field_rewardProductId, iVar);
        }
        f234183c.clear();
        java.util.LinkedHashMap D0 = ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Oj().D0();
        if (D0 != null) {
            f234183c = java.util.Collections.synchronizedMap(D0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cur gift cache:");
        java.util.Map map4 = f234185e;
        sb6.append(map4);
        sb6.append(", giftTabInfoList:");
        sb6.append(f234183c);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftLoader", sb6.toString());
        kotlin.jvm.internal.o.d(map4);
        synchronized (map4) {
            for (java.util.Map.Entry entry2 : map4.entrySet()) {
                java.lang.String str = (java.lang.String) entry2.getKey();
                ce2.i iVar2 = (ce2.i) entry2.getValue();
                dk2.u7 u7Var = f234181a;
                kotlin.jvm.internal.o.d(iVar2);
                u7Var.l(iVar2, str);
                if (str != null) {
                    f234198r.add(str);
                }
            }
        }
    }
}
