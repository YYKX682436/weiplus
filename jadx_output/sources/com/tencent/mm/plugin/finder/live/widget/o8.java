package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class o8 implements qi2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.r8 f119273d;

    public o8(com.tencent.mm.plugin.finder.live.widget.r8 r8Var) {
        this.f119273d = r8Var;
    }

    @Override // qi2.r1
    public km2.k s3() {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f119273d;
        dk2.u4 u4Var = ((mm2.o4) r8Var.f119592c.P0(mm2.o4.class)).Z;
        if (u4Var == null) {
            return null;
        }
        km2.q l76 = ((mm2.o4) r8Var.f119592c.P0(mm2.o4.class)).l7();
        return u4Var.c(l76 != null ? l76.f309172c : null);
    }

    @Override // qi2.r1
    public km2.k t5() {
        com.tencent.mm.plugin.finder.live.widget.r8 r8Var = this.f119273d;
        dk2.u4 u4Var = ((mm2.o4) r8Var.f119592c.P0(mm2.o4.class)).Z;
        if (u4Var != null) {
            return u4Var.e(((mm2.c1) r8Var.f119592c.P0(mm2.c1.class)).f328852o);
        }
        return null;
    }

    @Override // qi2.r1
    public dk2.u4 y3() {
        return ((mm2.o4) this.f119273d.f119592c.P0(mm2.o4.class)).Z;
    }
}
