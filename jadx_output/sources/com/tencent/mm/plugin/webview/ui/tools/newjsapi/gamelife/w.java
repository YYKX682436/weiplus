package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class w implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f186201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f186203c;

    public w(java.util.LinkedList linkedList, com.tencent.mm.ipcinvoker.r rVar, java.util.LinkedList linkedList2) {
        this.f186201a = linkedList;
        this.f186202b = rVar;
        this.f186203c = linkedList2;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.util.LinkedList linkedList;
        java.util.Iterator it = this.f186201a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList = this.f186203c;
            if (!hasNext) {
                break;
            }
            u53.u uVar = (u53.u) map.get((java.lang.String) it.next());
            if (uVar != null) {
                y53.m mVar = (y53.m) uVar;
                linkedList.add(kz5.c1.k(new jz5.l(dm.i4.COL_USERNAME, mVar.t0()), new jz5.l("nickname", mVar.field_nickname), new jz5.l("avatarUrl", mVar.field_avatarURL)));
            }
        }
        com.tencent.mm.ipcinvoker.r rVar = this.f186202b;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetGamelifeContactData(linkedList, "get contact ok", true));
        }
    }
}
