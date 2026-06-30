package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.t f202446d;

    public s(com.tencent.mm.ui.chatting.presenter.t tVar) {
        this.f202446d = tVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.ui.chatting.presenter.t tVar = this.f202446d;
        objArr[0] = java.lang.Boolean.valueOf(tVar.f202471f.f202547m == null);
        objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(tVar.f202469d));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "[onTimerExpired]  mDataListCache is null?:%s mSearchText is null?:%s", objArr);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f202469d)) {
            com.tencent.mm.ui.chatting.presenter.y yVar = tVar.f202471f;
            yVar.f202544g.f198433e = tVar.f202469d;
            java.util.ArrayList arrayList = yVar.f202547m;
            if (arrayList == null) {
                yVar.a(true);
            } else {
                yVar.f202546i = arrayList;
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.q(this));
            }
            return false;
        }
        com.tencent.mm.ui.chatting.presenter.y yVar2 = tVar.f202471f;
        yVar2.f202546i = yVar2.f202547m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = tVar.f202471f.f202546i;
        if (arrayList3 != null) {
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.chatting.adapter.f0 f0Var = (com.tencent.mm.ui.chatting.adapter.f0) it.next();
                if (f0Var.d(tVar.f202469d)) {
                    arrayList2.add(f0Var);
                }
            }
        }
        com.tencent.mm.ui.chatting.presenter.y yVar3 = tVar.f202471f;
        yVar3.f202546i = arrayList2;
        yVar3.f202544g.f198433e = tVar.f202469d;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.presenter.r(this));
        return false;
    }
}
