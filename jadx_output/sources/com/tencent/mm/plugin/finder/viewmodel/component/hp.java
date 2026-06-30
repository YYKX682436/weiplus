package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.hp f134644d = new com.tencent.mm.plugin.finder.viewmodel.component.hp();

    public hp() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo it = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return pm0.v.u(it.getCommentId());
    }
}
