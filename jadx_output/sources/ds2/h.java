package ds2;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ds2.h f242866a = new ds2.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f242867b = jz5.h.b(ds2.c.f242861d);

    /* renamed from: c, reason: collision with root package name */
    public static final float f242868c = ((c61.l7) i95.n0.c(c61.l7.class)).ek().M;

    public static final boolean b(java.lang.String str, int i17) {
        if (i17 == 1) {
            return kotlin.jvm.internal.o.b(str, "h264");
        }
        if (i17 == 2) {
            return kotlin.jvm.internal.o.b(str, "h265");
        }
        if (i17 != 3) {
            return false;
        }
        return kotlin.jvm.internal.o.b(str, "h266");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    public final mn2.g4 a(r45.mb4 mb4Var) {
        java.lang.Object obj;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.protobuf.f fVar2;
        java.lang.Object obj2;
        com.tencent.mm.protobuf.f fVar3;
        com.tencent.mm.protobuf.f fVar4;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z65.c.a()) {
            return null;
        }
        java.lang.String str2 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().E;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.util.LinkedList list = mb4Var.getList(44);
            kotlin.jvm.internal.o.f(list, "getHdr_spec(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((r45.vf2) obj).getString(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                    break;
                }
            }
            com.tencent.mm.protobuf.f fVar5 = (r45.vf2) obj;
            if (fVar5 == null) {
                java.util.LinkedList list2 = mb4Var.getList(43);
                kotlin.jvm.internal.o.f(list2, "getHls_spec(...)");
                java.util.Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        fVar = 0;
                        break;
                    }
                    fVar = it6.next();
                    if (kotlin.jvm.internal.o.b(((r45.jb1) fVar).getString(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                        break;
                    }
                }
                fVar5 = (r45.jb1) fVar;
                if (fVar5 == null) {
                    java.util.LinkedList list3 = mb4Var.getList(15);
                    kotlin.jvm.internal.o.f(list3, "getSpec(...)");
                    java.util.Iterator it7 = list3.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            fVar2 = 0;
                            break;
                        }
                        fVar2 = it7.next();
                        if (kotlin.jvm.internal.o.b(((r45.vf2) fVar2).getString(0), str2) && !android.text.TextUtils.isEmpty(str2)) {
                            break;
                        }
                    }
                    fVar5 = (r45.vf2) fVar2;
                }
            }
            if (fVar5 == null) {
                return null;
            }
            com.tencent.mm.protobuf.f parseFrom = new r45.vf2().parseFrom(fVar5.toByteArray());
            r45.vf2 vf2Var = parseFrom instanceof r45.vf2 ? (r45.vf2) parseFrom : null;
            if (vf2Var != null) {
                return new mn2.g4(mb4Var, yr2.k.X.c(vf2Var.getString(0)), vf2Var.getString(0), yr2.l.a(vf2Var), vf2Var.getInteger(4), null, fVar5 instanceof r45.jb1, vf2Var, 32, null);
            }
            return null;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128062ze).getValue()).r()).intValue();
        if (intValue == 0) {
            return null;
        }
        java.util.LinkedList list4 = mb4Var.getList(44);
        kotlin.jvm.internal.o.f(list4, "getHdr_spec(...)");
        java.util.Iterator it8 = list4.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it8.next();
            if (b(((r45.vf2) obj2).getString(3), intValue)) {
                break;
            }
        }
        com.tencent.mm.protobuf.f fVar6 = (r45.vf2) obj2;
        if (fVar6 == null) {
            java.util.LinkedList list5 = mb4Var.getList(43);
            kotlin.jvm.internal.o.f(list5, "getHls_spec(...)");
            java.util.Iterator it9 = list5.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    fVar3 = 0;
                    break;
                }
                fVar3 = it9.next();
                if (b(((r45.jb1) fVar3).getString(3), intValue)) {
                    break;
                }
            }
            fVar6 = (r45.jb1) fVar3;
            if (fVar6 == null) {
                java.util.LinkedList list6 = mb4Var.getList(15);
                kotlin.jvm.internal.o.f(list6, "getSpec(...)");
                java.util.Iterator it10 = list6.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        fVar4 = 0;
                        break;
                    }
                    fVar4 = it10.next();
                    if (b(((r45.vf2) fVar4).getString(3), intValue)) {
                        break;
                    }
                }
                fVar6 = (r45.vf2) fVar4;
            }
        }
        if (fVar6 == null) {
            return null;
        }
        com.tencent.mm.protobuf.f parseFrom2 = new r45.vf2().parseFrom(fVar6.toByteArray());
        r45.vf2 vf2Var2 = parseFrom2 instanceof r45.vf2 ? (r45.vf2) parseFrom2 : null;
        if (vf2Var2 != null) {
            return new mn2.g4(mb4Var, yr2.k.X.c(vf2Var2.getString(0)), vf2Var2.getString(0), yr2.l.a(vf2Var2), vf2Var2.getInteger(4), null, fVar6 instanceof r45.jb1, null, 160, null);
        }
        return null;
    }

    public final mn2.g4 c(long j17, r45.mb4 media, boolean z17) {
        kotlin.jvm.internal.o.g(media, "media");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            mn2.g4 a17 = a(media);
            if (a17 == null) {
                try {
                    a17 = f(((yr2.k) ((jz5.n) f242867b).getValue()).b(j17, media), media, z17);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.mars.xlog.Log.i("FinderMediaSpecSelector", "quickFindBestVideoToPlay: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms feedId=" + pm0.v.u(j17) + " mediaCache:" + cu2.x.c(cu2.x.f222449a, "", false, false, false, 14, null).I0());
                    throw th;
                }
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
            cu2.x xVar = cu2.x.f222449a;
            java.lang.String n17 = a17.n();
            if (n17 == null) {
                n17 = "";
            }
            com.tencent.mars.xlog.Log.i("FinderMediaSpecSelector", "quickFindBestVideoToPlay: " + currentTimeMillis2 + "ms feedId=" + pm0.v.u(j17) + " mediaCache:" + cu2.x.c(xVar, n17, false, false, false, 14, null).I0());
            return a17;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mn2.g4 d(r45.mb4 r17, yz5.l r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds2.h.d(r45.mb4, yz5.l):mn2.g4");
    }

    public final mn2.g4 e(r45.mb4 mb4Var, yz5.l lVar) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(mb4Var.getList(15));
        java.util.LinkedList list = mb4Var.getList(43);
        kotlin.jvm.internal.o.f(list, "getHls_spec(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.protobuf.f parseFrom = new r45.vf2().parseFrom(((r45.jb1) it.next()).toByteArray());
            r45.vf2 vf2Var = parseFrom instanceof r45.vf2 ? (r45.vf2) parseFrom : null;
            if (vf2Var != null) {
                vf2Var.set(20, java.lang.Boolean.TRUE);
                linkedList.add(vf2Var);
            }
        }
        linkedList.addAll(mb4Var.getList(44));
        for (r45.vf2 vf2Var2 : kz5.n0.F0(linkedList, new ds2.b())) {
            kotlin.jvm.internal.o.g(vf2Var2, "<this>");
            boolean z17 = false;
            java.lang.String k17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.k(vf2Var2.getString(0), mb4Var.getString(9), mb4Var.getString(0));
            so2.i3 c17 = cu2.x.c(cu2.x.f222449a, k17, false, false, false, 14, null);
            boolean booleanValue = ((java.lang.Boolean) lVar.invoke(c17)).booleanValue();
            java.lang.String field_mediaId = c17.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            mn2.g4 g4Var = bs2.f.f23832c;
            boolean b17 = kotlin.jvm.internal.o.b(field_mediaId, g4Var != null ? g4Var.n() : null);
            boolean j17 = com.tencent.mm.vfs.w6.j(c17.u0());
            if ((booleanValue || b17) && j17) {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("FinderMediaSpecSelector", "findCacheSpecFromSvr: mediaId=" + k17 + "} ret:" + z17 + " isPreloadComplete=" + booleanValue + " isPlayerPreloaded=" + b17 + " cachePercent=" + c17.y0() + " isExist:" + j17 + " maxPercent:" + f242868c);
            if (z17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findCacheSpecFromSvr: hit cache:");
                sb6.append(c17);
                sb6.append(" svrSpec:");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList.add(yr2.l.b((r45.vf2) it6.next()));
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.w("FinderMediaSpecSelector", sb6.toString());
                return new mn2.g4(mb4Var, yr2.k.X.c(c17.field_fileFormat), c17.field_fileFormat, c17.field_reqFormat, c17.field_dynamicRangeType, null, c17.field_isHlsSpec, vf2Var2, 32, null);
            }
            if (z17) {
                break;
            }
        }
        return null;
    }

    public final mn2.g4 f(mn2.g4 result, r45.mb4 media, boolean z17) {
        mn2.g4 d17;
        mn2.g4 d18;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(media, "media");
        so2.i3 c17 = cu2.x.c(cu2.x.f222449a, result.n(), false, false, false, 14, null);
        float y07 = c17.y0();
        boolean F0 = c17.F0();
        float f17 = f242868c;
        if (f17 == -1.0f) {
            if (F0) {
                return result;
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127624be).getValue()).r()).intValue() == 1) {
                d18 = e(media, new ds2.d(z17));
                if (d18 == null) {
                    return result;
                }
            } else {
                d18 = d(media, new ds2.e(z17));
                if (d18 == null) {
                    return result;
                }
            }
            return d18;
        }
        if (y07 >= f17) {
            return result;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127624be).getValue()).r()).intValue() == 1) {
            d17 = e(media, new ds2.f(z17));
            if (d17 == null) {
                return result;
            }
        } else {
            d17 = d(media, new ds2.g(z17));
            if (d17 == null) {
                return result;
            }
        }
        return d17;
    }
}
