package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.s f202425d;

    public q(com.tencent.mm.ui.chatting.presenter.s sVar) {
        this.f202425d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.s sVar = this.f202425d;
        com.tencent.mm.ui.chatting.presenter.t tVar = sVar.f202446d;
        com.tencent.mm.ui.chatting.presenter.y yVar = tVar.f202471f;
        zb5.i iVar = yVar.f202543f;
        if (iVar != null) {
            java.lang.String str = tVar.f202469d;
            java.util.ArrayList arrayList = yVar.f202546i;
            iVar.j0(str, false, arrayList != null ? arrayList.size() : 0);
            sVar.f202446d.f202471f.f202544g.notifyDataSetChanged();
        }
    }
}
