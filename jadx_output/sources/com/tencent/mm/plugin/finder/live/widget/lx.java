package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class lx extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f118983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(com.tencent.mm.plugin.finder.live.widget.rx rxVar) {
        super(1);
        this.f118983d = rxVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f118983d;
        java.util.LinkedList linkedList = rxVar.S;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (linkedList != null) {
            rxVar.g0(linkedList, false);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(rxVar, false, 1, null);
        }
        return f0Var2;
    }
}
