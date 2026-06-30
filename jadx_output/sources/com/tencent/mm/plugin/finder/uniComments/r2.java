package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(jv2.i iVar) {
        super(1);
        this.f130396d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj;
        return java.lang.Boolean.valueOf(finderCommentInfo.getCommentId() != 0 && finderCommentInfo.getCommentId() == this.f130396d.f302223d.J0());
    }
}
