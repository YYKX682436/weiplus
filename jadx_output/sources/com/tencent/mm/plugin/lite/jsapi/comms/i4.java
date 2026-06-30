package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class i4 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.j4 f143609a;

    public i4(com.tencent.mm.plugin.lite.jsapi.comms.j4 j4Var) {
        this.f143609a = j4Var;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenWeClawChatPage", "get contact succ");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.b2(str);
        l4Var.l1("");
        l4Var.o1("");
        l4Var.n1(java.lang.System.currentTimeMillis());
        l4Var.M1(0);
        l4Var.Y1(0);
        l4Var.S1(java.lang.String.valueOf(1));
        Di.G(l4Var);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.chatting.ChattingUI"));
        intent.putExtra("Chat_User", str);
        intent.addFlags(67108864);
        intent.putExtra("chat_from_scene", 17);
        com.tencent.mm.plugin.lite.jsapi.comms.j4 j4Var = this.f143609a;
        android.content.Context c17 = j4Var.c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenWeClawChatPage$1", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiOpenWeClawChatPage$1", "getContactCallBack", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        j4Var.f143443f.d(false);
    }
}
