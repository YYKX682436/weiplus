package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes4.dex */
public final class x0 {
    public x0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        r45.f9 f9Var = new r45.f9();
        f9Var.f374108d = str;
        f9Var.f374109e = str2;
        linkedList.add(f9Var);
    }

    public final void b(r45.d9 d9Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = d9Var;
        lVar.f70665b = new r45.e9();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/appmsg/appmsg_report";
        lVar.f70667d = 1870;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), com.tencent.mm.plugin.webview.ui.tools.media.w0.f185831a);
    }

    public final void c(int i17, java.util.LinkedList linkedList) {
        if (com.tencent.mars.xlog.Log.getLogLevel() >= 1 || com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((r45.f9) it.next()).f374108d;
        }
    }

    public final void d(int i17, int i18, java.lang.String vid, java.lang.String url, int i19, int i27) {
        kotlin.jvm.internal.o.g(vid, "vid");
        kotlin.jvm.internal.o.g(url, "url");
        r45.d9 d9Var = new r45.d9();
        r45.c9 c9Var = new r45.c9();
        c9Var.f371380d = 2;
        java.util.LinkedList item = c9Var.f371381e;
        kotlin.jvm.internal.o.f(item, "item");
        a("Vid", vid, item);
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        kotlin.jvm.internal.o.f(item, "item");
        a("Network", formatedNetType, item);
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        kotlin.jvm.internal.o.f(item, "item");
        a("SharePageType", valueOf, item);
        kotlin.jvm.internal.o.f(item, "item");
        a("ContentUrl", url, item);
        kotlin.jvm.internal.o.f(item, "item");
        a("#AppMsgUrl#", url, item);
        java.lang.String valueOf2 = java.lang.String.valueOf(i17);
        kotlin.jvm.internal.o.f(item, "item");
        a("ActionType", valueOf2, item);
        kotlin.jvm.internal.o.f(item, "item");
        a("SessionId", "" + i19, item);
        java.lang.String valueOf3 = java.lang.String.valueOf(i27);
        kotlin.jvm.internal.o.f(item, "item");
        a("EnterId", valueOf3, item);
        d9Var.f372242d.add(c9Var);
        b(d9Var);
        kotlin.jvm.internal.o.f(item, "item");
        c(10380, item);
    }

    public final void e(int i17, java.lang.String vid, java.lang.String url, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(vid, "vid");
        kotlin.jvm.internal.o.g(url, "url");
        r45.d9 d9Var = new r45.d9();
        r45.c9 c9Var = new r45.c9();
        c9Var.f371380d = 3;
        java.util.LinkedList item = c9Var.f371381e;
        kotlin.jvm.internal.o.f(item, "item");
        a("#AppMsgUrl#", url, item);
        kotlin.jvm.internal.o.f(item, "item");
        a("VideoId", vid, item);
        java.lang.String valueOf = java.lang.String.valueOf(i18);
        kotlin.jvm.internal.o.f(item, "item");
        a("Scene", valueOf, item);
        java.lang.String valueOf2 = java.lang.String.valueOf(i19);
        kotlin.jvm.internal.o.f(item, "item");
        a("SubScene", valueOf2, item);
        java.lang.String valueOf3 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        kotlin.jvm.internal.o.f(item, "item");
        a("ClientId", valueOf3, item);
        kotlin.jvm.internal.o.f(item, "item");
        a("SessionId", "" + i27, item);
        java.lang.String valueOf4 = java.lang.String.valueOf(i28);
        kotlin.jvm.internal.o.f(item, "item");
        a("EnterId", valueOf4, item);
        java.lang.String valueOf5 = java.lang.String.valueOf(i17);
        kotlin.jvm.internal.o.f(item, "item");
        a("EventType", valueOf5, item);
        d9Var.f372242d.add(c9Var);
        b(d9Var);
        kotlin.jvm.internal.o.f(item, "item");
        c(17537, item);
    }
}
