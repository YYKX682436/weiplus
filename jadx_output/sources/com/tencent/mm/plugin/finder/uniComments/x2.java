package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class x2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130450a;

    public x2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var) {
        this.f130450a = q3Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicUni.DrawerPresenter", "loadMoreData resp null");
            return new java.util.ArrayList();
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new java.util.ArrayList();
        }
        this.f130450a.A(((r45.z03) fVar).f391568g == 1);
        this.f130450a.f130375o = ((r45.z03) fVar2.f70618d).f391569h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f130450a.f130375o == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f130450a.f130375o;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130450a;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> comment_info = ((r45.z03) fVar2.f70618d).f391565d;
        kotlin.jvm.internal.o.f(comment_info, "comment_info");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(comment_info, 10));
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : comment_info) {
            hv2.c cVar = hv2.c.f285287a;
            kotlin.jvm.internal.o.d(finderCommentInfo);
            if (q3Var.f130371h == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            arrayList2.add(cVar.a(finderCommentInfo, r6.f295130f));
        }
        arrayList.addAll(arrayList2);
        return com.tencent.mm.plugin.finder.uniComments.q3.f(this.f130450a, arrayList);
    }
}
