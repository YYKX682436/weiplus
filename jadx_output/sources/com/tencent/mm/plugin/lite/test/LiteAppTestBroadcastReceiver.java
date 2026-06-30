package com.tencent.mm.plugin.lite.test;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class LiteAppTestBroadcastReceiver extends android.content.BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f144285b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f144286a = "LiteAppTestBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("url");
        java.lang.String str = this.f144286a;
        com.tencent.mars.xlog.Log.i(str, "receive:%s", stringExtra);
        if (stringExtra != null) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_liteapp_enable_new_websocket, true)) {
                qa3.o oVar = qa3.o.f361051a;
                if (qa3.o.f361052b != null) {
                    qa3.o.f361053c.clear();
                    jz5.l lVar = qa3.o.f361052b;
                    kotlin.jvm.internal.o.d(lVar);
                    java.lang.String str2 = (java.lang.String) lVar.f302833d;
                    jz5.l lVar2 = qa3.o.f361052b;
                    kotlin.jvm.internal.o.d(lVar2);
                    int intValue = ((java.lang.Number) lVar2.f302834e).intValue();
                    com.tencent.mars.xlog.Log.w("LiteAppTestService", "close last socket: " + str2 + '(' + intValue + "), new url:" + stringExtra);
                    com.tencent.websocket.WcWss.closeSocket(str2, intValue, 0, "force init");
                    qa3.o.f361052b = null;
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
                com.tencent.mm.plugin.lite.LiteAppCenter.setDebugCallback(oVar);
                com.tencent.websocket.WcWss.a(new qa3.m(), "liteapp", stringExtra, null, null, null, new com.tencent.websocket.WssConfig(5000, 12000, false, !r26.i0.y(stringExtra, "wss", false), 0, false), null);
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "use new websocket for test");
            if (!f144285b) {
                f144285b = true;
                com.tencent.mars.xlog.Log.i(str, "use new websocket load new cronet");
                java.lang.String libraryName = org.chromium.net.impl.CronetLibraryLoader.libraryName();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(libraryName);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "com/tencent/mm/plugin/lite/test/LiteAppTestBroadcastReceiver", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                wp5.e.a(context2, new qa3.i());
            }
            qa3.o oVar2 = qa3.o.f361051a;
            xp5.f fVar = qa3.o.f361056f;
            if (fVar != null) {
                fVar.f455968b.closeConnect(qa3.o.f361057g, 100, "");
            }
            qa3.o.f361056f = new xp5.f("", "");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).fk(true);
            com.tencent.mm.plugin.lite.LiteAppCenter.setDebugCallback(oVar2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            xp5.f fVar2 = qa3.o.f361056f;
            kotlin.jvm.internal.o.d(fVar2);
            qa3.n nVar = new qa3.n(stringExtra);
            long connectSocket = fVar2.f455968b.connectSocket(stringExtra, hashMap, arrayList2, false, true, valueOf != null ? valueOf.intValue() : 30000L);
            fVar2.f455967a.put(java.lang.Long.valueOf(connectSocket), nVar);
            qa3.o.f361057g = connectSocket;
            com.tencent.mars.xlog.Log.i("LiteAppTestService", "websocket connectId is " + qa3.o.f361057g);
        }
    }
}
