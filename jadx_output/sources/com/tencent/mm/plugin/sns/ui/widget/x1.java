package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class x1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f171308c;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f171310e;

    /* renamed from: f, reason: collision with root package name */
    public static long f171311f;

    /* renamed from: h, reason: collision with root package name */
    public static int f171313h;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f171314i;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.widget.x1 f171306a = new com.tencent.mm.plugin.sns.ui.widget.x1();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f171307b = new com.tencent.mm.sdk.platformtools.r2(300);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f171309d = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f171315j = kotlinx.coroutines.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public static final float f171312g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_emoticon_comment_detail_cgi_interval, 0.5f);

    static {
        f171308c = 1000;
        f171314i = true;
        f171314i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_emoticon_emoji_info_update_by_cgi, 1) == 1;
        f171308c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_emoticon_file_cache_limit_count, 1000);
    }

    public static final /* synthetic */ com.tencent.mm.sdk.platformtools.r2 a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMemoryCache$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.sdk.platformtools.r2 r2Var = f171307b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMemoryCache$p", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return r2Var;
    }

    public final void b(long j17, r45.e86 e86Var) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList = f171309d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                z17 = false;
                break;
            }
            r45.z76 z76Var = (r45.z76) it.next();
            if (z76Var.f391777e == e86Var.f373132m && z76Var.f391778f == e86Var.f373137r) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBatchCommentIdIsRepeat", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                z17 = true;
                break;
            }
        }
        if (!z17) {
            r45.z76 z76Var2 = new r45.z76();
            z76Var2.f391776d = j17;
            z76Var2.f391777e = e86Var.f373132m;
            z76Var2.f391778f = e86Var.f373137r;
            z76Var2.f391779g = 0;
            arrayList.add(z76Var2);
            d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addBatchEmoticon", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        f171313h++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        if (f171310e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        java.util.ArrayList arrayList = f171309d;
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        if (f171313h <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        if (((float) (java.lang.System.currentTimeMillis() - f171311f)) < f171312g * 1000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return;
        }
        f171311f = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "batchCommentContentFromServer >> lastReqTimeStamp: " + f171311f);
        f171310e = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9774;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmsnscommentdetail";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.b86 b86Var = new r45.b86();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReqList", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = arrayList.size();
        if (20 <= size) {
            size = 20;
        }
        java.util.Iterator it = arrayList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            arrayList2.add((r45.z76) next);
            if (arrayList2.size() == size) {
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReqList", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        b86Var.f370633e.addAll(arrayList2);
        b86Var.f370632d = arrayList2.size();
        lVar.f70664a = b86Var;
        lVar.f70665b = new r45.c86();
        com.tencent.mm.modelbase.z2.d(lVar.a(), new com.tencent.mm.plugin.sns.ui.widget.r1(b86Var), false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("batchCommentContentFromServer", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("timeline_emoticon_cache");
        if (!com.tencent.mm.vfs.w6.j(c17)) {
            com.tencent.mm.vfs.w6.u(c17);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "create dir:" + c17);
        }
        java.lang.String str2 = c17 + '/' + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cachePathForMd5", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return str2;
    }

    public final r45.l86 f(long j17, r45.e86 commentInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        kotlin.jvm.internal.o.g(commentInfo, "commentInfo");
        if (!com.tencent.mm.plugin.sns.ui.widget.q2.f171251d.n(commentInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return null;
        }
        r45.l86 l86Var = (r45.l86) commentInfo.f373140u.getFirst();
        java.lang.String str = l86Var.f379230d;
        com.tencent.mm.sdk.platformtools.r2 r2Var = f171307b;
        if (r2Var.k(str)) {
            r45.m86 m86Var = (r45.m86) r2Var.get(str);
            kotlin.jvm.internal.o.d(m86Var);
            if (!g(m86Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> memoryCache is invalid to addBatch " + str);
                b(j17, commentInfo);
            }
            r45.l86 l86Var2 = m86Var.f380248e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return l86Var2;
        }
        kotlin.jvm.internal.o.d(str);
        java.lang.String e17 = e(str);
        if (com.tencent.mm.vfs.w6.j(e17)) {
            r45.m86 m86Var2 = new r45.m86();
            i(e17, m86Var2);
            if (g(m86Var2)) {
                r2Var.put(str, m86Var2);
                r45.l86 l86Var3 = m86Var2.f380248e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                return l86Var3;
            }
            if (m86Var2.f380248e != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> file has exist but is invalid to addBatch ".concat(str));
                r2Var.put(str, m86Var2);
                b(j17, commentInfo);
                r45.l86 l86Var4 = m86Var2.f380248e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
                return l86Var4;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentEmojiInfoCache", "getEmojiInfo >> no cache to addBatch ".concat(str));
        b(j17, commentInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return l86Var;
    }

    public final boolean g(r45.m86 m86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        kotlin.jvm.internal.o.g(m86Var, "<this>");
        r45.l86 l86Var = m86Var.f380248e;
        if (l86Var == null || l86Var.f379236m != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return false;
        }
        if (java.lang.System.currentTimeMillis() / 1000 > m86Var.f380249f + m86Var.f380248e.f379237n) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        return true;
    }

    public final void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        f171313h--;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeReqPageCount", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void i(java.lang.String str, r45.m86 m86Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        try {
            m86Var.parseFrom(com.tencent.mm.vfs.w6.N(str, 0, (int) com.tencent.mm.vfs.w6.k(str)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCommentEmojiInfoCache", "safeParseCacheFile error >> " + str + " message: " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("safeParseCacheFile", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }

    public final void j(long j17, r45.e86 commentInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
        kotlin.jvm.internal.o.g(commentInfo, "commentInfo");
        if (f171314i && com.tencent.mm.plugin.sns.ui.widget.q2.f171251d.n(commentInfo)) {
            kotlinx.coroutines.l.d(f171315j, null, null, new com.tencent.mm.plugin.sns.ui.widget.w1(commentInfo, j17, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateEmojiInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentEmojiInfoCache");
    }
}
