package com.tencent.mm.plugin.rtos.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RtosWatchGetA8KeyRedirectListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetA8KeyRedirectEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f158585d;

    public RtosWatchGetA8KeyRedirectListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.f158585d = "MicroMsg.Rtos.RtosWatchGetA8KeyRedirectListener";
        this.__eventId = -1894126628;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent) {
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent event = getA8KeyRedirectEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f158585d;
        com.tencent.mars.xlog.Log.i(str, "callback");
        am.df dfVar = event.f54376g;
        int i17 = dfVar.f6446a;
        java.lang.String str2 = dfVar.f6447b;
        if (i17 != 54) {
            com.tencent.mars.xlog.Log.w(str, "action code is no RtosWatch code. %d", java.lang.Integer.valueOf(i17));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w(str, "url is empty.");
        } else {
            java.lang.String queryParameter = android.net.Uri.parse(str2).getQueryParameter(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC);
            java.lang.String a17 = c01.b9.f37069c.a("last_avatar_path", "");
            com.tencent.mars.xlog.Log.i(str, "device mac : %s", queryParameter);
            android.content.Intent intent = new android.content.Intent();
            intent.setFlags(268435456);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.class);
            intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, queryParameter);
            intent.putExtra("avatar", a17);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/rtos/model/RtosWatchGetA8KeyRedirectListener", "callback", "(Lcom/tencent/mm/autogen/events/GetA8KeyRedirectEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return false;
    }
}
