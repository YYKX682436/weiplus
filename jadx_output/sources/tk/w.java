package tk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final tk.v f419878e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk.w f419879f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tk.w[] f419880g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f419881h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419882d;

    static {
        tk.w wVar = new tk.w("OPEN_IMAGE_STR", 0, "openImage");
        f419879f = wVar;
        tk.w[] wVarArr = {wVar, new tk.w("OPEN_MP_PUBLISH_STR", 1, "openMpPublish"), new tk.w("OPEN_MP_ARTICLE_STR", 2, "openMpArticle"), new tk.w("OPEN_REGISTER_PAGE_STR", 3, "openRegisterPage"), new tk.w("OPEN_WEAPP_STR", 4, "openWeApp")};
        f419880g = wVarArr;
        f419881h = rz5.b.a(wVarArr);
        f419878e = new tk.v(null);
    }

    public w(java.lang.String str, int i17, java.lang.String str2) {
        this.f419882d = str2;
    }

    public static tk.w valueOf(java.lang.String str) {
        return (tk.w) java.lang.Enum.valueOf(tk.w.class, str);
    }

    public static tk.w[] values() {
        return (tk.w[]) f419880g.clone();
    }
}
