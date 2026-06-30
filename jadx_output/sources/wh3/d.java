package wh3;

/* loaded from: classes10.dex */
public class d extends wh3.b {

    /* renamed from: d, reason: collision with root package name */
    public static final wh3.c f445967d = new wh3.c(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f445968e = java.lang.Math.max(4, java.lang.Runtime.getRuntime().availableProcessors());

    /* renamed from: f, reason: collision with root package name */
    public static final int f445969f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final long f445970g = 115964116992L;

    /* renamed from: h, reason: collision with root package name */
    public static final long f445971h = 1073741824;

    /* renamed from: c, reason: collision with root package name */
    public final dn.o f445972c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String mediaId, java.lang.String downloadUrl, dn.o taskInfo) {
        super(mediaId, downloadUrl);
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(downloadUrl, "downloadUrl");
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        this.f445972c = taskInfo;
    }

    public java.lang.String toString() {
        return "OnlineCdnSource mediaId:" + this.f445965a + " url:" + this.f445966b;
    }
}
