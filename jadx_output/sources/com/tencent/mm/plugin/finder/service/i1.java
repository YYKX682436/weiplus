package com.tencent.mm.plugin.finder.service;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.d6 f126074d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(zy2.d6 d6Var) {
        super(1);
        this.f126074d = d6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        zy2.dc it = (zy2.dc) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f126074d.onDone(kz5.b0.c(it));
        return jz5.f0.f302826a;
    }
}
