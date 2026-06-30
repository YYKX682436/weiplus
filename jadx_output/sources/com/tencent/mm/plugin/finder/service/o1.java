package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.c6 f126160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(zy2.c6 c6Var) {
        super(1);
        this.f126160d = c6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getFinderMsgStrangerContact] completed! result=");
        ya2.b2 b2Var = (ya2.b2) it;
        sb6.append(b2Var.D0());
        sb6.append('=');
        sb6.append(b2Var.w0());
        com.tencent.mars.xlog.Log.i("Finder.ContactService", sb6.toString());
        zy2.c6 c6Var = this.f126160d;
        if (c6Var != null) {
            c6Var.a(it);
        }
        return jz5.f0.f302826a;
    }
}
