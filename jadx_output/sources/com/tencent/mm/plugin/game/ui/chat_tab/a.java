package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oa.i f141230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f141231e;

    public a(com.tencent.mm.plugin.game.ui.chat_tab.b bVar, oa.i iVar, int i17) {
        this.f141230d = iVar;
        this.f141231e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        oa.i iVar = this.f141230d;
        android.view.View findViewById = iVar.f343783f.findViewById(com.tencent.mm.R.id.nvn);
        android.widget.TextView textView = (android.widget.TextView) iVar.f343783f.findViewById(com.tencent.mm.R.id.nvo);
        if (this.f141231e == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setVisibility(8);
    }
}
