package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.n0 f115636d = new com.tencent.mm.plugin.finder.live.util.n0();

    public n0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.wn5 wn5Var = (r45.wn5) obj;
        kotlin.jvm.internal.o.d(wn5Var);
        return java.lang.String.valueOf("[index=" + wn5Var.getInteger(0) + " objectId=" + wn5Var.getLong(1) + " loadingCostMs=" + wn5Var.getInteger(3) + " firstFrameCost=" + wn5Var.getInteger(4) + " dwellMs=" + wn5Var.getInteger(5) + " playMs=" + wn5Var.getInteger(6) + ']');
    }
}
