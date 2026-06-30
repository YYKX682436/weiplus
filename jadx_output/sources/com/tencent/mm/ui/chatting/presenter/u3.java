package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f202495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o3 f202497f;

    public u3(com.tencent.mm.ui.chatting.presenter.o3 o3Var, java.util.ArrayList arrayList, int i17, int i18) {
        this.f202497f = o3Var;
        this.f202495d = arrayList;
        this.f202496e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.o3 o3Var = this.f202497f;
        if (o3Var.f202406s.get()) {
            return;
        }
        o3Var.n();
        o3Var.f202546i.clear();
        o3Var.f202546i.addAll(this.f202495d);
        o3Var.getClass();
        o3Var.f202547m = o3Var.f202546i;
        zb5.i iVar = o3Var.f202543f;
        if (iVar != null) {
            iVar.A(false, this.f202496e);
        }
    }
}
