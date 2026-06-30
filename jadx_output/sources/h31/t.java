package h31;

/* loaded from: classes9.dex */
public final class t extends g31.l {
    public t() {
        super(null);
    }

    @Override // g31.l, e31.k
    public void a(java.lang.String bizUsername, java.util.List subscribeMsgList, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(subscribeMsgList, "subscribeMsgList");
        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeMsgServiceProxy", "saveSubscribeMsgUiStatus not implemented in non-mm process");
    }

    @Override // e31.k
    public void b(android.content.Context context, int i17, java.lang.String bizUsername, java.lang.String nickname, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeMsgServiceProxy", "goToSettingManagerUI not implemented in non-mm process");
    }

    @Override // g31.l, e31.k
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle extra) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extra, "extra");
        super.c(context, str, str2, extra);
    }

    @Override // g31.l, e31.k
    public void d(java.lang.String bizUsername, java.lang.String templateId) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeMsgServiceProxy", "isTemplateMsgSubscribed not implemented in non-mm process");
    }

    @Override // g31.l, e31.k
    public void f(java.lang.String bizUsername, boolean z17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeMsgServiceProxy", "updateLocalSwitchOpened not implemented in non-mm process");
    }

    @Override // g31.l, e31.k
    public void g(android.content.Context context, int i17, int i18, java.lang.String bizAppId, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizAppId, "bizAppId");
        super.g(context, i17, i18, bizAppId, bundle);
    }

    @Override // g31.l, e31.k
    public void h(java.lang.String bizUsername, com.tencent.mm.msgsubscription.SubscribeMsgTmpItem tmpItem, e31.i iVar) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(tmpItem, "tmpItem");
        com.tencent.mars.xlog.Log.w("MicroMsg.SubscribeMsgServiceProxy", "switchSubscribeStatus not implemented in non-mm process");
    }
}
