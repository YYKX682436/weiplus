package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f129154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j17) {
        super(1);
        this.f129154d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.vx0 vx0Var;
        r45.p21 it = (r45.p21) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r45.cc1 cc1Var = (r45.cc1) it.getCustom(10);
        boolean z17 = false;
        if (cc1Var != null && (vx0Var = (r45.vx0) cc1Var.getCustom(2)) != null && vx0Var.getLong(0) == this.f129154d) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
