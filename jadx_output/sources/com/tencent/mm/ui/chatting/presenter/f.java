package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n f202207f;

    public f(com.tencent.mm.ui.chatting.presenter.n nVar, java.util.ArrayList arrayList, int i17, int i18) {
        this.f202207f = nVar;
        this.f202205d = arrayList;
        this.f202206e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.n nVar = this.f202207f;
        if (nVar.f202352s.get()) {
            return;
        }
        nVar.n();
        nVar.f202546i.clear();
        nVar.f202546i.addAll(this.f202205d);
        nVar.getClass();
        nVar.f202547m = nVar.f202546i;
        zb5.i iVar = nVar.f202543f;
        if (iVar != null) {
            iVar.A(false, this.f202206e);
        }
    }
}
