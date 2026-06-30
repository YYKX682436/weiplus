package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.s f202436d;

    public r(com.tencent.mm.ui.chatting.presenter.s sVar) {
        this.f202436d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.s sVar = this.f202436d;
        com.tencent.mm.ui.chatting.presenter.y yVar = sVar.f202446d.f202471f;
        if (yVar.f202543f != null) {
            yVar.f202544g.notifyDataSetChanged();
            com.tencent.mm.ui.chatting.presenter.t tVar = sVar.f202446d;
            com.tencent.mm.ui.chatting.presenter.y yVar2 = tVar.f202471f;
            zb5.i iVar = yVar2.f202543f;
            java.lang.String str = tVar.f202469d;
            boolean isEmpty = yVar2.f202546i.isEmpty();
            java.util.ArrayList arrayList = sVar.f202446d.f202471f.f202546i;
            iVar.j0(str, isEmpty, arrayList != null ? arrayList.size() : 0);
        }
    }
}
