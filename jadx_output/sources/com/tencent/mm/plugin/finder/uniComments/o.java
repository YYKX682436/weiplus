package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jv2.d dVar) {
        super(1);
        this.f130321d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj;
        return java.lang.Boolean.valueOf(finderCommentInfo.getCommentId() != 0 && finderCommentInfo.getCommentId() == this.f130321d.f302207d.A0());
    }
}
