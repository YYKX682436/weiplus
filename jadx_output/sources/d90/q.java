package d90;

@j95.b
/* loaded from: classes11.dex */
public final class q extends i95.w implements d90.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f227445d = "MarkdownService";

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f227445d, "MarkdownService onCreate");
    }

    public d90.i wi(d90.j callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f227445d, "createParser");
        return new d90.p(callback);
    }
}
