package wx;

@j95.b
/* loaded from: classes7.dex */
public final class q extends i95.w implements wx.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f450429d = "ChatBotIamService";

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f450429d, "onAccountInitialized registerAff");
        wx.o.f450424a.a();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f450429d, "attachNativeController releaseAffAsync");
        wx.o.f450424a.b();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i(this.f450429d, "ChatBotIamService onCreate");
    }
}
