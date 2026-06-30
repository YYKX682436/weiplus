package wj;

@j95.b
/* loaded from: classes12.dex */
public final class j0 extends i95.w implements xj.i {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f446423d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f446424e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f446425f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f446426g = new java.util.concurrent.ConcurrentHashMap();

    public static void hj(wj.j0 j0Var, java.lang.String posId, r45.e5 e5Var, java.lang.Long l17, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.protobuf.g byteString;
        java.lang.String str = null;
        if ((i17 & 4) != 0) {
            l17 = null;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        j0Var.getClass();
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "innerSaveAdsInfo, posId: " + posId + ", enableMultiple: " + z17);
        if (l17 != null) {
            long longValue = l17.longValue();
            long b17 = ik.f.f291821a.b() + (1000 * longValue);
            com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "innerSaveAdsInfo, save expireTime, expireTime: " + longValue + ", expiredTime: " + b17);
            gk.b.f272408a.j(b17, posId);
        }
        if (e5Var != null && (byteString = e5Var.getByteString(6)) != null) {
            str = ik.f.f291821a.d(posId, byteString.i());
        }
        if (!z17) {
            gk.b bVar = gk.b.f272408a;
            kotlin.jvm.internal.o.g(posId, "posId");
            gk.b.f272409b.remove(bVar.g(posId));
        }
        if (e5Var != null) {
            if (!(str == null || str.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "innerSaveAdsInfo, override adsInfo, aid: " + str + ", posId: " + posId);
                gk.b bVar2 = gk.b.f272408a;
                kotlin.jvm.internal.o.g(posId, "posId");
                gk.b.f272409b.G("magicAd-feedback-".concat(posId), false);
                com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "set feedback for posId: ".concat(posId));
                bVar2.i(str, e5Var);
                bVar2.e(posId, str);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "innerSaveAdsInfo, input adsInfo is empty, do nothing, posId: " + posId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void wi(wj.j0 r20, wj.t0 r21, wj.u0 r22, java.lang.String r23, wj.o r24, java.lang.String r25, r45.m93 r26) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.wi(wj.j0, wj.t0, wj.u0, java.lang.String, wj.o, java.lang.String, r45.m93):void");
    }

    public wj.n Ai(java.lang.String aid) {
        kotlin.jvm.internal.o.g(aid, "aid");
        r45.e5 a17 = gk.b.f272408a.a(aid);
        if (a17 == null) {
            return wj.n.f446447d;
        }
        com.tencent.mm.protobuf.g byteString = a17.getByteString(14);
        java.lang.String i17 = byteString != null ? byteString.i() : null;
        long j17 = a17.getLong(15);
        if (i17 == null) {
            return wj.n.f446447d;
        }
        android.content.pm.PackageInfo a18 = ik1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        return a18 != null ? ((long) a18.versionCode) >= j17 ? wj.n.f446450g : wj.n.f446449f : wj.n.f446448e;
    }

    public final wj.v0 Bi(wj.t0 t0Var) {
        wj.y0 y0Var = t0Var.f446525n;
        if (y0Var == wj.y0.f446549d) {
            return null;
        }
        java.lang.String str = t0Var.f446526o;
        boolean z17 = false;
        if (str == null || str.length() == 0) {
            return null;
        }
        ik.f fVar = ik.f.f291821a;
        boolean b17 = str != null ? ik1.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a, str) : false;
        int ordinal = y0Var.ordinal();
        if (ordinal == 1) {
            z17 = b17;
        } else if (ordinal == 2 && !b17) {
            z17 = true;
        }
        if (!z17) {
            return null;
        }
        wj.v0 v0Var = b17 ? wj.v0.f446536e : wj.v0.f446537f;
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "client intercept posId:" + t0Var.f446518d + " policy:" + y0Var + " pkg:" + str + " installed:" + b17 + " reason:" + v0Var);
        fk.d.b(wj.q0.f446490t, t0Var.f446518d, null, v0Var.f446539d, str, null, 32, null);
        return v0Var;
    }

    public void Di(wj.t0 posId, java.lang.String aid) {
        kotlin.jvm.internal.o.g(posId, "posId");
        kotlin.jvm.internal.o.g(aid, "aid");
        gk.b bVar = gk.b.f272408a;
        java.lang.String posId2 = posId.toString();
        kotlin.jvm.internal.o.g(posId2, "posId");
        java.lang.String g17 = bVar.g(posId2);
        com.tencent.mm.sdk.platformtools.o4 o4Var = gk.b.f272409b;
        java.util.Set v17 = o4Var.v(g17);
        boolean z17 = false;
        if (v17 != null) {
            java.util.Set W0 = kz5.n0.W0(v17);
            if (W0.contains(aid)) {
                W0.remove(aid);
                o4Var.F(bVar.g(posId2), W0);
                com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "Aid set to " + aid + " for posId: " + posId2);
                z17 = true;
            }
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MagicAdCommonFeatureService", "clearAdInfo, aid not been include in posId, posId: " + posId + ", aid: " + aid);
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "clearAdInfo, posId: " + posId + ", aid: " + aid);
        bVar.h(aid);
    }

    public void Ni() {
        gk.b bVar = gk.b.f272408a;
        gk.b.f272409b.d();
        this.f446424e.clear();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fk.d.f263258a;
        for (java.util.Map.Entry entry : fk.d.f263258a.entrySet()) {
            fk.a aVar = (fk.a) entry.getValue();
            synchronized (aVar) {
                com.tencent.matrix.lifecycle.owners.ProcessUIResumedStateOwner.INSTANCE.removeLifecycleCallback(aVar.f263248a);
            }
        }
        fk.d.f263258a.clear();
    }

    public final void Ri(wj.t0 t0Var, r45.e5 e5Var, wj.u0 u0Var) {
        java.util.Set set = (java.util.Set) this.f446426g.remove(t0Var);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f446423d.removeCallbacks((java.lang.Runnable) it.next());
            }
        }
        java.util.Set set2 = (java.util.Set) this.f446425f.remove(t0Var);
        if (set2 == null) {
            com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "dispatchAsyncCallbacks, no pending callbacks for posId: " + t0Var);
            return;
        }
        wj.p pj6 = pj(t0Var);
        int size = set2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                break;
            }
            nj(t0Var, pj6, null);
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchAsyncCallbacks, dispatching ");
        sb6.append(set2.size());
        sb6.append(" callbacks, posId: ");
        sb6.append(t0Var);
        sb6.append(", aid: ");
        xj.m mVar = pj6.f446462a;
        sb6.append(mVar != null ? mVar.f454753a : null);
        sb6.append(", value: ");
        sb6.append(pj6.f446463b);
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb6.toString());
        pm0.v.X(new wj.q(set2, mVar));
    }

    public xj.m Ui(wj.t0 posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        wj.v0 Bi = Bi(posId);
        if (Bi != null) {
            nj(posId, new wj.p(null, wj.o0.f446459h, "reason=" + Bi.f446539d), null);
            return null;
        }
        gk.b bVar = gk.b.f272408a;
        java.lang.String str = posId.f446518d;
        if (bVar.d(str)) {
            cj(posId, bVar.b(posId) != null, wj.u0.f446530e);
        }
        if (bVar.f(str)) {
            nj(posId, new wj.p(null, wj.o0.f446458g, null), null);
            return null;
        }
        wj.p pj6 = pj(posId);
        nj(posId, pj6, null);
        return pj6.f446462a;
    }

    public void Vi(wj.t0 posId, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(posId, "posId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "getAdInfoAsync, entry, posId: " + posId + ", timeout: " + j17);
        wj.v0 Bi = Bi(posId);
        if (Bi != null) {
            nj(posId, new wj.p(null, wj.o0.f446459h, "reason=" + Bi.f446539d), null);
            pm0.v.X(new wj.r(callback));
            return;
        }
        gk.b bVar = gk.b.f272408a;
        java.lang.String str = posId.f446518d;
        boolean d17 = bVar.d(str);
        if (bVar.f(str)) {
            if (d17) {
                cj(posId, bVar.b(posId) != null, wj.u0.f446530e);
            }
            nj(posId, new wj.p(null, wj.o0.f446458g, null), null);
            pm0.v.X(new wj.s(callback));
            return;
        }
        xj.m Zi = Zi(posId);
        if (Zi != null) {
            nj(posId, new wj.p(Zi, wj.o0.f446456e, null), null);
            if (d17) {
                cj(posId, true, wj.u0.f446530e);
            }
            pm0.v.X(new wj.t(callback, Zi));
            return;
        }
        if (!d17) {
            wj.p pj6 = pj(posId);
            nj(posId, pj6, null);
            pm0.v.X(new wj.u(callback, pj6.f446462a));
            return;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        this.f446425f.compute(posId, new wj.v(callback, c0Var));
        if (c0Var.f310112d) {
            cj(posId, false, wj.u0.f446530e);
        }
        if (j17 > 0) {
            wj.a0 a0Var = new wj.a0(this, posId, callback);
            ((java.util.Set) this.f446426g.computeIfAbsent(posId, wj.w.f446540a)).add(a0Var);
            this.f446423d.postDelayed(a0Var, j17);
        }
    }

    public final xj.m Zi(wj.t0 t0Var) {
        com.tencent.mm.protobuf.g byteString;
        r45.e5 b17 = gk.b.f272408a.b(t0Var);
        if (b17 != null && (byteString = b17.getByteString(6)) != null) {
            java.lang.String i17 = byteString.i();
            if (!(i17.length() > 0)) {
                i17 = null;
            }
            if (i17 != null) {
                return rj(t0Var, ik.f.f291821a.e(t0Var, i17), b17);
            }
        }
        return null;
    }

    public void aj(java.lang.String aid) {
        kotlin.jvm.internal.o.g(aid, "aid");
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "handleAdFeedbackClose, aid: ".concat(aid));
        fj(aid, wj.p0.f446468i, null);
        gk.b bVar = gk.b.f272408a;
        r45.e5 a17 = bVar.a(aid);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "handleAdFeedbackClose, ad not found");
            return;
        }
        java.lang.String string = a17.getString(5);
        kotlin.jvm.internal.o.d(string);
        java.lang.String concat = "magicAd-feedback-".concat(string);
        com.tencent.mm.sdk.platformtools.o4 o4Var = gk.b.f272409b;
        o4Var.G(concat, true);
        com.tencent.mars.xlog.Log.i("AdCommonFeatureMAP", "set feedback for posId: ".concat(string));
        bVar.h(aid);
        o4Var.remove(bVar.g(string));
    }

    public void bj(java.lang.String aid, xj.n nVar, xj.l lVar) {
        android.content.Context context;
        boolean a17;
        android.content.Intent intent;
        wj.r0 r0Var;
        java.util.Map map;
        kotlin.jvm.internal.o.g(aid, "aid");
        fj(aid, wj.p0.f446467h, null);
        r45.e5 a18 = gk.b.f272408a.a(aid);
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "handleAdOpen, adInfo not found");
            return;
        }
        if (nVar == null || (context = nVar.f454763c) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        com.tencent.mm.protobuf.g byteString = a18.getByteString(14);
        java.lang.String i17 = byteString != null ? byteString.i() : null;
        long j17 = a18.getLong(15);
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "handleAdOpen, aid:".concat(aid));
        ik.f fVar = ik.f.f291821a;
        if (i17 != null ? ik1.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17) : false) {
            a17 = fVar.a(i17, j17);
        } else {
            com.tencent.mars.xlog.Log.i("MagicAdCommonUtils", "checkPkgInstalledAndVersionOk, pkg not found, pkg: " + i17);
            a17 = false;
        }
        if (!a17) {
            com.tencent.mm.protobuf.g byteString2 = a18.getByteString(18);
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(byteString2 != null ? byteString2.i() : null);
            com.tencent.mm.protobuf.g byteString3 = a18.getByteString(19);
            java.lang.String i18 = byteString3 != null ? byteString3.i() : null;
            if (i18 == null) {
                i18 = "";
            }
            java.lang.String string = a18.getString(0);
            java.lang.String string2 = a18.getString(5);
            wj.t0 c17 = fVar.c(string2 != null ? string2 : "");
            com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "open install page, canvasId: " + E1 + ", dynamicInfo; " + i18);
            p94.v0 v0Var = new p94.v0();
            v0Var.f352919g = i18;
            v0Var.f352917e = c17.f446519e;
            if (c17.f446521g) {
                v0Var.f352926n = false;
            }
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).wi(context2, E1, string, v0Var);
            fj(aid, wj.p0.f446470n, null);
            if (lVar != null) {
                lVar.onJumpDownloadPage();
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.g byteString4 = a18.getByteString(12);
        android.net.Uri parse = byteString4 != null ? android.net.Uri.parse(byteString4.i()) : null;
        if (parse == null) {
            com.tencent.mars.xlog.Log.e("MagicAdCommonFeatureService", "handleAdOpen, try open, but schemeUrl is empty");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAdOpen, schemeUrlQuery: ");
        sb6.append(nVar != null ? nVar.f454764d : null);
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb6.toString());
        if (nVar != null && (map = nVar.f454764d) != null) {
            android.net.Uri.Builder buildUpon = parse.buildUpon();
            for (java.util.Map.Entry entry : map.entrySet()) {
                buildUpon.appendQueryParameter((java.lang.String) entry.getKey(), entry.getValue().toString());
            }
            parse = buildUpon.build();
            kotlin.jvm.internal.o.f(parse, "build(...)");
            parse.toString();
        }
        if (nVar == null || (intent = nVar.f454762b) == null) {
            intent = new android.content.Intent("android.intent.action.VIEW", parse);
        }
        android.content.Intent intent2 = intent;
        intent2.setPackage(i17);
        intent2.addFlags(268435456);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("scheme", parse.toString());
        intent2.putExtra("EXTRA_AD_INFO", bundle);
        java.lang.String valueOf = java.lang.String.valueOf(a18.getLong(13));
        com.tencent.mm.protobuf.g byteString5 = a18.getByteString(26);
        java.lang.String i19 = byteString5 != null ? byteString5.i() : null;
        java.lang.String string3 = a18.getString(5);
        java.lang.String str = string3 != null ? string3 : "";
        if (nVar == null || (r0Var = nVar.f454761a) == null) {
            r0Var = wj.r0.f446499e;
        }
        wj.r0 r0Var2 = r0Var;
        java.lang.String uri = parse.toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "handleAdOpen try open, pkg:" + i17 + " appId:" + valueOf + " schemeUrl:" + uri + " aid:" + aid);
        if (r0Var2 == wj.r0.f446499e) {
            fk.d.b(wj.q0.f446496z, str, aid, 0, null, null, 56, null);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new wj.d0(context2, intent2, i19, r0Var2, uri, str, aid, lVar, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cj(wj.t0 r18, boolean r19, wj.u0 r20) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.cj(wj.t0, boolean, wj.u0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[Catch: Exception -> 0x01a3, TryCatch #0 {Exception -> 0x01a3, blocks: (B:47:0x016d, B:49:0x0173, B:51:0x017c), top: B:46:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c A[Catch: Exception -> 0x01a3, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a3, blocks: (B:47:0x016d, B:49:0x0173, B:51:0x017c), top: B:46:0x016d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void fj(java.lang.String r22, wj.p0 r23, ak.a r24) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.fj(java.lang.String, wj.p0, ak.a):void");
    }

    public void ij(wj.t0 posId) {
        kotlin.jvm.internal.o.g(posId, "posId");
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "[preload] preloadAd, posId: " + posId);
        fk.d.b(wj.q0.f446492v, posId.f446518d, null, 0, null, null, 56, null);
        gk.b bVar = gk.b.f272408a;
        if (bVar.d(posId.f446518d)) {
            cj(posId, bVar.b(posId) != null, wj.u0.f446531f);
            return;
        }
        r45.e5 b17 = bVar.b(posId);
        if (b17 == null) {
            fk.d.b(wj.q0.f446493w, posId.f446518d, null, 1, "reason=cooldown", null, 32, null);
            return;
        }
        wj.q0 q0Var = wj.q0.f446493w;
        java.lang.String str = posId.f446518d;
        com.tencent.mm.protobuf.g byteString = b17.getByteString(6);
        fk.d.b(q0Var, str, byteString != null ? byteString.i() : null, 0, "reason=cache_hit_fresh", null, 32, null);
    }

    public void mj(java.lang.String aid, wj.w0 reportType, ak.a aVar) {
        wj.p0 p0Var;
        kotlin.jvm.internal.o.g(aid, "aid");
        kotlin.jvm.internal.o.g(reportType, "reportType");
        ik.f fVar = ik.f.f291821a;
        int ordinal = reportType.ordinal();
        if (ordinal == 0) {
            p0Var = wj.p0.f446465f;
        } else if (ordinal == 1) {
            p0Var = wj.p0.f446466g;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            p0Var = wj.p0.f446469m;
        }
        fj(aid, p0Var, aVar);
    }

    public final void nj(wj.t0 t0Var, wj.p pVar, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = str;
        java.lang.String str4 = pVar.f446464c;
        wj.o0 o0Var = pVar.f446463b;
        xj.m mVar = pVar.f446462a;
        if (str4 == null) {
            if (mVar != null) {
                xj.m mVar2 = o0Var == wj.o0.f446456e ? mVar : null;
                if (mVar2 != null) {
                    str4 = mVar2.toString();
                }
            }
            str4 = null;
        }
        if (str3 == null || str.length() == 0) {
            str2 = str4;
        } else {
            if (!(str4 == null || str4.length() == 0)) {
                str3 = str4 + '|' + str3;
            }
            str2 = str3;
        }
        fk.d.b(wj.q0.f446478e, t0Var.f446518d, mVar != null ? mVar.f454753a : null, o0Var.f446461d, str2, null, 32, null);
    }

    public void oj(wj.t0 posId, java.lang.String str) {
        kotlin.jvm.internal.o.g(posId, "posId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportNotShow, posId: ");
        sb6.append(posId.f446518d);
        sb6.append(", extra: ");
        sb6.append(str == null ? "null" : str);
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", sb6.toString());
        fk.d.b(wj.q0.f446494x, posId.f446518d, null, 0, str, null, 32, null);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ik.f fVar = ik.f.f291821a;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.ad.RepairerConfigCommonAdServiceUseMockData()) == 1) {
            c75.c.d(bk.a.f21258a, new wj.h0(this));
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicAdCommonFeatureService", "onCreate, process: " + bm5.f1.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final wj.p pj(wj.t0 r32) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.pj(wj.t0):wj.p");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xj.m qj(wj.t0 r16, byte[] r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.qj(wj.t0, byte[], boolean):xj.m");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xj.m rj(wj.t0 r20, java.lang.String r21, r45.e5 r22) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.j0.rj(wj.t0, java.lang.String, r45.e5):xj.m");
    }
}
