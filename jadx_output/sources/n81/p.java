package n81;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final n81.p f335628a = new n81.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f335629b = kz5.c1.k(new jz5.l("MixAudio", "publicAudio"), new jz5.l("ExoVideoCache", "publicAudio"), new jz5.l("QQMusicCache", "publicAudio"), new jz5.l("ThumbVideoCache", "publicVideo"), new jz5.l("ProxyVideoCache", "publicVideo"), new jz5.l("WxaChromiumCronetCache", "publicNetwork"), new jz5.l("WxaCronetRequestCache", "publicNetwork"), new jz5.l("networkfiles", "publicNetwork"), new jz5.l("WxaSkylineCache", "publicSkyline"), new jz5.l("AppBrandEmojiCache", "publicEmoji"), new jz5.l("WxaSecureInput", "publicSecureInput"), new jz5.l("webservice", "publicWebservice"), new jz5.l("wagamefiles", "publicGame"), new jz5.l("WxaCommCacheFiles", "publicCommCache"), new jz5.l("AppBrandMultiTask", "publicMultiTask"), new jz5.l("AppBrandOpenVoip", "publicVoip"), new jz5.l("WxaCodePkgsTempDownloadCacheGlobal", "publicPkgDownloadCache"));

    public static final long a(n81.p pVar, java.util.List list) {
        com.tencent.mm.vfs.x1 m17;
        pVar.getClass();
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            j17 += (!com.tencent.mm.vfs.w6.j(str) || (m17 = com.tencent.mm.vfs.w6.m(str)) == null) ? 0L : m17.f213236f ? pVar.f(str) : m17.f213234d;
        }
        return j17;
    }

    public static final long b(n81.p pVar, java.util.List list) {
        long j17;
        com.tencent.mm.vfs.x1 m17;
        pVar.getClass();
        java.util.Iterator it = list.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandSweeperLogic", "deletePaths failed for path: " + str + ", error: " + e17.getMessage());
            }
            if (com.tencent.mm.vfs.w6.j(str) && (m17 = com.tencent.mm.vfs.w6.m(str)) != null) {
                if (m17.f213236f) {
                    j17 = pVar.f(str);
                    if (!com.tencent.mm.vfs.w6.g(str, true)) {
                        j17 = 0;
                    }
                    com.tencent.mm.vfs.w6.h(str);
                } else if (com.tencent.mm.vfs.w6.h(str)) {
                    j17 = m17.f213234d;
                }
                j18 += j17;
            }
            j17 = 0;
            j18 += j17;
        }
        return j18;
    }

    public static final void c(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            obj = new java.util.ArrayList();
            map.put(str, obj);
        }
        ((java.util.List) obj).add(str2);
    }

    public static final void d(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj = map.get(str);
        if (obj == null) {
            obj = new java.util.ArrayList();
            map.put(str, obj);
        }
        ((java.util.List) obj).add(str2);
    }

    public static /* synthetic */ java.util.List i(n81.p pVar, int i17, long j17, java.util.Set set, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = 2;
        }
        if ((i18 & 2) != 0) {
            j17 = -1;
        }
        if ((i18 & 4) != 0) {
            set = kz5.r0.f314002d;
        }
        return pVar.h(i17, j17, set);
    }

    public final java.lang.String e(java.lang.String str) {
        return r26.i0.n(str, "/", false) ? str : str.concat("/");
    }

    public final long f(java.lang.String str) {
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, true);
        long j17 = 0;
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            while (it.hasNext()) {
                j17 += ((com.tencent.mm.vfs.x1) it.next()).f213234d;
            }
        }
        return j17;
    }

    public final java.lang.String g() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("WxaCodePkgsCacheGlobal");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        kotlin.jvm.internal.o.d(c17);
        sb6.append(e(c17));
        sb6.append("pagesidx");
        return sb6.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        if (r5.moveToNext() != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r5.isNull(1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r10 = r10.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r5.isNull(2) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r12 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r12.length() != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r13 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        r12 = r12.f305629d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r4.add(new n81.e(r6, r10, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r12 = k91.j5.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
    
        r12 = r5.getString(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        r10 = java.lang.Long.valueOf(r5.getLong(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0053, code lost:
    
        r6 = r5.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        vz5.b.a(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        if (r5.moveToFirst() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r5.isNull(0) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List, java.util.Collection, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h(int r21, long r22, java.util.Set r24) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n81.p.h(int, long, java.util.Set):java.util.List");
    }

    public final boolean j(java.lang.String str) {
        if (!com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, false);
        return s17 != null && (kz5.n0.S0(s17).isEmpty() ^ true);
    }
}
