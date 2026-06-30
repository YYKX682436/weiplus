package ta0;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f416596a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f416597b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f416598c;

    static {
        java.lang.String str = com.tencent.mm.vfs.q7.c("newlife") + '/';
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEW_LIFE_ROOT=" + str);
        java.lang.String str2 = str + "cache/image/";
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEW_LIFE_MEDIA_IMAGE_DIR=" + str2);
        f416596a = str2;
        java.lang.String str3 = com.tencent.mm.vfs.q7.c("newlife/posting") + '/';
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEWLIFE_POSTING_ROOT=" + str3);
        f416597b = str3;
        java.lang.String str4 = str3 + "media_tmp/";
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifePathRouter", "POST_MEDIA_TMP_DIR=" + str4);
        f416598c = str4;
    }
}
