package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class g2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f126056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f126057c;

    public g2(com.tencent.mm.plugin.finder.service.l2 l2Var, int i17, int i18) {
        this.f126055a = l2Var;
        this.f126056b = i17;
        this.f126057c = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderFeedDetailService", "preloadFeed cgiGetFeedCommentDetailWithFeedId errCode:" + fVar.f70616b + ", errType:" + fVar.f70615a);
        r45.h51 h51Var = (r45.h51) fVar.f70618d;
        if (h51Var != null && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) != null) {
            this.f126055a.Bi(finderObject, this.f126056b, this.f126057c);
        }
        return jz5.f0.f302826a;
    }
}
