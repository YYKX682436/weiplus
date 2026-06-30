package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f174025e;

    public k1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var, yz5.a aVar) {
        this.f174024d = w1Var;
        this.f174025e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ij4.i iVar = this.f174024d.f174395q;
        if (iVar != null) {
            iVar.n();
        }
        yz5.a aVar = this.f174025e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
