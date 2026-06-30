package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.a4 f124947d = new com.tencent.mm.plugin.finder.report.a4();

    public a4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.tc1 tc1Var = (r45.tc1) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpInfo=");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tc1Var.getCustom(0);
        sb6.append(finderJumpInfo != null ? hc2.g0.d(finderJumpInfo) : null);
        sb6.append(",state=");
        sb6.append(tc1Var.getInteger(1));
        return sb6.toString();
    }
}
