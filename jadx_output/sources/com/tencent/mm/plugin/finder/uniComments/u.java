package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130418a;

    public u(com.tencent.mm.plugin.finder.uniComments.o0 o0Var) {
        this.f130418a = o0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "loadMoreData resp null");
            return new java.util.ArrayList();
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "loadMoreData: it.errType:" + fVar2.f70615a + "t.errCode :" + fVar2.f70616b + ' ');
            return new java.util.ArrayList();
        }
        this.f130418a.l(((r45.z03) fVar).f391568g == 1);
        this.f130418a.f130333r = ((r45.z03) fVar2.f70618d).f391569h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f130418a.f130333r == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f130418a.f130333r;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130418a;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> comment_info = ((r45.z03) fVar2.f70618d).f391565d;
        kotlin.jvm.internal.o.f(comment_info, "comment_info");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(comment_info, 10));
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : comment_info) {
            hv2.b bVar = hv2.b.f285286a;
            kotlin.jvm.internal.o.d(finderCommentInfo);
            if (o0Var.f130328m == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            arrayList2.add(bVar.a(finderCommentInfo, r6.f295123f));
        }
        arrayList.addAll(arrayList2);
        return com.tencent.mm.plugin.finder.uniComments.o0.a(this.f130418a, arrayList);
    }
}
