package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class i0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186187e;

    public i0(nw4.k kVar, nw4.y2 y2Var) {
        this.f186186d = kVar;
        this.f186187e = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData getGamelifeContactData = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData) obj;
        boolean z17 = getGamelifeContactData.f186148f;
        nw4.y2 y2Var = this.f186187e;
        nw4.k kVar = this.f186186d;
        java.lang.String str = getGamelifeContactData.f186147e;
        if (!z17) {
            kVar.f340863d.e(y2Var.f341013c, "gamelifeManager fail" + str, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = getGamelifeContactData.f186146d;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                linkedList.add(nw4.x2.b((java.util.Map) it.next()));
            }
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("contacts", linkedList));
        kVar.f340863d.e(y2Var.f341013c, "gamelifeManager success" + str, e17);
    }
}
