package h40;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l15.c f278726a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f278727b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f278728c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.msg.MsgIdTalker f278729d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f278730e;

    /* renamed from: f, reason: collision with root package name */
    public final long f278731f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f278733h;

    public c(l15.c fileMsg, java.lang.String mediaId, java.lang.String downloadPath) {
        kotlin.jvm.internal.o.g(fileMsg, "fileMsg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(downloadPath, "downloadPath");
        this.f278726a = fileMsg;
        this.f278727b = mediaId;
        this.f278728c = downloadPath;
        this.f278731f = 6000000L;
        this.f278733h = true;
    }
}
