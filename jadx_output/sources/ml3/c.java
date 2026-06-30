package ml3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ml3.c f328399a = new ml3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f328400b = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f328401c = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f328402d = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f328403e = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: f, reason: collision with root package name */
    public static ka0.n0 f328404f;

    public final void a(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveMid2urlMap, map size:" + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.cs4 cs4Var = (r45.cs4) it.next();
            if (cs4Var.f371808d == 0) {
                r45.as4 as4Var = cs4Var.f371810f;
                jz5.f0 f0Var = null;
                if (as4Var != null) {
                    java.lang.String mid = as4Var.f370241e;
                    kotlin.jvm.internal.o.f(mid, "mid");
                    java.lang.String url = cs4Var.f371811g;
                    kotlin.jvm.internal.o.f(url, "url");
                    int i17 = cs4Var.f371812h;
                    boolean z17 = cs4Var.f371813i;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicLiveLinkCacheHelper", "saveTempPlayUrl, mid:" + mid + ", url:" + url);
                    if (!android.text.TextUtils.isEmpty(mid) && !android.text.TextUtils.isEmpty(url)) {
                        f328400b.put(mid, url);
                        f328402d.put(mid, java.lang.Integer.valueOf(i17));
                        f328403e.put(mid, java.lang.Boolean.valueOf(z17));
                        f328401c.put(mid, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        ka0.n0 n0Var = f328404f;
                        if (n0Var != null) {
                            com.tencent.mm.plugin.mv.ui.uic.d8 d8Var = (com.tencent.mm.plugin.mv.ui.uic.d8) n0Var;
                            d8Var.f151102a.V6(d8Var.f151103b);
                            ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
                            f328404f = null;
                        }
                    }
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicLiveLinkCacheHelper", "linkInfo.info is null");
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicLiveLinkCacheHelper", "errCode:" + cs4Var.f371808d + ", errMsg:" + cs4Var.f371809e);
            }
        }
    }
}
