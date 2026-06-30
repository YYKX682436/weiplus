package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y4 f202460f;

    public s4(com.tencent.mm.ui.chatting.presenter.y4 y4Var, java.util.ArrayList arrayList, int i17) {
        this.f202460f = y4Var;
        this.f202458d = arrayList;
        this.f202459e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.y4 y4Var = this.f202460f;
        if (y4Var.f202565s.get()) {
            return;
        }
        y4Var.n();
        y4Var.f202546i.clear();
        y4Var.f202546i.addAll(this.f202458d);
        y4Var.f202547m = y4Var.f202546i;
        zb5.i iVar = y4Var.f202543f;
        if (iVar != null) {
            iVar.A(false, this.f202459e);
        }
    }
}
