package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f141319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f141320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.w f141321f;

    public v(com.tencent.mm.plugin.game.ui.chat_tab.w wVar, int i17, java.util.List list) {
        this.f141321f = wVar;
        this.f141319d = i17;
        this.f141320e = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.chat_tab.w wVar = this.f141321f;
        int i17 = this.f141319d;
        if (i17 > 0) {
            android.view.View findViewById = wVar.f141324a.getRootView().findViewById(com.tencent.mm.R.id.glj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = wVar.f141324a.getRootView().findViewById(com.tencent.mm.R.id.glj);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/game/ui/chat_tab/GameHotMsgView$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.List list = this.f141320e;
        if (list.size() <= 15) {
            com.tencent.mm.plugin.game.ui.chat_tab.z zVar = wVar.f141324a.f141126i2;
            zVar.f141342d = i17;
            java.util.LinkedList linkedList = (java.util.LinkedList) zVar.f141343e;
            linkedList.clear();
            if (!com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                linkedList.addAll(list);
            }
            zVar.notifyDataSetChanged();
            return;
        }
        com.tencent.mm.plugin.game.ui.chat_tab.z zVar2 = wVar.f141324a.f141126i2;
        java.util.List subList = list.subList(0, 15);
        zVar2.f141342d = i17;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) zVar2.f141343e;
        linkedList2.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(subList)) {
            linkedList2.addAll(subList);
        }
        zVar2.notifyDataSetChanged();
    }
}
