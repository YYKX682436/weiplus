package uw;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.lang.String f431480e;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f431477b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(uw.a.class, "persistenceCacheUnReadArticleMsgCnt", "getPersistenceCacheUnReadArticleMsgCnt()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final uw.a f431476a = new uw.a();

    /* renamed from: c, reason: collision with root package name */
    public static final b30.c f431478c = new b30.c(-1, "KEY_ECS_BOX_INFO_UNREAD_ARTICLE_MSG_CNT");

    /* renamed from: d, reason: collision with root package name */
    public static int f431479d = -1;

    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsCachedGetter", "updateCachedUnReadArticleMsgCnt cacheUnReadArticleMsgCnt:" + f431479d + " unReadArticleMsgCnt:" + i17);
        f431479d = i17;
        f431478c.c(this, f431477b[0], java.lang.Integer.valueOf(i17));
    }
}
