package jr;

/* loaded from: classes4.dex */
public final class e extends dm.x2 {

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f301296r = dm.x2.initAutoDBInfo(jr.e.class);

    @Override // dm.x2, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = f301296r;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final boolean t0() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_request_interval, 24);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSuggestCacheInfo", "needUpdate: config " + Ni);
        return com.tencent.mm.sdk.platformtools.t8.H1((long) this.field_updateTime) > ((long) Ni) * 3600;
    }
}
