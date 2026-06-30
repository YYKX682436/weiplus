package x44;

/* loaded from: classes4.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final x44.y2 f451936a = new x44.y2();

    public final void a(android.content.Context context, java.lang.String userName, java.lang.String weAppId, java.lang.String sessionFrom, int i17, java.lang.String sendMessageTitle, java.lang.String sendMessagePath, java.lang.String sendMessageImg, java.lang.String uxInfo, java.lang.String subBusinessUsername) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doEnterChattingOnMainThread", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(weAppId, "weAppId");
        kotlin.jvm.internal.o.g(sessionFrom, "sessionFrom");
        kotlin.jvm.internal.o.g(sendMessageTitle, "sendMessageTitle");
        kotlin.jvm.internal.o.g(sendMessagePath, "sendMessagePath");
        kotlin.jvm.internal.o.g(sendMessageImg, "sendMessageImg");
        kotlin.jvm.internal.o.g(uxInfo, "uxInfo");
        kotlin.jvm.internal.o.g(subBusinessUsername, "subBusinessUsername");
        com.tencent.mm.sdk.platformtools.u3.h(new x44.w2(context, userName, weAppId, sessionFrom, i17, sendMessageTitle, sendMessagePath, sendMessageImg, uxInfo, subBusinessUsername));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doEnterChattingOnMainThread", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper");
    }
}
