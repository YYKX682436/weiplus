package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes4.dex */
public final class t implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f186198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186199b;

    public t(java.util.List list, com.tencent.mm.ipcinvoker.r rVar) {
        this.f186198a = list;
        this.f186199b = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList session_info_list = ((v53.g) ((com.tencent.mm.modelbase.f) obj).f70618d).f433337d;
        kotlin.jvm.internal.o.f(session_info_list, "session_info_list");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = session_info_list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((v53.o) next).f433357m == 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((v53.o) it6.next()).f433351d);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : this.f186198a) {
            if (arrayList2.contains(((com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GamelifeConversationData) obj2).f186136d)) {
                arrayList3.add(obj2);
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData getGamelifeConversationData = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeConversationData(arrayList3, "get conversationList", true);
        com.tencent.mm.ipcinvoker.r rVar = this.f186199b;
        if (rVar == null) {
            return null;
        }
        rVar.a(getGamelifeConversationData);
        return jz5.f0.f302826a;
    }
}
