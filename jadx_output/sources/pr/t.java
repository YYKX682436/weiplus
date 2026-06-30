package pr;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f357781a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f357782b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f357783c;

    public t(int i17, java.lang.String str, boolean z17) {
        this.f357781a = i17;
        this.f357782b = str;
        this.f357783c = z17;
    }

    public final void a() {
        com.tencent.mm.storage.u3 u3Var;
        com.tencent.mm.storage.u3 u3Var2;
        int i17 = this.f357781a;
        if (i17 == 1) {
            u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            u3Var2 = com.tencent.mm.storage.u3.USERINFO_EMOJI_NEXT_CAPTURE_BATCH_DOWNLOAD_TIME_LONG;
        } else {
            u3Var = com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN;
            u3Var2 = com.tencent.mm.storage.u3.USERINFO_EMOJI_NEXT_CUSTOM_BATCH_DOWNLOAD_TIME_LONG;
        }
        boolean z17 = this.f357783c;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSyncFetchList", "forceUpdateAll");
        }
        new pr.t0(i17, this.f357782b, z17, new pr.s(u3Var2, u3Var, this));
    }
}
